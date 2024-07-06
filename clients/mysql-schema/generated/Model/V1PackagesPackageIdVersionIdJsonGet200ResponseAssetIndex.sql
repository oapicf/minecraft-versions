--
-- .
-- Prepared SQL queries for '_v1_packages__packageId___versionId__json_get_200_response_assetIndex' definition.
--


--
-- SELECT template for table `_v1_packages__packageId___versionId__json_get_200_response_asset`
--
SELECT `id`, `sha1`, `size`, `totalSize`, `url` FROM `_v1_packages__packageId___versionId__json_get_200_response_asset` WHERE 1;

--
-- INSERT template for table `_v1_packages__packageId___versionId__json_get_200_response_asset`
--
INSERT INTO `_v1_packages__packageId___versionId__json_get_200_response_asset`(`id`, `sha1`, `size`, `totalSize`, `url`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `_v1_packages__packageId___versionId__json_get_200_response_asset`
--
UPDATE `_v1_packages__packageId___versionId__json_get_200_response_asset` SET `id` = ?, `sha1` = ?, `size` = ?, `totalSize` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `_v1_packages__packageId___versionId__json_get_200_response_asset`
--
DELETE FROM `_v1_packages__packageId___versionId__json_get_200_response_asset` WHERE 0;

