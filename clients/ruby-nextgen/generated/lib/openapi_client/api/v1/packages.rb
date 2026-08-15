# frozen_string_literal: true

module OpenapiClient
  module Api
    class V1::Packages
      def initialize(connection)
        @connection = connection
      end

      def {version_id}/json(package_id:, version_id:)
        raise ArgumentError, 'package_id is required' if package_id.nil?
        raise ArgumentError, 'version_id is required' if version_id.nil?

        @connection.call(
          :GET,
          '/v1/packages/{packageId}/{versionId}.json'
            .gsub('{packageId}', ERB::Util.url_encode(package_id.to_s))
            .gsub('{versionId}', ERB::Util.url_encode(version_id.to_s)),
          type: OpenapiClient::Models::VersionPackageInfo,
          auth: []
        )
      end
    end
  end
end
