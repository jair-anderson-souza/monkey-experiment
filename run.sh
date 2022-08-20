#!/bin/bash

cd ./address-api
docker-compose up -d
./gradlew clean bootRun -d
cd ..
cd ./monkey-api
docker-compose up -d
./gradlew clean bootRun -d