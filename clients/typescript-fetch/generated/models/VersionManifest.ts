/* tslint:disable */
/* eslint-disable */
/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { VersionManifestLatest } from './VersionManifestLatest';
import {
    VersionManifestLatestFromJSON,
    VersionManifestLatestFromJSONTyped,
    VersionManifestLatestToJSON,
    VersionManifestLatestToJSONTyped,
} from './VersionManifestLatest';
import type { Version } from './Version';
import {
    VersionFromJSON,
    VersionFromJSONTyped,
    VersionToJSON,
    VersionToJSONTyped,
} from './Version';

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
    latest?: VersionManifestLatest;
    /**
     * 
     * @type {Array<Version>}
     * @memberof VersionManifest
     */
    versions?: Array<Version>;
}

/**
 * Check if a given object implements the VersionManifest interface.
 */
export function instanceOfVersionManifest(value: object): value is VersionManifest {
    return true;
}

export function VersionManifestFromJSON(json: any): VersionManifest {
    return VersionManifestFromJSONTyped(json, false);
}

export function VersionManifestFromJSONTyped(json: any, ignoreDiscriminator: boolean): VersionManifest {
    if (json == null) {
        return json;
    }
    return {
        
        'latest': json['latest'] == null ? undefined : VersionManifestLatestFromJSON(json['latest']),
        'versions': json['versions'] == null ? undefined : ((json['versions'] as Array<any>).map(VersionFromJSON)),
    };
}

export function VersionManifestToJSON(json: any): VersionManifest {
    return VersionManifestToJSONTyped(json, false);
}

export function VersionManifestToJSONTyped(value?: VersionManifest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'latest': VersionManifestLatestToJSON(value['latest']),
        'versions': value['versions'] == null ? undefined : ((value['versions'] as Array<any>).map(VersionToJSON)),
    };
}

