#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "_mc_game_version_manifest_get_200_response_latest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

_mc_game_version_manifest_get_200_response_latest::_mc_game_version_manifest_get_200_response_latest()
{
	//__init();
}

_mc_game_version_manifest_get_200_response_latest::~_mc_game_version_manifest_get_200_response_latest()
{
	//__cleanup();
}

void
_mc_game_version_manifest_get_200_response_latest::__init()
{
	//release = std::string();
	//snapshot = std::string();
}

void
_mc_game_version_manifest_get_200_response_latest::__cleanup()
{
	//if(release != NULL) {
	//
	//delete release;
	//release = NULL;
	//}
	//if(snapshot != NULL) {
	//
	//delete snapshot;
	//snapshot = NULL;
	//}
	//
}

void
_mc_game_version_manifest_get_200_response_latest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *releaseKey = "release";
	node = json_object_get_member(pJsonObject, releaseKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&release, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *snapshotKey = "snapshot";
	node = json_object_get_member(pJsonObject, snapshotKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&snapshot, node, "std::string", "");
		} else {
			
		}
	}
}

_mc_game_version_manifest_get_200_response_latest::_mc_game_version_manifest_get_200_response_latest(char* json)
{
	this->fromJson(json);
}

char*
_mc_game_version_manifest_get_200_response_latest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRelease();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *releaseKey = "release";
	json_object_set_member(pJsonObject, releaseKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSnapshot();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *snapshotKey = "snapshot";
	json_object_set_member(pJsonObject, snapshotKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
_mc_game_version_manifest_get_200_response_latest::getRelease()
{
	return release;
}

void
_mc_game_version_manifest_get_200_response_latest::setRelease(std::string  release)
{
	this->release = release;
}

std::string
_mc_game_version_manifest_get_200_response_latest::getSnapshot()
{
	return snapshot;
}

void
_mc_game_version_manifest_get_200_response_latest::setSnapshot(std::string  snapshot)
{
	this->snapshot = snapshot;
}

