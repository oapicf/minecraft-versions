--
-- .
-- Prepared SQL queries for 'VersionPackageInfo_javaVersion' definition.
--


--
-- SELECT template for table `VersionPackageInfo_javaVersion`
--
SELECT `component`, `majorVersion` FROM `VersionPackageInfo_javaVersion` WHERE 1;

--
-- INSERT template for table `VersionPackageInfo_javaVersion`
--
INSERT INTO `VersionPackageInfo_javaVersion`(`component`, `majorVersion`) VALUES (?, ?);

--
-- UPDATE template for table `VersionPackageInfo_javaVersion`
--
UPDATE `VersionPackageInfo_javaVersion` SET `component` = ?, `majorVersion` = ? WHERE 1;

--
-- DELETE template for table `VersionPackageInfo_javaVersion`
--
DELETE FROM `VersionPackageInfo_javaVersion` WHERE 0;

