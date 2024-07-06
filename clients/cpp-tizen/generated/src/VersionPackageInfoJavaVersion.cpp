#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VersionPackageInfo_javaVersion.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VersionPackageInfo_javaVersion::VersionPackageInfo_javaVersion()
{
	//__init();
}

VersionPackageInfo_javaVersion::~VersionPackageInfo_javaVersion()
{
	//__cleanup();
}

void
VersionPackageInfo_javaVersion::__init()
{
	//component = std::string();
	//majorVersion = int(0);
}

void
VersionPackageInfo_javaVersion::__cleanup()
{
	//if(component != NULL) {
	//
	//delete component;
	//component = NULL;
	//}
	//if(majorVersion != NULL) {
	//
	//delete majorVersion;
	//majorVersion = NULL;
	//}
	//
}

void
VersionPackageInfo_javaVersion::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *componentKey = "component";
	node = json_object_get_member(pJsonObject, componentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&component, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *majorVersionKey = "majorVersion";
	node = json_object_get_member(pJsonObject, majorVersionKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&majorVersion, node, "int", "");
		} else {
			
		}
	}
}

VersionPackageInfo_javaVersion::VersionPackageInfo_javaVersion(char* json)
{
	this->fromJson(json);
}

char*
VersionPackageInfo_javaVersion::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getComponent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *componentKey = "component";
	json_object_set_member(pJsonObject, componentKey, node);
	if (isprimitive("int")) {
		int obj = getMajorVersion();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *majorVersionKey = "majorVersion";
	json_object_set_member(pJsonObject, majorVersionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
VersionPackageInfo_javaVersion::getComponent()
{
	return component;
}

void
VersionPackageInfo_javaVersion::setComponent(std::string  component)
{
	this->component = component;
}

int
VersionPackageInfo_javaVersion::getMajorVersion()
{
	return majorVersion;
}

void
VersionPackageInfo_javaVersion::setMajorVersion(int  majorVersion)
{
	this->majorVersion = majorVersion;
}


