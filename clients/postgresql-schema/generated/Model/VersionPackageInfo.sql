--
-- ""
-- Prepared SQL queries for 'VersionPackageInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'version_package_info'
--
SELECT "version", asset_index, assets, compliance_level, downloads, "id", java_version, main_class, minimum_launcher_version, "time", release_time, "type" FROM version_package_info WHERE 1=1;

--
-- INSERT template for table 'version_package_info'
--
INSERT INTO version_package_info ("version", asset_index, assets, compliance_level, downloads, "id", java_version, main_class, minimum_launcher_version, "time", release_time, "type") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'version_package_info'
--
UPDATE version_package_info SET "version" = ?, asset_index = ?, assets = ?, compliance_level = ?, downloads = ?, "id" = ?, java_version = ?, main_class = ?, minimum_launcher_version = ?, "time" = ?, release_time = ?, "type" = ? WHERE 1=2;

--
-- DELETE template for table 'version_package_info'
--
DELETE FROM version_package_info WHERE 1=2;

