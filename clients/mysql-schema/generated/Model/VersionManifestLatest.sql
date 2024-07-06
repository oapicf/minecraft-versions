--
-- .
-- Prepared SQL queries for 'VersionManifest_latest' definition.
--


--
-- SELECT template for table `VersionManifest_latest`
--
SELECT `release`, `snapshot` FROM `VersionManifest_latest` WHERE 1;

--
-- INSERT template for table `VersionManifest_latest`
--
INSERT INTO `VersionManifest_latest`(`release`, `snapshot`) VALUES (?, ?);

--
-- UPDATE template for table `VersionManifest_latest`
--
UPDATE `VersionManifest_latest` SET `release` = ?, `snapshot` = ? WHERE 1;

--
-- DELETE template for table `VersionManifest_latest`
--
DELETE FROM `VersionManifest_latest` WHERE 0;

