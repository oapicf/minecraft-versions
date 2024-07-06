#ifndef _DefaultManager_H_
#define _DefaultManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "_mc_game_version_manifest_get_200_response.h"
#include "_v1_packages__packageId___versionId__json_get_200_response.h"
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
bool mcGameVersionManifestGetSync(char * accessToken,
	
	void(* handler)(_mc_game_version_manifest_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get Minecraft version manifest. *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool mcGameVersionManifestGetAsync(char * accessToken,
	
	void(* handler)(_mc_game_version_manifest_get_200_response, Error, void* )
	, void* userData);


/*! \brief Get Minecraft version package details. *Synchronous*
 *
 * 
 * \param packageId  *Required*
 * \param versionId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1PackagesPackageIdVersionIdJsonGetSync(char * accessToken,
	std::string packageId, std::string versionId, 
	void(* handler)(_v1_packages__packageId___versionId__json_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get Minecraft version package details. *Asynchronous*
 *
 * 
 * \param packageId  *Required*
 * \param versionId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool v1PackagesPackageIdVersionIdJsonGetAsync(char * accessToken,
	std::string packageId, std::string versionId, 
	void(* handler)(_v1_packages__packageId___versionId__json_get_200_response, Error, void* )
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
