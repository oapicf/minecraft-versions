//
// V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads: Codable, JSONEncodable, Hashable {

    public var client: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient?
    public var clientMappings: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient?
    public var server: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient?
    public var serverMappings: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient?

    public init(client: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient? = nil, clientMappings: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient? = nil, server: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient? = nil, serverMappings: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient? = nil) {
        self.client = client
        self.clientMappings = clientMappings
        self.server = server
        self.serverMappings = serverMappings
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case client
        case clientMappings = "client_mappings"
        case server
        case serverMappings = "server_mappings"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(client, forKey: .client)
        try container.encodeIfPresent(clientMappings, forKey: .clientMappings)
        try container.encodeIfPresent(server, forKey: .server)
        try container.encodeIfPresent(serverMappings, forKey: .serverMappings)
    }
}
