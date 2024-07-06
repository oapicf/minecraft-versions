var assert = require('assert');
var OpenapiJsClient = require('openapi-js-client');

describe('minecraft versions', function() {

  it('should get version manifest', function(done) {

    const apiClient = new OpenapiJsClient.ApiClient('https://launchermeta.mojang.com');
    const api = new OpenapiJsClient.DefaultApi(apiClient);

    var callback = function(error, data, response) {
      if (error) {
        done(error);
      } else {
        console.log('API called successfully. Returned data: ' + data);
        done();
      }
    };
    api.getMinecraftVersionManifest(callback);
  });

  it('should get version package info', function(done) {

    const apiClient = new OpenapiJsClient.ApiClient('https://piston-meta.mojang.com');
    const api = new OpenapiJsClient.DefaultApi(apiClient);

    var callback = function(error, data, response) {
      if (error) {
        done(error);
      } else {
        console.log('API called successfully. Returned data: ' + data);
        done();
      }
    };
    api.getMinecraftVersionPackageInfo('177e49d3233cb6eac42f0495c0a48e719870c2ae', '1.21', callback);
  });

});
