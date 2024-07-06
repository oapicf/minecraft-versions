note
    description: "API tests for DEFAULT_API"
    date: "$Date$"
    revision: "$Revision$"


class DEFAULT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_minecraft_version_manifest
            -- Get Minecraft version manifest
            --
            -- 
        local
            l_response: GET_MINECRAFT_VERSION_MANIFEST_200_RESPONSE
        do
            -- TODO: Initialize required params.

            -- l_response := api.minecraft_version_manifest
            assert ("not_implemented", False)
        end

    test_v1_packages_package_id_version_id_json_get
            -- Get Minecraft version package details
            --
            -- 
        local
            l_response: MODEL_V1_PACKAGES__PACKAGE_ID___VERSION_ID__JSON_GET_200_RESPONSE
            l_package_id: STRING_32
            l_version_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_package_id
            -- l_version_id

            -- l_response := api.v1_packages_package_id_version_id_json_get(l_package_id, l_version_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once
            create { DEFAULT_API } Result
        end

end
