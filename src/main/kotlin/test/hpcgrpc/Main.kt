package test.hpcgrpc

import happyco.inspect.inspection.v1.InspectionOuterClass
import happyco.inspect.inspection.v1.InspectionOuterClass.Inspection
import happyco.inspect.type.v1.InspectType
import happyco.type.v1.DateOuterClass
import happyco.type.v1.IntegrationId
import io.grpc.*
import java.time.LocalDateTime
import java.util.concurrent.Executor


fun main(args: Array<String>) {

    if (args.size < 2) {
        println("Plz specify 2 arguments: account id ant token")
        return
    }

    val accountId = args[0]
    val token = args[1]

    val channel = ManagedChannelBuilder.forTarget("staging-grpc.happyco.com").build()
    val api = HappyCoApi(channel, TokenCredentials(token))

/*
    val folders = FolderOuterClass.ListFoldersRequest.newBuilder()
            .setAccountId(integrationId(accountId))
            .build()
            .run(api.folders::listFolders)

    println(folders.toJson())
*/

    val inspection = InspectionOuterClass.ListInspectionsRequest.newBuilder()
            .setAccountId(integrationId(accountId))
            .addInspectionIds(internalId("5wuR1Lb-A-8s"))
            .build()
            .run(api.inspections::listInspections)
            .inspectionsList
            .filter {
                it.statusCase == Inspection.StatusCase.COMPLETED
            }
            .filter {
                val item = it.completed.findItem("Inspection Complete")
                item != null && item.firstSelected().equals("No", ignoreCase = true) // not marked as completed
//                item != null && item.firstSelected().equals("Yes", ignoreCase = true) // not marked as completed
            }
            .first()

    println(inspection)


    InspectionOuterClass.UpdateInspectionsRequest.newBuilder()
            .setAccountId(integrationId(accountId))
//            .addInspections(inspection.markCompleted())
            .addInspections(inspection)
            .build()
            .run(api.inspections::updateInspections)


/*    val assets = AssetOuterClass.ListAssetsRequest.newBuilder()
            .setAccountId(integrationId(accountId))
//            .setFolderId(integrationId("7iga7k3fckr1hdaa")) //Bay Area
            .setFolderId(integrationId("q0uqmthhcqp17r8k")) //San Diego
            .setIncludeArchived(true)
            .addAssetIds(integrationId("185d9rgfb99g0dei"))
            .build()
            .run(api.assets::listAssets)

    println(assets.toJson())
*/
}

private fun integrationId(accountId: String): IntegrationId.IntegrationID = IntegrationId.IntegrationID.newBuilder().setExternalId(accountId).build()
private fun internalId(accountId: String): IntegrationId.IntegrationID = IntegrationId.IntegrationID.newBuilder().setId(accountId).build()
class TokenCredentials(private val authToken: String) : CallCredentials {
    override fun applyRequestMetadata(method: MethodDescriptor<*, *>?, attrs: Attributes?, appExecutor: Executor?, applier: CallCredentials.MetadataApplier) {
        val meta = Metadata().apply {
            put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Basic $authToken")
        }

        applier.apply(meta)
    }

    override fun thisUsesUnstableApi() {}
}

fun InspectionOuterClass.InspectionData.findItem(name: String): InspectType.Item? {
    return sectionsList.flatMap {
        it.itemsList
    }.find {
        it.name.contains(name, ignoreCase = true)
    }
}

fun InspectType.Item.firstSelected(): String? {
    val selected = valuesMap.values.firstOrNull()
    return when (selected?.ratingValuesCase) {
        InspectType.RatingValues.RatingValuesCase.SCALAR -> selected.scalar
        InspectType.RatingValues.RatingValuesCase.ARRAY -> selected.array.valuesList.joinToString()
        else -> null
    }
}

fun LocalDateTime.toHappyCoDateTime(): DateOuterClass.DateTime = DateOuterClass.DateTime.newBuilder()
        .setYear(this.year)
        .setMonth(this.monthValue)
        .setDay(this.dayOfMonth)
        .setHour24(this.hour)
        .setMinute(this.minute)
        .setSecond(this.second)
        .build()

private fun Inspection.markCompleted(): Inspection = markInspectionAsCompleted(this).build()
internal fun markInspectionAsCompleted(inspection: Inspection): Inspection.Builder =
        inspection.copy().apply {
            completed = completed.copy().apply {
                clearSections()
                addAllSections(
                        inspection.completed.sectionsList.map { section ->
                            if (section.name == "Results") resultSection(section) else section
                        }
                )
            }.build()
        }

private fun resultSection(section: InspectType.Section): InspectType.Section = InspectType.Section.newBuilder(section).apply {
    clearItems()
    addAllItems(
            section.itemsList.map { item ->
                if (item.name == "Inspection Complete?") completeItem(item) else item
            }
    )
}.build()

private fun completeItem(item: InspectType.Item): InspectType.Item =
        item.copy().clearValues().putValues("Completed", InspectType.RatingValues.newBuilder().setScalar("Yes").build()).build()

private fun Inspection.copy(): Inspection.Builder = Inspection.newBuilder(this)
private fun InspectionOuterClass.InspectionData.copy(): InspectionOuterClass.InspectionData.Builder = InspectionOuterClass.InspectionData.newBuilder(this)
private fun InspectType.Item.copy(): InspectType.Item.Builder = InspectType.Item.newBuilder(this)
