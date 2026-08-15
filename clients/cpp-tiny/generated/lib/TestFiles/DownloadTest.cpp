
#include "Download.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Download_sha1_is_assigned_from_json()
{


    bourne::json input =
    {
        "sha1", "hello"
    };

    Download obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSha1().c_str());






}


void test_Download_size_is_assigned_from_json()
{
    bourne::json input =
    {
        "size", 1
    };

    Download obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSize());








}


void test_Download_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    Download obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_Download_sha1_is_converted_to_json()
{

    bourne::json input =
    {
        "sha1", "hello"
    };

    Download obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sha1"] == output["sha1"]);



}


void test_Download_size_is_converted_to_json()
{
    bourne::json input =
    {
        "size", 1
    };

    Download obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["size"] == output["size"]);




}


void test_Download_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    Download obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


