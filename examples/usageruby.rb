# Load the gem
require 'minecraft_versions'

api_instance = MinecraftVersionsClient::DefaultApi.new

begin
  # Get Minecraft version manifest
  result = api_instance.get_minecraft_version_manifest
  versions = result.versions
  versions.each do |version|
    puts "version: #{version.id}"
    puts "type: #{version.type}"
    puts "url: #{version.url}"
  end
rescue MinecraftVersionsClient::ApiError => e
  puts "Exception when calling DefaultApi->get_minecraft_version_manifest: #{e}"
  raise
end
