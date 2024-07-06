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

import { RequestFile } from './models';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex } from './v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads } from './v1PackagesPackageIdVersionIdJsonGet200ResponseDownloads';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion } from './v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion';

export class V1PackagesPackageIdVersionIdJsonGet200Response {
    'version'?: string;
    'assetIndex'?: V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
    'assets'?: number;
    'complianceLevel'?: number;
    'downloads'?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
    'id'?: string;
    'javaVersion'?: V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;
    'mainClass'?: string;
    'minimumLauncherVersion'?: number;
    'time'?: Date;
    'releaseTime'?: Date;
    'type'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "version",
            "baseName": "version",
            "type": "string"
        },
        {
            "name": "assetIndex",
            "baseName": "assetIndex",
            "type": "V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex"
        },
        {
            "name": "assets",
            "baseName": "assets",
            "type": "number"
        },
        {
            "name": "complianceLevel",
            "baseName": "complianceLevel",
            "type": "number"
        },
        {
            "name": "downloads",
            "baseName": "downloads",
            "type": "V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "javaVersion",
            "baseName": "javaVersion",
            "type": "V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion"
        },
        {
            "name": "mainClass",
            "baseName": "mainClass",
            "type": "string"
        },
        {
            "name": "minimumLauncherVersion",
            "baseName": "minimumLauncherVersion",
            "type": "number"
        },
        {
            "name": "time",
            "baseName": "time",
            "type": "Date"
        },
        {
            "name": "releaseTime",
            "baseName": "releaseTime",
            "type": "Date"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return V1PackagesPackageIdVersionIdJsonGet200Response.attributeTypeMap;
    }
}
