// tslint:disable
/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.12.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    VersionPackageInfoAssetIndex,
    VersionPackageInfoAssetIndexFromJSON,
    VersionPackageInfoAssetIndexToJSON,
    VersionPackageInfoDownloads,
    VersionPackageInfoDownloadsFromJSON,
    VersionPackageInfoDownloadsToJSON,
    VersionPackageInfoJavaVersion,
    VersionPackageInfoJavaVersionFromJSON,
    VersionPackageInfoJavaVersionToJSON,
} from './';

/**
 * 
 * @export
 * @interface VersionPackageInfo
 */
export interface VersionPackageInfo  {
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

export function VersionPackageInfoFromJSON(json: any): VersionPackageInfo {
    return {
        'version': !exists(json, 'version') ? undefined : json['version'],
        'assetIndex': !exists(json, 'assetIndex') ? undefined : VersionPackageInfoAssetIndexFromJSON(json['assetIndex']),
        'assets': !exists(json, 'assets') ? undefined : json['assets'],
        'complianceLevel': !exists(json, 'complianceLevel') ? undefined : json['complianceLevel'],
        'downloads': !exists(json, 'downloads') ? undefined : VersionPackageInfoDownloadsFromJSON(json['downloads']),
        'id': !exists(json, 'id') ? undefined : json['id'],
        'javaVersion': !exists(json, 'javaVersion') ? undefined : VersionPackageInfoJavaVersionFromJSON(json['javaVersion']),
        'mainClass': !exists(json, 'mainClass') ? undefined : json['mainClass'],
        'minimumLauncherVersion': !exists(json, 'minimumLauncherVersion') ? undefined : json['minimumLauncherVersion'],
        'time': !exists(json, 'time') ? undefined : new Date(json['time']),
        'releaseTime': !exists(json, 'releaseTime') ? undefined : new Date(json['releaseTime']),
        'type': !exists(json, 'type') ? undefined : json['type'],
    };
}

export function VersionPackageInfoToJSON(value?: VersionPackageInfo): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'version': value.version,
        'assetIndex': VersionPackageInfoAssetIndexToJSON(value.assetIndex),
        'assets': value.assets,
        'complianceLevel': value.complianceLevel,
        'downloads': VersionPackageInfoDownloadsToJSON(value.downloads),
        'id': value.id,
        'javaVersion': VersionPackageInfoJavaVersionToJSON(value.javaVersion),
        'mainClass': value.mainClass,
        'minimumLauncherVersion': value.minimumLauncherVersion,
        'time': value.time === undefined ? undefined : value.time.toISOString(),
        'releaseTime': value.releaseTime === undefined ? undefined : value.releaseTime.toISOString(),
        'type': value.type,
    };
}


