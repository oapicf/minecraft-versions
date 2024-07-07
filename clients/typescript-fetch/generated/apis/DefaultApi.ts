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


import * as runtime from '../runtime';
import type {
  VersionManifest,
  VersionPackageInfo,
} from '../models/index';
import {
    VersionManifestFromJSON,
    VersionManifestToJSON,
    VersionPackageInfoFromJSON,
    VersionPackageInfoToJSON,
} from '../models/index';

export interface GetMinecraftVersionPackageInfoRequest {
    packageId: string;
    versionId: string;
}

/**
 * 
 */
export class DefaultApi extends runtime.BaseAPI {

    /**
     * Get Minecraft version manifest
     */
    async getMinecraftVersionManifestRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<VersionManifest>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/mc/game/version_manifest.json`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => VersionManifestFromJSON(jsonValue));
    }

    /**
     * Get Minecraft version manifest
     */
    async getMinecraftVersionManifest(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<VersionManifest> {
        const response = await this.getMinecraftVersionManifestRaw(initOverrides);
        return await response.value();
    }

    /**
     * Get Minecraft version package info
     */
    async getMinecraftVersionPackageInfoRaw(requestParameters: GetMinecraftVersionPackageInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<VersionPackageInfo>> {
        if (requestParameters['packageId'] == null) {
            throw new runtime.RequiredError(
                'packageId',
                'Required parameter "packageId" was null or undefined when calling getMinecraftVersionPackageInfo().'
            );
        }

        if (requestParameters['versionId'] == null) {
            throw new runtime.RequiredError(
                'versionId',
                'Required parameter "versionId" was null or undefined when calling getMinecraftVersionPackageInfo().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/v1/packages/{packageId}/{versionId}.json`.replace(`{${"packageId"}}`, encodeURIComponent(String(requestParameters['packageId']))).replace(`{${"versionId"}}`, encodeURIComponent(String(requestParameters['versionId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => VersionPackageInfoFromJSON(jsonValue));
    }

    /**
     * Get Minecraft version package info
     */
    async getMinecraftVersionPackageInfo(requestParameters: GetMinecraftVersionPackageInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<VersionPackageInfo> {
        const response = await this.getMinecraftVersionPackageInfoRaw(requestParameters, initOverrides);
        return await response.value();
    }

}