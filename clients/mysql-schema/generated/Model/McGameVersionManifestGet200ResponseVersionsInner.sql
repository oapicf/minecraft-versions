--
-- .
-- Prepared SQL queries for '_mc_game_version_manifest_get_200_response_versions_inner' definition.
--


--
-- SELECT template for table `_mc_game_version_manifest_get_200_response_versions_inner`
--
SELECT `id`, `type`, `url`, `time`, `releaseTime` FROM `_mc_game_version_manifest_get_200_response_versions_inner` WHERE 1;

--
-- INSERT template for table `_mc_game_version_manifest_get_200_response_versions_inner`
--
INSERT INTO `_mc_game_version_manifest_get_200_response_versions_inner`(`id`, `type`, `url`, `time`, `releaseTime`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `_mc_game_version_manifest_get_200_response_versions_inner`
--
UPDATE `_mc_game_version_manifest_get_200_response_versions_inner` SET `id` = ?, `type` = ?, `url` = ?, `time` = ?, `releaseTime` = ? WHERE 1;

--
-- DELETE template for table `_mc_game_version_manifest_get_200_response_versions_inner`
--
DELETE FROM `_mc_game_version_manifest_get_200_response_versions_inner` WHERE 0;

