#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "_mc_game_version_manifest_get_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

_mc_game_version_manifest_get_200_response::_mc_game_version_manifest_get_200_response()
{
	//__init();
}

_mc_game_version_manifest_get_200_response::~_mc_game_version_manifest_get_200_response()
{
	//__cleanup();
}

void
_mc_game_version_manifest_get_200_response::__init()
{
	//latest = new _mc_game_version_manifest_get_200_response_latest();
	//new std::list()std::list> versions;
}

void
_mc_game_version_manifest_get_200_response::__cleanup()
{
	//if(latest != NULL) {
	//
	//delete latest;
	//latest = NULL;
	//}
	//if(versions != NULL) {
	//versions.RemoveAll(true);
	//delete versions;
	//versions = NULL;
	//}
	//
}

void
_mc_game_version_manifest_get_200_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *latestKey = "latest";
	node = json_object_get_member(pJsonObject, latestKey);
	if (node !=NULL) {
	

		if (isprimitive("_mc_game_version_manifest_get_200_response_latest")) {
			jsonToValue(&latest, node, "_mc_game_version_manifest_get_200_response_latest", "_mc_game_version_manifest_get_200_response_latest");
		} else {
			
			_mc_game_version_manifest_get_200_response_latest* obj = static_cast<_mc_game_version_manifest_get_200_response_latest*> (&latest);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionsKey = "versions";
	node = json_object_get_member(pJsonObject, versionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<_mc_game_version_manifest_get_200_response_versions_inner> new_list;
			_mc_game_version_manifest_get_200_response_versions_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("_mc_game_version_manifest_get_200_response_versions_inner")) {
					jsonToValue(&inst, temp_json, "_mc_game_version_manifest_get_200_response_versions_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			versions = new_list;
		}
		
	}
}

_mc_game_version_manifest_get_200_response::_mc_game_version_manifest_get_200_response(char* json)
{
	this->fromJson(json);
}

char*
_mc_game_version_manifest_get_200_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("_mc_game_version_manifest_get_200_response_latest")) {
		_mc_game_version_manifest_get_200_response_latest obj = getLatest();
		node = converttoJson(&obj, "_mc_game_version_manifest_get_200_response_latest", "");
	}
	else {
		
		_mc_game_version_manifest_get_200_response_latest obj = static_cast<_mc_game_version_manifest_get_200_response_latest> (getLatest());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *latestKey = "latest";
	json_object_set_member(pJsonObject, latestKey, node);
	if (isprimitive("_mc_game_version_manifest_get_200_response_versions_inner")) {
		list<_mc_game_version_manifest_get_200_response_versions_inner> new_list = static_cast<list <_mc_game_version_manifest_get_200_response_versions_inner> > (getVersions());
		node = converttoJson(&new_list, "_mc_game_version_manifest_get_200_response_versions_inner", "array");
	} else {
		node = json_node_alloc();
		list<_mc_game_version_manifest_get_200_response_versions_inner> new_list = static_cast<list <_mc_game_version_manifest_get_200_response_versions_inner> > (getVersions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<_mc_game_version_manifest_get_200_response_versions_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			_mc_game_version_manifest_get_200_response_versions_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *versionsKey = "versions";
	json_object_set_member(pJsonObject, versionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

_mc_game_version_manifest_get_200_response_latest
_mc_game_version_manifest_get_200_response::getLatest()
{
	return latest;
}

void
_mc_game_version_manifest_get_200_response::setLatest(_mc_game_version_manifest_get_200_response_latest  latest)
{
	this->latest = latest;
}

std::list<_mc_game_version_manifest_get_200_response_versions_inner>
_mc_game_version_manifest_get_200_response::getVersions()
{
	return versions;
}

void
_mc_game_version_manifest_get_200_response::setVersions(std::list <_mc_game_version_manifest_get_200_response_versions_inner> versions)
{
	this->versions = versions;
}


