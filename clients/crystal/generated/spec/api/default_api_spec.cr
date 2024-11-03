# #SDK for Minecraft versions info
#
#The version of the OpenAPI document: 0.12.1-pre.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::DefaultApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "DefaultApi" do
  describe "test an instance of DefaultApi" do
    it "should create an instance of DefaultApi" do
      api_instance = OpenAPIClient::DefaultApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::DefaultApi)
    end
  end

  # unit tests for get_minecraft_version_manifest
  # Get Minecraft version manifest
  # @param [Hash] opts the optional parameters
  # @return [VersionManifest]
  describe "get_minecraft_version_manifest test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_minecraft_version_package_info
  # Get Minecraft version package info
  # @param package_id 
  # @param version_id 
  # @param [Hash] opts the optional parameters
  # @return [VersionPackageInfo]
  describe "get_minecraft_version_package_info test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
