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
            l_response: VERSION_MANIFEST
        do
            -- TODO: Initialize required params.

            -- l_response := api.minecraft_version_manifest
            assert ("not_implemented", False)
        end

    test_minecraft_version_package_info
            -- Get Minecraft version package info
            --
            -- 
        local
            l_response: VERSION_PACKAGE_INFO
            l_package_id: STRING_32
            l_version_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_package_id
            -- l_version_id

            -- l_response := api.minecraft_version_package_info(l_package_id, l_version_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once
            create { DEFAULT_API } Result
        end

end
