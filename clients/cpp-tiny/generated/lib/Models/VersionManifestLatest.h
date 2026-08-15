
/*
 * VersionManifest_latest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_VersionManifest_latest_H_
#define TINY_CPP_CLIENT_VersionManifest_latest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VersionManifest_latest{
public:

    /*! \brief Constructor.
	 */
    VersionManifest_latest();
    VersionManifest_latest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VersionManifest_latest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getRelease();

	/*! \brief Set 
	 */
	void setRelease(std::string release);
	/*! \brief Get 
	 */
	std::string getSnapshot();

	/*! \brief Set 
	 */
	void setSnapshot(std::string snapshot);


    private:
    std::string release{};
    std::string snapshot{};
};
}

#endif /* TINY_CPP_CLIENT_VersionManifest_latest_H_ */
