/* tslint:disable */
/* eslint-disable */
/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { VersionPackageInfoDownloads } from './VersionPackageInfoDownloads';
import {
    VersionPackageInfoDownloadsFromJSON,
    VersionPackageInfoDownloadsFromJSONTyped,
    VersionPackageInfoDownloadsToJSON,
} from './VersionPackageInfoDownloads';
import type { VersionPackageInfoAssetIndex } from './VersionPackageInfoAssetIndex';
import {
    VersionPackageInfoAssetIndexFromJSON,
    VersionPackageInfoAssetIndexFromJSONTyped,
    VersionPackageInfoAssetIndexToJSON,
} from './VersionPackageInfoAssetIndex';
import type { VersionPackageInfoJavaVersion } from './VersionPackageInfoJavaVersion';
import {
    VersionPackageInfoJavaVersionFromJSON,
    VersionPackageInfoJavaVersionFromJSONTyped,
    VersionPackageInfoJavaVersionToJSON,
} from './VersionPackageInfoJavaVersion';

/**
 * 
 * @export
 * @interface VersionPackageInfo
 */
export interface VersionPackageInfo {
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfo
     */
    version?: string;
    /**
     * 
     * @type {VersionPackageInfoAssetIndex}
     * @memberof VersionPackageInfo
     */
    assetIndex?: VersionPackageInfoAssetIndex;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfo
     */
    assets?: string;
    /**
     * 
     * @type {number}
     * @memberof VersionPackageInfo
     */
    complianceLevel?: number;
    /**
     * 
     * @type {VersionPackageInfoDownloads}
     * @memberof VersionPackageInfo
     */
    downloads?: VersionPackageInfoDownloads;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfo
     */
    id?: string;
    /**
     * 
     * @type {VersionPackageInfoJavaVersion}
     * @memberof VersionPackageInfo
     */
    javaVersion?: VersionPackageInfoJavaVersion;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfo
     */
    mainClass?: string;
    /**
     * 
     * @type {number}
     * @memberof VersionPackageInfo
     */
    minimumLauncherVersion?: number;
    /**
     * 
     * @type {Date}
     * @memberof VersionPackageInfo
     */
    time?: Date;
    /**
     * 
     * @type {Date}
     * @memberof VersionPackageInfo
     */
    releaseTime?: Date;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfo
     */
    type?: string;
}

/**
 * Check if a given object implements the VersionPackageInfo interface.
 */
export function instanceOfVersionPackageInfo(value: object): value is VersionPackageInfo {
    return true;
}

export function VersionPackageInfoFromJSON(json: any): VersionPackageInfo {
    return VersionPackageInfoFromJSONTyped(json, false);
}

export function VersionPackageInfoFromJSONTyped(json: any, ignoreDiscriminator: boolean): VersionPackageInfo {
    if (json == null) {
        return json;
    }
    return {
        
        'version': json['version'] == null ? undefined : json['version'],
        'assetIndex': json['assetIndex'] == null ? undefined : VersionPackageInfoAssetIndexFromJSON(json['assetIndex']),
        'assets': json['assets'] == null ? undefined : json['assets'],
        'complianceLevel': json['complianceLevel'] == null ? undefined : json['complianceLevel'],
        'downloads': json['downloads'] == null ? undefined : VersionPackageInfoDownloadsFromJSON(json['downloads']),
        'id': json['id'] == null ? undefined : json['id'],
        'javaVersion': json['javaVersion'] == null ? undefined : VersionPackageInfoJavaVersionFromJSON(json['javaVersion']),
        'mainClass': json['mainClass'] == null ? undefined : json['mainClass'],
        'minimumLauncherVersion': json['minimumLauncherVersion'] == null ? undefined : json['minimumLauncherVersion'],
        'time': json['time'] == null ? undefined : (new Date(json['time'])),
        'releaseTime': json['releaseTime'] == null ? undefined : (new Date(json['releaseTime'])),
        'type': json['type'] == null ? undefined : json['type'],
    };
}

export function VersionPackageInfoToJSON(value?: VersionPackageInfo | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'version': value['version'],
        'assetIndex': VersionPackageInfoAssetIndexToJSON(value['assetIndex']),
        'assets': value['assets'],
        'complianceLevel': value['complianceLevel'],
        'downloads': VersionPackageInfoDownloadsToJSON(value['downloads']),
        'id': value['id'],
        'javaVersion': VersionPackageInfoJavaVersionToJSON(value['javaVersion']),
        'mainClass': value['mainClass'],
        'minimumLauncherVersion': value['minimumLauncherVersion'],
        'time': value['time'] == null ? undefined : ((value['time']).toISOString()),
        'releaseTime': value['releaseTime'] == null ? undefined : ((value['releaseTime']).toISOString()),
        'type': value['type'],
    };
}

