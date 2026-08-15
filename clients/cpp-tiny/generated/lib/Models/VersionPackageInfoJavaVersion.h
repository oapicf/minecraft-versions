
/*
 * VersionPackageInfo_javaVersion.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_VersionPackageInfo_javaVersion_H_
#define TINY_CPP_CLIENT_VersionPackageInfo_javaVersion_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VersionPackageInfo_javaVersion{
public:

    /*! \brief Constructor.
	 */
    VersionPackageInfo_javaVersion();
    VersionPackageInfo_javaVersion(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VersionPackageInfo_javaVersion();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getComponent();

	/*! \brief Set 
	 */
	void setComponent(std::string component);
	/*! \brief Get 
	 */
	int getMajorVersion();

	/*! \brief Set 
	 */
	void setMajorVersion(int majorVersion);


    private:
    std::string component{};
    int majorVersion{};
};
}

#endif /* TINY_CPP_CLIENT_VersionPackageInfo_javaVersion_H_ */
