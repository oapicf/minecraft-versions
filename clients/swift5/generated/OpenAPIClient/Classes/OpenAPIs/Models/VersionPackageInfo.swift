//
// VersionPackageInfo.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct VersionPackageInfo: Codable, JSONEncodable, Hashable {

    public var version: String?
    public var assetIndex: VersionPackageInfoAssetIndex?
    public var assets: String?
    public var complianceLevel: Int?
    public var downloads: VersionPackageInfoDownloads?
    public var id: String?
    public var javaVersion: VersionPackageInfoJavaVersion?
    public var mainClass: String?
    public var minimumLauncherVersion: Int?
    public var time: Date?
    public var releaseTime: Date?
    public var type: String?

    public init(version: String? = nil, assetIndex: VersionPackageInfoAssetIndex? = nil, assets: String? = nil, complianceLevel: Int? = nil, downloads: VersionPackageInfoDownloads? = nil, id: String? = nil, javaVersion: VersionPackageInfoJavaVersion? = nil, mainClass: String? = nil, minimumLauncherVersion: Int? = nil, time: Date? = nil, releaseTime: Date? = nil, type: String? = nil) {
        self.version = version
        self.assetIndex = assetIndex
        self.assets = assets
        self.complianceLevel = complianceLevel
        self.downloads = downloads
        self.id = id
        self.javaVersion = javaVersion
        self.mainClass = mainClass
        self.minimumLauncherVersion = minimumLauncherVersion
        self.time = time
        self.releaseTime = releaseTime
        self.type = type
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case version
        case assetIndex
        case assets
        case complianceLevel
        case downloads
        case id
        case javaVersion
        case mainClass
        case minimumLauncherVersion
        case time
        case releaseTime
        case type
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(version, forKey: .version)
        try container.encodeIfPresent(assetIndex, forKey: .assetIndex)
        try container.encodeIfPresent(assets, forKey: .assets)
        try container.encodeIfPresent(complianceLevel, forKey: .complianceLevel)
        try container.encodeIfPresent(downloads, forKey: .downloads)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(javaVersion, forKey: .javaVersion)
        try container.encodeIfPresent(mainClass, forKey: .mainClass)
        try container.encodeIfPresent(minimumLauncherVersion, forKey: .minimumLauncherVersion)
        try container.encodeIfPresent(time, forKey: .time)
        try container.encodeIfPresent(releaseTime, forKey: .releaseTime)
        try container.encodeIfPresent(type, forKey: .type)
    }
}


@available(iOS 13, tvOS 13, watchOS 6, macOS 10.15, *)
extension VersionPackageInfo: Identifiable {}
