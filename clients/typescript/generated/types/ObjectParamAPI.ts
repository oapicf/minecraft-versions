import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { GetMinecraftVersionManifest200Response } from '../models/GetMinecraftVersionManifest200Response';
import { GetMinecraftVersionManifest200ResponseLatest } from '../models/GetMinecraftVersionManifest200ResponseLatest';
import { GetMinecraftVersionManifest200ResponseVersionsInner } from '../models/GetMinecraftVersionManifest200ResponseVersionsInner';
import { V1PackagesPackageIdVersionIdJsonGet200Response } from '../models/V1PackagesPackageIdVersionIdJsonGet200Response';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiGetMinecraftVersionManifestRequest {
}

export interface DefaultApiV1PackagesPackageIdVersionIdJsonGetRequest {
    /**
     * 
     * @type string
     * @memberof DefaultApiv1PackagesPackageIdVersionIdJsonGet
     */
    packageId: string
    /**
     * 
     * @type string
     * @memberof DefaultApiv1PackagesPackageIdVersionIdJsonGet
     */
    versionId: string
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get Minecraft version manifest
     * @param param the request object
     */
    public getMinecraftVersionManifestWithHttpInfo(param: DefaultApiGetMinecraftVersionManifestRequest = {}, options?: Configuration): Promise<HttpInfo<GetMinecraftVersionManifest200Response>> {
        return this.api.getMinecraftVersionManifestWithHttpInfo( options).toPromise();
    }

    /**
     * Get Minecraft version manifest
     * @param param the request object
     */
    public getMinecraftVersionManifest(param: DefaultApiGetMinecraftVersionManifestRequest = {}, options?: Configuration): Promise<GetMinecraftVersionManifest200Response> {
        return this.api.getMinecraftVersionManifest( options).toPromise();
    }

    /**
     * Get Minecraft version package details
     * @param param the request object
     */
    public v1PackagesPackageIdVersionIdJsonGetWithHttpInfo(param: DefaultApiV1PackagesPackageIdVersionIdJsonGetRequest, options?: Configuration): Promise<HttpInfo<V1PackagesPackageIdVersionIdJsonGet200Response>> {
        return this.api.v1PackagesPackageIdVersionIdJsonGetWithHttpInfo(param.packageId, param.versionId,  options).toPromise();
    }

    /**
     * Get Minecraft version package details
     * @param param the request object
     */
    public v1PackagesPackageIdVersionIdJsonGet(param: DefaultApiV1PackagesPackageIdVersionIdJsonGetRequest, options?: Configuration): Promise<V1PackagesPackageIdVersionIdJsonGet200Response> {
        return this.api.v1PackagesPackageIdVersionIdJsonGet(param.packageId, param.versionId,  options).toPromise();
    }

}
