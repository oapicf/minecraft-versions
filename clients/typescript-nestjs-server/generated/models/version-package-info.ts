import { VersionPackageInfoDownloads } from './version-package-info-downloads';
import { VersionPackageInfoAssetIndex } from './version-package-info-asset-index';
import { VersionPackageInfoJavaVersion } from './version-package-info-java-version';


export interface VersionPackageInfo { 
  version?: string;
  assetIndex?: VersionPackageInfoAssetIndex;
  assets?: string;
  complianceLevel?: number;
  downloads?: VersionPackageInfoDownloads;
  id?: string;
  javaVersion?: VersionPackageInfoJavaVersion;
  mainClass?: string;
  minimumLauncherVersion?: number;
  time?: string;
  releaseTime?: string;
  type?: string;
}

