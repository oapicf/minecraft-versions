
#include "VersionPackageInfo_javaVersion.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_VersionPackageInfo_javaVersion_component_is_assigned_from_json()
{


    bourne::json input =
    {
        "component", "hello"
    };

    VersionPackageInfo_javaVersion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getComponent().c_str());






}


void test_VersionPackageInfo_javaVersion_majorVersion_is_assigned_from_json()
{
    bourne::json input =
    {
        "majorVersion", 1
    };

    VersionPackageInfo_javaVersion obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMajorVersion());








}



void test_VersionPackageInfo_javaVersion_component_is_converted_to_json()
{

    bourne::json input =
    {
        "component", "hello"
    };

    VersionPackageInfo_javaVersion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["component"] == output["component"]);



}


void test_VersionPackageInfo_javaVersion_majorVersion_is_converted_to_json()
{
    bourne::json input =
    {
        "majorVersion", 1
    };

    VersionPackageInfo_javaVersion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["majorVersion"] == output["majorVersion"]);




}


