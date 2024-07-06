@isTest
private class OASVersionPackageInfoAssetIndexTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex1 = OASVersionPackageInfoAssetIndex.getExample();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex2 = versionPackageInfoAssetIndex1;
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex3 = new OASVersionPackageInfoAssetIndex();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex4 = versionPackageInfoAssetIndex3;

        System.assert(versionPackageInfoAssetIndex1.equals(versionPackageInfoAssetIndex2));
        System.assert(versionPackageInfoAssetIndex2.equals(versionPackageInfoAssetIndex1));
        System.assert(versionPackageInfoAssetIndex1.equals(versionPackageInfoAssetIndex1));
        System.assert(versionPackageInfoAssetIndex3.equals(versionPackageInfoAssetIndex4));
        System.assert(versionPackageInfoAssetIndex4.equals(versionPackageInfoAssetIndex3));
        System.assert(versionPackageInfoAssetIndex3.equals(versionPackageInfoAssetIndex3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex1 = OASVersionPackageInfoAssetIndex.getExample();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex2 = OASVersionPackageInfoAssetIndex.getExample();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex3 = new OASVersionPackageInfoAssetIndex();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex4 = new OASVersionPackageInfoAssetIndex();

        System.assert(versionPackageInfoAssetIndex1.equals(versionPackageInfoAssetIndex2));
        System.assert(versionPackageInfoAssetIndex2.equals(versionPackageInfoAssetIndex1));
        System.assert(versionPackageInfoAssetIndex3.equals(versionPackageInfoAssetIndex4));
        System.assert(versionPackageInfoAssetIndex4.equals(versionPackageInfoAssetIndex3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex1 = OASVersionPackageInfoAssetIndex.getExample();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex2 = new OASVersionPackageInfoAssetIndex();

        System.assertEquals(false, versionPackageInfoAssetIndex1.equals('foo'));
        System.assertEquals(false, versionPackageInfoAssetIndex2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex1 = OASVersionPackageInfoAssetIndex.getExample();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex2 = new OASVersionPackageInfoAssetIndex();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex3;

        System.assertEquals(false, versionPackageInfoAssetIndex1.equals(versionPackageInfoAssetIndex3));
        System.assertEquals(false, versionPackageInfoAssetIndex2.equals(versionPackageInfoAssetIndex3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex1 = OASVersionPackageInfoAssetIndex.getExample();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex2 = new OASVersionPackageInfoAssetIndex();

        System.assertEquals(versionPackageInfoAssetIndex1.hashCode(), versionPackageInfoAssetIndex1.hashCode());
        System.assertEquals(versionPackageInfoAssetIndex2.hashCode(), versionPackageInfoAssetIndex2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex1 = OASVersionPackageInfoAssetIndex.getExample();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex2 = OASVersionPackageInfoAssetIndex.getExample();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex3 = new OASVersionPackageInfoAssetIndex();
        OASVersionPackageInfoAssetIndex versionPackageInfoAssetIndex4 = new OASVersionPackageInfoAssetIndex();

        System.assert(versionPackageInfoAssetIndex1.equals(versionPackageInfoAssetIndex2));
        System.assert(versionPackageInfoAssetIndex3.equals(versionPackageInfoAssetIndex4));
        System.assertEquals(versionPackageInfoAssetIndex1.hashCode(), versionPackageInfoAssetIndex2.hashCode());
        System.assertEquals(versionPackageInfoAssetIndex3.hashCode(), versionPackageInfoAssetIndex4.hashCode());
    }
}
