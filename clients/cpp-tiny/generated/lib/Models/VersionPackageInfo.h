
/*
 * VersionPackageInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_VersionPackageInfo_H_
#define TINY_CPP_CLIENT_VersionPackageInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "VersionPackageInfo_assetIndex.h"
#include "VersionPackageInfo_downloads.h"
#include "VersionPackageInfo_javaVersion.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VersionPackageInfo{
public:

    /*! \brief Constructor.
	 */
    VersionPackageInfo();
    VersionPackageInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VersionPackageInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getVersion();

	/*! \brief Set 
	 */
	void setVersion(std::string version);
	/*! \brief Get 
	 */
	VersionPackageInfo_assetIndex getAssetIndex();

	/*! \brief Set 
	 */
	void setAssetIndex(VersionPackageInfo_assetIndex assetIndex);
	/*! \brief Get 
	 */
	std::string getAssets();

	/*! \brief Set 
	 */
	void setAssets(std::string assets);
	/*! \brief Get 
	 */
	int getComplianceLevel();

	/*! \brief Set 
	 */
	void setComplianceLevel(int complianceLevel);
	/*! \brief Get 
	 */
	VersionPackageInfo_downloads getDownloads();

	/*! \brief Set 
	 */
	void setDownloads(VersionPackageInfo_downloads downloads);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string id);
	/*! \brief Get 
	 */
	VersionPackageInfo_javaVersion getJavaVersion();

	/*! \brief Set 
	 */
	void setJavaVersion(VersionPackageInfo_javaVersion javaVersion);
	/*! \brief Get 
	 */
	std::string getMainClass();

	/*! \brief Set 
	 */
	void setMainClass(std::string mainClass);
	/*! \brief Get 
	 */
	int getMinimumLauncherVersion();

	/*! \brief Set 
	 */
	void setMinimumLauncherVersion(int minimumLauncherVersion);
	/*! \brief Get 
	 */
	std::string getTime();

	/*! \brief Set 
	 */
	void setTime(std::string time);
	/*! \brief Get 
	 */
	std::string getReleaseTime();

	/*! \brief Set 
	 */
	void setReleaseTime(std::string releaseTime);
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string type);


    private:
    std::string version{};
    VersionPackageInfo_assetIndex assetIndex;
    std::string assets{};
    int complianceLevel{};
    VersionPackageInfo_downloads downloads;
    std::string id{};
    VersionPackageInfo_javaVersion javaVersion;
    std::string mainClass{};
    int minimumLauncherVersion{};
    std::string time{};
    std::string releaseTime{};
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_VersionPackageInfo_H_ */
