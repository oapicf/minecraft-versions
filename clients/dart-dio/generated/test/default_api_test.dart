import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for DefaultApi
void main() {
  final instance = Openapi().getDefaultApi();

  group(DefaultApi, () {
    // Get Minecraft version manifest
    //
    //Future<VersionManifest> getMinecraftVersionManifest() async
    test('test getMinecraftVersionManifest', () async {
      // TODO
    });

    // Get Minecraft version package info
    //
    //Future<VersionPackageInfo> getMinecraftVersionPackageInfo(String packageId, String versionId) async
    test('test getMinecraftVersionPackageInfo', () async {
      // TODO
    });

  });
}
