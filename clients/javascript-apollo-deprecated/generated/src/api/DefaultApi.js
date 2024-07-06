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
 *
 */



import ApiClient from "../ApiClient";
import McGameVersionManifestGet200Response from '../model/McGameVersionManifestGet200Response';
import V1PackagesPackageIdVersionIdJsonGet200Response from '../model/V1PackagesPackageIdVersionIdJsonGet200Response';

/**
* Default service.
* @module api/DefaultApi
* @version 0.9.0-pre.0
*/
export default class DefaultApi extends ApiClient {

    /**
    * Constructs a new DefaultApi. 
    * @alias module:api/DefaultApi
    * @class
    */
    constructor(baseURL = 'https://launchermeta.mojang.com') {
      super(baseURL);
    }


    /**
     * Get Minecraft version manifest
     * @param requestInit Dynamic configuration. @see {@link https://github.com/apollographql/apollo-server/pull/1277}
     * @return {Promise<module:model/McGameVersionManifestGet200Response>}
     */
    async mcGameVersionManifestGet(requestInit) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/0.9.0-pre.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = McGameVersionManifestGet200Response;

      return this.callApi(
        '/mc/game/version_manifest', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, requestInit
      );
    }

    /**
     * Get Minecraft version package details
     * @param {String} packageId 
     * @param {String} versionId 
     * @param requestInit Dynamic configuration. @see {@link https://github.com/apollographql/apollo-server/pull/1277}
     * @return {Promise<module:model/V1PackagesPackageIdVersionIdJsonGet200Response>}
     */
    async v1PackagesPackageIdVersionIdJsonGet(packageId, versionId, requestInit) {
      let postBody = null;
      // verify the required parameter 'packageId' is set
      if (packageId === undefined || packageId === null) {
        throw new Error("Missing the required parameter 'packageId' when calling v1PackagesPackageIdVersionIdJsonGet");
      }
      // verify the required parameter 'versionId' is set
      if (versionId === undefined || versionId === null) {
        throw new Error("Missing the required parameter 'versionId' when calling v1PackagesPackageIdVersionIdJsonGet");
      }

      let pathParams = {
        'packageId': packageId,
        'versionId': versionId
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/0.9.0-pre.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = V1PackagesPackageIdVersionIdJsonGet200Response;

      return this.callApi(
        '/v1/packages/{packageId}/{versionId}.json', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, requestInit
      );
    }


}