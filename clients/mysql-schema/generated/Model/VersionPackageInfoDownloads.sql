--
-- .
-- Prepared SQL queries for 'VersionPackageInfo_downloads' definition.
--


--
-- SELECT template for table `VersionPackageInfo_downloads`
--
SELECT `client`, `client_mappings`, `server`, `server_mappings` FROM `VersionPackageInfo_downloads` WHERE 1;

--
-- INSERT template for table `VersionPackageInfo_downloads`
--
INSERT INTO `VersionPackageInfo_downloads`(`client`, `client_mappings`, `server`, `server_mappings`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `VersionPackageInfo_downloads`
--
UPDATE `VersionPackageInfo_downloads` SET `client` = ?, `client_mappings` = ?, `server` = ?, `server_mappings` = ? WHERE 1;

--
-- DELETE template for table `VersionPackageInfo_downloads`
--
DELETE FROM `VersionPackageInfo_downloads` WHERE 0;

