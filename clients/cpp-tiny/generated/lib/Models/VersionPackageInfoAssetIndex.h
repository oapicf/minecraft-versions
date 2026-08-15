
/*
 * VersionPackageInfo_assetIndex.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_VersionPackageInfo_assetIndex_H_
#define TINY_CPP_CLIENT_VersionPackageInfo_assetIndex_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VersionPackageInfo_assetIndex{
public:

    /*! \brief Constructor.
	 */
    VersionPackageInfo_assetIndex();
    VersionPackageInfo_assetIndex(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VersionPackageInfo_assetIndex();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string id);
	/*! \brief Get 
	 */
	std::string getSha1();

	/*! \brief Set 
	 */
	void setSha1(std::string sha1);
	/*! \brief Get 
	 */
	int getSize();

	/*! \brief Set 
	 */
	void setSize(int size);
	/*! \brief Get 
	 */
	int getTotalSize();

	/*! \brief Set 
	 */
	void setTotalSize(int totalSize);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string url);


    private:
    std::string id{};
    std::string sha1{};
    int size{};
    int totalSize{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_VersionPackageInfo_assetIndex_H_ */
