import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { Download } from '../models/Download';
import { Version } from '../models/Version';
import { VersionManifest } from '../models/VersionManifest';
import { VersionManifestLatest } from '../models/VersionManifestLatest';
import { VersionPackageInfo } from '../models/VersionPackageInfo';
import { VersionPackageInfoAssetIndex } from '../models/VersionPackageInfoAssetIndex';
import { VersionPackageInfoDownloads } from '../models/VersionPackageInfoDownloads';
import { VersionPackageInfoJavaVersion } from '../models/VersionPackageInfoJavaVersion';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class ObservableDefaultApi {
    private requestFactory: DefaultApiRequestFactory;
    private responseProcessor: DefaultApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DefaultApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DefaultApiResponseProcessor();
    }

    /**
     * Get Minecraft version manifest
     */
    public getMinecraftVersionManifestWithHttpInfo(_options?: Configuration): Observable<HttpInfo<VersionManifest>> {
        const requestContextPromise = this.requestFactory.getMinecraftVersionManifest(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getMinecraftVersionManifestWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get Minecraft version manifest
     */
    public getMinecraftVersionManifest(_options?: Configuration): Observable<VersionManifest> {
        return this.getMinecraftVersionManifestWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<VersionManifest>) => apiResponse.data));
    }

    /**
     * Get Minecraft version package info
     * @param packageId
     * @param versionId
     */
    public getMinecraftVersionPackageInfoWithHttpInfo(packageId: string, versionId: string, _options?: Configuration): Observable<HttpInfo<VersionPackageInfo>> {
        const requestContextPromise = this.requestFactory.getMinecraftVersionPackageInfo(packageId, versionId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getMinecraftVersionPackageInfoWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get Minecraft version package info
     * @param packageId
     * @param versionId
     */
    public getMinecraftVersionPackageInfo(packageId: string, versionId: string, _options?: Configuration): Observable<VersionPackageInfo> {
        return this.getMinecraftVersionPackageInfoWithHttpInfo(packageId, versionId, _options).pipe(map((apiResponse: HttpInfo<VersionPackageInfo>) => apiResponse.data));
    }

}
