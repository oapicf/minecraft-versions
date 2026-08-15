
/*
 * VersionManifest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_VersionManifest_H_
#define TINY_CPP_CLIENT_VersionManifest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Version.h"
#include "VersionManifest_latest.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VersionManifest{
public:

    /*! \brief Constructor.
	 */
    VersionManifest();
    VersionManifest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VersionManifest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	VersionManifest_latest getLatest();

	/*! \brief Set 
	 */
	void setLatest(VersionManifest_latest latest);
	/*! \brief Get 
	 */
	std::list<Version> getVersions();

	/*! \brief Set 
	 */
	void setVersions(std::list<Version> versions);


    private:
    VersionManifest_latest latest;
    std::list<Version> versions;
};
}

#endif /* TINY_CPP_CLIENT_VersionManifest_H_ */
