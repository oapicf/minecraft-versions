import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for DefaultApi
void main() {
  final instance = Openapi().getDefaultApi();

  group(DefaultApi, () {
    // Get Minecraft version manifest
    //
    //Future<McGameVersionManifestGet200Response> mcGameVersionManifestGet() async
    test('test mcGameVersionManifestGet', () async {
      // TODO
    });

    // Get Minecraft version package details
    //
    //Future<V1PackagesPackageIdVersionIdJsonGet200Response> v1PackagesPackageIdVersionIdJsonGet(String packageId, String versionId) async
    test('test v1PackagesPackageIdVersionIdJsonGet', () async {
      // TODO
    });

  });
}
