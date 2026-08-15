
#include "VersionPackageInfo.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_VersionPackageInfo_version_is_assigned_from_json()
{


    bourne::json input =
    {
        "version", "hello"
    };

    VersionPackageInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVersion().c_str());






}



void test_VersionPackageInfo_assets_is_assigned_from_json()
{


    bourne::json input =
    {
        "assets", "hello"
    };

    VersionPackageInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssets().c_str());






}


void test_VersionPackageInfo_complianceLevel_is_assigned_from_json()
{
    bourne::json input =
    {
        "complianceLevel", 1
    };

    VersionPackageInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getComplianceLevel());








}



void test_VersionPackageInfo_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    VersionPackageInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_VersionPackageInfo_mainClass_is_assigned_from_json()
{


    bourne::json input =
    {
        "mainClass", "hello"
    };

    VersionPackageInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMainClass().c_str());






}


void test_VersionPackageInfo_minimumLauncherVersion_is_assigned_from_json()
{
    bourne::json input =
    {
        "minimumLauncherVersion", 1
    };

    VersionPackageInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinimumLauncherVersion());








}


void test_VersionPackageInfo_time_is_assigned_from_json()
{








}


void test_VersionPackageInfo_releaseTime_is_assigned_from_json()
{








}


void test_VersionPackageInfo_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    VersionPackageInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}



void test_VersionPackageInfo_version_is_converted_to_json()
{

    bourne::json input =
    {
        "version", "hello"
    };

    VersionPackageInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["version"] == output["version"]);



}



void test_VersionPackageInfo_assets_is_converted_to_json()
{

    bourne::json input =
    {
        "assets", "hello"
    };

    VersionPackageInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["assets"] == output["assets"]);



}


void test_VersionPackageInfo_complianceLevel_is_converted_to_json()
{
    bourne::json input =
    {
        "complianceLevel", 1
    };

    VersionPackageInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["complianceLevel"] == output["complianceLevel"]);




}



void test_VersionPackageInfo_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    VersionPackageInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_VersionPackageInfo_mainClass_is_converted_to_json()
{

    bourne::json input =
    {
        "mainClass", "hello"
    };

    VersionPackageInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["mainClass"] == output["mainClass"]);



}


void test_VersionPackageInfo_minimumLauncherVersion_is_converted_to_json()
{
    bourne::json input =
    {
        "minimumLauncherVersion", 1
    };

    VersionPackageInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["minimumLauncherVersion"] == output["minimumLauncherVersion"]);




}


void test_VersionPackageInfo_time_is_converted_to_json()
{




}


void test_VersionPackageInfo_releaseTime_is_converted_to_json()
{




}


void test_VersionPackageInfo_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    VersionPackageInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


