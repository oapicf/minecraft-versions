--
-- .
-- Prepared SQL queries for 'VersionPackageInfo_assetIndex' definition.
--


--
-- SELECT template for table `VersionPackageInfo_assetIndex`
--
SELECT `id`, `sha1`, `size`, `totalSize`, `url` FROM `VersionPackageInfo_assetIndex` WHERE 1;

--
-- INSERT template for table `VersionPackageInfo_assetIndex`
--
INSERT INTO `VersionPackageInfo_assetIndex`(`id`, `sha1`, `size`, `totalSize`, `url`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `VersionPackageInfo_assetIndex`
--
UPDATE `VersionPackageInfo_assetIndex` SET `id` = ?, `sha1` = ?, `size` = ?, `totalSize` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `VersionPackageInfo_assetIndex`
--
DELETE FROM `VersionPackageInfo_assetIndex` WHERE 0;

