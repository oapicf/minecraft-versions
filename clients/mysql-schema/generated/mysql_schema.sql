/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `Download` generated from model 'Download'
--

CREATE TABLE IF NOT EXISTS `Download` (
  `sha1` TEXT DEFAULT NULL,
  `size` INT DEFAULT NULL,
  `url` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Version` generated from model 'Version'
--

CREATE TABLE IF NOT EXISTS `Version` (
  `id` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL,
  `url` TEXT DEFAULT NULL,
  `time` DATETIME DEFAULT NULL,
  `releaseTime` DATETIME DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionManifest` generated from model 'VersionManifest'
--

CREATE TABLE IF NOT EXISTS `VersionManifest` (
  `latest` TEXT DEFAULT NULL,
  `versions` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionManifest_latest` generated from model 'VersionManifestUnderscorelatest'
--

CREATE TABLE IF NOT EXISTS `VersionManifest_latest` (
  `release` TEXT DEFAULT NULL,
  `snapshot` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionPackageInfo` generated from model 'VersionPackageInfo'
--

CREATE TABLE IF NOT EXISTS `VersionPackageInfo` (
  `version` TEXT DEFAULT NULL,
  `assetIndex` TEXT DEFAULT NULL,
  `assets` TEXT DEFAULT NULL,
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
-- Table structure for table `VersionPackageInfo_assetIndex` generated from model 'VersionPackageInfoUnderscoreassetIndex'
--

CREATE TABLE IF NOT EXISTS `VersionPackageInfo_assetIndex` (
  `id` TEXT DEFAULT NULL,
  `sha1` TEXT DEFAULT NULL,
  `size` INT DEFAULT NULL,
  `totalSize` INT DEFAULT NULL,
  `url` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionPackageInfo_downloads` generated from model 'VersionPackageInfoUnderscoredownloads'
--

CREATE TABLE IF NOT EXISTS `VersionPackageInfo_downloads` (
  `client` TEXT DEFAULT NULL,
  `client_mappings` TEXT DEFAULT NULL,
  `server` TEXT DEFAULT NULL,
  `server_mappings` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionPackageInfo_javaVersion` generated from model 'VersionPackageInfoUnderscorejavaVersion'
--

CREATE TABLE IF NOT EXISTS `VersionPackageInfo_javaVersion` (
  `component` TEXT DEFAULT NULL,
  `majorVersion` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


