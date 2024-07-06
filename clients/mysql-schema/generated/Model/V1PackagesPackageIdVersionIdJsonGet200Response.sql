--
-- .
-- Prepared SQL queries for '_v1_packages__packageId___versionId__json_get_200_response' definition.
--


--
-- SELECT template for table `_v1_packages__packageId___versionId__json_get_200_response`
--
SELECT `version`, `assetIndex`, `assets`, `complianceLevel`, `downloads`, `id`, `javaVersion`, `mainClass`, `minimumLauncherVersion`, `time`, `releaseTime`, `type` FROM `_v1_packages__packageId___versionId__json_get_200_response` WHERE 1;

--
-- INSERT template for table `_v1_packages__packageId___versionId__json_get_200_response`
--
INSERT INTO `_v1_packages__packageId___versionId__json_get_200_response`(`version`, `assetIndex`, `assets`, `complianceLevel`, `downloads`, `id`, `javaVersion`, `mainClass`, `minimumLauncherVersion`, `time`, `releaseTime`, `type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `_v1_packages__packageId___versionId__json_get_200_response`
--
UPDATE `_v1_packages__packageId___versionId__json_get_200_response` SET `version` = ?, `assetIndex` = ?, `assets` = ?, `complianceLevel` = ?, `downloads` = ?, `id` = ?, `javaVersion` = ?, `mainClass` = ?, `minimumLauncherVersion` = ?, `time` = ?, `releaseTime` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `_v1_packages__packageId___versionId__json_get_200_response`
--
DELETE FROM `_v1_packages__packageId___versionId__json_get_200_response` WHERE 0;

