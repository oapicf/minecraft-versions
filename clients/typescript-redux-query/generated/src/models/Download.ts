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
/**
 * 
 * @export
 * @interface Download
 */
export interface Download  {
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

export function DownloadFromJSON(json: any): Download {
    return {
        'sha1': !exists(json, 'sha1') ? undefined : json['sha1'],
        'size': !exists(json, 'size') ? undefined : json['size'],
        'url': !exists(json, 'url') ? undefined : json['url'],
    };
}

export function DownloadToJSON(value?: Download): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'sha1': value.sha1,
        'size': value.size,
        'url': value.url,
    };
}


