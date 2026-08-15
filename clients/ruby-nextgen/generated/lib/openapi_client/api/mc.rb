# frozen_string_literal: true

module OpenapiClient
  module Api
    class Mc
      def initialize(connection)
        @connection = connection
      end

      def game_version_manifest/json
        @connection.call(
          :GET,
          '/mc/game/version_manifest.json',
          type: OpenapiClient::Models::VersionManifest,
          auth: []
        )
      end
    end
  end
end
