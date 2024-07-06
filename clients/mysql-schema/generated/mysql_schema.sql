/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `_mc_game_version_manifest_get_200_response` generated from model 'UnderscoremcUnderscoregameUnderscoreversionUnderscoremanifestUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `_mc_game_version_manifest_get_200_response` (
  `latest` TEXT DEFAULT NULL,
  `versions` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `_mc_game_version_manifest_get_200_response_latest` generated from model 'UnderscoremcUnderscoregameUnderscoreversionUnderscoremanifestUnderscoregetUnderscore200UnderscoreresponseUnderscorelatest'
--

CREATE TABLE IF NOT EXISTS `_mc_game_version_manifest_get_200_response_latest` (
  `release` TEXT DEFAULT NULL,
  `snapshot` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `_mc_game_version_manifest_get_200_response_versions_inner` generated from model 'UnderscoremcUnderscoregameUnderscoreversionUnderscoremanifestUnderscoregetUnderscore200UnderscoreresponseUnderscoreversionsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `_mc_game_version_manifest_get_200_response_versions_inner` (
  `id` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL,
  `url` TEXT DEFAULT NULL,
  `time` DATETIME DEFAULT NULL,
  `releaseTime` DATETIME DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `_v1_packages__packageId___versionId__json_get_200_response` generated from model 'Underscorev1UnderscorepackagesUnderscoreUnderscorepackageIdUnderscoreUnderscoreUnderscoreversionIdUnderscoreUnderscorejsonUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `_v1_packages__packageId___versionId__json_get_200_response` (
  `version` TEXT DEFAULT NULL,
  `assetIndex` TEXT DEFAULT NULL,
  `assets` INT DEFAULT NULL,
  `complianceLevel` INT DEFAULT NULL,
  `downloads` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL,
  `javaVersion` TEXT DEFAULT NULL,
  `mainClass` TEXT DEFAULT NULL,
  `minimumLauncherVersion` INT DEFAULT NULL,
  `time` DATETIME DEFAULT NULL,
  `releaseTime` DATETIME DEFAULT NULL,
  `type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `_v1_packages__packageId___versionId__json_get_200_response_asset` generated from model 'Underscorev1UnderscorepackagesUnderscoreUnderscorepackageIdUnderscoreUnderscoreUnderscoreversionIdUnderscoreUnderscorejsonUnderscoregetUnderscore200UnderscoreresponseUnderscoreassetIndex'
--

CREATE TABLE IF NOT EXISTS `_v1_packages__packageId___versionId__json_get_200_response_asset` (
  `id` TEXT DEFAULT NULL,
  `sha1` TEXT DEFAULT NULL,
  `size` INT DEFAULT NULL,
  `totalSize` INT DEFAULT NULL,
  `url` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `_v1_packages__packageId___versionId__json_get_200_response_downl` generated from model 'Underscorev1UnderscorepackagesUnderscoreUnderscorepackageIdUnderscoreUnderscoreUnderscoreversionIdUnderscoreUnderscorejsonUnderscoregetUnderscore200UnderscoreresponseUnderscoredownloads'
--

CREATE TABLE IF NOT EXISTS `_v1_packages__packageId___versionId__json_get_200_response_downl` (
  `client` TEXT DEFAULT NULL,
  `client_mappings` TEXT DEFAULT NULL,
  `server` TEXT DEFAULT NULL,
  `server_mappings` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `_v1_packages__packageId___versionId__json_get_200_response_downl` generated from model 'Underscorev1UnderscorepackagesUnderscoreUnderscorepackageIdUnderscoreUnderscoreUnderscoreversionIdUnderscoreUnderscorejsonUnderscoregetUnderscore200UnderscoreresponseUnderscoredownloadsUnderscoreclient'
--

CREATE TABLE IF NOT EXISTS `_v1_packages__packageId___versionId__json_get_200_response_downl` (
  `sha1` TEXT DEFAULT NULL,
  `size` INT DEFAULT NULL,
  `url` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `_v1_packages__packageId___versionId__json_get_200_response_javaV` generated from model 'Underscorev1UnderscorepackagesUnderscoreUnderscorepackageIdUnderscoreUnderscoreUnderscoreversionIdUnderscoreUnderscorejsonUnderscoregetUnderscore200UnderscoreresponseUnderscorejavaVersion'
--

CREATE TABLE IF NOT EXISTS `_v1_packages__packageId___versionId__json_get_200_response_javaV` (
  `component` TEXT DEFAULT NULL,
  `majorVersion` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


