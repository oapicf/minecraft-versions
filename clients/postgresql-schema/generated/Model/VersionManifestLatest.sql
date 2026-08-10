--
-- ""
-- Prepared SQL queries for 'VersionManifest_latest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'version_manifest_latest'
--
SELECT "release", "snapshot" FROM version_manifest_latest WHERE 1=1;

--
-- INSERT template for table 'version_manifest_latest'
--
INSERT INTO version_manifest_latest ("release", "snapshot") VALUES (?, ?);

--
-- UPDATE template for table 'version_manifest_latest'
--
UPDATE version_manifest_latest SET "release" = ?, "snapshot" = ? WHERE 1=2;

--
-- DELETE template for table 'version_manifest_latest'
--
DELETE FROM version_manifest_latest WHERE 1=2;

