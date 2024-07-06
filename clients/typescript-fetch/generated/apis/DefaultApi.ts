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
  GetMinecraftVersionManifest200Response,
  V1PackagesPackageIdVersionIdJsonGet200Response,
} from '../models/index';
import {
    GetMinecraftVersionManifest200ResponseFromJSON,
    GetMinecraftVersionManifest200ResponseToJSON,
    V1PackagesPackageIdVersionIdJsonGet200ResponseFromJSON,
    V1PackagesPackageIdVersionIdJsonGet200ResponseToJSON,
} from '../models/index';

export interface V1PackagesPackageIdVersionIdJsonGetRequest {
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
    async getMinecraftVersionManifestRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetMinecraftVersionManifest200Response>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/mc/game/version_manifest.json`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetMinecraftVersionManifest200ResponseFromJSON(jsonValue));
    }

    /**
     * Get Minecraft version manifest
     */
    async getMinecraftVersionManifest(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetMinecraftVersionManifest200Response> {
        const response = await this.getMinecraftVersionManifestRaw(initOverrides);
        return await response.value();
    }

    /**
     * Get Minecraft version package details
     */
    async v1PackagesPackageIdVersionIdJsonGetRaw(requestParameters: V1PackagesPackageIdVersionIdJsonGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<V1PackagesPackageIdVersionIdJsonGet200Response>> {
        if (requestParameters['packageId'] == null) {
            throw new runtime.RequiredError(
                'packageId',
                'Required parameter "packageId" was null or undefined when calling v1PackagesPackageIdVersionIdJsonGet().'
            );
        }

        if (requestParameters['versionId'] == null) {
            throw new runtime.RequiredError(
                'versionId',
                'Required parameter "versionId" was null or undefined when calling v1PackagesPackageIdVersionIdJsonGet().'
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

        return new runtime.JSONApiResponse(response, (jsonValue) => V1PackagesPackageIdVersionIdJsonGet200ResponseFromJSON(jsonValue));
    }

    /**
     * Get Minecraft version package details
     */
    async v1PackagesPackageIdVersionIdJsonGet(requestParameters: V1PackagesPackageIdVersionIdJsonGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<V1PackagesPackageIdVersionIdJsonGet200Response> {
        const response = await this.v1PackagesPackageIdVersionIdJsonGetRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
