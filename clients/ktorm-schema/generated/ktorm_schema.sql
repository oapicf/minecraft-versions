

-- --------------------------------------------------------------------------
-- Table structure for table `Download` generated from model 'download'
--

CREATE TABLE IF NOT EXISTS `Download` (
  `sha1` text,
  `size` int,
  `url` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Version` generated from model 'version'
--

CREATE TABLE IF NOT EXISTS `Version` (
  `id` text PRIMARY KEY,
  `type` text,
  `url` text,
  `time` datetime,
  `releaseTime` datetime
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VersionManifest` generated from model 'versionManifest'
--

CREATE TABLE IF NOT EXISTS `VersionManifest` (
  `latest` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `VersionManifestVersion` generated from model 'VersionManifestVersion'

CREATE TABLE IF NOT EXISTS `VersionManifestVersion` (
  `versionManifest` long NOT NULL
  `version` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `VersionManifest_latest` generated from model 'versionManifestLatest'
--

CREATE TABLE IF NOT EXISTS `VersionManifest_latest` (
  `release` text,
  `snapshot` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VersionPackageInfo` generated from model 'versionPackageInfo'
--

CREATE TABLE IF NOT EXISTS `VersionPackageInfo` (
  `version` text,
  `assetIndex` long,
  `assets` int,
  `complianceLevel` int,
  `downloads` long,
  `id` text PRIMARY KEY,
  `javaVersion` long,
  `mainClass` text,
  `minimumLauncherVersion` int,
  `time` datetime,
  `releaseTime` datetime,
  `type` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VersionPackageInfo_assetIndex` generated from model 'versionPackageInfoAssetIndex'
--

CREATE TABLE IF NOT EXISTS `VersionPackageInfo_assetIndex` (
  `id` text PRIMARY KEY,
  `sha1` text,
  `size` int,
  `totalSize` int,
  `url` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VersionPackageInfo_downloads` generated from model 'versionPackageInfoDownloads'
--

CREATE TABLE IF NOT EXISTS `VersionPackageInfo_downloads` (
  `client` long,
  `client_mappings` long,
  `server` long,
  `server_mappings` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VersionPackageInfo_javaVersion` generated from model 'versionPackageInfoJavaVersion'
--

CREATE TABLE IF NOT EXISTS `VersionPackageInfo_javaVersion` (
  `component` text,
  `majorVersion` int
); 



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
