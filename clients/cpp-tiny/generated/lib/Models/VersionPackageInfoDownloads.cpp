

#include "VersionPackageInfo_downloads.h"

using namespace Tiny;

VersionPackageInfo_downloads::VersionPackageInfo_downloads()
{
	client = Download();
	client_mappings = Download();
	server = Download();
	server_mappings = Download();
}

VersionPackageInfo_downloads::VersionPackageInfo_downloads(std::string jsonString)
{
	this->fromJson(jsonString);
}

VersionPackageInfo_downloads::~VersionPackageInfo_downloads()
{

}

void
VersionPackageInfo_downloads::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *clientKey = "client";

    if(object.has_key(clientKey))
    {
        bourne::json value = object[clientKey];




        Download* obj = &client;
		obj->fromJson(value.dump());

    }

    const char *client_mappingsKey = "client_mappings";

    if(object.has_key(client_mappingsKey))
    {
        bourne::json value = object[client_mappingsKey];




        Download* obj = &client_mappings;
		obj->fromJson(value.dump());

    }

    const char *serverKey = "server";

    if(object.has_key(serverKey))
    {
        bourne::json value = object[serverKey];




        Download* obj = &server;
		obj->fromJson(value.dump());

    }

    const char *server_mappingsKey = "server_mappings";

    if(object.has_key(server_mappingsKey))
    {
        bourne::json value = object[server_mappingsKey];




        Download* obj = &server_mappings;
		obj->fromJson(value.dump());

    }


}

bourne::json
VersionPackageInfo_downloads::toJson()
{
    bourne::json object = bourne::json::object();






	object["client"] = getClient().toJson();






	object["client_mappings"] = getClientMappings().toJson();






	object["server"] = getServer().toJson();






	object["server_mappings"] = getServerMappings().toJson();


    return object;

}

Download
VersionPackageInfo_downloads::getClient()
{
	return client;
}

void
VersionPackageInfo_downloads::setClient(Download client)
{
	this->client = client;
}

Download
VersionPackageInfo_downloads::getClientMappings()
{
	return client_mappings;
}

void
VersionPackageInfo_downloads::setClientMappings(Download client_mappings)
{
	this->client_mappings = client_mappings;
}

Download
VersionPackageInfo_downloads::getServer()
{
	return server;
}

void
VersionPackageInfo_downloads::setServer(Download server)
{
	this->server = server;
}

Download
VersionPackageInfo_downloads::getServerMappings()
{
	return server_mappings;
}

void
VersionPackageInfo_downloads::setServerMappings(Download server_mappings)
{
	this->server_mappings = server_mappings;
}



