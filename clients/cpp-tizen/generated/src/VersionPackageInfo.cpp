#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VersionPackageInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VersionPackageInfo::VersionPackageInfo()
{
	//__init();
}

VersionPackageInfo::~VersionPackageInfo()
{
	//__cleanup();
}

void
VersionPackageInfo::__init()
{
	//version = std::string();
	//assetIndex = new VersionPackageInfo_assetIndex();
	//assets = std::string();
	//complianceLevel = int(0);
	//downloads = new VersionPackageInfo_downloads();
	//id = std::string();
	//javaVersion = new VersionPackageInfo_javaVersion();
	//mainClass = std::string();
	//minimumLauncherVersion = int(0);
	//time = null;
	//releaseTime = null;
	//type = std::string();
}

void
VersionPackageInfo::__cleanup()
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
VersionPackageInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("VersionPackageInfo_assetIndex")) {
			jsonToValue(&assetIndex, node, "VersionPackageInfo_assetIndex", "VersionPackageInfo_assetIndex");
		} else {
			
			VersionPackageInfo_assetIndex* obj = static_cast<VersionPackageInfo_assetIndex*> (&assetIndex);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *assetsKey = "assets";
	node = json_object_get_member(pJsonObject, assetsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&assets, node, "std::string", "");
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
	

		if (isprimitive("VersionPackageInfo_downloads")) {
			jsonToValue(&downloads, node, "VersionPackageInfo_downloads", "VersionPackageInfo_downloads");
		} else {
			
			VersionPackageInfo_downloads* obj = static_cast<VersionPackageInfo_downloads*> (&downloads);
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
	

		if (isprimitive("VersionPackageInfo_javaVersion")) {
			jsonToValue(&javaVersion, node, "VersionPackageInfo_javaVersion", "VersionPackageInfo_javaVersion");
		} else {
			
			VersionPackageInfo_javaVersion* obj = static_cast<VersionPackageInfo_javaVersion*> (&javaVersion);
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

VersionPackageInfo::VersionPackageInfo(char* json)
{
	this->fromJson(json);
}

char*
VersionPackageInfo::toJson()
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
	if (isprimitive("VersionPackageInfo_assetIndex")) {
		VersionPackageInfo_assetIndex obj = getAssetIndex();
		node = converttoJson(&obj, "VersionPackageInfo_assetIndex", "");
	}
	else {
		
		VersionPackageInfo_assetIndex obj = static_cast<VersionPackageInfo_assetIndex> (getAssetIndex());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *assetIndexKey = "assetIndex";
	json_object_set_member(pJsonObject, assetIndexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAssets();
		node = converttoJson(&obj, "std::string", "");
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
	if (isprimitive("VersionPackageInfo_downloads")) {
		VersionPackageInfo_downloads obj = getDownloads();
		node = converttoJson(&obj, "VersionPackageInfo_downloads", "");
	}
	else {
		
		VersionPackageInfo_downloads obj = static_cast<VersionPackageInfo_downloads> (getDownloads());
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
	if (isprimitive("VersionPackageInfo_javaVersion")) {
		VersionPackageInfo_javaVersion obj = getJavaVersion();
		node = converttoJson(&obj, "VersionPackageInfo_javaVersion", "");
	}
	else {
		
		VersionPackageInfo_javaVersion obj = static_cast<VersionPackageInfo_javaVersion> (getJavaVersion());
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
VersionPackageInfo::getVersion()
{
	return version;
}

void
VersionPackageInfo::setVersion(std::string  version)
{
	this->version = version;
}

VersionPackageInfo_assetIndex
VersionPackageInfo::getAssetIndex()
{
	return assetIndex;
}

void
VersionPackageInfo::setAssetIndex(VersionPackageInfo_assetIndex  assetIndex)
{
	this->assetIndex = assetIndex;
}

std::string
VersionPackageInfo::getAssets()
{
	return assets;
}

void
VersionPackageInfo::setAssets(std::string  assets)
{
	this->assets = assets;
}

int
VersionPackageInfo::getComplianceLevel()
{
	return complianceLevel;
}

void
VersionPackageInfo::setComplianceLevel(int  complianceLevel)
{
	this->complianceLevel = complianceLevel;
}

VersionPackageInfo_downloads
VersionPackageInfo::getDownloads()
{
	return downloads;
}

void
VersionPackageInfo::setDownloads(VersionPackageInfo_downloads  downloads)
{
	this->downloads = downloads;
}

std::string
VersionPackageInfo::getId()
{
	return id;
}

void
VersionPackageInfo::setId(std::string  id)
{
	this->id = id;
}

VersionPackageInfo_javaVersion
VersionPackageInfo::getJavaVersion()
{
	return javaVersion;
}

void
VersionPackageInfo::setJavaVersion(VersionPackageInfo_javaVersion  javaVersion)
{
	this->javaVersion = javaVersion;
}

std::string
VersionPackageInfo::getMainClass()
{
	return mainClass;
}

void
VersionPackageInfo::setMainClass(std::string  mainClass)
{
	this->mainClass = mainClass;
}

int
VersionPackageInfo::getMinimumLauncherVersion()
{
	return minimumLauncherVersion;
}

void
VersionPackageInfo::setMinimumLauncherVersion(int  minimumLauncherVersion)
{
	this->minimumLauncherVersion = minimumLauncherVersion;
}

std::string
VersionPackageInfo::getTime()
{
	return time;
}

void
VersionPackageInfo::setTime(std::string  time)
{
	this->time = time;
}

std::string
VersionPackageInfo::getReleaseTime()
{
	return releaseTime;
}

void
VersionPackageInfo::setReleaseTime(std::string  releaseTime)
{
	this->releaseTime = releaseTime;
}

std::string
VersionPackageInfo::getType()
{
	return type;
}

void
VersionPackageInfo::setType(std::string  type)
{
	this->type = type;
}


