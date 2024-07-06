@isTest
private class OASDefaultApiTest {
    /**
     * Get Minecraft version manifest
     *
     * 
     */
    @isTest
    private static void mcGameVersionManifestGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASDefaultApi api;
        OASMcGameVersionManifestGet200Respon response;
        OASMcGameVersionManifestGet200Respon expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASMcGameVersionManifestGet200Respon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMcGameVersionManifestGet200Respon.getExample();
        response = (OASMcGameVersionManifestGet200Respon) api.mcGameVersionManifestGet();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get Minecraft version package details
     *
     * 
     */
    @isTest
    private static void v1PackagesPackageIdVersionIdJsonGetTest() {
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
        OASV1PackagesPackageIdVersionIdJsonG response;
        OASV1PackagesPackageIdVersionIdJsonG expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASV1PackagesPackageIdVersionIdJsonG.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASV1PackagesPackageIdVersionIdJsonG.getExample();
        response = (OASV1PackagesPackageIdVersionIdJsonG) api.v1PackagesPackageIdVersionIdJsonGet(params);
        System.assertEquals(expectedResponse, response);
    }
}