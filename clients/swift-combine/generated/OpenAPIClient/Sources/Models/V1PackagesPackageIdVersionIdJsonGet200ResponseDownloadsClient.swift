//
// V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient: Codable {
    public var sha1: String?
    public var size: Int?
    public var url: String?

    public init(sha1: String? = nil, size: Int? = nil, url: String? = nil) {
        self.sha1 = sha1
        self.size = size
        self.url = url
    }
}