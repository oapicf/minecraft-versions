import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { McGameVersionManifestGet200Response } from '../models/McGameVersionManifestGet200Response';
import { McGameVersionManifestGet200ResponseLatest } from '../models/McGameVersionManifestGet200ResponseLatest';
import { McGameVersionManifestGet200ResponseVersionsInner } from '../models/McGameVersionManifestGet200ResponseVersionsInner';
import { V1PackagesPackageIdVersionIdJsonGet200Response } from '../models/V1PackagesPackageIdVersionIdJsonGet200Response';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient';
import { V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion } from '../models/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion';

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
    public mcGameVersionManifestGetWithHttpInfo(_options?: Configuration): Observable<HttpInfo<McGameVersionManifestGet200Response>> {
        const requestContextPromise = this.requestFactory.mcGameVersionManifestGet(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.mcGameVersionManifestGetWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get Minecraft version manifest
     */
    public mcGameVersionManifestGet(_options?: Configuration): Observable<McGameVersionManifestGet200Response> {
        return this.mcGameVersionManifestGetWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<McGameVersionManifestGet200Response>) => apiResponse.data));
    }

    /**
     * Get Minecraft version package details
     * @param packageId 
     * @param versionId 
     */
    public v1PackagesPackageIdVersionIdJsonGetWithHttpInfo(packageId: string, versionId: string, _options?: Configuration): Observable<HttpInfo<V1PackagesPackageIdVersionIdJsonGet200Response>> {
        const requestContextPromise = this.requestFactory.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1PackagesPackageIdVersionIdJsonGetWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get Minecraft version package details
     * @param packageId 
     * @param versionId 
     */
    public v1PackagesPackageIdVersionIdJsonGet(packageId: string, versionId: string, _options?: Configuration): Observable<V1PackagesPackageIdVersionIdJsonGet200Response> {
        return this.v1PackagesPackageIdVersionIdJsonGetWithHttpInfo(packageId, versionId, _options).pipe(map((apiResponse: HttpInfo<V1PackagesPackageIdVersionIdJsonGet200Response>) => apiResponse.data));
    }

}
