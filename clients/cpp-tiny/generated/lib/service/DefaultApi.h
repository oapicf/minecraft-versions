#ifndef TINY_CPP_CLIENT_DefaultApi_H_
#define TINY_CPP_CLIENT_DefaultApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "VersionManifest.h"
#include "VersionPackageInfo.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class DefaultApi : public Service {
public:
    DefaultApi() = default;

    virtual ~DefaultApi();

    /**
    * Get Minecraft version manifest.
    *
    * 
    */
    Response<
                VersionManifest
        >
    getMinecraftVersionManifest(
    );
    /**
    * Get Minecraft version package info.
    *
    * 
    * \param packageId  *Required*
    * \param versionId  *Required*
    */
    Response<
                VersionPackageInfo
        >
    getMinecraftVersionPackageInfo(
            
            std::string packageId
            , 
            
            std::string versionId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_DefaultApi_H_ */