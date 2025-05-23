import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions } from '../configuration'
import type { Middleware } from '../middleware';

import { Download } from '../models/Download';
import { Version } from '../models/Version';
import { VersionManifest } from '../models/VersionManifest';
import { VersionManifestLatest } from '../models/VersionManifestLatest';
import { VersionPackageInfo } from '../models/VersionPackageInfo';
import { VersionPackageInfoAssetIndex } from '../models/VersionPackageInfoAssetIndex';
import { VersionPackageInfoDownloads } from '../models/VersionPackageInfoDownloads';
import { VersionPackageInfoJavaVersion } from '../models/VersionPackageInfoJavaVersion';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiGetMinecraftVersionManifestRequest {
}

export interface DefaultApiGetMinecraftVersionPackageInfoRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApigetMinecraftVersionPackageInfo
     */
    packageId: string
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApigetMinecraftVersionPackageInfo
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
    public getMinecraftVersionManifestWithHttpInfo(param: DefaultApiGetMinecraftVersionManifestRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<VersionManifest>> {
        return this.api.getMinecraftVersionManifestWithHttpInfo( options).toPromise();
    }

    /**
     * Get Minecraft version manifest
     * @param param the request object
     */
    public getMinecraftVersionManifest(param: DefaultApiGetMinecraftVersionManifestRequest = {}, options?: ConfigurationOptions): Promise<VersionManifest> {
        return this.api.getMinecraftVersionManifest( options).toPromise();
    }

    /**
     * Get Minecraft version package info
     * @param param the request object
     */
    public getMinecraftVersionPackageInfoWithHttpInfo(param: DefaultApiGetMinecraftVersionPackageInfoRequest, options?: ConfigurationOptions): Promise<HttpInfo<VersionPackageInfo>> {
        return this.api.getMinecraftVersionPackageInfoWithHttpInfo(param.packageId, param.versionId,  options).toPromise();
    }

    /**
     * Get Minecraft version package info
     * @param param the request object
     */
    public getMinecraftVersionPackageInfo(param: DefaultApiGetMinecraftVersionPackageInfoRequest, options?: ConfigurationOptions): Promise<VersionPackageInfo> {
        return this.api.getMinecraftVersionPackageInfo(param.packageId, param.versionId,  options).toPromise();
    }

}
