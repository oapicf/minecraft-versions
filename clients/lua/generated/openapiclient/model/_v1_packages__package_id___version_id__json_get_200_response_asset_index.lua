--[[
  SDK for Minecraft versions info

  The version of the OpenAPI document: 0.9.0-pre.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- _v1_packages__package_id___version_id__json_get_200_response_asset_index class
local _v1_packages__package_id___version_id__json_get_200_response_asset_index = {}
local _v1_packages__package_id___version_id__json_get_200_response_asset_index_mt = {
	__name = "_v1_packages__package_id___version_id__json_get_200_response_asset_index";
	__index = _v1_packages__package_id___version_id__json_get_200_response_asset_index;
}

local function cast__v1_packages__package_id___version_id__json_get_200_response_asset_index(t)
	return setmetatable(t, _v1_packages__package_id___version_id__json_get_200_response_asset_index_mt)
end

local function new__v1_packages__package_id___version_id__json_get_200_response_asset_index(id, sha1, size, total_size, url)
	return cast__v1_packages__package_id___version_id__json_get_200_response_asset_index({
		["id"] = id;
		["sha1"] = sha1;
		["size"] = size;
		["totalSize"] = total_size;
		["url"] = url;
	})
end

return {
	cast = cast__v1_packages__package_id___version_id__json_get_200_response_asset_index;
	new = new__v1_packages__package_id___version_id__json_get_200_response_asset_index;
}