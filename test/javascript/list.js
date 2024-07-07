var assert = require('assert');
var MinecraftVersions = require('minecraftverse');

describe('minecraft versions', function() {

  it('should get version manifest', function(done) {

    const apiClient = new MinecraftVersions.ApiClient('https://launchermeta.mojang.com');
    const api = new MinecraftVersions.DefaultApi(apiClient);

    var callback = function(error, data, response) {
      if (error) {
        done(error);
      } else {
        console.log('API called successfully. Returned data: ' + data);
        const versionManifest = data;
        const versions = versionManifest.versions;
        for (var i = 0; i < versions.length; i++) {
          const version = versions[i];
          console.log('version: ' + version.id);
          console.log('type: ' + version.type);
          console.log('url: ' + version.url);
        }
        done();
      }
    };
    api.getMinecraftVersionManifest(callback);
  });

  it('should get version package info', function(done) {

    const apiClient = new MinecraftVersions.ApiClient('https://piston-meta.mojang.com');
    const api = new MinecraftVersions.DefaultApi(apiClient);

    var callback = function(error, data, response) {
      if (error) {
        done(error);
      } else {
        console.log('API called successfully. Returned data: ' + data);
        const versionPackageInfo = data;
        console.log('version: ' + versionPackageInfo.id);
        assert.equal(typeof(versionPackageInfo.id), 'string')
        console.log('type: ' + versionPackageInfo.type);
        assert.equal(typeof(versionPackageInfo.type), 'string')
        const downloads = versionPackageInfo.downloads;
        for (var key in downloads) {
          console.log('download: ' + key);
          assert.equal(typeof(key), 'string')
          console.log('sha1: ' + downloads[key].sha1);
          assert.equal(typeof(downloads[key].sha1), 'string')
          console.log('size: ' + downloads[key].size);
          assert.equal(typeof(downloads[key].size), 'number')
          console.log('url: ' + downloads[key].url);
          assert.equal(typeof(downloads[key].url), 'string')
        }
        done();
      }
    };
    api.getMinecraftVersionPackageInfo('177e49d3233cb6eac42f0495c0a48e719870c2ae', '1.21', callback);
  });

});
