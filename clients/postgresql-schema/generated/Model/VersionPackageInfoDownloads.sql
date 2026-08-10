--
-- ""
-- Prepared SQL queries for 'VersionPackageInfo_downloads' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'version_package_info_downloads'
--
SELECT client, client_mappings, "server", server_mappings FROM version_package_info_downloads WHERE 1=1;

--
-- INSERT template for table 'version_package_info_downloads'
--
INSERT INTO version_package_info_downloads (client, client_mappings, "server", server_mappings) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'version_package_info_downloads'
--
UPDATE version_package_info_downloads SET client = ?, client_mappings = ?, "server" = ?, server_mappings = ? WHERE 1=2;

--
-- DELETE template for table 'version_package_info_downloads'
--
DELETE FROM version_package_info_downloads WHERE 1=2;

