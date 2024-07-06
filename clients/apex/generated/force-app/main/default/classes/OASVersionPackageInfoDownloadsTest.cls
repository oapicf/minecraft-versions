@isTest
private class OASVersionPackageInfoDownloadsTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersionPackageInfoDownloads versionPackageInfoDownloads1 = OASVersionPackageInfoDownloads.getExample();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads2 = versionPackageInfoDownloads1;
        OASVersionPackageInfoDownloads versionPackageInfoDownloads3 = new OASVersionPackageInfoDownloads();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads4 = versionPackageInfoDownloads3;

        System.assert(versionPackageInfoDownloads1.equals(versionPackageInfoDownloads2));
        System.assert(versionPackageInfoDownloads2.equals(versionPackageInfoDownloads1));
        System.assert(versionPackageInfoDownloads1.equals(versionPackageInfoDownloads1));
        System.assert(versionPackageInfoDownloads3.equals(versionPackageInfoDownloads4));
        System.assert(versionPackageInfoDownloads4.equals(versionPackageInfoDownloads3));
        System.assert(versionPackageInfoDownloads3.equals(versionPackageInfoDownloads3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersionPackageInfoDownloads versionPackageInfoDownloads1 = OASVersionPackageInfoDownloads.getExample();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads2 = OASVersionPackageInfoDownloads.getExample();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads3 = new OASVersionPackageInfoDownloads();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads4 = new OASVersionPackageInfoDownloads();

        System.assert(versionPackageInfoDownloads1.equals(versionPackageInfoDownloads2));
        System.assert(versionPackageInfoDownloads2.equals(versionPackageInfoDownloads1));
        System.assert(versionPackageInfoDownloads3.equals(versionPackageInfoDownloads4));
        System.assert(versionPackageInfoDownloads4.equals(versionPackageInfoDownloads3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersionPackageInfoDownloads versionPackageInfoDownloads1 = OASVersionPackageInfoDownloads.getExample();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads2 = new OASVersionPackageInfoDownloads();

        System.assertEquals(false, versionPackageInfoDownloads1.equals('foo'));
        System.assertEquals(false, versionPackageInfoDownloads2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersionPackageInfoDownloads versionPackageInfoDownloads1 = OASVersionPackageInfoDownloads.getExample();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads2 = new OASVersionPackageInfoDownloads();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads3;

        System.assertEquals(false, versionPackageInfoDownloads1.equals(versionPackageInfoDownloads3));
        System.assertEquals(false, versionPackageInfoDownloads2.equals(versionPackageInfoDownloads3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersionPackageInfoDownloads versionPackageInfoDownloads1 = OASVersionPackageInfoDownloads.getExample();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads2 = new OASVersionPackageInfoDownloads();

        System.assertEquals(versionPackageInfoDownloads1.hashCode(), versionPackageInfoDownloads1.hashCode());
        System.assertEquals(versionPackageInfoDownloads2.hashCode(), versionPackageInfoDownloads2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersionPackageInfoDownloads versionPackageInfoDownloads1 = OASVersionPackageInfoDownloads.getExample();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads2 = OASVersionPackageInfoDownloads.getExample();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads3 = new OASVersionPackageInfoDownloads();
        OASVersionPackageInfoDownloads versionPackageInfoDownloads4 = new OASVersionPackageInfoDownloads();

        System.assert(versionPackageInfoDownloads1.equals(versionPackageInfoDownloads2));
        System.assert(versionPackageInfoDownloads3.equals(versionPackageInfoDownloads4));
        System.assertEquals(versionPackageInfoDownloads1.hashCode(), versionPackageInfoDownloads2.hashCode());
        System.assertEquals(versionPackageInfoDownloads3.hashCode(), versionPackageInfoDownloads4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVersionPackageInfoDownloads versionPackageInfoDownloads = new OASVersionPackageInfoDownloads();
        Map<String, String> x-property-mappings = versionPackageInfoDownloads.getx-property-mappings();
        System.assertEquals('clientMappings', x-property-mappings.get('client_mappings'));
        System.assertEquals('serverMappings', x-property-mappings.get('server_mappings'));
    }
}
