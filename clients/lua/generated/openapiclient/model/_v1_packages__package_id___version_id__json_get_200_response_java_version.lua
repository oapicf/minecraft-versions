--[[
  SDK for Minecraft versions info

  The version of the OpenAPI document: 0.9.0-pre.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- _v1_packages__package_id___version_id__json_get_200_response_java_version class
local _v1_packages__package_id___version_id__json_get_200_response_java_version = {}
local _v1_packages__package_id___version_id__json_get_200_response_java_version_mt = {
	__name = "_v1_packages__package_id___version_id__json_get_200_response_java_version";
	__index = _v1_packages__package_id___version_id__json_get_200_response_java_version;
}

local function cast__v1_packages__package_id___version_id__json_get_200_response_java_version(t)
	return setmetatable(t, _v1_packages__package_id___version_id__json_get_200_response_java_version_mt)
end

local function new__v1_packages__package_id___version_id__json_get_200_response_java_version(component, major_version)
	return cast__v1_packages__package_id___version_id__json_get_200_response_java_version({
		["component"] = component;
		["majorVersion"] = major_version;
	})
end

return {
	cast = cast__v1_packages__package_id___version_id__json_get_200_response_java_version;
	new = new__v1_packages__package_id___version_id__json_get_200_response_java_version;
}