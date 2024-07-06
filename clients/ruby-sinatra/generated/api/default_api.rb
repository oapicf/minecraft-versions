require 'json'


MyApp.add_route('GET', '/mc/game/version_manifest.json', {
  "resourcePath" => "/Default",
  "summary" => "Get Minecraft version manifest",
  "nickname" => "get_minecraft_version_manifest",
  "responseClass" => "VersionManifest",
  "endpoint" => "/mc/game/version_manifest.json",
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/packages/{packageId}/{versionId}.json', {
  "resourcePath" => "/Default",
  "summary" => "Get Minecraft version package info",
  "nickname" => "get_minecraft_version_package_info",
  "responseClass" => "VersionPackageInfo",
  "endpoint" => "/v1/packages/{packageId}/{versionId}.json",
  "notes" => "",
  "parameters" => [
    {
      "name" => "package_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "version_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

