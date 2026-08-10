--
-- ""
-- Prepared SQL queries for 'VersionPackageInfo_javaVersion' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'version_package_info_java_version'
--
SELECT component, major_version FROM version_package_info_java_version WHERE 1=1;

--
-- INSERT template for table 'version_package_info_java_version'
--
INSERT INTO version_package_info_java_version (component, major_version) VALUES (?, ?);

--
-- UPDATE template for table 'version_package_info_java_version'
--
UPDATE version_package_info_java_version SET component = ?, major_version = ? WHERE 1=2;

--
-- DELETE template for table 'version_package_info_java_version'
--
DELETE FROM version_package_info_java_version WHERE 1=2;

