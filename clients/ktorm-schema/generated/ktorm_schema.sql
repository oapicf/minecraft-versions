

-- --------------------------------------------------------------------------
-- Table structure for table `_mc_game_version_manifest_get_200_response` generated from model 'mcGameVersionManifestGet200Response'
--

CREATE TABLE IF NOT EXISTS `_mc_game_version_manifest_get_200_response` (
  `latest` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `McGameVersionManifestGet200ResponseMcGameVersionManifestGet200ResponseVersionsInner` generated from model 'McGameVersionManifestGet200ResponseMcGameVersionManifestGet200ResponseVersionsInner'

CREATE TABLE IF NOT EXISTS `McGameVersionManifestGet200ResponseMcGameVersionManifestGet200ResponseVersionsInner` (
  `mcGameVersionManifestGet200Response` long NOT NULL
  `mcGameVersionManifestGet200ResponseVersionsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `_mc_game_version_manifest_get_200_response_latest` generated from model 'mcGameVersionManifestGet200ResponseLatest'
--

CREATE TABLE IF NOT EXISTS `_mc_game_version_manifest_get_200_response_latest` (
  `release` text,
  `snapshot` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `_mc_game_version_manifest_get_200_response_versions_inner` generated from model 'mcGameVersionManifestGet200ResponseVersionsInner'
--

CREATE TABLE IF NOT EXISTS `_mc_game_version_manifest_get_200_response_versions_inner` (
  `id` text PRIMARY KEY,
  `type` text,
  `url` text,
  `time` datetime,
  `releaseTime` datetime
); 


-- --------------------------------------------------------------------------
-- Table structure for table `_v1_packages__packageId___versionId__json_get_200_response` generated from model 'v1PackagesPackageIdVersionIdJsonGet200Response'
--

CREATE TABLE IF NOT EXISTS `_v1_packages__packageId___versionId__json_get_200_response` (
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
-- Table structure for table `_v1_packages__packageId___versionId__json_get_200_response_assetIndex` generated from model 'v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex'
--

CREATE TABLE IF NOT EXISTS `_v1_packages__packageId___versionId__json_get_200_response_assetIndex` (
  `id` text PRIMARY KEY,
  `sha1` text,
  `size` int,
  `totalSize` int,
  `url` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `_v1_packages__packageId___versionId__json_get_200_response_downloads` generated from model 'v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads'
--

CREATE TABLE IF NOT EXISTS `_v1_packages__packageId___versionId__json_get_200_response_downloads` (
  `client` long,
  `client_mappings` long,
  `server` long,
  `server_mappings` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `_v1_packages__packageId___versionId__json_get_200_response_downloads_client` generated from model 'v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient'
--

CREATE TABLE IF NOT EXISTS `_v1_packages__packageId___versionId__json_get_200_response_downloads_client` (
  `sha1` text,
  `size` int,
  `url` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `_v1_packages__packageId___versionId__json_get_200_response_javaVersion` generated from model 'v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion'
--

CREATE TABLE IF NOT EXISTS `_v1_packages__packageId___versionId__json_get_200_response_javaVersion` (
  `component` text,
  `majorVersion` int
); 



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
