// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { GetMinecraftVersionManifest200Response } from '../models/GetMinecraftVersionManifest200Response';
import { V1PackagesPackageIdVersionIdJsonGet200Response } from '../models/V1PackagesPackageIdVersionIdJsonGet200Response';

/**
 * no description
 */
export class DefaultApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Get Minecraft version manifest
     */
    public async getMinecraftVersionManifest(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/mc/game/version_manifest.json';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Get Minecraft version package details
     * @param packageId 
     * @param versionId 
     */
    public async v1PackagesPackageIdVersionIdJsonGet(packageId: string, versionId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'packageId' is not null or undefined
        if (packageId === null || packageId === undefined) {
            throw new RequiredError("DefaultApi", "v1PackagesPackageIdVersionIdJsonGet", "packageId");
        }


        // verify required parameter 'versionId' is not null or undefined
        if (versionId === null || versionId === undefined) {
            throw new RequiredError("DefaultApi", "v1PackagesPackageIdVersionIdJsonGet", "versionId");
        }


        // Path Params
        const localVarPath = '/v1/packages/{packageId}/{versionId}.json'
            .replace('{' + 'packageId' + '}', encodeURIComponent(String(packageId)))
            .replace('{' + 'versionId' + '}', encodeURIComponent(String(versionId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class DefaultApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getMinecraftVersionManifest
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getMinecraftVersionManifestWithHttpInfo(response: ResponseContext): Promise<HttpInfo<GetMinecraftVersionManifest200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: GetMinecraftVersionManifest200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetMinecraftVersionManifest200Response", ""
            ) as GetMinecraftVersionManifest200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: GetMinecraftVersionManifest200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "GetMinecraftVersionManifest200Response", ""
            ) as GetMinecraftVersionManifest200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to v1PackagesPackageIdVersionIdJsonGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async v1PackagesPackageIdVersionIdJsonGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<V1PackagesPackageIdVersionIdJsonGet200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: V1PackagesPackageIdVersionIdJsonGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "V1PackagesPackageIdVersionIdJsonGet200Response", ""
            ) as V1PackagesPackageIdVersionIdJsonGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: V1PackagesPackageIdVersionIdJsonGet200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "V1PackagesPackageIdVersionIdJsonGet200Response", ""
            ) as V1PackagesPackageIdVersionIdJsonGet200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
