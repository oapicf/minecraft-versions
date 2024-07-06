var assert = require('assert');
var OpenapiJsClient = require('openapi-js-client');

const apiClient = new OpenapiJsClient.ApiClient('https://launchermeta.mojang.com');
const api = new OpenapiJsClient.DefaultApi(apiClient);

describe('minecraft versions', function() {
  it('should get manifest', function(done) {
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
});
