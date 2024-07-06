--
-- .
-- Prepared SQL queries for '_mc_game_version_manifest_get_200_response_latest' definition.
--


--
-- SELECT template for table `_mc_game_version_manifest_get_200_response_latest`
--
SELECT `release`, `snapshot` FROM `_mc_game_version_manifest_get_200_response_latest` WHERE 1;

--
-- INSERT template for table `_mc_game_version_manifest_get_200_response_latest`
--
INSERT INTO `_mc_game_version_manifest_get_200_response_latest`(`release`, `snapshot`) VALUES (?, ?);

--
-- UPDATE template for table `_mc_game_version_manifest_get_200_response_latest`
--
UPDATE `_mc_game_version_manifest_get_200_response_latest` SET `release` = ?, `snapshot` = ? WHERE 1;

--
-- DELETE template for table `_mc_game_version_manifest_get_200_response_latest`
--
DELETE FROM `_mc_game_version_manifest_get_200_response_latest` WHERE 0;

