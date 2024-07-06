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
import type { V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient } from './V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient';
import {
    V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientFromJSON,
    V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientFromJSONTyped,
    V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientToJSON,
} from './V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient';

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
    client?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
    /**
     * 
     * @type {V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient}
     * @memberof V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
     */
    clientMappings?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
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
    serverMappings?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient;
}

/**
 * Check if a given object implements the V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads interface.
 */
export function instanceOfV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads(value: object): value is V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
    return true;
}

export function V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsFromJSON(json: any): V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
    return V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsFromJSONTyped(json, false);
}

export function V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsFromJSONTyped(json: any, ignoreDiscriminator: boolean): V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
    if (json == null) {
        return json;
    }
    return {
        
        'client': json['client'] == null ? undefined : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientFromJSON(json['client']),
        'clientMappings': json['client_mappings'] == null ? undefined : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientFromJSON(json['client_mappings']),
        'server': json['server'] == null ? undefined : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientFromJSON(json['server']),
        'serverMappings': json['server_mappings'] == null ? undefined : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientFromJSON(json['server_mappings']),
    };
}

export function V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsToJSON(value?: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'client': V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientToJSON(value['client']),
        'client_mappings': V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientToJSON(value['clientMappings']),
        'server': V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientToJSON(value['server']),
        'server_mappings': V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientToJSON(value['serverMappings']),
    };
}
