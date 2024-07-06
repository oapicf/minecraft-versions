//
// McGameVersionManifestGet200Response.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct McGameVersionManifestGet200Response: Codable, JSONEncodable, Hashable {

    public var latest: McGameVersionManifestGet200ResponseLatest?
    public var versions: [McGameVersionManifestGet200ResponseVersionsInner]?

    public init(latest: McGameVersionManifestGet200ResponseLatest? = nil, versions: [McGameVersionManifestGet200ResponseVersionsInner]? = nil) {
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

