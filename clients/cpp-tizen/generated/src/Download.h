/*
 * Download.h
 *
 * 
 */

#ifndef _Download_H_
#define _Download_H_


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

class Download : public Object {
public:
	/*! \brief Constructor.
	 */
	Download();
	Download(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Download();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	std::string sha1;
	int size;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Download_H_ */
