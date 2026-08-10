import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { DefaultApi } from '../api';
import { VersionManifest, VersionPackageInfo,  } from '../models';

@Controller()
export class DefaultApiController {
  constructor(private readonly defaultApi: DefaultApi) {}

  @Get('/mc/game/version_manifest.json')
  getMinecraftVersionManifest(@Req() request: Request): VersionManifest | Promise<VersionManifest> | Observable<VersionManifest> {
    return this.defaultApi.getMinecraftVersionManifest(request);
  }

  @Get('/v1/packages/:packageId/:versionId.json')
  getMinecraftVersionPackageInfo(@Param('packageId') packageId: string, @Param('versionId') versionId: string, @Req() request: Request): VersionPackageInfo | Promise<VersionPackageInfo> | Observable<VersionPackageInfo> {
    return this.defaultApi.getMinecraftVersionPackageInfo(packageId, versionId, request);
  }

} 