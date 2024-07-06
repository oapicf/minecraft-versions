@isTest
private class OASDownloadTest {
    @isTest
    private static void equalsSameInstance() {
        OASDownload download1 = OASDownload.getExample();
        OASDownload download2 = download1;
        OASDownload download3 = new OASDownload();
        OASDownload download4 = download3;

        System.assert(download1.equals(download2));
        System.assert(download2.equals(download1));
        System.assert(download1.equals(download1));
        System.assert(download3.equals(download4));
        System.assert(download4.equals(download3));
        System.assert(download3.equals(download3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDownload download1 = OASDownload.getExample();
        OASDownload download2 = OASDownload.getExample();
        OASDownload download3 = new OASDownload();
        OASDownload download4 = new OASDownload();

        System.assert(download1.equals(download2));
        System.assert(download2.equals(download1));
        System.assert(download3.equals(download4));
        System.assert(download4.equals(download3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDownload download1 = OASDownload.getExample();
        OASDownload download2 = new OASDownload();

        System.assertEquals(false, download1.equals('foo'));
        System.assertEquals(false, download2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDownload download1 = OASDownload.getExample();
        OASDownload download2 = new OASDownload();
        OASDownload download3;

        System.assertEquals(false, download1.equals(download3));
        System.assertEquals(false, download2.equals(download3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDownload download1 = OASDownload.getExample();
        OASDownload download2 = new OASDownload();

        System.assertEquals(download1.hashCode(), download1.hashCode());
        System.assertEquals(download2.hashCode(), download2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDownload download1 = OASDownload.getExample();
        OASDownload download2 = OASDownload.getExample();
        OASDownload download3 = new OASDownload();
        OASDownload download4 = new OASDownload();

        System.assert(download1.equals(download2));
        System.assert(download3.equals(download4));
        System.assertEquals(download1.hashCode(), download2.hashCode());
        System.assertEquals(download3.hashCode(), download4.hashCode());
    }
}
