#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Download.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Download::Download()
{
	//__init();
}

Download::~Download()
{
	//__cleanup();
}

void
Download::__init()
{
	//sha1 = std::string();
	//size = int(0);
	//url = std::string();
}

void
Download::__cleanup()
{
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
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
Download::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

Download::Download(char* json)
{
	this->fromJson(json);
}

char*
Download::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
Download::getSha1()
{
	return sha1;
}

void
Download::setSha1(std::string  sha1)
{
	this->sha1 = sha1;
}

int
Download::getSize()
{
	return size;
}

void
Download::setSize(int  size)
{
	this->size = size;
}

std::string
Download::getUrl()
{
	return url;
}

void
Download::setUrl(std::string  url)
{
	this->url = url;
}


