// tslint:disable
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

import type {
    Download,
} from './';

/**
 * @export
 * @interface VersionPackageInfoDownloads
 */
export interface VersionPackageInfoDownloads {
    /**
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    client?: Download;
    /**
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    client_mappings?: Download;
    /**
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    server?: Download;
    /**
     * @type {Download}
     * @memberof VersionPackageInfoDownloads
     */
    server_mappings?: Download;
}
