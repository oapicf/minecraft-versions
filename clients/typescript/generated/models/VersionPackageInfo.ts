/**
 * 
 * SDK for Minecraft versions info
 *
 * OpenAPI spec version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { VersionPackageInfoAssetIndex } from '../models/VersionPackageInfoAssetIndex';
import { VersionPackageInfoDownloads } from '../models/VersionPackageInfoDownloads';
import { VersionPackageInfoJavaVersion } from '../models/VersionPackageInfoJavaVersion';
import { HttpFile } from '../http/http';

export class VersionPackageInfo {
    'version'?: string;
    'assetIndex'?: VersionPackageInfoAssetIndex;
    'assets'?: string;
    'complianceLevel'?: number;
    'downloads'?: VersionPackageInfoDownloads;
    'id'?: string;
    'javaVersion'?: VersionPackageInfoJavaVersion;
    'mainClass'?: string;
    'minimumLauncherVersion'?: number;
    'time'?: Date;
    'releaseTime'?: Date;
    'type'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "version",
            "baseName": "version",
            "type": "string",
            "format": ""
        },
        {
            "name": "assetIndex",
            "baseName": "assetIndex",
            "type": "VersionPackageInfoAssetIndex",
            "format": ""
        },
        {
            "name": "assets",
            "baseName": "assets",
            "type": "string",
            "format": ""
        },
        {
            "name": "complianceLevel",
            "baseName": "complianceLevel",
            "type": "number",
            "format": ""
        },
        {
            "name": "downloads",
            "baseName": "downloads",
            "type": "VersionPackageInfoDownloads",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "javaVersion",
            "baseName": "javaVersion",
            "type": "VersionPackageInfoJavaVersion",
            "format": ""
        },
        {
            "name": "mainClass",
            "baseName": "mainClass",
            "type": "string",
            "format": ""
        },
        {
            "name": "minimumLauncherVersion",
            "baseName": "minimumLauncherVersion",
            "type": "number",
            "format": ""
        },
        {
            "name": "time",
            "baseName": "time",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "releaseTime",
            "baseName": "releaseTime",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return VersionPackageInfo.attributeTypeMap;
    }

    public constructor() {
    }
}

