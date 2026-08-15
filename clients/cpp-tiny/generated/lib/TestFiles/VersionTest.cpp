
#include "Version.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Version_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Version obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Version_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    Version obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_Version_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    Version obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}


void test_Version_time_is_assigned_from_json()
{








}


void test_Version_releaseTime_is_assigned_from_json()
{








}



void test_Version_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Version obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Version_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    Version obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_Version_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    Version obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


void test_Version_time_is_converted_to_json()
{




}


void test_Version_releaseTime_is_converted_to_json()
{




}


