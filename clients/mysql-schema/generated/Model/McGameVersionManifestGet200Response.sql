--
-- .
-- Prepared SQL queries for '_mc_game_version_manifest_get_200_response' definition.
--


--
-- SELECT template for table `_mc_game_version_manifest_get_200_response`
--
SELECT `latest`, `versions` FROM `_mc_game_version_manifest_get_200_response` WHERE 1;

--
-- INSERT template for table `_mc_game_version_manifest_get_200_response`
--
INSERT INTO `_mc_game_version_manifest_get_200_response`(`latest`, `versions`) VALUES (?, ?);

--
-- UPDATE template for table `_mc_game_version_manifest_get_200_response`
--
UPDATE `_mc_game_version_manifest_get_200_response` SET `latest` = ?, `versions` = ? WHERE 1;

--
-- DELETE template for table `_mc_game_version_manifest_get_200_response`
--
DELETE FROM `_mc_game_version_manifest_get_200_response` WHERE 0;

