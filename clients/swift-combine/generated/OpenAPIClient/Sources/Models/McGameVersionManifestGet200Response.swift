//
// McGameVersionManifestGet200Response.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct McGameVersionManifestGet200Response: Codable {
    public var latest: McGameVersionManifestGet200ResponseLatest?
    public var versions: [McGameVersionManifestGet200ResponseVersionsInner]?

    public init(latest: McGameVersionManifestGet200ResponseLatest? = nil, versions: [McGameVersionManifestGet200ResponseVersionsInner]? = nil) {
        self.latest = latest
        self.versions = versions
    }
}
