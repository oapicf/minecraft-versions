
/*
 * VersionPackageInfo_downloads.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_VersionPackageInfo_downloads_H_
#define TINY_CPP_CLIENT_VersionPackageInfo_downloads_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Download.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VersionPackageInfo_downloads{
public:

    /*! \brief Constructor.
	 */
    VersionPackageInfo_downloads();
    VersionPackageInfo_downloads(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VersionPackageInfo_downloads();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Download getClient();

	/*! \brief Set 
	 */
	void setClient(Download client);
	/*! \brief Get 
	 */
	Download getClientMappings();

	/*! \brief Set 
	 */
	void setClientMappings(Download client_mappings);
	/*! \brief Get 
	 */
	Download getServer();

	/*! \brief Set 
	 */
	void setServer(Download server);
	/*! \brief Get 
	 */
	Download getServerMappings();

	/*! \brief Set 
	 */
	void setServerMappings(Download server_mappings);


    private:
    Download client;
    Download client_mappings;
    Download server;
    Download server_mappings;
};
}

#endif /* TINY_CPP_CLIENT_VersionPackageInfo_downloads_H_ */
