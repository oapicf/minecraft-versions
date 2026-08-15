
/*
 * Download.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Download_H_
#define TINY_CPP_CLIENT_Download_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Download{
public:

    /*! \brief Constructor.
	 */
    Download();
    Download(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Download();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string url);


    private:
    std::string sha1{};
    int size{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_Download_H_ */
