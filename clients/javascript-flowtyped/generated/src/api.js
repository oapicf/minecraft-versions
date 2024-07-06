// @flow
/* eslint-disable no-use-before-define */
/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as url from "url";
import * as portableFetch from "portable-fetch";
import { Configuration } from "./configuration";

const BASE_PATH: string = "https://launchermeta.mojang.com".replace(/\/+$/, "");

/**
 *
 * @export
 */
export const COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};

/**
 *
 * @export
 */
export type FetchAPI = {
    (url: string, init?: any): Promise<Response>;
}

/**
 *
 * @export
 */
export type FetchArgs = {
    url: string;
    options: {};
}

/**
 *
 * @export
 */
export type RequestOptions = {
    headers?: {};
    query?: {};
    body?: string | FormData;
}

/**
 * * @export
 * @class RequiredError
 * @extends {Error}
 */
export class RequiredError extends Error {
    name:string = "RequiredError"
    constructor(field: string, msg?: string) {
        super(msg);
    }
}

/**
 * 
 * @export
 */
export type GetMinecraftVersionManifest200Response = {
    /**
     * 
     * @type {GetMinecraftVersionManifest200ResponseLatest}
     * @memberof GetMinecraftVersionManifest200Response
     */
    latest?: GetMinecraftVersionManifest200ResponseLatest;
    /**
     * 
     * @type {Array<GetMinecraftVersionManifest200ResponseVersionsInner>}
     * @memberof GetMinecraftVersionManifest200Response
     */
    versions?: Array<GetMinecraftVersionManifest200ResponseVersionsInner>;
}

/**
 * 
 * @export
 */
export type GetMinecraftVersionManifest200ResponseLatest = {
    /**
     * 
     * @type {string}
     * @memberof GetMinecraftVersionManifest200ResponseLatest
     */
    release?: string;
    /**
     * 
     * @type {string}
     * @memberof GetMinecraftVersionManifest200ResponseLatest
     */
    snapshot?: string;
}

/**
 * 
 * @export
 */
export type GetMinecraftVersionManifest200ResponseVersionsInner = {
    /**
     * 
     * @type {string}
     * @memberof GetMinecraftVersionManifest200ResponseVersionsInner
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof GetMinecraftVersionManifest200ResponseVersionsInner
     */
    type?: string;
    /**
     * 
     * @type {string}
     * @memberof GetMinecraftVersionManifest200ResponseVersionsInner
     */
    url?: string;
    /**
     * 
     * @type {Date}
     * @memberof GetMinecraftVersionManifest200ResponseVersionsInner
     */
    time?: Date;
    /**
     * 
     * @type {Date}
     * @memberof GetMinecraftVersionManifest200ResponseVersionsInner
     */
    releaseTime?: Date;
}

/**
 * 
 * @export
 */
export type V1PackagesPackageIdVersionIdJsonGet200Response = {
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    version?: string;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    assetIndex?: V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    assets?: number;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    complianceLevel?: number;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    downloads?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    id?: string;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    javaVersion?: V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    mainClass?: string;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    minimumLauncherVersion?: number;
    /**
     * 
     * @type {Date}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    time?: Date;
    /**
     * 
     * @type {Date}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    releaseTime?: Date;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200Response
     */
    type?: string;
}

/**
 * 
 * @export
 */
export type V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex = {
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
     */
    sha1?: string;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
     */
    size?: number;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
     */
    totalSize?: number;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
     */
    url?: string;
}

/**
 * 
 * @export
 */
export type V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads = {
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
     */
    client?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
     */
    client_mappings?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
     */
    server?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
     */
    server_mappings?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
}

/**
 * 
 * @export
 */
export type V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient = {
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
     */
    sha1?: string;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
     */
    size?: number;
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
     */
    url?: string;
}

/**
 * 
 * @export
 */
export type V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion = {
    /**
     * 
     * @type {string}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
     */
    component?: string;
    /**
     * 
     * @type {number}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
     */
    majorVersion?: number;
}



/**
 * DefaultApi - fetch parameter creator
 * @export
 */
export const DefaultApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Get Minecraft version manifest
         * @throws {RequiredError}
         */
        getMinecraftVersionManifest(options: RequestOptions): FetchArgs {
            const localVarPath = `/mc/game/version_manifest.json`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            localVarUrlObj.search = null;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Get Minecraft version package details
         * @throws {RequiredError}
         */
        v1PackagesPackageIdVersionIdJsonGet(packageId: string, versionId: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'packageId' is not null or undefined
            if (packageId === null || packageId === undefined) {
                throw new RequiredError('packageId','Required parameter packageId was null or undefined when calling v1PackagesPackageIdVersionIdJsonGet.');
            }
            // verify required parameter 'versionId' is not null or undefined
            if (versionId === null || versionId === undefined) {
                throw new RequiredError('versionId','Required parameter versionId was null or undefined when calling v1PackagesPackageIdVersionIdJsonGet.');
            }
            const localVarPath = `/v1/packages/{packageId}/{versionId}.json`
                .replace(`{${"packageId"}}`, encodeURIComponent(String(packageId)))
                .replace(`{${"versionId"}}`, encodeURIComponent(String(versionId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            localVarUrlObj.search = null;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type DefaultApiType = { 
    getMinecraftVersionManifest(options?: RequestOptions): Promise<GetMinecraftVersionManifest200Response>,

    v1PackagesPackageIdVersionIdJsonGet(packageId: string, versionId: string, options?: RequestOptions): Promise<V1PackagesPackageIdVersionIdJsonGet200Response>,
}

/**
 * DefaultApi - factory function to inject configuration 
 * @export
 */
export const DefaultApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): DefaultApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * 
         * @summary Get Minecraft version manifest
         * @throws {RequiredError}
         */
        getMinecraftVersionManifest(options?: RequestOptions = {}): Promise<GetMinecraftVersionManifest200Response> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).getMinecraftVersionManifest(options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * 
         * @summary Get Minecraft version package details
         * @throws {RequiredError}
         */
        v1PackagesPackageIdVersionIdJsonGet(packageId: string, versionId: string, options?: RequestOptions = {}): Promise<V1PackagesPackageIdVersionIdJsonGet200Response> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).v1PackagesPackageIdVersionIdJsonGet(packageId, versionId, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};


export type ApiTypes = { 
    DefaultApi: DefaultApiType,
 }
