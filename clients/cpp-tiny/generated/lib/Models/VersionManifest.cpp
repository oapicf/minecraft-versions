

#include "VersionManifest.h"

using namespace Tiny;

VersionManifest::VersionManifest()
{
	latest = VersionManifest_latest();
	versions = std::list<Version>();
}

VersionManifest::VersionManifest(std::string jsonString)
{
	this->fromJson(jsonString);
}

VersionManifest::~VersionManifest()
{

}

void
VersionManifest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *latestKey = "latest";

    if(object.has_key(latestKey))
    {
        bourne::json value = object[latestKey];




        VersionManifest_latest* obj = &latest;
		obj->fromJson(value.dump());

    }

    const char *versionsKey = "versions";

    if(object.has_key(versionsKey))
    {
        bourne::json value = object[versionsKey];


        std::list<Version> versions_list;
        Version element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            versions_list.push_back(element);
        }
        versions = versions_list;


    }


}

bourne::json
VersionManifest::toJson()
{
    bourne::json object = bourne::json::object();






	object["latest"] = getLatest().toJson();




    std::list<Version> versions_list = getVersions();
    bourne::json versions_arr = bourne::json::array();

    for(auto& var : versions_list)
    {
        Version obj = var;
        versions_arr.append(obj.toJson());
    }
    object["versions"] = versions_arr;




    return object;

}

VersionManifest_latest
VersionManifest::getLatest()
{
	return latest;
}

void
VersionManifest::setLatest(VersionManifest_latest latest)
{
	this->latest = latest;
}

std::list<Version>
VersionManifest::getVersions()
{
	return versions;
}

void
VersionManifest::setVersions(std::list<Version> versions)
{
	this->versions = versions;
}



