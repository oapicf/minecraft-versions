--[[
  SDK for Minecraft versions info

  The version of the OpenAPI document: 0.9.0-pre.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- version class
local version = {}
local version_mt = {
	__name = "version";
	__index = version;
}

local function cast_version(t)
	return setmetatable(t, version_mt)
end

local function new_version(id, type, url, time, release_time)
	return cast_version({
		["id"] = id;
		["type"] = type;
		["url"] = url;
		["time"] = time;
		["releaseTime"] = release_time;
	})
end

return {
	cast = cast_version;
	new = new_version;
}
