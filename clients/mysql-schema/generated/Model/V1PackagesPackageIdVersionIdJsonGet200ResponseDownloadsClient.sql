--
-- .
-- Prepared SQL queries for '_v1_packages__packageId___versionId__json_get_200_response_downloads_client' definition.
--


--
-- SELECT template for table `_v1_packages__packageId___versionId__json_get_200_response_downl`
--
SELECT `sha1`, `size`, `url` FROM `_v1_packages__packageId___versionId__json_get_200_response_downl` WHERE 1;

--
-- INSERT template for table `_v1_packages__packageId___versionId__json_get_200_response_downl`
--
INSERT INTO `_v1_packages__packageId___versionId__json_get_200_response_downl`(`sha1`, `size`, `url`) VALUES (?, ?, ?);

--
-- UPDATE template for table `_v1_packages__packageId___versionId__json_get_200_response_downl`
--
UPDATE `_v1_packages__packageId___versionId__json_get_200_response_downl` SET `sha1` = ?, `size` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `_v1_packages__packageId___versionId__json_get_200_response_downl`
--
DELETE FROM `_v1_packages__packageId___versionId__json_get_200_response_downl` WHERE 0;

