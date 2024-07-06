#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "_v1_packages__packageId___versionId__json_get_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

_v1_packages__packageId___versionId__json_get_200_response::_v1_packages__packageId___versionId__json_get_200_response()
{
	//__init();
}

_v1_packages__packageId___versionId__json_get_200_response::~_v1_packages__packageId___versionId__json_get_200_response()
{
	//__cleanup();
}

void
_v1_packages__packageId___versionId__json_get_200_response::__init()
{
	//version = std::string();
	//assetIndex = new _v1_packages__packageId___versionId__json_get_200_response_assetIndex();
	//assets = int(0);
	//complianceLevel = int(0);
	//downloads = new _v1_packages__packageId___versionId__json_get_200_response_downloads();
	//id = std::string();
	//javaVersion = new _v1_packages__packageId___versionId__json_get_200_response_javaVersion();
	//mainClass = std::string();
	//minimumLauncherVersion = int(0);
	//time = null;
	//releaseTime = null;
	//type = std::string();
}

void
_v1_packages__packageId___versionId__json_get_200_response::__cleanup()
{
	//if(version != NULL) {
	//
	//delete version;
	//version = NULL;
	//}
	//if(assetIndex != NULL) {
	//
	//delete assetIndex;
	//assetIndex = NULL;
	//}
	//if(assets != NULL) {
	//
	//delete assets;
	//assets = NULL;
	//}
	//if(complianceLevel != NULL) {
	//
	//delete complianceLevel;
	//complianceLevel = NULL;
	//}
	//if(downloads != NULL) {
	//
	//delete downloads;
	//downloads = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(javaVersion != NULL) {
	//
	//delete javaVersion;
	//javaVersion = NULL;
	//}
	//if(mainClass != NULL) {
	//
	//delete mainClass;
	//mainClass = NULL;
	//}
	//if(minimumLauncherVersion != NULL) {
	//
	//delete minimumLauncherVersion;
	//minimumLauncherVersion = NULL;
	//}
	//if(time != NULL) {
	//
	//delete time;
	//time = NULL;
	//}
	//if(releaseTime != NULL) {
	//
	//delete releaseTime;
	//releaseTime = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
_v1_packages__packageId___versionId__json_get_200_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *versionKey = "version";
	node = json_object_get_member(pJsonObject, versionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&version, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *assetIndexKey = "assetIndex";
	node = json_object_get_member(pJsonObject, assetIndexKey);
	if (node !=NULL) {
	

		if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_assetIndex")) {
			jsonToValue(&assetIndex, node, "_v1_packages__packageId___versionId__json_get_200_response_assetIndex", "_v1_packages__packageId___versionId__json_get_200_response_assetIndex");
		} else {
			
			_v1_packages__packageId___versionId__json_get_200_response_assetIndex* obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_assetIndex*> (&assetIndex);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *assetsKey = "assets";
	node = json_object_get_member(pJsonObject, assetsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&assets, node, "int", "");
		} else {
			
		}
	}
	const gchar *complianceLevelKey = "complianceLevel";
	node = json_object_get_member(pJsonObject, complianceLevelKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&complianceLevel, node, "int", "");
		} else {
			
		}
	}
	const gchar *downloadsKey = "downloads";
	node = json_object_get_member(pJsonObject, downloadsKey);
	if (node !=NULL) {
	

		if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_downloads")) {
			jsonToValue(&downloads, node, "_v1_packages__packageId___versionId__json_get_200_response_downloads", "_v1_packages__packageId___versionId__json_get_200_response_downloads");
		} else {
			
			_v1_packages__packageId___versionId__json_get_200_response_downloads* obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_downloads*> (&downloads);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *javaVersionKey = "javaVersion";
	node = json_object_get_member(pJsonObject, javaVersionKey);
	if (node !=NULL) {
	

		if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_javaVersion")) {
			jsonToValue(&javaVersion, node, "_v1_packages__packageId___versionId__json_get_200_response_javaVersion", "_v1_packages__packageId___versionId__json_get_200_response_javaVersion");
		} else {
			
			_v1_packages__packageId___versionId__json_get_200_response_javaVersion* obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_javaVersion*> (&javaVersion);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mainClassKey = "mainClass";
	node = json_object_get_member(pJsonObject, mainClassKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&mainClass, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *minimumLauncherVersionKey = "minimumLauncherVersion";
	node = json_object_get_member(pJsonObject, minimumLauncherVersionKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&minimumLauncherVersion, node, "int", "");
		} else {
			
		}
	}
	const gchar *timeKey = "time";
	node = json_object_get_member(pJsonObject, timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&time, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *releaseTimeKey = "releaseTime";
	node = json_object_get_member(pJsonObject, releaseTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&releaseTime, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
}

_v1_packages__packageId___versionId__json_get_200_response::_v1_packages__packageId___versionId__json_get_200_response(char* json)
{
	this->fromJson(json);
}

char*
_v1_packages__packageId___versionId__json_get_200_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getVersion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *versionKey = "version";
	json_object_set_member(pJsonObject, versionKey, node);
	if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_assetIndex")) {
		_v1_packages__packageId___versionId__json_get_200_response_assetIndex obj = getAssetIndex();
		node = converttoJson(&obj, "_v1_packages__packageId___versionId__json_get_200_response_assetIndex", "");
	}
	else {
		
		_v1_packages__packageId___versionId__json_get_200_response_assetIndex obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_assetIndex> (getAssetIndex());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *assetIndexKey = "assetIndex";
	json_object_set_member(pJsonObject, assetIndexKey, node);
	if (isprimitive("int")) {
		int obj = getAssets();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *assetsKey = "assets";
	json_object_set_member(pJsonObject, assetsKey, node);
	if (isprimitive("int")) {
		int obj = getComplianceLevel();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *complianceLevelKey = "complianceLevel";
	json_object_set_member(pJsonObject, complianceLevelKey, node);
	if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_downloads")) {
		_v1_packages__packageId___versionId__json_get_200_response_downloads obj = getDownloads();
		node = converttoJson(&obj, "_v1_packages__packageId___versionId__json_get_200_response_downloads", "");
	}
	else {
		
		_v1_packages__packageId___versionId__json_get_200_response_downloads obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_downloads> (getDownloads());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *downloadsKey = "downloads";
	json_object_set_member(pJsonObject, downloadsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_javaVersion")) {
		_v1_packages__packageId___versionId__json_get_200_response_javaVersion obj = getJavaVersion();
		node = converttoJson(&obj, "_v1_packages__packageId___versionId__json_get_200_response_javaVersion", "");
	}
	else {
		
		_v1_packages__packageId___versionId__json_get_200_response_javaVersion obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_javaVersion> (getJavaVersion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *javaVersionKey = "javaVersion";
	json_object_set_member(pJsonObject, javaVersionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMainClass();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *mainClassKey = "mainClass";
	json_object_set_member(pJsonObject, mainClassKey, node);
	if (isprimitive("int")) {
		int obj = getMinimumLauncherVersion();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *minimumLauncherVersionKey = "minimumLauncherVersion";
	json_object_set_member(pJsonObject, minimumLauncherVersionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *timeKey = "time";
	json_object_set_member(pJsonObject, timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getReleaseTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *releaseTimeKey = "releaseTime";
	json_object_set_member(pJsonObject, releaseTimeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
_v1_packages__packageId___versionId__json_get_200_response::getVersion()
{
	return version;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setVersion(std::string  version)
{
	this->version = version;
}

_v1_packages__packageId___versionId__json_get_200_response_assetIndex
_v1_packages__packageId___versionId__json_get_200_response::getAssetIndex()
{
	return assetIndex;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setAssetIndex(_v1_packages__packageId___versionId__json_get_200_response_assetIndex  assetIndex)
{
	this->assetIndex = assetIndex;
}

int
_v1_packages__packageId___versionId__json_get_200_response::getAssets()
{
	return assets;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setAssets(int  assets)
{
	this->assets = assets;
}

int
_v1_packages__packageId___versionId__json_get_200_response::getComplianceLevel()
{
	return complianceLevel;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setComplianceLevel(int  complianceLevel)
{
	this->complianceLevel = complianceLevel;
}

_v1_packages__packageId___versionId__json_get_200_response_downloads
_v1_packages__packageId___versionId__json_get_200_response::getDownloads()
{
	return downloads;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setDownloads(_v1_packages__packageId___versionId__json_get_200_response_downloads  downloads)
{
	this->downloads = downloads;
}

std::string
_v1_packages__packageId___versionId__json_get_200_response::getId()
{
	return id;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setId(std::string  id)
{
	this->id = id;
}

_v1_packages__packageId___versionId__json_get_200_response_javaVersion
_v1_packages__packageId___versionId__json_get_200_response::getJavaVersion()
{
	return javaVersion;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setJavaVersion(_v1_packages__packageId___versionId__json_get_200_response_javaVersion  javaVersion)
{
	this->javaVersion = javaVersion;
}

std::string
_v1_packages__packageId___versionId__json_get_200_response::getMainClass()
{
	return mainClass;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setMainClass(std::string  mainClass)
{
	this->mainClass = mainClass;
}

int
_v1_packages__packageId___versionId__json_get_200_response::getMinimumLauncherVersion()
{
	return minimumLauncherVersion;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setMinimumLauncherVersion(int  minimumLauncherVersion)
{
	this->minimumLauncherVersion = minimumLauncherVersion;
}

std::string
_v1_packages__packageId___versionId__json_get_200_response::getTime()
{
	return time;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setTime(std::string  time)
{
	this->time = time;
}

std::string
_v1_packages__packageId___versionId__json_get_200_response::getReleaseTime()
{
	return releaseTime;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setReleaseTime(std::string  releaseTime)
{
	this->releaseTime = releaseTime;
}

std::string
_v1_packages__packageId___versionId__json_get_200_response::getType()
{
	return type;
}

void
_v1_packages__packageId___versionId__json_get_200_response::setType(std::string  type)
{
	this->type = type;
}


