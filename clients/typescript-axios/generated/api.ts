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
 * @interface McGameVersionManifestGet200Response
 */
export interface McGameVersionManifestGet200Response {
    /**
     * 
     * @type {McGameVersionManifestGet200ResponseLatest}
     * @memberof McGameVersionManifestGet200Response
     */
    'latest'?: McGameVersionManifestGet200ResponseLatest;
    /**
     * 
     * @type {Array<McGameVersionManifestGet200ResponseVersionsInner>}
     * @memberof McGameVersionManifestGet200Response
     */
    'versions'?: Array<McGameVersionManifestGet200ResponseVersionsInner>;
}
/**
 * 
 * @export
 * @interface McGameVersionManifestGet200ResponseLatest
 */
export interface McGameVersionManifestGet200ResponseLatest {
    /**
     * 
     * @type {string}
     * @memberof McGameVersionManifestGet200ResponseLatest
     */
    'release'?: string;
    /**
     * 
     * @type {string}
     * @memberof McGameVersionManifestGet200ResponseLatest
     */
    'snapshot'?: string;
}
/**
 * 
 * @export
 * @interface McGameVersionManifestGet200ResponseVersionsInner
 */
export interface McGameVersionManifestGet200ResponseVersionsInner {
    /**
     * 
     * @type {string}
     * @memberof McGameVersionManifestGet200ResponseVersionsInner
     */
    'id'?: string;
    /**
     * 
     * @type {string}
     * @memberof McGameVersionManifestGet200ResponseVersionsInner
     */
    'type'?: string;
    /**
     * 
     * @type {string}
     * @memberof McGameVersionManifestGet200ResponseVersionsInner
     */
    'url'?: string;
    /**
     * 
     * @type {string}
     * @memberof McGameVersionManifestGet200ResponseVersionsInner
     */
    'time'?: string;
    /**
     * 
     * @type {string}
     * @memberof McGameVersionManifestGet200ResponseVersionsInner
     */
    'releaseTime'?: string;
}
/**
 * 
 * @export
 * @interface V1PackagesPackageIdVersionIdJsonGet200Response
 */
export interface V1PackagesPackageIdVersionIdJsonGet200Response {
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'version'?: string;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'assetIndex'?: V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'assets'?: number;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'complianceLevel'?: number;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'downloads'?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'id'?: string;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'javaVersion'?: V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'mainClass'?: string;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'minimumLauncherVersion'?: number;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'time'?: string;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'releaseTime'?: string;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    'type'?: string;
}
/**
 * 
 * @export
 * @interface V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
 */
export interface V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
     */
    'id'?: string;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
     */
    'sha1'?: string;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
     */
    'size'?: number;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
     */
    'totalSize'?: number;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
     */
    'url'?: string;
}
/**
 * 
 * @export
 * @interface V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
 */
export interface V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
     */
    'client'?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
     */
    'client_mappings'?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
     */
    'server'?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
     */
    'server_mappings'?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
}
/**
 * 
 * @export
 * @interface V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
 */
export interface V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
     */
    'sha1'?: string;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
     */
    'size'?: number;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
     */
    'url'?: string;
}
/**
 * 
 * @export
 * @interface V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
 */
export interface V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
     */
    'component'?: string;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
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
        mcGameVersionManifestGet: async (options: RawAxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/mc/game/version_manifest`;
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
         * @summary Get Minecraft version package details
         * @param {string} packageId 
         * @param {string} versionId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        v1PackagesPackageIdVersionIdJsonGet: async (packageId: string, versionId: string, options: RawAxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'packageId' is not null or undefined
            assertParamExists('v1PackagesPackageIdVersionIdJsonGet', 'packageId', packageId)
            // verify required parameter 'versionId' is not null or undefined
            assertParamExists('v1PackagesPackageIdVersionIdJsonGet', 'versionId', versionId)
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
        async mcGameVersionManifestGet(options?: RawAxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<McGameVersionManifestGet200Response>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.mcGameVersionManifestGet(options);
            const localVarOperationServerIndex = configuration?.serverIndex ?? 0;
            const localVarOperationServerBasePath = operationServerMap['DefaultApi.mcGameVersionManifestGet']?.[localVarOperationServerIndex]?.url;
            return (axios, basePath) => createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration)(axios, localVarOperationServerBasePath || basePath);
        },
        /**
         * 
         * @summary Get Minecraft version package details
         * @param {string} packageId 
         * @param {string} versionId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async v1PackagesPackageIdVersionIdJsonGet(packageId: string, versionId: string, options?: RawAxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<V1PackagesPackageIdVersionIdJsonGet200Response>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId, options);
            const localVarOperationServerIndex = configuration?.serverIndex ?? 0;
            const localVarOperationServerBasePath = operationServerMap['DefaultApi.v1PackagesPackageIdVersionIdJsonGet']?.[localVarOperationServerIndex]?.url;
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
        mcGameVersionManifestGet(options?: any): AxiosPromise<McGameVersionManifestGet200Response> {
            return localVarFp.mcGameVersionManifestGet(options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Get Minecraft version package details
         * @param {string} packageId 
         * @param {string} versionId 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        v1PackagesPackageIdVersionIdJsonGet(packageId: string, versionId: string, options?: any): AxiosPromise<V1PackagesPackageIdVersionIdJsonGet200Response> {
            return localVarFp.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId, options).then((request) => request(axios, basePath));
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
    public mcGameVersionManifestGet(options?: RawAxiosRequestConfig) {
        return DefaultApiFp(this.configuration).mcGameVersionManifestGet(options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Get Minecraft version package details
     * @param {string} packageId 
     * @param {string} versionId 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public v1PackagesPackageIdVersionIdJsonGet(packageId: string, versionId: string, options?: RawAxiosRequestConfig) {
        return DefaultApiFp(this.configuration).v1PackagesPackageIdVersionIdJsonGet(packageId, versionId, options).then((request) => request(this.axios, this.basePath));
    }
}



