/**
 * 
 * SDK for Minecraft versions info
 *
 * OpenAPI spec version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Download } from '../models/Download';
import { HttpFile } from '../http/http';

export class VersionPackageInfoDownloads {
    'client'?: Download;
    'clientMappings'?: Download;
    'server'?: Download;
    'serverMappings'?: Download;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "client",
            "baseName": "client",
            "type": "Download",
            "format": ""
        },
        {
            "name": "clientMappings",
            "baseName": "client_mappings",
            "type": "Download",
            "format": ""
        },
        {
            "name": "server",
            "baseName": "server",
            "type": "Download",
            "format": ""
        },
        {
            "name": "serverMappings",
            "baseName": "server_mappings",
            "type": "Download",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return VersionPackageInfoDownloads.attributeTypeMap;
    }

    public constructor() {
    }
}

