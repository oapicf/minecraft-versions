

#include "VersionPackageInfo_assetIndex.h"

using namespace Tiny;

VersionPackageInfo_assetIndex::VersionPackageInfo_assetIndex()
{
	id = std::string();
	sha1 = std::string();
	size = int(0);
	totalSize = int(0);
	url = std::string();
}

VersionPackageInfo_assetIndex::VersionPackageInfo_assetIndex(std::string jsonString)
{
	this->fromJson(jsonString);
}

VersionPackageInfo_assetIndex::~VersionPackageInfo_assetIndex()
{

}

void
VersionPackageInfo_assetIndex::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

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

    const char *totalSizeKey = "totalSize";

    if(object.has_key(totalSizeKey))
    {
        bourne::json value = object[totalSizeKey];



        jsonToValue(&totalSize, value, "int");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
VersionPackageInfo_assetIndex::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["sha1"] = getSha1();






    object["size"] = getSize();






    object["totalSize"] = getTotalSize();






    object["url"] = getUrl();



    return object;

}

std::string
VersionPackageInfo_assetIndex::getId()
{
	return id;
}

void
VersionPackageInfo_assetIndex::setId(std::string id)
{
	this->id = id;
}

std::string
VersionPackageInfo_assetIndex::getSha1()
{
	return sha1;
}

void
VersionPackageInfo_assetIndex::setSha1(std::string sha1)
{
	this->sha1 = sha1;
}

int
VersionPackageInfo_assetIndex::getSize()
{
	return size;
}

void
VersionPackageInfo_assetIndex::setSize(int size)
{
	this->size = size;
}

int
VersionPackageInfo_assetIndex::getTotalSize()
{
	return totalSize;
}

void
VersionPackageInfo_assetIndex::setTotalSize(int totalSize)
{
	this->totalSize = totalSize;
}

std::string
VersionPackageInfo_assetIndex::getUrl()
{
	return url;
}

void
VersionPackageInfo_assetIndex::setUrl(std::string url)
{
	this->url = url;
}



