//
// VersionPackageInfoDownloads.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct VersionPackageInfoDownloads: Codable, JSONEncodable, Hashable {

    public var client: Download?
    public var clientMappings: Download?
    public var server: Download?
    public var serverMappings: Download?

    public init(client: Download? = nil, clientMappings: Download? = nil, server: Download? = nil, serverMappings: Download? = nil) {
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

