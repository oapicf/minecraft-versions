

#include "Download.h"

using namespace Tiny;

Download::Download()
{
	sha1 = std::string();
	size = int(0);
	url = std::string();
}

Download::Download(std::string jsonString)
{
	this->fromJson(jsonString);
}

Download::~Download()
{

}

void
Download::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *sha1Key = "sha1";

    if(object.has_key(sha1Key))
    {
        bourne::json value = object[sha1Key];



        jsonToValue(&sha1, value, "std::string");


    }

    const char *sizeKey = "size";

    if(object.has_key(sizeKey))
    {
        bourne::json value = object[sizeKey];



        jsonToValue(&size, value, "int");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
Download::toJson()
{
    bourne::json object = bourne::json::object();





    object["sha1"] = getSha1();






    object["size"] = getSize();






    object["url"] = getUrl();



    return object;

}

std::string
Download::getSha1()
{
	return sha1;
}

void
Download::setSha1(std::string sha1)
{
	this->sha1 = sha1;
}

int
Download::getSize()
{
	return size;
}

void
Download::setSize(int size)
{
	this->size = size;
}

std::string
Download::getUrl()
{
	return url;
}

void
Download::setUrl(std::string url)
{
	this->url = url;
}



