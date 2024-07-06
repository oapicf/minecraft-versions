#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "DefaultManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


DefaultManager::DefaultManager()
{

}

DefaultManager::~DefaultManager()
{

}

static gboolean __DefaultManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __DefaultManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__DefaultManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getMinecraftVersionManifestProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VersionManifest, Error, void* )
	= reinterpret_cast<void(*)(VersionManifest, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VersionManifest out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VersionManifest")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VersionManifest", "VersionManifest");
			json_node_free(pJson);

			if ("VersionManifest" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getMinecraftVersionManifestHelper(char * accessToken,
	
	void(* handler)(VersionManifest, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/mc/game/version_manifest.json");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getMinecraftVersionManifestProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getMinecraftVersionManifestProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DefaultManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DefaultManager::getMinecraftVersionManifestAsync(char * accessToken,
	
	void(* handler)(VersionManifest, Error, void* )
	, void* userData)
{
	return getMinecraftVersionManifestHelper(accessToken,
	
	handler, userData, true);
}

bool DefaultManager::getMinecraftVersionManifestSync(char * accessToken,
	
	void(* handler)(VersionManifest, Error, void* )
	, void* userData)
{
	return getMinecraftVersionManifestHelper(accessToken,
	
	handler, userData, false);
}

static bool getMinecraftVersionPackageInfoProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VersionPackageInfo, Error, void* )
	= reinterpret_cast<void(*)(VersionPackageInfo, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VersionPackageInfo out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VersionPackageInfo")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VersionPackageInfo", "VersionPackageInfo");
			json_node_free(pJson);

			if ("VersionPackageInfo" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getMinecraftVersionPackageInfoHelper(char * accessToken,
	std::string packageId, std::string versionId, 
	void(* handler)(VersionPackageInfo, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/v1/packages/{packageId}/{versionId}.json");
	int pos;

	string s_packageId("{");
	s_packageId.append("packageId");
	s_packageId.append("}");
	pos = url.find(s_packageId);
	url.erase(pos, s_packageId.length());
	url.insert(pos, stringify(&packageId, "std::string"));
	string s_versionId("{");
	s_versionId.append("versionId");
	s_versionId.append("}");
	pos = url.find(s_versionId);
	url.erase(pos, s_versionId.length());
	url.insert(pos, stringify(&versionId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getMinecraftVersionPackageInfoProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getMinecraftVersionPackageInfoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DefaultManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DefaultManager::getMinecraftVersionPackageInfoAsync(char * accessToken,
	std::string packageId, std::string versionId, 
	void(* handler)(VersionPackageInfo, Error, void* )
	, void* userData)
{
	return getMinecraftVersionPackageInfoHelper(accessToken,
	packageId, versionId, 
	handler, userData, true);
}

bool DefaultManager::getMinecraftVersionPackageInfoSync(char * accessToken,
	std::string packageId, std::string versionId, 
	void(* handler)(VersionPackageInfo, Error, void* )
	, void* userData)
{
	return getMinecraftVersionPackageInfoHelper(accessToken,
	packageId, versionId, 
	handler, userData, false);
}

