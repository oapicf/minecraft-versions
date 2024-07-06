#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Version.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Version::Version()
{
	//__init();
}

Version::~Version()
{
	//__cleanup();
}

void
Version::__init()
{
	//id = std::string();
	//type = std::string();
	//url = std::string();
	//time = null;
	//releaseTime = null;
}

void
Version::__cleanup()
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
Version::fromJson(char* jsonStr)
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

Version::Version(char* json)
{
	this->fromJson(json);
}

char*
Version::toJson()
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
Version::getId()
{
	return id;
}

void
Version::setId(std::string  id)
{
	this->id = id;
}

std::string
Version::getType()
{
	return type;
}

void
Version::setType(std::string  type)
{
	this->type = type;
}

std::string
Version::getUrl()
{
	return url;
}

void
Version::setUrl(std::string  url)
{
	this->url = url;
}

std::string
Version::getTime()
{
	return time;
}

void
Version::setTime(std::string  time)
{
	this->time = time;
}

std::string
Version::getReleaseTime()
{
	return releaseTime;
}

void
Version::setReleaseTime(std::string  releaseTime)
{
	this->releaseTime = releaseTime;
}


