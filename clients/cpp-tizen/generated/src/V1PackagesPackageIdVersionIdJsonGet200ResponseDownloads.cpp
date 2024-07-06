#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "_v1_packages__packageId___versionId__json_get_200_response_downloads.h"

using namespace std;
using namespace Tizen::ArtikCloud;

_v1_packages__packageId___versionId__json_get_200_response_downloads::_v1_packages__packageId___versionId__json_get_200_response_downloads()
{
	//__init();
}

_v1_packages__packageId___versionId__json_get_200_response_downloads::~_v1_packages__packageId___versionId__json_get_200_response_downloads()
{
	//__cleanup();
}

void
_v1_packages__packageId___versionId__json_get_200_response_downloads::__init()
{
	//client = new _v1_packages__packageId___versionId__json_get_200_response_downloads_client();
	//client_mappings = new _v1_packages__packageId___versionId__json_get_200_response_downloads_client();
	//server = new _v1_packages__packageId___versionId__json_get_200_response_downloads_client();
	//server_mappings = new _v1_packages__packageId___versionId__json_get_200_response_downloads_client();
}

void
_v1_packages__packageId___versionId__json_get_200_response_downloads::__cleanup()
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
_v1_packages__packageId___versionId__json_get_200_response_downloads::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *clientKey = "client";
	node = json_object_get_member(pJsonObject, clientKey);
	if (node !=NULL) {
	

		if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_downloads_client")) {
			jsonToValue(&client, node, "_v1_packages__packageId___versionId__json_get_200_response_downloads_client", "_v1_packages__packageId___versionId__json_get_200_response_downloads_client");
		} else {
			
			_v1_packages__packageId___versionId__json_get_200_response_downloads_client* obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_downloads_client*> (&client);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *client_mappingsKey = "client_mappings";
	node = json_object_get_member(pJsonObject, client_mappingsKey);
	if (node !=NULL) {
	

		if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_downloads_client")) {
			jsonToValue(&client_mappings, node, "_v1_packages__packageId___versionId__json_get_200_response_downloads_client", "_v1_packages__packageId___versionId__json_get_200_response_downloads_client");
		} else {
			
			_v1_packages__packageId___versionId__json_get_200_response_downloads_client* obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_downloads_client*> (&client_mappings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serverKey = "server";
	node = json_object_get_member(pJsonObject, serverKey);
	if (node !=NULL) {
	

		if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_downloads_client")) {
			jsonToValue(&server, node, "_v1_packages__packageId___versionId__json_get_200_response_downloads_client", "_v1_packages__packageId___versionId__json_get_200_response_downloads_client");
		} else {
			
			_v1_packages__packageId___versionId__json_get_200_response_downloads_client* obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_downloads_client*> (&server);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *server_mappingsKey = "server_mappings";
	node = json_object_get_member(pJsonObject, server_mappingsKey);
	if (node !=NULL) {
	

		if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_downloads_client")) {
			jsonToValue(&server_mappings, node, "_v1_packages__packageId___versionId__json_get_200_response_downloads_client", "_v1_packages__packageId___versionId__json_get_200_response_downloads_client");
		} else {
			
			_v1_packages__packageId___versionId__json_get_200_response_downloads_client* obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_downloads_client*> (&server_mappings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

_v1_packages__packageId___versionId__json_get_200_response_downloads::_v1_packages__packageId___versionId__json_get_200_response_downloads(char* json)
{
	this->fromJson(json);
}

char*
_v1_packages__packageId___versionId__json_get_200_response_downloads::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_downloads_client")) {
		_v1_packages__packageId___versionId__json_get_200_response_downloads_client obj = getClient();
		node = converttoJson(&obj, "_v1_packages__packageId___versionId__json_get_200_response_downloads_client", "");
	}
	else {
		
		_v1_packages__packageId___versionId__json_get_200_response_downloads_client obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_downloads_client> (getClient());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *clientKey = "client";
	json_object_set_member(pJsonObject, clientKey, node);
	if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_downloads_client")) {
		_v1_packages__packageId___versionId__json_get_200_response_downloads_client obj = getClientMappings();
		node = converttoJson(&obj, "_v1_packages__packageId___versionId__json_get_200_response_downloads_client", "");
	}
	else {
		
		_v1_packages__packageId___versionId__json_get_200_response_downloads_client obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_downloads_client> (getClientMappings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *client_mappingsKey = "client_mappings";
	json_object_set_member(pJsonObject, client_mappingsKey, node);
	if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_downloads_client")) {
		_v1_packages__packageId___versionId__json_get_200_response_downloads_client obj = getServer();
		node = converttoJson(&obj, "_v1_packages__packageId___versionId__json_get_200_response_downloads_client", "");
	}
	else {
		
		_v1_packages__packageId___versionId__json_get_200_response_downloads_client obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_downloads_client> (getServer());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serverKey = "server";
	json_object_set_member(pJsonObject, serverKey, node);
	if (isprimitive("_v1_packages__packageId___versionId__json_get_200_response_downloads_client")) {
		_v1_packages__packageId___versionId__json_get_200_response_downloads_client obj = getServerMappings();
		node = converttoJson(&obj, "_v1_packages__packageId___versionId__json_get_200_response_downloads_client", "");
	}
	else {
		
		_v1_packages__packageId___versionId__json_get_200_response_downloads_client obj = static_cast<_v1_packages__packageId___versionId__json_get_200_response_downloads_client> (getServerMappings());
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

_v1_packages__packageId___versionId__json_get_200_response_downloads_client
_v1_packages__packageId___versionId__json_get_200_response_downloads::getClient()
{
	return client;
}

void
_v1_packages__packageId___versionId__json_get_200_response_downloads::setClient(_v1_packages__packageId___versionId__json_get_200_response_downloads_client  client)
{
	this->client = client;
}

_v1_packages__packageId___versionId__json_get_200_response_downloads_client
_v1_packages__packageId___versionId__json_get_200_response_downloads::getClientMappings()
{
	return client_mappings;
}

void
_v1_packages__packageId___versionId__json_get_200_response_downloads::setClientMappings(_v1_packages__packageId___versionId__json_get_200_response_downloads_client  client_mappings)
{
	this->client_mappings = client_mappings;
}

_v1_packages__packageId___versionId__json_get_200_response_downloads_client
_v1_packages__packageId___versionId__json_get_200_response_downloads::getServer()
{
	return server;
}

void
_v1_packages__packageId___versionId__json_get_200_response_downloads::setServer(_v1_packages__packageId___versionId__json_get_200_response_downloads_client  server)
{
	this->server = server;
}

_v1_packages__packageId___versionId__json_get_200_response_downloads_client
_v1_packages__packageId___versionId__json_get_200_response_downloads::getServerMappings()
{
	return server_mappings;
}

void
_v1_packages__packageId___versionId__json_get_200_response_downloads::setServerMappings(_v1_packages__packageId___versionId__json_get_200_response_downloads_client  server_mappings)
{
	this->server_mappings = server_mappings;
}


