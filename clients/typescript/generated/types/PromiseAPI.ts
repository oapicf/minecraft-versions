import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

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
    public getMinecraftVersionManifestWithHttpInfo(_options?: Configuration): Promise<HttpInfo<VersionManifest>> {
        const result = this.api.getMinecraftVersionManifestWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Get Minecraft version manifest
     */
    public getMinecraftVersionManifest(_options?: Configuration): Promise<VersionManifest> {
        const result = this.api.getMinecraftVersionManifest(_options);
        return result.toPromise();
    }

    /**
     * Get Minecraft version package info
     * @param packageId 
     * @param versionId 
     */
    public getMinecraftVersionPackageInfoWithHttpInfo(packageId: string, versionId: string, _options?: Configuration): Promise<HttpInfo<VersionPackageInfo>> {
        const result = this.api.getMinecraftVersionPackageInfoWithHttpInfo(packageId, versionId, _options);
        return result.toPromise();
    }

    /**
     * Get Minecraft version package info
     * @param packageId 
     * @param versionId 
     */
    public getMinecraftVersionPackageInfo(packageId: string, versionId: string, _options?: Configuration): Promise<VersionPackageInfo> {
        const result = this.api.getMinecraftVersionPackageInfo(packageId, versionId, _options);
        return result.toPromise();
    }


}



