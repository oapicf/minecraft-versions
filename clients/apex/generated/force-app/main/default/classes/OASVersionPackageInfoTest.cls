@isTest
private class OASVersionPackageInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersionPackageInfo versionPackageInfo1 = OASVersionPackageInfo.getExample();
        OASVersionPackageInfo versionPackageInfo2 = versionPackageInfo1;
        OASVersionPackageInfo versionPackageInfo3 = new OASVersionPackageInfo();
        OASVersionPackageInfo versionPackageInfo4 = versionPackageInfo3;

        System.assert(versionPackageInfo1.equals(versionPackageInfo2));
        System.assert(versionPackageInfo2.equals(versionPackageInfo1));
        System.assert(versionPackageInfo1.equals(versionPackageInfo1));
        System.assert(versionPackageInfo3.equals(versionPackageInfo4));
        System.assert(versionPackageInfo4.equals(versionPackageInfo3));
        System.assert(versionPackageInfo3.equals(versionPackageInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersionPackageInfo versionPackageInfo1 = OASVersionPackageInfo.getExample();
        OASVersionPackageInfo versionPackageInfo2 = OASVersionPackageInfo.getExample();
        OASVersionPackageInfo versionPackageInfo3 = new OASVersionPackageInfo();
        OASVersionPackageInfo versionPackageInfo4 = new OASVersionPackageInfo();

        System.assert(versionPackageInfo1.equals(versionPackageInfo2));
        System.assert(versionPackageInfo2.equals(versionPackageInfo1));
        System.assert(versionPackageInfo3.equals(versionPackageInfo4));
        System.assert(versionPackageInfo4.equals(versionPackageInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersionPackageInfo versionPackageInfo1 = OASVersionPackageInfo.getExample();
        OASVersionPackageInfo versionPackageInfo2 = new OASVersionPackageInfo();

        System.assertEquals(false, versionPackageInfo1.equals('foo'));
        System.assertEquals(false, versionPackageInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersionPackageInfo versionPackageInfo1 = OASVersionPackageInfo.getExample();
        OASVersionPackageInfo versionPackageInfo2 = new OASVersionPackageInfo();
        OASVersionPackageInfo versionPackageInfo3;

        System.assertEquals(false, versionPackageInfo1.equals(versionPackageInfo3));
        System.assertEquals(false, versionPackageInfo2.equals(versionPackageInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersionPackageInfo versionPackageInfo1 = OASVersionPackageInfo.getExample();
        OASVersionPackageInfo versionPackageInfo2 = new OASVersionPackageInfo();

        System.assertEquals(versionPackageInfo1.hashCode(), versionPackageInfo1.hashCode());
        System.assertEquals(versionPackageInfo2.hashCode(), versionPackageInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersionPackageInfo versionPackageInfo1 = OASVersionPackageInfo.getExample();
        OASVersionPackageInfo versionPackageInfo2 = OASVersionPackageInfo.getExample();
        OASVersionPackageInfo versionPackageInfo3 = new OASVersionPackageInfo();
        OASVersionPackageInfo versionPackageInfo4 = new OASVersionPackageInfo();

        System.assert(versionPackageInfo1.equals(versionPackageInfo2));
        System.assert(versionPackageInfo3.equals(versionPackageInfo4));
        System.assertEquals(versionPackageInfo1.hashCode(), versionPackageInfo2.hashCode());
        System.assertEquals(versionPackageInfo3.hashCode(), versionPackageInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVersionPackageInfo versionPackageInfo = new OASVersionPackageInfo();
        Map<String, String> x-property-mappings = versionPackageInfo.getx-property-mappings();
        System.assertEquals('r_time', x-property-mappings.get('time'));
    }
}
