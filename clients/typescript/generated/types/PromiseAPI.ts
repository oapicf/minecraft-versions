import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, PromiseConfigurationOptions, wrapOptions } from '../configuration'
import { PromiseMiddleware, Middleware, PromiseMiddlewareWrapper } from '../middleware';

import { Download } from '../models/Download';
import { Version } from '../models/Version';
import { VersionManifest } from '../models/VersionManifest';
import { VersionManifestLatest } from '../models/VersionManifestLatest';
import { VersionPackageInfo } from '../models/VersionPackageInfo';
import { VersionPackageInfoAssetIndex } from '../models/VersionPackageInfoAssetIndex';
import { VersionPackageInfoDownloads } from '../models/VersionPackageInfoDownloads';
import { VersionPackageInfoJavaVersion } from '../models/VersionPackageInfoJavaVersion';
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
    public getMinecraftVersionManifestWithHttpInfo(_options?: PromiseConfigurationOptions): Promise<HttpInfo<VersionManifest>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getMinecraftVersionManifestWithHttpInfo(observableOptions);
        return result.toPromise();
    }

    /**
     * Get Minecraft version manifest
     */
    public getMinecraftVersionManifest(_options?: PromiseConfigurationOptions): Promise<VersionManifest> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getMinecraftVersionManifest(observableOptions);
        return result.toPromise();
    }

    /**
     * Get Minecraft version package info
     * @param packageId
     * @param versionId
     */
    public getMinecraftVersionPackageInfoWithHttpInfo(packageId: string, versionId: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<VersionPackageInfo>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getMinecraftVersionPackageInfoWithHttpInfo(packageId, versionId, observableOptions);
        return result.toPromise();
    }

    /**
     * Get Minecraft version package info
     * @param packageId
     * @param versionId
     */
    public getMinecraftVersionPackageInfo(packageId: string, versionId: string, _options?: PromiseConfigurationOptions): Promise<VersionPackageInfo> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getMinecraftVersionPackageInfo(packageId, versionId, observableOptions);
        return result.toPromise();
    }


}



