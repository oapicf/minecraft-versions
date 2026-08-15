

#include "VersionPackageInfo.h"

using namespace Tiny;

VersionPackageInfo::VersionPackageInfo()
{
	version = std::string();
	assetIndex = VersionPackageInfo_assetIndex();
	assets = std::string();
	complianceLevel = int(0);
	downloads = VersionPackageInfo_downloads();
	id = std::string();
	javaVersion = VersionPackageInfo_javaVersion();
	mainClass = std::string();
	minimumLauncherVersion = int(0);
	time = std::string();
	releaseTime = std::string();
	type = std::string();
}

VersionPackageInfo::VersionPackageInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

VersionPackageInfo::~VersionPackageInfo()
{

}

void
VersionPackageInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *versionKey = "version";

    if(object.has_key(versionKey))
    {
        bourne::json value = object[versionKey];



        jsonToValue(&version, value, "std::string");


    }

    const char *assetIndexKey = "assetIndex";

    if(object.has_key(assetIndexKey))
    {
        bourne::json value = object[assetIndexKey];




        VersionPackageInfo_assetIndex* obj = &assetIndex;
		obj->fromJson(value.dump());

    }

    const char *assetsKey = "assets";

    if(object.has_key(assetsKey))
    {
        bourne::json value = object[assetsKey];



        jsonToValue(&assets, value, "std::string");


    }

    const char *complianceLevelKey = "complianceLevel";

    if(object.has_key(complianceLevelKey))
    {
        bourne::json value = object[complianceLevelKey];



        jsonToValue(&complianceLevel, value, "int");


    }

    const char *downloadsKey = "downloads";

    if(object.has_key(downloadsKey))
    {
        bourne::json value = object[downloadsKey];




        VersionPackageInfo_downloads* obj = &downloads;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *javaVersionKey = "javaVersion";

    if(object.has_key(javaVersionKey))
    {
        bourne::json value = object[javaVersionKey];




        VersionPackageInfo_javaVersion* obj = &javaVersion;
		obj->fromJson(value.dump());

    }

    const char *mainClassKey = "mainClass";

    if(object.has_key(mainClassKey))
    {
        bourne::json value = object[mainClassKey];



        jsonToValue(&mainClass, value, "std::string");


    }

    const char *minimumLauncherVersionKey = "minimumLauncherVersion";

    if(object.has_key(minimumLauncherVersionKey))
    {
        bourne::json value = object[minimumLauncherVersionKey];



        jsonToValue(&minimumLauncherVersion, value, "int");


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

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
VersionPackageInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["version"] = getVersion();







	object["assetIndex"] = getAssetIndex().toJson();





    object["assets"] = getAssets();






    object["complianceLevel"] = getComplianceLevel();







	object["downloads"] = getDownloads().toJson();





    object["id"] = getId();







	object["javaVersion"] = getJavaVersion().toJson();





    object["mainClass"] = getMainClass();






    object["minimumLauncherVersion"] = getMinimumLauncherVersion();






    object["time"] = getTime();






    object["releaseTime"] = getReleaseTime();






    object["type"] = getType();



    return object;

}

std::string
VersionPackageInfo::getVersion()
{
	return version;
}

void
VersionPackageInfo::setVersion(std::string version)
{
	this->version = version;
}

VersionPackageInfo_assetIndex
VersionPackageInfo::getAssetIndex()
{
	return assetIndex;
}

void
VersionPackageInfo::setAssetIndex(VersionPackageInfo_assetIndex assetIndex)
{
	this->assetIndex = assetIndex;
}

std::string
VersionPackageInfo::getAssets()
{
	return assets;
}

void
VersionPackageInfo::setAssets(std::string assets)
{
	this->assets = assets;
}

int
VersionPackageInfo::getComplianceLevel()
{
	return complianceLevel;
}

void
VersionPackageInfo::setComplianceLevel(int complianceLevel)
{
	this->complianceLevel = complianceLevel;
}

VersionPackageInfo_downloads
VersionPackageInfo::getDownloads()
{
	return downloads;
}

void
VersionPackageInfo::setDownloads(VersionPackageInfo_downloads downloads)
{
	this->downloads = downloads;
}

std::string
VersionPackageInfo::getId()
{
	return id;
}

void
VersionPackageInfo::setId(std::string id)
{
	this->id = id;
}

VersionPackageInfo_javaVersion
VersionPackageInfo::getJavaVersion()
{
	return javaVersion;
}

void
VersionPackageInfo::setJavaVersion(VersionPackageInfo_javaVersion javaVersion)
{
	this->javaVersion = javaVersion;
}

std::string
VersionPackageInfo::getMainClass()
{
	return mainClass;
}

void
VersionPackageInfo::setMainClass(std::string mainClass)
{
	this->mainClass = mainClass;
}

int
VersionPackageInfo::getMinimumLauncherVersion()
{
	return minimumLauncherVersion;
}

void
VersionPackageInfo::setMinimumLauncherVersion(int minimumLauncherVersion)
{
	this->minimumLauncherVersion = minimumLauncherVersion;
}

std::string
VersionPackageInfo::getTime()
{
	return time;
}

void
VersionPackageInfo::setTime(std::string time)
{
	this->time = time;
}

std::string
VersionPackageInfo::getReleaseTime()
{
	return releaseTime;
}

void
VersionPackageInfo::setReleaseTime(std::string releaseTime)
{
	this->releaseTime = releaseTime;
}

std::string
VersionPackageInfo::getType()
{
	return type;
}

void
VersionPackageInfo::setType(std::string type)
{
	this->type = type;
}



