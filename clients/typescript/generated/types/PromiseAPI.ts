import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { McGameVersionManifestGet200Response } from '../models/McGameVersionManifestGet200Response';
import { McGameVersionManifestGet200ResponseLatest } from '../models/McGameVersionManifestGet200ResponseLatest';
import { McGameVersionManifestGet200ResponseVersionsInner } from '../models/McGameVersionManifestGet200ResponseVersionsInner';
import { V1PackagesPackageIdVersionIdJsonGet200Response } from '../models/V1PackagesPackageIdVersionIdJsonGet200Response';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion';
import { ObservableDefaultApi } from './ObservableAPI';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class PromiseDefaultApi {
    private api: ObservableDefaultApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get Minecraft version manifest
     */
    public mcGameVersionManifestGetWithHttpInfo(_options?: Configuration): Promise<HttpInfo<McGameVersionManifestGet200Response>> {
        const result = this.api.mcGameVersionManifestGetWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Get Minecraft version manifest
     */
    public mcGameVersionManifestGet(_options?: Configuration): Promise<McGameVersionManifestGet200Response> {
        const result = this.api.mcGameVersionManifestGet(_options);
        return result.toPromise();
    }

    /**
     * Get Minecraft version package details
     * @param packageId 
     * @param versionId 
     */
    public v1PackagesPackageIdVersionIdJsonGetWithHttpInfo(packageId: string, versionId: string, _options?: Configuration): Promise<HttpInfo<V1PackagesPackageIdVersionIdJsonGet200Response>> {
        const result = this.api.v1PackagesPackageIdVersionIdJsonGetWithHttpInfo(packageId, versionId, _options);
        return result.toPromise();
    }

    /**
     * Get Minecraft version package details
     * @param packageId 
     * @param versionId 
     */
    public v1PackagesPackageIdVersionIdJsonGet(packageId: string, versionId: string, _options?: Configuration): Promise<V1PackagesPackageIdVersionIdJsonGet200Response> {
        const result = this.api.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId, _options);
        return result.toPromise();
    }


}



