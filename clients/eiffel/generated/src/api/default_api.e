note
 description:"[
		
 		SDK for Minecraft versions info
  		The version of the OpenAPI document: 0.9.0-pre.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	DEFAULT_API

inherit

    API_I


feature -- API Access


	mc_game_version_manifest_get : detachable MODEL_MC_GAME_VERSION_MANIFEST_GET_200_RESPONSE
			-- Get Minecraft version manifest
			-- 
			-- 
			-- 
			-- Result MODEL_MC_GAME_VERSION_MANIFEST_GET_200_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/mc/game/version_manifest"


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<>>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { MODEL_MC_GAME_VERSION_MANIFEST_GET_200_RESPONSE } l_response.data ({ MODEL_MC_GAME_VERSION_MANIFEST_GET_200_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	v1_packages_package_id_version_id_json_get (package_id: STRING_32; version_id: STRING_32): detachable MODEL_V1_PACKAGES__PACKAGE_ID___VERSION_ID__JSON_GET_200_RESPONSE
			-- Get Minecraft version package details
			-- 
			-- 
			-- argument: package_id  (required)
			-- 
			-- argument: version_id  (required)
			-- 
			-- 
			-- Result MODEL_V1_PACKAGES__PACKAGE_ID___VERSION_ID__JSON_GET_200_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/v1/packages/{packageId}/{versionId}.json"
			l_path.replace_substring_all ("{"+"packageId"+"}", api_client.url_encode (package_id.out))
			l_path.replace_substring_all ("{"+"versionId"+"}", api_client.url_encode (version_id.out))


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<>>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { MODEL_V1_PACKAGES__PACKAGE_ID___VERSION_ID__JSON_GET_200_RESPONSE } l_response.data ({ MODEL_V1_PACKAGES__PACKAGE_ID___VERSION_ID__JSON_GET_200_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end


end