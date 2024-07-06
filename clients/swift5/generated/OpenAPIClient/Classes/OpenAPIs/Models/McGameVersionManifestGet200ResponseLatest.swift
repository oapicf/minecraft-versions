//
// McGameVersionManifestGet200ResponseLatest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct McGameVersionManifestGet200ResponseLatest: Codable, JSONEncodable, Hashable {

    public var release: String?
    public var snapshot: String?

    public init(release: String? = nil, snapshot: String? = nil) {
        self.release = release
        self.snapshot = snapshot
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case release
        case snapshot
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(release, forKey: .release)
        try container.encodeIfPresent(snapshot, forKey: .snapshot)
    }
}

