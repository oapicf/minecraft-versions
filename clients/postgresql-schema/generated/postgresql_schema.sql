--
-- Schema objects for PostgreSQL
-- ""
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--

--
-- DROP OBJECTS
-- (remove comment prefix to start using DROP commands)
--
-- TABLES
--
-- DROP TABLE IF EXISTS download;
-- DROP TABLE IF EXISTS "version";
-- DROP TABLE IF EXISTS version_manifest;
-- DROP TABLE IF EXISTS version_manifest_latest;
-- DROP TABLE IF EXISTS version_package_info;
-- DROP TABLE IF EXISTS version_package_info_asset_index;
-- DROP TABLE IF EXISTS version_package_info_downloads;
-- DROP TABLE IF EXISTS version_package_info_java_version;

--
-- TYPES
--


--
-- CREATE OBJECTS
--
-- TYPES
--

--
-- TABLES
--
--
-- Table 'download' generated from model 'Download'
--
CREATE TABLE IF NOT EXISTS download (
    sha1 TEXT DEFAULT NULL,
    "size" INTEGER DEFAULT NULL,
    url TEXT DEFAULT NULL
);
COMMENT ON TABLE download IS 'Original model name - Download.';

--
-- Table 'version' generated from model 'Version'
--
CREATE TABLE IF NOT EXISTS "version" (
    "id" TEXT DEFAULT NULL,
    "type" TEXT DEFAULT NULL,
    url TEXT DEFAULT NULL,
    "time" TIMESTAMP DEFAULT NULL,
    release_time TIMESTAMP DEFAULT NULL
);
COMMENT ON TABLE "version" IS 'Original model name - Version.';
COMMENT ON COLUMN "version".release_time IS 'Original param name - releaseTime.';

--
-- Table 'version_manifest' generated from model 'VersionManifest'
--
CREATE TABLE IF NOT EXISTS version_manifest (
    latest TEXT DEFAULT NULL,
    versions JSON DEFAULT NULL
);
COMMENT ON TABLE version_manifest IS 'Original model name - VersionManifest.';

--
-- Table 'version_manifest_latest' generated from model 'VersionManifestUnderscorelatest'
--
CREATE TABLE IF NOT EXISTS version_manifest_latest (
    "release" TEXT DEFAULT NULL,
    "snapshot" TEXT DEFAULT NULL
);
COMMENT ON TABLE version_manifest_latest IS 'Original model name - VersionManifest_latest.';

--
-- Table 'version_package_info' generated from model 'VersionPackageInfo'
--
CREATE TABLE IF NOT EXISTS version_package_info (
    "version" TEXT DEFAULT NULL,
    asset_index TEXT DEFAULT NULL,
    assets TEXT DEFAULT NULL,
    compliance_level INTEGER DEFAULT NULL,
    downloads TEXT DEFAULT NULL,
    "id" TEXT DEFAULT NULL,
    java_version TEXT DEFAULT NULL,
    main_class TEXT DEFAULT NULL,
    minimum_launcher_version INTEGER DEFAULT NULL,
    "time" TIMESTAMP DEFAULT NULL,
    release_time TIMESTAMP DEFAULT NULL,
    "type" TEXT DEFAULT NULL
);
COMMENT ON TABLE version_package_info IS 'Original model name - VersionPackageInfo.';
COMMENT ON COLUMN version_package_info.asset_index IS 'Original param name - assetIndex.';
COMMENT ON COLUMN version_package_info.compliance_level IS 'Original param name - complianceLevel.';
COMMENT ON COLUMN version_package_info.java_version IS 'Original param name - javaVersion.';
COMMENT ON COLUMN version_package_info.main_class IS 'Original param name - mainClass.';
COMMENT ON COLUMN version_package_info.minimum_launcher_version IS 'Original param name - minimumLauncherVersion.';
COMMENT ON COLUMN version_package_info.release_time IS 'Original param name - releaseTime.';

--
-- Table 'version_package_info_asset_index' generated from model 'VersionPackageInfoUnderscoreassetIndex'
--
CREATE TABLE IF NOT EXISTS version_package_info_asset_index (
    "id" TEXT DEFAULT NULL,
    sha1 TEXT DEFAULT NULL,
    "size" INTEGER DEFAULT NULL,
    total_size INTEGER DEFAULT NULL,
    url TEXT DEFAULT NULL
);
COMMENT ON TABLE version_package_info_asset_index IS 'Original model name - VersionPackageInfo_assetIndex.';
COMMENT ON COLUMN version_package_info_asset_index.total_size IS 'Original param name - totalSize.';

--
-- Table 'version_package_info_downloads' generated from model 'VersionPackageInfoUnderscoredownloads'
--
CREATE TABLE IF NOT EXISTS version_package_info_downloads (
    client TEXT DEFAULT NULL,
    client_mappings TEXT DEFAULT NULL,
    "server" TEXT DEFAULT NULL,
    server_mappings TEXT DEFAULT NULL
);
COMMENT ON TABLE version_package_info_downloads IS 'Original model name - VersionPackageInfo_downloads.';

--
-- Table 'version_package_info_java_version' generated from model 'VersionPackageInfoUnderscorejavaVersion'
--
CREATE TABLE IF NOT EXISTS version_package_info_java_version (
    component TEXT DEFAULT NULL,
    major_version INTEGER DEFAULT NULL
);
COMMENT ON TABLE version_package_info_java_version IS 'Original model name - VersionPackageInfo_javaVersion.';
COMMENT ON COLUMN version_package_info_java_version.major_version IS 'Original param name - majorVersion.';

