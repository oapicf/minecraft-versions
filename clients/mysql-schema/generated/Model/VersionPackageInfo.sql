--
-- .
-- Prepared SQL queries for 'VersionPackageInfo' definition.
--


--
-- SELECT template for table `VersionPackageInfo`
--
SELECT `version`, `assetIndex`, `assets`, `complianceLevel`, `downloads`, `id`, `javaVersion`, `mainClass`, `minimumLauncherVersion`, `time`, `releaseTime`, `type` FROM `VersionPackageInfo` WHERE 1;

--
-- INSERT template for table `VersionPackageInfo`
--
INSERT INTO `VersionPackageInfo`(`version`, `assetIndex`, `assets`, `complianceLevel`, `downloads`, `id`, `javaVersion`, `mainClass`, `minimumLauncherVersion`, `time`, `releaseTime`, `type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `VersionPackageInfo`
--
UPDATE `VersionPackageInfo` SET `version` = ?, `assetIndex` = ?, `assets` = ?, `complianceLevel` = ?, `downloads` = ?, `id` = ?, `javaVersion` = ?, `mainClass` = ?, `minimumLauncherVersion` = ?, `time` = ?, `releaseTime` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `VersionPackageInfo`
--
DELETE FROM `VersionPackageInfo` WHERE 0;

