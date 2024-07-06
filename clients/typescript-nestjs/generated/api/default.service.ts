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
 */
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional } from '@nestjs/common';
import { HttpService } from '@nestjs/axios';
import { AxiosResponse } from 'axios';
import { Observable, from, of, switchMap } from 'rxjs';
import { GetMinecraftVersionManifest200Response } from '../model/getMinecraftVersionManifest200Response';
import { V1PackagesPackageIdVersionIdJsonGet200Response } from '../model/v1PackagesPackageIdVersionIdJsonGet200Response';
import { Configuration } from '../configuration';
import { COLLECTION_FORMATS } from '../variables';


@Injectable()
export class DefaultService {

    protected basePath = 'https://launchermeta.mojang.com';
    public defaultHeaders: Record<string,string> = {};
    public configuration = new Configuration();

    constructor(protected httpClient: HttpService, @Optional() configuration: Configuration) {
        this.configuration = configuration || this.configuration;
        this.basePath = configuration?.basePath || this.basePath;
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        return consumes.includes(form);
    }

    /**
     * Get Minecraft version manifest
     * 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getMinecraftVersionManifest(): Observable<AxiosResponse<GetMinecraftVersionManifest200Response>>;
    public getMinecraftVersionManifest(): Observable<any> {

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return accessTokenObservable.pipe(
            switchMap((accessToken) => {
                if (accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.get<GetMinecraftVersionManifest200Response>(`${this.basePath}/mc/game/version_manifest.json`,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Get Minecraft version package details
     * 
     * @param packageId 
     * @param versionId 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public v1PackagesPackageIdVersionIdJsonGet(packageId: string, versionId: string, ): Observable<AxiosResponse<V1PackagesPackageIdVersionIdJsonGet200Response>>;
    public v1PackagesPackageIdVersionIdJsonGet(packageId: string, versionId: string, ): Observable<any> {

        if (packageId === null || packageId === undefined) {
            throw new Error('Required parameter packageId was null or undefined when calling v1PackagesPackageIdVersionIdJsonGet.');
        }

        if (versionId === null || versionId === undefined) {
            throw new Error('Required parameter versionId was null or undefined when calling v1PackagesPackageIdVersionIdJsonGet.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return accessTokenObservable.pipe(
            switchMap((accessToken) => {
                if (accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.get<V1PackagesPackageIdVersionIdJsonGet200Response>(`${this.basePath}/v1/packages/${encodeURIComponent(String(packageId))}/${encodeURIComponent(String(versionId))}.json`,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
}
