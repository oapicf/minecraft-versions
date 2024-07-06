@isTest
private class OASV1PackagesPackageIdVersionIdJsonGTest {
    @isTest
    private static void equalsSameInstance() {
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1 = OASV1PackagesPackageIdVersionIdJsonG.getExample();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2 = v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1;
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3 = new OASV1PackagesPackageIdVersionIdJsonG();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion4 = v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3;

        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2));
        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1));
        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1));
        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion4));
        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion4.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3));
        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1 = OASV1PackagesPackageIdVersionIdJsonG.getExample();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2 = OASV1PackagesPackageIdVersionIdJsonG.getExample();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3 = new OASV1PackagesPackageIdVersionIdJsonG();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion4 = new OASV1PackagesPackageIdVersionIdJsonG();

        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2));
        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1));
        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion4));
        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion4.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1 = OASV1PackagesPackageIdVersionIdJsonG.getExample();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2 = new OASV1PackagesPackageIdVersionIdJsonG();

        System.assertEquals(false, v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1.equals('foo'));
        System.assertEquals(false, v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1 = OASV1PackagesPackageIdVersionIdJsonG.getExample();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2 = new OASV1PackagesPackageIdVersionIdJsonG();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3;

        System.assertEquals(false, v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3));
        System.assertEquals(false, v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1 = OASV1PackagesPackageIdVersionIdJsonG.getExample();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2 = new OASV1PackagesPackageIdVersionIdJsonG();

        System.assertEquals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1.hashCode(), v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1.hashCode());
        System.assertEquals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2.hashCode(), v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1 = OASV1PackagesPackageIdVersionIdJsonG.getExample();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2 = OASV1PackagesPackageIdVersionIdJsonG.getExample();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3 = new OASV1PackagesPackageIdVersionIdJsonG();
        OASV1PackagesPackageIdVersionIdJsonG v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion4 = new OASV1PackagesPackageIdVersionIdJsonG();

        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2));
        System.assert(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3.equals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion4));
        System.assertEquals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion1.hashCode(), v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion2.hashCode());
        System.assertEquals(v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion3.hashCode(), v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion4.hashCode());
    }
}
