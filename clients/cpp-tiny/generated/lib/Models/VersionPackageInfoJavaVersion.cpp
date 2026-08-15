

#include "VersionPackageInfo_javaVersion.h"

using namespace Tiny;

VersionPackageInfo_javaVersion::VersionPackageInfo_javaVersion()
{
	component = std::string();
	majorVersion = int(0);
}

VersionPackageInfo_javaVersion::VersionPackageInfo_javaVersion(std::string jsonString)
{
	this->fromJson(jsonString);
}

VersionPackageInfo_javaVersion::~VersionPackageInfo_javaVersion()
{

}

void
VersionPackageInfo_javaVersion::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *componentKey = "component";

    if(object.has_key(componentKey))
    {
        bourne::json value = object[componentKey];



        jsonToValue(&component, value, "std::string");


    }

    const char *majorVersionKey = "majorVersion";

    if(object.has_key(majorVersionKey))
    {
        bourne::json value = object[majorVersionKey];



        jsonToValue(&majorVersion, value, "int");


    }


}

bourne::json
VersionPackageInfo_javaVersion::toJson()
{
    bourne::json object = bourne::json::object();





    object["component"] = getComponent();






    object["majorVersion"] = getMajorVersion();



    return object;

}

std::string
VersionPackageInfo_javaVersion::getComponent()
{
	return component;
}

void
VersionPackageInfo_javaVersion::setComponent(std::string component)
{
	this->component = component;
}

int
VersionPackageInfo_javaVersion::getMajorVersion()
{
	return majorVersion;
}

void
VersionPackageInfo_javaVersion::setMajorVersion(int majorVersion)
{
	this->majorVersion = majorVersion;
}



