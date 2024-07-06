/*
 * _v1_packages__packageId___versionId__json_get_200_response_downloads.h
 *
 * 
 */

#ifndef __v1_packages__packageId___versionId__json_get_200_response_downloads_H_
#define __v1_packages__packageId___versionId__json_get_200_response_downloads_H_


#include <string>
#include "_v1_packages__packageId___versionId__json_get_200_response_downloads_client.h"
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

class _v1_packages__packageId___versionId__json_get_200_response_downloads : public Object {
public:
	/*! \brief Constructor.
	 */
	_v1_packages__packageId___versionId__json_get_200_response_downloads();
	_v1_packages__packageId___versionId__json_get_200_response_downloads(char* str);

	/*! \brief Destructor.
	 */
	virtual ~_v1_packages__packageId___versionId__json_get_200_response_downloads();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	_v1_packages__packageId___versionId__json_get_200_response_downloads_client getClient();

	/*! \brief Set 
	 */
	void setClient(_v1_packages__packageId___versionId__json_get_200_response_downloads_client  client);
	/*! \brief Get 
	 */
	_v1_packages__packageId___versionId__json_get_200_response_downloads_client getClientMappings();

	/*! \brief Set 
	 */
	void setClientMappings(_v1_packages__packageId___versionId__json_get_200_response_downloads_client  client_mappings);
	/*! \brief Get 
	 */
	_v1_packages__packageId___versionId__json_get_200_response_downloads_client getServer();

	/*! \brief Set 
	 */
	void setServer(_v1_packages__packageId___versionId__json_get_200_response_downloads_client  server);
	/*! \brief Get 
	 */
	_v1_packages__packageId___versionId__json_get_200_response_downloads_client getServerMappings();

	/*! \brief Set 
	 */
	void setServerMappings(_v1_packages__packageId___versionId__json_get_200_response_downloads_client  server_mappings);

private:
	_v1_packages__packageId___versionId__json_get_200_response_downloads_client client;
	_v1_packages__packageId___versionId__json_get_200_response_downloads_client client_mappings;
	_v1_packages__packageId___versionId__json_get_200_response_downloads_client server;
	_v1_packages__packageId___versionId__json_get_200_response_downloads_client server_mappings;
	void __init();
	void __cleanup();

};
}
}

#endif /* __v1_packages__packageId___versionId__json_get_200_response_downloads_H_ */
