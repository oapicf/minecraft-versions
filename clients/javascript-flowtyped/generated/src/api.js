// @flow
/* eslint-disable no-use-before-define */
/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.12.1-pre.0
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
export type Download = {
    /**
     * 
     * @type {string}
     * @memberof Download
     */
    sha1?: string;
    /**
     * 
     * @type {number}
     * @memberof Download
     */
    size?: number;
    /**
     * 
     * @type {string}
     * @memberof Download
     */
    url?: string;
}

/**
 * 
 * @export
 */
export type Version = {
    /**
     * 
     * @type {string}
     * @memberof Version
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof Version
     */
    type?: string;
    /**
     * 
     * @type {string}
     * @memberof Version
     */
    url?: string;
    /**
     * 
     * @type {Date}
     * @memberof Version
     */
    time?: Date;
    /**
     * 
     * @type {Date}
     * @memberof Version
     */
    releaseTime?: Date;
}

/**
 * 
 * @export
 */
export type VersionManifest = {
    /**
     * 
     * @type {VersionManifestLatest}
     * @memberof VersionManifest
     */
    latest?: VersionManifestLatest;
    /**
     * 
     * @type {Array<Version>}
     * @memberof VersionManifest
     */
    versions?: Array<Version>;
}

/**
 * 
 * @export
 */
export type VersionManifestLatest = {
    /**
     * 
     * @type {string}
     * @memberof VersionManifestLatest
     */
    release?: string;
    /**
     * 
     * @type {string}
     * @memberof VersionManifestLatest
     */
    snapshot?: string;
}

/**
 * 
 * @export
 */
export type VersionPackageInfo = {
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
 * 
 * @export
 */
export type VersionPackageInfoAssetIndex = {
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfoAssetIndex
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfoAssetIndex
     */
    sha1?: string;
    /**
     * 
     * @type {number}
     * @memberof VersionPackageInfoAssetIndex
     */
    size?: number;
    /**
     * 
     * @type {number}
     * @memberof VersionPackageInfoAssetIndex
     */
    totalSize?: number;
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfoAssetIndex
     */
    url?: string;
}

/**
 * 
 * @export
 */
export type VersionPackageInfoDownloads = {
    /**
     * 
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    client?: Download;
    /**
     * 
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    client_mappings?: Download;
    /**
     * 
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    server?: Download;
    /**
     * 
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    server_mappings?: Download;
}

/**
 * 
 * @export
 */
export type VersionPackageInfoJavaVersion = {
    /**
     * 
     * @type {string}
     * @memberof VersionPackageInfoJavaVersion
     */
    component?: string;
    /**
     * 
     * @type {number}
     * @memberof VersionPackageInfoJavaVersion
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
         * @summary Get Minecraft version package info
         * @throws {RequiredError}
         */
        getMinecraftVersionPackageInfo(packageId: string, versionId: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'packageId' is not null or undefined
            if (packageId === null || packageId === undefined) {
                throw new RequiredError('packageId','Required parameter packageId was null or undefined when calling getMinecraftVersionPackageInfo.');
            }
            // verify required parameter 'versionId' is not null or undefined
            if (versionId === null || versionId === undefined) {
                throw new RequiredError('versionId','Required parameter versionId was null or undefined when calling getMinecraftVersionPackageInfo.');
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
    getMinecraftVersionManifest(options?: RequestOptions): Promise<VersionManifest>,

    getMinecraftVersionPackageInfo(packageId: string, versionId: string, options?: RequestOptions): Promise<VersionPackageInfo>,
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
        getMinecraftVersionManifest(options?: RequestOptions = {}): Promise<VersionManifest> {
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
         * @summary Get Minecraft version package info
         * @throws {RequiredError}
         */
        getMinecraftVersionPackageInfo(packageId: string, versionId: string, options?: RequestOptions = {}): Promise<VersionPackageInfo> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).getMinecraftVersionPackageInfo(packageId, versionId, options);
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
