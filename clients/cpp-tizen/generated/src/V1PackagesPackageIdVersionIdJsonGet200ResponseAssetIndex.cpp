#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "_v1_packages__packageId___versionId__json_get_200_response_assetIndex.h"

using namespace std;
using namespace Tizen::ArtikCloud;

_v1_packages__packageId___versionId__json_get_200_response_assetIndex::_v1_packages__packageId___versionId__json_get_200_response_assetIndex()
{
	//__init();
}

_v1_packages__packageId___versionId__json_get_200_response_assetIndex::~_v1_packages__packageId___versionId__json_get_200_response_assetIndex()
{
	//__cleanup();
}

void
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::__init()
{
	//id = std::string();
	//sha1 = std::string();
	//size = int(0);
	//totalSize = int(0);
	//url = std::string();
}

void
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(sha1 != NULL) {
	//
	//delete sha1;
	//sha1 = NULL;
	//}
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//if(totalSize != NULL) {
	//
	//delete totalSize;
	//totalSize = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::fromJson(char* jsonStr)
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
	const gchar *sha1Key = "sha1";
	node = json_object_get_member(pJsonObject, sha1Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sha1, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&size, node, "int", "");
		} else {
			
		}
	}
	const gchar *totalSizeKey = "totalSize";
	node = json_object_get_member(pJsonObject, totalSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&totalSize, node, "int", "");
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
}

_v1_packages__packageId___versionId__json_get_200_response_assetIndex::_v1_packages__packageId___versionId__json_get_200_response_assetIndex(char* json)
{
	this->fromJson(json);
}

char*
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::toJson()
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
		std::string obj = getSha1();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sha1Key = "sha1";
	json_object_set_member(pJsonObject, sha1Key, node);
	if (isprimitive("int")) {
		int obj = getSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	if (isprimitive("int")) {
		int obj = getTotalSize();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *totalSizeKey = "totalSize";
	json_object_set_member(pJsonObject, totalSizeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::getId()
{
	return id;
}

void
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::setId(std::string  id)
{
	this->id = id;
}

std::string
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::getSha1()
{
	return sha1;
}

void
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::setSha1(std::string  sha1)
{
	this->sha1 = sha1;
}

int
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::getSize()
{
	return size;
}

void
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::setSize(int  size)
{
	this->size = size;
}

int
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::getTotalSize()
{
	return totalSize;
}

void
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::setTotalSize(int  totalSize)
{
	this->totalSize = totalSize;
}

std::string
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::getUrl()
{
	return url;
}

void
_v1_packages__packageId___versionId__json_get_200_response_assetIndex::setUrl(std::string  url)
{
	this->url = url;
}


