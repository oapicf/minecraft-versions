//
// VersionManifest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct VersionManifest: Codable, JSONEncodable, Hashable {

    public var latest: VersionManifestLatest?
    public var versions: [Version]?

    public init(latest: VersionManifestLatest? = nil, versions: [Version]? = nil) {
        self.latest = latest
        self.versions = versions
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case latest
        case versions
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(latest, forKey: .latest)
        try container.encodeIfPresent(versions, forKey: .versions)
    }
}

