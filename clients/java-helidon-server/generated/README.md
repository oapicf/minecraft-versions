# Helidon SE Server with OpenAPI

## Build and run

With JDK11+
```bash
mvn package
java -jar target/openapi-java-server.jar
```

## Exercise the application

```
curl -X GET https://launchermeta.mojang.com/mc/game/version_manifest
curl -X GET https://launchermeta.mojang.com/v1/packages/{packageId}/{versionId}.json

```

## Try health and metrics

```
curl -s -X GET https://launchermeta.mojang.com/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET https://launchermeta.mojang.com/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET https://launchermeta.mojang.com/metrics
{"base":...
. . .
```