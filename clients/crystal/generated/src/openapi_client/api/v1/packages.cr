require "json"

module OpenAPIClient
  module Api
  class V1::Packages
    def initialize(@conn : Connection); end

    # Get Minecraft version package info
    def version_id_json(package_id : String, version_id : String) : Response(OpenAPIClient::VersionPackageInfo)
      @conn.request(OpenAPIClient::VersionPackageInfo,
        method: :GET,
        path: "/v1/packages/{packageId}/{versionId}.json".sub("{packageId}", OpenAPIClient.enc(package_id)).sub("{versionId}", OpenAPIClient.enc(version_id)),
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
