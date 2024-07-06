/*
 * VersionManifest_latest.h
 *
 * 
 */

#ifndef _VersionManifest_latest_H_
#define _VersionManifest_latest_H_


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

class VersionManifest_latest : public Object {
public:
	/*! \brief Constructor.
	 */
	VersionManifest_latest();
	VersionManifest_latest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VersionManifest_latest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getRelease();

	/*! \brief Set 
	 */
	void setRelease(std::string  release);
	/*! \brief Get 
	 */
	std::string getSnapshot();

	/*! \brief Set 
	 */
	void setSnapshot(std::string  snapshot);

private:
	std::string release;
	std::string snapshot;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VersionManifest_latest_H_ */
