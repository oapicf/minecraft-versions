/* tslint:disable */
/* eslint-disable */
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


import type { Configuration } from './configuration';
import type { AxiosPromise, AxiosInstance, RawAxiosRequestConfig } from 'axios';
import globalAxios from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from './common';
import type { RequestArgs } from './base';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, BaseAPI, RequiredError, operationServerMap } from './base';

/**
 * 
 * @export
 * @interface Download
 */
export interface Download {
    /**
     * 
     * @type {string}
     * @memberof Download
     */
    'sha1'?: string;
    /**
     * 
     * @type {number}
     * @memberof Download
     */
    'size'?: number;
    /**
     * 
     * @type {string}
     * @memberof Download
     */
    'url'?: string;
}
/**
 * 
 * @export
 * @interface Version
 */
export interface Version {
    /**
     * 
     * @type {string}
     * @memberof Version
     */
    'id'?: string;
    /**
     * 
     * @type {string}
     * @memberof Version
     */
    'type'?: string;
    /**
     * 
     * @type {string}
     * @memberof Version
     */
    'url'?: string;
    /**
     * 
     * @type {string}
     * @memberof Version
     */
    'time'?: string;
    /**
     * 
     * @type {string}
     * @memberof Version
     */
    'releaseTime'?: string;
}
/**
 * 
 * @export
 * @interface VersionManifest
 */
export interface VersionManifest {
    /**
     * 
     * @type {VersionManifestLatest}
     * @memberof VersionManifest
     */
    'latest'?: VersionManifestLatest;
    /**
     * 
     * @type {Array<Version>}
     * @memberof VersionManifest
     */
    'versions'?: Array<Version>;
}
/**
 * 
 * @export
 * @interface VersionManifestLatest
 */
export interface VersionManifestLatest {
    /**
     * 
     * @type {string}
     * @memberof VersionManifestLatest
     */
    'release'?: string;
    /**
     * 
     * @type {string}
     * @memberof VersionManifestLatest
     */
    'snapshot'?: string;
}
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
    'version'?: string;
    /**
     * 
     * @type {VersionPackageInfoAssetIndex}
     * @memberof VersionPackageInfo
     */
    'assetIndex'?: VersionPackageInfoAssetIndex;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfo
     */
    'assets'?: string;
    /**
     * 
     * @type {number}
     * @memberof VersionPackageInfo
     */
    'complianceLevel'?: number;
    /**
     * 
     * @type {VersionPackageInfoDownloads}
     * @memberof VersionPackageInfo
     */
    'downloads'?: VersionPackageInfoDownloads;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfo
     */
    'id'?: string;
    /**
     * 
     * @type {VersionPackageInfoJavaVersion}
     * @memberof VersionPackageInfo
     */
    'javaVersion'?: VersionPackageInfoJavaVersion;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfo
     */
    'mainClass'?: string;
    /**
     * 
     * @type {number}
     * @memberof VersionPackageInfo
     */
    'minimumLauncherVersion'?: number;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfo
     */
    'time'?: string;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfo
     */
    'releaseTime'?: string;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfo
     */
    'type'?: string;
}
/**
 * 
 * @export
 * @interface VersionPackageInfoAssetIndex
 */
export interface VersionPackageInfoAssetIndex {
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfoAssetIndex
     */
    'id'?: string;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfoAssetIndex
     */
    'sha1'?: string;
    /**
     * 
     * @type {number}
     * @memberof VersionPackageInfoAssetIndex
     */
    'size'?: number;
    /**
     * 
     * @type {number}
     * @memberof VersionPackageInfoAssetIndex
     */
    'totalSize'?: number;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfoAssetIndex
     */
    'url'?: string;
}
/**
 * 
 * @export
 * @interface VersionPackageInfoDownloads
 */
