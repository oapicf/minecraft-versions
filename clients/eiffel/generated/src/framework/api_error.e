note
 description:"[
		
 		SDK for Minecraft versions info
  		The version of the OpenAPI document: 0.12.1-pre.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	API_ERROR

create
	make

feature {NONE} -- Initialization

	make (a_error: READABLE_STRING_GENERAL)
		do
			error := a_error
		ensure
			error_set: error = a_error
		end

feature -- Access

	error: READABLE_STRING_GENERAL
		-- Error generated by the API call.

end
