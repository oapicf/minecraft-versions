/*
 * _v1_packages__packageId___versionId__json_get_200_response_javaVersion.h
 *
 * 
 */

#ifndef __v1_packages__packageId___versionId__json_get_200_response_javaVersion_H_
#define __v1_packages__packageId___versionId__json_get_200_response_javaVersion_H_


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

class _v1_packages__packageId___versionId__json_get_200_response_javaVersion : public Object {
public:
	/*! \brief Constructor.
	 */
	_v1_packages__packageId___versionId__json_get_200_response_javaVersion();
	_v1_packages__packageId___versionId__json_get_200_response_javaVersion(char* str);

	/*! \brief Destructor.
	 */
	virtual ~_v1_packages__packageId___versionId__json_get_200_response_javaVersion();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getComponent();

	/*! \brief Set 
	 */
	void setComponent(std::string  component);
	/*! \brief Get 
	 */
	int getMajorVersion();

	/*! \brief Set 
	 */
	void setMajorVersion(int  majorVersion);

private:
	std::string component;
	int majorVersion;
	void __init();
	void __cleanup();

};
}
}

#endif /* __v1_packages__packageId___versionId__json_get_200_response_javaVersion_H_ */
