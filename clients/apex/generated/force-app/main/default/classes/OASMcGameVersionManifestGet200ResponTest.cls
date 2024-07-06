@isTest
private class OASMcGameVersionManifestGet200ResponTest {
    @isTest
    private static void equalsSameInstance() {
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response1 = OASMcGameVersionManifestGet200Respon.getExample();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response2 = mcGameVersionManifestGet200Response1;
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response3 = new OASMcGameVersionManifestGet200Respon();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response4 = mcGameVersionManifestGet200Response3;

        System.assert(mcGameVersionManifestGet200Response1.equals(mcGameVersionManifestGet200Response2));
        System.assert(mcGameVersionManifestGet200Response2.equals(mcGameVersionManifestGet200Response1));
        System.assert(mcGameVersionManifestGet200Response1.equals(mcGameVersionManifestGet200Response1));
        System.assert(mcGameVersionManifestGet200Response3.equals(mcGameVersionManifestGet200Response4));
        System.assert(mcGameVersionManifestGet200Response4.equals(mcGameVersionManifestGet200Response3));
        System.assert(mcGameVersionManifestGet200Response3.equals(mcGameVersionManifestGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response1 = OASMcGameVersionManifestGet200Respon.getExample();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response2 = OASMcGameVersionManifestGet200Respon.getExample();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response3 = new OASMcGameVersionManifestGet200Respon();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response4 = new OASMcGameVersionManifestGet200Respon();

        System.assert(mcGameVersionManifestGet200Response1.equals(mcGameVersionManifestGet200Response2));
        System.assert(mcGameVersionManifestGet200Response2.equals(mcGameVersionManifestGet200Response1));
        System.assert(mcGameVersionManifestGet200Response3.equals(mcGameVersionManifestGet200Response4));
        System.assert(mcGameVersionManifestGet200Response4.equals(mcGameVersionManifestGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response1 = OASMcGameVersionManifestGet200Respon.getExample();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response2 = new OASMcGameVersionManifestGet200Respon();

        System.assertEquals(false, mcGameVersionManifestGet200Response1.equals('foo'));
        System.assertEquals(false, mcGameVersionManifestGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response1 = OASMcGameVersionManifestGet200Respon.getExample();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response2 = new OASMcGameVersionManifestGet200Respon();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response3;

        System.assertEquals(false, mcGameVersionManifestGet200Response1.equals(mcGameVersionManifestGet200Response3));
        System.assertEquals(false, mcGameVersionManifestGet200Response2.equals(mcGameVersionManifestGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response1 = OASMcGameVersionManifestGet200Respon.getExample();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response2 = new OASMcGameVersionManifestGet200Respon();

        System.assertEquals(mcGameVersionManifestGet200Response1.hashCode(), mcGameVersionManifestGet200Response1.hashCode());
        System.assertEquals(mcGameVersionManifestGet200Response2.hashCode(), mcGameVersionManifestGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response1 = OASMcGameVersionManifestGet200Respon.getExample();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response2 = OASMcGameVersionManifestGet200Respon.getExample();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response3 = new OASMcGameVersionManifestGet200Respon();
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response4 = new OASMcGameVersionManifestGet200Respon();

        System.assert(mcGameVersionManifestGet200Response1.equals(mcGameVersionManifestGet200Response2));
        System.assert(mcGameVersionManifestGet200Response3.equals(mcGameVersionManifestGet200Response4));
        System.assertEquals(mcGameVersionManifestGet200Response1.hashCode(), mcGameVersionManifestGet200Response2.hashCode());
        System.assertEquals(mcGameVersionManifestGet200Response3.hashCode(), mcGameVersionManifestGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response = new OASMcGameVersionManifestGet200Respon();
        System.assertEquals(new List<OASMcGameVersionManifestGet200Respon>(), mcGameVersionManifestGet200Response.versions);
        System.assertEquals(null, mcGameVersionManifestGet200Response.latest);
    }
}
