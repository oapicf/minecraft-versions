require "json"

module OpenAPIClient
  module Api
  class Mc
    def initialize(@conn : Connection); end

    # Get Minecraft version manifest
    def game_version_manifest_json() : Response(OpenAPIClient::VersionManifest)
      @conn.request(OpenAPIClient::VersionManifest,
        method: :GET,
        path: "/mc/game/version_manifest.json",
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
