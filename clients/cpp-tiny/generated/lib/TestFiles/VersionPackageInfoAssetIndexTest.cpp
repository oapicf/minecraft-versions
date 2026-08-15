
#include "VersionPackageInfo_assetIndex.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_VersionPackageInfo_assetIndex_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    VersionPackageInfo_assetIndex obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_VersionPackageInfo_assetIndex_sha1_is_assigned_from_json()
{


    bourne::json input =
    {
        "sha1", "hello"
    };

    VersionPackageInfo_assetIndex obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSha1().c_str());






}


void test_VersionPackageInfo_assetIndex_size_is_assigned_from_json()
{
    bourne::json input =
    {
        "size", 1
    };

    VersionPackageInfo_assetIndex obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSize());








}


void test_VersionPackageInfo_assetIndex_totalSize_is_assigned_from_json()
{
    bourne::json input =
    {
        "totalSize", 1
    };

    VersionPackageInfo_assetIndex obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotalSize());








}


void test_VersionPackageInfo_assetIndex_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    VersionPackageInfo_assetIndex obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_VersionPackageInfo_assetIndex_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    VersionPackageInfo_assetIndex obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_VersionPackageInfo_assetIndex_sha1_is_converted_to_json()
{

    bourne::json input =
    {
        "sha1", "hello"
    };

    VersionPackageInfo_assetIndex obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sha1"] == output["sha1"]);



}


void test_VersionPackageInfo_assetIndex_size_is_converted_to_json()
{
    bourne::json input =
    {
        "size", 1
    };

    VersionPackageInfo_assetIndex obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["size"] == output["size"]);




}


void test_VersionPackageInfo_assetIndex_totalSize_is_converted_to_json()
{
    bourne::json input =
    {
        "totalSize", 1
    };

    VersionPackageInfo_assetIndex obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["totalSize"] == output["totalSize"]);




}


void test_VersionPackageInfo_assetIndex_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    VersionPackageInfo_assetIndex obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


