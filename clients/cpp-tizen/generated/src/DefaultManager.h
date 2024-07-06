#ifndef _DefaultManager_H_
#define _DefaultManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "VersionManifest.h"
#include "VersionPackageInfo.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Default Default
 * \ingroup Operations
 *  @{
 */
class DefaultManager {
public:
	DefaultManager();
	virtual ~DefaultManager();

/*! \brief Get Minecraft version manifest. *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getMinecraftVersionManifestSync(char * accessToken,
	
	void(* handler)(VersionManifest, Error, void* )
	, void* userData);

/*! \brief Get Minecraft version manifest. *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getMinecraftVersionManifestAsync(char * accessToken,
	
	void(* handler)(VersionManifest, Error, void* )
	, void* userData);


/*! \brief Get Minecraft version package info. *Synchronous*
 *
 * 
 * \param packageId  *Required*
 * \param versionId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getMinecraftVersionPackageInfoSync(char * accessToken,
	std::string packageId, std::string versionId, 
	void(* handler)(VersionPackageInfo, Error, void* )
	, void* userData);

/*! \brief Get Minecraft version package info. *Asynchronous*
 *
 * 
 * \param packageId  *Required*
 * \param versionId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getMinecraftVersionPackageInfoAsync(char * accessToken,
	std::string packageId, std::string versionId, 
	void(* handler)(VersionPackageInfo, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://launchermeta.mojang.com";
	}
};
/** @}*/

}
}
#endif /* DefaultManager_H_ */
