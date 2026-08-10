import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { VersionManifest, VersionPackageInfo,  } from '../models';


@Injectable()
export abstract class DefaultApi {

  abstract getMinecraftVersionManifest( request: Request): VersionManifest | Promise<VersionManifest> | Observable<VersionManifest>;


  abstract getMinecraftVersionPackageInfo(packageId: string, versionId: string,  request: Request): VersionPackageInfo | Promise<VersionPackageInfo> | Observable<VersionPackageInfo>;

} 