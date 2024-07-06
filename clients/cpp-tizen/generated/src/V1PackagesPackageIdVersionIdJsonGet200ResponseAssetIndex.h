/*
 * _v1_packages__packageId___versionId__json_get_200_response_assetIndex.h
 *
 * 
 */

#ifndef __v1_packages__packageId___versionId__json_get_200_response_assetIndex_H_
#define __v1_packages__packageId___versionId__json_get_200_response_assetIndex_H_


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

class _v1_packages__packageId___versionId__json_get_200_response_assetIndex : public Object {
public:
	/*! \brief Constructor.
	 */
	_v1_packages__packageId___versionId__json_get_200_response_assetIndex();
	_v1_packages__packageId___versionId__json_get_200_response_assetIndex(char* str);

	/*! \brief Destructor.
	 */
	virtual ~_v1_packages__packageId___versionId__json_get_200_response_assetIndex();

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
	std::string getSha1();

	/*! \brief Set 
	 */
	void setSha1(std::string  sha1);
	/*! \brief Get 
	 */
	int getSize();

	/*! \brief Set 
	 */
	void setSize(int  size);
	/*! \brief Get 
	 */
	int getTotalSize();

	/*! \brief Set 
	 */
	void setTotalSize(int  totalSize);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	std::string id;
	std::string sha1;
	int size;
	int totalSize;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* __v1_packages__packageId___versionId__json_get_200_response_assetIndex_H_ */
