@isTest
private class OASVersionManifestTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersionManifest versionManifest1 = OASVersionManifest.getExample();
        OASVersionManifest versionManifest2 = versionManifest1;
        OASVersionManifest versionManifest3 = new OASVersionManifest();
        OASVersionManifest versionManifest4 = versionManifest3;

        System.assert(versionManifest1.equals(versionManifest2));
        System.assert(versionManifest2.equals(versionManifest1));
        System.assert(versionManifest1.equals(versionManifest1));
        System.assert(versionManifest3.equals(versionManifest4));
        System.assert(versionManifest4.equals(versionManifest3));
        System.assert(versionManifest3.equals(versionManifest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersionManifest versionManifest1 = OASVersionManifest.getExample();
        OASVersionManifest versionManifest2 = OASVersionManifest.getExample();
        OASVersionManifest versionManifest3 = new OASVersionManifest();
        OASVersionManifest versionManifest4 = new OASVersionManifest();

        System.assert(versionManifest1.equals(versionManifest2));
        System.assert(versionManifest2.equals(versionManifest1));
        System.assert(versionManifest3.equals(versionManifest4));
        System.assert(versionManifest4.equals(versionManifest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersionManifest versionManifest1 = OASVersionManifest.getExample();
        OASVersionManifest versionManifest2 = new OASVersionManifest();

        System.assertEquals(false, versionManifest1.equals('foo'));
        System.assertEquals(false, versionManifest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersionManifest versionManifest1 = OASVersionManifest.getExample();
        OASVersionManifest versionManifest2 = new OASVersionManifest();
        OASVersionManifest versionManifest3;

        System.assertEquals(false, versionManifest1.equals(versionManifest3));
        System.assertEquals(false, versionManifest2.equals(versionManifest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersionManifest versionManifest1 = OASVersionManifest.getExample();
        OASVersionManifest versionManifest2 = new OASVersionManifest();

        System.assertEquals(versionManifest1.hashCode(), versionManifest1.hashCode());
        System.assertEquals(versionManifest2.hashCode(), versionManifest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersionManifest versionManifest1 = OASVersionManifest.getExample();
        OASVersionManifest versionManifest2 = OASVersionManifest.getExample();
        OASVersionManifest versionManifest3 = new OASVersionManifest();
        OASVersionManifest versionManifest4 = new OASVersionManifest();

        System.assert(versionManifest1.equals(versionManifest2));
        System.assert(versionManifest3.equals(versionManifest4));
        System.assertEquals(versionManifest1.hashCode(), versionManifest2.hashCode());
        System.assertEquals(versionManifest3.hashCode(), versionManifest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASVersionManifest versionManifest = new OASVersionManifest();
        System.assertEquals(new List<OASVersion>(), versionManifest.versions);
        System.assertEquals(null, versionManifest.latest);
    }
}
