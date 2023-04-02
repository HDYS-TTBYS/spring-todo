#!/bin/sh

sh gradlew build

java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8888,suspend=n -jar ./build/libs/demo-0.0.1-SNAPSHOT.jar
