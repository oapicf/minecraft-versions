#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "_mc_game_version_manifest_get_200_response_versions_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

_mc_game_version_manifest_get_200_response_versions_inner::_mc_game_version_manifest_get_200_response_versions_inner()
{
	//__init();
}

_mc_game_version_manifest_get_200_response_versions_inner::~_mc_game_version_manifest_get_200_response_versions_inner()
{
	//__cleanup();
}

void
_mc_game_version_manifest_get_200_response_versions_inner::__init()
{
	//id = std::string();
	//type = std::string();
	//url = std::string();
	//time = null;
	//releaseTime = null;
}

void
_mc_game_version_manifest_get_200_response_versions_inner::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
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
	//
}

void
_mc_game_version_manifest_get_200_response_versions_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
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
}

_mc_game_version_manifest_get_200_response_versions_inner::_mc_game_version_manifest_get_200_response_versions_inner(char* json)
{
	this->fromJson(json);
}

char*
_mc_game_version_manifest_get_200_response_versions_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
_mc_game_version_manifest_get_200_response_versions_inner::getId()
{
	return id;
}

void
_mc_game_version_manifest_get_200_response_versions_inner::setId(std::string  id)
{
	this->id = id;
}

std::string
_mc_game_version_manifest_get_200_response_versions_inner::getType()
{
	return type;
}

void
_mc_game_version_manifest_get_200_response_versions_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
_mc_game_version_manifest_get_200_response_versions_inner::getUrl()
{
	return url;
}

void
_mc_game_version_manifest_get_200_response_versions_inner::setUrl(std::string  url)
{
	this->url = url;
}

std::string
_mc_game_version_manifest_get_200_response_versions_inner::getTime()
{
	return time;
}

void
_mc_game_version_manifest_get_200_response_versions_inner::setTime(std::string  time)
{
	this->time = time;
}

std::string
_mc_game_version_manifest_get_200_response_versions_inner::getReleaseTime()
{
	return releaseTime;
}

void
_mc_game_version_manifest_get_200_response_versions_inner::setReleaseTime(std::string  releaseTime)
{
	this->releaseTime = releaseTime;
}


