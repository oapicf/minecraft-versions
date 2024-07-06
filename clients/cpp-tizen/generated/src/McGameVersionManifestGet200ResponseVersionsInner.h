/*
 * _mc_game_version_manifest_get_200_response_versions_inner.h
 *
 * 
 */

#ifndef __mc_game_version_manifest_get_200_response_versions_inner_H_
#define __mc_game_version_manifest_get_200_response_versions_inner_H_


#include <string>
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

class _mc_game_version_manifest_get_200_response_versions_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	_mc_game_version_manifest_get_200_response_versions_inner();
	_mc_game_version_manifest_get_200_response_versions_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~_mc_game_version_manifest_get_200_response_versions_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);
	/*! \brief Get 
	 */
	std::string getTime();

	/*! \brief Set 
	 */
	void setTime(std::string  time);
	/*! \brief Get 
	 */
	std::string getReleaseTime();

	/*! \brief Set 
	 */
	void setReleaseTime(std::string  releaseTime);

private:
	std::string id;
	std::string type;
	std::string url;
	std::string time;
	std::string releaseTime;
	void __init();
	void __cleanup();

};
}
}

#endif /* __mc_game_version_manifest_get_200_response_versions_inner_H_ */
