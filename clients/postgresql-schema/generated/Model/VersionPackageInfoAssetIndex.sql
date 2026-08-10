--
-- ""
-- Prepared SQL queries for 'VersionPackageInfo_assetIndex' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'version_package_info_asset_index'
--
SELECT "id", sha1, "size", total_size, url FROM version_package_info_asset_index WHERE 1=1;

--
-- INSERT template for table 'version_package_info_asset_index'
--
INSERT INTO version_package_info_asset_index ("id", sha1, "size", total_size, url) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'version_package_info_asset_index'
--
UPDATE version_package_info_asset_index SET "id" = ?, sha1 = ?, "size" = ?, total_size = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'version_package_info_asset_index'
--
DELETE FROM version_package_info_asset_index WHERE 1=2;

