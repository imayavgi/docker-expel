#!/bin/ksh
cd consumer-app
mvn clean package -DskipTests
cd ../producer-app
mvn clean package -DskipTests
