/*
 * VersionPackageInfo_downloads.h
 *
 * 
 */

#ifndef _VersionPackageInfo_downloads_H_
#define _VersionPackageInfo_downloads_H_


#include <string>
#include "Download.h"
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

class VersionPackageInfo_downloads : public Object {
public:
	/*! \brief Constructor.
	 */
	VersionPackageInfo_downloads();
	VersionPackageInfo_downloads(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VersionPackageInfo_downloads();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Download getClient();

	/*! \brief Set 
	 */
	void setClient(Download  client);
	/*! \brief Get 
	 */
	Download getClientMappings();

	/*! \brief Set 
	 */
	void setClientMappings(Download  client_mappings);
	/*! \brief Get 
	 */
	Download getServer();

	/*! \brief Set 
	 */
	void setServer(Download  server);
	/*! \brief Get 
	 */
	Download getServerMappings();

	/*! \brief Set 
	 */
	void setServerMappings(Download  server_mappings);

private:
	Download client;
	Download client_mappings;
	Download server;
	Download server_mappings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VersionPackageInfo_downloads_H_ */
