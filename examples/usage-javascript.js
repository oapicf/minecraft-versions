var MinecraftVersions = require('minecraftverse');

var api = new MinecraftVersions.DefaultApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
    process.exitCode = 1;
  } else {
    console.log('API called successfully. Returned data: ' + data);
    var versionManifest = data;
    var versions = versionManifest.versions;
    for (var i = 0; i < versions.length; i++) {
      var version = versions[i];
      console.log('version: ' + version.id);
      console.log('type: ' + version.type);
      console.log('url: ' + version.url);
    }
  }
};
api.getMinecraftVersionManifest(callback);
