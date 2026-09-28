package org.apache.commons.compress.archivers.zip;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        int int16 = zipArchiveEntry1.getUnixMode();
        int int17 = zipArchiveEntry1.getPlatform();
        long long18 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setTime((long) (-1));
        java.lang.String str21 = zipArchiveEntry1.toString();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray8 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = zipArchiveEntry10.getGeneralPurposeBit();
        byte[] byteArray12 = zipArchiveEntry10.getRawName();
        long long13 = zipArchiveEntry10.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry16.setExtra();
        zipArchiveEntry16.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date22 = zipArchiveEntry21.getLastModifiedDate();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry21.setName("hi!", byteArray26);
        zipArchiveEntry16.setCentralDirectoryExtra(byteArray26);
        zipArchiveEntry10.setName("", byteArray26);
        zipArchiveEntry10.setTime((long) 10);
        boolean boolean32 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry10);
        java.lang.String str33 = zipArchiveEntry10.getComment();
        java.time.LocalDateTime localDateTime34 = zipArchiveEntry10.getTimeLocal();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertNotNull(generalPurposeBit11);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        zipArchiveEntry7.setName("");
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry7.setName("", byteArray16);
        zipArchiveEntry7.setCompressedSize((long) 1);
        zipArchiveEntry7.setInternalAttributes(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date27 = zipArchiveEntry26.getLastModifiedDate();
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry26.setName("hi!", byteArray31);
        zipArchiveEntry23.setExtra(byteArray31);
        long long34 = zipArchiveEntry23.getCompressedSize();
        boolean boolean35 = zipArchiveEntry23.isDirectory();
        java.util.Date date36 = zipArchiveEntry23.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData37 = zipArchiveEntry23.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date40 = zipArchiveEntry39.getLastModifiedDate();
        long long41 = zipArchiveEntry39.getTime();
        java.lang.String str42 = zipArchiveEntry39.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray45 = zipArchiveEntry44.getExtraFields();
        zipArchiveEntry39.setExtraFields(zipExtraFieldArray45);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date49 = zipArchiveEntry48.getLastModifiedDate();
        long long50 = zipArchiveEntry48.getTime();
        java.lang.String str51 = zipArchiveEntry48.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray54 = zipArchiveEntry53.getExtraFields();
        zipArchiveEntry48.setExtraFields(zipExtraFieldArray54);
        zipArchiveEntry39.setExtraFields(zipExtraFieldArray54);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry58.setExtra();
        byte[] byteArray60 = zipArchiveEntry58.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date63 = zipArchiveEntry62.getLastModifiedDate();
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry62.setName("hi!", byteArray67);
        zipArchiveEntry58.setExtra(byteArray67);
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry58.setCentralDirectoryExtra(byteArray74);
        zipArchiveEntry39.setCentralDirectoryExtra(byteArray74);
        java.lang.String str77 = zipArchiveEntry39.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry79 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry79.setExtra();
        zipArchiveEntry79.setTime(0L);
        zipArchiveEntry79.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime85 = zipArchiveEntry79.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry39.setLastModifiedTime(fileTime85);
        java.util.zip.ZipEntry zipEntry87 = zipArchiveEntry23.setLastAccessTime(fileTime85);
        java.util.zip.ZipEntry zipEntry88 = zipArchiveEntry7.setCreationTime(fileTime85);
        java.util.zip.ZipEntry zipEntry89 = zipArchiveEntry1.setCreationTime(fileTime85);
        long long90 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(unparseableExtraFieldData37);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(zipExtraFieldArray45);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray45, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(zipExtraFieldArray54);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray54, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray60);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(fileTime85);
        org.junit.Assert.assertNotNull(zipEntry86);
        org.junit.Assert.assertEquals(zipEntry86.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry87);
        org.junit.Assert.assertEquals(zipEntry87.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry88);
        org.junit.Assert.assertEquals(zipEntry88.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry89);
        org.junit.Assert.assertEquals(zipEntry89.toString(), "");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setInternalAttributes((int) '#');
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit4 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setSize((long) 8);
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getCreationTime();
        int int8 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertNotNull(generalPurposeBit4);
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        long long12 = zipArchiveEntry1.getCompressedSize();
        boolean boolean13 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date16 = zipArchiveEntry15.getLastModifiedDate();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry15.setName("hi!", byteArray20);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setExtra();
        byte[] byteArray25 = zipArchiveEntry23.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date28 = zipArchiveEntry27.getLastModifiedDate();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry27.setName("hi!", byteArray32);
        zipArchiveEntry23.setExtra(byteArray32);
        long long35 = zipArchiveEntry23.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort36 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField37 = zipArchiveEntry23.getExtraField(zipShort36);
        boolean boolean39 = zipArchiveEntry23.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit40 = zipArchiveEntry23.getGeneralPurposeBit();
        zipArchiveEntry15.setGeneralPurposeBit(generalPurposeBit40);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit40);
        java.nio.file.attribute.FileTime fileTime43 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray25);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(zipExtraField37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit40);
        org.junit.Assert.assertNull(fileTime43);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        zipArchiveEntry7.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry7.setCentralDirectoryExtra(byteArray17);
        zipArchiveEntry1.setName("hi!", byteArray17);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = zipArchiveEntry1.getExtraField(zipShort21);
        int int23 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setUnixMode(0);
        int int26 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (byte) 10);
        long long5 = zipArchiveEntry1.getCrc();
        int int6 = zipArchiveEntry1.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setExtra();
        byte[] byteArray10 = zipArchiveEntry8.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry8.setExtra(byteArray17);
        long long20 = zipArchiveEntry8.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = zipArchiveEntry8.getExtraField(zipShort21);
        boolean boolean24 = zipArchiveEntry8.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = zipArchiveEntry8.getGeneralPurposeBit();
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit25);
        byte[] byteArray27 = zipArchiveEntry1.getRawName();
        byte[] byteArray28 = zipArchiveEntry1.getExtra();
        zipArchiveEntry1.setExtra();
        java.nio.file.attribute.FileTime fileTime30 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(zipExtraField22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit25);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNull(fileTime30);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setExtra();
        byte[] byteArray10 = zipArchiveEntry8.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry8.setExtra(byteArray17);
        long long20 = zipArchiveEntry8.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = zipArchiveEntry8.getExtraField(zipShort21);
        long long23 = zipArchiveEntry8.getExternalAttributes();
        zipArchiveEntry8.setCrc((long) (byte) 10);
        int int26 = zipArchiveEntry8.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date32 = zipArchiveEntry31.getLastModifiedDate();
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry31.setName("hi!", byteArray36);
        zipArchiveEntry28.setExtra(byteArray36);
        zipArchiveEntry8.setExtra(byteArray36);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        byte[] byteArray43 = zipArchiveEntry41.getRawName();
        zipArchiveEntry41.setPlatform((int) (byte) 100);
        zipArchiveEntry41.setExternalAttributes((long) 10);
        long long48 = zipArchiveEntry41.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setExtra();
        zipArchiveEntry50.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date56 = zipArchiveEntry55.getLastModifiedDate();
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry55.setName("hi!", byteArray60);
        zipArchiveEntry50.setCentralDirectoryExtra(byteArray60);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry64.setExtra();
        byte[] byteArray66 = zipArchiveEntry64.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry68 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date69 = zipArchiveEntry68.getLastModifiedDate();
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry68.setName("hi!", byteArray73);
        zipArchiveEntry64.setExtra(byteArray73);
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry64.setCentralDirectoryExtra(byteArray80);
        zipArchiveEntry64.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData84 = zipArchiveEntry64.getUnparseableExtraFieldData();
        zipArchiveEntry50.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry41.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry8.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        java.nio.file.attribute.FileTime fileTime89 = zipArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(zipExtraField22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray43);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray66);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData84);
        org.junit.Assert.assertNull(fileTime89);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit6 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = zipArchiveEntry1.getExtraFields();
        int int9 = zipArchiveEntry1.getPlatform();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData10 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit6);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray8, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(unparseableExtraFieldData10);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        long long4 = zipArchiveEntry1.getExternalAttributes();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        int int6 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date12 = zipArchiveEntry11.getLastModifiedDate();
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry11.setName("hi!", byteArray16);
        zipArchiveEntry8.setExtra(byteArray16);
        byte[] byteArray19 = zipArchiveEntry8.getExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        long long3 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray5 = zipArchiveEntry1.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        byte[] byteArray9 = zipArchiveEntry7.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date12 = zipArchiveEntry11.getLastModifiedDate();
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry11.setName("hi!", byteArray16);
        zipArchiveEntry7.setExtra(byteArray16);
        long long19 = zipArchiveEntry7.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date23 = zipArchiveEntry22.getLastModifiedDate();
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry22.setName("hi!", byteArray27);
        zipArchiveEntry7.setName("", byteArray27);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date32 = zipArchiveEntry31.getLastModifiedDate();
        long long33 = zipArchiveEntry31.getTime();
        java.lang.String str34 = zipArchiveEntry31.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray37 = zipArchiveEntry36.getExtraFields();
        zipArchiveEntry31.setExtraFields(zipExtraFieldArray37);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date41 = zipArchiveEntry40.getLastModifiedDate();
        long long42 = zipArchiveEntry40.getTime();
        java.lang.String str43 = zipArchiveEntry40.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray46 = zipArchiveEntry45.getExtraFields();
        zipArchiveEntry40.setExtraFields(zipExtraFieldArray46);
        zipArchiveEntry31.setExtraFields(zipExtraFieldArray46);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setExtra();
        byte[] byteArray52 = zipArchiveEntry50.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date55 = zipArchiveEntry54.getLastModifiedDate();
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry54.setName("hi!", byteArray59);
        zipArchiveEntry50.setExtra(byteArray59);
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry50.setCentralDirectoryExtra(byteArray66);
        zipArchiveEntry31.setCentralDirectoryExtra(byteArray66);
        zipArchiveEntry7.setExtra(byteArray66);
        zipArchiveEntry1.setExtra(byteArray66);
        byte[] byteArray71 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort72 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort72);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray4, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(zipExtraFieldArray37);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray37, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(zipExtraFieldArray46);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray46, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray52);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNull(byteArray71);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry4.setExtra();
        byte[] byteArray6 = zipArchiveEntry4.getRawName();
        zipArchiveEntry4.setPlatform((int) (byte) 100);
        long long9 = zipArchiveEntry4.getSize();
        long long10 = zipArchiveEntry4.getTime();
        long long11 = zipArchiveEntry4.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData15 = zipArchiveEntry13.getUnparseableExtraFieldData();
        java.lang.Object obj16 = zipArchiveEntry13.clone();
        zipArchiveEntry13.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit21 = zipArchiveEntry20.getGeneralPurposeBit();
        zipArchiveEntry20.setTime((long) (byte) 10);
        long long24 = zipArchiveEntry20.getCrc();
        int int25 = zipArchiveEntry20.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry27.setExtra();
        byte[] byteArray29 = zipArchiveEntry27.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date32 = zipArchiveEntry31.getLastModifiedDate();
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry31.setName("hi!", byteArray36);
        zipArchiveEntry27.setExtra(byteArray36);
        long long39 = zipArchiveEntry27.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField41 = zipArchiveEntry27.getExtraField(zipShort40);
        boolean boolean43 = zipArchiveEntry27.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit44 = zipArchiveEntry27.getGeneralPurposeBit();
        zipArchiveEntry20.setGeneralPurposeBit(generalPurposeBit44);
        zipArchiveEntry13.setGeneralPurposeBit(generalPurposeBit44);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry48.setExtra();
        byte[] byteArray50 = zipArchiveEntry48.getRawName();
        zipArchiveEntry48.setPlatform((int) (byte) 100);
        zipArchiveEntry48.setExternalAttributes((long) 10);
        long long55 = zipArchiveEntry48.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry57.setExtra();
        zipArchiveEntry57.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date63 = zipArchiveEntry62.getLastModifiedDate();
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry62.setName("hi!", byteArray67);
        zipArchiveEntry57.setCentralDirectoryExtra(byteArray67);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry71 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry71.setExtra();
        byte[] byteArray73 = zipArchiveEntry71.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry75 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date76 = zipArchiveEntry75.getLastModifiedDate();
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry75.setName("hi!", byteArray80);
        zipArchiveEntry71.setExtra(byteArray80);
        byte[] byteArray87 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry71.setCentralDirectoryExtra(byteArray87);
        zipArchiveEntry71.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData91 = zipArchiveEntry71.getUnparseableExtraFieldData();
        zipArchiveEntry57.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry48.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry13.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry4.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(generalPurposeBit21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(byteArray29);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNull(zipExtraField41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit44);
        org.junit.Assert.assertNull(byteArray50);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray73);
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData91);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry1.setName("", byteArray10);
        zipArchiveEntry1.setCrc(0L);
        zipArchiveEntry1.setComment("");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData16 = zipArchiveEntry1.getUnparseableExtraFieldData();
        long long17 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = zipArchiveEntry1.getExtraFields(false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNull(unparseableExtraFieldData16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray19, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        java.lang.Object obj3 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setSize((long) 3);
        int int6 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setSize((long) 'a');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = zipArchiveEntry10.getGeneralPurposeBit();
        int int12 = zipArchiveEntry10.getMethod();
        long long13 = zipArchiveEntry10.getCompressedSize();
        zipArchiveEntry10.setMethod((int) (byte) 0);
        zipArchiveEntry10.setTime(1L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry19.setExtra();
        byte[] byteArray21 = zipArchiveEntry19.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date24 = zipArchiveEntry23.getLastModifiedDate();
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry23.setName("hi!", byteArray28);
        zipArchiveEntry19.setExtra(byteArray28);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry19.getExtraFields(false);
        long long33 = zipArchiveEntry19.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date36 = zipArchiveEntry35.getLastModifiedDate();
        long long37 = zipArchiveEntry35.getTime();
        java.lang.String str38 = zipArchiveEntry35.getComment();
        long long39 = zipArchiveEntry35.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        byte[] byteArray43 = zipArchiveEntry41.getRawName();
        zipArchiveEntry41.setPlatform((int) (byte) 100);
        zipArchiveEntry41.setExternalAttributes((long) 10);
        long long48 = zipArchiveEntry41.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setExtra();
        zipArchiveEntry50.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date56 = zipArchiveEntry55.getLastModifiedDate();
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry55.setName("hi!", byteArray60);
        zipArchiveEntry50.setCentralDirectoryExtra(byteArray60);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry64.setExtra();
        byte[] byteArray66 = zipArchiveEntry64.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry68 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date69 = zipArchiveEntry68.getLastModifiedDate();
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry68.setName("hi!", byteArray73);
        zipArchiveEntry64.setExtra(byteArray73);
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry64.setCentralDirectoryExtra(byteArray80);
        zipArchiveEntry64.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData84 = zipArchiveEntry64.getUnparseableExtraFieldData();
        zipArchiveEntry50.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry41.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry35.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry19.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry10.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry1.setCompressedSize((long) 1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray94 = zipArchiveEntry1.getExtraFields(false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray32, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNull(byteArray43);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray66);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData84);
        org.junit.Assert.assertNotNull(zipExtraFieldArray94);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray94, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        long long3 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray5 = zipArchiveEntry1.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        byte[] byteArray9 = zipArchiveEntry7.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date12 = zipArchiveEntry11.getLastModifiedDate();
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry11.setName("hi!", byteArray16);
        zipArchiveEntry7.setExtra(byteArray16);
        long long19 = zipArchiveEntry7.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date23 = zipArchiveEntry22.getLastModifiedDate();
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry22.setName("hi!", byteArray27);
        zipArchiveEntry7.setName("", byteArray27);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date32 = zipArchiveEntry31.getLastModifiedDate();
        long long33 = zipArchiveEntry31.getTime();
        java.lang.String str34 = zipArchiveEntry31.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray37 = zipArchiveEntry36.getExtraFields();
        zipArchiveEntry31.setExtraFields(zipExtraFieldArray37);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date41 = zipArchiveEntry40.getLastModifiedDate();
        long long42 = zipArchiveEntry40.getTime();
        java.lang.String str43 = zipArchiveEntry40.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray46 = zipArchiveEntry45.getExtraFields();
        zipArchiveEntry40.setExtraFields(zipExtraFieldArray46);
        zipArchiveEntry31.setExtraFields(zipExtraFieldArray46);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setExtra();
        byte[] byteArray52 = zipArchiveEntry50.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date55 = zipArchiveEntry54.getLastModifiedDate();
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry54.setName("hi!", byteArray59);
        zipArchiveEntry50.setExtra(byteArray59);
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry50.setCentralDirectoryExtra(byteArray66);
        zipArchiveEntry31.setCentralDirectoryExtra(byteArray66);
        zipArchiveEntry7.setExtra(byteArray66);
        zipArchiveEntry1.setExtra(byteArray66);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort71 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField72 = zipArchiveEntry1.getExtraField(zipShort71);
        boolean boolean73 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray4, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(zipExtraFieldArray37);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray37, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(zipExtraFieldArray46);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray46, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray52);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = zipArchiveEntry1.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setExtra();
        zipArchiveEntry11.setTime(0L);
        zipArchiveEntry11.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry11.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry18 = zipArchiveEntry1.setCreationTime(fileTime17);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        byte[] byteArray22 = zipArchiveEntry20.getRawName();
        zipArchiveEntry20.setPlatform((int) (byte) 100);
        long long25 = zipArchiveEntry20.getSize();
        long long26 = zipArchiveEntry20.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date29 = zipArchiveEntry28.getLastModifiedDate();
        long long30 = zipArchiveEntry28.getTime();
        java.lang.String str31 = zipArchiveEntry28.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = zipArchiveEntry33.getExtraFields();
        zipArchiveEntry28.setExtraFields(zipExtraFieldArray34);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date38 = zipArchiveEntry37.getLastModifiedDate();
        long long39 = zipArchiveEntry37.getTime();
        java.lang.String str40 = zipArchiveEntry37.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray43 = zipArchiveEntry42.getExtraFields();
        zipArchiveEntry37.setExtraFields(zipExtraFieldArray43);
        zipArchiveEntry28.setExtraFields(zipExtraFieldArray43);
        zipArchiveEntry20.setExtraFields(zipExtraFieldArray43);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray43);
        byte[] byteArray48 = zipArchiveEntry1.getRawName();
        boolean boolean49 = zipArchiveEntry1.isDirectory();
        int int50 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit9);
        org.junit.Assert.assertNotNull(fileTime17);
        org.junit.Assert.assertNotNull(zipEntry18);
        org.junit.Assert.assertEquals(zipEntry18.toString(), "");
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray34, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(zipExtraFieldArray43);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray43, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        long long3 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray5 = zipArchiveEntry1.getLocalFileDataExtra();
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit10 = zipArchiveEntry9.getGeneralPurposeBit();
        long long11 = zipArchiveEntry9.getCrc();
        long long12 = zipArchiveEntry9.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit15 = zipArchiveEntry14.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setExtra();
        byte[] byteArray19 = zipArchiveEntry17.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date22 = zipArchiveEntry21.getLastModifiedDate();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry21.setName("hi!", byteArray26);
        zipArchiveEntry17.setExtra(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry17.setCentralDirectoryExtra(byteArray33);
        zipArchiveEntry17.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData37 = zipArchiveEntry17.getUnparseableExtraFieldData();
        zipArchiveEntry14.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData37);
        zipArchiveEntry9.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData37);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData37);
        zipArchiveEntry1.removeUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit45 = zipArchiveEntry44.getGeneralPurposeBit();
        int int46 = zipArchiveEntry44.getMethod();
        long long47 = zipArchiveEntry44.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setExtra();
        zipArchiveEntry50.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date56 = zipArchiveEntry55.getLastModifiedDate();
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry55.setName("hi!", byteArray60);
        zipArchiveEntry50.setCentralDirectoryExtra(byteArray60);
        zipArchiveEntry44.setName("hi!", byteArray60);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry66 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry66.setExtra();
        java.lang.Object obj68 = zipArchiveEntry66.clone();
        byte[] byteArray69 = zipArchiveEntry66.getLocalFileDataExtra();
        zipArchiveEntry44.setName("", byteArray69);
        zipArchiveEntry1.setName("", byteArray69);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit72 = zipArchiveEntry1.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort73 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort73);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray4, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNotNull(generalPurposeBit10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit15);
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData37);
        org.junit.Assert.assertNotNull(generalPurposeBit45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals(obj68.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj68), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj68), "");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit72);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        zipArchiveEntry7.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry7.setCentralDirectoryExtra(byteArray17);
        zipArchiveEntry1.setName("hi!", byteArray17);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry22.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date26 = zipArchiveEntry25.getLastModifiedDate();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry25.setName("hi!", byteArray30);
        zipArchiveEntry22.setExtra(byteArray30);
        zipArchiveEntry1.setExtra(byteArray30);
        int int34 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setPlatform(0);
        java.lang.String str39 = zipArchiveEntry36.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = zipArchiveEntry36.getExtraFields();
        boolean boolean41 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry36);
        long long42 = zipArchiveEntry1.getCrc();
        int int43 = zipArchiveEntry1.getUnixMode();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray40, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit6 = zipArchiveEntry1.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = zipArchiveEntry8.getGeneralPurposeBit();
        int int10 = zipArchiveEntry8.getMethod();
        long long11 = zipArchiveEntry8.getCompressedSize();
        boolean boolean12 = zipArchiveEntry8.isDirectory();
        java.lang.Object obj13 = zipArchiveEntry8.clone();
        java.nio.file.attribute.FileTime fileTime14 = zipArchiveEntry8.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date18 = zipArchiveEntry17.getLastModifiedDate();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry17.setName("hi!", byteArray22);
        long long24 = zipArchiveEntry17.getSize();
        java.lang.String str25 = zipArchiveEntry17.getName();
        zipArchiveEntry17.setCompressedSize(0L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData31 = zipArchiveEntry29.getUnparseableExtraFieldData();
        java.lang.Object obj32 = zipArchiveEntry29.clone();
        zipArchiveEntry29.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit37 = zipArchiveEntry36.getGeneralPurposeBit();
        zipArchiveEntry36.setTime((long) (byte) 10);
        long long40 = zipArchiveEntry36.getCrc();
        int int41 = zipArchiveEntry36.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry43.setExtra();
        byte[] byteArray45 = zipArchiveEntry43.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date48 = zipArchiveEntry47.getLastModifiedDate();
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry47.setName("hi!", byteArray52);
        zipArchiveEntry43.setExtra(byteArray52);
        long long55 = zipArchiveEntry43.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort56 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField57 = zipArchiveEntry43.getExtraField(zipShort56);
        boolean boolean59 = zipArchiveEntry43.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit60 = zipArchiveEntry43.getGeneralPurposeBit();
        zipArchiveEntry36.setGeneralPurposeBit(generalPurposeBit60);
        zipArchiveEntry29.setGeneralPurposeBit(generalPurposeBit60);
        zipArchiveEntry29.setCrc((long) 8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry67 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry67.setPlatform(0);
        zipArchiveEntry67.setExtra();
        byte[] byteArray71 = zipArchiveEntry67.getExtra();
        zipArchiveEntry29.setName("", byteArray71);
        boolean boolean73 = zipArchiveEntry17.equals((java.lang.Object) zipArchiveEntry29);
        zipArchiveEntry17.setUnixMode(35);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort76 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField77 = zipArchiveEntry17.getExtraField(zipShort76);
        byte[] byteArray78 = zipArchiveEntry17.getLocalFileDataExtra();
        zipArchiveEntry8.setName("", byteArray78);
        boolean boolean80 = zipArchiveEntry1.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit6);
        org.junit.Assert.assertNotNull(generalPurposeBit9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNull(fileTime14);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(unparseableExtraFieldData31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertNotNull(generalPurposeBit37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(byteArray45);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNull(zipExtraField57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit60);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(zipExtraField77);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray16);
        byte[] byteArray19 = zipArchiveEntry1.getLocalFileDataExtra();
        long long20 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = zipArchiveEntry1.getExtraField(zipShort21);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime25 = zipArchiveEntry24.getLastAccessTime();
        zipArchiveEntry24.setName("");
        java.nio.file.attribute.FileTime fileTime28 = zipArchiveEntry24.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = zipArchiveEntry24.getExtraFields(false);
        zipArchiveEntry24.setComment("");
        boolean boolean33 = zipArchiveEntry1.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNull(zipExtraField22);
        org.junit.Assert.assertNull(fileTime25);
        org.junit.Assert.assertNull(fileTime28);
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray30, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        zipArchiveEntry0.setComment("hi!");
        zipArchiveEntry0.setSize((long) (short) 100);
        byte[] byteArray5 = zipArchiveEntry0.getExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        zipArchiveEntry7.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = zipArchiveEntry7.getExtraFields();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit12 = zipArchiveEntry7.getGeneralPurposeBit();
        zipArchiveEntry0.setGeneralPurposeBit(generalPurposeBit12);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit16 = zipArchiveEntry15.getGeneralPurposeBit();
        int int17 = zipArchiveEntry15.getMethod();
        long long18 = zipArchiveEntry15.getCompressedSize();
        zipArchiveEntry15.setMethod((int) (byte) 0);
        int int21 = zipArchiveEntry15.getInternalAttributes();
        zipArchiveEntry15.setExtra();
        byte[] byteArray23 = zipArchiveEntry15.getLocalFileDataExtra();
        zipArchiveEntry0.setCentralDirectoryExtra(byteArray23);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray11, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit12);
        org.junit.Assert.assertNotNull(generalPurposeBit16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        long long3 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray5 = zipArchiveEntry1.getRawName();
        int int6 = zipArchiveEntry1.getPlatform();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getCreationTime();
        byte[] byteArray8 = zipArchiveEntry1.getRawName();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray4, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNull(byteArray8);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        long long5 = zipArchiveEntry1.getTime();
        byte[] byteArray6 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setExtra();
        byte[] byteArray11 = zipArchiveEntry9.getRawName();
        zipArchiveEntry9.setPlatform((int) (byte) 100);
        zipArchiveEntry9.setExternalAttributes((long) 10);
        long long16 = zipArchiveEntry9.getTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData17 = zipArchiveEntry9.getUnparseableExtraFieldData();
        long long18 = zipArchiveEntry9.getSize();
        byte[] byteArray19 = zipArchiveEntry9.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry21.setExtra();
        byte[] byteArray23 = zipArchiveEntry21.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date26 = zipArchiveEntry25.getLastModifiedDate();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry25.setName("hi!", byteArray30);
        zipArchiveEntry21.setExtra(byteArray30);
        long long33 = zipArchiveEntry21.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort34 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField35 = zipArchiveEntry21.getExtraField(zipShort34);
        int int36 = zipArchiveEntry21.getUnixMode();
        int int37 = zipArchiveEntry21.getPlatform();
        long long38 = zipArchiveEntry21.getTime();
        zipArchiveEntry21.setTime((long) (-1));
        long long41 = zipArchiveEntry21.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit44 = zipArchiveEntry43.getGeneralPurposeBit();
        int int45 = zipArchiveEntry43.getMethod();
        zipArchiveEntry43.setCompressedSize((long) (-1));
        zipArchiveEntry43.setExternalAttributes((long) 'a');
        zipArchiveEntry43.setSize((long) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry54.setExtra();
        byte[] byteArray56 = zipArchiveEntry54.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date59 = zipArchiveEntry58.getLastModifiedDate();
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry58.setName("hi!", byteArray63);
        zipArchiveEntry54.setExtra(byteArray63);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry54.setCentralDirectoryExtra(byteArray70);
        zipArchiveEntry43.setName("", byteArray70);
        zipArchiveEntry21.setExtra(byteArray70);
        java.nio.file.attribute.FileTime fileTime74 = zipArchiveEntry21.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry75 = zipArchiveEntry9.setLastAccessTime(fileTime74);
        java.util.zip.ZipEntry zipEntry76 = zipArchiveEntry1.setLastAccessTime(fileTime74);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(zipExtraField35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(byteArray56);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(fileTime74);
        org.junit.Assert.assertNotNull(zipEntry75);
        org.junit.Assert.assertEquals(zipEntry75.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry76);
        org.junit.Assert.assertEquals(zipEntry76.toString(), "");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit5 = zipArchiveEntry1.getGeneralPurposeBit();
        java.lang.String str6 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(generalPurposeBit5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        long long8 = zipArchiveEntry1.getCrc();
        java.lang.String str9 = zipArchiveEntry1.getComment();
        byte[] byteArray10 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.lang.String str11 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setCrc(10L);
        int int14 = zipArchiveEntry1.getInternalAttributes();
        long long15 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setCrc(0L);
        long long10 = zipArchiveEntry1.getTime();
        long long11 = zipArchiveEntry1.getTime();
        java.util.Date date12 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setExternalAttributes((long) 10);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry1.setName("", byteArray10);
        long long12 = zipArchiveEntry1.getSize();
        boolean boolean13 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData14 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.String str15 = zipArchiveEntry1.getName();
        int int16 = zipArchiveEntry1.getMethod();
        int int17 = zipArchiveEntry1.getMethod();
        boolean boolean18 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        int int3 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setInternalAttributes(0);
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(fileTime6);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date10 = zipArchiveEntry9.getLastModifiedDate();
        long long11 = zipArchiveEntry9.getTime();
        java.lang.String str12 = zipArchiveEntry9.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry14.getExtraFields();
        zipArchiveEntry9.setExtraFields(zipExtraFieldArray15);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry19.setExtra();
        byte[] byteArray21 = zipArchiveEntry19.getRawName();
        zipArchiveEntry19.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime24 = zipArchiveEntry19.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit28 = zipArchiveEntry27.getGeneralPurposeBit();
        int int29 = zipArchiveEntry27.getMethod();
        long long30 = zipArchiveEntry27.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry33.setExtra();
        zipArchiveEntry33.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date39 = zipArchiveEntry38.getLastModifiedDate();
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry38.setName("hi!", byteArray43);
        zipArchiveEntry33.setCentralDirectoryExtra(byteArray43);
        zipArchiveEntry27.setName("hi!", byteArray43);
        zipArchiveEntry19.setName("", byteArray43);
        zipArchiveEntry9.setName("hi!", byteArray43);
        zipArchiveEntry1.setName("hi!", byteArray43);
        byte[] byteArray50 = zipArchiveEntry1.getLocalFileDataExtra();
        long long51 = zipArchiveEntry1.getTime();
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray15, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertNull(fileTime24);
        org.junit.Assert.assertNotNull(generalPurposeBit28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setUnixMode((int) (short) 100);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData7 = zipArchiveEntry1.getUnparseableExtraFieldData();
        int int8 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setTime((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData13 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(unparseableExtraFieldData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(unparseableExtraFieldData13);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        long long4 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setCrc((long) 8);
        java.lang.String str7 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = zipArchiveEntry1.getExtraFields();
        long long9 = zipArchiveEntry1.getTime();
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getCreationTime();
        java.lang.String str11 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray8, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        long long3 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray5 = zipArchiveEntry1.getRawName();
        java.lang.String str6 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray4, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        long long8 = zipArchiveEntry1.getSize();
        java.lang.String str9 = zipArchiveEntry1.getComment();
        long long10 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setExternalAttributes((long) (byte) 100);
        long long13 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setPlatform(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry17.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData21 = zipArchiveEntry17.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime22 = zipArchiveEntry17.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date26 = zipArchiveEntry25.getLastModifiedDate();
        long long27 = zipArchiveEntry25.getTime();
        java.lang.String str28 = zipArchiveEntry25.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry30.getExtraFields();
        zipArchiveEntry25.setExtraFields(zipExtraFieldArray31);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry35.setExtra();
        byte[] byteArray37 = zipArchiveEntry35.getRawName();
        zipArchiveEntry35.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime40 = zipArchiveEntry35.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit44 = zipArchiveEntry43.getGeneralPurposeBit();
        int int45 = zipArchiveEntry43.getMethod();
        long long46 = zipArchiveEntry43.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry49 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry49.setExtra();
        zipArchiveEntry49.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date55 = zipArchiveEntry54.getLastModifiedDate();
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry54.setName("hi!", byteArray59);
        zipArchiveEntry49.setCentralDirectoryExtra(byteArray59);
        zipArchiveEntry43.setName("hi!", byteArray59);
        zipArchiveEntry35.setName("", byteArray59);
        zipArchiveEntry25.setName("hi!", byteArray59);
        zipArchiveEntry17.setName("hi!", byteArray59);
        byte[] byteArray66 = zipArchiveEntry17.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray66);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertNull(unparseableExtraFieldData21);
        org.junit.Assert.assertNull(fileTime22);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray31, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertNull(fileTime40);
        org.junit.Assert.assertNotNull(generalPurposeBit44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        byte[] byteArray22 = zipArchiveEntry20.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry24.setName("hi!", byteArray29);
        zipArchiveEntry20.setExtra(byteArray29);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry20.setCentralDirectoryExtra(byteArray36);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray36);
        java.lang.String str39 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        zipArchiveEntry41.setTime(0L);
        zipArchiveEntry41.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime47 = zipArchiveEntry41.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry48 = zipArchiveEntry1.setLastModifiedTime(fileTime47);
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        zipArchiveEntry1.setTime((long) (short) -1);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit53 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit53);
        long long55 = zipArchiveEntry1.getCrc();
        long long56 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry59.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime62 = zipArchiveEntry59.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData63 = zipArchiveEntry59.getUnparseableExtraFieldData();
        long long64 = zipArchiveEntry59.getExternalAttributes();
        int int65 = zipArchiveEntry59.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry68 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry68.setExtra();
        byte[] byteArray70 = zipArchiveEntry68.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry72 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date73 = zipArchiveEntry72.getLastModifiedDate();
        byte[] byteArray77 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry72.setName("hi!", byteArray77);
        zipArchiveEntry68.setExtra(byteArray77);
        long long80 = zipArchiveEntry68.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort81 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField82 = zipArchiveEntry68.getExtraField(zipShort81);
        long long83 = zipArchiveEntry68.getExternalAttributes();
        zipArchiveEntry68.setCrc((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit86 = zipArchiveEntry68.getGeneralPurposeBit();
        int int87 = zipArchiveEntry68.getInternalAttributes();
        java.nio.file.attribute.FileTime fileTime88 = zipArchiveEntry68.getCreationTime();
        java.lang.String str89 = zipArchiveEntry68.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry91 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit92 = zipArchiveEntry91.getGeneralPurposeBit();
        long long93 = zipArchiveEntry91.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray94 = zipArchiveEntry91.getExtraFields();
        byte[] byteArray95 = zipArchiveEntry91.getLocalFileDataExtra();
        zipArchiveEntry68.setCentralDirectoryExtra(byteArray95);
        zipArchiveEntry59.setName("", byteArray95);
        zipArchiveEntry1.setName("", byteArray95);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(fileTime47);
        org.junit.Assert.assertNotNull(zipEntry48);
        org.junit.Assert.assertEquals(zipEntry48.toString(), "");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertNull(fileTime62);
        org.junit.Assert.assertNull(unparseableExtraFieldData63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(byteArray70);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNull(zipExtraField82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(generalPurposeBit86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNull(fileTime88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(generalPurposeBit92);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + (-1L) + "'", long93 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray94);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray94, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] {});
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        long long4 = zipArchiveEntry1.getTime();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date8 = zipArchiveEntry7.getLastModifiedDate();
        long long9 = zipArchiveEntry7.getTime();
        java.lang.String str10 = zipArchiveEntry7.getComment();
        long long11 = zipArchiveEntry7.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        byte[] byteArray15 = zipArchiveEntry13.getRawName();
        zipArchiveEntry13.setPlatform((int) (byte) 100);
        zipArchiveEntry13.setExternalAttributes((long) 10);
        long long20 = zipArchiveEntry13.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry22.setExtra();
        zipArchiveEntry22.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date28 = zipArchiveEntry27.getLastModifiedDate();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry27.setName("hi!", byteArray32);
        zipArchiveEntry22.setCentralDirectoryExtra(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setExtra();
        byte[] byteArray38 = zipArchiveEntry36.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date41 = zipArchiveEntry40.getLastModifiedDate();
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry40.setName("hi!", byteArray45);
        zipArchiveEntry36.setExtra(byteArray45);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry36.setCentralDirectoryExtra(byteArray52);
        zipArchiveEntry36.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData56 = zipArchiveEntry36.getUnparseableExtraFieldData();
        zipArchiveEntry22.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData56);
        zipArchiveEntry13.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData56);
        zipArchiveEntry7.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData56);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData56);
        int int61 = zipArchiveEntry1.getPlatform();
        java.lang.String str62 = zipArchiveEntry1.getComment();
        long long63 = zipArchiveEntry1.getCrc();
        java.lang.String str64 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        byte[] byteArray14 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setInternalAttributes(10);
        long long17 = zipArchiveEntry1.getSize();
        java.lang.String str18 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        byte[] byteArray22 = zipArchiveEntry20.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry24.setName("hi!", byteArray29);
        zipArchiveEntry20.setExtra(byteArray29);
        long long32 = zipArchiveEntry20.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = zipArchiveEntry20.getExtraField(zipShort33);
        boolean boolean36 = zipArchiveEntry20.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit37 = zipArchiveEntry20.getGeneralPurposeBit();
        zipArchiveEntry20.setExternalAttributes(10L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData43 = zipArchiveEntry41.getUnparseableExtraFieldData();
        java.lang.Object obj44 = zipArchiveEntry41.clone();
        zipArchiveEntry41.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit49 = zipArchiveEntry48.getGeneralPurposeBit();
        zipArchiveEntry48.setTime((long) (byte) 10);
        long long52 = zipArchiveEntry48.getCrc();
        int int53 = zipArchiveEntry48.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry55.setExtra();
        byte[] byteArray57 = zipArchiveEntry55.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date60 = zipArchiveEntry59.getLastModifiedDate();
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry59.setName("hi!", byteArray64);
        zipArchiveEntry55.setExtra(byteArray64);
        long long67 = zipArchiveEntry55.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort68 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField69 = zipArchiveEntry55.getExtraField(zipShort68);
        boolean boolean71 = zipArchiveEntry55.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit72 = zipArchiveEntry55.getGeneralPurposeBit();
        zipArchiveEntry48.setGeneralPurposeBit(generalPurposeBit72);
        zipArchiveEntry41.setGeneralPurposeBit(generalPurposeBit72);
        zipArchiveEntry41.setCrc((long) 8);
        zipArchiveEntry41.setExternalAttributes((long) (byte) 0);
        boolean boolean79 = zipArchiveEntry20.equals((java.lang.Object) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry81 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry81.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry84 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date85 = zipArchiveEntry84.getLastModifiedDate();
        byte[] byteArray89 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry84.setName("hi!", byteArray89);
        zipArchiveEntry81.setExtra(byteArray89);
        long long92 = zipArchiveEntry81.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray93 = zipArchiveEntry81.getExtraFields();
        zipArchiveEntry20.setExtraFields(zipExtraFieldArray93);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray93);
        java.nio.file.attribute.FileTime fileTime96 = zipArchiveEntry1.getCreationTime();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNull(zipExtraField34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit37);
        org.junit.Assert.assertNull(unparseableExtraFieldData43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "");
        org.junit.Assert.assertNotNull(generalPurposeBit49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(byteArray57);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNull(zipExtraField69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + (-1L) + "'", long92 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray93);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray93, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime96);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        java.lang.Object obj13 = zipArchiveEntry1.clone();
        byte[] byteArray14 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = zipArchiveEntry1.getExtraFields(false);
        zipArchiveEntry1.setExternalAttributes((long) (byte) 0);
        zipArchiveEntry1.setTime((long) 32);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = zipArchiveEntry1.getExtraField(zipShort19);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray14, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField20);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setCompressedSize(10L);
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData9 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData9);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastModifiedTime();
        int int6 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setExternalAttributes(35L);
        zipArchiveEntry1.setCompressedSize((long) (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date7 = zipArchiveEntry6.getLastModifiedDate();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry6.setName("hi!", byteArray11);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date20 = zipArchiveEntry19.getLastModifiedDate();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry19.setName("hi!", byteArray24);
        zipArchiveEntry15.setExtra(byteArray24);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry15.setCentralDirectoryExtra(byteArray31);
        zipArchiveEntry15.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData35 = zipArchiveEntry15.getUnparseableExtraFieldData();
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData35);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray37 = zipArchiveEntry1.getExtraFields();
        long long38 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData35);
        org.junit.Assert.assertNotNull(zipExtraFieldArray37);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray37, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        int int16 = zipArchiveEntry1.getUnixMode();
        int int17 = zipArchiveEntry1.getPlatform();
        long long18 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setTime((long) (-1));
        long long21 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit24 = zipArchiveEntry23.getGeneralPurposeBit();
        int int25 = zipArchiveEntry23.getMethod();
        zipArchiveEntry23.setCompressedSize((long) (-1));
        zipArchiveEntry23.setExternalAttributes((long) 'a');
        zipArchiveEntry23.setSize((long) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry34.setExtra();
        byte[] byteArray36 = zipArchiveEntry34.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date39 = zipArchiveEntry38.getLastModifiedDate();
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry38.setName("hi!", byteArray43);
        zipArchiveEntry34.setExtra(byteArray43);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry34.setCentralDirectoryExtra(byteArray50);
        zipArchiveEntry23.setName("", byteArray50);
        zipArchiveEntry1.setExtra(byteArray50);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData54 = zipArchiveEntry1.getUnparseableExtraFieldData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData54);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry1.getExtraFields(true);
        zipArchiveEntry1.setExtra();
        java.lang.Object obj12 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit13 = zipArchiveEntry1.getGeneralPurposeBit();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(generalPurposeBit13);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        zipArchiveEntry1.setCompressedSize(8L);
        zipArchiveEntry1.setUnixMode((int) (short) 10);
        long long13 = zipArchiveEntry1.getSize();
        long long14 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = zipArchiveEntry8.getGeneralPurposeBit();
        zipArchiveEntry8.setTime((long) (byte) 10);
        long long12 = zipArchiveEntry8.getCrc();
        int int13 = zipArchiveEntry8.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date20 = zipArchiveEntry19.getLastModifiedDate();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry19.setName("hi!", byteArray24);
        zipArchiveEntry15.setExtra(byteArray24);
        long long27 = zipArchiveEntry15.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField29 = zipArchiveEntry15.getExtraField(zipShort28);
        boolean boolean31 = zipArchiveEntry15.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit32 = zipArchiveEntry15.getGeneralPurposeBit();
        zipArchiveEntry8.setGeneralPurposeBit(generalPurposeBit32);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit32);
        long long35 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setName("hi!");
        int int38 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry40.setExtra();
        byte[] byteArray42 = zipArchiveEntry40.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date45 = zipArchiveEntry44.getLastModifiedDate();
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry44.setName("hi!", byteArray49);
        zipArchiveEntry40.setExtra(byteArray49);
        long long52 = zipArchiveEntry40.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort53 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField54 = zipArchiveEntry40.getExtraField(zipShort53);
        boolean boolean56 = zipArchiveEntry40.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit57 = zipArchiveEntry40.getGeneralPurposeBit();
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit57);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(generalPurposeBit9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(zipExtraField29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(byteArray42);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNull(zipExtraField54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit57);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        long long12 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setCompressedSize((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit17 = zipArchiveEntry16.getGeneralPurposeBit();
        long long18 = zipArchiveEntry16.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = zipArchiveEntry16.getExtraFields();
        byte[] byteArray20 = zipArchiveEntry16.getLocalFileDataExtra();
        java.lang.Object obj21 = zipArchiveEntry16.clone();
        java.nio.file.attribute.FileTime fileTime22 = zipArchiveEntry16.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = zipArchiveEntry24.getGeneralPurposeBit();
        long long26 = zipArchiveEntry24.getCrc();
        long long27 = zipArchiveEntry24.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit30 = zipArchiveEntry29.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setExtra();
        byte[] byteArray34 = zipArchiveEntry32.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date37 = zipArchiveEntry36.getLastModifiedDate();
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry36.setName("hi!", byteArray41);
        zipArchiveEntry32.setExtra(byteArray41);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry32.setCentralDirectoryExtra(byteArray48);
        zipArchiveEntry32.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData52 = zipArchiveEntry32.getUnparseableExtraFieldData();
        zipArchiveEntry29.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData52);
        zipArchiveEntry24.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData52);
        zipArchiveEntry16.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData52);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData52);
        zipArchiveEntry1.setCrc(6553601L);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray19, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNull(fileTime22);
        org.junit.Assert.assertNotNull(generalPurposeBit25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit30);
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData52);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        long long16 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setCrc((long) (byte) 10);
        java.lang.Object obj19 = zipArchiveEntry1.clone();
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry22.setPlatform(0);
        zipArchiveEntry22.setTime((long) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date32 = zipArchiveEntry31.getLastModifiedDate();
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry31.setName("hi!", byteArray36);
        zipArchiveEntry28.setExtra(byteArray36);
        long long39 = zipArchiveEntry28.getCompressedSize();
        zipArchiveEntry28.setCrc(0L);
        byte[] byteArray42 = zipArchiveEntry28.getExtra();
        zipArchiveEntry22.setCentralDirectoryExtra(byteArray42);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date46 = zipArchiveEntry45.getLastModifiedDate();
        long long47 = zipArchiveEntry45.getTime();
        java.lang.String str48 = zipArchiveEntry45.getComment();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit49 = zipArchiveEntry45.getGeneralPurposeBit();
        zipArchiveEntry22.setGeneralPurposeBit(generalPurposeBit49);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit49);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(generalPurposeBit49);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        boolean boolean17 = zipArchiveEntry1.equals((java.lang.Object) (short) 0);
        byte[] byteArray18 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        zipArchiveEntry20.setTime(0L);
        java.nio.file.attribute.FileTime fileTime24 = zipArchiveEntry20.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = zipArchiveEntry20.getExtraFields(false);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray26);
        java.lang.String str28 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setCompressedSize((long) 8);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertNull(fileTime24);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray26, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setInternalAttributes(8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = zipArchiveEntry1.getExtraField(zipShort9);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = zipArchiveEntry1.getGeneralPurposeBit();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNull(zipExtraField10);
        org.junit.Assert.assertNotNull(generalPurposeBit11);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (byte) 10);
        long long5 = zipArchiveEntry1.getCrc();
        int int6 = zipArchiveEntry1.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setExtra();
        byte[] byteArray10 = zipArchiveEntry8.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry8.setExtra(byteArray17);
        long long20 = zipArchiveEntry8.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = zipArchiveEntry8.getExtraField(zipShort21);
        boolean boolean24 = zipArchiveEntry8.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = zipArchiveEntry8.getGeneralPurposeBit();
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit25);
        byte[] byteArray27 = zipArchiveEntry1.getRawName();
        java.util.Date date28 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(zipExtraField22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit25);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        long long4 = zipArchiveEntry1.getSize();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = zipArchiveEntry1.getUnparseableExtraFieldData();
        int int7 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setInternalAttributes(100);
        long long21 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime24 = zipArchiveEntry23.getLastAccessTime();
        int int25 = zipArchiveEntry23.getMethod();
        zipArchiveEntry23.setInternalAttributes(0);
        java.util.Date date28 = zipArchiveEntry23.getLastModifiedDate();
        boolean boolean29 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry23);
        int int30 = zipArchiveEntry23.getUnixMode();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(fileTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setInternalAttributes(100);
        int int21 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setUnixMode(8);
        boolean boolean24 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray8 = zipArchiveEntry1.getLocalFileDataExtra();
        byte[] byteArray9 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry12.getLastAccessTime();
        boolean boolean14 = zipArchiveEntry12.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry12.setExtraFields(zipExtraFieldArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setExtra();
        zipArchiveEntry9.setTime(0L);
        zipArchiveEntry9.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry9.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry16 = zipArchiveEntry1.setCreationTime(fileTime15);
        byte[] byteArray17 = zipArchiveEntry1.getRawName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime15);
        org.junit.Assert.assertNotNull(zipEntry16);
        org.junit.Assert.assertEquals(zipEntry16.toString(), "");
        org.junit.Assert.assertNull(byteArray17);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = zipArchiveEntry8.getGeneralPurposeBit();
        zipArchiveEntry8.setTime((long) (byte) 10);
        long long12 = zipArchiveEntry8.getCrc();
        int int13 = zipArchiveEntry8.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date20 = zipArchiveEntry19.getLastModifiedDate();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry19.setName("hi!", byteArray24);
        zipArchiveEntry15.setExtra(byteArray24);
        long long27 = zipArchiveEntry15.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField29 = zipArchiveEntry15.getExtraField(zipShort28);
        boolean boolean31 = zipArchiveEntry15.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit32 = zipArchiveEntry15.getGeneralPurposeBit();
        zipArchiveEntry8.setGeneralPurposeBit(generalPurposeBit32);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit32);
        zipArchiveEntry1.setUnixMode(0);
        zipArchiveEntry1.setExternalAttributes((long) (short) 100);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(generalPurposeBit9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(zipExtraField29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit32);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = zipArchiveEntry1.getExtraField(zipShort3);
        byte[] byteArray5 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry1.getExtraFields();
        org.junit.Assert.assertNull(zipExtraField4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray6, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData12 = zipArchiveEntry10.getUnparseableExtraFieldData();
        java.lang.Object obj13 = zipArchiveEntry10.clone();
        zipArchiveEntry10.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit18 = zipArchiveEntry17.getGeneralPurposeBit();
        zipArchiveEntry17.setTime((long) (byte) 10);
        long long21 = zipArchiveEntry17.getCrc();
        int int22 = zipArchiveEntry17.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry24.setExtra();
        byte[] byteArray26 = zipArchiveEntry24.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date29 = zipArchiveEntry28.getLastModifiedDate();
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry28.setName("hi!", byteArray33);
        zipArchiveEntry24.setExtra(byteArray33);
        long long36 = zipArchiveEntry24.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort37 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField38 = zipArchiveEntry24.getExtraField(zipShort37);
        boolean boolean40 = zipArchiveEntry24.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit41 = zipArchiveEntry24.getGeneralPurposeBit();
        zipArchiveEntry17.setGeneralPurposeBit(generalPurposeBit41);
        zipArchiveEntry10.setGeneralPurposeBit(generalPurposeBit41);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry45.setExtra();
        byte[] byteArray47 = zipArchiveEntry45.getRawName();
        zipArchiveEntry45.setPlatform((int) (byte) 100);
        zipArchiveEntry45.setExternalAttributes((long) 10);
        long long52 = zipArchiveEntry45.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry54.setExtra();
        zipArchiveEntry54.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date60 = zipArchiveEntry59.getLastModifiedDate();
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry59.setName("hi!", byteArray64);
        zipArchiveEntry54.setCentralDirectoryExtra(byteArray64);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry68 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry68.setExtra();
        byte[] byteArray70 = zipArchiveEntry68.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry72 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date73 = zipArchiveEntry72.getLastModifiedDate();
        byte[] byteArray77 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry72.setName("hi!", byteArray77);
        zipArchiveEntry68.setExtra(byteArray77);
        byte[] byteArray84 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry68.setCentralDirectoryExtra(byteArray84);
        zipArchiveEntry68.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData88 = zipArchiveEntry68.getUnparseableExtraFieldData();
        zipArchiveEntry54.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData88);
        zipArchiveEntry45.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData88);
        zipArchiveEntry10.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData88);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData88);
        zipArchiveEntry1.setCrc((long) 35);
        zipArchiveEntry1.setInternalAttributes((int) ' ');
        java.lang.String str97 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(generalPurposeBit18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(byteArray26);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNull(zipExtraField38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit41);
        org.junit.Assert.assertNull(byteArray47);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray70);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData88);
        org.junit.Assert.assertNull(str97);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        int int4 = zipArchiveEntry1.getUnixMode();
        long long5 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setPlatform(0);
        zipArchiveEntry8.setExtra();
        java.lang.Object obj12 = zipArchiveEntry8.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date19 = zipArchiveEntry18.getLastModifiedDate();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry18.setName("hi!", byteArray23);
        zipArchiveEntry15.setExtra(byteArray23);
        zipArchiveEntry8.setName("", byteArray23);
        zipArchiveEntry1.setName("hi!", byteArray23);
        java.lang.String str28 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        long long4 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry6.setPlatform(0);
        zipArchiveEntry6.setExtra();
        java.lang.Object obj10 = zipArchiveEntry6.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date17 = zipArchiveEntry16.getLastModifiedDate();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry16.setName("hi!", byteArray21);
        zipArchiveEntry13.setExtra(byteArray21);
        zipArchiveEntry6.setName("", byteArray21);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry26.setPlatform(0);
        java.lang.Object obj29 = null;
        boolean boolean30 = zipArchiveEntry26.equals(obj29);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData31 = zipArchiveEntry26.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry26.getExtraFields();
        zipArchiveEntry6.setExtraFields(zipExtraFieldArray32);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray32);
        zipArchiveEntry1.setCrc((long) 35);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry38.setExtra();
        zipArchiveEntry38.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort42 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField43 = zipArchiveEntry38.getExtraField(zipShort42);
        byte[] byteArray44 = zipArchiveEntry38.getCentralDirectoryExtra();
        boolean boolean45 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry38);
        int int46 = zipArchiveEntry38.getMethod();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData31);
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray32, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setInternalAttributes(100);
        long long21 = zipArchiveEntry1.getCrc();
        java.lang.String str22 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = zipArchiveEntry24.getGeneralPurposeBit();
        int int26 = zipArchiveEntry24.getMethod();
        long long27 = zipArchiveEntry24.getCompressedSize();
        long long28 = zipArchiveEntry24.getTime();
        byte[] byteArray29 = zipArchiveEntry24.getRawName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = zipArchiveEntry24.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray30);
        boolean boolean32 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(generalPurposeBit25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNull(byteArray29);
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray30, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        long long16 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setCrc((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit19 = zipArchiveEntry1.getGeneralPurposeBit();
        int int20 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData21 = zipArchiveEntry1.getUnparseableExtraFieldData();
        int int22 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(generalPurposeBit19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(unparseableExtraFieldData21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = zipArchiveEntry1.getExtraField(zipShort9);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit13 = zipArchiveEntry12.getGeneralPurposeBit();
        long long14 = zipArchiveEntry12.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry12.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray15);
        zipArchiveEntry1.setTime((long) 35);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData19 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData25 = zipArchiveEntry23.getUnparseableExtraFieldData();
        java.lang.Object obj26 = zipArchiveEntry23.clone();
        zipArchiveEntry23.setName("hi!");
        int int29 = zipArchiveEntry23.getMethod();
        java.lang.String str30 = zipArchiveEntry23.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime35 = zipArchiveEntry32.getLastModifiedTime();
        boolean boolean36 = zipArchiveEntry23.equals((java.lang.Object) zipArchiveEntry32);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date39 = zipArchiveEntry38.getLastModifiedDate();
        long long40 = zipArchiveEntry38.getTime();
        java.lang.String str41 = zipArchiveEntry38.getComment();
        zipArchiveEntry38.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray44 = zipArchiveEntry38.getExtraFields();
        byte[] byteArray45 = zipArchiveEntry38.getLocalFileDataExtra();
        boolean boolean46 = zipArchiveEntry23.equals((java.lang.Object) byteArray45);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray48 = zipArchiveEntry23.getExtraFields(false);
        zipArchiveEntry23.setMethod((int) ' ');
        int int51 = zipArchiveEntry23.getMethod();
        boolean boolean52 = zipArchiveEntry1.equals((java.lang.Object) int51);
        byte[] byteArray53 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(zipExtraField10);
        org.junit.Assert.assertNotNull(generalPurposeBit13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray15, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(unparseableExtraFieldData19);
        org.junit.Assert.assertNull(unparseableExtraFieldData25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(fileTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(zipExtraFieldArray44);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray44, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray48);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray48, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 32 + "'", int51 == 32);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setTime(10L);
        int int10 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setPlatform((int) (short) 0);
        long long13 = zipArchiveEntry1.getTime();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastModifiedTime();
        int int5 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        byte[] byteArray9 = zipArchiveEntry7.getRawName();
        zipArchiveEntry7.setPlatform((int) (byte) 100);
        long long12 = zipArchiveEntry7.getSize();
        long long13 = zipArchiveEntry7.getTime();
        byte[] byteArray14 = zipArchiveEntry7.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray14);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setExtra();
        byte[] byteArray19 = zipArchiveEntry17.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date22 = zipArchiveEntry21.getLastModifiedDate();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry21.setName("hi!", byteArray26);
        zipArchiveEntry17.setExtra(byteArray26);
        long long29 = zipArchiveEntry17.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField31 = zipArchiveEntry17.getExtraField(zipShort30);
        boolean boolean33 = zipArchiveEntry17.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit34 = zipArchiveEntry17.getGeneralPurposeBit();
        zipArchiveEntry17.setExternalAttributes(10L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry38.setExtra();
        byte[] byteArray40 = zipArchiveEntry38.getRawName();
        zipArchiveEntry38.setPlatform((int) (byte) 100);
        long long43 = zipArchiveEntry38.getSize();
        long long44 = zipArchiveEntry38.getTime();
        byte[] byteArray45 = zipArchiveEntry38.getLocalFileDataExtra();
        boolean boolean46 = zipArchiveEntry17.equals((java.lang.Object) byteArray45);
        zipArchiveEntry1.setExtra(byteArray45);
        long long48 = zipArchiveEntry1.getTime();
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(zipExtraField31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit34);
        org.junit.Assert.assertNull(byteArray40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray6);
        zipArchiveEntry1.setInternalAttributes((int) (byte) 0);
        zipArchiveEntry1.setTime((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        byte[] byteArray15 = zipArchiveEntry13.getRawName();
        zipArchiveEntry13.setPlatform((int) (byte) 100);
        long long18 = zipArchiveEntry13.getSize();
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry13.getLastModifiedTime();
        long long20 = zipArchiveEntry13.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = zipArchiveEntry13.getExtraField(zipShort21);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = zipArchiveEntry24.getGeneralPurposeBit();
        long long26 = zipArchiveEntry24.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry24.getExtraFields();
        zipArchiveEntry13.setExtraFields(zipExtraFieldArray27);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField30 = zipArchiveEntry13.getExtraField(zipShort29);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry13.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray31);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date35 = zipArchiveEntry34.getLastModifiedDate();
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry34.setName("hi!", byteArray39);
        long long41 = zipArchiveEntry34.getSize();
        java.lang.String str42 = zipArchiveEntry34.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray44 = zipArchiveEntry34.getExtraFields(true);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray44);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry47.setExtra();
        byte[] byteArray49 = zipArchiveEntry47.getRawName();
        zipArchiveEntry47.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime52 = zipArchiveEntry47.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit53 = zipArchiveEntry47.getGeneralPurposeBit();
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit53);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray6, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNull(zipExtraField22);
        org.junit.Assert.assertNotNull(generalPurposeBit25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField30);
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray31, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray44);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray44, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertNull(fileTime52);
        org.junit.Assert.assertNotNull(generalPurposeBit53);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        int int8 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry1.getExtraFields(true);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("");
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.setExtra(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        zipArchiveEntry0.setComment("hi!");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit3 = zipArchiveEntry0.getGeneralPurposeBit();
        byte[] byteArray4 = zipArchiveEntry0.getRawName();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = zipArchiveEntry0.getUnparseableExtraFieldData();
        zipArchiveEntry0.setComment("");
        long long8 = zipArchiveEntry0.getTime();
        org.junit.Assert.assertNotNull(generalPurposeBit3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        int int4 = zipArchiveEntry1.getMethod();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date8 = zipArchiveEntry7.getLastModifiedDate();
        long long9 = zipArchiveEntry7.getTime();
        java.lang.String str10 = zipArchiveEntry7.getComment();
        zipArchiveEntry7.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = zipArchiveEntry7.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray13);
        long long15 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setCompressedSize((long) (short) -1);
        long long18 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData19 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray13, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData19);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        long long12 = zipArchiveEntry1.getCompressedSize();
        boolean boolean13 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime14 = zipArchiveEntry1.getLastAccessTime();
        byte[] byteArray15 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.nio.file.attribute.FileTime fileTime16 = zipArchiveEntry1.getLastAccessTime();
        long long17 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry19.setExtra();
        java.lang.Object obj21 = zipArchiveEntry19.clone();
        byte[] byteArray22 = zipArchiveEntry19.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = zipArchiveEntry24.getGeneralPurposeBit();
        long long26 = zipArchiveEntry24.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry24.getExtraFields();
        byte[] byteArray28 = zipArchiveEntry24.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry30.setExtra();
        zipArchiveEntry30.setTime(0L);
        zipArchiveEntry30.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime36 = zipArchiveEntry30.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry37 = zipArchiveEntry24.setLastModifiedTime(fileTime36);
        java.util.zip.ZipEntry zipEntry38 = zipArchiveEntry19.setCreationTime(fileTime36);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit39 = zipArchiveEntry19.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime43 = zipArchiveEntry42.getLastAccessTime();
        long long44 = zipArchiveEntry42.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry46.setExtra();
        byte[] byteArray48 = zipArchiveEntry46.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date51 = zipArchiveEntry50.getLastModifiedDate();
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry50.setName("hi!", byteArray55);
        zipArchiveEntry46.setExtra(byteArray55);
        long long58 = zipArchiveEntry46.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry61 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date62 = zipArchiveEntry61.getLastModifiedDate();
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry61.setName("hi!", byteArray66);
        zipArchiveEntry46.setName("", byteArray66);
        zipArchiveEntry46.setExtra();
        int int70 = zipArchiveEntry46.getMethod();
        zipArchiveEntry46.setName("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray73 = zipArchiveEntry46.getExtraFields();
        zipArchiveEntry42.setExtraFields(zipExtraFieldArray73);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry77 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry77.setExtra();
        zipArchiveEntry77.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry82 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date83 = zipArchiveEntry82.getLastModifiedDate();
        byte[] byteArray87 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry82.setName("hi!", byteArray87);
        zipArchiveEntry77.setCentralDirectoryExtra(byteArray87);
        zipArchiveEntry42.setName("", byteArray87);
        zipArchiveEntry19.setName("hi!", byteArray87);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray92 = zipArchiveEntry19.getExtraFields();
        boolean boolean93 = zipArchiveEntry1.equals((java.lang.Object) zipExtraFieldArray92);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(fileTime14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNull(fileTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNotNull(fileTime36);
        org.junit.Assert.assertNotNull(zipEntry37);
        org.junit.Assert.assertEquals(zipEntry37.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry38);
        org.junit.Assert.assertEquals(zipEntry38.toString(), "hi!");
        org.junit.Assert.assertNotNull(generalPurposeBit39);
        org.junit.Assert.assertNull(fileTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNull(byteArray48);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray73);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray73, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray92);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray92, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry1.setName("hi!", byteArray6);
        long long8 = zipArchiveEntry1.getSize();
        java.lang.String str9 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = zipArchiveEntry1.getExtraFields(true);
        byte[] byteArray12 = zipArchiveEntry1.getRawName();
        java.lang.Class<?> wildcardClass13 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray11, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        long long16 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setCrc((long) (byte) 10);
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(fileTime19);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        int int16 = zipArchiveEntry1.getUnixMode();
        int int17 = zipArchiveEntry1.getPlatform();
        long long18 = zipArchiveEntry1.getTime();
        long long19 = zipArchiveEntry1.getTime();
        int int20 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit21 = zipArchiveEntry1.getGeneralPurposeBit();
        java.nio.file.attribute.FileTime fileTime22 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setExternalAttributes((long) 0);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit21);
        org.junit.Assert.assertNull(fileTime22);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit8 = zipArchiveEntry7.getGeneralPurposeBit();
        int int9 = zipArchiveEntry7.getMethod();
        long long10 = zipArchiveEntry7.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        zipArchiveEntry13.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date19 = zipArchiveEntry18.getLastModifiedDate();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry18.setName("hi!", byteArray23);
        zipArchiveEntry13.setCentralDirectoryExtra(byteArray23);
        zipArchiveEntry7.setName("hi!", byteArray23);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray23);
        zipArchiveEntry1.setName("hi!");
        byte[] byteArray30 = zipArchiveEntry1.getLocalFileDataExtra();
        java.util.Date date31 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray32 = zipArchiveEntry1.getLocalFileDataExtra();
        java.lang.String str33 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setTime(0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        long long4 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setExternalAttributes((long) 10);
        byte[] byteArray7 = zipArchiveEntry1.getRawName();
        int int8 = zipArchiveEntry1.getUnixMode();
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getLastAccessTime();
        int int10 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setCrc((long) 100);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        long long12 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setCrc(0L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit17 = zipArchiveEntry16.getGeneralPurposeBit();
        zipArchiveEntry16.setTime((long) (byte) 10);
        long long20 = zipArchiveEntry16.getCrc();
        zipArchiveEntry16.setUnixMode((-1));
        java.time.LocalDateTime localDateTime23 = zipArchiveEntry16.getTimeLocal();
        zipArchiveEntry1.setTimeLocal(localDateTime23);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setInternalAttributes(100);
        zipArchiveEntry1.setTime(0L);
        zipArchiveEntry1.setCompressedSize((long) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry26.setExtra();
        byte[] byteArray28 = zipArchiveEntry26.getRawName();
        zipArchiveEntry26.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime31 = zipArchiveEntry26.getLastModifiedTime();
        zipArchiveEntry26.setInternalAttributes(8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setExtra();
        zipArchiveEntry36.setName("");
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry36.setName("", byteArray45);
        zipArchiveEntry26.setName("", byteArray45);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray45);
        int int49 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNull(fileTime31);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setExtra();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        int int6 = zipArchiveEntry1.getInternalAttributes();
        long long7 = zipArchiveEntry1.getCrc();
        int int8 = zipArchiveEntry1.getInternalAttributes();
        long long9 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setCompressedSize((long) 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("");
        byte[] byteArray8 = zipArchiveEntry1.getRawName();
        java.lang.String str9 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setPlatform(0);
        zipArchiveEntry11.setTime((long) (short) -1);
        byte[] byteArray16 = zipArchiveEntry11.getCentralDirectoryExtra();
        byte[] byteArray17 = zipArchiveEntry11.getRawName();
        long long18 = zipArchiveEntry11.getCompressedSize();
        byte[] byteArray19 = zipArchiveEntry11.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry21.setExtra();
        byte[] byteArray23 = zipArchiveEntry21.getRawName();
        zipArchiveEntry21.setPlatform((int) (byte) 100);
        zipArchiveEntry21.setExternalAttributes((long) 10);
        long long28 = zipArchiveEntry21.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date31 = zipArchiveEntry30.getLastModifiedDate();
        long long32 = zipArchiveEntry30.getTime();
        java.lang.String str33 = zipArchiveEntry30.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray36 = zipArchiveEntry35.getExtraFields();
        zipArchiveEntry30.setExtraFields(zipExtraFieldArray36);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date40 = zipArchiveEntry39.getLastModifiedDate();
        long long41 = zipArchiveEntry39.getTime();
        java.lang.String str42 = zipArchiveEntry39.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray45 = zipArchiveEntry44.getExtraFields();
        zipArchiveEntry39.setExtraFields(zipExtraFieldArray45);
        zipArchiveEntry30.setExtraFields(zipExtraFieldArray45);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry49 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry49.setExtra();
        byte[] byteArray51 = zipArchiveEntry49.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date54 = zipArchiveEntry53.getLastModifiedDate();
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry53.setName("hi!", byteArray58);
        zipArchiveEntry49.setExtra(byteArray58);
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry49.setCentralDirectoryExtra(byteArray65);
        zipArchiveEntry30.setCentralDirectoryExtra(byteArray65);
        java.lang.String str68 = zipArchiveEntry30.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry70 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry70.setExtra();
        zipArchiveEntry70.setTime(0L);
        zipArchiveEntry70.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime76 = zipArchiveEntry70.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry77 = zipArchiveEntry30.setLastModifiedTime(fileTime76);
        java.util.zip.ZipEntry zipEntry78 = zipArchiveEntry21.setLastModifiedTime(fileTime76);
        java.util.zip.ZipEntry zipEntry79 = zipArchiveEntry11.setLastModifiedTime(fileTime76);
        java.util.zip.ZipEntry zipEntry80 = zipArchiveEntry1.setCreationTime(fileTime76);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(zipExtraFieldArray36);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray36, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(zipExtraFieldArray45);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray45, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray51);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(fileTime76);
        org.junit.Assert.assertNotNull(zipEntry77);
        org.junit.Assert.assertEquals(zipEntry77.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry78);
        org.junit.Assert.assertEquals(zipEntry78.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry79);
        org.junit.Assert.assertEquals(zipEntry79.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry80);
        org.junit.Assert.assertEquals(zipEntry80.toString(), "");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        zipArchiveEntry0.setComment("hi!");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit3 = zipArchiveEntry0.getGeneralPurposeBit();
        byte[] byteArray4 = zipArchiveEntry0.getRawName();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = zipArchiveEntry0.getUnparseableExtraFieldData();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry0.setMethod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generalPurposeBit3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        int int4 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        zipArchiveEntry7.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry7.setCentralDirectoryExtra(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry21.setExtra();
        byte[] byteArray23 = zipArchiveEntry21.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date26 = zipArchiveEntry25.getLastModifiedDate();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry25.setName("hi!", byteArray30);
        zipArchiveEntry21.setExtra(byteArray30);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry21.setCentralDirectoryExtra(byteArray37);
        zipArchiveEntry21.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData41 = zipArchiveEntry21.getUnparseableExtraFieldData();
        zipArchiveEntry7.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData41);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData41);
        int int44 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setTime(32L);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry1.setName("hi!", byteArray6);
        long long8 = zipArchiveEntry1.getSize();
        java.lang.String str9 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setCompressedSize(0L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData15 = zipArchiveEntry13.getUnparseableExtraFieldData();
        java.lang.Object obj16 = zipArchiveEntry13.clone();
        zipArchiveEntry13.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit21 = zipArchiveEntry20.getGeneralPurposeBit();
        zipArchiveEntry20.setTime((long) (byte) 10);
        long long24 = zipArchiveEntry20.getCrc();
        int int25 = zipArchiveEntry20.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry27.setExtra();
        byte[] byteArray29 = zipArchiveEntry27.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date32 = zipArchiveEntry31.getLastModifiedDate();
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry31.setName("hi!", byteArray36);
        zipArchiveEntry27.setExtra(byteArray36);
        long long39 = zipArchiveEntry27.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField41 = zipArchiveEntry27.getExtraField(zipShort40);
        boolean boolean43 = zipArchiveEntry27.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit44 = zipArchiveEntry27.getGeneralPurposeBit();
        zipArchiveEntry20.setGeneralPurposeBit(generalPurposeBit44);
        zipArchiveEntry13.setGeneralPurposeBit(generalPurposeBit44);
        zipArchiveEntry13.setCrc((long) 8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry51.setPlatform(0);
        zipArchiveEntry51.setExtra();
        byte[] byteArray55 = zipArchiveEntry51.getExtra();
        zipArchiveEntry13.setName("", byteArray55);
        boolean boolean57 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry13);
        zipArchiveEntry1.setUnixMode(35);
        zipArchiveEntry1.setExternalAttributes((long) 52);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort62 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField63 = zipArchiveEntry1.getExtraField(zipShort62);
        boolean boolean64 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(unparseableExtraFieldData15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(generalPurposeBit21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(byteArray29);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNull(zipExtraField41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit44);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(zipExtraField63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit8 = zipArchiveEntry7.getGeneralPurposeBit();
        int int9 = zipArchiveEntry7.getMethod();
        long long10 = zipArchiveEntry7.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        zipArchiveEntry13.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date19 = zipArchiveEntry18.getLastModifiedDate();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry18.setName("hi!", byteArray23);
        zipArchiveEntry13.setCentralDirectoryExtra(byteArray23);
        zipArchiveEntry7.setName("hi!", byteArray23);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray23);
        zipArchiveEntry1.setName("hi!");
        java.lang.String str30 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setSize((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData33 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setCompressedSize((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(unparseableExtraFieldData33);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        zipArchiveEntry0.setTime((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry5.setExtra();
        byte[] byteArray7 = zipArchiveEntry5.getRawName();
        zipArchiveEntry5.setPlatform((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry11.getLastAccessTime();
        zipArchiveEntry11.setName("");
        zipArchiveEntry11.setUnixMode((int) (short) 100);
        long long17 = zipArchiveEntry11.getTime();
        java.nio.file.attribute.FileTime fileTime18 = zipArchiveEntry11.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setPlatform(0);
        zipArchiveEntry20.setExtra();
        byte[] byteArray24 = zipArchiveEntry20.getExtra();
        zipArchiveEntry11.setExtra(byteArray24);
        zipArchiveEntry5.setCentralDirectoryExtra(byteArray24);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date33 = zipArchiveEntry32.getLastModifiedDate();
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry32.setName("hi!", byteArray37);
        zipArchiveEntry29.setExtra(byteArray37);
        long long40 = zipArchiveEntry29.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit43 = zipArchiveEntry42.getGeneralPurposeBit();
        int int44 = zipArchiveEntry42.getMethod();
        zipArchiveEntry42.setCompressedSize((long) (-1));
        zipArchiveEntry42.setExternalAttributes((long) 'a');
        zipArchiveEntry42.setSize((long) '#');
        byte[] byteArray51 = zipArchiveEntry42.getLocalFileDataExtra();
        zipArchiveEntry29.setCentralDirectoryExtra(byteArray51);
        zipArchiveEntry5.setName("", byteArray51);
        zipArchiveEntry0.setName("", byteArray51);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit55 = zipArchiveEntry0.getGeneralPurposeBit();
        byte[] byteArray56 = zipArchiveEntry0.getExtra();
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(fileTime18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit55);
        org.junit.Assert.assertNull(byteArray56);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry6.setExtra();
        zipArchiveEntry6.setTime(0L);
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry6.getLastAccessTime();
        zipArchiveEntry6.setExternalAttributes((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry14.setExtra();
        byte[] byteArray16 = zipArchiveEntry14.getRawName();
        zipArchiveEntry14.setPlatform((int) (byte) 100);
        long long19 = zipArchiveEntry14.getSize();
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry14.getLastModifiedTime();
        long long21 = zipArchiveEntry14.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField23 = zipArchiveEntry14.getExtraField(zipShort22);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit26 = zipArchiveEntry25.getGeneralPurposeBit();
        long long27 = zipArchiveEntry25.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = zipArchiveEntry25.getExtraFields();
        zipArchiveEntry14.setExtraFields(zipExtraFieldArray28);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField31 = zipArchiveEntry14.getExtraField(zipShort30);
        zipArchiveEntry14.setUnixMode((int) '4');
        long long34 = zipArchiveEntry14.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setPlatform(0);
        java.lang.String str39 = zipArchiveEntry36.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = zipArchiveEntry36.getExtraFields();
        zipArchiveEntry36.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry44.setExtra();
        zipArchiveEntry44.setTime(0L);
        zipArchiveEntry44.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime50 = zipArchiveEntry44.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry51 = zipArchiveEntry36.setCreationTime(fileTime50);
        java.util.zip.ZipEntry zipEntry52 = zipArchiveEntry14.setLastAccessTime(fileTime50);
        java.util.zip.ZipEntry zipEntry53 = zipArchiveEntry6.setLastAccessTime(fileTime50);
        java.util.zip.ZipEntry zipEntry54 = zipArchiveEntry1.setLastModifiedTime(fileTime50);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry56 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date57 = zipArchiveEntry56.getLastModifiedDate();
        long long58 = zipArchiveEntry56.getTime();
        java.lang.String str59 = zipArchiveEntry56.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry61 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray62 = zipArchiveEntry61.getExtraFields();
        zipArchiveEntry56.setExtraFields(zipExtraFieldArray62);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry65 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date66 = zipArchiveEntry65.getLastModifiedDate();
        long long67 = zipArchiveEntry65.getTime();
        java.lang.String str68 = zipArchiveEntry65.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry70 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray71 = zipArchiveEntry70.getExtraFields();
        zipArchiveEntry65.setExtraFields(zipExtraFieldArray71);
        zipArchiveEntry56.setExtraFields(zipExtraFieldArray71);
        zipArchiveEntry56.setInternalAttributes(100);
        zipArchiveEntry56.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry79 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date80 = zipArchiveEntry79.getLastModifiedDate();
        long long81 = zipArchiveEntry79.getTime();
        java.lang.String str82 = zipArchiveEntry79.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry84 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray85 = zipArchiveEntry84.getExtraFields();
        zipArchiveEntry79.setExtraFields(zipExtraFieldArray85);
        long long87 = zipArchiveEntry79.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry89 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry89.setExtra();
        zipArchiveEntry89.setTime(0L);
        zipArchiveEntry89.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime95 = zipArchiveEntry89.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry96 = zipArchiveEntry79.setLastAccessTime(fileTime95);
        java.util.zip.ZipEntry zipEntry97 = zipArchiveEntry56.setLastModifiedTime(fileTime95);
        java.util.zip.ZipEntry zipEntry98 = zipArchiveEntry1.setLastAccessTime(fileTime95);
        byte[] byteArray99 = zipEntry98.getExtra();
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(zipExtraField23);
        org.junit.Assert.assertNotNull(generalPurposeBit26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray28, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray40, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime50);
        org.junit.Assert.assertNotNull(zipEntry51);
        org.junit.Assert.assertEquals(zipEntry51.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry52);
        org.junit.Assert.assertEquals(zipEntry52.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry53);
        org.junit.Assert.assertEquals(zipEntry53.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry54);
        org.junit.Assert.assertEquals(zipEntry54.toString(), "");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(zipExtraFieldArray62);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray62, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(zipExtraFieldArray71);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray71, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(zipExtraFieldArray85);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray85, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertNotNull(fileTime95);
        org.junit.Assert.assertNotNull(zipEntry96);
        org.junit.Assert.assertEquals(zipEntry96.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry97);
        org.junit.Assert.assertEquals(zipEntry97.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry98);
        org.junit.Assert.assertEquals(zipEntry98.toString(), "");
        org.junit.Assert.assertNotNull(byteArray99);
        org.junit.Assert.assertArrayEquals(byteArray99, new byte[] {});
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        int int16 = zipArchiveEntry1.getUnixMode();
        java.lang.String str17 = zipArchiveEntry1.getName();
        boolean boolean18 = zipArchiveEntry1.isDirectory();
        boolean boolean19 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setSize((long) ' ');
        byte[] byteArray6 = zipArchiveEntry1.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        zipArchiveEntry1.setCompressedSize((long) (short) 0);
        zipArchiveEntry1.setCompressedSize((long) ' ');
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData10 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addAsFirstExtraField(zipExtraField11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData10);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = zipArchiveEntry1.getExtraField(zipShort3);
        long long5 = zipArchiveEntry1.getCompressedSize();
        java.lang.String str6 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setComment("");
        zipArchiveEntry1.setCompressedSize(3L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setExtra();
        byte[] byteArray14 = zipArchiveEntry12.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date17 = zipArchiveEntry16.getLastModifiedDate();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry16.setName("hi!", byteArray21);
        zipArchiveEntry12.setExtra(byteArray21);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray25 = zipArchiveEntry12.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry12.getExtraFields(true);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray27);
        java.lang.Object obj29 = zipArchiveEntry1.clone();
        org.junit.Assert.assertNull(zipExtraField4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray25);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray25, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setUnixMode((int) (short) 100);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData7 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setTime((long) 35);
        java.lang.Class<?> wildcardClass11 = zipArchiveEntry1.getClass();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(unparseableExtraFieldData7);
        org.junit.Assert.assertNull(unparseableExtraFieldData8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        long long3 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray5 = zipArchiveEntry1.getLocalFileDataExtra();
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("");
        long long9 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setInternalAttributes((int) (short) 10);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit12 = zipArchiveEntry1.getGeneralPurposeBit();
        int int13 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit14 = zipArchiveEntry1.getGeneralPurposeBit();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray4, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit14);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        zipArchiveEntry1.setSize((long) (short) 10);
        long long7 = zipArchiveEntry1.getTime();
        long long8 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setSize((long) 8);
        long long11 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date14 = zipArchiveEntry13.getLastModifiedDate();
        long long15 = zipArchiveEntry13.getTime();
        java.lang.String str16 = zipArchiveEntry13.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = zipArchiveEntry18.getExtraFields();
        zipArchiveEntry13.setExtraFields(zipExtraFieldArray19);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date23 = zipArchiveEntry22.getLastModifiedDate();
        long long24 = zipArchiveEntry22.getTime();
        java.lang.String str25 = zipArchiveEntry22.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = zipArchiveEntry27.getExtraFields();
        zipArchiveEntry22.setExtraFields(zipExtraFieldArray28);
        zipArchiveEntry13.setExtraFields(zipExtraFieldArray28);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setExtra();
        byte[] byteArray34 = zipArchiveEntry32.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date37 = zipArchiveEntry36.getLastModifiedDate();
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry36.setName("hi!", byteArray41);
        zipArchiveEntry32.setExtra(byteArray41);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry32.setCentralDirectoryExtra(byteArray48);
        zipArchiveEntry13.setCentralDirectoryExtra(byteArray48);
        zipArchiveEntry13.setInternalAttributes((int) 'a');
        boolean boolean53 = zipArchiveEntry13.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry55.setExtra();
        byte[] byteArray57 = zipArchiveEntry55.getRawName();
        zipArchiveEntry55.setPlatform((int) (byte) 100);
        long long60 = zipArchiveEntry55.getSize();
        java.nio.file.attribute.FileTime fileTime61 = zipArchiveEntry55.getLastModifiedTime();
        long long62 = zipArchiveEntry55.getCrc();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit63 = zipArchiveEntry55.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry65 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry65.setExtra();
        zipArchiveEntry65.setTime(0L);
        zipArchiveEntry65.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime71 = zipArchiveEntry65.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry72 = zipArchiveEntry55.setCreationTime(fileTime71);
        java.util.zip.ZipEntry zipEntry73 = zipArchiveEntry13.setLastModifiedTime(fileTime71);
        java.util.zip.ZipEntry zipEntry74 = zipArchiveEntry1.setCreationTime(fileTime71);
        java.lang.Object obj75 = zipArchiveEntry1.clone();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 8L + "'", long11 == 8L);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray19, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray28, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(byteArray57);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNull(fileTime61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit63);
        org.junit.Assert.assertNotNull(fileTime71);
        org.junit.Assert.assertNotNull(zipEntry72);
        org.junit.Assert.assertEquals(zipEntry72.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry73);
        org.junit.Assert.assertEquals(zipEntry73.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry74);
        org.junit.Assert.assertEquals(zipEntry74.toString(), "");
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertEquals(obj75.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj75), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj75), "");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        long long5 = zipArchiveEntry1.getTime();
        byte[] byteArray6 = zipArchiveEntry1.getRawName();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        long long8 = zipArchiveEntry1.getSize();
        int int9 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry1.getExtraFields(false);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray6, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray6);
        zipArchiveEntry1.setInternalAttributes((int) (byte) 0);
        zipArchiveEntry1.setTime((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        byte[] byteArray15 = zipArchiveEntry13.getRawName();
        zipArchiveEntry13.setPlatform((int) (byte) 100);
        long long18 = zipArchiveEntry13.getSize();
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry13.getLastModifiedTime();
        long long20 = zipArchiveEntry13.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = zipArchiveEntry13.getExtraField(zipShort21);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = zipArchiveEntry24.getGeneralPurposeBit();
        long long26 = zipArchiveEntry24.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry24.getExtraFields();
        zipArchiveEntry13.setExtraFields(zipExtraFieldArray27);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField30 = zipArchiveEntry13.getExtraField(zipShort29);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry13.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray6, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNull(zipExtraField22);
        org.junit.Assert.assertNotNull(generalPurposeBit25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField30);
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray31, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        zipArchiveEntry7.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry7.setCentralDirectoryExtra(byteArray17);
        zipArchiveEntry1.setName("hi!", byteArray17);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry22.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date26 = zipArchiveEntry25.getLastModifiedDate();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry25.setName("hi!", byteArray30);
        zipArchiveEntry22.setExtra(byteArray30);
        zipArchiveEntry1.setExtra(byteArray30);
        int int34 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setPlatform(0);
        java.lang.String str39 = zipArchiveEntry36.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = zipArchiveEntry36.getExtraFields();
        boolean boolean41 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry36);
        byte[] byteArray42 = zipArchiveEntry36.getRawName();
        byte[] byteArray43 = zipArchiveEntry36.getExtra();
        java.nio.file.attribute.FileTime fileTime44 = zipArchiveEntry36.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry46.setExtra();
        java.lang.Object obj48 = zipArchiveEntry46.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setPlatform(0);
        zipArchiveEntry50.setTime((long) (short) -1);
        byte[] byteArray55 = zipArchiveEntry50.getCentralDirectoryExtra();
        byte[] byteArray56 = zipArchiveEntry50.getRawName();
        long long57 = zipArchiveEntry50.getCompressedSize();
        byte[] byteArray58 = zipArchiveEntry50.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry60.setPlatform(0);
        zipArchiveEntry60.setTime((long) (short) -1);
        byte[] byteArray65 = zipArchiveEntry60.getCentralDirectoryExtra();
        int int66 = zipArchiveEntry60.getInternalAttributes();
        java.time.LocalDateTime localDateTime67 = zipArchiveEntry60.getTimeLocal();
        zipArchiveEntry50.setTimeLocal(localDateTime67);
        zipArchiveEntry46.setTimeLocal(localDateTime67);
        zipArchiveEntry36.setTimeLocal(localDateTime67);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray40, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(byteArray42);
        org.junit.Assert.assertNull(byteArray43);
        org.junit.Assert.assertNull(fileTime44);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertNull(byteArray56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(localDateTime67);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        long long12 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = zipArchiveEntry1.getExtraFields();
        long long14 = zipArchiveEntry1.getCrc();
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry1.getCreationTime();
        byte[] byteArray16 = zipArchiveEntry1.getRawName();
        long long17 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setUnixMode(100);
        java.lang.String str20 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray13, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date7 = zipArchiveEntry6.getLastModifiedDate();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry6.setName("hi!", byteArray11);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        zipArchiveEntry15.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry15.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit24 = zipArchiveEntry23.getGeneralPurposeBit();
        int int25 = zipArchiveEntry23.getMethod();
        long long26 = zipArchiveEntry23.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setExtra();
        zipArchiveEntry29.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date35 = zipArchiveEntry34.getLastModifiedDate();
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry34.setName("hi!", byteArray39);
        zipArchiveEntry29.setCentralDirectoryExtra(byteArray39);
        zipArchiveEntry23.setName("hi!", byteArray39);
        zipArchiveEntry15.setName("", byteArray39);
        zipArchiveEntry1.setExtra(byteArray39);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date47 = zipArchiveEntry46.getLastModifiedDate();
        long long48 = zipArchiveEntry46.getTime();
        java.lang.String str49 = zipArchiveEntry46.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray52 = zipArchiveEntry51.getExtraFields();
        zipArchiveEntry46.setExtraFields(zipExtraFieldArray52);
        zipArchiveEntry46.setCompressedSize((long) 8);
        boolean boolean56 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry46);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit57 = zipArchiveEntry1.getGeneralPurposeBit();
        byte[] byteArray58 = zipArchiveEntry1.getRawName();
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertNotNull(generalPurposeBit24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(zipExtraFieldArray52);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray52, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit57);
        org.junit.Assert.assertNull(byteArray58);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setCompressedSize((long) (-1));
        zipArchiveEntry1.setExternalAttributes((long) 'a');
        zipArchiveEntry1.setSize((long) '#');
        byte[] byteArray10 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setInternalAttributes(32);
        zipArchiveEntry1.setExtra();
        boolean boolean14 = zipArchiveEntry1.isDirectory();
        java.lang.String str15 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setMethod((int) (byte) 0);
        int int7 = zipArchiveEntry1.getInternalAttributes();
        int int8 = zipArchiveEntry1.getPlatform();
        java.lang.Object obj9 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setCrc((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date14 = zipArchiveEntry13.getLastModifiedDate();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry13.setName("hi!", byteArray18);
        long long20 = zipArchiveEntry13.getSize();
        java.lang.String str21 = zipArchiveEntry13.getName();
        zipArchiveEntry13.setInternalAttributes((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry25.setPlatform(0);
        java.lang.String str28 = zipArchiveEntry25.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray29 = zipArchiveEntry25.getExtraFields();
        zipArchiveEntry25.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry33.setExtra();
        zipArchiveEntry33.setTime(0L);
        zipArchiveEntry33.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime39 = zipArchiveEntry33.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry40 = zipArchiveEntry25.setCreationTime(fileTime39);
        java.util.zip.ZipEntry zipEntry41 = zipArchiveEntry13.setLastAccessTime(fileTime39);
        java.util.zip.ZipEntry zipEntry42 = zipArchiveEntry1.setCreationTime(fileTime39);
        java.lang.String str43 = zipEntry42.getComment();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(zipExtraFieldArray29);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray29, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime39);
        org.junit.Assert.assertNotNull(zipEntry40);
        org.junit.Assert.assertEquals(zipEntry40.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry41);
        org.junit.Assert.assertEquals(zipEntry41.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry42);
        org.junit.Assert.assertEquals(zipEntry42.toString(), "");
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setTime((long) (short) -1);
        byte[] byteArray6 = zipArchiveEntry1.getCentralDirectoryExtra();
        byte[] byteArray7 = zipArchiveEntry1.getRawName();
        long long8 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setUnixMode((int) (byte) 0);
        boolean boolean11 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setCompressedSize((long) 3);
        long long9 = zipArchiveEntry1.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setExtra();
        byte[] byteArray14 = zipArchiveEntry12.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date17 = zipArchiveEntry16.getLastModifiedDate();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry16.setName("hi!", byteArray21);
        zipArchiveEntry12.setExtra(byteArray21);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry12.setCentralDirectoryExtra(byteArray28);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry12.getExtraFields(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry33.setExtra();
        byte[] byteArray35 = zipArchiveEntry33.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date38 = zipArchiveEntry37.getLastModifiedDate();
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry37.setName("hi!", byteArray42);
        zipArchiveEntry33.setExtra(byteArray42);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray46 = zipArchiveEntry33.getExtraFields(false);
        zipArchiveEntry12.setExtraFields(zipExtraFieldArray46);
        java.nio.file.attribute.FileTime fileTime48 = zipArchiveEntry12.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setExtra();
        byte[] byteArray52 = zipArchiveEntry50.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date55 = zipArchiveEntry54.getLastModifiedDate();
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry54.setName("hi!", byteArray59);
        zipArchiveEntry50.setExtra(byteArray59);
        long long62 = zipArchiveEntry50.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort63 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField64 = zipArchiveEntry50.getExtraField(zipShort63);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry66 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry66.setExtra();
        zipArchiveEntry66.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry71 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry71.setExtra();
        byte[] byteArray73 = zipArchiveEntry71.getRawName();
        zipArchiveEntry71.setPlatform((int) (byte) 100);
        long long76 = zipArchiveEntry71.getSize();
        java.nio.file.attribute.FileTime fileTime77 = zipArchiveEntry71.getLastModifiedTime();
        long long78 = zipArchiveEntry71.getCrc();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit79 = zipArchiveEntry71.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry81 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry81.setExtra();
        zipArchiveEntry81.setTime(0L);
        zipArchiveEntry81.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime87 = zipArchiveEntry81.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry88 = zipArchiveEntry71.setCreationTime(fileTime87);
        java.util.zip.ZipEntry zipEntry89 = zipArchiveEntry66.setLastModifiedTime(fileTime87);
        java.util.zip.ZipEntry zipEntry90 = zipArchiveEntry50.setCreationTime(fileTime87);
        java.util.zip.ZipEntry zipEntry91 = zipArchiveEntry12.setLastAccessTime(fileTime87);
        java.util.zip.ZipEntry zipEntry92 = zipArchiveEntry1.setLastAccessTime(fileTime87);
        zipEntry92.setCompressedSize((long) (short) 10);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertNull(byteArray35);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray46);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray46, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime48);
        org.junit.Assert.assertNull(byteArray52);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNull(zipExtraField64);
        org.junit.Assert.assertNull(byteArray73);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
        org.junit.Assert.assertNull(fileTime77);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-1L) + "'", long78 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit79);
        org.junit.Assert.assertNotNull(fileTime87);
        org.junit.Assert.assertNotNull(zipEntry88);
        org.junit.Assert.assertEquals(zipEntry88.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry89);
        org.junit.Assert.assertEquals(zipEntry89.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry90);
        org.junit.Assert.assertEquals(zipEntry90.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry91);
        org.junit.Assert.assertEquals(zipEntry91.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry92);
        org.junit.Assert.assertEquals(zipEntry92.toString(), "");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        int int6 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = zipArchiveEntry1.getExtraField(zipShort12);
        int int14 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setExtra();
        byte[] byteArray19 = zipArchiveEntry17.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date22 = zipArchiveEntry21.getLastModifiedDate();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry21.setName("hi!", byteArray26);
        zipArchiveEntry17.setExtra(byteArray26);
        zipArchiveEntry1.setName("hi!", byteArray26);
        java.nio.file.attribute.FileTime fileTime30 = zipArchiveEntry1.getLastAccessTime();
        int int31 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setInternalAttributes(0);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(fileTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        zipArchiveEntry1.setCompressedSize(8L);
        int int11 = zipArchiveEntry1.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setPlatform(0);
        java.lang.Object obj16 = null;
        boolean boolean17 = zipArchiveEntry13.equals(obj16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit20 = zipArchiveEntry19.getGeneralPurposeBit();
        int int21 = zipArchiveEntry19.getMethod();
        long long22 = zipArchiveEntry19.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry25.setExtra();
        zipArchiveEntry25.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date31 = zipArchiveEntry30.getLastModifiedDate();
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry30.setName("hi!", byteArray35);
        zipArchiveEntry25.setCentralDirectoryExtra(byteArray35);
        zipArchiveEntry19.setName("hi!", byteArray35);
        zipArchiveEntry13.setCentralDirectoryExtra(byteArray35);
        zipArchiveEntry13.setName("hi!");
        java.lang.String str42 = zipArchiveEntry13.getComment();
        java.nio.file.attribute.FileTime fileTime43 = zipArchiveEntry13.getLastModifiedTime();
        zipArchiveEntry13.setPlatform(8);
        zipArchiveEntry13.setTime((long) 35);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray49 = zipArchiveEntry13.getExtraFields(false);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray49);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(fileTime43);
        org.junit.Assert.assertNotNull(zipExtraFieldArray49);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray49, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setUnixMode((int) (byte) 1);
        long long8 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date14 = zipArchiveEntry13.getLastModifiedDate();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry13.setName("hi!", byteArray18);
        zipArchiveEntry10.setExtra(byteArray18);
        long long21 = zipArchiveEntry10.getCompressedSize();
        zipArchiveEntry10.setExtra();
        boolean boolean23 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry10);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setCompressedSize((long) (-1));
        zipArchiveEntry1.setExternalAttributes((long) 'a');
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort9);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(fileTime8);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.String str8 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setName("");
        int int11 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit14 = zipArchiveEntry13.getGeneralPurposeBit();
        zipArchiveEntry13.setTime((long) (byte) 10);
        long long17 = zipArchiveEntry13.getCrc();
        long long18 = zipArchiveEntry13.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        byte[] byteArray22 = zipArchiveEntry20.getRawName();
        zipArchiveEntry20.setPlatform((int) (byte) 100);
        zipArchiveEntry20.setExternalAttributes((long) 10);
        long long27 = zipArchiveEntry20.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit30 = zipArchiveEntry29.getGeneralPurposeBit();
        zipArchiveEntry29.setTime((long) (byte) 10);
        long long33 = zipArchiveEntry29.getCrc();
        int int34 = zipArchiveEntry29.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setExtra();
        byte[] byteArray38 = zipArchiveEntry36.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date41 = zipArchiveEntry40.getLastModifiedDate();
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry40.setName("hi!", byteArray45);
        zipArchiveEntry36.setExtra(byteArray45);
        long long48 = zipArchiveEntry36.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort49 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField50 = zipArchiveEntry36.getExtraField(zipShort49);
        boolean boolean52 = zipArchiveEntry36.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit53 = zipArchiveEntry36.getGeneralPurposeBit();
        zipArchiveEntry29.setGeneralPurposeBit(generalPurposeBit53);
        byte[] byteArray55 = zipArchiveEntry29.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit58 = zipArchiveEntry57.getGeneralPurposeBit();
        int int59 = zipArchiveEntry57.getMethod();
        zipArchiveEntry57.setCompressedSize((long) (-1));
        zipArchiveEntry57.setExternalAttributes((long) 'a');
        zipArchiveEntry57.setCompressedSize((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry67 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit68 = zipArchiveEntry67.getGeneralPurposeBit();
        zipArchiveEntry67.setTime((long) (byte) 10);
        long long71 = zipArchiveEntry67.getCrc();
        zipArchiveEntry67.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData74 = zipArchiveEntry67.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime75 = zipArchiveEntry67.getTimeLocal();
        zipArchiveEntry57.setTimeLocal(localDateTime75);
        zipArchiveEntry29.setTimeLocal(localDateTime75);
        zipArchiveEntry20.setTimeLocal(localDateTime75);
        zipArchiveEntry13.setTimeLocal(localDateTime75);
        zipArchiveEntry1.setTimeLocal(localDateTime75);
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNull(zipExtraField50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit53);
        org.junit.Assert.assertNull(byteArray55);
        org.junit.Assert.assertNotNull(generalPurposeBit58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(generalPurposeBit68);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData74);
        org.junit.Assert.assertNotNull(localDateTime75);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        java.lang.Object obj3 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setSize((long) 3);
        int int6 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setSize((long) 'a');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = zipArchiveEntry10.getGeneralPurposeBit();
        int int12 = zipArchiveEntry10.getMethod();
        long long13 = zipArchiveEntry10.getCompressedSize();
        zipArchiveEntry10.setMethod((int) (byte) 0);
        zipArchiveEntry10.setTime(1L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry19.setExtra();
        byte[] byteArray21 = zipArchiveEntry19.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date24 = zipArchiveEntry23.getLastModifiedDate();
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry23.setName("hi!", byteArray28);
        zipArchiveEntry19.setExtra(byteArray28);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry19.getExtraFields(false);
        long long33 = zipArchiveEntry19.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date36 = zipArchiveEntry35.getLastModifiedDate();
        long long37 = zipArchiveEntry35.getTime();
        java.lang.String str38 = zipArchiveEntry35.getComment();
        long long39 = zipArchiveEntry35.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        byte[] byteArray43 = zipArchiveEntry41.getRawName();
        zipArchiveEntry41.setPlatform((int) (byte) 100);
        zipArchiveEntry41.setExternalAttributes((long) 10);
        long long48 = zipArchiveEntry41.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setExtra();
        zipArchiveEntry50.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date56 = zipArchiveEntry55.getLastModifiedDate();
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry55.setName("hi!", byteArray60);
        zipArchiveEntry50.setCentralDirectoryExtra(byteArray60);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry64.setExtra();
        byte[] byteArray66 = zipArchiveEntry64.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry68 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date69 = zipArchiveEntry68.getLastModifiedDate();
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry68.setName("hi!", byteArray73);
        zipArchiveEntry64.setExtra(byteArray73);
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry64.setCentralDirectoryExtra(byteArray80);
        zipArchiveEntry64.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData84 = zipArchiveEntry64.getUnparseableExtraFieldData();
        zipArchiveEntry50.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry41.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry35.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry19.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry10.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData84);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData91 = zipArchiveEntry1.getUnparseableExtraFieldData();
        long long92 = zipArchiveEntry1.getCompressedSize();
        java.lang.Object obj93 = zipArchiveEntry1.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray32, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNull(byteArray43);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray66);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData84);
        org.junit.Assert.assertNotNull(unparseableExtraFieldData91);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + (-1L) + "'", long92 == (-1L));
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertEquals(obj93.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj93), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj93), "");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("");
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry1.getExtraFields(true);
        zipArchiveEntry1.setExternalAttributes((long) 35);
        zipArchiveEntry1.setSize((long) (short) 10);
        byte[] byteArray11 = zipArchiveEntry1.getRawName();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray6, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray11);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setExtra();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date12 = zipArchiveEntry11.getLastModifiedDate();
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry11.setName("hi!", byteArray16);
        zipArchiveEntry8.setExtra(byteArray16);
        zipArchiveEntry1.setName("", byteArray16);
        zipArchiveEntry1.setPlatform((-1));
        int int22 = zipArchiveEntry1.getUnixMode();
        byte[] byteArray23 = zipArchiveEntry1.getLocalFileDataExtra();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        long long12 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = zipArchiveEntry1.getExtraFields();
        long long14 = zipArchiveEntry1.getCrc();
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData16 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setInternalAttributes((int) (short) 100);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray13, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertNull(unparseableExtraFieldData16);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = zipArchiveEntry8.getGeneralPurposeBit();
        zipArchiveEntry8.setTime((long) (byte) 10);
        long long12 = zipArchiveEntry8.getCrc();
        int int13 = zipArchiveEntry8.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date20 = zipArchiveEntry19.getLastModifiedDate();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry19.setName("hi!", byteArray24);
        zipArchiveEntry15.setExtra(byteArray24);
        long long27 = zipArchiveEntry15.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField29 = zipArchiveEntry15.getExtraField(zipShort28);
        boolean boolean31 = zipArchiveEntry15.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit32 = zipArchiveEntry15.getGeneralPurposeBit();
        zipArchiveEntry8.setGeneralPurposeBit(generalPurposeBit32);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit32);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setExtra();
        byte[] byteArray38 = zipArchiveEntry36.getRawName();
        zipArchiveEntry36.setPlatform((int) (byte) 100);
        zipArchiveEntry36.setExternalAttributes((long) 10);
        long long43 = zipArchiveEntry36.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry45.setExtra();
        zipArchiveEntry45.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date51 = zipArchiveEntry50.getLastModifiedDate();
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry50.setName("hi!", byteArray55);
        zipArchiveEntry45.setCentralDirectoryExtra(byteArray55);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry59.setExtra();
        byte[] byteArray61 = zipArchiveEntry59.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date64 = zipArchiveEntry63.getLastModifiedDate();
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry63.setName("hi!", byteArray68);
        zipArchiveEntry59.setExtra(byteArray68);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry59.setCentralDirectoryExtra(byteArray75);
        zipArchiveEntry59.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData79 = zipArchiveEntry59.getUnparseableExtraFieldData();
        zipArchiveEntry45.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry36.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        long long83 = zipArchiveEntry1.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime84 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(generalPurposeBit9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(zipExtraField29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit32);
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray61);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData79);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-1L) + "'", long83 == (-1L));
        org.junit.Assert.assertNull(fileTime84);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = zipArchiveEntry1.getExtraField(zipShort12);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry1.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData16 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray15, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(unparseableExtraFieldData16);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        long long4 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setMethod((int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setExtra();
        byte[] byteArray11 = zipArchiveEntry9.getRawName();
        zipArchiveEntry9.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime14 = zipArchiveEntry9.getLastModifiedTime();
        java.util.Date date15 = zipArchiveEntry9.getLastModifiedDate();
        java.util.Date date16 = zipArchiveEntry9.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry18.setExtra();
        byte[] byteArray20 = zipArchiveEntry18.getRawName();
        zipArchiveEntry18.setPlatform((int) (byte) 100);
        long long23 = zipArchiveEntry18.getSize();
        java.nio.file.attribute.FileTime fileTime24 = zipArchiveEntry18.getLastModifiedTime();
        long long25 = zipArchiveEntry18.getCrc();
        int int26 = zipArchiveEntry18.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date29 = zipArchiveEntry28.getLastModifiedDate();
        long long30 = zipArchiveEntry28.getTime();
        java.lang.String str31 = zipArchiveEntry28.getComment();
        long long32 = zipArchiveEntry28.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry34.setPlatform(0);
        java.lang.Object obj37 = null;
        boolean boolean38 = zipArchiveEntry34.equals(obj37);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData39 = zipArchiveEntry34.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        byte[] byteArray43 = zipArchiveEntry41.getRawName();
        zipArchiveEntry41.setPlatform((int) (byte) 100);
        long long46 = zipArchiveEntry41.getSize();
        java.nio.file.attribute.FileTime fileTime47 = zipArchiveEntry41.getLastModifiedTime();
        long long48 = zipArchiveEntry41.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort49 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField50 = zipArchiveEntry41.getExtraField(zipShort49);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit53 = zipArchiveEntry52.getGeneralPurposeBit();
        long long54 = zipArchiveEntry52.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray55 = zipArchiveEntry52.getExtraFields();
        zipArchiveEntry41.setExtraFields(zipExtraFieldArray55);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort57 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField58 = zipArchiveEntry41.getExtraField(zipShort57);
        zipArchiveEntry41.setUnixMode((int) '4');
        long long61 = zipArchiveEntry41.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry63.setPlatform(0);
        java.lang.String str66 = zipArchiveEntry63.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray67 = zipArchiveEntry63.getExtraFields();
        zipArchiveEntry63.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry71 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry71.setExtra();
        zipArchiveEntry71.setTime(0L);
        zipArchiveEntry71.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime77 = zipArchiveEntry71.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry78 = zipArchiveEntry63.setCreationTime(fileTime77);
        java.util.zip.ZipEntry zipEntry79 = zipArchiveEntry41.setLastAccessTime(fileTime77);
        java.util.zip.ZipEntry zipEntry80 = zipArchiveEntry34.setLastModifiedTime(fileTime77);
        java.util.zip.ZipEntry zipEntry81 = zipArchiveEntry28.setLastAccessTime(fileTime77);
        java.util.zip.ZipEntry zipEntry82 = zipArchiveEntry18.setCreationTime(fileTime77);
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry9.setCreationTime(fileTime77);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry7.setLastAccessTime(fileTime77);
        int int85 = zipArchiveEntry7.getInternalAttributes();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNull(fileTime14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(fileTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData39);
        org.junit.Assert.assertNull(byteArray43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNull(fileTime47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNull(zipExtraField50);
        org.junit.Assert.assertNotNull(generalPurposeBit53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray55);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray55, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(zipExtraFieldArray67);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray67, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime77);
        org.junit.Assert.assertNotNull(zipEntry78);
        org.junit.Assert.assertEquals(zipEntry78.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry79);
        org.junit.Assert.assertEquals(zipEntry79.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry80);
        org.junit.Assert.assertEquals(zipEntry80.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry81);
        org.junit.Assert.assertEquals(zipEntry81.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry82);
        org.junit.Assert.assertEquals(zipEntry82.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setExternalAttributes((long) 10);
        long long8 = zipArchiveEntry1.getTime();
        long long9 = zipArchiveEntry1.getCrc();
        long long10 = zipArchiveEntry1.getCrc();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        long long5 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setTime((long) (byte) 100);
        zipArchiveEntry1.setName("hi!");
        boolean boolean10 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        long long16 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setCrc((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit19 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setExtra();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(generalPurposeBit19);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        long long16 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setCrc((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit19 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setName("hi!");
        int int22 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setName("");
        int int25 = zipArchiveEntry1.getInternalAttributes();
        int int26 = zipArchiveEntry1.getPlatform();
        java.nio.file.attribute.FileTime fileTime27 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(generalPurposeBit19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(fileTime27);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (byte) 10);
        long long5 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry10.setName("hi!", byteArray15);
        zipArchiveEntry7.setExtra(byteArray15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField19 = zipArchiveEntry7.getExtraField(zipShort18);
        boolean boolean20 = zipArchiveEntry7.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date23 = zipArchiveEntry22.getLastModifiedDate();
        long long24 = zipArchiveEntry22.getTime();
        java.lang.String str25 = zipArchiveEntry22.getComment();
        java.nio.file.attribute.FileTime fileTime26 = zipArchiveEntry22.getLastAccessTime();
        boolean boolean27 = zipArchiveEntry7.equals((java.lang.Object) zipArchiveEntry22);
        boolean boolean28 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry7);
        zipArchiveEntry7.setPlatform((int) (short) 0);
        zipArchiveEntry7.setSize((long) 32);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit35 = zipArchiveEntry34.getGeneralPurposeBit();
        long long36 = zipArchiveEntry34.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray37 = zipArchiveEntry34.getExtraFields();
        byte[] byteArray38 = zipArchiveEntry34.getLocalFileDataExtra();
        java.lang.Object obj39 = zipArchiveEntry34.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        byte[] byteArray43 = zipArchiveEntry41.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date46 = zipArchiveEntry45.getLastModifiedDate();
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry45.setName("hi!", byteArray50);
        zipArchiveEntry41.setExtra(byteArray50);
        long long53 = zipArchiveEntry41.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry56 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date57 = zipArchiveEntry56.getLastModifiedDate();
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry56.setName("hi!", byteArray61);
        zipArchiveEntry41.setName("", byteArray61);
        byte[] byteArray64 = zipArchiveEntry41.getLocalFileDataExtra();
        zipArchiveEntry34.setCentralDirectoryExtra(byteArray64);
        byte[] byteArray66 = zipArchiveEntry34.getCentralDirectoryExtra();
        byte[] byteArray67 = zipArchiveEntry34.getExtra();
        zipArchiveEntry7.setCentralDirectoryExtra(byteArray67);
        int int69 = zipArchiveEntry7.getInternalAttributes();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(fileTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray37);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray37, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "");
        org.junit.Assert.assertNull(byteArray43);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        zipArchiveEntry1.setCompressedSize((long) (short) 0);
        zipArchiveEntry1.setComment("hi!");
        java.lang.String str10 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setCompressedSize((long) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setExtra();
        byte[] byteArray12 = zipArchiveEntry10.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date15 = zipArchiveEntry14.getLastModifiedDate();
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry14.setName("hi!", byteArray19);
        zipArchiveEntry10.setExtra(byteArray19);
        long long22 = zipArchiveEntry10.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = zipArchiveEntry10.getExtraField(zipShort23);
        int int25 = zipArchiveEntry10.getUnixMode();
        int int26 = zipArchiveEntry10.getPlatform();
        long long27 = zipArchiveEntry10.getTime();
        zipArchiveEntry10.setTime((long) (-1));
        java.nio.file.attribute.FileTime fileTime30 = zipArchiveEntry10.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date36 = zipArchiveEntry35.getLastModifiedDate();
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry35.setName("hi!", byteArray40);
        zipArchiveEntry32.setExtra(byteArray40);
        long long43 = zipArchiveEntry32.getCompressedSize();
        zipArchiveEntry32.setCrc(0L);
        zipArchiveEntry32.setCrc(100L);
        byte[] byteArray48 = zipArchiveEntry32.getCentralDirectoryExtra();
        int int49 = zipArchiveEntry32.getMethod();
        boolean boolean50 = zipArchiveEntry10.equals((java.lang.Object) int49);
        java.time.LocalDateTime localDateTime51 = zipArchiveEntry10.getTimeLocal();
        zipArchiveEntry1.setTimeLocal(localDateTime51);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(zipExtraField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNull(fileTime30);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localDateTime51);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.String str8 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setName("");
        int int11 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit14 = zipArchiveEntry13.getGeneralPurposeBit();
        zipArchiveEntry13.setTime((long) (byte) 10);
        long long17 = zipArchiveEntry13.getCrc();
        long long18 = zipArchiveEntry13.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        byte[] byteArray22 = zipArchiveEntry20.getRawName();
        zipArchiveEntry20.setPlatform((int) (byte) 100);
        zipArchiveEntry20.setExternalAttributes((long) 10);
        long long27 = zipArchiveEntry20.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit30 = zipArchiveEntry29.getGeneralPurposeBit();
        zipArchiveEntry29.setTime((long) (byte) 10);
        long long33 = zipArchiveEntry29.getCrc();
        int int34 = zipArchiveEntry29.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setExtra();
        byte[] byteArray38 = zipArchiveEntry36.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date41 = zipArchiveEntry40.getLastModifiedDate();
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry40.setName("hi!", byteArray45);
        zipArchiveEntry36.setExtra(byteArray45);
        long long48 = zipArchiveEntry36.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort49 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField50 = zipArchiveEntry36.getExtraField(zipShort49);
        boolean boolean52 = zipArchiveEntry36.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit53 = zipArchiveEntry36.getGeneralPurposeBit();
        zipArchiveEntry29.setGeneralPurposeBit(generalPurposeBit53);
        byte[] byteArray55 = zipArchiveEntry29.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit58 = zipArchiveEntry57.getGeneralPurposeBit();
        int int59 = zipArchiveEntry57.getMethod();
        zipArchiveEntry57.setCompressedSize((long) (-1));
        zipArchiveEntry57.setExternalAttributes((long) 'a');
        zipArchiveEntry57.setCompressedSize((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry67 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit68 = zipArchiveEntry67.getGeneralPurposeBit();
        zipArchiveEntry67.setTime((long) (byte) 10);
        long long71 = zipArchiveEntry67.getCrc();
        zipArchiveEntry67.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData74 = zipArchiveEntry67.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime75 = zipArchiveEntry67.getTimeLocal();
        zipArchiveEntry57.setTimeLocal(localDateTime75);
        zipArchiveEntry29.setTimeLocal(localDateTime75);
        zipArchiveEntry20.setTimeLocal(localDateTime75);
        zipArchiveEntry13.setTimeLocal(localDateTime75);
        zipArchiveEntry1.setTimeLocal(localDateTime75);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort81 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort81);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNull(zipExtraField50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit53);
        org.junit.Assert.assertNull(byteArray55);
        org.junit.Assert.assertNotNull(generalPurposeBit58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(generalPurposeBit68);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData74);
        org.junit.Assert.assertNotNull(localDateTime75);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit8 = zipArchiveEntry7.getGeneralPurposeBit();
        int int9 = zipArchiveEntry7.getMethod();
        long long10 = zipArchiveEntry7.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        zipArchiveEntry13.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date19 = zipArchiveEntry18.getLastModifiedDate();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry18.setName("hi!", byteArray23);
        zipArchiveEntry13.setCentralDirectoryExtra(byteArray23);
        zipArchiveEntry7.setName("hi!", byteArray23);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray23);
        zipArchiveEntry1.setName("hi!");
        java.nio.file.attribute.FileTime fileTime30 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime31 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(fileTime30);
        org.junit.Assert.assertNull(fileTime31);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setCompressedSize((long) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date20 = zipArchiveEntry19.getLastModifiedDate();
        long long21 = zipArchiveEntry19.getTime();
        java.lang.String str22 = zipArchiveEntry19.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray25 = zipArchiveEntry24.getExtraFields();
        zipArchiveEntry19.setExtraFields(zipExtraFieldArray25);
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray25);
        zipArchiveEntry10.setInternalAttributes(100);
        zipArchiveEntry10.setTime(0L);
        zipArchiveEntry10.setCompressedSize((long) 100);
        java.nio.file.attribute.FileTime fileTime34 = zipArchiveEntry10.getCreationTime();
        int int35 = zipArchiveEntry10.getPlatform();
        zipArchiveEntry10.setPlatform((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date43 = zipArchiveEntry42.getLastModifiedDate();
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry42.setName("hi!", byteArray47);
        zipArchiveEntry39.setExtra(byteArray47);
        long long50 = zipArchiveEntry39.getCompressedSize();
        boolean boolean51 = zipArchiveEntry39.isDirectory();
        java.util.Date date52 = zipArchiveEntry39.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData53 = zipArchiveEntry39.getUnparseableExtraFieldData();
        byte[] byteArray54 = zipArchiveEntry39.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry56 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit57 = zipArchiveEntry56.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry59.setExtra();
        byte[] byteArray61 = zipArchiveEntry59.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date64 = zipArchiveEntry63.getLastModifiedDate();
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry63.setName("hi!", byteArray68);
        zipArchiveEntry59.setExtra(byteArray68);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry59.setCentralDirectoryExtra(byteArray75);
        zipArchiveEntry59.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData79 = zipArchiveEntry59.getUnparseableExtraFieldData();
        zipArchiveEntry56.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry39.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry10.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        int int84 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setComment("hi!");
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(zipExtraFieldArray25);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray25, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(unparseableExtraFieldData53);
        org.junit.Assert.assertNull(byteArray54);
        org.junit.Assert.assertNotNull(generalPurposeBit57);
        org.junit.Assert.assertNull(byteArray61);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData79);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        byte[] byteArray22 = zipArchiveEntry20.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry24.setName("hi!", byteArray29);
        zipArchiveEntry20.setExtra(byteArray29);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry20.setCentralDirectoryExtra(byteArray36);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray36);
        java.util.Date date39 = zipArchiveEntry1.getLastModifiedDate();
        int int40 = zipArchiveEntry1.getUnixMode();
        long long41 = zipArchiveEntry1.getExternalAttributes();
        long long42 = zipArchiveEntry1.getTime();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setCrc(1L);
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getCreationTime();
        java.lang.String str10 = zipArchiveEntry1.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        byte[] byteArray8 = zipArchiveEntry1.getLocalFileDataExtra();
        long long9 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setName("");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit8 = zipArchiveEntry7.getGeneralPurposeBit();
        int int9 = zipArchiveEntry7.getMethod();
        long long10 = zipArchiveEntry7.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        zipArchiveEntry13.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date19 = zipArchiveEntry18.getLastModifiedDate();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry18.setName("hi!", byteArray23);
        zipArchiveEntry13.setCentralDirectoryExtra(byteArray23);
        zipArchiveEntry7.setName("hi!", byteArray23);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray23);
        zipArchiveEntry1.setName("hi!");
        java.lang.String str30 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime31 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setPlatform(8);
        zipArchiveEntry1.setTime((long) 35);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray37 = zipArchiveEntry1.getExtraFields(false);
        zipArchiveEntry1.setCompressedSize(1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(fileTime31);
        org.junit.Assert.assertNotNull(zipExtraFieldArray37);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray37, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        zipArchiveEntry1.setCompressedSize(8L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = zipArchiveEntry1.getExtraFields();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray11, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        long long16 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setCrc((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit19 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setName("hi!");
        int int22 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry26.setExtra();
        zipArchiveEntry26.setTime(0L);
        java.nio.file.attribute.FileTime fileTime30 = zipArchiveEntry26.getLastAccessTime();
        zipArchiveEntry26.setExternalAttributes((long) 1);
        zipArchiveEntry26.setComment("hi!");
        zipArchiveEntry26.setPlatform(100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray37 = zipArchiveEntry26.getExtraFields();
        boolean boolean38 = zipArchiveEntry26.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit41 = zipArchiveEntry40.getGeneralPurposeBit();
        long long42 = zipArchiveEntry40.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray43 = zipArchiveEntry40.getExtraFields();
        byte[] byteArray44 = zipArchiveEntry40.getLocalFileDataExtra();
        java.lang.Object obj45 = zipArchiveEntry40.clone();
        java.nio.file.attribute.FileTime fileTime46 = zipArchiveEntry40.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit49 = zipArchiveEntry48.getGeneralPurposeBit();
        long long50 = zipArchiveEntry48.getCrc();
        long long51 = zipArchiveEntry48.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit54 = zipArchiveEntry53.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry56 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry56.setExtra();
        byte[] byteArray58 = zipArchiveEntry56.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date61 = zipArchiveEntry60.getLastModifiedDate();
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry60.setName("hi!", byteArray65);
        zipArchiveEntry56.setExtra(byteArray65);
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry56.setCentralDirectoryExtra(byteArray72);
        zipArchiveEntry56.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData76 = zipArchiveEntry56.getUnparseableExtraFieldData();
        zipArchiveEntry53.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData76);
        zipArchiveEntry48.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData76);
        zipArchiveEntry40.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData76);
        zipArchiveEntry26.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData76);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData76);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(generalPurposeBit19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(fileTime30);
        org.junit.Assert.assertNotNull(zipExtraFieldArray37);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray37, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray43);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray43, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "");
        org.junit.Assert.assertNull(fileTime46);
        org.junit.Assert.assertNotNull(generalPurposeBit49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit54);
        org.junit.Assert.assertNull(byteArray58);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData76);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry1.setName("", byteArray10);
        long long12 = zipArchiveEntry1.getSize();
        boolean boolean13 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        zipArchiveEntry15.setPlatform((int) (byte) 100);
        long long20 = zipArchiveEntry15.getSize();
        long long21 = zipArchiveEntry15.getTime();
        long long22 = zipArchiveEntry15.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = zipArchiveEntry15.getExtraFields(true);
        zipArchiveEntry15.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry27.setName("");
        java.lang.Object obj30 = zipArchiveEntry27.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry27.getExtraFields(true);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = zipArchiveEntry27.getExtraFields(false);
        zipArchiveEntry15.setExtraFields(zipExtraFieldArray34);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray34);
        zipArchiveEntry1.setUnixMode(0);
        zipArchiveEntry1.setSize((long) (byte) 0);
        java.lang.String str41 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setTime(1L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray24, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray32, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray34, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        int int16 = zipArchiveEntry1.getUnixMode();
        int int17 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = zipArchiveEntry1.getExtraFields(false);
        zipArchiveEntry1.setSize((long) (short) 100);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray20, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = zipArchiveEntry1.getExtraField(zipShort9);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit13 = zipArchiveEntry12.getGeneralPurposeBit();
        long long14 = zipArchiveEntry12.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry12.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField18 = zipArchiveEntry1.getExtraField(zipShort17);
        zipArchiveEntry1.setUnixMode((int) '4');
        long long21 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setPlatform(0);
        java.lang.String str26 = zipArchiveEntry23.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry23.getExtraFields();
        zipArchiveEntry23.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry31.setExtra();
        zipArchiveEntry31.setTime(0L);
        zipArchiveEntry31.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime37 = zipArchiveEntry31.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry38 = zipArchiveEntry23.setCreationTime(fileTime37);
        java.util.zip.ZipEntry zipEntry39 = zipArchiveEntry1.setLastAccessTime(fileTime37);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(zipExtraField10);
        org.junit.Assert.assertNotNull(generalPurposeBit13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray15, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime37);
        org.junit.Assert.assertNotNull(zipEntry38);
        org.junit.Assert.assertEquals(zipEntry38.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry39);
        org.junit.Assert.assertEquals(zipEntry39.toString(), "");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        byte[] byteArray1 = zipArchiveEntry0.getCentralDirectoryExtra();
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry0.getLastModifiedTime();
        long long3 = zipArchiveEntry0.getCompressedSize();
        zipArchiveEntry0.setComment("hi!");
        byte[] byteArray6 = zipArchiveEntry0.getExtra();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(byteArray6);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        java.lang.String str5 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = zipArchiveEntry1.getExtraField(zipShort6);
        int int8 = zipArchiveEntry1.getPlatform();
        long long9 = zipArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(zipExtraField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit6 = zipArchiveEntry1.getGeneralPurposeBit();
        long long7 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry1.getExtraFields(false);
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastModifiedTime();
        long long11 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray9, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date8 = zipArchiveEntry7.getLastModifiedDate();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry7.setName("hi!", byteArray12);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData14 = zipArchiveEntry7.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit17 = zipArchiveEntry16.getGeneralPurposeBit();
        zipArchiveEntry16.setTime((long) (byte) 10);
        long long20 = zipArchiveEntry16.getCrc();
        int int21 = zipArchiveEntry16.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setExtra();
        byte[] byteArray25 = zipArchiveEntry23.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date28 = zipArchiveEntry27.getLastModifiedDate();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry27.setName("hi!", byteArray32);
        zipArchiveEntry23.setExtra(byteArray32);
        long long35 = zipArchiveEntry23.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort36 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField37 = zipArchiveEntry23.getExtraField(zipShort36);
        boolean boolean39 = zipArchiveEntry23.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit40 = zipArchiveEntry23.getGeneralPurposeBit();
        zipArchiveEntry16.setGeneralPurposeBit(generalPurposeBit40);
        zipArchiveEntry7.setGeneralPurposeBit(generalPurposeBit40);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit40);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime46 = zipArchiveEntry45.getLastAccessTime();
        zipArchiveEntry45.setName("");
        zipArchiveEntry45.setUnixMode((int) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray51 = zipArchiveEntry45.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date54 = zipArchiveEntry53.getLastModifiedDate();
        long long55 = zipArchiveEntry53.getTime();
        java.lang.String str56 = zipArchiveEntry53.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray59 = zipArchiveEntry58.getExtraFields();
        zipArchiveEntry53.setExtraFields(zipExtraFieldArray59);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date63 = zipArchiveEntry62.getLastModifiedDate();
        long long64 = zipArchiveEntry62.getTime();
        java.lang.String str65 = zipArchiveEntry62.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry67 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray68 = zipArchiveEntry67.getExtraFields();
        zipArchiveEntry62.setExtraFields(zipExtraFieldArray68);
        zipArchiveEntry53.setExtraFields(zipExtraFieldArray68);
        byte[] byteArray71 = zipArchiveEntry53.getLocalFileDataExtra();
        int int72 = zipArchiveEntry53.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry74 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry74.setPlatform(0);
        java.lang.String str77 = zipArchiveEntry74.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray78 = zipArchiveEntry74.getExtraFields();
        zipArchiveEntry74.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry82 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry82.setExtra();
        zipArchiveEntry82.setTime(0L);
        zipArchiveEntry82.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime88 = zipArchiveEntry82.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry89 = zipArchiveEntry74.setCreationTime(fileTime88);
        java.util.zip.ZipEntry zipEntry90 = zipArchiveEntry53.setCreationTime(fileTime88);
        java.util.zip.ZipEntry zipEntry91 = zipArchiveEntry45.setLastAccessTime(fileTime88);
        java.util.zip.ZipEntry zipEntry92 = zipArchiveEntry1.setLastModifiedTime(fileTime88);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(unparseableExtraFieldData14);
        org.junit.Assert.assertNotNull(generalPurposeBit17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(byteArray25);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(zipExtraField37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit40);
        org.junit.Assert.assertNull(fileTime46);
        org.junit.Assert.assertNotNull(zipExtraFieldArray51);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray51, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(zipExtraFieldArray59);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray59, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(zipExtraFieldArray68);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray68, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(zipExtraFieldArray78);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray78, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime88);
        org.junit.Assert.assertNotNull(zipEntry89);
        org.junit.Assert.assertEquals(zipEntry89.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry90);
        org.junit.Assert.assertEquals(zipEntry90.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry91);
        org.junit.Assert.assertEquals(zipEntry91.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry92);
        org.junit.Assert.assertEquals(zipEntry92.toString(), "");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        int int7 = zipArchiveEntry1.getMethod();
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date20 = zipArchiveEntry19.getLastModifiedDate();
        long long21 = zipArchiveEntry19.getTime();
        java.lang.String str22 = zipArchiveEntry19.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray25 = zipArchiveEntry24.getExtraFields();
        zipArchiveEntry19.setExtraFields(zipExtraFieldArray25);
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray25);
        zipArchiveEntry10.setInternalAttributes(100);
        zipArchiveEntry10.setTime(0L);
        zipArchiveEntry10.setCompressedSize((long) 100);
        java.nio.file.attribute.FileTime fileTime34 = zipArchiveEntry10.getCreationTime();
        int int35 = zipArchiveEntry10.getPlatform();
        zipArchiveEntry10.setPlatform((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date43 = zipArchiveEntry42.getLastModifiedDate();
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry42.setName("hi!", byteArray47);
        zipArchiveEntry39.setExtra(byteArray47);
        long long50 = zipArchiveEntry39.getCompressedSize();
        boolean boolean51 = zipArchiveEntry39.isDirectory();
        java.util.Date date52 = zipArchiveEntry39.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData53 = zipArchiveEntry39.getUnparseableExtraFieldData();
        byte[] byteArray54 = zipArchiveEntry39.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry56 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit57 = zipArchiveEntry56.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry59.setExtra();
        byte[] byteArray61 = zipArchiveEntry59.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date64 = zipArchiveEntry63.getLastModifiedDate();
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry63.setName("hi!", byteArray68);
        zipArchiveEntry59.setExtra(byteArray68);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry59.setCentralDirectoryExtra(byteArray75);
        zipArchiveEntry59.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData79 = zipArchiveEntry59.getUnparseableExtraFieldData();
        zipArchiveEntry56.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry39.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry10.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry1.setTime(0L);
        java.time.LocalDateTime localDateTime86 = zipArchiveEntry1.getTimeLocal();
        zipArchiveEntry1.setUnixMode(0);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(zipExtraFieldArray25);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray25, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(unparseableExtraFieldData53);
        org.junit.Assert.assertNull(byteArray54);
        org.junit.Assert.assertNotNull(generalPurposeBit57);
        org.junit.Assert.assertNull(byteArray61);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData79);
        org.junit.Assert.assertNotNull(localDateTime86);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray8 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = zipArchiveEntry10.getGeneralPurposeBit();
        byte[] byteArray12 = zipArchiveEntry10.getRawName();
        long long13 = zipArchiveEntry10.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry16.setExtra();
        zipArchiveEntry16.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date22 = zipArchiveEntry21.getLastModifiedDate();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry21.setName("hi!", byteArray26);
        zipArchiveEntry16.setCentralDirectoryExtra(byteArray26);
        zipArchiveEntry10.setName("", byteArray26);
        zipArchiveEntry10.setTime((long) 10);
        boolean boolean32 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry10);
        zipArchiveEntry1.setName("");
        java.lang.String str35 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setExternalAttributes((long) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date40 = zipArchiveEntry39.getLastModifiedDate();
        long long41 = zipArchiveEntry39.getTime();
        java.lang.String str42 = zipArchiveEntry39.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray45 = zipArchiveEntry44.getExtraFields();
        zipArchiveEntry39.setExtraFields(zipExtraFieldArray45);
        int int47 = zipArchiveEntry39.getPlatform();
        java.nio.file.attribute.FileTime fileTime48 = zipArchiveEntry39.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setExtra();
        byte[] byteArray52 = zipArchiveEntry50.getRawName();
        zipArchiveEntry50.setPlatform((int) (byte) 100);
        long long55 = zipArchiveEntry50.getSize();
        java.nio.file.attribute.FileTime fileTime56 = zipArchiveEntry50.getLastModifiedTime();
        long long57 = zipArchiveEntry50.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort58 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField59 = zipArchiveEntry50.getExtraField(zipShort58);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry61 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit62 = zipArchiveEntry61.getGeneralPurposeBit();
        long long63 = zipArchiveEntry61.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray64 = zipArchiveEntry61.getExtraFields();
        zipArchiveEntry50.setExtraFields(zipExtraFieldArray64);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort66 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField67 = zipArchiveEntry50.getExtraField(zipShort66);
        zipArchiveEntry50.setUnixMode((int) '4');
        long long70 = zipArchiveEntry50.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry72 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry72.setPlatform(0);
        java.lang.String str75 = zipArchiveEntry72.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray76 = zipArchiveEntry72.getExtraFields();
        zipArchiveEntry72.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry80 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry80.setExtra();
        zipArchiveEntry80.setTime(0L);
        zipArchiveEntry80.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime86 = zipArchiveEntry80.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry87 = zipArchiveEntry72.setCreationTime(fileTime86);
        java.util.zip.ZipEntry zipEntry88 = zipArchiveEntry50.setLastAccessTime(fileTime86);
        java.util.zip.ZipEntry zipEntry89 = zipArchiveEntry39.setLastModifiedTime(fileTime86);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit90 = zipArchiveEntry39.getGeneralPurposeBit();
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit90);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertNotNull(generalPurposeBit11);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(zipExtraFieldArray45);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray45, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(fileTime48);
        org.junit.Assert.assertNull(byteArray52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNull(fileTime56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNull(zipExtraField59);
        org.junit.Assert.assertNotNull(generalPurposeBit62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray64);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray64, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField67);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(zipExtraFieldArray76);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray76, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime86);
        org.junit.Assert.assertNotNull(zipEntry87);
        org.junit.Assert.assertEquals(zipEntry87.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry88);
        org.junit.Assert.assertEquals(zipEntry88.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry89);
        org.junit.Assert.assertEquals(zipEntry89.toString(), "");
        org.junit.Assert.assertNotNull(generalPurposeBit90);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = zipArchiveEntry1.getExtraField(zipShort12);
        boolean boolean14 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setComment("hi!");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setMethod((int) (short) 1);
        int int8 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray9 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getTime();
        java.util.Date date7 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setExtra();
        byte[] byteArray11 = zipArchiveEntry9.getRawName();
        zipArchiveEntry9.setPlatform((int) (byte) 100);
        zipArchiveEntry9.setExternalAttributes((long) 10);
        long long16 = zipArchiveEntry9.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry18.setExtra();
        byte[] byteArray20 = zipArchiveEntry18.getRawName();
        zipArchiveEntry18.setPlatform((int) (byte) 100);
        zipArchiveEntry18.setExternalAttributes((long) 10);
        long long25 = zipArchiveEntry18.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry27.setExtra();
        zipArchiveEntry27.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date33 = zipArchiveEntry32.getLastModifiedDate();
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry32.setName("hi!", byteArray37);
        zipArchiveEntry27.setCentralDirectoryExtra(byteArray37);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        byte[] byteArray43 = zipArchiveEntry41.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date46 = zipArchiveEntry45.getLastModifiedDate();
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry45.setName("hi!", byteArray50);
        zipArchiveEntry41.setExtra(byteArray50);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry41.setCentralDirectoryExtra(byteArray57);
        zipArchiveEntry41.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData61 = zipArchiveEntry41.getUnparseableExtraFieldData();
        zipArchiveEntry27.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData61);
        zipArchiveEntry18.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData61);
        zipArchiveEntry9.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData61);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData61);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry67 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date68 = zipArchiveEntry67.getLastModifiedDate();
        long long69 = zipArchiveEntry67.getTime();
        java.lang.String str70 = zipArchiveEntry67.getComment();
        java.nio.file.attribute.FileTime fileTime71 = zipArchiveEntry67.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime72 = zipArchiveEntry67.getCreationTime();
        int int73 = zipArchiveEntry67.getMethod();
        zipArchiveEntry67.setMethod(1);
        java.lang.String str76 = zipArchiveEntry67.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry78 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date79 = zipArchiveEntry78.getLastModifiedDate();
        long long80 = zipArchiveEntry78.getTime();
        java.lang.String str81 = zipArchiveEntry78.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry83 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray84 = zipArchiveEntry83.getExtraFields();
        zipArchiveEntry78.setExtraFields(zipExtraFieldArray84);
        long long86 = zipArchiveEntry78.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry88 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry88.setExtra();
        zipArchiveEntry88.setTime(0L);
        zipArchiveEntry88.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime94 = zipArchiveEntry88.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry95 = zipArchiveEntry78.setLastAccessTime(fileTime94);
        java.util.zip.ZipEntry zipEntry96 = zipArchiveEntry67.setLastModifiedTime(fileTime94);
        java.util.zip.ZipEntry zipEntry97 = zipArchiveEntry1.setLastModifiedTime(fileTime94);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit98 = zipArchiveEntry1.getGeneralPurposeBit();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray43);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData61);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(fileTime71);
        org.junit.Assert.assertNull(fileTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-1L) + "'", long80 == (-1L));
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(zipExtraFieldArray84);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray84, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-1L) + "'", long86 == (-1L));
        org.junit.Assert.assertNotNull(fileTime94);
        org.junit.Assert.assertNotNull(zipEntry95);
        org.junit.Assert.assertEquals(zipEntry95.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry96);
        org.junit.Assert.assertEquals(zipEntry96.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry97);
        org.junit.Assert.assertEquals(zipEntry97.toString(), "");
        org.junit.Assert.assertNotNull(generalPurposeBit98);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = zipArchiveEntry8.getGeneralPurposeBit();
        zipArchiveEntry8.setTime((long) (byte) 10);
        long long12 = zipArchiveEntry8.getCrc();
        int int13 = zipArchiveEntry8.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date20 = zipArchiveEntry19.getLastModifiedDate();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry19.setName("hi!", byteArray24);
        zipArchiveEntry15.setExtra(byteArray24);
        long long27 = zipArchiveEntry15.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField29 = zipArchiveEntry15.getExtraField(zipShort28);
        boolean boolean31 = zipArchiveEntry15.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit32 = zipArchiveEntry15.getGeneralPurposeBit();
        zipArchiveEntry8.setGeneralPurposeBit(generalPurposeBit32);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit32);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setExtra();
        byte[] byteArray38 = zipArchiveEntry36.getRawName();
        zipArchiveEntry36.setPlatform((int) (byte) 100);
        zipArchiveEntry36.setExternalAttributes((long) 10);
        long long43 = zipArchiveEntry36.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry45.setExtra();
        zipArchiveEntry45.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date51 = zipArchiveEntry50.getLastModifiedDate();
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry50.setName("hi!", byteArray55);
        zipArchiveEntry45.setCentralDirectoryExtra(byteArray55);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry59.setExtra();
        byte[] byteArray61 = zipArchiveEntry59.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date64 = zipArchiveEntry63.getLastModifiedDate();
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry63.setName("hi!", byteArray68);
        zipArchiveEntry59.setExtra(byteArray68);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry59.setCentralDirectoryExtra(byteArray75);
        zipArchiveEntry59.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData79 = zipArchiveEntry59.getUnparseableExtraFieldData();
        zipArchiveEntry45.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry36.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry1.setUnixMode(1);
        int int85 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setUnixMode((int) (short) 0);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(generalPurposeBit9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(zipExtraField29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit32);
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray61);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData79);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        long long12 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date20 = zipArchiveEntry19.getLastModifiedDate();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry19.setName("hi!", byteArray24);
        zipArchiveEntry15.setExtra(byteArray24);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry15.setCentralDirectoryExtra(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = zipArchiveEntry15.getExtraFields(true);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray34);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort36 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField37 = zipArchiveEntry1.getExtraField(zipShort36);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray39 = zipArchiveEntry1.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField41 = zipArchiveEntry1.getExtraField(zipShort40);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort42 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort42);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertNull(zipExtraField37);
        org.junit.Assert.assertNotNull(zipExtraFieldArray39);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray39, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField41);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        int int4 = zipArchiveEntry1.getUnixMode();
        long long5 = zipArchiveEntry1.getSize();
        int int6 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        zipArchiveEntry0.setComment("hi!");
        zipArchiveEntry0.setSize((long) (short) 100);
        int int5 = zipArchiveEntry0.getUnixMode();
        zipArchiveEntry0.setCompressedSize((long) 0);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = zipArchiveEntry0.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setExtra();
        byte[] byteArray12 = zipArchiveEntry10.getRawName();
        zipArchiveEntry10.setPlatform((int) (byte) 100);
        long long15 = zipArchiveEntry10.getSize();
        java.nio.file.attribute.FileTime fileTime16 = zipArchiveEntry10.getLastModifiedTime();
        long long17 = zipArchiveEntry10.getCrc();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit18 = zipArchiveEntry10.getGeneralPurposeBit();
        zipArchiveEntry0.setGeneralPurposeBit(generalPurposeBit18);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(unparseableExtraFieldData8);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNull(fileTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit18);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (byte) 10);
        long long5 = zipArchiveEntry1.getCrc();
        long long6 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setExtra();
        byte[] byteArray10 = zipArchiveEntry8.getRawName();
        zipArchiveEntry8.setPlatform((int) (byte) 100);
        zipArchiveEntry8.setExternalAttributes((long) 10);
        long long15 = zipArchiveEntry8.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit18 = zipArchiveEntry17.getGeneralPurposeBit();
        zipArchiveEntry17.setTime((long) (byte) 10);
        long long21 = zipArchiveEntry17.getCrc();
        int int22 = zipArchiveEntry17.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry24.setExtra();
        byte[] byteArray26 = zipArchiveEntry24.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date29 = zipArchiveEntry28.getLastModifiedDate();
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry28.setName("hi!", byteArray33);
        zipArchiveEntry24.setExtra(byteArray33);
        long long36 = zipArchiveEntry24.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort37 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField38 = zipArchiveEntry24.getExtraField(zipShort37);
        boolean boolean40 = zipArchiveEntry24.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit41 = zipArchiveEntry24.getGeneralPurposeBit();
        zipArchiveEntry17.setGeneralPurposeBit(generalPurposeBit41);
        byte[] byteArray43 = zipArchiveEntry17.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit46 = zipArchiveEntry45.getGeneralPurposeBit();
        int int47 = zipArchiveEntry45.getMethod();
        zipArchiveEntry45.setCompressedSize((long) (-1));
        zipArchiveEntry45.setExternalAttributes((long) 'a');
        zipArchiveEntry45.setCompressedSize((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit56 = zipArchiveEntry55.getGeneralPurposeBit();
        zipArchiveEntry55.setTime((long) (byte) 10);
        long long59 = zipArchiveEntry55.getCrc();
        zipArchiveEntry55.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData62 = zipArchiveEntry55.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime63 = zipArchiveEntry55.getTimeLocal();
        zipArchiveEntry45.setTimeLocal(localDateTime63);
        zipArchiveEntry17.setTimeLocal(localDateTime63);
        zipArchiveEntry8.setTimeLocal(localDateTime63);
        zipArchiveEntry1.setTimeLocal(localDateTime63);
        java.time.LocalDateTime localDateTime68 = zipArchiveEntry1.getTimeLocal();
        long long69 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setName("hi!");
        byte[] byteArray72 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(byteArray26);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNull(zipExtraField38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit41);
        org.junit.Assert.assertNull(byteArray43);
        org.junit.Assert.assertNotNull(generalPurposeBit46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(generalPurposeBit56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData62);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertNull(byteArray72);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        long long16 = zipArchiveEntry1.getSize();
        java.lang.Object obj17 = zipArchiveEntry1.clone();
        int int18 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData22 = zipArchiveEntry20.getUnparseableExtraFieldData();
        java.lang.Object obj23 = zipArchiveEntry20.clone();
        zipArchiveEntry20.setName("hi!");
        int int26 = zipArchiveEntry20.getMethod();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry20.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData31 = zipArchiveEntry29.getUnparseableExtraFieldData();
        java.lang.Object obj32 = zipArchiveEntry29.clone();
        zipArchiveEntry29.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit37 = zipArchiveEntry36.getGeneralPurposeBit();
        zipArchiveEntry36.setTime((long) (byte) 10);
        long long40 = zipArchiveEntry36.getCrc();
        int int41 = zipArchiveEntry36.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry43.setExtra();
        byte[] byteArray45 = zipArchiveEntry43.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date48 = zipArchiveEntry47.getLastModifiedDate();
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry47.setName("hi!", byteArray52);
        zipArchiveEntry43.setExtra(byteArray52);
        long long55 = zipArchiveEntry43.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort56 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField57 = zipArchiveEntry43.getExtraField(zipShort56);
        boolean boolean59 = zipArchiveEntry43.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit60 = zipArchiveEntry43.getGeneralPurposeBit();
        zipArchiveEntry36.setGeneralPurposeBit(generalPurposeBit60);
        zipArchiveEntry29.setGeneralPurposeBit(generalPurposeBit60);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date65 = zipArchiveEntry64.getLastModifiedDate();
        long long66 = zipArchiveEntry64.getTime();
        java.lang.String str67 = zipArchiveEntry64.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray70 = zipArchiveEntry69.getExtraFields();
        zipArchiveEntry64.setExtraFields(zipExtraFieldArray70);
        long long72 = zipArchiveEntry64.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry74 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry74.setExtra();
        zipArchiveEntry74.setTime(0L);
        zipArchiveEntry74.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime80 = zipArchiveEntry74.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry81 = zipArchiveEntry64.setLastAccessTime(fileTime80);
        java.util.zip.ZipEntry zipEntry82 = zipArchiveEntry29.setLastAccessTime(fileTime80);
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry20.setCreationTime(fileTime80);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry1.setCreationTime(fileTime80);
        int int85 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData86 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(unparseableExtraFieldData22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(unparseableExtraFieldData31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertNotNull(generalPurposeBit37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(byteArray45);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNull(zipExtraField57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit60);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(zipExtraFieldArray70);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray70, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertNotNull(fileTime80);
        org.junit.Assert.assertNotNull(zipEntry81);
        org.junit.Assert.assertEquals(zipEntry81.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry82);
        org.junit.Assert.assertEquals(zipEntry82.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNull(unparseableExtraFieldData86);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        byte[] byteArray8 = zipArchiveEntry1.getLocalFileDataExtra();
        byte[] byteArray9 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setExtra();
        byte[] byteArray13 = zipArchiveEntry11.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date16 = zipArchiveEntry15.getLastModifiedDate();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry15.setName("hi!", byteArray20);
        zipArchiveEntry11.setExtra(byteArray20);
        long long23 = zipArchiveEntry11.getExternalAttributes();
        long long24 = zipArchiveEntry11.getTime();
        boolean boolean25 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry11);
        byte[] byteArray26 = zipArchiveEntry1.getLocalFileDataExtra();
        int int27 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setUnixMode((int) (byte) 1);
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = zipArchiveEntry10.getGeneralPurposeBit();
        zipArchiveEntry10.setTime((long) (byte) 10);
        long long14 = zipArchiveEntry10.getCrc();
        zipArchiveEntry10.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData17 = zipArchiveEntry10.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime18 = zipArchiveEntry10.getTimeLocal();
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry10.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry21.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry24.setName("hi!", byteArray29);
        zipArchiveEntry21.setExtra(byteArray29);
        zipArchiveEntry10.setExtra(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime35 = zipArchiveEntry34.getLastAccessTime();
        zipArchiveEntry34.setName("");
        java.nio.file.attribute.FileTime fileTime38 = zipArchiveEntry34.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData39 = zipArchiveEntry34.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime40 = zipArchiveEntry34.getLastModifiedTime();
        java.lang.String str41 = zipArchiveEntry34.getName();
        zipArchiveEntry34.setName("");
        int int44 = zipArchiveEntry34.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry46.setExtra();
        byte[] byteArray48 = zipArchiveEntry46.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date51 = zipArchiveEntry50.getLastModifiedDate();
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry50.setName("hi!", byteArray55);
        zipArchiveEntry46.setExtra(byteArray55);
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry46.setCentralDirectoryExtra(byteArray62);
        zipArchiveEntry46.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData66 = zipArchiveEntry46.getUnparseableExtraFieldData();
        zipArchiveEntry34.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData66);
        zipArchiveEntry10.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData66);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData66);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(fileTime35);
        org.junit.Assert.assertNull(fileTime38);
        org.junit.Assert.assertNull(unparseableExtraFieldData39);
        org.junit.Assert.assertNull(fileTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(byteArray48);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData66);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setExtra();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        byte[] byteArray9 = zipArchiveEntry7.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date12 = zipArchiveEntry11.getLastModifiedDate();
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry11.setName("hi!", byteArray16);
        zipArchiveEntry7.setExtra(byteArray16);
        long long19 = zipArchiveEntry7.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = zipArchiveEntry7.getExtraField(zipShort20);
        long long22 = zipArchiveEntry7.getExternalAttributes();
        zipArchiveEntry7.setCrc((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = zipArchiveEntry7.getGeneralPurposeBit();
        java.lang.String str26 = zipArchiveEntry7.getName();
        java.lang.String str27 = zipArchiveEntry7.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setExtra();
        byte[] byteArray31 = zipArchiveEntry29.getRawName();
        zipArchiveEntry29.setPlatform((int) (byte) 100);
        zipArchiveEntry29.setExternalAttributes((long) 10);
        long long36 = zipArchiveEntry29.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry38.setExtra();
        zipArchiveEntry38.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date44 = zipArchiveEntry43.getLastModifiedDate();
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry43.setName("hi!", byteArray48);
        zipArchiveEntry38.setCentralDirectoryExtra(byteArray48);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry52.setExtra();
        byte[] byteArray54 = zipArchiveEntry52.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry56 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date57 = zipArchiveEntry56.getLastModifiedDate();
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry56.setName("hi!", byteArray61);
        zipArchiveEntry52.setExtra(byteArray61);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry52.setCentralDirectoryExtra(byteArray68);
        zipArchiveEntry52.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData72 = zipArchiveEntry52.getUnparseableExtraFieldData();
        zipArchiveEntry38.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData72);
        zipArchiveEntry29.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData72);
        zipArchiveEntry7.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData72);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData72);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit77 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setExternalAttributes(0L);
        java.util.Date date80 = zipArchiveEntry1.getLastModifiedDate();
        java.lang.String str81 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(zipExtraField21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(generalPurposeBit25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(byteArray31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray54);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData72);
        org.junit.Assert.assertNotNull(generalPurposeBit77);
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(str81);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        long long12 = zipArchiveEntry1.getCompressedSize();
        boolean boolean13 = zipArchiveEntry1.isDirectory();
        java.util.Date date14 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData15 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.String str16 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setInternalAttributes((int) (short) -1);
        zipArchiveEntry1.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry22.getLastAccessTime();
        zipArchiveEntry22.setName("");
        zipArchiveEntry22.setUnixMode((int) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setExtra();
        byte[] byteArray31 = zipArchiveEntry29.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date34 = zipArchiveEntry33.getLastModifiedDate();
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry33.setName("hi!", byteArray38);
        zipArchiveEntry29.setExtra(byteArray38);
        long long41 = zipArchiveEntry29.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort42 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField43 = zipArchiveEntry29.getExtraField(zipShort42);
        int int44 = zipArchiveEntry29.getUnixMode();
        int int45 = zipArchiveEntry29.getPlatform();
        long long46 = zipArchiveEntry29.getTime();
        long long47 = zipArchiveEntry29.getTime();
        int int48 = zipArchiveEntry29.getUnixMode();
        zipArchiveEntry29.setInternalAttributes(3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry52.setPlatform(0);
        java.lang.Object obj55 = null;
        boolean boolean56 = zipArchiveEntry52.equals(obj55);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit59 = zipArchiveEntry58.getGeneralPurposeBit();
        int int60 = zipArchiveEntry58.getMethod();
        long long61 = zipArchiveEntry58.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry64.setExtra();
        zipArchiveEntry64.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date70 = zipArchiveEntry69.getLastModifiedDate();
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry69.setName("hi!", byteArray74);
        zipArchiveEntry64.setCentralDirectoryExtra(byteArray74);
        zipArchiveEntry58.setName("hi!", byteArray74);
        zipArchiveEntry52.setCentralDirectoryExtra(byteArray74);
        zipArchiveEntry52.setName("hi!");
        byte[] byteArray81 = zipArchiveEntry52.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry83 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry83.setExtra();
        byte[] byteArray85 = zipArchiveEntry83.getRawName();
        zipArchiveEntry83.setPlatform((int) (byte) 100);
        zipArchiveEntry83.setExternalAttributes((long) 10);
        long long90 = zipArchiveEntry83.getCrc();
        byte[] byteArray91 = zipArchiveEntry83.getExtra();
        zipArchiveEntry52.setExtra(byteArray91);
        zipArchiveEntry29.setCentralDirectoryExtra(byteArray91);
        zipArchiveEntry22.setCentralDirectoryExtra(byteArray91);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray91);
        java.lang.String str96 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(unparseableExtraFieldData15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(fileTime23);
        org.junit.Assert.assertNull(byteArray31);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNull(zipExtraField43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] {});
        org.junit.Assert.assertNull(byteArray85);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + (-1L) + "'", long90 == (-1L));
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] {});
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        long long3 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray5 = zipArchiveEntry1.getLocalFileDataExtra();
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        int int9 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray4, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setPlatform((int) ' ');
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray7 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setCrc((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = zipArchiveEntry1.getTimeLocal();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 15");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setExternalAttributes((long) 10);
        long long8 = zipArchiveEntry1.getCrc();
        int int9 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData10 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = zipArchiveEntry1.getGeneralPurposeBit();
        java.util.Date date12 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(unparseableExtraFieldData10);
        org.junit.Assert.assertNotNull(generalPurposeBit11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        long long4 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setExternalAttributes((long) 10);
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setUnixMode((int) (byte) 1);
        long long10 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        boolean boolean17 = zipArchiveEntry1.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit18 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (short) 1);
        java.lang.Object obj21 = zipArchiveEntry1.clone();
        byte[] byteArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.setExtra(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        long long9 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit10 = zipArchiveEntry1.getGeneralPurposeBit();
        java.lang.Object obj11 = zipArchiveEntry1.clone();
        java.lang.String str12 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        long long4 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setExternalAttributes((long) 3);
        long long7 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getCreationTime();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime9 = zipArchiveEntry1.getTimeLocal();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 15");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(fileTime8);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date7 = zipArchiveEntry6.getLastModifiedDate();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry6.setName("hi!", byteArray11);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        zipArchiveEntry15.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry15.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit24 = zipArchiveEntry23.getGeneralPurposeBit();
        int int25 = zipArchiveEntry23.getMethod();
        long long26 = zipArchiveEntry23.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setExtra();
        zipArchiveEntry29.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date35 = zipArchiveEntry34.getLastModifiedDate();
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry34.setName("hi!", byteArray39);
        zipArchiveEntry29.setCentralDirectoryExtra(byteArray39);
        zipArchiveEntry23.setName("hi!", byteArray39);
        zipArchiveEntry15.setName("", byteArray39);
        zipArchiveEntry1.setExtra(byteArray39);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date47 = zipArchiveEntry46.getLastModifiedDate();
        long long48 = zipArchiveEntry46.getTime();
        java.lang.String str49 = zipArchiveEntry46.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray52 = zipArchiveEntry51.getExtraFields();
        zipArchiveEntry46.setExtraFields(zipExtraFieldArray52);
        zipArchiveEntry46.setCompressedSize((long) 8);
        boolean boolean56 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry46);
        long long57 = zipArchiveEntry46.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry59.setExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort61 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField62 = zipArchiveEntry59.getExtraField(zipShort61);
        long long63 = zipArchiveEntry59.getCompressedSize();
        java.lang.String str64 = zipArchiveEntry59.getComment();
        zipArchiveEntry59.setComment("");
        zipArchiveEntry59.setCompressedSize(3L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry70 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry70.setExtra();
        byte[] byteArray72 = zipArchiveEntry70.getRawName();
        zipArchiveEntry70.setPlatform((int) (byte) 100);
        long long75 = zipArchiveEntry70.getSize();
        long long76 = zipArchiveEntry70.getTime();
        boolean boolean77 = zipArchiveEntry70.isDirectory();
        long long78 = zipArchiveEntry70.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry80 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray81 = zipArchiveEntry80.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry83 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date84 = zipArchiveEntry83.getLastModifiedDate();
        long long85 = zipArchiveEntry83.getTime();
        java.lang.String str86 = zipArchiveEntry83.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry88 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray89 = zipArchiveEntry88.getExtraFields();
        zipArchiveEntry83.setExtraFields(zipExtraFieldArray89);
        zipArchiveEntry80.setExtraFields(zipExtraFieldArray89);
        zipArchiveEntry70.setExtraFields(zipExtraFieldArray89);
        zipArchiveEntry59.setExtraFields(zipExtraFieldArray89);
        zipArchiveEntry46.setExtraFields(zipExtraFieldArray89);
        java.lang.String str95 = zipArchiveEntry46.getComment();
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertNotNull(generalPurposeBit24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(zipExtraFieldArray52);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray52, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNull(zipExtraField62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(byteArray72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-1L) + "'", long78 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray81);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray81, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-1L) + "'", long85 == (-1L));
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(zipExtraFieldArray89);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray89, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray8 = zipArchiveEntry1.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        long long10 = zipArchiveEntry1.getTime();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields(false);
        int int8 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit10 = zipArchiveEntry1.getGeneralPurposeBit();
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit10);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        int int16 = zipArchiveEntry1.getUnixMode();
        int int17 = zipArchiveEntry1.getPlatform();
        long long18 = zipArchiveEntry1.getTime();
        long long19 = zipArchiveEntry1.getTime();
        int int20 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setInternalAttributes(3);
        java.lang.String str23 = zipArchiveEntry1.getName();
        java.lang.String str24 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit28 = zipArchiveEntry27.getGeneralPurposeBit();
        int int29 = zipArchiveEntry27.getMethod();
        zipArchiveEntry27.setCompressedSize((long) (-1));
        zipArchiveEntry27.setExternalAttributes((long) 'a');
        zipArchiveEntry27.setSize((long) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry38.setExtra();
        byte[] byteArray40 = zipArchiveEntry38.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date43 = zipArchiveEntry42.getLastModifiedDate();
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry42.setName("hi!", byteArray47);
        zipArchiveEntry38.setExtra(byteArray47);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry38.setCentralDirectoryExtra(byteArray54);
        zipArchiveEntry27.setName("", byteArray54);
        zipArchiveEntry1.setName("hi!", byteArray54);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(generalPurposeBit28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(byteArray40);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setExtra();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date12 = zipArchiveEntry11.getLastModifiedDate();
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry11.setName("hi!", byteArray16);
        zipArchiveEntry8.setExtra(byteArray16);
        zipArchiveEntry1.setName("", byteArray16);
        zipArchiveEntry1.setPlatform((-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date27 = zipArchiveEntry26.getLastModifiedDate();
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry26.setName("hi!", byteArray31);
        zipArchiveEntry23.setExtra(byteArray31);
        long long34 = zipArchiveEntry23.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setExtra();
        byte[] byteArray38 = zipArchiveEntry36.getRawName();
        zipArchiveEntry36.setPlatform((int) (byte) 100);
        long long41 = zipArchiveEntry36.getSize();
        long long42 = zipArchiveEntry36.getTime();
        boolean boolean43 = zipArchiveEntry36.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit46 = zipArchiveEntry45.getGeneralPurposeBit();
        long long47 = zipArchiveEntry45.getCrc();
        long long48 = zipArchiveEntry45.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit51 = zipArchiveEntry50.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry53.setExtra();
        byte[] byteArray55 = zipArchiveEntry53.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date58 = zipArchiveEntry57.getLastModifiedDate();
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry57.setName("hi!", byteArray62);
        zipArchiveEntry53.setExtra(byteArray62);
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry53.setCentralDirectoryExtra(byteArray69);
        zipArchiveEntry53.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData73 = zipArchiveEntry53.getUnparseableExtraFieldData();
        zipArchiveEntry50.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData73);
        zipArchiveEntry45.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData73);
        zipArchiveEntry36.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData73);
        zipArchiveEntry23.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData73);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData73);
        int int79 = zipArchiveEntry1.getMethod();
        java.lang.Object obj80 = zipArchiveEntry1.clone();
        byte[] byteArray81 = zipArchiveEntry1.getRawName();
        byte[] byteArray82 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit51);
        org.junit.Assert.assertNull(byteArray55);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData73);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertEquals(obj80.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj80), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj80), "");
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = zipArchiveEntry1.getExtraField(zipShort14);
        int int16 = zipArchiveEntry1.getUnixMode();
        int int17 = zipArchiveEntry1.getPlatform();
        boolean boolean18 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = zipArchiveEntry1.getUnparseableExtraFieldData();
        long long7 = zipArchiveEntry1.getTime();
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray8 = zipArchiveEntry1.getLocalFileDataExtra();
        byte[] byteArray9 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        java.lang.Object obj12 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setUnixMode((int) (short) 100);
        long long7 = zipArchiveEntry1.getTime();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setPlatform(0);
        zipArchiveEntry10.setExtra();
        byte[] byteArray14 = zipArchiveEntry10.getExtra();
        zipArchiveEntry1.setExtra(byteArray14);
        java.lang.Object obj16 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date19 = zipArchiveEntry18.getLastModifiedDate();
        long long20 = zipArchiveEntry18.getTime();
        java.lang.String str21 = zipArchiveEntry18.getComment();
        zipArchiveEntry18.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = zipArchiveEntry18.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry18);
        zipArchiveEntry18.setCompressedSize(8L);
        zipArchiveEntry18.setUnixMode((int) (short) 10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = zipArchiveEntry18.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray30);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime34 = zipArchiveEntry33.getLastAccessTime();
        zipArchiveEntry33.setName("");
        long long37 = zipArchiveEntry33.getExternalAttributes();
        zipArchiveEntry33.setTime((-1L));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date45 = zipArchiveEntry44.getLastModifiedDate();
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry44.setName("hi!", byteArray49);
        zipArchiveEntry41.setExtra(byteArray49);
        long long52 = zipArchiveEntry41.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry54.setExtra();
        byte[] byteArray56 = zipArchiveEntry54.getRawName();
        zipArchiveEntry54.setPlatform((int) (byte) 100);
        long long59 = zipArchiveEntry54.getSize();
        long long60 = zipArchiveEntry54.getTime();
        boolean boolean61 = zipArchiveEntry54.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit64 = zipArchiveEntry63.getGeneralPurposeBit();
        long long65 = zipArchiveEntry63.getCrc();
        long long66 = zipArchiveEntry63.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry68 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit69 = zipArchiveEntry68.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry71 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry71.setExtra();
        byte[] byteArray73 = zipArchiveEntry71.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry75 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date76 = zipArchiveEntry75.getLastModifiedDate();
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry75.setName("hi!", byteArray80);
        zipArchiveEntry71.setExtra(byteArray80);
        byte[] byteArray87 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry71.setCentralDirectoryExtra(byteArray87);
        zipArchiveEntry71.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData91 = zipArchiveEntry71.getUnparseableExtraFieldData();
        zipArchiveEntry68.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry63.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry54.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry41.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry33.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray24, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray30, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNull(byteArray56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit69);
        org.junit.Assert.assertNull(byteArray73);
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData91);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setInternalAttributes(8);
        java.util.Date date9 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray10 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        long long14 = zipArchiveEntry12.getTime();
        java.lang.String str15 = zipArchiveEntry12.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry17.getExtraFields();
        zipArchiveEntry12.setExtraFields(zipExtraFieldArray18);
        int int20 = zipArchiveEntry12.getPlatform();
        java.nio.file.attribute.FileTime fileTime21 = zipArchiveEntry12.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit24 = zipArchiveEntry23.getGeneralPurposeBit();
        zipArchiveEntry23.setTime((long) (byte) 10);
        long long27 = zipArchiveEntry23.getCrc();
        int int28 = zipArchiveEntry23.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry30.setExtra();
        byte[] byteArray32 = zipArchiveEntry30.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date35 = zipArchiveEntry34.getLastModifiedDate();
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry34.setName("hi!", byteArray39);
        zipArchiveEntry30.setExtra(byteArray39);
        long long42 = zipArchiveEntry30.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort43 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField44 = zipArchiveEntry30.getExtraField(zipShort43);
        boolean boolean46 = zipArchiveEntry30.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit47 = zipArchiveEntry30.getGeneralPurposeBit();
        zipArchiveEntry23.setGeneralPurposeBit(generalPurposeBit47);
        byte[] byteArray49 = zipArchiveEntry23.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit52 = zipArchiveEntry51.getGeneralPurposeBit();
        int int53 = zipArchiveEntry51.getMethod();
        zipArchiveEntry51.setCompressedSize((long) (-1));
        zipArchiveEntry51.setExternalAttributes((long) 'a');
        zipArchiveEntry51.setCompressedSize((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry61 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit62 = zipArchiveEntry61.getGeneralPurposeBit();
        zipArchiveEntry61.setTime((long) (byte) 10);
        long long65 = zipArchiveEntry61.getCrc();
        zipArchiveEntry61.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData68 = zipArchiveEntry61.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime69 = zipArchiveEntry61.getTimeLocal();
        zipArchiveEntry51.setTimeLocal(localDateTime69);
        zipArchiveEntry23.setTimeLocal(localDateTime69);
        zipArchiveEntry12.setTimeLocal(localDateTime69);
        zipArchiveEntry1.setTimeLocal(localDateTime69);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray18, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(fileTime21);
        org.junit.Assert.assertNotNull(generalPurposeBit24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(byteArray32);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNull(zipExtraField44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit47);
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertNotNull(generalPurposeBit52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(generalPurposeBit62);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData68);
        org.junit.Assert.assertNotNull(localDateTime69);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setUnixMode((int) (byte) 100);
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setExternalAttributes((long) (short) 1);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setTime((long) (short) -1);
        byte[] byteArray6 = zipArchiveEntry1.getCentralDirectoryExtra();
        byte[] byteArray7 = zipArchiveEntry1.getRawName();
        long long8 = zipArchiveEntry1.getCompressedSize();
        long long9 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date12 = zipArchiveEntry11.getLastModifiedDate();
        long long13 = zipArchiveEntry11.getTime();
        java.lang.String str14 = zipArchiveEntry11.getComment();
        long long15 = zipArchiveEntry11.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setExtra();
        byte[] byteArray19 = zipArchiveEntry17.getRawName();
        zipArchiveEntry17.setPlatform((int) (byte) 100);
        zipArchiveEntry17.setExternalAttributes((long) 10);
        long long24 = zipArchiveEntry17.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry26.setExtra();
        zipArchiveEntry26.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date32 = zipArchiveEntry31.getLastModifiedDate();
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry31.setName("hi!", byteArray36);
        zipArchiveEntry26.setCentralDirectoryExtra(byteArray36);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry40.setExtra();
        byte[] byteArray42 = zipArchiveEntry40.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date45 = zipArchiveEntry44.getLastModifiedDate();
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry44.setName("hi!", byteArray49);
        zipArchiveEntry40.setExtra(byteArray49);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry40.setCentralDirectoryExtra(byteArray56);
        zipArchiveEntry40.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData60 = zipArchiveEntry40.getUnparseableExtraFieldData();
        zipArchiveEntry26.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData60);
        zipArchiveEntry17.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData60);
        zipArchiveEntry11.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData60);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry66 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry66.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date70 = zipArchiveEntry69.getLastModifiedDate();
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry69.setName("hi!", byteArray74);
        zipArchiveEntry66.setExtra(byteArray74);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort77 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField78 = zipArchiveEntry66.getExtraField(zipShort77);
        int int79 = zipArchiveEntry66.getUnixMode();
        byte[] byteArray80 = zipArchiveEntry66.getExtra();
        zipArchiveEntry11.setName("", byteArray80);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray80);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray42);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData60);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        long long5 = zipArchiveEntry1.getExternalAttributes();
        long long6 = zipArchiveEntry1.getCrc();
        long long7 = zipArchiveEntry1.getSize();
        byte[] byteArray8 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        java.nio.file.attribute.FileTime fileTime14 = zipArchiveEntry10.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry10.getCreationTime();
        int int16 = zipArchiveEntry10.getMethod();
        zipArchiveEntry10.setExternalAttributes((long) 'a');
        byte[] byteArray19 = zipArchiveEntry10.getExtra();
        byte[] byteArray20 = zipArchiveEntry10.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry22.setName("");
        java.lang.Object obj25 = zipArchiveEntry22.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry22.getExtraFields(true);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray29 = zipArchiveEntry22.getExtraFields(false);
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray29);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setPlatform(0);
        zipArchiveEntry32.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry37.setExtra();
        zipArchiveEntry37.setTime(0L);
        java.nio.file.attribute.FileTime fileTime41 = zipArchiveEntry37.getLastAccessTime();
        zipArchiveEntry37.setExternalAttributes((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry45.setExtra();
        byte[] byteArray47 = zipArchiveEntry45.getRawName();
        zipArchiveEntry45.setPlatform((int) (byte) 100);
        long long50 = zipArchiveEntry45.getSize();
        java.nio.file.attribute.FileTime fileTime51 = zipArchiveEntry45.getLastModifiedTime();
        long long52 = zipArchiveEntry45.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort53 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField54 = zipArchiveEntry45.getExtraField(zipShort53);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry56 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit57 = zipArchiveEntry56.getGeneralPurposeBit();
        long long58 = zipArchiveEntry56.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray59 = zipArchiveEntry56.getExtraFields();
        zipArchiveEntry45.setExtraFields(zipExtraFieldArray59);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort61 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField62 = zipArchiveEntry45.getExtraField(zipShort61);
        zipArchiveEntry45.setUnixMode((int) '4');
        long long65 = zipArchiveEntry45.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry67 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry67.setPlatform(0);
        java.lang.String str70 = zipArchiveEntry67.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray71 = zipArchiveEntry67.getExtraFields();
        zipArchiveEntry67.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry75 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry75.setExtra();
        zipArchiveEntry75.setTime(0L);
        zipArchiveEntry75.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime81 = zipArchiveEntry75.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry82 = zipArchiveEntry67.setCreationTime(fileTime81);
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry45.setLastAccessTime(fileTime81);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry37.setLastAccessTime(fileTime81);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry32.setLastModifiedTime(fileTime81);
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry10.setLastAccessTime(fileTime81);
        java.util.zip.ZipEntry zipEntry87 = zipArchiveEntry1.setCreationTime(fileTime81);
        long long88 = zipArchiveEntry1.getTime();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(fileTime14);
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray29);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray29, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime41);
        org.junit.Assert.assertNull(byteArray47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNull(fileTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNull(zipExtraField54);
        org.junit.Assert.assertNotNull(generalPurposeBit57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray59);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray59, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField62);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(zipExtraFieldArray71);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray71, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime81);
        org.junit.Assert.assertNotNull(zipEntry82);
        org.junit.Assert.assertEquals(zipEntry82.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry86);
        org.junit.Assert.assertEquals(zipEntry86.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry87);
        org.junit.Assert.assertEquals(zipEntry87.toString(), "");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-1L) + "'", long88 == (-1L));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit5 = zipArchiveEntry4.getGeneralPurposeBit();
        byte[] byteArray6 = zipArchiveEntry4.getRawName();
        long long7 = zipArchiveEntry4.getExternalAttributes();
        boolean boolean8 = zipArchiveEntry1.equals((java.lang.Object) long7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = zipArchiveEntry10.getGeneralPurposeBit();
        zipArchiveEntry10.setTime((long) (byte) 10);
        long long14 = zipArchiveEntry10.getCrc();
        boolean boolean15 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry10);
        zipArchiveEntry1.setCompressedSize(0L);
        int int18 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setPlatform(0);
        java.lang.String str23 = zipArchiveEntry20.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = zipArchiveEntry20.getExtraFields();
        zipArchiveEntry20.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setExtra();
        zipArchiveEntry28.setTime(0L);
        zipArchiveEntry28.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime34 = zipArchiveEntry28.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry35 = zipArchiveEntry20.setCreationTime(fileTime34);
        zipArchiveEntry20.setExternalAttributes((long) 8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setExtra();
        byte[] byteArray41 = zipArchiveEntry39.getRawName();
        zipArchiveEntry39.setPlatform((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date46 = zipArchiveEntry45.getLastModifiedDate();
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry45.setName("hi!", byteArray50);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData52 = zipArchiveEntry45.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit55 = zipArchiveEntry54.getGeneralPurposeBit();
        zipArchiveEntry54.setTime((long) (byte) 10);
        long long58 = zipArchiveEntry54.getCrc();
        int int59 = zipArchiveEntry54.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry61 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry61.setExtra();
        byte[] byteArray63 = zipArchiveEntry61.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry65 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date66 = zipArchiveEntry65.getLastModifiedDate();
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry65.setName("hi!", byteArray70);
        zipArchiveEntry61.setExtra(byteArray70);
        long long73 = zipArchiveEntry61.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort74 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField75 = zipArchiveEntry61.getExtraField(zipShort74);
        boolean boolean77 = zipArchiveEntry61.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit78 = zipArchiveEntry61.getGeneralPurposeBit();
        zipArchiveEntry54.setGeneralPurposeBit(generalPurposeBit78);
        zipArchiveEntry45.setGeneralPurposeBit(generalPurposeBit78);
        zipArchiveEntry39.setGeneralPurposeBit(generalPurposeBit78);
        zipArchiveEntry20.setGeneralPurposeBit(generalPurposeBit78);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit78);
        zipArchiveEntry1.setName("hi!");
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(generalPurposeBit5);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray24, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime34);
        org.junit.Assert.assertNotNull(zipEntry35);
        org.junit.Assert.assertEquals(zipEntry35.toString(), "");
        org.junit.Assert.assertNull(byteArray41);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(unparseableExtraFieldData52);
        org.junit.Assert.assertNotNull(generalPurposeBit55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(byteArray63);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNull(zipExtraField75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit78);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("");
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry1.getExtraFields(true);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = zipArchiveEntry1.getExtraFields(false);
        zipArchiveEntry1.setExternalAttributes((long) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry1.getExtraFields(true);
        zipArchiveEntry1.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry16.setExtra();
        byte[] byteArray18 = zipArchiveEntry16.getRawName();
        zipArchiveEntry16.setPlatform((int) (byte) 100);
        long long21 = zipArchiveEntry16.getSize();
        long long22 = zipArchiveEntry16.getTime();
        long long23 = zipArchiveEntry16.getCrc();
        long long24 = zipArchiveEntry16.getCrc();
        long long25 = zipArchiveEntry16.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry27.setExtra();
        byte[] byteArray29 = zipArchiveEntry27.getRawName();
        zipArchiveEntry27.setPlatform((int) (byte) 100);
        zipArchiveEntry27.setExternalAttributes((long) 10);
        long long34 = zipArchiveEntry27.getCrc();
        int int35 = zipArchiveEntry27.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry37.setExtra();
        zipArchiveEntry37.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date43 = zipArchiveEntry42.getLastModifiedDate();
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry42.setName("hi!", byteArray47);
        zipArchiveEntry37.setCentralDirectoryExtra(byteArray47);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry51.setExtra();
        byte[] byteArray53 = zipArchiveEntry51.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date56 = zipArchiveEntry55.getLastModifiedDate();
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry55.setName("hi!", byteArray60);
        zipArchiveEntry51.setExtra(byteArray60);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry51.setCentralDirectoryExtra(byteArray67);
        zipArchiveEntry51.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData71 = zipArchiveEntry51.getUnparseableExtraFieldData();
        zipArchiveEntry37.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData71);
        zipArchiveEntry27.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData71);
        zipArchiveEntry16.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData71);
        int int75 = zipArchiveEntry16.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry77 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit78 = zipArchiveEntry77.getGeneralPurposeBit();
        zipArchiveEntry77.setTime((long) (byte) 10);
        long long81 = zipArchiveEntry77.getCrc();
        int int82 = zipArchiveEntry77.getPlatform();
        long long83 = zipArchiveEntry77.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime84 = zipArchiveEntry77.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry16.setLastAccessTime(fileTime84);
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry1.setCreationTime(fileTime84);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray6, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray8, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray12, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNull(byteArray29);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray53);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit78);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-1L) + "'", long83 == (-1L));
        org.junit.Assert.assertNotNull(fileTime84);
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry86);
        org.junit.Assert.assertEquals(zipEntry86.toString(), "");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        zipArchiveEntry0.setComment("hi!");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit3 = zipArchiveEntry0.getGeneralPurposeBit();
        byte[] byteArray4 = zipArchiveEntry0.getRawName();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = zipArchiveEntry0.getUnparseableExtraFieldData();
        zipArchiveEntry0.setComment("");
        zipArchiveEntry0.setPlatform(35);
        org.junit.Assert.assertNotNull(generalPurposeBit3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray6);
        zipArchiveEntry1.setInternalAttributes((int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit12 = zipArchiveEntry11.getGeneralPurposeBit();
        zipArchiveEntry11.setTime((long) (byte) 10);
        long long15 = zipArchiveEntry11.getCrc();
        long long16 = zipArchiveEntry11.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry18.setExtra();
        byte[] byteArray20 = zipArchiveEntry18.getRawName();
        zipArchiveEntry18.setPlatform((int) (byte) 100);
        zipArchiveEntry18.setExternalAttributes((long) 10);
        long long25 = zipArchiveEntry18.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit28 = zipArchiveEntry27.getGeneralPurposeBit();
        zipArchiveEntry27.setTime((long) (byte) 10);
        long long31 = zipArchiveEntry27.getCrc();
        int int32 = zipArchiveEntry27.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry34.setExtra();
        byte[] byteArray36 = zipArchiveEntry34.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date39 = zipArchiveEntry38.getLastModifiedDate();
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry38.setName("hi!", byteArray43);
        zipArchiveEntry34.setExtra(byteArray43);
        long long46 = zipArchiveEntry34.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort47 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField48 = zipArchiveEntry34.getExtraField(zipShort47);
        boolean boolean50 = zipArchiveEntry34.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit51 = zipArchiveEntry34.getGeneralPurposeBit();
        zipArchiveEntry27.setGeneralPurposeBit(generalPurposeBit51);
        byte[] byteArray53 = zipArchiveEntry27.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit56 = zipArchiveEntry55.getGeneralPurposeBit();
        int int57 = zipArchiveEntry55.getMethod();
        zipArchiveEntry55.setCompressedSize((long) (-1));
        zipArchiveEntry55.setExternalAttributes((long) 'a');
        zipArchiveEntry55.setCompressedSize((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry65 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit66 = zipArchiveEntry65.getGeneralPurposeBit();
        zipArchiveEntry65.setTime((long) (byte) 10);
        long long69 = zipArchiveEntry65.getCrc();
        zipArchiveEntry65.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData72 = zipArchiveEntry65.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime73 = zipArchiveEntry65.getTimeLocal();
        zipArchiveEntry55.setTimeLocal(localDateTime73);
        zipArchiveEntry27.setTimeLocal(localDateTime73);
        zipArchiveEntry18.setTimeLocal(localDateTime73);
        zipArchiveEntry11.setTimeLocal(localDateTime73);
        java.nio.file.attribute.FileTime fileTime78 = zipArchiveEntry11.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry79 = zipArchiveEntry1.setLastModifiedTime(fileTime78);
        byte[] byteArray80 = zipArchiveEntry1.getRawName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray6, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNull(zipExtraField48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit51);
        org.junit.Assert.assertNull(byteArray53);
        org.junit.Assert.assertNotNull(generalPurposeBit56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(generalPurposeBit66);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData72);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(fileTime78);
        org.junit.Assert.assertNotNull(zipEntry79);
        org.junit.Assert.assertEquals(zipEntry79.toString(), "");
        org.junit.Assert.assertNull(byteArray80);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastModifiedTime();
        int int5 = zipArchiveEntry1.getInternalAttributes();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        byte[] byteArray8 = zipArchiveEntry7.getCentralDirectoryExtra();
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry7.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date15 = zipArchiveEntry14.getLastModifiedDate();
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry14.setName("hi!", byteArray19);
        zipArchiveEntry11.setExtra(byteArray19);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField23 = zipArchiveEntry11.getExtraField(zipShort22);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date26 = zipArchiveEntry25.getLastModifiedDate();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry25.setName("hi!", byteArray30);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData32 = zipArchiveEntry25.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit35 = zipArchiveEntry34.getGeneralPurposeBit();
        zipArchiveEntry34.setTime((long) (byte) 10);
        long long38 = zipArchiveEntry34.getCrc();
        int int39 = zipArchiveEntry34.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        byte[] byteArray43 = zipArchiveEntry41.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date46 = zipArchiveEntry45.getLastModifiedDate();
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry45.setName("hi!", byteArray50);
        zipArchiveEntry41.setExtra(byteArray50);
        long long53 = zipArchiveEntry41.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort54 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField55 = zipArchiveEntry41.getExtraField(zipShort54);
        boolean boolean57 = zipArchiveEntry41.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit58 = zipArchiveEntry41.getGeneralPurposeBit();
        zipArchiveEntry34.setGeneralPurposeBit(generalPurposeBit58);
        zipArchiveEntry25.setGeneralPurposeBit(generalPurposeBit58);
        zipArchiveEntry11.setGeneralPurposeBit(generalPurposeBit58);
        zipArchiveEntry7.setGeneralPurposeBit(generalPurposeBit58);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit58);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField23);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(unparseableExtraFieldData32);
        org.junit.Assert.assertNotNull(generalPurposeBit35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(byteArray43);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNull(zipExtraField55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit58);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setExternalAttributes((long) 1);
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setPlatform(100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry1.getExtraFields();
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData14 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray12, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNull(unparseableExtraFieldData14);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = zipArchiveEntry8.getGeneralPurposeBit();
        zipArchiveEntry8.setTime((long) (byte) 10);
        long long12 = zipArchiveEntry8.getCrc();
        int int13 = zipArchiveEntry8.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date20 = zipArchiveEntry19.getLastModifiedDate();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry19.setName("hi!", byteArray24);
        zipArchiveEntry15.setExtra(byteArray24);
        long long27 = zipArchiveEntry15.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField29 = zipArchiveEntry15.getExtraField(zipShort28);
        boolean boolean31 = zipArchiveEntry15.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit32 = zipArchiveEntry15.getGeneralPurposeBit();
        zipArchiveEntry8.setGeneralPurposeBit(generalPurposeBit32);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit32);
        java.lang.Object obj35 = zipArchiveEntry1.clone();
        java.nio.file.attribute.FileTime fileTime36 = zipArchiveEntry1.getLastModifiedTime();
        long long37 = zipArchiveEntry1.getCompressedSize();
        java.lang.String str38 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(generalPurposeBit9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(zipExtraField29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit32);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "hi!");
        org.junit.Assert.assertNull(fileTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        java.lang.String str6 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = zipArchiveEntry1.getUnparseableExtraFieldData();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        java.lang.String str7 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        long long8 = zipArchiveEntry1.getCrc();
        int int9 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime(6553601L);
        zipArchiveEntry1.setComment("hi!");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        byte[] byteArray22 = zipArchiveEntry20.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry24.setName("hi!", byteArray29);
        zipArchiveEntry20.setExtra(byteArray29);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry20.setCentralDirectoryExtra(byteArray36);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray36);
        java.lang.String str39 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        zipArchiveEntry41.setTime(0L);
        zipArchiveEntry41.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime47 = zipArchiveEntry41.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry48 = zipArchiveEntry1.setLastModifiedTime(fileTime47);
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        zipArchiveEntry1.setTime((long) (short) -1);
        java.util.Date date53 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(fileTime47);
        org.junit.Assert.assertNotNull(zipEntry48);
        org.junit.Assert.assertEquals(zipEntry48.toString(), "");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        byte[] byteArray8 = zipArchiveEntry1.getLocalFileDataExtra();
        byte[] byteArray9 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setExtra();
        byte[] byteArray13 = zipArchiveEntry11.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date16 = zipArchiveEntry15.getLastModifiedDate();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry15.setName("hi!", byteArray20);
        zipArchiveEntry11.setExtra(byteArray20);
        long long23 = zipArchiveEntry11.getExternalAttributes();
        long long24 = zipArchiveEntry11.getTime();
        boolean boolean25 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry11);
        int int26 = zipArchiveEntry11.getPlatform();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        byte[] byteArray22 = zipArchiveEntry20.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry24.setName("hi!", byteArray29);
        zipArchiveEntry20.setExtra(byteArray29);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry20.setCentralDirectoryExtra(byteArray36);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray36);
        java.util.Date date39 = zipArchiveEntry1.getLastModifiedDate();
        int int40 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setExternalAttributes(10L);
        zipArchiveEntry1.setTime((long) (short) -1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = zipArchiveEntry1.getExtraField(zipShort12);
        boolean boolean14 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setTime((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry1.getCreationTime();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(fileTime17);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = zipArchiveEntry1.getExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = zipArchiveEntry1.getExtraField(zipShort5);
        zipArchiveEntry1.setInternalAttributes(0);
        java.lang.String str9 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        byte[] byteArray5 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry1.getExtraFields(true);
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setCrc((long) (short) 0);
        zipArchiveEntry1.setInternalAttributes((int) (short) -1);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        byte[] byteArray1 = zipArchiveEntry0.getCentralDirectoryExtra();
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry0.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray3 = zipArchiveEntry0.getExtraFields();
        zipArchiveEntry0.setExternalAttributes((long) (short) 100);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(zipExtraFieldArray3);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray3, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        long long14 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setExtra();
        byte[] byteArray19 = zipArchiveEntry17.getRawName();
        zipArchiveEntry17.setPlatform((int) (byte) 100);
        long long22 = zipArchiveEntry17.getSize();
        long long23 = zipArchiveEntry17.getTime();
        byte[] byteArray24 = zipArchiveEntry17.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray24);
        long long26 = zipArchiveEntry1.getCrc();
        byte[] byteArray27 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setExternalAttributes((long) (byte) -1);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray15, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setInternalAttributes(8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setExtra();
        zipArchiveEntry11.setName("");
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry11.setName("", byteArray20);
        zipArchiveEntry1.setName("", byteArray20);
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setMethod((int) '#');
        int int26 = zipArchiveEntry1.getMethod();
        java.nio.file.attribute.FileTime fileTime27 = zipArchiveEntry1.getLastModifiedTime();
        java.nio.file.attribute.FileTime fileTime28 = zipArchiveEntry1.getCreationTime();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNull(fileTime23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNull(fileTime27);
        org.junit.Assert.assertNull(fileTime28);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        int int4 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setExternalAttributes(1L);
        java.util.Date date7 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setCompressedSize((long) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getTime();
        java.util.Date date7 = zipArchiveEntry1.getLastModifiedDate();
        long long8 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = zipArchiveEntry10.getGeneralPurposeBit();
        int int12 = zipArchiveEntry10.getMethod();
        int int13 = zipArchiveEntry10.getInternalAttributes();
        long long14 = zipArchiveEntry10.getCrc();
        byte[] byteArray15 = zipArchiveEntry10.getExtra();
        byte[] byteArray16 = zipArchiveEntry10.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit19 = zipArchiveEntry18.getGeneralPurposeBit();
        zipArchiveEntry18.setTime((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date24 = zipArchiveEntry23.getLastModifiedDate();
        long long25 = zipArchiveEntry23.getTime();
        java.lang.String str26 = zipArchiveEntry23.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray29 = zipArchiveEntry28.getExtraFields();
        zipArchiveEntry23.setExtraFields(zipExtraFieldArray29);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date33 = zipArchiveEntry32.getLastModifiedDate();
        long long34 = zipArchiveEntry32.getTime();
        java.lang.String str35 = zipArchiveEntry32.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = zipArchiveEntry37.getExtraFields();
        zipArchiveEntry32.setExtraFields(zipExtraFieldArray38);
        zipArchiveEntry23.setExtraFields(zipExtraFieldArray38);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry42.setExtra();
        byte[] byteArray44 = zipArchiveEntry42.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date47 = zipArchiveEntry46.getLastModifiedDate();
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry46.setName("hi!", byteArray51);
        zipArchiveEntry42.setExtra(byteArray51);
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry42.setCentralDirectoryExtra(byteArray58);
        zipArchiveEntry23.setCentralDirectoryExtra(byteArray58);
        java.lang.String str61 = zipArchiveEntry23.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry63.setExtra();
        zipArchiveEntry63.setTime(0L);
        zipArchiveEntry63.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime69 = zipArchiveEntry63.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry70 = zipArchiveEntry23.setLastModifiedTime(fileTime69);
        java.util.zip.ZipEntry zipEntry71 = zipArchiveEntry18.setLastAccessTime(fileTime69);
        java.util.zip.ZipEntry zipEntry72 = zipArchiveEntry10.setCreationTime(fileTime69);
        boolean boolean73 = zipArchiveEntry1.equals((java.lang.Object) fileTime69);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray75 = zipArchiveEntry1.getExtraFields(true);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertNotNull(generalPurposeBit19);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(zipExtraFieldArray29);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray29, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray38, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray44);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(fileTime69);
        org.junit.Assert.assertNotNull(zipEntry70);
        org.junit.Assert.assertEquals(zipEntry70.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry71);
        org.junit.Assert.assertEquals(zipEntry71.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry72);
        org.junit.Assert.assertEquals(zipEntry72.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray75);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray75, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date11 = zipArchiveEntry10.getLastModifiedDate();
        long long12 = zipArchiveEntry10.getTime();
        java.lang.String str13 = zipArchiveEntry10.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray16);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray16);
        byte[] byteArray19 = zipArchiveEntry1.getLocalFileDataExtra();
        int int20 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setPlatform(32);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (byte) 10);
        long long5 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setPlatform((int) '4');
        int int8 = zipArchiveEntry1.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setPlatform(0);
        java.lang.Object obj14 = null;
        boolean boolean15 = zipArchiveEntry11.equals(obj14);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit18 = zipArchiveEntry17.getGeneralPurposeBit();
        int int19 = zipArchiveEntry17.getMethod();
        long long20 = zipArchiveEntry17.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setExtra();
        zipArchiveEntry23.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date29 = zipArchiveEntry28.getLastModifiedDate();
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry28.setName("hi!", byteArray33);
        zipArchiveEntry23.setCentralDirectoryExtra(byteArray33);
        zipArchiveEntry17.setName("hi!", byteArray33);
        zipArchiveEntry11.setCentralDirectoryExtra(byteArray33);
        zipArchiveEntry11.setName("hi!");
        byte[] byteArray40 = zipArchiveEntry11.getLocalFileDataExtra();
        zipArchiveEntry1.setName("hi!", byteArray40);
        zipArchiveEntry1.setUnixMode(52);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setExtra();
        byte[] byteArray10 = zipArchiveEntry8.getRawName();
        zipArchiveEntry8.setPlatform((int) (byte) 100);
        long long13 = zipArchiveEntry8.getSize();
        java.nio.file.attribute.FileTime fileTime14 = zipArchiveEntry8.getLastModifiedTime();
        long long15 = zipArchiveEntry8.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = zipArchiveEntry8.getExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit20 = zipArchiveEntry19.getGeneralPurposeBit();
        long long21 = zipArchiveEntry19.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray22 = zipArchiveEntry19.getExtraFields();
        zipArchiveEntry8.setExtraFields(zipExtraFieldArray22);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField25 = zipArchiveEntry8.getExtraField(zipShort24);
        zipArchiveEntry8.setUnixMode((int) '4');
        long long28 = zipArchiveEntry8.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry30.setPlatform(0);
        java.lang.String str33 = zipArchiveEntry30.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = zipArchiveEntry30.getExtraFields();
        zipArchiveEntry30.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry38.setExtra();
        zipArchiveEntry38.setTime(0L);
        zipArchiveEntry38.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime44 = zipArchiveEntry38.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry45 = zipArchiveEntry30.setCreationTime(fileTime44);
        java.util.zip.ZipEntry zipEntry46 = zipArchiveEntry8.setLastAccessTime(fileTime44);
        java.util.zip.ZipEntry zipEntry47 = zipArchiveEntry1.setLastModifiedTime(fileTime44);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort48 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField49 = zipArchiveEntry1.getExtraField(zipShort48);
        int int50 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(fileTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNull(zipExtraField17);
        org.junit.Assert.assertNotNull(generalPurposeBit20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray22);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray22, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray34, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime44);
        org.junit.Assert.assertNotNull(zipEntry45);
        org.junit.Assert.assertEquals(zipEntry45.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry46);
        org.junit.Assert.assertEquals(zipEntry46.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry47);
        org.junit.Assert.assertEquals(zipEntry47.toString(), "");
        org.junit.Assert.assertNull(zipExtraField49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setTime((long) (short) -1);
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setMethod(52);
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastModifiedTime();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.setSize((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid entry size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileTime10);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        long long3 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry5.setExtra();
        byte[] byteArray7 = zipArchiveEntry5.getRawName();
        zipArchiveEntry5.setPlatform((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setExtra();
        byte[] byteArray14 = zipArchiveEntry12.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date17 = zipArchiveEntry16.getLastModifiedDate();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry16.setName("hi!", byteArray21);
        zipArchiveEntry12.setExtra(byteArray21);
        long long24 = zipArchiveEntry12.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date28 = zipArchiveEntry27.getLastModifiedDate();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry27.setName("hi!", byteArray32);
        zipArchiveEntry12.setName("", byteArray32);
        zipArchiveEntry5.setName("hi!", byteArray32);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray32);
        zipArchiveEntry1.setExtra();
        long long38 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setCompressedSize((long) (short) 0);
        byte[] byteArray41 = zipArchiveEntry1.getLocalFileDataExtra();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setName("hi!");
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setMethod((int) '#');
        java.lang.String str8 = zipArchiveEntry1.getComment();
        long long9 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date7 = zipArchiveEntry6.getLastModifiedDate();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry6.setName("hi!", byteArray11);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        zipArchiveEntry15.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry15.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit24 = zipArchiveEntry23.getGeneralPurposeBit();
        int int25 = zipArchiveEntry23.getMethod();
        long long26 = zipArchiveEntry23.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setExtra();
        zipArchiveEntry29.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date35 = zipArchiveEntry34.getLastModifiedDate();
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry34.setName("hi!", byteArray39);
        zipArchiveEntry29.setCentralDirectoryExtra(byteArray39);
        zipArchiveEntry23.setName("hi!", byteArray39);
        zipArchiveEntry15.setName("", byteArray39);
        zipArchiveEntry1.setExtra(byteArray39);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date47 = zipArchiveEntry46.getLastModifiedDate();
        long long48 = zipArchiveEntry46.getTime();
        java.lang.String str49 = zipArchiveEntry46.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray52 = zipArchiveEntry51.getExtraFields();
        zipArchiveEntry46.setExtraFields(zipExtraFieldArray52);
        zipArchiveEntry46.setCompressedSize((long) 8);
        boolean boolean56 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry46);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit57 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) 0);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertNotNull(generalPurposeBit24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(zipExtraFieldArray52);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray52, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit57);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        java.lang.String str9 = zipArchiveEntry8.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setExtra();
        byte[] byteArray13 = zipArchiveEntry11.getRawName();
        zipArchiveEntry11.setPlatform((int) (byte) 100);
        long long16 = zipArchiveEntry11.getSize();
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry11.getLastModifiedTime();
        long long18 = zipArchiveEntry11.getCrc();
        java.lang.String str19 = zipArchiveEntry11.getComment();
        byte[] byteArray20 = zipArchiveEntry11.getCentralDirectoryExtra();
        java.lang.String str21 = zipArchiveEntry11.getComment();
        zipArchiveEntry11.setCrc(10L);
        int int24 = zipArchiveEntry11.getInternalAttributes();
        zipArchiveEntry11.setExternalAttributes((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setExtra();
        zipArchiveEntry28.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry28.getExtraFields();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit33 = zipArchiveEntry28.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry35.setExtra();
        byte[] byteArray37 = zipArchiveEntry35.getRawName();
        zipArchiveEntry35.setPlatform((int) (byte) 100);
        zipArchiveEntry35.setExternalAttributes((long) 10);
        long long42 = zipArchiveEntry35.getCrc();
        int int43 = zipArchiveEntry35.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry45.setExtra();
        zipArchiveEntry45.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date51 = zipArchiveEntry50.getLastModifiedDate();
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry50.setName("hi!", byteArray55);
        zipArchiveEntry45.setCentralDirectoryExtra(byteArray55);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry59.setExtra();
        byte[] byteArray61 = zipArchiveEntry59.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date64 = zipArchiveEntry63.getLastModifiedDate();
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry63.setName("hi!", byteArray68);
        zipArchiveEntry59.setExtra(byteArray68);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry59.setCentralDirectoryExtra(byteArray75);
        zipArchiveEntry59.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData79 = zipArchiveEntry59.getUnparseableExtraFieldData();
        zipArchiveEntry45.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry35.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry28.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry11.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        zipArchiveEntry8.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData79);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray32, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit33);
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray61);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData79);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("");
        byte[] byteArray4 = zipArchiveEntry1.getRawName();
        long long5 = zipArchiveEntry1.getCrc();
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        long long8 = zipArchiveEntry1.getTime();
        int int9 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        long long3 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry5.setExtra();
        byte[] byteArray7 = zipArchiveEntry5.getRawName();
        zipArchiveEntry5.setPlatform((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setExtra();
        byte[] byteArray14 = zipArchiveEntry12.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date17 = zipArchiveEntry16.getLastModifiedDate();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry16.setName("hi!", byteArray21);
        zipArchiveEntry12.setExtra(byteArray21);
        long long24 = zipArchiveEntry12.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date28 = zipArchiveEntry27.getLastModifiedDate();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry27.setName("hi!", byteArray32);
        zipArchiveEntry12.setName("", byteArray32);
        zipArchiveEntry5.setName("hi!", byteArray32);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray32);
        long long37 = zipArchiveEntry1.getCrc();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
    }
}

