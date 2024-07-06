@isTest
private class OASDefaultApiTest {
    /**
     * Get Minecraft version manifest
     *
     * 
     */
    @isTest
    private static void getMinecraftVersionManifestTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASDefaultApi api;
        OASVersionManifest response;
        OASVersionManifest expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASVersionManifest.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVersionManifest.getExample();
        response = (OASVersionManifest) api.getMinecraftVersionManifest();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Minecraft version package info
     *
     * 
     */
    @isTest
    private static void getMinecraftVersionPackageInfoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'packageId' => 177e49d3233cb6eac42f0495c0a48e719870c2ae,
            'versionId' => 1.21
        };

        OASClient client;
        OASDefaultApi api;
        OASVersionPackageInfo response;
        OASVersionPackageInfo expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASVersionPackageInfo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVersionPackageInfo.getExample();
        response = (OASVersionPackageInfo) api.getMinecraftVersionPackageInfo(params);
        System.assertEquals(expectedResponse, response);
    }
}