export interface VersionPackageInfoDownloads {
    /**
     * 
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    'client'?: Download;
    /**
     * 
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    'client_mappings'?: Download;
    /**
     * 
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    'server'?: Download;
    /**
     * 
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    'server_mappings'?: Download;
}
/**
 * 
 * @export
 * @interface VersionPackageInfoJavaVersion
 */
export interface VersionPackageInfoJavaVersion {
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfoJavaVersion
     */
    'component'?: string;
    /**
     * 
     * @type {number}
     * @memberof VersionPackageInfoJavaVersion
     */
    'majorVersion'?: number;
}

/**
 * DefaultApi - axios parameter creator
 * @export
 */
export const DefaultApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Get Minecraft version manifest
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMinecraftVersionManifest: async (options: RawAxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/mc/game/version_manifest.json`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Get Minecraft version package info
         * @param {string} packageId 
         * @param {string} versionId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMinecraftVersionPackageInfo: async (packageId: string, versionId: string, options: RawAxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'packageId' is not null or undefined
            assertParamExists('getMinecraftVersionPackageInfo', 'packageId', packageId)
            // verify required parameter 'versionId' is not null or undefined
            assertParamExists('getMinecraftVersionPackageInfo', 'versionId', versionId)
            const localVarPath = `/v1/packages/{packageId}/{versionId}.json`
                .replace(`{${"packageId"}}`, encodeURIComponent(String(packageId)))
                .replace(`{${"versionId"}}`, encodeURIComponent(String(versionId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * DefaultApi - functional programming interface
 * @export
 */
export const DefaultApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = DefaultApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Get Minecraft version manifest
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getMinecraftVersionManifest(options?: RawAxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<VersionManifest>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getMinecraftVersionManifest(options);
            const localVarOperationServerIndex = configuration?.serverIndex ?? 0;
            const localVarOperationServerBasePath = operationServerMap['DefaultApi.getMinecraftVersionManifest']?.[localVarOperationServerIndex]?.url;
            return (axios, basePath) => createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration)(axios, localVarOperationServerBasePath || basePath);
        },
        /**
         * 
         * @summary Get Minecraft version package info
         * @param {string} packageId 
         * @param {string} versionId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getMinecraftVersionPackageInfo(packageId: string, versionId: string, options?: RawAxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<VersionPackageInfo>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getMinecraftVersionPackageInfo(packageId, versionId, options);
            const localVarOperationServerIndex = configuration?.serverIndex ?? 0;
            const localVarOperationServerBasePath = operationServerMap['DefaultApi.getMinecraftVersionPackageInfo']?.[localVarOperationServerIndex]?.url;
            return (axios, basePath) => createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration)(axios, localVarOperationServerBasePath || basePath);
        },
    }
};

/**
 * DefaultApi - factory interface
 * @export
 */
export const DefaultApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = DefaultApiFp(configuration)
    return {
        /**
         * 
         * @summary Get Minecraft version manifest
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMinecraftVersionManifest(options?: RawAxiosRequestConfig): AxiosPromise<VersionManifest> {
            return localVarFp.getMinecraftVersionManifest(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Get Minecraft version package info
         * @param {string} packageId 
         * @param {string} versionId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getMinecraftVersionPackageInfo(packageId: string, versionId: string, options?: RawAxiosRequestConfig): AxiosPromise<VersionPackageInfo> {
            return localVarFp.getMinecraftVersionPackageInfo(packageId, versionId, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * DefaultApi - object-oriented interface
 * @export
 * @class DefaultApi
 * @extends {BaseAPI}
 */
export class DefaultApi extends BaseAPI {
    /**
     * 
     * @summary Get Minecraft version manifest
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public getMinecraftVersionManifest(options?: RawAxiosRequestConfig) {
        return DefaultApiFp(this.configuration).getMinecraftVersionManifest(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Get Minecraft version package info
     * @param {string} packageId 
     * @param {string} versionId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public getMinecraftVersionPackageInfo(packageId: string, versionId: string, options?: RawAxiosRequestConfig) {
        return DefaultApiFp(this.configuration).getMinecraftVersionPackageInfo(packageId, versionId, options).then((request) => request(this.axios, this.basePath));
    }
}



