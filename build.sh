#!/usr/bin/env bash

cd build/libs

mkdir -p META-INF/native-image

#java -agentlib:native-image-agent=config-merge-dir=META-INF/native-image -jar graalvm-native-0.1-all.jar
java -agentlib:native-image-agent=config-output-dir=META-INF/native-image -jar graalvm-native-0.1-all.jar

/usr/lib/jvm/java-11-graalvm/bin/native-image -H:+AllowIncompleteClasspath -H:+ReportExceptionStackTraces -cp . -jar graalvm-native-0.1-all.jar --verbose
#/usr/lib/jvm/java-11-graalvm/bin/native-image -H:+AllowIncompleteClasspath -H:+ReportExceptionStackTraces -cp .:graalvm-native-0.1-all.jar org.example.Main --verbose
