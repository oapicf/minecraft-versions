@isTest
private class OASVersionTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersion version1 = OASVersion.getExample();
        OASVersion version2 = version1;
        OASVersion version3 = new OASVersion();
        OASVersion version4 = version3;

        System.assert(version1.equals(version2));
        System.assert(version2.equals(version1));
        System.assert(version1.equals(version1));
        System.assert(version3.equals(version4));
        System.assert(version4.equals(version3));
        System.assert(version3.equals(version3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersion version1 = OASVersion.getExample();
        OASVersion version2 = OASVersion.getExample();
        OASVersion version3 = new OASVersion();
        OASVersion version4 = new OASVersion();

        System.assert(version1.equals(version2));
        System.assert(version2.equals(version1));
        System.assert(version3.equals(version4));
        System.assert(version4.equals(version3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersion version1 = OASVersion.getExample();
        OASVersion version2 = new OASVersion();

        System.assertEquals(false, version1.equals('foo'));
        System.assertEquals(false, version2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersion version1 = OASVersion.getExample();
        OASVersion version2 = new OASVersion();
        OASVersion version3;

        System.assertEquals(false, version1.equals(version3));
        System.assertEquals(false, version2.equals(version3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersion version1 = OASVersion.getExample();
        OASVersion version2 = new OASVersion();

        System.assertEquals(version1.hashCode(), version1.hashCode());
        System.assertEquals(version2.hashCode(), version2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersion version1 = OASVersion.getExample();
        OASVersion version2 = OASVersion.getExample();
        OASVersion version3 = new OASVersion();
        OASVersion version4 = new OASVersion();

        System.assert(version1.equals(version2));
        System.assert(version3.equals(version4));
        System.assertEquals(version1.hashCode(), version2.hashCode());
        System.assertEquals(version3.hashCode(), version4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVersion version = new OASVersion();
        Map<String, String> x-property-mappings = version.getx-property-mappings();
        System.assertEquals('r_time', x-property-mappings.get('time'));
    }
}
