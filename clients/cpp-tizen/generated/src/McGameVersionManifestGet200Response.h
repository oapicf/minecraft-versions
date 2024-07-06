/*
 * _mc_game_version_manifest_get_200_response.h
 *
 * 
 */

#ifndef __mc_game_version_manifest_get_200_response_H_
#define __mc_game_version_manifest_get_200_response_H_


#include <string>
#include "_mc_game_version_manifest_get_200_response_latest.h"
#include "_mc_game_version_manifest_get_200_response_versions_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class _mc_game_version_manifest_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	_mc_game_version_manifest_get_200_response();
	_mc_game_version_manifest_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~_mc_game_version_manifest_get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	_mc_game_version_manifest_get_200_response_latest getLatest();

	/*! \brief Set 
	 */
	void setLatest(_mc_game_version_manifest_get_200_response_latest  latest);
	/*! \brief Get 
	 */
	std::list<_mc_game_version_manifest_get_200_response_versions_inner> getVersions();

	/*! \brief Set 
	 */
	void setVersions(std::list <_mc_game_version_manifest_get_200_response_versions_inner> versions);

private:
	_mc_game_version_manifest_get_200_response_latest latest;
	std::list <_mc_game_version_manifest_get_200_response_versions_inner>versions;
	void __init();
	void __cleanup();

};
}
}

#endif /* __mc_game_version_manifest_get_200_response_H_ */
