
#include "VersionManifest_latest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_VersionManifest_latest_release_is_assigned_from_json()
{


    bourne::json input =
    {
        "release", "hello"
    };

    VersionManifest_latest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRelease().c_str());






}


void test_VersionManifest_latest_snapshot_is_assigned_from_json()
{


    bourne::json input =
    {
        "snapshot", "hello"
    };

    VersionManifest_latest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSnapshot().c_str());






}



void test_VersionManifest_latest_release_is_converted_to_json()
{

    bourne::json input =
    {
        "release", "hello"
    };

    VersionManifest_latest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["release"] == output["release"]);



}


void test_VersionManifest_latest_snapshot_is_converted_to_json()
{

    bourne::json input =
    {
        "snapshot", "hello"
    };

    VersionManifest_latest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["snapshot"] == output["snapshot"]);



}


