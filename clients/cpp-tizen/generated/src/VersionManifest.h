/*
 * VersionManifest.h
 *
 * 
 */

#ifndef _VersionManifest_H_
#define _VersionManifest_H_


#include <string>
#include "Version.h"
#include "VersionManifest_latest.h"
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

class VersionManifest : public Object {
public:
	/*! \brief Constructor.
	 */
	VersionManifest();
	VersionManifest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VersionManifest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	VersionManifest_latest getLatest();

	/*! \brief Set 
	 */
	void setLatest(VersionManifest_latest  latest);
	/*! \brief Get 
	 */
	std::list<Version> getVersions();

	/*! \brief Set 
	 */
	void setVersions(std::list <Version> versions);

private:
	VersionManifest_latest latest;
	std::list <Version>versions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VersionManifest_H_ */
