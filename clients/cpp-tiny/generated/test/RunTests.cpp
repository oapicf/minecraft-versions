
#include "DownloadTest.cpp"

#include "VersionTest.cpp"

#include "VersionManifestTest.cpp"

#include "VersionManifest_latestTest.cpp"

#include "VersionPackageInfoTest.cpp"

#include "VersionPackageInfo_assetIndexTest.cpp"

#include "VersionPackageInfo_downloadsTest.cpp"

#include "VersionPackageInfo_javaVersionTest.cpp"



void setUp(){}

void tearDown(){}

void runTests(){
    
    
    RUN_TEST(test_Download_sha1_is_assigned_from_json);
    
    
    RUN_TEST(test_Download_size_is_assigned_from_json);
    
    
    RUN_TEST(test_Download_url_is_assigned_from_json);
    
    
    
    RUN_TEST(test_Version_id_is_assigned_from_json);
    
    
    RUN_TEST(test_Version_type_is_assigned_from_json);
    
    
    RUN_TEST(test_Version_url_is_assigned_from_json);
    
    
    RUN_TEST(test_Version_time_is_assigned_from_json);
    
    
    RUN_TEST(test_Version_releaseTime_is_assigned_from_json);
    
    
    
    
    
    
    RUN_TEST(test_VersionManifest_latest_release_is_assigned_from_json);
    
    
    RUN_TEST(test_VersionManifest_latest_snapshot_is_assigned_from_json);
    
    
    
    RUN_TEST(test_VersionPackageInfo_version_is_assigned_from_json);
    
    
    
    RUN_TEST(test_VersionPackageInfo_assets_is_assigned_from_json);
    
    
    RUN_TEST(test_VersionPackageInfo_complianceLevel_is_assigned_from_json);
    
    
    
    RUN_TEST(test_VersionPackageInfo_id_is_assigned_from_json);
    
    
    
    RUN_TEST(test_VersionPackageInfo_mainClass_is_assigned_from_json);
    
    
    RUN_TEST(test_VersionPackageInfo_minimumLauncherVersion_is_assigned_from_json);
    
    
    RUN_TEST(test_VersionPackageInfo_time_is_assigned_from_json);
    
    
    RUN_TEST(test_VersionPackageInfo_releaseTime_is_assigned_from_json);
    
    
    RUN_TEST(test_VersionPackageInfo_type_is_assigned_from_json);
    
    
    
    RUN_TEST(test_VersionPackageInfo_assetIndex_id_is_assigned_from_json);
    
    
    RUN_TEST(test_VersionPackageInfo_assetIndex_sha1_is_assigned_from_json);
    
    
    RUN_TEST(test_VersionPackageInfo_assetIndex_size_is_assigned_from_json);
    
    
    RUN_TEST(test_VersionPackageInfo_assetIndex_totalSize_is_assigned_from_json);
    
    
    RUN_TEST(test_VersionPackageInfo_assetIndex_url_is_assigned_from_json);
    
    
    
    
    
    
    
    
    RUN_TEST(test_VersionPackageInfo_javaVersion_component_is_assigned_from_json);
    
    
    RUN_TEST(test_VersionPackageInfo_javaVersion_majorVersion_is_assigned_from_json);
    
    

    
    
    RUN_TEST(test_Download_sha1_is_converted_to_json);
    
    
    RUN_TEST(test_Download_size_is_converted_to_json);
    
    
    RUN_TEST(test_Download_url_is_converted_to_json);
    
    
    
    RUN_TEST(test_Version_id_is_converted_to_json);
    
    
    RUN_TEST(test_Version_type_is_converted_to_json);
    
    
    RUN_TEST(test_Version_url_is_converted_to_json);
    
    
    RUN_TEST(test_Version_time_is_converted_to_json);
    
    
    RUN_TEST(test_Version_releaseTime_is_converted_to_json);
    
    
    
    
    
    
    RUN_TEST(test_VersionManifest_latest_release_is_converted_to_json);
    
    
    RUN_TEST(test_VersionManifest_latest_snapshot_is_converted_to_json);
    
    
    
    RUN_TEST(test_VersionPackageInfo_version_is_converted_to_json);
    
    
    
    RUN_TEST(test_VersionPackageInfo_assets_is_converted_to_json);
    
    
    RUN_TEST(test_VersionPackageInfo_complianceLevel_is_converted_to_json);
    
    
    
    RUN_TEST(test_VersionPackageInfo_id_is_converted_to_json);
    
    
    
    RUN_TEST(test_VersionPackageInfo_mainClass_is_converted_to_json);
    
    
    RUN_TEST(test_VersionPackageInfo_minimumLauncherVersion_is_converted_to_json);
    
    
    RUN_TEST(test_VersionPackageInfo_time_is_converted_to_json);
    
    
    RUN_TEST(test_VersionPackageInfo_releaseTime_is_converted_to_json);
    
    
    RUN_TEST(test_VersionPackageInfo_type_is_converted_to_json);
    
    
    
    RUN_TEST(test_VersionPackageInfo_assetIndex_id_is_converted_to_json);
    
    
    RUN_TEST(test_VersionPackageInfo_assetIndex_sha1_is_converted_to_json);
    
    
    RUN_TEST(test_VersionPackageInfo_assetIndex_size_is_converted_to_json);
    
    
    RUN_TEST(test_VersionPackageInfo_assetIndex_totalSize_is_converted_to_json);
    
    
    RUN_TEST(test_VersionPackageInfo_assetIndex_url_is_converted_to_json);
    
    
    
    
    
    
    
    
    RUN_TEST(test_VersionPackageInfo_javaVersion_component_is_converted_to_json);
    
    
    RUN_TEST(test_VersionPackageInfo_javaVersion_majorVersion_is_converted_to_json);
    
    


}

int main(void) {
    UNITY_BEGIN();
    runTests();
    return UNITY_END();
}

void setup() {
    UNITY_BEGIN();
    runTests();
    UNITY_END();
}

void loop() {

}
