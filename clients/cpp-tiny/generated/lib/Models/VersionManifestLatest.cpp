

#include "VersionManifest_latest.h"

using namespace Tiny;

VersionManifest_latest::VersionManifest_latest()
{
	release = std::string();
	snapshot = std::string();
}

VersionManifest_latest::VersionManifest_latest(std::string jsonString)
{
	this->fromJson(jsonString);
}

VersionManifest_latest::~VersionManifest_latest()
{

}

void
VersionManifest_latest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *releaseKey = "release";

    if(object.has_key(releaseKey))
    {
        bourne::json value = object[releaseKey];



        jsonToValue(&release, value, "std::string");


    }

    const char *snapshotKey = "snapshot";

    if(object.has_key(snapshotKey))
    {
        bourne::json value = object[snapshotKey];



        jsonToValue(&snapshot, value, "std::string");


    }


}

bourne::json
VersionManifest_latest::toJson()
{
    bourne::json object = bourne::json::object();





    object["release"] = getRelease();






    object["snapshot"] = getSnapshot();



    return object;

}

std::string
VersionManifest_latest::getRelease()
{
	return release;
}

void
VersionManifest_latest::setRelease(std::string release)
{
	this->release = release;
}

std::string
VersionManifest_latest::getSnapshot()
{
	return snapshot;
}

void
VersionManifest_latest::setSnapshot(std::string snapshot)
{
	this->snapshot = snapshot;
}



