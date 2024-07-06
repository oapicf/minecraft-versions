#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VersionPackageInfo_downloads.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VersionPackageInfo_downloads::VersionPackageInfo_downloads()
{
	//__init();
}

VersionPackageInfo_downloads::~VersionPackageInfo_downloads()
{
	//__cleanup();
}

void
VersionPackageInfo_downloads::__init()
{
	//client = new Download();
	//client_mappings = new Download();
	//server = new Download();
	//server_mappings = new Download();
}

void
VersionPackageInfo_downloads::__cleanup()
{
	//if(client != NULL) {
	//
	//delete client;
	//client = NULL;
	//}
	//if(client_mappings != NULL) {
	//
	//delete client_mappings;
	//client_mappings = NULL;
	//}
	//if(server != NULL) {
	//
	//delete server;
	//server = NULL;
	//}
	//if(server_mappings != NULL) {
	//
	//delete server_mappings;
	//server_mappings = NULL;
	//}
	//
}

void
VersionPackageInfo_downloads::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *clientKey = "client";
	node = json_object_get_member(pJsonObject, clientKey);
	if (node !=NULL) {
	

		if (isprimitive("Download")) {
			jsonToValue(&client, node, "Download", "Download");
		} else {
			
			Download* obj = static_cast<Download*> (&client);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *client_mappingsKey = "client_mappings";
	node = json_object_get_member(pJsonObject, client_mappingsKey);
	if (node !=NULL) {
	

		if (isprimitive("Download")) {
			jsonToValue(&client_mappings, node, "Download", "Download");
		} else {
			
			Download* obj = static_cast<Download*> (&client_mappings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serverKey = "server";
	node = json_object_get_member(pJsonObject, serverKey);
	if (node !=NULL) {
	

		if (isprimitive("Download")) {
			jsonToValue(&server, node, "Download", "Download");
		} else {
			
			Download* obj = static_cast<Download*> (&server);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *server_mappingsKey = "server_mappings";
	node = json_object_get_member(pJsonObject, server_mappingsKey);
	if (node !=NULL) {
	

		if (isprimitive("Download")) {
			jsonToValue(&server_mappings, node, "Download", "Download");
		} else {
			
			Download* obj = static_cast<Download*> (&server_mappings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

VersionPackageInfo_downloads::VersionPackageInfo_downloads(char* json)
{
	this->fromJson(json);
}

char*
VersionPackageInfo_downloads::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Download")) {
		Download obj = getClient();
		node = converttoJson(&obj, "Download", "");
	}
	else {
		
		Download obj = static_cast<Download> (getClient());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *clientKey = "client";
	json_object_set_member(pJsonObject, clientKey, node);
	if (isprimitive("Download")) {
		Download obj = getClientMappings();
		node = converttoJson(&obj, "Download", "");
	}
	else {
		
		Download obj = static_cast<Download> (getClientMappings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *client_mappingsKey = "client_mappings";
	json_object_set_member(pJsonObject, client_mappingsKey, node);
	if (isprimitive("Download")) {
		Download obj = getServer();
		node = converttoJson(&obj, "Download", "");
	}
	else {
		
		Download obj = static_cast<Download> (getServer());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serverKey = "server";
	json_object_set_member(pJsonObject, serverKey, node);
	if (isprimitive("Download")) {
		Download obj = getServerMappings();
		node = converttoJson(&obj, "Download", "");
	}
	else {
		
		Download obj = static_cast<Download> (getServerMappings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *server_mappingsKey = "server_mappings";
	json_object_set_member(pJsonObject, server_mappingsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Download
VersionPackageInfo_downloads::getClient()
{
	return client;
}

void
VersionPackageInfo_downloads::setClient(Download  client)
{
	this->client = client;
}

Download
VersionPackageInfo_downloads::getClientMappings()
{
	return client_mappings;
}

void
VersionPackageInfo_downloads::setClientMappings(Download  client_mappings)
{
	this->client_mappings = client_mappings;
}

Download
VersionPackageInfo_downloads::getServer()
{
	return server;
}

void
VersionPackageInfo_downloads::setServer(Download  server)
{
	this->server = server;
}

Download
VersionPackageInfo_downloads::getServerMappings()
{
	return server_mappings;
}

void
VersionPackageInfo_downloads::setServerMappings(Download  server_mappings)
{
	this->server_mappings = server_mappings;
}


