To reproduce bug, run:
1) got to Main.kt and setup inspection id -> search for phrase: '#1 change to your inspection id'
2) go to build.gradle and setup accountId -> search for phrase: '#2 setup your accountId'
3) go to build.gradle and setup authToken -> search for phrase: '#3 setup your token'
4) run from command line ./gradlew run

--
If you see UNAUTHENTICATED, this is because I set fake authToken, you have to set your own.

--
For my account I see this in console:

/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=63784:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/lib/tools.jar:/Users/homedir/Documents/mynd/hc-staging-test-api/out/production/classes:/Users/homedir/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk8/1.2.31/50094b02ec8a4c2e4444073c722bb56c8a52b83c/kotlin-stdlib-jdk8-1.2.31.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-all/1.12.0/1eb92e904639fbf3db30475ce65a8ee3d5256b9d/grpc-all-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-netty-shaded/1.12.0/fe3cbfd3fe70ec3c68ddd628964b7051cd724145/grpc-netty-shaded-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.google.api.grpc/googleapis-common-protos/0.0.3/337dc97b85a5766d2fd8742439134a8b5151c19a/googleapis-common-protos-0.0.3.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-protobuf/1.12.0/fbee015b681b5342e72fe40f88eae9dd6cbce206/grpc-protobuf-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.google.api.grpc/proto-google-common-protos/1.0.0/86f070507e28b930e50d218ee5b6788ef0dd05e6/proto-google-common-protos-1.0.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.reactivex/rxjava/1.2.3/7fe1a94c1aeb958acc876fe616922cc191f3222c/rxjava-1.2.3.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk7/1.2.31/95d6a67e8787280a82a2059e54e4db7ac6cfe74/kotlin-stdlib-jdk7-1.2.31.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.2.31/153dcd9ed9db246a7e36f4d7609e2a9f4718c674/kotlin-stdlib-1.2.31.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-auth/1.12.0/800b55073d3ee3d97550c85026ab9281f4509114/grpc-auth-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-netty/1.12.0/a4dfc839dae9206c0d1f8b53657c2a8e4a81ad41/grpc-netty-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-okhttp/1.12.0/3fdb2c85587702865b464b2f6faabf7e2e294a3d/grpc-okhttp-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-protobuf-nano/1.12.0/f6d21fc1cd28347447b610f9b057c17473eb87b8/grpc-protobuf-nano-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-testing/1.12.0/ab651c21ad8be2c02d8bb0bf75ff8384c912d630/grpc-testing-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-stub/1.12.0/fbd2bafe09a89442ab3d7a8d8b3e8bafbd59b4e0/grpc-stub-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-protobuf-lite/1.12.0/f5bebfbd5e93b8bbb58888a5cfaa9f490fb7b455/grpc-protobuf-lite-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-core/1.12.0/541a5c68ce85c03190e29bc9e0ec611d2b75ff24/grpc-core-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.grpc/grpc-context/1.12.0/5b63a170b786051a42cce08118d5ea3c8f60f749/grpc-context-1.12.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.google.protobuf/protobuf-java-util/3.5.1/6e40a6a3f52455bd633aa2a0dba1a416e62b4575/protobuf-java-util-3.5.1.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.google.protobuf/protobuf-java/3.5.1/8c3492f7662fa1cbf8ca76a0f5eb1146f7725acd/protobuf-java-3.5.1.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.google.auth/google-auth-library-credentials/0.9.0/8e2b181feff6005c9cbc6f5c1c1e2d3ec9138d46/google-auth-library-credentials-0.9.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.7/751f548c85fa49f330cecbb1875893f971b33c4e/gson-2.7.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.google.guava/guava/20.0/89507701249388e1ed5ddcf8c41f4ce1be7831ef/guava-20.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.google.errorprone/error_prone_annotations/2.1.2/6dcc08f90f678ac33e5ef78c3c752b6f59e63e0c/error_prone_annotations-2.1.2.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.google.code.findbugs/jsr305/3.0.0/5871fb60dc68d67da54a663c3fd636a10a532948/jsr305-3.0.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.opencensus/opencensus-contrib-grpc-metrics/0.11.0/d57b877f1a28a613452d45e35c7faae5af585258/opencensus-contrib-grpc-metrics-0.11.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.opencensus/opencensus-api/0.11.0/c1ff1f0d737a689d900a3e2113ddc29847188c64/opencensus-api-0.11.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.netty/netty-codec-http2/4.1.22.Final/6d01daf652551a3219cc07122b765d4c4924dcf8/netty-codec-http2-4.1.22.Final.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.netty/netty-handler-proxy/4.1.22.Final/8eabe24f0b8e95d0873964666ad070179ca81e72/netty-handler-proxy-4.1.22.Final.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.squareup.okhttp/okhttp/2.5.0/4de2b4ed3445c37ec1720a7d214712e845a24636/okhttp-2.5.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.squareup.okio/okio/1.13.0/a9283170b7305c8d92d25aff02a6ab7e45d06cbe/okio-1.13.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/com.google.protobuf.nano/protobuf-javanano/3.0.0-alpha-5/357e60f95cebb87c72151e49ba1f570d899734f8/protobuf-javanano-3.0.0-alpha-5.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/junit/junit/4.12/2973d150c0dc1fefe998f834810d68f278ea58ec/junit-4.12.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/org.mockito/mockito-core/1.9.5/c3264abeea62c4d2f367e21484fbb40c7e256393/mockito-core-1.9.5.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.netty/netty-codec-http/4.1.22.Final/3805f3ca0d57630200defc7f9bb6ed3382dcb10b/netty-codec-http-4.1.22.Final.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.netty/netty-handler/4.1.22.Final/a3a16b17d5a5ed6f784b0daba95e28d940356109/netty-handler-4.1.22.Final.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.netty/netty-codec-socks/4.1.22.Final/d077b39da2dedc5dc5db50a44e5f4c30353e86f3/netty-codec-socks-4.1.22.Final.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.netty/netty-codec/4.1.22.Final/239c0af275952e70bb4adf7cf8c03d88ddc394c9/netty-codec-4.1.22.Final.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.netty/netty-transport/4.1.22.Final/3bd455cd9e5e5fb2e08fd9cd0acfa54c079ca989/netty-transport-4.1.22.Final.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/org.hamcrest/hamcrest-core/1.3/42a25dc3219429f0e5d060061f71acb49bf010a0/hamcrest-core-1.3.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/org.objenesis/objenesis/1.0/9b473564e792c2bdf1449da1f0b1b5bff9805704/objenesis-1.0.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.netty/netty-buffer/4.1.22.Final/15e964a2095031364f534a6e21977f5ee9ca32a9/netty-buffer-4.1.22.Final.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.netty/netty-resolver/4.1.22.Final/b5484d17a97cb57b07d2a1ac092c249e47234c17/netty-resolver-4.1.22.Final.jar:/Users/homedir/.gradle/caches/modules-2/files-2.1/io.netty/netty-common/4.1.22.Final/56ff4deca53fc791ed59ac2b72eb6718714a4de9/netty-common-4.1.22.Final.jar test.hpcgrpc.MainKt Mynd aWdvckBteW5kLmNvbTo5ODc2bXluZA==
id {
  id: "5wuR1Lb-A-8s"
}
folder_id {
  id: "9242"
  external_id: "q0uqmthhcqp17r8k"
}
asset_id {
  id: "gk5wjz-g-0-6810"
  external_id: "jgquisj4j7b6lqkp"
}
template_id {
  id: "pjnakz-b-0-6829"
}
template_outline: "default"
completed {
  started_at {
    year: 2018
    month: 12
    day: 10
    hour24: 19
    minute: 46
    second: 39
  }
  ended_at {
    year: 2018
    month: 12
    day: 10
    hour24: 19
    minute: 46
    second: 51
  }
  rating_groups {
    key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    value {
      ratings {
        key: "Good"
        checkbox {
          value: "Good"
          color: "#6ED81B"
          image: STAR_FULL
        }
      }
      ratings {
        key: "Fair"
        checkbox {
          value: "Fair"
          color: "#3BDDB6"
          image: TICK_ROUND
        }
      }
      ratings {
        key: "Clean"
        checkbox {
          value: "Clean"
          color: "#3CC8FB"
        }
      }
      ratings {
        key: "Marked"
        checkbox {
          value: "Marked"
          color: "#F8DC16"
          image: SCRATCHES
        }
      }
      ratings {
        key: "Dirty"
        checkbox {
          value: "Dirty"
          color: "#F9A820"
          image: SPLAT
        }
      }
      ratings {
        key: "Damaged"
        checkbox {
          value: "Damaged"
          color: "#F31313"
          image: BROKEN
        }
      }
    }
  }
  rating_groups {
    key: "IfzKByqP"
    value {
      label: " (1)"
      ratings {
        key: "Completed"
        radio_group {
          options {
            value: "Yes"
            color: "#A7E865"
            image: TICK
          }
          options {
            value: "No"
            color: "#DB485A"
          }
        }
      }
    }
  }
  rating_groups {
    key: "psOhdheh"
    value {
      label: " (2)"
      ratings {
        key: "Passed"
        radio_group {
          options {
            value: "Yes"
            color: "#A7E865"
            image: TICK
          }
          options {
            value: "No"
            color: "#DB485A"
          }
        }
      }
    }
  }
  sections {
    name: "Entry"
    items {
      name: "Walls"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Ceiling"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Doors"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Windows"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Flooring"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Doorbell"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
  }
  sections {
    name: "Dining Room"
    items {
      name: "Walls"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Ceiling"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Doors"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Windows"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Flooring"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Lights"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
  }
  sections {
    name: "Kitchen"
    items {
      name: "Walls"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Ceiling"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Doors"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Windows"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Flooring"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Lights"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Stove/Oven"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Refrigerator"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
  }
  sections {
    name: "Bedroom"
    items {
      name: "Walls"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Ceiling"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Doors"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Windows"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Flooring"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Lights"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
  }
  sections {
    name: "Bathroom"
    items {
      name: "Walls"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Ceiling"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Doors"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Windows"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Flooring"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Lights"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Bath/Shower"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Toilet"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Exhaust Fan"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
  }
  sections {
    name: "Bedroom"
    items {
      name: "Walls"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Ceiling"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Doors"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Windows"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Flooring"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Lights"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
  }
  sections {
    name: "Bathroom"
    items {
      name: "Walls"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Ceiling"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Doors"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Windows"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Flooring"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Lights"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Bath/Shower"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Toilet"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Exhaust Fan"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
  }
  sections {
    name: "Living Room"
    items {
      name: "Walls"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Ceiling"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Doors"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Windows"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Flooring"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Lights"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
  }
  sections {
    name: "Laundry"
    items {
      name: "Walls"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Ceiling"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Doors"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Windows"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Flooring"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Lights"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Exhaust Fan"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Washing Machine"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
    items {
      name: "Dryer"
      rating_group_key: "25C99AEF-B8B5-4C66-8383-09D957B3C650"
    }
  }
  sections {
    name: "Results"
    items {
      name: "Inspection Completed?"
      rating_group_key: "IfzKByqP"
      values {
        key: "Completed"
        value {
          scalar: "No"
        }
      }
    }
    items {
      name: "Inspection Passed?"
      rating_group_key: "psOhdheh"
      values {
        key: "Passed"
        value {
          scalar: "Yes"
        }
      }
    }
  }
  footer_fields {
    label: "General Comments"
    type: "text"
  }
}
update_time {
  year: 2018
  month: 12
  day: 10
  hour24: 19
  minute: 46
  second: 53
}

Exception in thread "main" io.grpc.StatusRuntimeException: INVALID_ARGUMENT: Conversion error: json: cannot unmarshal object into Go struct field RatingValues.RatingValues of type v1.isRatingValues_RatingValues
	at io.grpc.stub.ClientCalls.toStatusRuntimeException(ClientCalls.java:221)
	at io.grpc.stub.ClientCalls.getUnchecked(ClientCalls.java:202)
	at io.grpc.stub.ClientCalls.blockingUnaryCall(ClientCalls.java:131)
	at happyco.inspect.inspection.v1.InspectionServiceGrpc$InspectionServiceBlockingStub.updateInspections(InspectionServiceGrpc.java:624)
	at test.hpcgrpc.MainKt.main(Main.kt:47)

Process finished with exit code 1
