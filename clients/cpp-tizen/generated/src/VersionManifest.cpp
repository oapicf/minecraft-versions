#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VersionManifest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VersionManifest::VersionManifest()
{
	//__init();
}

VersionManifest::~VersionManifest()
{
	//__cleanup();
}

void
VersionManifest::__init()
{
	//latest = new VersionManifest_latest();
	//new std::list()std::list> versions;
}

void
VersionManifest::__cleanup()
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
VersionManifest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *latestKey = "latest";
	node = json_object_get_member(pJsonObject, latestKey);
	if (node !=NULL) {
	

		if (isprimitive("VersionManifest_latest")) {
			jsonToValue(&latest, node, "VersionManifest_latest", "VersionManifest_latest");
		} else {
			
			VersionManifest_latest* obj = static_cast<VersionManifest_latest*> (&latest);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionsKey = "versions";
	node = json_object_get_member(pJsonObject, versionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Version> new_list;
			Version inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Version")) {
					jsonToValue(&inst, temp_json, "Version", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			versions = new_list;
		}
		
	}
}

VersionManifest::VersionManifest(char* json)
{
	this->fromJson(json);
}

char*
VersionManifest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("VersionManifest_latest")) {
		VersionManifest_latest obj = getLatest();
		node = converttoJson(&obj, "VersionManifest_latest", "");
	}
	else {
		
		VersionManifest_latest obj = static_cast<VersionManifest_latest> (getLatest());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *latestKey = "latest";
	json_object_set_member(pJsonObject, latestKey, node);
	if (isprimitive("Version")) {
		list<Version> new_list = static_cast<list <Version> > (getVersions());
		node = converttoJson(&new_list, "Version", "array");
	} else {
		node = json_node_alloc();
		list<Version> new_list = static_cast<list <Version> > (getVersions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Version>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Version obj = *it;
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

VersionManifest_latest
VersionManifest::getLatest()
{
	return latest;
}

void
VersionManifest::setLatest(VersionManifest_latest  latest)
{
	this->latest = latest;
}

std::list<Version>
VersionManifest::getVersions()
{
	return versions;
}

void
VersionManifest::setVersions(std::list <Version> versions)
{
	this->versions = versions;
}


