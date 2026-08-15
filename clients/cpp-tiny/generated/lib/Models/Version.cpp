

#include "Version.h"

using namespace Tiny;

Version::Version()
{
	id = std::string();
	type = std::string();
	url = std::string();
	time = std::string();
	releaseTime = std::string();
}

Version::Version(std::string jsonString)
{
	this->fromJson(jsonString);
}

Version::~Version()
{

}

void
Version::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *timeKey = "time";

    if(object.has_key(timeKey))
    {
        bourne::json value = object[timeKey];



        jsonToValue(&time, value, "std::string");


    }

    const char *releaseTimeKey = "releaseTime";

    if(object.has_key(releaseTimeKey))
    {
        bourne::json value = object[releaseTimeKey];



        jsonToValue(&releaseTime, value, "std::string");


    }


}

bourne::json
Version::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["type"] = getType();






    object["url"] = getUrl();






    object["time"] = getTime();






    object["releaseTime"] = getReleaseTime();



    return object;

}

std::string
Version::getId()
{
	return id;
}

void
Version::setId(std::string id)
{
	this->id = id;
}

std::string
Version::getType()
{
	return type;
}

void
Version::setType(std::string type)
{
	this->type = type;
}

std::string
Version::getUrl()
{
	return url;
}

void
Version::setUrl(std::string url)
{
	this->url = url;
}

std::string
Version::getTime()
{
	return time;
}

void
Version::setTime(std::string time)
{
	this->time = time;
}

std::string
Version::getReleaseTime()
{
	return releaseTime;
}

void
Version::setReleaseTime(std::string releaseTime)
{
	this->releaseTime = releaseTime;
}



