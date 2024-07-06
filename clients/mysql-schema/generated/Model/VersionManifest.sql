--
-- .
-- Prepared SQL queries for 'VersionManifest' definition.
--


--
-- SELECT template for table `VersionManifest`
--
SELECT `latest`, `versions` FROM `VersionManifest` WHERE 1;

--
-- INSERT template for table `VersionManifest`
--
INSERT INTO `VersionManifest`(`latest`, `versions`) VALUES (?, ?);

--
-- UPDATE template for table `VersionManifest`
--
UPDATE `VersionManifest` SET `latest` = ?, `versions` = ? WHERE 1;

--
-- DELETE template for table `VersionManifest`
--
DELETE FROM `VersionManifest` WHERE 0;

