@isTest
private class OASVersionManifestLatestTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersionManifestLatest versionManifestLatest1 = OASVersionManifestLatest.getExample();
        OASVersionManifestLatest versionManifestLatest2 = versionManifestLatest1;
        OASVersionManifestLatest versionManifestLatest3 = new OASVersionManifestLatest();
        OASVersionManifestLatest versionManifestLatest4 = versionManifestLatest3;

        System.assert(versionManifestLatest1.equals(versionManifestLatest2));
        System.assert(versionManifestLatest2.equals(versionManifestLatest1));
        System.assert(versionManifestLatest1.equals(versionManifestLatest1));
        System.assert(versionManifestLatest3.equals(versionManifestLatest4));
        System.assert(versionManifestLatest4.equals(versionManifestLatest3));
        System.assert(versionManifestLatest3.equals(versionManifestLatest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersionManifestLatest versionManifestLatest1 = OASVersionManifestLatest.getExample();
        OASVersionManifestLatest versionManifestLatest2 = OASVersionManifestLatest.getExample();
        OASVersionManifestLatest versionManifestLatest3 = new OASVersionManifestLatest();
        OASVersionManifestLatest versionManifestLatest4 = new OASVersionManifestLatest();

        System.assert(versionManifestLatest1.equals(versionManifestLatest2));
        System.assert(versionManifestLatest2.equals(versionManifestLatest1));
        System.assert(versionManifestLatest3.equals(versionManifestLatest4));
        System.assert(versionManifestLatest4.equals(versionManifestLatest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersionManifestLatest versionManifestLatest1 = OASVersionManifestLatest.getExample();
        OASVersionManifestLatest versionManifestLatest2 = new OASVersionManifestLatest();

        System.assertEquals(false, versionManifestLatest1.equals('foo'));
        System.assertEquals(false, versionManifestLatest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersionManifestLatest versionManifestLatest1 = OASVersionManifestLatest.getExample();
        OASVersionManifestLatest versionManifestLatest2 = new OASVersionManifestLatest();
        OASVersionManifestLatest versionManifestLatest3;

        System.assertEquals(false, versionManifestLatest1.equals(versionManifestLatest3));
        System.assertEquals(false, versionManifestLatest2.equals(versionManifestLatest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersionManifestLatest versionManifestLatest1 = OASVersionManifestLatest.getExample();
        OASVersionManifestLatest versionManifestLatest2 = new OASVersionManifestLatest();

        System.assertEquals(versionManifestLatest1.hashCode(), versionManifestLatest1.hashCode());
        System.assertEquals(versionManifestLatest2.hashCode(), versionManifestLatest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersionManifestLatest versionManifestLatest1 = OASVersionManifestLatest.getExample();
        OASVersionManifestLatest versionManifestLatest2 = OASVersionManifestLatest.getExample();
        OASVersionManifestLatest versionManifestLatest3 = new OASVersionManifestLatest();
        OASVersionManifestLatest versionManifestLatest4 = new OASVersionManifestLatest();

        System.assert(versionManifestLatest1.equals(versionManifestLatest2));
        System.assert(versionManifestLatest3.equals(versionManifestLatest4));
        System.assertEquals(versionManifestLatest1.hashCode(), versionManifestLatest2.hashCode());
        System.assertEquals(versionManifestLatest3.hashCode(), versionManifestLatest4.hashCode());
    }
}
