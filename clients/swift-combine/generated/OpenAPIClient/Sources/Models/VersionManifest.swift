//
// VersionManifest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct VersionManifest: Codable {
    public var latest: VersionManifestLatest?
    public var versions: [Version]?

    public init(latest: VersionManifestLatest? = nil, versions: [Version]? = nil) {
        self.latest = latest
        self.versions = versions
    }
}
