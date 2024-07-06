@isTest
private class OASVersionPackageInfoJavaVersionTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion1 = OASVersionPackageInfoJavaVersion.getExample();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion2 = versionPackageInfoJavaVersion1;
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion3 = new OASVersionPackageInfoJavaVersion();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion4 = versionPackageInfoJavaVersion3;

        System.assert(versionPackageInfoJavaVersion1.equals(versionPackageInfoJavaVersion2));
        System.assert(versionPackageInfoJavaVersion2.equals(versionPackageInfoJavaVersion1));
        System.assert(versionPackageInfoJavaVersion1.equals(versionPackageInfoJavaVersion1));
        System.assert(versionPackageInfoJavaVersion3.equals(versionPackageInfoJavaVersion4));
        System.assert(versionPackageInfoJavaVersion4.equals(versionPackageInfoJavaVersion3));
        System.assert(versionPackageInfoJavaVersion3.equals(versionPackageInfoJavaVersion3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion1 = OASVersionPackageInfoJavaVersion.getExample();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion2 = OASVersionPackageInfoJavaVersion.getExample();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion3 = new OASVersionPackageInfoJavaVersion();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion4 = new OASVersionPackageInfoJavaVersion();

        System.assert(versionPackageInfoJavaVersion1.equals(versionPackageInfoJavaVersion2));
        System.assert(versionPackageInfoJavaVersion2.equals(versionPackageInfoJavaVersion1));
        System.assert(versionPackageInfoJavaVersion3.equals(versionPackageInfoJavaVersion4));
        System.assert(versionPackageInfoJavaVersion4.equals(versionPackageInfoJavaVersion3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion1 = OASVersionPackageInfoJavaVersion.getExample();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion2 = new OASVersionPackageInfoJavaVersion();

        System.assertEquals(false, versionPackageInfoJavaVersion1.equals('foo'));
        System.assertEquals(false, versionPackageInfoJavaVersion2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion1 = OASVersionPackageInfoJavaVersion.getExample();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion2 = new OASVersionPackageInfoJavaVersion();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion3;

        System.assertEquals(false, versionPackageInfoJavaVersion1.equals(versionPackageInfoJavaVersion3));
        System.assertEquals(false, versionPackageInfoJavaVersion2.equals(versionPackageInfoJavaVersion3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion1 = OASVersionPackageInfoJavaVersion.getExample();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion2 = new OASVersionPackageInfoJavaVersion();

        System.assertEquals(versionPackageInfoJavaVersion1.hashCode(), versionPackageInfoJavaVersion1.hashCode());
        System.assertEquals(versionPackageInfoJavaVersion2.hashCode(), versionPackageInfoJavaVersion2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion1 = OASVersionPackageInfoJavaVersion.getExample();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion2 = OASVersionPackageInfoJavaVersion.getExample();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion3 = new OASVersionPackageInfoJavaVersion();
        OASVersionPackageInfoJavaVersion versionPackageInfoJavaVersion4 = new OASVersionPackageInfoJavaVersion();

        System.assert(versionPackageInfoJavaVersion1.equals(versionPackageInfoJavaVersion2));
        System.assert(versionPackageInfoJavaVersion3.equals(versionPackageInfoJavaVersion4));
        System.assertEquals(versionPackageInfoJavaVersion1.hashCode(), versionPackageInfoJavaVersion2.hashCode());
        System.assertEquals(versionPackageInfoJavaVersion3.hashCode(), versionPackageInfoJavaVersion4.hashCode());
    }
}
