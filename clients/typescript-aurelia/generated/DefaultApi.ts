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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  VersionPackageInfo,
  VersionManifest,
} from './models';

/**
 * getMinecraftVersionManifest - parameters interface
 */
export interface IGetMinecraftVersionManifestParams {
}

/**
 * getMinecraftVersionPackageInfo - parameters interface
 */
export interface IGetMinecraftVersionPackageInfoParams {
  packageId: string;
  versionId: string;
}

/**
 * DefaultApi - API class
 */
@autoinject()
export class DefaultApi extends Api {

  /**
   * Creates a new DefaultApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Get Minecraft version manifest
   */
  async getMinecraftVersionManifest(): Promise<VersionManifest> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/mc/game/version_manifest.json`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get Minecraft version package info
   * @param params.packageId 
   * @param params.versionId 
   */
  async getMinecraftVersionPackageInfo(params: IGetMinecraftVersionPackageInfoParams): Promise<VersionPackageInfo> {
    // Verify required parameters are set
    this.ensureParamIsSet('getMinecraftVersionPackageInfo', params, 'packageId');
    this.ensureParamIsSet('getMinecraftVersionPackageInfo', params, 'versionId');

    // Create URL to call
    const url = `${this.basePath}/v1/packages/{packageId}/{versionId}.json`
      .replace(`{${'packageId'}}`, encodeURIComponent(`${params['packageId']}`))
      .replace(`{${'versionId'}}`, encodeURIComponent(`${params['versionId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

