// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    Download,
    DownloadFromJSON,
    DownloadToJSON,
} from './';

/**
 * 
 * @export
 * @interface VersionPackageInfoDownloads
 */
export interface VersionPackageInfoDownloads  {
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
    clientMappings?: Download;
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
    serverMappings?: Download;
}

export function VersionPackageInfoDownloadsFromJSON(json: any): VersionPackageInfoDownloads {
    return {
        'client': !exists(json, 'client') ? undefined : DownloadFromJSON(json['client']),
        'clientMappings': !exists(json, 'client_mappings') ? undefined : DownloadFromJSON(json['client_mappings']),
        'server': !exists(json, 'server') ? undefined : DownloadFromJSON(json['server']),
        'serverMappings': !exists(json, 'server_mappings') ? undefined : DownloadFromJSON(json['server_mappings']),
    };
}

export function VersionPackageInfoDownloadsToJSON(value?: VersionPackageInfoDownloads): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'client': DownloadToJSON(value.client),
        'client_mappings': DownloadToJSON(value.clientMappings),
        'server': DownloadToJSON(value.server),
        'server_mappings': DownloadToJSON(value.serverMappings),
    };
}


