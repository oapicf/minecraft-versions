
/*
 * Version.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Version_H_
#define TINY_CPP_CLIENT_Version_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Version{
public:

    /*! \brief Constructor.
	 */
    Version();
    Version(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Version();


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
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string type);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string url);
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


    private:
    std::string id{};
    std::string type{};
    std::string url{};
    std::string time{};
    std::string releaseTime{};
};
}

#endif /* TINY_CPP_CLIENT_Version_H_ */
