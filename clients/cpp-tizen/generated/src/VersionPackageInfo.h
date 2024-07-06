/*
 * VersionPackageInfo.h
 *
 * 
 */

#ifndef _VersionPackageInfo_H_
#define _VersionPackageInfo_H_


#include <string>
#include "VersionPackageInfo_assetIndex.h"
#include "VersionPackageInfo_downloads.h"
#include "VersionPackageInfo_javaVersion.h"
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

class VersionPackageInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	VersionPackageInfo();
	VersionPackageInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VersionPackageInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getVersion();

	/*! \brief Set 
	 */
	void setVersion(std::string  version);
	/*! \brief Get 
	 */
	VersionPackageInfo_assetIndex getAssetIndex();

	/*! \brief Set 
	 */
	void setAssetIndex(VersionPackageInfo_assetIndex  assetIndex);
	/*! \brief Get 
	 */
	std::string getAssets();

	/*! \brief Set 
	 */
	void setAssets(std::string  assets);
	/*! \brief Get 
	 */
	int getComplianceLevel();

	/*! \brief Set 
	 */
	void setComplianceLevel(int  complianceLevel);
	/*! \brief Get 
	 */
	VersionPackageInfo_downloads getDownloads();

	/*! \brief Set 
	 */
	void setDownloads(VersionPackageInfo_downloads  downloads);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	VersionPackageInfo_javaVersion getJavaVersion();

	/*! \brief Set 
	 */
	void setJavaVersion(VersionPackageInfo_javaVersion  javaVersion);
	/*! \brief Get 
	 */
	std::string getMainClass();

	/*! \brief Set 
	 */
	void setMainClass(std::string  mainClass);
	/*! \brief Get 
	 */
	int getMinimumLauncherVersion();

	/*! \brief Set 
	 */
	void setMinimumLauncherVersion(int  minimumLauncherVersion);
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
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);

private:
	std::string version;
	VersionPackageInfo_assetIndex assetIndex;
	std::string assets;
	int complianceLevel;
	VersionPackageInfo_downloads downloads;
	std::string id;
	VersionPackageInfo_javaVersion javaVersion;
	std::string mainClass;
	int minimumLauncherVersion;
	std::string time;
	std::string releaseTime;
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VersionPackageInfo_H_ */
