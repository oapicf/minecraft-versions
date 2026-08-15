#include "DefaultApi.h"

using namespace Tiny;



        Response<
            VersionManifest
        >
        DefaultApi::
        getMinecraftVersionManifest(
        )
        {
            std::string url = basepath + "/mc/game/version_manifest.json"; //


            // Headers  | 

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            VersionManifest obj(output_string);


            Response<VersionManifest> response(obj, httpCode);
            return response;
        }

        Response<
            VersionPackageInfo
        >
        DefaultApi::
        getMinecraftVersionPackageInfo(
            
            std::string packageId
            , 
            
            std::string versionId
            
        )
        {
            std::string url = basepath + "/v1/packages/{packageId}/{versionId}.json"; //packageId versionId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_packageId("{");
                s_packageId.append("packageId");
                s_packageId.append("}");

                int pos = url.find(s_packageId);

                url.erase(pos, s_packageId.length());
                url.insert(pos, stringify(packageId));
                std::string s_versionId("{");
                s_versionId.append("versionId");
                s_versionId.append("}");

                int pos = url.find(s_versionId);

                url.erase(pos, s_versionId.length());
                url.insert(pos, stringify(versionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            VersionPackageInfo obj(output_string);


            Response<VersionPackageInfo> response(obj, httpCode);
            return response;
        }



