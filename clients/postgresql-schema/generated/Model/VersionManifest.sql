--
-- ""
-- Prepared SQL queries for 'VersionManifest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'version_manifest'
--
SELECT latest, versions FROM version_manifest WHERE 1=1;

--
-- INSERT template for table 'version_manifest'
--
INSERT INTO version_manifest (latest, versions) VALUES (?, ?);

--
-- UPDATE template for table 'version_manifest'
--
UPDATE version_manifest SET latest = ?, versions = ? WHERE 1=2;

--
-- DELETE template for table 'version_manifest'
--
DELETE FROM version_manifest WHERE 1=2;

