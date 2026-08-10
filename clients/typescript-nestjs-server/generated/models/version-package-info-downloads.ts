import { Download } from './download';


export interface VersionPackageInfoDownloads { 
  client?: Download;
  client_mappings?: Download;
  server?: Download;
  server_mappings?: Download;
}

