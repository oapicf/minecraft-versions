import { VersionManifestLatest } from './version-manifest-latest';
import { Version } from './version';


export interface VersionManifest { 
  latest?: VersionManifestLatest;
  versions?: Array<Version>;
}

