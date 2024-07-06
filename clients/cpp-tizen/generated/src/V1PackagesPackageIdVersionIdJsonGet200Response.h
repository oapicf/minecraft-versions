/*
 * _v1_packages__packageId___versionId__json_get_200_response.h
 *
 * 
 */

#ifndef __v1_packages__packageId___versionId__json_get_200_response_H_
#define __v1_packages__packageId___versionId__json_get_200_response_H_


#include <string>
#include "_v1_packages__packageId___versionId__json_get_200_response_assetIndex.h"
#include "_v1_packages__packageId___versionId__json_get_200_response_downloads.h"
#include "_v1_packages__packageId___versionId__json_get_200_response_javaVersion.h"
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

class _v1_packages__packageId___versionId__json_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	_v1_packages__packageId___versionId__json_get_200_response();
	_v1_packages__packageId___versionId__json_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~_v1_packages__packageId___versionId__json_get_200_response();

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
	_v1_packages__packageId___versionId__json_get_200_response_assetIndex getAssetIndex();

	/*! \brief Set 
	 */
	void setAssetIndex(_v1_packages__packageId___versionId__json_get_200_response_assetIndex  assetIndex);
	/*! \brief Get 
	 */
	int getAssets();

	/*! \brief Set 
	 */
	void setAssets(int  assets);
	/*! \brief Get 
	 */
	int getComplianceLevel();

	/*! \brief Set 
	 */
	void setComplianceLevel(int  complianceLevel);
	/*! \brief Get 
	 */
	_v1_packages__packageId___versionId__json_get_200_response_downloads getDownloads();

	/*! \brief Set 
	 */
	void setDownloads(_v1_packages__packageId___versionId__json_get_200_response_downloads  downloads);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	_v1_packages__packageId___versionId__json_get_200_response_javaVersion getJavaVersion();

	/*! \brief Set 
	 */
	void setJavaVersion(_v1_packages__packageId___versionId__json_get_200_response_javaVersion  javaVersion);
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
	_v1_packages__packageId___versionId__json_get_200_response_assetIndex assetIndex;
	int assets;
	int complianceLevel;
	_v1_packages__packageId___versionId__json_get_200_response_downloads downloads;
	std::string id;
	_v1_packages__packageId___versionId__json_get_200_response_javaVersion javaVersion;
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

#endif /* __v1_packages__packageId___versionId__json_get_200_response_H_ */
