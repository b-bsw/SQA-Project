package org.apache.commons.compress.archivers.zip;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        zipArchiveEntry1.setName("hi!");
        byte[] byteArray21 = zipArchiveEntry1.getLocalFileDataExtra();
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = zipArchiveEntry1.getExtraField(zipShort4);
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = zipArchiveEntry1.getExtraFields(false);
        int int9 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = zipArchiveEntry1.getExtraField(zipShort10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        byte[] byteArray15 = zipArchiveEntry13.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date18 = zipArchiveEntry17.getLastModifiedDate();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry17.setName("hi!", byteArray22);
        zipArchiveEntry13.setExtra(byteArray22);
        long long25 = zipArchiveEntry13.getExternalAttributes();
        long long26 = zipArchiveEntry13.getTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry13.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray27);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray8, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(zipExtraField11);
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        zipArchiveEntry1.setSize((long) '4');
        zipArchiveEntry1.setTime((long) 10);
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
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCrc();
        int int5 = zipArchiveEntry1.getMethod();
        int int6 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        int int7 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setMethod(1);
        int int10 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setSize((long) (byte) 100);
        int int13 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setExtra();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        int int6 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray7 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setExtra();
        byte[] byteArray11 = zipArchiveEntry9.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date14 = zipArchiveEntry13.getLastModifiedDate();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry13.setName("hi!", byteArray18);
        zipArchiveEntry9.setExtra(byteArray18);
        long long21 = zipArchiveEntry9.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField23 = zipArchiveEntry9.getExtraField(zipShort22);
        long long24 = zipArchiveEntry9.getExternalAttributes();
        zipArchiveEntry9.setCrc((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit27 = zipArchiveEntry9.getGeneralPurposeBit();
        int int28 = zipArchiveEntry9.getInternalAttributes();
        java.nio.file.attribute.FileTime fileTime29 = zipArchiveEntry9.getCreationTime();
        java.lang.String str30 = zipArchiveEntry9.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit33 = zipArchiveEntry32.getGeneralPurposeBit();
        long long34 = zipArchiveEntry32.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = zipArchiveEntry32.getExtraFields();
        byte[] byteArray36 = zipArchiveEntry32.getLocalFileDataExtra();
        zipArchiveEntry9.setCentralDirectoryExtra(byteArray36);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray36);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(zipExtraField23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(generalPurposeBit27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(fileTime29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(generalPurposeBit33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray35, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields(false);
        zipArchiveEntry1.setUnixMode((int) 'a');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit12 = zipArchiveEntry11.getGeneralPurposeBit();
        zipArchiveEntry11.setTime((long) (byte) 10);
        long long15 = zipArchiveEntry11.getCrc();
        int int16 = zipArchiveEntry11.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry18.setExtra();
        byte[] byteArray20 = zipArchiveEntry18.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date23 = zipArchiveEntry22.getLastModifiedDate();
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry22.setName("hi!", byteArray27);
        zipArchiveEntry18.setExtra(byteArray27);
        long long30 = zipArchiveEntry18.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort31 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField32 = zipArchiveEntry18.getExtraField(zipShort31);
        boolean boolean34 = zipArchiveEntry18.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit35 = zipArchiveEntry18.getGeneralPurposeBit();
        zipArchiveEntry11.setGeneralPurposeBit(generalPurposeBit35);
        byte[] byteArray37 = zipArchiveEntry11.getLocalFileDataExtra();
        boolean boolean38 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry11);
        long long39 = zipArchiveEntry11.getCrc();
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(zipExtraField32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit35);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        long long4 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setSize((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = zipArchiveEntry1.getExtraField(zipShort7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setPlatform(0);
        long long13 = zipArchiveEntry10.getTime();
        zipArchiveEntry10.setExternalAttributes((long) 10);
        boolean boolean16 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry10);
        java.lang.String str17 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(zipExtraField8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        int int8 = zipArchiveEntry1.getPlatform();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData9 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(unparseableExtraFieldData9);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        java.lang.String str58 = zipArchiveEntry46.getName();
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        zipArchiveEntry1.setComment("hi!");
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
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        long long8 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setTime(10L);
        java.util.Date date11 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setTime(3L);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date8 = zipArchiveEntry7.getLastModifiedDate();
        long long9 = zipArchiveEntry7.getTime();
        java.lang.String str10 = zipArchiveEntry7.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = zipArchiveEntry12.getExtraFields();
        zipArchiveEntry7.setExtraFields(zipExtraFieldArray13);
        long long15 = zipArchiveEntry7.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date18 = zipArchiveEntry17.getLastModifiedDate();
        long long19 = zipArchiveEntry17.getTime();
        java.lang.String str20 = zipArchiveEntry17.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = zipArchiveEntry22.getExtraFields();
        zipArchiveEntry17.setExtraFields(zipExtraFieldArray23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date27 = zipArchiveEntry26.getLastModifiedDate();
        long long28 = zipArchiveEntry26.getTime();
        java.lang.String str29 = zipArchiveEntry26.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry31.getExtraFields();
        zipArchiveEntry26.setExtraFields(zipExtraFieldArray32);
        zipArchiveEntry17.setExtraFields(zipExtraFieldArray32);
        byte[] byteArray35 = zipArchiveEntry17.getLocalFileDataExtra();
        int int36 = zipArchiveEntry17.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry38.setPlatform(0);
        java.lang.String str41 = zipArchiveEntry38.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = zipArchiveEntry38.getExtraFields();
        zipArchiveEntry38.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry46.setExtra();
        zipArchiveEntry46.setTime(0L);
        zipArchiveEntry46.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime52 = zipArchiveEntry46.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry53 = zipArchiveEntry38.setCreationTime(fileTime52);
        java.util.zip.ZipEntry zipEntry54 = zipArchiveEntry17.setCreationTime(fileTime52);
        java.util.zip.ZipEntry zipEntry55 = zipArchiveEntry7.setLastAccessTime(fileTime52);
        byte[] byteArray56 = zipArchiveEntry7.getLocalFileDataExtra();
        int int57 = zipArchiveEntry7.getMethod();
        byte[] byteArray58 = zipArchiveEntry7.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray58);
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
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray23, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray32, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray42, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime52);
        org.junit.Assert.assertNotNull(zipEntry53);
        org.junit.Assert.assertEquals(zipEntry53.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry54);
        org.junit.Assert.assertEquals(zipEntry54.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry55);
        org.junit.Assert.assertEquals(zipEntry55.toString(), "");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry71 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry71.setExtra();
        zipArchiveEntry71.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry76 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry76.setExtra();
        byte[] byteArray78 = zipArchiveEntry76.getRawName();
        zipArchiveEntry76.setPlatform((int) (byte) 100);
        long long81 = zipArchiveEntry76.getSize();
        java.nio.file.attribute.FileTime fileTime82 = zipArchiveEntry76.getLastModifiedTime();
        long long83 = zipArchiveEntry76.getCrc();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit84 = zipArchiveEntry76.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry86 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry86.setExtra();
        zipArchiveEntry86.setTime(0L);
        zipArchiveEntry86.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime92 = zipArchiveEntry86.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry93 = zipArchiveEntry76.setCreationTime(fileTime92);
        java.util.zip.ZipEntry zipEntry94 = zipArchiveEntry71.setLastModifiedTime(fileTime92);
        java.util.zip.ZipEntry zipEntry95 = zipArchiveEntry55.setCreationTime(fileTime92);
        byte[] byteArray96 = zipArchiveEntry55.getExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray96);
        zipArchiveEntry1.setCrc((long) 0);
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
        org.junit.Assert.assertNull(byteArray57);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNull(zipExtraField69);
        org.junit.Assert.assertNull(byteArray78);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertNull(fileTime82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-1L) + "'", long83 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit84);
        org.junit.Assert.assertNotNull(fileTime92);
        org.junit.Assert.assertNotNull(zipEntry93);
        org.junit.Assert.assertEquals(zipEntry93.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry94);
        org.junit.Assert.assertEquals(zipEntry94.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry95);
        org.junit.Assert.assertEquals(zipEntry95.toString(), "");
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertArrayEquals(byteArray96, new byte[] {});
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        java.nio.file.attribute.FileTime fileTime21 = zipArchiveEntry1.getCreationTime();
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
        org.junit.Assert.assertNull(fileTime21);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getMethod();
        byte[] byteArray6 = zipArchiveEntry1.getExtra();
        java.util.Date date7 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        zipArchiveEntry1.setInternalAttributes(10);
        zipArchiveEntry1.setTime((long) (byte) 100);
        zipArchiveEntry1.setInternalAttributes((int) 'a');
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
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort33);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date22 = zipArchiveEntry21.getLastModifiedDate();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry21.setName("hi!", byteArray26);
        long long28 = zipArchiveEntry21.getSize();
        zipArchiveEntry21.setExternalAttributes((long) (byte) 100);
        byte[] byteArray31 = zipArchiveEntry21.getCentralDirectoryExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray31);
        zipArchiveEntry1.setMethod(3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date38 = zipArchiveEntry37.getLastModifiedDate();
        long long39 = zipArchiveEntry37.getTime();
        java.lang.String str40 = zipArchiveEntry37.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray43 = zipArchiveEntry42.getExtraFields();
        zipArchiveEntry37.setExtraFields(zipExtraFieldArray43);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date47 = zipArchiveEntry46.getLastModifiedDate();
        long long48 = zipArchiveEntry46.getTime();
        java.lang.String str49 = zipArchiveEntry46.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray52 = zipArchiveEntry51.getExtraFields();
        zipArchiveEntry46.setExtraFields(zipExtraFieldArray52);
        zipArchiveEntry37.setExtraFields(zipExtraFieldArray52);
        zipArchiveEntry37.setInternalAttributes(100);
        zipArchiveEntry37.setTime(0L);
        zipArchiveEntry37.setCompressedSize((long) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry62.setExtra();
        byte[] byteArray64 = zipArchiveEntry62.getRawName();
        zipArchiveEntry62.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime67 = zipArchiveEntry62.getLastModifiedTime();
        zipArchiveEntry62.setInternalAttributes(8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry72 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry72.setExtra();
        zipArchiveEntry72.setName("");
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry72.setName("", byteArray81);
        zipArchiveEntry62.setName("", byteArray81);
        zipArchiveEntry37.setCentralDirectoryExtra(byteArray81);
        zipArchiveEntry1.setName("hi!", byteArray81);
        zipArchiveEntry1.setSize((long) ' ');
        zipArchiveEntry1.setSize((long) 10);
        int int90 = zipArchiveEntry1.getPlatform();
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
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(zipExtraFieldArray43);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray43, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(zipExtraFieldArray52);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray52, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray64);
        org.junit.Assert.assertNull(fileTime67);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        int int5 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setExternalAttributes((long) 10);
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getCreationTime();
        long long9 = zipArchiveEntry1.getCrc();
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        long long4 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setPlatform((int) (byte) -1);
        byte[] byteArray7 = zipArchiveEntry1.getRawName();
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        int int7 = zipArchiveEntry1.getMethod();
        java.lang.String str8 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry10.getLastModifiedTime();
        boolean boolean14 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date17 = zipArchiveEntry16.getLastModifiedDate();
        long long18 = zipArchiveEntry16.getTime();
        java.lang.String str19 = zipArchiveEntry16.getComment();
        zipArchiveEntry16.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray22 = zipArchiveEntry16.getExtraFields();
        byte[] byteArray23 = zipArchiveEntry16.getLocalFileDataExtra();
        boolean boolean24 = zipArchiveEntry1.equals((java.lang.Object) byteArray23);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = zipArchiveEntry1.getExtraFields(false);
        zipArchiveEntry1.setMethod((int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry30.setExtra();
        byte[] byteArray32 = zipArchiveEntry30.getRawName();
        zipArchiveEntry30.setPlatform((int) (byte) 100);
        long long35 = zipArchiveEntry30.getSize();
        long long36 = zipArchiveEntry30.getTime();
        boolean boolean37 = zipArchiveEntry30.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort38 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField39 = zipArchiveEntry30.getExtraField(zipShort38);
        java.lang.String str40 = zipArchiveEntry30.getName();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField42 = zipArchiveEntry30.getExtraField(zipShort41);
        boolean boolean43 = zipArchiveEntry1.equals((java.lang.Object) zipShort41);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray45 = zipArchiveEntry1.getExtraFields(false);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(zipExtraFieldArray22);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray22, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray26, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(zipExtraField39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(zipExtraField42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray45);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray45, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry9.getLastAccessTime();
        int int11 = zipArchiveEntry9.getMethod();
        zipArchiveEntry9.setInternalAttributes(0);
        java.util.Date date14 = zipArchiveEntry9.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry16.setPlatform(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date21 = zipArchiveEntry20.getLastModifiedDate();
        long long22 = zipArchiveEntry20.getTime();
        java.lang.String str23 = zipArchiveEntry20.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = zipArchiveEntry25.getExtraFields();
        zipArchiveEntry20.setExtraFields(zipExtraFieldArray26);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date30 = zipArchiveEntry29.getLastModifiedDate();
        long long31 = zipArchiveEntry29.getTime();
        java.lang.String str32 = zipArchiveEntry29.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = zipArchiveEntry34.getExtraFields();
        zipArchiveEntry29.setExtraFields(zipExtraFieldArray35);
        zipArchiveEntry20.setExtraFields(zipExtraFieldArray35);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setExtra();
        byte[] byteArray41 = zipArchiveEntry39.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date44 = zipArchiveEntry43.getLastModifiedDate();
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry43.setName("hi!", byteArray48);
        zipArchiveEntry39.setExtra(byteArray48);
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry39.setCentralDirectoryExtra(byteArray55);
        zipArchiveEntry20.setCentralDirectoryExtra(byteArray55);
        java.lang.String str58 = zipArchiveEntry20.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry60.setExtra();
        zipArchiveEntry60.setTime(0L);
        zipArchiveEntry60.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime66 = zipArchiveEntry60.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry67 = zipArchiveEntry20.setLastModifiedTime(fileTime66);
        java.util.zip.ZipEntry zipEntry68 = zipArchiveEntry16.setLastAccessTime(fileTime66);
        java.util.zip.ZipEntry zipEntry69 = zipArchiveEntry9.setLastModifiedTime(fileTime66);
        java.util.zip.ZipEntry zipEntry70 = zipArchiveEntry1.setLastAccessTime(fileTime66);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray26, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray35, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray41);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(fileTime66);
        org.junit.Assert.assertNotNull(zipEntry67);
        org.junit.Assert.assertEquals(zipEntry67.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry68);
        org.junit.Assert.assertEquals(zipEntry68.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry69);
        org.junit.Assert.assertEquals(zipEntry69.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry70);
        org.junit.Assert.assertEquals(zipEntry70.toString(), "");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setExternalAttributes((long) 10);
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setExtra();
        byte[] byteArray12 = zipArchiveEntry10.getRawName();
        zipArchiveEntry10.setPlatform((int) (byte) 100);
        zipArchiveEntry10.setExternalAttributes((long) 10);
        long long17 = zipArchiveEntry10.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry19.setExtra();
        zipArchiveEntry19.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry24.setName("hi!", byteArray29);
        zipArchiveEntry19.setCentralDirectoryExtra(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry33.setExtra();
        byte[] byteArray35 = zipArchiveEntry33.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date38 = zipArchiveEntry37.getLastModifiedDate();
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry37.setName("hi!", byteArray42);
        zipArchiveEntry33.setExtra(byteArray42);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry33.setCentralDirectoryExtra(byteArray49);
        zipArchiveEntry33.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData53 = zipArchiveEntry33.getUnparseableExtraFieldData();
        zipArchiveEntry19.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData53);
        zipArchiveEntry10.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData53);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData53);
        int int57 = zipArchiveEntry1.getInternalAttributes();
        java.lang.String str58 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime59 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray35);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(fileTime59);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit30 = zipArchiveEntry29.getGeneralPurposeBit();
        int int31 = zipArchiveEntry29.getMethod();
        zipArchiveEntry29.setCompressedSize((long) (-1));
        zipArchiveEntry29.setExternalAttributes((long) 'a');
        zipArchiveEntry29.setCompressedSize((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit40 = zipArchiveEntry39.getGeneralPurposeBit();
        zipArchiveEntry39.setTime((long) (byte) 10);
        long long43 = zipArchiveEntry39.getCrc();
        zipArchiveEntry39.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData46 = zipArchiveEntry39.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime47 = zipArchiveEntry39.getTimeLocal();
        zipArchiveEntry29.setTimeLocal(localDateTime47);
        zipArchiveEntry1.setTimeLocal(localDateTime47);
        long long50 = zipArchiveEntry1.getCompressedSize();
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
        org.junit.Assert.assertNotNull(generalPurposeBit30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(generalPurposeBit40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        long long5 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        byte[] byteArray9 = zipArchiveEntry7.getRawName();
        zipArchiveEntry7.setPlatform((int) (byte) 100);
        long long12 = zipArchiveEntry7.getSize();
        long long13 = zipArchiveEntry7.getTime();
        zipArchiveEntry7.setTime(10L);
        zipArchiveEntry7.setMethod((int) '#');
        zipArchiveEntry7.setMethod(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date22 = zipArchiveEntry21.getLastModifiedDate();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry21.setName("hi!", byteArray26);
        long long28 = zipArchiveEntry21.getSize();
        zipArchiveEntry21.setExternalAttributes((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit31 = zipArchiveEntry21.getGeneralPurposeBit();
        zipArchiveEntry7.setGeneralPurposeBit(generalPurposeBit31);
        boolean boolean33 = zipArchiveEntry1.equals((java.lang.Object) generalPurposeBit31);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setExternalAttributes((long) 10);
        long long8 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData9 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit13 = zipArchiveEntry12.getGeneralPurposeBit();
        zipArchiveEntry12.setTime((long) (byte) 10);
        long long16 = zipArchiveEntry12.getCrc();
        zipArchiveEntry12.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData19 = zipArchiveEntry12.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime20 = zipArchiveEntry12.getTimeLocal();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry22.setExtra();
        byte[] byteArray24 = zipArchiveEntry22.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date27 = zipArchiveEntry26.getLastModifiedDate();
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry26.setName("hi!", byteArray31);
        zipArchiveEntry22.setExtra(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = zipArchiveEntry22.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry38.setExtra();
        byte[] byteArray40 = zipArchiveEntry38.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date43 = zipArchiveEntry42.getLastModifiedDate();
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry42.setName("hi!", byteArray47);
        zipArchiveEntry38.setExtra(byteArray47);
        long long50 = zipArchiveEntry38.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort51 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField52 = zipArchiveEntry38.getExtraField(zipShort51);
        int int53 = zipArchiveEntry38.getUnixMode();
        int int54 = zipArchiveEntry38.getPlatform();
        byte[] byteArray55 = zipArchiveEntry38.getLocalFileDataExtra();
        zipArchiveEntry22.setName("hi!", byteArray55);
        zipArchiveEntry12.setExtra(byteArray55);
        zipArchiveEntry1.setName("", byteArray55);
        boolean boolean59 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData9);
        org.junit.Assert.assertNotNull(generalPurposeBit13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray35, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray40);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNull(zipExtraField52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setExternalAttributes((long) 1);
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setPlatform(100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry1.getExtraFields();
        boolean boolean13 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit16 = zipArchiveEntry15.getGeneralPurposeBit();
        long long17 = zipArchiveEntry15.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry15.getExtraFields();
        byte[] byteArray19 = zipArchiveEntry15.getLocalFileDataExtra();
        java.lang.Object obj20 = zipArchiveEntry15.clone();
        java.nio.file.attribute.FileTime fileTime21 = zipArchiveEntry15.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit24 = zipArchiveEntry23.getGeneralPurposeBit();
        long long25 = zipArchiveEntry23.getCrc();
        long long26 = zipArchiveEntry23.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit29 = zipArchiveEntry28.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry31.setExtra();
        byte[] byteArray33 = zipArchiveEntry31.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date36 = zipArchiveEntry35.getLastModifiedDate();
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry35.setName("hi!", byteArray40);
        zipArchiveEntry31.setExtra(byteArray40);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry31.setCentralDirectoryExtra(byteArray47);
        zipArchiveEntry31.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData51 = zipArchiveEntry31.getUnparseableExtraFieldData();
        zipArchiveEntry28.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData51);
        zipArchiveEntry23.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData51);
        zipArchiveEntry15.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData51);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData51);
        long long56 = zipArchiveEntry1.getExternalAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray12, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray18, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNull(fileTime21);
        org.junit.Assert.assertNotNull(generalPurposeBit24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit29);
        org.junit.Assert.assertNull(byteArray33);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData51);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setMethod((int) (byte) 0);
        long long7 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setUnixMode((int) '4');
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit10 = zipArchiveEntry1.getGeneralPurposeBit();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit10);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry24.setExtra();
        byte[] byteArray26 = zipArchiveEntry24.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date29 = zipArchiveEntry28.getLastModifiedDate();
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry28.setName("hi!", byteArray33);
        zipArchiveEntry24.setExtra(byteArray33);
        zipArchiveEntry1.setExtra(byteArray33);
        long long37 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setCompressedSize((long) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry42.setPlatform(0);
        zipArchiveEntry42.setTime((long) (short) -1);
        byte[] byteArray47 = zipArchiveEntry42.getCentralDirectoryExtra();
        zipArchiveEntry1.setName("", byteArray47);
        long long49 = zipArchiveEntry1.getTime();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField22);
        org.junit.Assert.assertNull(byteArray26);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData20 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime21 = zipArchiveEntry1.getCreationTime();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(generalPurposeBit19);
        org.junit.Assert.assertNull(unparseableExtraFieldData20);
        org.junit.Assert.assertNull(fileTime21);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit5 = zipArchiveEntry4.getGeneralPurposeBit();
        byte[] byteArray6 = zipArchiveEntry4.getRawName();
        long long7 = zipArchiveEntry4.getExternalAttributes();
        boolean boolean8 = zipArchiveEntry1.equals((java.lang.Object) long7);
        zipArchiveEntry1.setComment("");
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(generalPurposeBit5);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        zipArchiveEntry1.setCrc((long) 8);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        int int7 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setExternalAttributes((long) 'a');
        byte[] byteArray10 = zipArchiveEntry1.getExtra();
        byte[] byteArray11 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setName("");
        java.lang.Object obj16 = zipArchiveEntry13.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry13.getExtraFields(true);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = zipArchiveEntry13.getExtraFields(false);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray20);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setPlatform(0);
        zipArchiveEntry23.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setExtra();
        zipArchiveEntry28.setTime(0L);
        java.nio.file.attribute.FileTime fileTime32 = zipArchiveEntry28.getLastAccessTime();
        zipArchiveEntry28.setExternalAttributes((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setExtra();
        byte[] byteArray38 = zipArchiveEntry36.getRawName();
        zipArchiveEntry36.setPlatform((int) (byte) 100);
        long long41 = zipArchiveEntry36.getSize();
        java.nio.file.attribute.FileTime fileTime42 = zipArchiveEntry36.getLastModifiedTime();
        long long43 = zipArchiveEntry36.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort44 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField45 = zipArchiveEntry36.getExtraField(zipShort44);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit48 = zipArchiveEntry47.getGeneralPurposeBit();
        long long49 = zipArchiveEntry47.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray50 = zipArchiveEntry47.getExtraFields();
        zipArchiveEntry36.setExtraFields(zipExtraFieldArray50);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort52 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField53 = zipArchiveEntry36.getExtraField(zipShort52);
        zipArchiveEntry36.setUnixMode((int) '4');
        long long56 = zipArchiveEntry36.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry58.setPlatform(0);
        java.lang.String str61 = zipArchiveEntry58.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray62 = zipArchiveEntry58.getExtraFields();
        zipArchiveEntry58.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry66 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry66.setExtra();
        zipArchiveEntry66.setTime(0L);
        zipArchiveEntry66.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime72 = zipArchiveEntry66.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry73 = zipArchiveEntry58.setCreationTime(fileTime72);
        java.util.zip.ZipEntry zipEntry74 = zipArchiveEntry36.setLastAccessTime(fileTime72);
        java.util.zip.ZipEntry zipEntry75 = zipArchiveEntry28.setLastAccessTime(fileTime72);
        java.util.zip.ZipEntry zipEntry76 = zipArchiveEntry23.setLastModifiedTime(fileTime72);
        java.util.zip.ZipEntry zipEntry77 = zipArchiveEntry1.setLastAccessTime(fileTime72);
        zipEntry77.setCrc(32L);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray18, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray20, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime32);
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNull(fileTime42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNull(zipExtraField45);
        org.junit.Assert.assertNotNull(generalPurposeBit48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray50);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray50, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(zipExtraFieldArray62);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray62, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime72);
        org.junit.Assert.assertNotNull(zipEntry73);
        org.junit.Assert.assertEquals(zipEntry73.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry74);
        org.junit.Assert.assertEquals(zipEntry74.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry75);
        org.junit.Assert.assertEquals(zipEntry75.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry76);
        org.junit.Assert.assertEquals(zipEntry76.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry77);
        org.junit.Assert.assertEquals(zipEntry77.toString(), "");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        long long4 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setExternalAttributes((long) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date10 = zipArchiveEntry9.getLastModifiedDate();
        long long11 = zipArchiveEntry9.getTime();
        java.lang.String str12 = zipArchiveEntry9.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry14.getExtraFields();
        zipArchiveEntry9.setExtraFields(zipExtraFieldArray15);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date19 = zipArchiveEntry18.getLastModifiedDate();
        long long20 = zipArchiveEntry18.getTime();
        java.lang.String str21 = zipArchiveEntry18.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = zipArchiveEntry23.getExtraFields();
        zipArchiveEntry18.setExtraFields(zipExtraFieldArray24);
        zipArchiveEntry9.setExtraFields(zipExtraFieldArray24);
        zipArchiveEntry9.setInternalAttributes(100);
        zipArchiveEntry9.setTime(0L);
        zipArchiveEntry9.setCompressedSize((long) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry34.setExtra();
        byte[] byteArray36 = zipArchiveEntry34.getRawName();
        zipArchiveEntry34.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime39 = zipArchiveEntry34.getLastModifiedTime();
        zipArchiveEntry34.setInternalAttributes(8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry44.setExtra();
        zipArchiveEntry44.setName("");
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry44.setName("", byteArray53);
        zipArchiveEntry34.setName("", byteArray53);
        zipArchiveEntry9.setCentralDirectoryExtra(byteArray53);
        zipArchiveEntry1.setName("", byteArray53);
        long long58 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry60.setExtra();
        zipArchiveEntry60.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray64 = zipArchiveEntry60.getExtraFields();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit65 = zipArchiveEntry60.getGeneralPurposeBit();
        zipArchiveEntry60.setCrc((long) (byte) 1);
        boolean boolean68 = zipArchiveEntry1.equals((java.lang.Object) (byte) 1);
        zipArchiveEntry1.setSize((long) (byte) 0);
        long long71 = zipArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray15, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray24, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertNull(fileTime39);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10L + "'", long58 == 10L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray64);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray64, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date17 = zipArchiveEntry16.getLastModifiedDate();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry16.setName("hi!", byteArray21);
        zipArchiveEntry1.setName("", byteArray21);
        zipArchiveEntry1.setExtra();
        int int25 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setComment("");
        java.lang.String str28 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        long long9 = zipArchiveEntry1.getCompressedSize();
        java.lang.String str10 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setExternalAttributes(1L);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        java.lang.String str23 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry25.setPlatform(0);
        java.lang.String str28 = zipArchiveEntry25.getComment();
        java.nio.file.attribute.FileTime fileTime29 = zipArchiveEntry25.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit32 = zipArchiveEntry31.getGeneralPurposeBit();
        int int33 = zipArchiveEntry31.getMethod();
        long long34 = zipArchiveEntry31.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry37.setExtra();
        zipArchiveEntry37.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date43 = zipArchiveEntry42.getLastModifiedDate();
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry42.setName("hi!", byteArray47);
        zipArchiveEntry37.setCentralDirectoryExtra(byteArray47);
        zipArchiveEntry31.setName("hi!", byteArray47);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort51 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField52 = zipArchiveEntry31.getExtraField(zipShort51);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry54.setExtra();
        byte[] byteArray56 = zipArchiveEntry54.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date59 = zipArchiveEntry58.getLastModifiedDate();
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry58.setName("hi!", byteArray63);
        zipArchiveEntry54.setExtra(byteArray63);
        zipArchiveEntry31.setExtra(byteArray63);
        byte[] byteArray67 = zipArchiveEntry31.getExtra();
        zipArchiveEntry25.setExtra(byteArray67);
        zipArchiveEntry25.setInternalAttributes(1);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit71 = zipArchiveEntry25.getGeneralPurposeBit();
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit71);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(fileTime29);
        org.junit.Assert.assertNotNull(generalPurposeBit32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField52);
        org.junit.Assert.assertNull(byteArray56);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit71);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = zipArchiveEntry1.getExtraFields(true);
        java.lang.String str21 = zipArchiveEntry1.getComment();
        boolean boolean22 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        zipArchiveEntry23.setComment("hi!");
        zipArchiveEntry23.setSize((long) (short) 100);
        int int28 = zipArchiveEntry23.getUnixMode();
        boolean boolean29 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry23);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField31 = zipArchiveEntry23.getExtraField(zipShort30);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(zipExtraField31);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        int int7 = zipArchiveEntry1.getMethod();
        java.lang.String str8 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry10.getLastModifiedTime();
        boolean boolean14 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry10);
        long long15 = zipArchiveEntry10.getCompressedSize();
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        zipArchiveEntry1.setCompressedSize(8L);
        zipArchiveEntry1.setUnixMode((int) (short) 10);
        zipArchiveEntry1.setMethod(8);
        int int15 = zipArchiveEntry1.getMethod();
        java.lang.String str16 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry6.setExtra();
        byte[] byteArray8 = zipArchiveEntry6.getRawName();
        zipArchiveEntry6.setPlatform((int) (byte) 100);
        long long11 = zipArchiveEntry6.getSize();
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry6.getLastModifiedTime();
        long long13 = zipArchiveEntry6.getCrc();
        java.lang.String str14 = zipArchiveEntry6.getComment();
        byte[] byteArray15 = zipArchiveEntry6.getCentralDirectoryExtra();
        zipArchiveEntry1.setExtra(byteArray15);
        zipArchiveEntry1.setExternalAttributes((long) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date21 = zipArchiveEntry20.getLastModifiedDate();
        long long22 = zipArchiveEntry20.getTime();
        java.lang.String str23 = zipArchiveEntry20.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = zipArchiveEntry25.getExtraFields();
        zipArchiveEntry20.setExtraFields(zipExtraFieldArray26);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date30 = zipArchiveEntry29.getLastModifiedDate();
        long long31 = zipArchiveEntry29.getTime();
        java.lang.String str32 = zipArchiveEntry29.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = zipArchiveEntry34.getExtraFields();
        zipArchiveEntry29.setExtraFields(zipExtraFieldArray35);
        zipArchiveEntry20.setExtraFields(zipExtraFieldArray35);
        zipArchiveEntry20.setInternalAttributes(100);
        zipArchiveEntry20.setTime(0L);
        zipArchiveEntry20.setCompressedSize((long) 100);
        java.nio.file.attribute.FileTime fileTime44 = zipArchiveEntry20.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry46.setExtra();
        byte[] byteArray48 = zipArchiveEntry46.getRawName();
        zipArchiveEntry46.setPlatform((int) (byte) 100);
        long long51 = zipArchiveEntry46.getSize();
        java.nio.file.attribute.FileTime fileTime52 = zipArchiveEntry46.getLastModifiedTime();
        long long53 = zipArchiveEntry46.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort54 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField55 = zipArchiveEntry46.getExtraField(zipShort54);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit58 = zipArchiveEntry57.getGeneralPurposeBit();
        long long59 = zipArchiveEntry57.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray60 = zipArchiveEntry57.getExtraFields();
        zipArchiveEntry46.setExtraFields(zipExtraFieldArray60);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort62 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField63 = zipArchiveEntry46.getExtraField(zipShort62);
        zipArchiveEntry46.setUnixMode((int) '4');
        long long66 = zipArchiveEntry46.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry68 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry68.setPlatform(0);
        java.lang.String str71 = zipArchiveEntry68.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray72 = zipArchiveEntry68.getExtraFields();
        zipArchiveEntry68.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry76 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry76.setExtra();
        zipArchiveEntry76.setTime(0L);
        zipArchiveEntry76.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime82 = zipArchiveEntry76.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry68.setCreationTime(fileTime82);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry46.setLastAccessTime(fileTime82);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry20.setLastModifiedTime(fileTime82);
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry1.setLastAccessTime(fileTime82);
        java.lang.Object obj87 = zipArchiveEntry1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry88 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray26, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray35, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime44);
        org.junit.Assert.assertNull(byteArray48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertNull(fileTime52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNull(zipExtraField55);
        org.junit.Assert.assertNotNull(generalPurposeBit58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray60);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray60, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(zipExtraFieldArray72);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray72, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime82);
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry86);
        org.junit.Assert.assertEquals(zipEntry86.toString(), "");
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertEquals(obj87.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj87), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj87), "");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        long long9 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setExtra();
        zipArchiveEntry11.setTime(0L);
        zipArchiveEntry11.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry11.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry18 = zipArchiveEntry1.setLastAccessTime(fileTime17);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = zipEntry18.getTimeLocal();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 15");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(fileTime17);
        org.junit.Assert.assertNotNull(zipEntry18);
        org.junit.Assert.assertEquals(zipEntry18.toString(), "");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date7 = zipArchiveEntry6.getLastModifiedDate();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry6.setName("hi!", byteArray11);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray11);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry1.getExtraFields(true);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray15, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        zipArchiveEntry1.setCrc((long) (byte) 100);
        byte[] byteArray7 = zipArchiveEntry1.getLocalFileDataExtra();
        java.lang.String str8 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date15 = zipArchiveEntry14.getLastModifiedDate();
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry14.setName("hi!", byteArray19);
        zipArchiveEntry11.setExtra(byteArray19);
        long long22 = zipArchiveEntry11.getCompressedSize();
        boolean boolean23 = zipArchiveEntry11.isDirectory();
        java.util.Date date24 = zipArchiveEntry11.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData25 = zipArchiveEntry11.getUnparseableExtraFieldData();
        java.lang.String str26 = zipArchiveEntry11.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData30 = zipArchiveEntry28.getUnparseableExtraFieldData();
        java.lang.Object obj31 = zipArchiveEntry28.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry28.getExtraFields();
        zipArchiveEntry11.setExtraFields(zipExtraFieldArray32);
        boolean boolean34 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry11);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray9, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(unparseableExtraFieldData25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(unparseableExtraFieldData30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray32, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        boolean boolean8 = zipArchiveEntry1.isDirectory();
        long long9 = zipArchiveEntry1.getCompressedSize();
        java.lang.Object obj10 = zipArchiveEntry1.clone();
        int int11 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setPlatform((int) (short) 1);
        java.lang.String str16 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        long long4 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry6.getLastAccessTime();
        zipArchiveEntry6.setName("");
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry6.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry6.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit15 = zipArchiveEntry14.getGeneralPurposeBit();
        long long16 = zipArchiveEntry14.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = zipArchiveEntry14.getExtraFields();
        byte[] byteArray18 = zipArchiveEntry14.getLocalFileDataExtra();
        java.lang.Object obj19 = zipArchiveEntry14.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry21.setExtra();
        byte[] byteArray23 = zipArchiveEntry21.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date26 = zipArchiveEntry25.getLastModifiedDate();
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry25.setName("hi!", byteArray30);
        zipArchiveEntry21.setExtra(byteArray30);
        long long33 = zipArchiveEntry21.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date37 = zipArchiveEntry36.getLastModifiedDate();
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry36.setName("hi!", byteArray41);
        zipArchiveEntry21.setName("", byteArray41);
        byte[] byteArray44 = zipArchiveEntry21.getLocalFileDataExtra();
        zipArchiveEntry14.setCentralDirectoryExtra(byteArray44);
        byte[] byteArray46 = zipArchiveEntry14.getCentralDirectoryExtra();
        byte[] byteArray47 = zipArchiveEntry14.getExtra();
        zipArchiveEntry6.setCentralDirectoryExtra(byteArray47);
        zipArchiveEntry1.setExtra(byteArray47);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray51 = zipArchiveEntry1.getExtraFields(true);
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setComment("hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray12, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray17, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray51);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray51, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        int int4 = zipArchiveEntry1.getInternalAttributes();
        long long5 = zipArchiveEntry1.getCrc();
        long long6 = zipArchiveEntry1.getTime();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setMethod((int) '#');
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry71 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry71.setExtra();
        zipArchiveEntry71.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry76 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry76.setExtra();
        byte[] byteArray78 = zipArchiveEntry76.getRawName();
        zipArchiveEntry76.setPlatform((int) (byte) 100);
        long long81 = zipArchiveEntry76.getSize();
        java.nio.file.attribute.FileTime fileTime82 = zipArchiveEntry76.getLastModifiedTime();
        long long83 = zipArchiveEntry76.getCrc();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit84 = zipArchiveEntry76.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry86 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry86.setExtra();
        zipArchiveEntry86.setTime(0L);
        zipArchiveEntry86.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime92 = zipArchiveEntry86.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry93 = zipArchiveEntry76.setCreationTime(fileTime92);
        java.util.zip.ZipEntry zipEntry94 = zipArchiveEntry71.setLastModifiedTime(fileTime92);
        java.util.zip.ZipEntry zipEntry95 = zipArchiveEntry55.setCreationTime(fileTime92);
        byte[] byteArray96 = zipArchiveEntry55.getExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray96);
        zipArchiveEntry1.setTime((long) (byte) 1);
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
        org.junit.Assert.assertNull(byteArray57);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNull(zipExtraField69);
        org.junit.Assert.assertNull(byteArray78);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-1L) + "'", long81 == (-1L));
        org.junit.Assert.assertNull(fileTime82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-1L) + "'", long83 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit84);
        org.junit.Assert.assertNotNull(fileTime92);
        org.junit.Assert.assertNotNull(zipEntry93);
        org.junit.Assert.assertEquals(zipEntry93.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry94);
        org.junit.Assert.assertEquals(zipEntry94.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry95);
        org.junit.Assert.assertEquals(zipEntry95.toString(), "");
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertArrayEquals(byteArray96, new byte[] {});
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        byte[] byteArray27 = zipArchiveEntry1.getExtra();
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
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        int int3 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setPlatform((int) (byte) -1);
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = zipArchiveEntry8.getGeneralPurposeBit();
        long long10 = zipArchiveEntry8.getCrc();
        long long11 = zipArchiveEntry8.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit14 = zipArchiveEntry13.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry16.setExtra();
        byte[] byteArray18 = zipArchiveEntry16.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date21 = zipArchiveEntry20.getLastModifiedDate();
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry20.setName("hi!", byteArray25);
        zipArchiveEntry16.setExtra(byteArray25);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry16.setCentralDirectoryExtra(byteArray32);
        zipArchiveEntry16.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData36 = zipArchiveEntry16.getUnparseableExtraFieldData();
        zipArchiveEntry13.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData36);
        zipArchiveEntry8.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData36);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData36);
        zipArchiveEntry1.setExternalAttributes((long) 0);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(generalPurposeBit9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit14);
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData36);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setCrc((long) 1);
        int int7 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setComment("");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = zipArchiveEntry1.getExtraField(zipShort10);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(zipExtraField11);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        zipArchiveEntry1.setTime((long) (short) 100);
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
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setExternalAttributes((long) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry9.setExtra(byteArray17);
        long long20 = zipArchiveEntry9.getCompressedSize();
        boolean boolean21 = zipArchiveEntry9.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setExtra();
        byte[] byteArray25 = zipArchiveEntry23.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date28 = zipArchiveEntry27.getLastModifiedDate();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry27.setName("hi!", byteArray32);
        zipArchiveEntry23.setExtra(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray36 = zipArchiveEntry23.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = zipArchiveEntry23.getExtraFields(true);
        zipArchiveEntry9.setExtraFields(zipExtraFieldArray38);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray38);
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setInternalAttributes(100);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort44 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort44);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(byteArray25);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray36);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray36, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray38, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        java.lang.String str19 = zipArchiveEntry1.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setExtra();
        zipArchiveEntry17.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry22.setExtra();
        byte[] byteArray24 = zipArchiveEntry22.getRawName();
        zipArchiveEntry22.setPlatform((int) (byte) 100);
        long long27 = zipArchiveEntry22.getSize();
        java.nio.file.attribute.FileTime fileTime28 = zipArchiveEntry22.getLastModifiedTime();
        long long29 = zipArchiveEntry22.getCrc();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit30 = zipArchiveEntry22.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setExtra();
        zipArchiveEntry32.setTime(0L);
        zipArchiveEntry32.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime38 = zipArchiveEntry32.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry39 = zipArchiveEntry22.setCreationTime(fileTime38);
        java.util.zip.ZipEntry zipEntry40 = zipArchiveEntry17.setLastModifiedTime(fileTime38);
        java.util.zip.ZipEntry zipEntry41 = zipArchiveEntry1.setCreationTime(fileTime38);
        byte[] byteArray42 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNull(fileTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit30);
        org.junit.Assert.assertNotNull(fileTime38);
        org.junit.Assert.assertNotNull(zipEntry39);
        org.junit.Assert.assertEquals(zipEntry39.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry40);
        org.junit.Assert.assertEquals(zipEntry40.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry41);
        org.junit.Assert.assertEquals(zipEntry41.toString(), "");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setPlatform((int) ' ');
        zipArchiveEntry1.setExternalAttributes(0L);
        byte[] byteArray8 = zipArchiveEntry1.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime9 = zipArchiveEntry1.getTimeLocal();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 15");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit7 = zipArchiveEntry6.getGeneralPurposeBit();
        int int8 = zipArchiveEntry6.getMethod();
        long long9 = zipArchiveEntry6.getCompressedSize();
        zipArchiveEntry6.setMethod((int) (byte) 0);
        zipArchiveEntry6.setTime(1L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date20 = zipArchiveEntry19.getLastModifiedDate();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry19.setName("hi!", byteArray24);
        zipArchiveEntry15.setExtra(byteArray24);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = zipArchiveEntry15.getExtraFields(false);
        long long29 = zipArchiveEntry15.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date32 = zipArchiveEntry31.getLastModifiedDate();
        long long33 = zipArchiveEntry31.getTime();
        java.lang.String str34 = zipArchiveEntry31.getComment();
        long long35 = zipArchiveEntry31.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry37.setExtra();
        byte[] byteArray39 = zipArchiveEntry37.getRawName();
        zipArchiveEntry37.setPlatform((int) (byte) 100);
        zipArchiveEntry37.setExternalAttributes((long) 10);
        long long44 = zipArchiveEntry37.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry46.setExtra();
        zipArchiveEntry46.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date52 = zipArchiveEntry51.getLastModifiedDate();
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry51.setName("hi!", byteArray56);
        zipArchiveEntry46.setCentralDirectoryExtra(byteArray56);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry60.setExtra();
        byte[] byteArray62 = zipArchiveEntry60.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date65 = zipArchiveEntry64.getLastModifiedDate();
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry64.setName("hi!", byteArray69);
        zipArchiveEntry60.setExtra(byteArray69);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry60.setCentralDirectoryExtra(byteArray76);
        zipArchiveEntry60.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData80 = zipArchiveEntry60.getUnparseableExtraFieldData();
        zipArchiveEntry46.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData80);
        zipArchiveEntry37.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData80);
        zipArchiveEntry31.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData80);
        zipArchiveEntry15.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData80);
        zipArchiveEntry6.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData80);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData80);
        org.junit.Assert.assertNotNull(generalPurposeBit7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray28, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(byteArray39);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray62);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData80);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        java.lang.Object obj3 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setSize((long) 3);
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastAccessTime();
        byte[] byteArray7 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        java.lang.Object obj3 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setSize((long) 3);
        long long6 = zipArchiveEntry1.getCrc();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry1.setName("hi!", byteArray6);
        long long8 = zipArchiveEntry1.getSize();
        java.lang.String str9 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = zipArchiveEntry1.getExtraFields(true);
        byte[] byteArray12 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) -1);
        zipArchiveEntry1.setInternalAttributes(10);
        java.lang.Object obj17 = zipArchiveEntry1.clone();
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
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setUnixMode((int) ' ');
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setUnixMode((int) (short) 100);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData7 = zipArchiveEntry1.getUnparseableExtraFieldData();
        int int8 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray9 = zipArchiveEntry1.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = zipArchiveEntry1.getExtraField(zipShort10);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(unparseableExtraFieldData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNull(zipExtraField11);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry1.setName("hi!", byteArray6);
        long long8 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setExternalAttributes((long) (byte) 100);
        byte[] byteArray11 = zipArchiveEntry1.getCentralDirectoryExtra();
        long long12 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        zipArchiveEntry1.setInternalAttributes(0);
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
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        byte[] byteArray18 = zipArchiveEntry1.getLocalFileDataExtra();
        java.util.Date date19 = zipArchiveEntry1.getLastModifiedDate();
        long long20 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setExternalAttributes((long) (byte) 1);
        java.lang.Object obj8 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry1.getExtraFields(false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        long long17 = zipArchiveEntry1.getCompressedSize();
        java.util.Date date18 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        byte[] byteArray22 = zipArchiveEntry20.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry24.setName("hi!", byteArray29);
        zipArchiveEntry20.setExtra(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray33 = zipArchiveEntry20.getExtraFields(false);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray33);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray36 = zipArchiveEntry1.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime39 = zipArchiveEntry38.getLastAccessTime();
        long long40 = zipArchiveEntry38.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry42.setExtra();
        byte[] byteArray44 = zipArchiveEntry42.getRawName();
        zipArchiveEntry42.setPlatform((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry49 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry49.setExtra();
        byte[] byteArray51 = zipArchiveEntry49.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date54 = zipArchiveEntry53.getLastModifiedDate();
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry53.setName("hi!", byteArray58);
        zipArchiveEntry49.setExtra(byteArray58);
        long long61 = zipArchiveEntry49.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date65 = zipArchiveEntry64.getLastModifiedDate();
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry64.setName("hi!", byteArray69);
        zipArchiveEntry49.setName("", byteArray69);
        zipArchiveEntry42.setName("hi!", byteArray69);
        zipArchiveEntry38.setCentralDirectoryExtra(byteArray69);
        zipArchiveEntry38.setExtra();
        long long75 = zipArchiveEntry38.getTime();
        zipArchiveEntry38.setCompressedSize((long) (short) 0);
        byte[] byteArray78 = zipArchiveEntry38.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray78);
        java.nio.file.attribute.FileTime fileTime80 = zipArchiveEntry1.getCreationTime();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray33);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray33, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray36);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray36, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNull(byteArray44);
        org.junit.Assert.assertNull(byteArray51);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L) + "'", long75 == (-1L));
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
        org.junit.Assert.assertNull(fileTime80);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry1.setName("hi!", byteArray6);
        long long8 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setExternalAttributes((long) (byte) 100);
        byte[] byteArray11 = zipArchiveEntry1.getCentralDirectoryExtra();
        long long12 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        int int15 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setTime((long) (short) -1);
        byte[] byteArray6 = zipArchiveEntry1.getCentralDirectoryExtra();
        byte[] byteArray7 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setSize((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit10 = zipArchiveEntry1.getGeneralPurposeBit();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNotNull(generalPurposeBit10);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit5 = zipArchiveEntry4.getGeneralPurposeBit();
        byte[] byteArray6 = zipArchiveEntry4.getRawName();
        long long7 = zipArchiveEntry4.getExternalAttributes();
        boolean boolean8 = zipArchiveEntry1.equals((java.lang.Object) long7);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData9 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = zipArchiveEntry1.getExtraField(zipShort10);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(generalPurposeBit5);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData9);
        org.junit.Assert.assertNull(zipExtraField11);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        byte[] byteArray24 = zipArchiveEntry22.getRawName();
        zipArchiveEntry22.setPlatform((int) (byte) 100);
        long long27 = zipArchiveEntry22.getTime();
        java.util.Date date28 = zipArchiveEntry22.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry30.setExtra();
        byte[] byteArray32 = zipArchiveEntry30.getRawName();
        zipArchiveEntry30.setPlatform((int) (byte) 100);
        zipArchiveEntry30.setExternalAttributes((long) 10);
        long long37 = zipArchiveEntry30.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setExtra();
        byte[] byteArray41 = zipArchiveEntry39.getRawName();
        zipArchiveEntry39.setPlatform((int) (byte) 100);
        zipArchiveEntry39.setExternalAttributes((long) 10);
        long long46 = zipArchiveEntry39.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry48.setExtra();
        zipArchiveEntry48.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date54 = zipArchiveEntry53.getLastModifiedDate();
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry53.setName("hi!", byteArray58);
        zipArchiveEntry48.setCentralDirectoryExtra(byteArray58);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry62.setExtra();
        byte[] byteArray64 = zipArchiveEntry62.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry66 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date67 = zipArchiveEntry66.getLastModifiedDate();
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry66.setName("hi!", byteArray71);
        zipArchiveEntry62.setExtra(byteArray71);
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry62.setCentralDirectoryExtra(byteArray78);
        zipArchiveEntry62.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData82 = zipArchiveEntry62.getUnparseableExtraFieldData();
        zipArchiveEntry48.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData82);
        zipArchiveEntry39.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData82);
        zipArchiveEntry30.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData82);
        zipArchiveEntry22.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData82);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData82);
        long long88 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(byteArray32);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNull(byteArray41);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray64);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData82);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-1L) + "'", long88 == (-1L));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        int int58 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setCrc((long) '4');
        int int61 = zipArchiveEntry1.getPlatform();
        long long62 = zipArchiveEntry1.getExternalAttributes();
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        java.nio.file.attribute.FileTime fileTime57 = zipArchiveEntry1.getCreationTime();
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
        org.junit.Assert.assertNull(fileTime57);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        zipArchiveEntry1.setTime(3L);
        zipArchiveEntry1.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(fileTime19);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        zipArchiveEntry10.setUnixMode((int) '#');
        java.nio.file.attribute.FileTime fileTime18 = zipArchiveEntry10.getLastModifiedTime();
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
        long long35 = zipArchiveEntry20.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry37.setExtra();
        byte[] byteArray39 = zipArchiveEntry37.getRawName();
        zipArchiveEntry37.setPlatform((int) (byte) 100);
        zipArchiveEntry37.setExternalAttributes((long) 10);
        long long44 = zipArchiveEntry37.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry46.setExtra();
        zipArchiveEntry46.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date52 = zipArchiveEntry51.getLastModifiedDate();
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry51.setName("hi!", byteArray56);
        zipArchiveEntry46.setCentralDirectoryExtra(byteArray56);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry60.setExtra();
        byte[] byteArray62 = zipArchiveEntry60.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date65 = zipArchiveEntry64.getLastModifiedDate();
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry64.setName("hi!", byteArray69);
        zipArchiveEntry60.setExtra(byteArray69);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry60.setCentralDirectoryExtra(byteArray76);
        zipArchiveEntry60.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData80 = zipArchiveEntry60.getUnparseableExtraFieldData();
        zipArchiveEntry46.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData80);
        zipArchiveEntry37.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData80);
        zipArchiveEntry20.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData80);
        zipArchiveEntry10.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData80);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(generalPurposeBit5);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fileTime18);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNull(zipExtraField34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNull(byteArray39);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray62);
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData80);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry1.setName("hi!", byteArray6);
        long long8 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setExternalAttributes((long) (byte) 100);
        java.lang.String str11 = zipArchiveEntry1.getName();
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        zipArchiveEntry15.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date21 = zipArchiveEntry20.getLastModifiedDate();
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry20.setName("hi!", byteArray25);
        zipArchiveEntry15.setCentralDirectoryExtra(byteArray25);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setExtra();
        byte[] byteArray31 = zipArchiveEntry29.getRawName();
        zipArchiveEntry29.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime34 = zipArchiveEntry29.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit38 = zipArchiveEntry37.getGeneralPurposeBit();
        int int39 = zipArchiveEntry37.getMethod();
        long long40 = zipArchiveEntry37.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry43.setExtra();
        zipArchiveEntry43.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date49 = zipArchiveEntry48.getLastModifiedDate();
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry48.setName("hi!", byteArray53);
        zipArchiveEntry43.setCentralDirectoryExtra(byteArray53);
        zipArchiveEntry37.setName("hi!", byteArray53);
        zipArchiveEntry29.setName("", byteArray53);
        zipArchiveEntry15.setExtra(byteArray53);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date61 = zipArchiveEntry60.getLastModifiedDate();
        long long62 = zipArchiveEntry60.getTime();
        java.lang.String str63 = zipArchiveEntry60.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry65 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray66 = zipArchiveEntry65.getExtraFields();
        zipArchiveEntry60.setExtraFields(zipExtraFieldArray66);
        zipArchiveEntry60.setCompressedSize((long) 8);
        boolean boolean70 = zipArchiveEntry15.equals((java.lang.Object) zipArchiveEntry60);
        long long71 = zipArchiveEntry60.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry73 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date74 = zipArchiveEntry73.getLastModifiedDate();
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry73.setName("hi!", byteArray78);
        long long80 = zipArchiveEntry73.getSize();
        zipArchiveEntry73.setExternalAttributes((long) (byte) 100);
        byte[] byteArray83 = zipArchiveEntry73.getCentralDirectoryExtra();
        zipArchiveEntry60.setCentralDirectoryExtra(byteArray83);
        zipArchiveEntry1.setName("", byteArray83);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry87 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry87.setExtra();
        zipArchiveEntry87.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray91 = zipArchiveEntry87.getExtraFields();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit92 = zipArchiveEntry87.getGeneralPurposeBit();
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit92);
        java.nio.file.attribute.FileTime fileTime94 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray31);
        org.junit.Assert.assertNull(fileTime34);
        org.junit.Assert.assertNotNull(generalPurposeBit38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(zipExtraFieldArray66);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray66, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-1L) + "'", long80 == (-1L));
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray91);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray91, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit92);
        org.junit.Assert.assertNull(fileTime94);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setCrc((long) (short) 0);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNull(unparseableExtraFieldData8);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setInternalAttributes((int) '#');
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit4 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setSize((long) 8);
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setPlatform((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setPlatform(0);
        long long14 = zipArchiveEntry11.getTime();
        zipArchiveEntry11.setExternalAttributes((long) 10);
        byte[] byteArray17 = zipArchiveEntry11.getRawName();
        int int18 = zipArchiveEntry11.getUnixMode();
        zipArchiveEntry11.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry21.setExtra();
        byte[] byteArray23 = zipArchiveEntry21.getRawName();
        zipArchiveEntry21.setPlatform((int) (byte) 100);
        long long26 = zipArchiveEntry21.getSize();
        java.nio.file.attribute.FileTime fileTime27 = zipArchiveEntry21.getLastModifiedTime();
        long long28 = zipArchiveEntry21.getCrc();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit29 = zipArchiveEntry21.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry31.setExtra();
        zipArchiveEntry31.setTime(0L);
        zipArchiveEntry31.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime37 = zipArchiveEntry31.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry38 = zipArchiveEntry21.setCreationTime(fileTime37);
        java.util.zip.ZipEntry zipEntry39 = zipArchiveEntry11.setLastAccessTime(fileTime37);
        byte[] byteArray40 = zipEntry39.getExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray40);
        java.lang.String str42 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(generalPurposeBit4);
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNull(fileTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit29);
        org.junit.Assert.assertNotNull(fileTime37);
        org.junit.Assert.assertNotNull(zipEntry38);
        org.junit.Assert.assertEquals(zipEntry38.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry39);
        org.junit.Assert.assertEquals(zipEntry39.toString(), "");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        int int19 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry21.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry24.setName("hi!", byteArray29);
        zipArchiveEntry21.setExtra(byteArray29);
        zipArchiveEntry1.setExtra(byteArray29);
        java.lang.String str33 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        int int7 = zipArchiveEntry1.getMethod();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getCreationTime();
        byte[] byteArray9 = zipArchiveEntry1.getExtra();
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastAccessTime();
        java.lang.String str11 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setExtra();
        byte[] byteArray12 = zipArchiveEntry10.getRawName();
        zipArchiveEntry10.setPlatform((int) (byte) 100);
        zipArchiveEntry10.setExternalAttributes((long) 10);
        long long17 = zipArchiveEntry10.getTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData18 = zipArchiveEntry10.getUnparseableExtraFieldData();
        byte[] byteArray19 = zipArchiveEntry10.getExtra();
        zipArchiveEntry1.setExtra(byteArray19);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNull(unparseableExtraFieldData8);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setExternalAttributes((long) 10);
        long long8 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData9 = zipArchiveEntry1.getUnparseableExtraFieldData();
        long long10 = zipArchiveEntry1.getSize();
        byte[] byteArray11 = zipArchiveEntry1.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        byte[] byteArray15 = zipArchiveEntry13.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date18 = zipArchiveEntry17.getLastModifiedDate();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry17.setName("hi!", byteArray22);
        zipArchiveEntry13.setExtra(byteArray22);
        long long25 = zipArchiveEntry13.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField27 = zipArchiveEntry13.getExtraField(zipShort26);
        int int28 = zipArchiveEntry13.getUnixMode();
        int int29 = zipArchiveEntry13.getPlatform();
        long long30 = zipArchiveEntry13.getTime();
        zipArchiveEntry13.setTime((long) (-1));
        long long33 = zipArchiveEntry13.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit36 = zipArchiveEntry35.getGeneralPurposeBit();
        int int37 = zipArchiveEntry35.getMethod();
        zipArchiveEntry35.setCompressedSize((long) (-1));
        zipArchiveEntry35.setExternalAttributes((long) 'a');
        zipArchiveEntry35.setSize((long) '#');
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
        zipArchiveEntry35.setName("", byteArray62);
        zipArchiveEntry13.setExtra(byteArray62);
        java.nio.file.attribute.FileTime fileTime66 = zipArchiveEntry13.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry67 = zipArchiveEntry1.setLastAccessTime(fileTime66);
        zipArchiveEntry1.setCrc((long) 10);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNull(zipExtraField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(byteArray48);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(fileTime66);
        org.junit.Assert.assertNotNull(zipEntry67);
        org.junit.Assert.assertEquals(zipEntry67.toString(), "");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        zipArchiveEntry1.setExternalAttributes((long) 52);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setExtra();
        byte[] byteArray41 = zipArchiveEntry39.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date44 = zipArchiveEntry43.getLastModifiedDate();
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry43.setName("hi!", byteArray48);
        zipArchiveEntry39.setExtra(byteArray48);
        long long51 = zipArchiveEntry39.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort52 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField53 = zipArchiveEntry39.getExtraField(zipShort52);
        long long54 = zipArchiveEntry39.getExternalAttributes();
        zipArchiveEntry39.setCrc((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit57 = zipArchiveEntry39.getGeneralPurposeBit();
        java.lang.String str58 = zipArchiveEntry39.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray59 = zipArchiveEntry39.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray59);
        byte[] byteArray61 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort62 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort62);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(byteArray41);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNull(zipExtraField53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(generalPurposeBit57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray59);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray59, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray61);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData42 = zipArchiveEntry1.getUnparseableExtraFieldData();
        byte[] byteArray43 = zipArchiveEntry1.getCentralDirectoryExtra();
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
        org.junit.Assert.assertNull(unparseableExtraFieldData42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        zipArchiveEntry1.setComment("hi!");
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
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("");
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry1.getExtraFields(true);
        byte[] byteArray7 = zipArchiveEntry1.getRawName();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray6, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray7);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry43.setExtra();
        byte[] byteArray45 = zipArchiveEntry43.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date48 = zipArchiveEntry47.getLastModifiedDate();
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry47.setName("hi!", byteArray52);
        zipArchiveEntry43.setExtra(byteArray52);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry43.setCentralDirectoryExtra(byteArray59);
        zipArchiveEntry43.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit65 = zipArchiveEntry64.getGeneralPurposeBit();
        int int66 = zipArchiveEntry64.getMethod();
        zipArchiveEntry64.setCompressedSize((long) (-1));
        zipArchiveEntry64.setExternalAttributes((long) 'a');
        zipArchiveEntry64.setSize((long) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry75 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry75.setExtra();
        byte[] byteArray77 = zipArchiveEntry75.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry79 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date80 = zipArchiveEntry79.getLastModifiedDate();
        byte[] byteArray84 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry79.setName("hi!", byteArray84);
        zipArchiveEntry75.setExtra(byteArray84);
        byte[] byteArray91 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry75.setCentralDirectoryExtra(byteArray91);
        zipArchiveEntry64.setName("", byteArray91);
        zipArchiveEntry43.setCentralDirectoryExtra(byteArray91);
        zipArchiveEntry1.setName("", byteArray91);
        byte[] byteArray96 = zipArchiveEntry1.getExtra();
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
        org.junit.Assert.assertNull(byteArray45);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(generalPurposeBit65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(byteArray77);
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertArrayEquals(byteArray96, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        int int7 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setMethod(1);
        java.lang.String str10 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        long long14 = zipArchiveEntry12.getTime();
        java.lang.String str15 = zipArchiveEntry12.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry17.getExtraFields();
        zipArchiveEntry12.setExtraFields(zipExtraFieldArray18);
        long long20 = zipArchiveEntry12.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry22.setExtra();
        zipArchiveEntry22.setTime(0L);
        zipArchiveEntry22.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime28 = zipArchiveEntry22.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry29 = zipArchiveEntry12.setLastAccessTime(fileTime28);
        java.util.zip.ZipEntry zipEntry30 = zipArchiveEntry1.setLastModifiedTime(fileTime28);
        zipArchiveEntry1.setName("");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = zipArchiveEntry1.getExtraField(zipShort33);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray18, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(fileTime28);
        org.junit.Assert.assertNotNull(zipEntry29);
        org.junit.Assert.assertEquals(zipEntry29.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry30);
        org.junit.Assert.assertEquals(zipEntry30.toString(), "");
        org.junit.Assert.assertNull(zipExtraField34);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        long long5 = zipArchiveEntry1.getTime();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(fileTime6);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setTime(10L);
        int int10 = zipArchiveEntry1.getPlatform();
        boolean boolean11 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        int int4 = zipArchiveEntry1.getMethod();
        int int5 = zipArchiveEntry1.getPlatform();
        byte[] byteArray6 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setComment("hi!");
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(byteArray6);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        zipArchiveEntry1.setExternalAttributes((long) '#');
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(fileTime17);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        long long3 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray5 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        zipArchiveEntry7.setTime(0L);
        zipArchiveEntry7.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry7.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry14 = zipArchiveEntry1.setLastModifiedTime(fileTime13);
        zipArchiveEntry1.setComment("");
        long long17 = zipArchiveEntry1.getCrc();
        java.lang.Object obj18 = zipArchiveEntry1.clone();
        byte[] byteArray19 = zipArchiveEntry1.getRawName();
        int int20 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit21 = zipArchiveEntry1.getGeneralPurposeBit();
        java.lang.Class<?> wildcardClass22 = zipArchiveEntry1.getClass();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray4, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(fileTime13);
        org.junit.Assert.assertNotNull(zipEntry14);
        org.junit.Assert.assertEquals(zipEntry14.toString(), "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit10 = zipArchiveEntry9.getGeneralPurposeBit();
        long long11 = zipArchiveEntry9.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry9.getExtraFields();
        byte[] byteArray13 = zipArchiveEntry9.getLocalFileDataExtra();
        java.lang.Object obj14 = zipArchiveEntry9.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry16.setExtra();
        byte[] byteArray18 = zipArchiveEntry16.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date21 = zipArchiveEntry20.getLastModifiedDate();
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry20.setName("hi!", byteArray25);
        zipArchiveEntry16.setExtra(byteArray25);
        long long28 = zipArchiveEntry16.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date32 = zipArchiveEntry31.getLastModifiedDate();
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry31.setName("hi!", byteArray36);
        zipArchiveEntry16.setName("", byteArray36);
        byte[] byteArray39 = zipArchiveEntry16.getLocalFileDataExtra();
        zipArchiveEntry9.setCentralDirectoryExtra(byteArray39);
        byte[] byteArray41 = zipArchiveEntry9.getCentralDirectoryExtra();
        byte[] byteArray42 = zipArchiveEntry9.getExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray42);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray44 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setMethod((int) (short) 10);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray12, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray44);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray44, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setName("hi!");
        int int7 = zipArchiveEntry1.getUnixMode();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit5 = zipArchiveEntry1.getGeneralPurposeBit();
        long long6 = zipArchiveEntry1.getCrc();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(generalPurposeBit5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        zipArchiveEntry1.setTime(3L);
        zipArchiveEntry1.setInternalAttributes((int) '#');
        java.lang.String str19 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        java.lang.Object obj9 = zipArchiveEntry8.clone();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = zipArchiveEntry8.getExtraField(zipShort10);
        zipArchiveEntry8.setUnixMode(32);
        zipArchiveEntry8.setExtra();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertNull(zipExtraField11);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray22 = zipArchiveEntry1.getExtraFields();
        long long23 = zipArchiveEntry1.getCompressedSize();
        int int24 = zipArchiveEntry1.getUnixMode();
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
        org.junit.Assert.assertNotNull(zipExtraFieldArray22);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray22, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = zipArchiveEntry1.getExtraFields(false);
        java.util.Date date15 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setExtra();
        byte[] byteArray19 = zipArchiveEntry17.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date22 = zipArchiveEntry21.getLastModifiedDate();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry21.setName("hi!", byteArray26);
        zipArchiveEntry17.setExtra(byteArray26);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = zipArchiveEntry17.getExtraFields(false);
        zipArchiveEntry17.setExternalAttributes((long) (byte) 0);
        byte[] byteArray33 = zipArchiveEntry17.getExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray33);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray14, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray30, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setUnixMode((int) (short) 100);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData7 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setTime((long) 35);
        byte[] byteArray11 = zipArchiveEntry1.getExtra();
        byte[] byteArray12 = zipArchiveEntry1.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date15 = zipArchiveEntry14.getLastModifiedDate();
        long long16 = zipArchiveEntry14.getTime();
        java.lang.String str17 = zipArchiveEntry14.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = zipArchiveEntry19.getExtraFields();
        zipArchiveEntry14.setExtraFields(zipExtraFieldArray20);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date24 = zipArchiveEntry23.getLastModifiedDate();
        long long25 = zipArchiveEntry23.getTime();
        java.lang.String str26 = zipArchiveEntry23.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray29 = zipArchiveEntry28.getExtraFields();
        zipArchiveEntry23.setExtraFields(zipExtraFieldArray29);
        zipArchiveEntry14.setExtraFields(zipExtraFieldArray29);
        byte[] byteArray32 = zipArchiveEntry14.getLocalFileDataExtra();
        int int33 = zipArchiveEntry14.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry35.setPlatform(0);
        java.lang.String str38 = zipArchiveEntry35.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray39 = zipArchiveEntry35.getExtraFields();
        zipArchiveEntry35.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry43.setExtra();
        zipArchiveEntry43.setTime(0L);
        zipArchiveEntry43.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime49 = zipArchiveEntry43.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry50 = zipArchiveEntry35.setCreationTime(fileTime49);
        java.util.zip.ZipEntry zipEntry51 = zipArchiveEntry14.setCreationTime(fileTime49);
        java.util.zip.ZipEntry zipEntry52 = zipArchiveEntry1.setLastAccessTime(fileTime49);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(unparseableExtraFieldData7);
        org.junit.Assert.assertNull(unparseableExtraFieldData8);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray20, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(zipExtraFieldArray29);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray29, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(zipExtraFieldArray39);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray39, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime49);
        org.junit.Assert.assertNotNull(zipEntry50);
        org.junit.Assert.assertEquals(zipEntry50.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry51);
        org.junit.Assert.assertEquals(zipEntry51.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry52);
        org.junit.Assert.assertEquals(zipEntry52.toString(), "");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setExternalAttributes((long) 10);
        long long8 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData9 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setCompressedSize((long) 0);
        byte[] byteArray12 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setPlatform((int) (byte) 1);
        byte[] byteArray8 = zipArchiveEntry1.getExtra();
        zipArchiveEntry1.setExtra();
        long long10 = zipArchiveEntry1.getCompressedSize();
        long long11 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        zipArchiveEntry1.setMethod((int) (short) 1);
        zipArchiveEntry1.setTime((long) (byte) 100);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        long long55 = zipArchiveEntry1.getExternalAttributes();
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
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData27 = zipArchiveEntry1.getUnparseableExtraFieldData();
        int int28 = zipArchiveEntry1.getPlatform();
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
        org.junit.Assert.assertNull(unparseableExtraFieldData27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date10 = zipArchiveEntry9.getLastModifiedDate();
        long long11 = zipArchiveEntry9.getTime();
        long long12 = zipArchiveEntry9.getSize();
        zipArchiveEntry9.setCrc((long) 8);
        java.lang.String str15 = zipArchiveEntry9.getComment();
        boolean boolean16 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry9);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date20 = zipArchiveEntry19.getLastModifiedDate();
        long long21 = zipArchiveEntry19.getTime();
        zipArchiveEntry19.setPlatform((int) ' ');
        zipArchiveEntry19.setExternalAttributes(0L);
        byte[] byteArray26 = zipArchiveEntry19.getLocalFileDataExtra();
        zipArchiveEntry9.setName("hi!", byteArray26);
        java.util.Date date28 = zipArchiveEntry9.getLastModifiedDate();
        java.lang.String str29 = zipArchiveEntry9.getComment();
        zipArchiveEntry9.setName("hi!");
        java.lang.String str32 = zipArchiveEntry9.getName();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        long long38 = zipArchiveEntry1.getSize();
        long long39 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date43 = zipArchiveEntry42.getLastModifiedDate();
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry42.setName("hi!", byteArray47);
        long long49 = zipArchiveEntry42.getSize();
        java.lang.String str50 = zipArchiveEntry42.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray52 = zipArchiveEntry42.getExtraFields(true);
        byte[] byteArray53 = zipArchiveEntry42.getRawName();
        zipArchiveEntry1.setName("hi!", byteArray53);
        zipArchiveEntry1.setPlatform(100);
        java.nio.file.attribute.FileTime fileTime57 = zipArchiveEntry1.getLastModifiedTime();
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray52);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray52, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(fileTime57);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
        org.junit.Assert.assertNull(fileTime7);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        long long12 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry14.setExtra();
        byte[] byteArray16 = zipArchiveEntry14.getRawName();
        zipArchiveEntry14.setPlatform((int) (byte) 100);
        long long19 = zipArchiveEntry14.getSize();
        long long20 = zipArchiveEntry14.getTime();
        boolean boolean21 = zipArchiveEntry14.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit24 = zipArchiveEntry23.getGeneralPurposeBit();
        long long25 = zipArchiveEntry23.getCrc();
        long long26 = zipArchiveEntry23.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit29 = zipArchiveEntry28.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry31.setExtra();
        byte[] byteArray33 = zipArchiveEntry31.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date36 = zipArchiveEntry35.getLastModifiedDate();
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry35.setName("hi!", byteArray40);
        zipArchiveEntry31.setExtra(byteArray40);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry31.setCentralDirectoryExtra(byteArray47);
        zipArchiveEntry31.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData51 = zipArchiveEntry31.getUnparseableExtraFieldData();
        zipArchiveEntry28.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData51);
        zipArchiveEntry23.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData51);
        zipArchiveEntry14.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData51);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData51);
        boolean boolean56 = zipArchiveEntry1.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit29);
        org.junit.Assert.assertNull(byteArray33);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        java.nio.file.attribute.FileTime fileTime22 = zipArchiveEntry1.getCreationTime();
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry1.getLastModifiedTime();
        int int24 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(fileTime22);
        org.junit.Assert.assertNull(fileTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        zipArchiveEntry1.setCrc((long) (byte) 100);
        byte[] byteArray7 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setSize((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastModifiedTime();
        int int11 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(fileTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        zipArchiveEntry1.setExtra();
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
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        zipArchiveEntry1.setSize(97L);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort20);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        long long4 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setExternalAttributes((long) 3);
        zipArchiveEntry1.setUnixMode((int) (short) 100);
        zipArchiveEntry1.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setPlatform(0);
        java.lang.String str15 = zipArchiveEntry12.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry12.getExtraFields();
        zipArchiveEntry12.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        zipArchiveEntry20.setTime(0L);
        zipArchiveEntry20.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime26 = zipArchiveEntry20.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry27 = zipArchiveEntry12.setCreationTime(fileTime26);
        zipArchiveEntry12.setExternalAttributes((long) 8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry31.setExtra();
        byte[] byteArray33 = zipArchiveEntry31.getRawName();
        zipArchiveEntry31.setPlatform((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date38 = zipArchiveEntry37.getLastModifiedDate();
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry37.setName("hi!", byteArray42);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData44 = zipArchiveEntry37.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit47 = zipArchiveEntry46.getGeneralPurposeBit();
        zipArchiveEntry46.setTime((long) (byte) 10);
        long long50 = zipArchiveEntry46.getCrc();
        int int51 = zipArchiveEntry46.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry53.setExtra();
        byte[] byteArray55 = zipArchiveEntry53.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date58 = zipArchiveEntry57.getLastModifiedDate();
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry57.setName("hi!", byteArray62);
        zipArchiveEntry53.setExtra(byteArray62);
        long long65 = zipArchiveEntry53.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort66 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField67 = zipArchiveEntry53.getExtraField(zipShort66);
        boolean boolean69 = zipArchiveEntry53.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit70 = zipArchiveEntry53.getGeneralPurposeBit();
        zipArchiveEntry46.setGeneralPurposeBit(generalPurposeBit70);
        zipArchiveEntry37.setGeneralPurposeBit(generalPurposeBit70);
        zipArchiveEntry31.setGeneralPurposeBit(generalPurposeBit70);
        zipArchiveEntry12.setGeneralPurposeBit(generalPurposeBit70);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit70);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime26);
        org.junit.Assert.assertNotNull(zipEntry27);
        org.junit.Assert.assertEquals(zipEntry27.toString(), "");
        org.junit.Assert.assertNull(byteArray33);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(unparseableExtraFieldData44);
        org.junit.Assert.assertNotNull(generalPurposeBit47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(byteArray55);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNull(zipExtraField67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit70);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        int int7 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setExternalAttributes((long) 'a');
        byte[] byteArray10 = zipArchiveEntry1.getExtra();
        int int11 = zipArchiveEntry1.getPlatform();
        long long12 = zipArchiveEntry1.getExternalAttributes();
        int int13 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = zipArchiveEntry1.getExtraFields();
        long long15 = zipArchiveEntry1.getCrc();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray14, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        long long4 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setExternalAttributes((long) 10);
        byte[] byteArray7 = zipArchiveEntry1.getRawName();
        int int8 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        long long14 = zipArchiveEntry12.getTime();
        java.lang.String str15 = zipArchiveEntry12.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry17.getExtraFields();
        zipArchiveEntry12.setExtraFields(zipExtraFieldArray18);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date22 = zipArchiveEntry21.getLastModifiedDate();
        long long23 = zipArchiveEntry21.getTime();
        java.lang.String str24 = zipArchiveEntry21.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry26.getExtraFields();
        zipArchiveEntry21.setExtraFields(zipExtraFieldArray27);
        zipArchiveEntry12.setExtraFields(zipExtraFieldArray27);
        zipArchiveEntry12.setInternalAttributes(100);
        zipArchiveEntry12.setTime(0L);
        zipArchiveEntry12.setCompressedSize((long) 100);
        java.nio.file.attribute.FileTime fileTime36 = zipArchiveEntry12.getCreationTime();
        int int37 = zipArchiveEntry12.getPlatform();
        zipArchiveEntry12.setPlatform((int) (short) -1);
        long long40 = zipArchiveEntry12.getExternalAttributes();
        long long41 = zipArchiveEntry12.getTime();
        java.nio.file.attribute.FileTime fileTime42 = zipArchiveEntry12.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry43 = zipArchiveEntry1.setLastModifiedTime(fileTime42);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray18, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(fileTime42);
        org.junit.Assert.assertNotNull(zipEntry43);
        org.junit.Assert.assertEquals(zipEntry43.toString(), "");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setUnixMode((int) (short) 100);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData7 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(unparseableExtraFieldData7);
        org.junit.Assert.assertNull(unparseableExtraFieldData8);
        org.junit.Assert.assertNull(fileTime9);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        long long6 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setPlatform(0);
        zipArchiveEntry8.setTime((long) (short) -1);
        byte[] byteArray13 = zipArchiveEntry8.getCentralDirectoryExtra();
        byte[] byteArray14 = zipArchiveEntry8.getRawName();
        long long15 = zipArchiveEntry8.getCompressedSize();
        byte[] byteArray16 = zipArchiveEntry8.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry18.setPlatform(0);
        zipArchiveEntry18.setTime((long) (short) -1);
        byte[] byteArray23 = zipArchiveEntry18.getCentralDirectoryExtra();
        int int24 = zipArchiveEntry18.getInternalAttributes();
        java.time.LocalDateTime localDateTime25 = zipArchiveEntry18.getTimeLocal();
        zipArchiveEntry8.setTimeLocal(localDateTime25);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit27 = zipArchiveEntry8.getGeneralPurposeBit();
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit27);
        zipArchiveEntry1.setName("");
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(generalPurposeBit27);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = zipArchiveEntry1.getExtraFields(false);
        java.lang.String str25 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setExtra();
        byte[] byteArray30 = zipArchiveEntry28.getRawName();
        zipArchiveEntry28.setPlatform((int) (byte) 100);
        zipArchiveEntry28.setExternalAttributes((long) 10);
        long long35 = zipArchiveEntry28.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date38 = zipArchiveEntry37.getLastModifiedDate();
        long long39 = zipArchiveEntry37.getTime();
        java.lang.String str40 = zipArchiveEntry37.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray43 = zipArchiveEntry42.getExtraFields();
        zipArchiveEntry37.setExtraFields(zipExtraFieldArray43);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date47 = zipArchiveEntry46.getLastModifiedDate();
        long long48 = zipArchiveEntry46.getTime();
        java.lang.String str49 = zipArchiveEntry46.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray52 = zipArchiveEntry51.getExtraFields();
        zipArchiveEntry46.setExtraFields(zipExtraFieldArray52);
        zipArchiveEntry37.setExtraFields(zipExtraFieldArray52);
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
        zipArchiveEntry37.setCentralDirectoryExtra(byteArray72);
        java.lang.String str75 = zipArchiveEntry37.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry77 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry77.setExtra();
        zipArchiveEntry77.setTime(0L);
        zipArchiveEntry77.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime83 = zipArchiveEntry77.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry37.setLastModifiedTime(fileTime83);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry28.setLastModifiedTime(fileTime83);
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry1.setLastModifiedTime(fileTime83);
        long long87 = zipEntry86.getCrc();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray24, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray26, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray30);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(zipExtraFieldArray43);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray43, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(zipExtraFieldArray52);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray52, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray58);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(fileTime83);
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry86);
        org.junit.Assert.assertEquals(zipEntry86.toString(), "");
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setTime((long) (short) -1);
        byte[] byteArray6 = zipArchiveEntry1.getCentralDirectoryExtra();
        int int7 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray8 = zipArchiveEntry1.getRawName();
        byte[] byteArray9 = zipArchiveEntry1.getLocalFileDataExtra();
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        long long14 = zipArchiveEntry12.getTime();
        java.lang.String str15 = zipArchiveEntry12.getComment();
        zipArchiveEntry12.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry12.getExtraFields();
        byte[] byteArray19 = zipArchiveEntry12.getLocalFileDataExtra();
        byte[] byteArray20 = zipArchiveEntry12.getLocalFileDataExtra();
        zipArchiveEntry12.setCompressedSize((long) (byte) 0);
        byte[] byteArray23 = zipArchiveEntry12.getExtra();
        byte[] byteArray24 = zipArchiveEntry12.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray24);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry1.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData28 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj29 = zipArchiveEntry1.clone();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray18, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(unparseableExtraFieldData28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        long long5 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit7 = zipArchiveEntry1.getGeneralPurposeBit();
        int int8 = zipArchiveEntry1.getUnixMode();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray6, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setPlatform((int) ' ');
        zipArchiveEntry1.setExtra();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = zipArchiveEntry1.getTimeLocal();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 15");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setExtra();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setTime(8L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date14 = zipArchiveEntry13.getLastModifiedDate();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry13.setName("hi!", byteArray18);
        zipArchiveEntry10.setExtra(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = zipArchiveEntry10.getExtraField(zipShort21);
        int int23 = zipArchiveEntry10.getUnixMode();
        byte[] byteArray24 = zipArchiveEntry10.getExtra();
        zipArchiveEntry1.setName("", byteArray24);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry1.getExtraFields(true);
        int int28 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = zipArchiveEntry1.getExtraFields(true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray30, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray17);
        zipArchiveEntry1.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData21 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setCompressedSize((long) (short) -1);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData21);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        long long12 = zipArchiveEntry5.getSize();
        int int13 = zipArchiveEntry5.getPlatform();
        zipArchiveEntry5.setUnixMode((int) (short) 100);
        byte[] byteArray16 = zipArchiveEntry5.getExtra();
        boolean boolean17 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry5);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        long long6 = zipArchiveEntry1.getCompressedSize();
        long long7 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry9.setExtra(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date22 = zipArchiveEntry21.getLastModifiedDate();
        long long23 = zipArchiveEntry21.getTime();
        java.lang.String str24 = zipArchiveEntry21.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry26.getExtraFields();
        zipArchiveEntry21.setExtraFields(zipExtraFieldArray27);
        zipArchiveEntry9.setExtraFields(zipExtraFieldArray27);
        boolean boolean30 = zipArchiveEntry9.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setPlatform(0);
        java.lang.String str35 = zipArchiveEntry32.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray36 = zipArchiveEntry32.getExtraFields();
        zipArchiveEntry32.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry40.setExtra();
        zipArchiveEntry40.setTime(0L);
        zipArchiveEntry40.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime46 = zipArchiveEntry40.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry47 = zipArchiveEntry32.setCreationTime(fileTime46);
        java.util.zip.ZipEntry zipEntry48 = zipArchiveEntry9.setCreationTime(fileTime46);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit51 = zipArchiveEntry50.getGeneralPurposeBit();
        long long52 = zipArchiveEntry50.getCrc();
        long long53 = zipArchiveEntry50.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit56 = zipArchiveEntry55.getGeneralPurposeBit();
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
        zipArchiveEntry58.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData78 = zipArchiveEntry58.getUnparseableExtraFieldData();
        zipArchiveEntry55.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData78);
        zipArchiveEntry50.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData78);
        zipArchiveEntry9.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData78);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData78);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(zipExtraFieldArray36);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray36, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime46);
        org.junit.Assert.assertNotNull(zipEntry47);
        org.junit.Assert.assertEquals(zipEntry47.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry48);
        org.junit.Assert.assertEquals(zipEntry48.toString(), "");
        org.junit.Assert.assertNotNull(generalPurposeBit51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit56);
        org.junit.Assert.assertNull(byteArray60);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData78);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setCompressedSize((long) (short) -1);
        zipArchiveEntry1.setSize((long) '4');
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
        org.junit.Assert.assertNull(fileTime6);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit17 = zipArchiveEntry16.getGeneralPurposeBit();
        zipArchiveEntry16.setTime((long) (byte) 10);
        long long20 = zipArchiveEntry16.getCrc();
        zipArchiveEntry16.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData23 = zipArchiveEntry16.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime24 = zipArchiveEntry16.getTimeLocal();
        zipArchiveEntry1.setTimeLocal(localDateTime24);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date28 = zipArchiveEntry27.getLastModifiedDate();
        long long29 = zipArchiveEntry27.getTime();
        java.lang.String str30 = zipArchiveEntry27.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray33 = zipArchiveEntry32.getExtraFields();
        zipArchiveEntry27.setExtraFields(zipExtraFieldArray33);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date37 = zipArchiveEntry36.getLastModifiedDate();
        long long38 = zipArchiveEntry36.getTime();
        java.lang.String str39 = zipArchiveEntry36.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = zipArchiveEntry41.getExtraFields();
        zipArchiveEntry36.setExtraFields(zipExtraFieldArray42);
        zipArchiveEntry27.setExtraFields(zipExtraFieldArray42);
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
        zipArchiveEntry27.setCentralDirectoryExtra(byteArray62);
        zipArchiveEntry27.setInternalAttributes((int) 'a');
        boolean boolean67 = zipArchiveEntry27.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry69.setExtra();
        byte[] byteArray71 = zipArchiveEntry69.getRawName();
        zipArchiveEntry69.setPlatform((int) (byte) 100);
        long long74 = zipArchiveEntry69.getSize();
        java.nio.file.attribute.FileTime fileTime75 = zipArchiveEntry69.getLastModifiedTime();
        long long76 = zipArchiveEntry69.getCrc();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit77 = zipArchiveEntry69.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry79 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry79.setExtra();
        zipArchiveEntry79.setTime(0L);
        zipArchiveEntry79.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime85 = zipArchiveEntry79.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry69.setCreationTime(fileTime85);
        java.util.zip.ZipEntry zipEntry87 = zipArchiveEntry27.setLastModifiedTime(fileTime85);
        java.util.zip.ZipEntry zipEntry88 = zipArchiveEntry1.setCreationTime(fileTime85);
        int int89 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(zipExtraFieldArray33);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray33, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray42, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray48);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(byteArray71);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
        org.junit.Assert.assertNull(fileTime75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit77);
        org.junit.Assert.assertNotNull(fileTime85);
        org.junit.Assert.assertNotNull(zipEntry86);
        org.junit.Assert.assertEquals(zipEntry86.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry87);
        org.junit.Assert.assertEquals(zipEntry87.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry88);
        org.junit.Assert.assertEquals(zipEntry88.toString(), "");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        int int5 = zipArchiveEntry1.getMethod();
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = zipArchiveEntry8.getGeneralPurposeBit();
        zipArchiveEntry8.setTime((long) (byte) 10);
        long long12 = zipArchiveEntry8.getCrc();
        long long13 = zipArchiveEntry8.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        byte[] byteArray17 = zipArchiveEntry15.getRawName();
        zipArchiveEntry15.setPlatform((int) (byte) 100);
        zipArchiveEntry15.setExternalAttributes((long) 10);
        long long22 = zipArchiveEntry15.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = zipArchiveEntry24.getGeneralPurposeBit();
        zipArchiveEntry24.setTime((long) (byte) 10);
        long long28 = zipArchiveEntry24.getCrc();
        int int29 = zipArchiveEntry24.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry31.setExtra();
        byte[] byteArray33 = zipArchiveEntry31.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date36 = zipArchiveEntry35.getLastModifiedDate();
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry35.setName("hi!", byteArray40);
        zipArchiveEntry31.setExtra(byteArray40);
        long long43 = zipArchiveEntry31.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort44 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField45 = zipArchiveEntry31.getExtraField(zipShort44);
        boolean boolean47 = zipArchiveEntry31.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit48 = zipArchiveEntry31.getGeneralPurposeBit();
        zipArchiveEntry24.setGeneralPurposeBit(generalPurposeBit48);
        byte[] byteArray50 = zipArchiveEntry24.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit53 = zipArchiveEntry52.getGeneralPurposeBit();
        int int54 = zipArchiveEntry52.getMethod();
        zipArchiveEntry52.setCompressedSize((long) (-1));
        zipArchiveEntry52.setExternalAttributes((long) 'a');
        zipArchiveEntry52.setCompressedSize((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit63 = zipArchiveEntry62.getGeneralPurposeBit();
        zipArchiveEntry62.setTime((long) (byte) 10);
        long long66 = zipArchiveEntry62.getCrc();
        zipArchiveEntry62.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData69 = zipArchiveEntry62.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime70 = zipArchiveEntry62.getTimeLocal();
        zipArchiveEntry52.setTimeLocal(localDateTime70);
        zipArchiveEntry24.setTimeLocal(localDateTime70);
        zipArchiveEntry15.setTimeLocal(localDateTime70);
        zipArchiveEntry8.setTimeLocal(localDateTime70);
        zipArchiveEntry1.setTimeLocal(localDateTime70);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(generalPurposeBit9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(byteArray33);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(zipExtraField45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit48);
        org.junit.Assert.assertNull(byteArray50);
        org.junit.Assert.assertNotNull(generalPurposeBit53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(generalPurposeBit63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData69);
        org.junit.Assert.assertNotNull(localDateTime70);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (byte) 10);
        long long5 = zipArchiveEntry1.getCrc();
        int int6 = zipArchiveEntry1.getPlatform();
        int int7 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry9.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData13 = zipArchiveEntry9.getUnparseableExtraFieldData();
        long long14 = zipArchiveEntry9.getExternalAttributes();
        int int15 = zipArchiveEntry9.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry18.setExtra();
        byte[] byteArray20 = zipArchiveEntry18.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date23 = zipArchiveEntry22.getLastModifiedDate();
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry22.setName("hi!", byteArray27);
        zipArchiveEntry18.setExtra(byteArray27);
        long long30 = zipArchiveEntry18.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort31 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField32 = zipArchiveEntry18.getExtraField(zipShort31);
        long long33 = zipArchiveEntry18.getExternalAttributes();
        zipArchiveEntry18.setCrc((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit36 = zipArchiveEntry18.getGeneralPurposeBit();
        int int37 = zipArchiveEntry18.getInternalAttributes();
        java.nio.file.attribute.FileTime fileTime38 = zipArchiveEntry18.getCreationTime();
        java.lang.String str39 = zipArchiveEntry18.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit42 = zipArchiveEntry41.getGeneralPurposeBit();
        long long43 = zipArchiveEntry41.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray44 = zipArchiveEntry41.getExtraFields();
        byte[] byteArray45 = zipArchiveEntry41.getLocalFileDataExtra();
        zipArchiveEntry18.setCentralDirectoryExtra(byteArray45);
        zipArchiveEntry9.setName("", byteArray45);
        zipArchiveEntry1.setExtra(byteArray45);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertNull(unparseableExtraFieldData13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteArray20);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(zipExtraField32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(generalPurposeBit36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(fileTime38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(generalPurposeBit42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray44);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray44, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setExternalAttributes((long) 10);
        long long8 = zipArchiveEntry1.getCrc();
        int int9 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData10 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.util.Date date11 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit12 = zipArchiveEntry1.getGeneralPurposeBit();
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(unparseableExtraFieldData10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(generalPurposeBit12);
        org.junit.Assert.assertNull(fileTime13);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setInternalAttributes(8);
        java.lang.String str9 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setComment("hi!");
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        boolean boolean8 = zipArchiveEntry1.isDirectory();
        long long9 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setCompressedSize((long) 52);
        zipArchiveEntry1.setInternalAttributes((int) 'a');
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry1.getExtraFields(true);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit10 = zipArchiveEntry9.getGeneralPurposeBit();
        byte[] byteArray11 = zipArchiveEntry9.getRawName();
        long long12 = zipArchiveEntry9.getExternalAttributes();
        zipArchiveEntry9.setExternalAttributes((long) 3);
        long long15 = zipArchiveEntry9.getSize();
        int int16 = zipArchiveEntry9.getMethod();
        int int17 = zipArchiveEntry9.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry19.setPlatform(0);
        zipArchiveEntry19.setTime((long) (short) -1);
        byte[] byteArray24 = zipArchiveEntry19.getCentralDirectoryExtra();
        zipArchiveEntry9.setCentralDirectoryExtra(byteArray24);
        boolean boolean26 = zipArchiveEntry1.equals((java.lang.Object) byteArray24);
        zipArchiveEntry1.setInternalAttributes(10);
        byte[] byteArray29 = zipArchiveEntry1.getRawName();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNotNull(generalPurposeBit10);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(byteArray29);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        int int7 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setMethod(1);
        int int10 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setSize((long) (byte) 100);
        byte[] byteArray13 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry16.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry16.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData20 = zipArchiveEntry16.getUnparseableExtraFieldData();
        java.nio.file.attribute.FileTime fileTime21 = zipArchiveEntry16.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        long long26 = zipArchiveEntry24.getTime();
        java.lang.String str27 = zipArchiveEntry24.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = zipArchiveEntry29.getExtraFields();
        zipArchiveEntry24.setExtraFields(zipExtraFieldArray30);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry34.setExtra();
        byte[] byteArray36 = zipArchiveEntry34.getRawName();
        zipArchiveEntry34.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime39 = zipArchiveEntry34.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit43 = zipArchiveEntry42.getGeneralPurposeBit();
        int int44 = zipArchiveEntry42.getMethod();
        long long45 = zipArchiveEntry42.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry48.setExtra();
        zipArchiveEntry48.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date54 = zipArchiveEntry53.getLastModifiedDate();
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry53.setName("hi!", byteArray58);
        zipArchiveEntry48.setCentralDirectoryExtra(byteArray58);
        zipArchiveEntry42.setName("hi!", byteArray58);
        zipArchiveEntry34.setName("", byteArray58);
        zipArchiveEntry24.setName("hi!", byteArray58);
        zipArchiveEntry16.setName("hi!", byteArray58);
        byte[] byteArray65 = zipArchiveEntry16.getRawName();
        zipArchiveEntry1.setName("", byteArray65);
        java.lang.String str67 = zipArchiveEntry1.toString();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertNull(unparseableExtraFieldData20);
        org.junit.Assert.assertNull(fileTime21);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray30, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertNull(fileTime39);
        org.junit.Assert.assertNotNull(generalPurposeBit43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        long long6 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setMethod(8);
        int int9 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        byte[] byteArray5 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastAccessTime();
        long long8 = zipArchiveEntry1.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date12 = zipArchiveEntry11.getLastModifiedDate();
        long long13 = zipArchiveEntry11.getTime();
        java.lang.String str14 = zipArchiveEntry11.getComment();
        zipArchiveEntry11.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = zipArchiveEntry11.getExtraFields();
        byte[] byteArray18 = zipArchiveEntry11.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit21 = zipArchiveEntry20.getGeneralPurposeBit();
        byte[] byteArray22 = zipArchiveEntry20.getRawName();
        long long23 = zipArchiveEntry20.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry26.setExtra();
        zipArchiveEntry26.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date32 = zipArchiveEntry31.getLastModifiedDate();
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry31.setName("hi!", byteArray36);
        zipArchiveEntry26.setCentralDirectoryExtra(byteArray36);
        zipArchiveEntry20.setName("", byteArray36);
        zipArchiveEntry20.setTime((long) 10);
        boolean boolean42 = zipArchiveEntry11.equals((java.lang.Object) zipArchiveEntry20);
        zipArchiveEntry11.setName("");
        java.lang.String str45 = zipArchiveEntry11.getComment();
        zipArchiveEntry11.setExternalAttributes((long) 100);
        java.lang.Object obj48 = zipArchiveEntry11.clone();
        boolean boolean49 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry11);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort50 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField51 = zipArchiveEntry1.getExtraField(zipShort50);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray17, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray18);
        org.junit.Assert.assertNotNull(generalPurposeBit21);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(zipExtraField51);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        int int7 = zipArchiveEntry1.getMethod();
        long long8 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setCrc(100L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry12.getLastAccessTime();
        int int14 = zipArchiveEntry12.getMethod();
        byte[] byteArray15 = zipArchiveEntry12.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime18 = zipArchiveEntry17.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit21 = zipArchiveEntry20.getGeneralPurposeBit();
        byte[] byteArray22 = zipArchiveEntry20.getRawName();
        long long23 = zipArchiveEntry20.getExternalAttributes();
        boolean boolean24 = zipArchiveEntry17.equals((java.lang.Object) long23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit27 = zipArchiveEntry26.getGeneralPurposeBit();
        zipArchiveEntry26.setTime((long) (byte) 10);
        long long30 = zipArchiveEntry26.getCrc();
        boolean boolean31 = zipArchiveEntry17.equals((java.lang.Object) zipArchiveEntry26);
        java.lang.String str32 = zipArchiveEntry26.getComment();
        zipArchiveEntry26.setMethod((int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = zipArchiveEntry26.getExtraFields();
        zipArchiveEntry12.setExtraFields(zipExtraFieldArray35);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray35);
        java.nio.file.attribute.FileTime fileTime38 = zipArchiveEntry1.getCreationTime();
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNull(fileTime18);
        org.junit.Assert.assertNotNull(generalPurposeBit21);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray35, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime38);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setMethod((int) (byte) 0);
        int int7 = zipArchiveEntry1.getInternalAttributes();
        int int8 = zipArchiveEntry1.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        int int10 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) (byte) 1);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        java.lang.String str51 = zipArchiveEntry1.toString();
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setUnixMode((int) (byte) 1);
        int int8 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date17 = zipArchiveEntry16.getLastModifiedDate();
        long long18 = zipArchiveEntry16.getTime();
        java.lang.String str19 = zipArchiveEntry16.getComment();
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry16.getLastAccessTime();
        boolean boolean21 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry16);
        java.nio.file.attribute.FileTime fileTime22 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(fileTime22);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date17 = zipArchiveEntry16.getLastModifiedDate();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry16.setName("hi!", byteArray21);
        zipArchiveEntry1.setName("", byteArray21);
        int int24 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setExternalAttributes((long) (byte) 10);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
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
        zipArchiveEntry1.setUnixMode(0);
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setTime((long) (short) -1);
        java.lang.Class<?> wildcardClass6 = zipArchiveEntry1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        java.lang.Object obj15 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setSize((long) 10);
        zipArchiveEntry1.setCrc(0L);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray16, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry1.setName("", byteArray10);
        long long12 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setCrc((long) (byte) 10);
        zipArchiveEntry1.setUnixMode((-1));
        boolean boolean17 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setCrc(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        java.lang.String str19 = zipArchiveEntry1.getName();
        java.lang.String str20 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        int int7 = zipArchiveEntry1.getMethod();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getCreationTime();
        byte[] byteArray9 = zipArchiveEntry1.getExtra();
        int int10 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        zipArchiveEntry1.setCompressedSize(8L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setExtra();
        zipArchiveEntry12.setName("");
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry12.setName("", byteArray21);
        zipArchiveEntry12.setCrc(0L);
        zipArchiveEntry12.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData30 = zipArchiveEntry28.getUnparseableExtraFieldData();
        int int31 = zipArchiveEntry28.getMethod();
        java.lang.Object obj32 = zipArchiveEntry28.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date35 = zipArchiveEntry34.getLastModifiedDate();
        long long36 = zipArchiveEntry34.getTime();
        java.lang.String str37 = zipArchiveEntry34.getComment();
        zipArchiveEntry34.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = zipArchiveEntry34.getExtraFields();
        zipArchiveEntry28.setExtraFields(zipExtraFieldArray40);
        zipArchiveEntry12.setExtraFields(zipExtraFieldArray40);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray40);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNull(unparseableExtraFieldData30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray40, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField3 = zipArchiveEntry1.getExtraField(zipShort2);
        zipArchiveEntry1.setCompressedSize((long) 52);
        int int6 = zipArchiveEntry1.getUnixMode();
        byte[] byteArray7 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry1.getExtraFields(false);
        org.junit.Assert.assertNull(zipExtraField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray9, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setPlatform((int) ' ');
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setName("hi!");
        byte[] byteArray9 = zipArchiveEntry1.getRawName();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(byteArray9);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        int int68 = zipArchiveEntry1.getMethod();
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 8 + "'", int68 == 8);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setExternalAttributes((long) 10);
        long long8 = zipArchiveEntry1.getCrc();
        int int9 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData10 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setUnixMode((int) (short) -1);
        int int13 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCompressedSize((long) (byte) -1);
        zipArchiveEntry1.setPlatform(8);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(unparseableExtraFieldData10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date18 = zipArchiveEntry17.getLastModifiedDate();
        long long19 = zipArchiveEntry17.getTime();
        java.lang.String str20 = zipArchiveEntry17.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = zipArchiveEntry22.getExtraFields();
        zipArchiveEntry17.setExtraFields(zipExtraFieldArray23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date27 = zipArchiveEntry26.getLastModifiedDate();
        long long28 = zipArchiveEntry26.getTime();
        java.lang.String str29 = zipArchiveEntry26.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry31.getExtraFields();
        zipArchiveEntry26.setExtraFields(zipExtraFieldArray32);
        zipArchiveEntry17.setExtraFields(zipExtraFieldArray32);
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
        zipArchiveEntry17.setCentralDirectoryExtra(byteArray52);
        java.lang.String str55 = zipArchiveEntry17.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry57.setExtra();
        zipArchiveEntry57.setTime(0L);
        zipArchiveEntry57.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime63 = zipArchiveEntry57.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry64 = zipArchiveEntry17.setLastModifiedTime(fileTime63);
        java.util.zip.ZipEntry zipEntry65 = zipArchiveEntry1.setLastAccessTime(fileTime63);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry67 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit68 = zipArchiveEntry67.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry70 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry70.setExtra();
        byte[] byteArray72 = zipArchiveEntry70.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry74 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date75 = zipArchiveEntry74.getLastModifiedDate();
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry74.setName("hi!", byteArray79);
        zipArchiveEntry70.setExtra(byteArray79);
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry70.setCentralDirectoryExtra(byteArray86);
        zipArchiveEntry70.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData90 = zipArchiveEntry70.getUnparseableExtraFieldData();
        zipArchiveEntry67.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData90);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData90);
        boolean boolean93 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setComment("hi!");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(unparseableExtraFieldData15);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray23, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray32, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray38);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(fileTime63);
        org.junit.Assert.assertNotNull(zipEntry64);
        org.junit.Assert.assertEquals(zipEntry64.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry65);
        org.junit.Assert.assertEquals(zipEntry65.toString(), "");
        org.junit.Assert.assertNotNull(generalPurposeBit68);
        org.junit.Assert.assertNull(byteArray72);
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData90);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        int int40 = zipArchiveEntry1.getUnixMode();
        int int41 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setCrc(3L);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData44 = zipArchiveEntry1.getUnparseableExtraFieldData();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(unparseableExtraFieldData44);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray7);
        zipArchiveEntry1.setCompressedSize((long) 8);
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
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = zipArchiveEntry12.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setExtra();
        byte[] byteArray34 = zipArchiveEntry32.getRawName();
        zipArchiveEntry32.setPlatform((int) (byte) 100);
        long long37 = zipArchiveEntry32.getSize();
        java.nio.file.attribute.FileTime fileTime38 = zipArchiveEntry32.getLastModifiedTime();
        long long39 = zipArchiveEntry32.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField41 = zipArchiveEntry32.getExtraField(zipShort40);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit44 = zipArchiveEntry43.getGeneralPurposeBit();
        long long45 = zipArchiveEntry43.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray46 = zipArchiveEntry43.getExtraFields();
        zipArchiveEntry32.setExtraFields(zipExtraFieldArray46);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort48 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField49 = zipArchiveEntry32.getExtraField(zipShort48);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry51.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData53 = zipArchiveEntry51.getUnparseableExtraFieldData();
        int int54 = zipArchiveEntry51.getMethod();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray55 = zipArchiveEntry51.getExtraFields();
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
        zipArchiveEntry51.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry32.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry12.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData91);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray30, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNull(fileTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNull(zipExtraField41);
        org.junit.Assert.assertNotNull(generalPurposeBit44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray46);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray46, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField49);
        org.junit.Assert.assertNull(unparseableExtraFieldData53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray55);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray55, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
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
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        int int28 = zipArchiveEntry1.getUnixMode();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime29 = zipArchiveEntry1.getTimeLocal();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 15");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNull(fileTime23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNull(fileTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date17 = zipArchiveEntry16.getLastModifiedDate();
        long long18 = zipArchiveEntry16.getTime();
        java.lang.String str19 = zipArchiveEntry16.getComment();
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry16.getLastAccessTime();
        boolean boolean21 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry16);
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setExtra();
        zipArchiveEntry39.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry44.setExtra();
        byte[] byteArray46 = zipArchiveEntry44.getRawName();
        zipArchiveEntry44.setPlatform((int) (byte) 100);
        long long49 = zipArchiveEntry44.getSize();
        java.nio.file.attribute.FileTime fileTime50 = zipArchiveEntry44.getLastModifiedTime();
        long long51 = zipArchiveEntry44.getCrc();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit52 = zipArchiveEntry44.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry54.setExtra();
        zipArchiveEntry54.setTime(0L);
        zipArchiveEntry54.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime60 = zipArchiveEntry54.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry61 = zipArchiveEntry44.setCreationTime(fileTime60);
        java.util.zip.ZipEntry zipEntry62 = zipArchiveEntry39.setLastModifiedTime(fileTime60);
        java.util.zip.ZipEntry zipEntry63 = zipArchiveEntry23.setCreationTime(fileTime60);
        java.util.zip.ZipEntry zipEntry64 = zipArchiveEntry16.setLastModifiedTime(fileTime60);
        zipArchiveEntry16.setUnixMode(0);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(byteArray25);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(zipExtraField37);
        org.junit.Assert.assertNull(byteArray46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertNull(fileTime50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit52);
        org.junit.Assert.assertNotNull(fileTime60);
        org.junit.Assert.assertNotNull(zipEntry61);
        org.junit.Assert.assertEquals(zipEntry61.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry62);
        org.junit.Assert.assertEquals(zipEntry62.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry63);
        org.junit.Assert.assertEquals(zipEntry63.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry64);
        org.junit.Assert.assertEquals(zipEntry64.toString(), "");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getLastAccessTime();
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
        java.lang.String str26 = zipArchiveEntry10.getName();
        zipArchiveEntry10.setPlatform(8);
        byte[] byteArray29 = zipArchiveEntry10.getCentralDirectoryExtra();
        zipArchiveEntry10.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit35 = zipArchiveEntry34.getGeneralPurposeBit();
        zipArchiveEntry34.setTime((long) (byte) 10);
        zipArchiveEntry34.setCompressedSize((long) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData43 = zipArchiveEntry41.getUnparseableExtraFieldData();
        java.lang.Object obj44 = zipArchiveEntry41.clone();
        byte[] byteArray45 = zipArchiveEntry41.getCentralDirectoryExtra();
        boolean boolean46 = zipArchiveEntry34.equals((java.lang.Object) byteArray45);
        zipArchiveEntry10.setName("", byteArray45);
        zipArchiveEntry1.setExtra(byteArray45);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(zipExtraField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit35);
        org.junit.Assert.assertNull(unparseableExtraFieldData43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setCompressedSize((long) (-1));
        zipArchiveEntry1.setExternalAttributes((long) 'a');
        zipArchiveEntry1.setSize((long) '#');
        byte[] byteArray10 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setInternalAttributes(32);
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        zipArchiveEntry15.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date21 = zipArchiveEntry20.getLastModifiedDate();
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry20.setName("hi!", byteArray25);
        zipArchiveEntry15.setCentralDirectoryExtra(byteArray25);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setExtra();
        byte[] byteArray31 = zipArchiveEntry29.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date34 = zipArchiveEntry33.getLastModifiedDate();
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry33.setName("hi!", byteArray38);
        zipArchiveEntry29.setExtra(byteArray38);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry29.setCentralDirectoryExtra(byteArray45);
        zipArchiveEntry29.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData49 = zipArchiveEntry29.getUnparseableExtraFieldData();
        zipArchiveEntry15.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData49);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray51 = zipArchiveEntry15.getExtraFields();
        long long52 = zipArchiveEntry15.getSize();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData53 = zipArchiveEntry15.getUnparseableExtraFieldData();
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData53);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray31);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData49);
        org.junit.Assert.assertNotNull(zipExtraFieldArray51);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray51, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(unparseableExtraFieldData53);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setExtra();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        int int6 = zipArchiveEntry1.getInternalAttributes();
        int int7 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setExtra();
        long long9 = zipArchiveEntry1.getCompressedSize();
        long long10 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        long long5 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setUnixMode(10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry1.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date12 = zipArchiveEntry11.getLastModifiedDate();
        long long13 = zipArchiveEntry11.getTime();
        java.lang.String str14 = zipArchiveEntry11.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = zipArchiveEntry16.getExtraFields();
        zipArchiveEntry11.setExtraFields(zipExtraFieldArray17);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date21 = zipArchiveEntry20.getLastModifiedDate();
        long long22 = zipArchiveEntry20.getTime();
        java.lang.String str23 = zipArchiveEntry20.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = zipArchiveEntry25.getExtraFields();
        zipArchiveEntry20.setExtraFields(zipExtraFieldArray26);
        zipArchiveEntry11.setExtraFields(zipExtraFieldArray26);
        byte[] byteArray29 = zipArchiveEntry11.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date32 = zipArchiveEntry31.getLastModifiedDate();
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry31.setName("hi!", byteArray36);
        long long38 = zipArchiveEntry31.getSize();
        zipArchiveEntry31.setExternalAttributes((long) (byte) 100);
        byte[] byteArray41 = zipArchiveEntry31.getCentralDirectoryExtra();
        zipArchiveEntry11.setCentralDirectoryExtra(byteArray41);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray41);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray9, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray17, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray26, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        zipArchiveEntry1.setUnixMode(0);
        zipArchiveEntry1.setPlatform(32);
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
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        long long4 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry7.setExtra();
        zipArchiveEntry7.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry7.setCentralDirectoryExtra(byteArray17);
        zipArchiveEntry1.setName("", byteArray17);
        zipArchiveEntry1.setTime((long) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        long long26 = zipArchiveEntry24.getTime();
        java.lang.String str27 = zipArchiveEntry24.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = zipArchiveEntry29.getExtraFields();
        zipArchiveEntry24.setExtraFields(zipExtraFieldArray30);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date34 = zipArchiveEntry33.getLastModifiedDate();
        long long35 = zipArchiveEntry33.getTime();
        java.lang.String str36 = zipArchiveEntry33.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray39 = zipArchiveEntry38.getExtraFields();
        zipArchiveEntry33.setExtraFields(zipExtraFieldArray39);
        zipArchiveEntry24.setExtraFields(zipExtraFieldArray39);
        byte[] byteArray42 = zipArchiveEntry24.getLocalFileDataExtra();
        int int43 = zipArchiveEntry24.getPlatform();
        java.util.Date date44 = zipArchiveEntry24.getLastModifiedDate();
        java.lang.Object obj45 = zipArchiveEntry24.clone();
        java.lang.String str46 = zipArchiveEntry24.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date49 = zipArchiveEntry48.getLastModifiedDate();
        long long50 = zipArchiveEntry48.getTime();
        java.lang.String str51 = zipArchiveEntry48.getComment();
        java.nio.file.attribute.FileTime fileTime52 = zipArchiveEntry48.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime53 = zipArchiveEntry48.getCreationTime();
        int int54 = zipArchiveEntry48.getMethod();
        zipArchiveEntry48.setMethod(1);
        int int57 = zipArchiveEntry48.getUnixMode();
        zipArchiveEntry48.setSize((long) (byte) 100);
        byte[] byteArray60 = zipArchiveEntry48.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry62.setExtra();
        byte[] byteArray64 = zipArchiveEntry62.getRawName();
        zipArchiveEntry62.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime67 = zipArchiveEntry62.getLastModifiedTime();
        zipArchiveEntry62.setInternalAttributes(8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry72 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry72.setExtra();
        zipArchiveEntry72.setName("");
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry72.setName("", byteArray81);
        zipArchiveEntry62.setName("", byteArray81);
        byte[] byteArray84 = zipArchiveEntry62.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry86 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry86.setPlatform(0);
        byte[] byteArray89 = zipArchiveEntry86.getLocalFileDataExtra();
        zipArchiveEntry62.setCentralDirectoryExtra(byteArray89);
        zipArchiveEntry48.setCentralDirectoryExtra(byteArray89);
        zipArchiveEntry24.setExtra(byteArray89);
        zipArchiveEntry1.setExtra(byteArray89);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray30, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(zipExtraFieldArray39);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray39, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(fileTime52);
        org.junit.Assert.assertNull(fileTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(byteArray60);
        org.junit.Assert.assertNull(byteArray64);
        org.junit.Assert.assertNull(fileTime67);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] {});
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        byte[] byteArray1 = zipArchiveEntry0.getCentralDirectoryExtra();
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry0.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray3 = zipArchiveEntry0.getExtraFields();
        zipArchiveEntry0.setSize(10L);
        java.lang.Object obj6 = zipArchiveEntry0.clone();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(zipExtraFieldArray3);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray3, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setExternalAttributes((long) 10);
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setExtra();
        byte[] byteArray12 = zipArchiveEntry10.getRawName();
        zipArchiveEntry10.setPlatform((int) (byte) 100);
        zipArchiveEntry10.setExternalAttributes((long) 10);
        long long17 = zipArchiveEntry10.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry19.setExtra();
        zipArchiveEntry19.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry24.setName("hi!", byteArray29);
        zipArchiveEntry19.setCentralDirectoryExtra(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry33.setExtra();
        byte[] byteArray35 = zipArchiveEntry33.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date38 = zipArchiveEntry37.getLastModifiedDate();
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry37.setName("hi!", byteArray42);
        zipArchiveEntry33.setExtra(byteArray42);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry33.setCentralDirectoryExtra(byteArray49);
        zipArchiveEntry33.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData53 = zipArchiveEntry33.getUnparseableExtraFieldData();
        zipArchiveEntry19.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData53);
        zipArchiveEntry10.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData53);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData53);
        int int57 = zipArchiveEntry1.getInternalAttributes();
        java.lang.String str58 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setUnixMode(8);
        java.util.Date date61 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray35);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry1.setName("", byteArray10);
        long long12 = zipArchiveEntry1.getSize();
        int int13 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray14 = zipArchiveEntry1.getLocalFileDataExtra();
        long long15 = zipArchiveEntry1.getCompressedSize();
        java.lang.Object obj16 = zipArchiveEntry1.clone();
        long long17 = zipArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        long long3 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray5 = zipArchiveEntry1.getLocalFileDataExtra();
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        int int9 = zipArchiveEntry1.getPlatform();
        byte[] byteArray10 = zipArchiveEntry1.getCentralDirectoryExtra();
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
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        long long3 = zipArchiveEntry1.getCrc();
        long long4 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit7 = zipArchiveEntry6.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setExtra();
        byte[] byteArray11 = zipArchiveEntry9.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date14 = zipArchiveEntry13.getLastModifiedDate();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry13.setName("hi!", byteArray18);
        zipArchiveEntry9.setExtra(byteArray18);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry9.setCentralDirectoryExtra(byteArray25);
        zipArchiveEntry9.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData29 = zipArchiveEntry9.getUnparseableExtraFieldData();
        zipArchiveEntry6.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData29);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData29);
        int int32 = zipArchiveEntry1.getUnixMode();
        java.nio.file.attribute.FileTime fileTime33 = zipArchiveEntry1.getCreationTime();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit7);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(fileTime33);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        int int4 = zipArchiveEntry1.getMethod();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setExtra();
        byte[] byteArray10 = zipArchiveEntry8.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry8.setExtra(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = zipArchiveEntry8.getExtraFields(false);
        zipArchiveEntry8.setExternalAttributes((long) (byte) 0);
        byte[] byteArray24 = zipArchiveEntry8.getExtra();
        zipArchiveEntry1.setExtra(byteArray24);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray21);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray21, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields(false);
        zipArchiveEntry1.setInternalAttributes((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = zipArchiveEntry1.getExtraField(zipShort10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = zipArchiveEntry1.getTimeLocal();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 15");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField11);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        long long27 = zipArchiveEntry1.getCompressedSize();
        byte[] byteArray28 = zipArchiveEntry1.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData29 = zipArchiveEntry1.getUnparseableExtraFieldData();
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNull(unparseableExtraFieldData29);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        long long4 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setExternalAttributes((long) 3);
        zipArchiveEntry1.setUnixMode((int) (short) 100);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit9);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setMethod((int) (byte) 0);
        int int7 = zipArchiveEntry1.getInternalAttributes();
        int int8 = zipArchiveEntry1.getPlatform();
        java.lang.Object obj9 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setUnixMode((int) (short) 1);
        int int12 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        long long4 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setPlatform((int) (byte) -1);
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
        java.nio.file.attribute.FileTime fileTime72 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setInternalAttributes(0);
        zipArchiveEntry1.setCrc((long) (byte) 100);
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
        org.junit.Assert.assertNull(fileTime72);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = zipArchiveEntry8.getExtraField(zipShort10);
        long long12 = zipArchiveEntry8.getCompressedSize();
        java.lang.String str13 = zipArchiveEntry8.getComment();
        zipArchiveEntry8.setComment("");
        zipArchiveEntry8.setCompressedSize(3L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry19.setExtra();
        byte[] byteArray21 = zipArchiveEntry19.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date24 = zipArchiveEntry23.getLastModifiedDate();
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry23.setName("hi!", byteArray28);
        zipArchiveEntry19.setExtra(byteArray28);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry19.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = zipArchiveEntry19.getExtraFields(true);
        zipArchiveEntry8.setExtraFields(zipExtraFieldArray34);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry38.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date42 = zipArchiveEntry41.getLastModifiedDate();
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry41.setName("hi!", byteArray46);
        zipArchiveEntry38.setExtra(byteArray46);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort49 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField50 = zipArchiveEntry38.getExtraField(zipShort49);
        boolean boolean51 = zipArchiveEntry38.isDirectory();
        int int52 = zipArchiveEntry38.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry54.setExtra();
        byte[] byteArray56 = zipArchiveEntry54.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date59 = zipArchiveEntry58.getLastModifiedDate();
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry58.setName("hi!", byteArray63);
        zipArchiveEntry54.setExtra(byteArray63);
        long long66 = zipArchiveEntry54.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date70 = zipArchiveEntry69.getLastModifiedDate();
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry69.setName("hi!", byteArray74);
        zipArchiveEntry54.setName("", byteArray74);
        byte[] byteArray77 = zipArchiveEntry54.getRawName();
        zipArchiveEntry38.setExtra(byteArray77);
        zipArchiveEntry38.setSize((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry82 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry82.setPlatform(0);
        zipArchiveEntry82.setTime((long) (short) -1);
        byte[] byteArray87 = zipArchiveEntry82.getCentralDirectoryExtra();
        int int88 = zipArchiveEntry82.getInternalAttributes();
        byte[] byteArray89 = zipArchiveEntry82.getRawName();
        byte[] byteArray90 = zipArchiveEntry82.getLocalFileDataExtra();
        zipArchiveEntry38.setCentralDirectoryExtra(byteArray90);
        zipArchiveEntry8.setName("", byteArray90);
        zipArchiveEntry1.setName("hi!", byteArray90);
        byte[] byteArray94 = zipArchiveEntry1.getExtra();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(zipExtraField11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray32, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray34, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(byteArray56);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] {});
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNull(byteArray89);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] {});
        org.junit.Assert.assertNull(byteArray94);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setCompressedSize((long) (short) 10);
        int int7 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = zipArchiveEntry1.getExtraField(zipShort8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(zipExtraField9);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.lang.String str7 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = zipArchiveEntry10.getGeneralPurposeBit();
        long long12 = zipArchiveEntry10.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = zipArchiveEntry10.getExtraFields();
        byte[] byteArray14 = zipArchiveEntry10.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray14);
        zipArchiveEntry1.setMethod(52);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray8, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray13, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = zipArchiveEntry1.getExtraField(zipShort12);
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setCompressedSize(1L);
        zipArchiveEntry1.setTime((long) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit22 = zipArchiveEntry21.getGeneralPurposeBit();
        int int23 = zipArchiveEntry21.getMethod();
        long long24 = zipArchiveEntry21.getCompressedSize();
        zipArchiveEntry21.setMethod((int) (byte) 0);
        int int27 = zipArchiveEntry21.getInternalAttributes();
        int int28 = zipArchiveEntry21.getPlatform();
        int int29 = zipArchiveEntry21.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = zipArchiveEntry21.getExtraFields();
        java.util.Date date31 = zipArchiveEntry21.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray33 = zipArchiveEntry21.getExtraFields(false);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray33);
        zipArchiveEntry1.setExternalAttributes(0L);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertNotNull(generalPurposeBit22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray30, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(zipExtraFieldArray33);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray33, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.lang.String str5 = zipArchiveEntry1.getName();
        long long6 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setPlatform(100);
        zipArchiveEntry1.setSize(97L);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        byte[] byteArray1 = zipArchiveEntry0.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField3 = zipArchiveEntry0.getExtraField(zipShort2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = zipArchiveEntry0.getExtraField(zipShort4);
        boolean boolean6 = zipArchiveEntry0.isDirectory();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNull(zipExtraField3);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        long long8 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setTime(10L);
        zipArchiveEntry1.setInternalAttributes((int) (short) 100);
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData17 = zipArchiveEntry15.getUnparseableExtraFieldData();
        java.lang.Object obj18 = zipArchiveEntry15.clone();
        zipArchiveEntry15.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit23 = zipArchiveEntry22.getGeneralPurposeBit();
        zipArchiveEntry22.setTime((long) (byte) 10);
        long long26 = zipArchiveEntry22.getCrc();
        int int27 = zipArchiveEntry22.getPlatform();
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
        boolean boolean45 = zipArchiveEntry29.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit46 = zipArchiveEntry29.getGeneralPurposeBit();
        zipArchiveEntry22.setGeneralPurposeBit(generalPurposeBit46);
        zipArchiveEntry15.setGeneralPurposeBit(generalPurposeBit46);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date51 = zipArchiveEntry50.getLastModifiedDate();
        long long52 = zipArchiveEntry50.getTime();
        java.lang.String str53 = zipArchiveEntry50.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray56 = zipArchiveEntry55.getExtraFields();
        zipArchiveEntry50.setExtraFields(zipExtraFieldArray56);
        long long58 = zipArchiveEntry50.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry60.setExtra();
        zipArchiveEntry60.setTime(0L);
        zipArchiveEntry60.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime66 = zipArchiveEntry60.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry67 = zipArchiveEntry50.setLastAccessTime(fileTime66);
        java.util.zip.ZipEntry zipEntry68 = zipArchiveEntry15.setLastAccessTime(fileTime66);
        java.util.zip.ZipEntry zipEntry69 = zipArchiveEntry1.setLastModifiedTime(fileTime66);
        int int70 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertNull(unparseableExtraFieldData17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(generalPurposeBit23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(byteArray31);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNull(zipExtraField43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit46);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(zipExtraFieldArray56);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray56, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(fileTime66);
        org.junit.Assert.assertNotNull(zipEntry67);
        org.junit.Assert.assertEquals(zipEntry67.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry68);
        org.junit.Assert.assertEquals(zipEntry68.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry69);
        org.junit.Assert.assertEquals(zipEntry69.toString(), "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        zipArchiveEntry19.setPlatform(0);
        zipArchiveEntry19.setTime((long) (short) -1);
        byte[] byteArray24 = zipArchiveEntry19.getCentralDirectoryExtra();
        int int25 = zipArchiveEntry19.getInternalAttributes();
        byte[] byteArray26 = zipArchiveEntry19.getRawName();
        byte[] byteArray27 = zipArchiveEntry19.getLocalFileDataExtra();
        java.nio.file.attribute.FileTime fileTime28 = zipArchiveEntry19.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date31 = zipArchiveEntry30.getLastModifiedDate();
        long long32 = zipArchiveEntry30.getTime();
        java.lang.String str33 = zipArchiveEntry30.getComment();
        zipArchiveEntry30.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray36 = zipArchiveEntry30.getExtraFields();
        byte[] byteArray37 = zipArchiveEntry30.getLocalFileDataExtra();
        byte[] byteArray38 = zipArchiveEntry30.getLocalFileDataExtra();
        zipArchiveEntry30.setCompressedSize((long) (byte) 0);
        byte[] byteArray41 = zipArchiveEntry30.getExtra();
        byte[] byteArray42 = zipArchiveEntry30.getLocalFileDataExtra();
        zipArchiveEntry19.setExtra(byteArray42);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray45 = zipArchiveEntry19.getExtraFields(false);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray45);
        int int47 = zipArchiveEntry1.getPlatform();
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
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNull(fileTime28);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(zipExtraFieldArray36);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray36, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNull(byteArray41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray45);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray45, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        zipArchiveEntry1.setInternalAttributes((int) 'a');
        java.nio.file.attribute.FileTime fileTime41 = zipArchiveEntry1.getLastAccessTime();
        long long42 = zipArchiveEntry1.getCompressedSize();
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
        org.junit.Assert.assertNull(fileTime41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.lang.String str7 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = zipArchiveEntry1.getExtraFields();
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date12 = zipArchiveEntry11.getLastModifiedDate();
        long long13 = zipArchiveEntry11.getTime();
        java.lang.String str14 = zipArchiveEntry11.getComment();
        zipArchiveEntry11.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = zipArchiveEntry11.getExtraFields();
        long long18 = zipArchiveEntry11.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date24 = zipArchiveEntry23.getLastModifiedDate();
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry23.setName("hi!", byteArray28);
        zipArchiveEntry20.setExtra(byteArray28);
        long long31 = zipArchiveEntry20.getCompressedSize();
        zipArchiveEntry20.setCompressedSize((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit36 = zipArchiveEntry35.getGeneralPurposeBit();
        long long37 = zipArchiveEntry35.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = zipArchiveEntry35.getExtraFields();
        byte[] byteArray39 = zipArchiveEntry35.getLocalFileDataExtra();
        java.lang.Object obj40 = zipArchiveEntry35.clone();
        java.nio.file.attribute.FileTime fileTime41 = zipArchiveEntry35.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit44 = zipArchiveEntry43.getGeneralPurposeBit();
        long long45 = zipArchiveEntry43.getCrc();
        long long46 = zipArchiveEntry43.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit49 = zipArchiveEntry48.getGeneralPurposeBit();
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
        zipArchiveEntry48.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData71);
        zipArchiveEntry43.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData71);
        zipArchiveEntry35.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData71);
        zipArchiveEntry20.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData71);
        zipArchiveEntry11.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData71);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData71);
        java.nio.file.attribute.FileTime fileTime78 = zipArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray8, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray17, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray38, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "");
        org.junit.Assert.assertNull(fileTime41);
        org.junit.Assert.assertNotNull(generalPurposeBit44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit49);
        org.junit.Assert.assertNull(byteArray53);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData71);
        org.junit.Assert.assertNull(fileTime78);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        boolean boolean8 = zipArchiveEntry1.isDirectory();
        long long9 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry11.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date15 = zipArchiveEntry14.getLastModifiedDate();
        long long16 = zipArchiveEntry14.getTime();
        java.lang.String str17 = zipArchiveEntry14.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = zipArchiveEntry19.getExtraFields();
        zipArchiveEntry14.setExtraFields(zipExtraFieldArray20);
        zipArchiveEntry11.setExtraFields(zipExtraFieldArray20);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray20);
        java.lang.Object obj24 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date27 = zipArchiveEntry26.getLastModifiedDate();
        long long28 = zipArchiveEntry26.getTime();
        java.lang.String str29 = zipArchiveEntry26.getComment();
        zipArchiveEntry26.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry26.getExtraFields();
        byte[] byteArray33 = zipArchiveEntry26.getLocalFileDataExtra();
        byte[] byteArray34 = zipArchiveEntry26.getCentralDirectoryExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray12, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray20, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray32, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray6);
        zipArchiveEntry1.setInternalAttributes((int) (byte) 0);
        java.lang.String str10 = zipArchiveEntry1.getName();
        int int11 = zipArchiveEntry1.getUnixMode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray6, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setComment("");
        java.lang.String str9 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setTime(0L);
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry1.getCreationTime();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(fileTime12);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        int int5 = zipArchiveEntry1.getMethod();
        int int6 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setMethod((int) ' ');
        java.lang.Object obj9 = zipArchiveEntry1.clone();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        byte[] byteArray22 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        byte[] byteArray1 = zipArchiveEntry0.getExtra();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray3 = zipArchiveEntry0.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry0.removeExtraField(zipShort4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray1);
        org.junit.Assert.assertNotNull(zipExtraFieldArray3);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray3, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        boolean boolean8 = zipArchiveEntry1.isDirectory();
        long long9 = zipArchiveEntry1.getCompressedSize();
        java.lang.Object obj10 = zipArchiveEntry1.clone();
        int int11 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        zipArchiveEntry13.setUnixMode(0);
        byte[] byteArray16 = zipArchiveEntry13.getExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date19 = zipArchiveEntry18.getLastModifiedDate();
        long long20 = zipArchiveEntry18.getTime();
        java.lang.String str21 = zipArchiveEntry18.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = zipArchiveEntry23.getExtraFields();
        zipArchiveEntry18.setExtraFields(zipExtraFieldArray24);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date28 = zipArchiveEntry27.getLastModifiedDate();
        long long29 = zipArchiveEntry27.getTime();
        java.lang.String str30 = zipArchiveEntry27.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray33 = zipArchiveEntry32.getExtraFields();
        zipArchiveEntry27.setExtraFields(zipExtraFieldArray33);
        zipArchiveEntry18.setExtraFields(zipExtraFieldArray33);
        zipArchiveEntry18.setInternalAttributes(100);
        zipArchiveEntry18.setTime(0L);
        zipArchiveEntry18.setCompressedSize((long) 100);
        java.nio.file.attribute.FileTime fileTime42 = zipArchiveEntry18.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry44.setExtra();
        byte[] byteArray46 = zipArchiveEntry44.getRawName();
        zipArchiveEntry44.setPlatform((int) (byte) 100);
        long long49 = zipArchiveEntry44.getSize();
        java.nio.file.attribute.FileTime fileTime50 = zipArchiveEntry44.getLastModifiedTime();
        long long51 = zipArchiveEntry44.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort52 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField53 = zipArchiveEntry44.getExtraField(zipShort52);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit56 = zipArchiveEntry55.getGeneralPurposeBit();
        long long57 = zipArchiveEntry55.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray58 = zipArchiveEntry55.getExtraFields();
        zipArchiveEntry44.setExtraFields(zipExtraFieldArray58);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort60 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField61 = zipArchiveEntry44.getExtraField(zipShort60);
        zipArchiveEntry44.setUnixMode((int) '4');
        long long64 = zipArchiveEntry44.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry66 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry66.setPlatform(0);
        java.lang.String str69 = zipArchiveEntry66.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray70 = zipArchiveEntry66.getExtraFields();
        zipArchiveEntry66.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry74 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry74.setExtra();
        zipArchiveEntry74.setTime(0L);
        zipArchiveEntry74.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime80 = zipArchiveEntry74.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry81 = zipArchiveEntry66.setCreationTime(fileTime80);
        java.util.zip.ZipEntry zipEntry82 = zipArchiveEntry44.setLastAccessTime(fileTime80);
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry18.setLastModifiedTime(fileTime80);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry13.setLastAccessTime(fileTime80);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry1.setLastModifiedTime(fileTime80);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray24, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(zipExtraFieldArray33);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray33, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime42);
        org.junit.Assert.assertNull(byteArray46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertNull(fileTime50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertNull(zipExtraField53);
        org.junit.Assert.assertNotNull(generalPurposeBit56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray58);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray58, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField61);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(zipExtraFieldArray70);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray70, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime80);
        org.junit.Assert.assertNotNull(zipEntry81);
        org.junit.Assert.assertEquals(zipEntry81.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry82);
        org.junit.Assert.assertEquals(zipEntry82.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setExternalAttributes((long) 1);
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setPlatform(100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry1.getExtraFields();
        java.lang.String str13 = zipArchiveEntry1.getComment();
        int int14 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray12, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (byte) 10);
        long long5 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit13 = zipArchiveEntry12.getGeneralPurposeBit();
        int int14 = zipArchiveEntry12.getMethod();
        zipArchiveEntry12.setCompressedSize((long) (-1));
        zipArchiveEntry12.setExternalAttributes((long) 'a');
        zipArchiveEntry12.setComment("");
        byte[] byteArray21 = zipArchiveEntry12.getExtra();
        zipArchiveEntry12.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry24.setExtra();
        byte[] byteArray26 = zipArchiveEntry24.getRawName();
        zipArchiveEntry24.setPlatform((int) (byte) 100);
        long long29 = zipArchiveEntry24.getSize();
        java.nio.file.attribute.FileTime fileTime30 = zipArchiveEntry24.getLastModifiedTime();
        long long31 = zipArchiveEntry24.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort32 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField33 = zipArchiveEntry24.getExtraField(zipShort32);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit36 = zipArchiveEntry35.getGeneralPurposeBit();
        long long37 = zipArchiveEntry35.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = zipArchiveEntry35.getExtraFields();
        zipArchiveEntry24.setExtraFields(zipExtraFieldArray38);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField41 = zipArchiveEntry24.getExtraField(zipShort40);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry43.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData45 = zipArchiveEntry43.getUnparseableExtraFieldData();
        int int46 = zipArchiveEntry43.getMethod();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray47 = zipArchiveEntry43.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry49 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry49.setExtra();
        zipArchiveEntry49.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date55 = zipArchiveEntry54.getLastModifiedDate();
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry54.setName("hi!", byteArray59);
        zipArchiveEntry49.setCentralDirectoryExtra(byteArray59);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry63.setExtra();
        byte[] byteArray65 = zipArchiveEntry63.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry67 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date68 = zipArchiveEntry67.getLastModifiedDate();
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry67.setName("hi!", byteArray72);
        zipArchiveEntry63.setExtra(byteArray72);
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry63.setCentralDirectoryExtra(byteArray79);
        zipArchiveEntry63.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData83 = zipArchiveEntry63.getUnparseableExtraFieldData();
        zipArchiveEntry49.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData83);
        zipArchiveEntry43.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData83);
        zipArchiveEntry24.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData83);
        zipArchiveEntry12.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData83);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData83);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData8);
        org.junit.Assert.assertNotNull(generalPurposeBit13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertNull(byteArray26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNull(fileTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNull(zipExtraField33);
        org.junit.Assert.assertNotNull(generalPurposeBit36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray38, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField41);
        org.junit.Assert.assertNull(unparseableExtraFieldData45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray47);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray47, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray65);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData83);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit17 = zipArchiveEntry16.getGeneralPurposeBit();
        zipArchiveEntry16.setTime((long) (byte) 10);
        long long20 = zipArchiveEntry16.getCrc();
        zipArchiveEntry16.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData23 = zipArchiveEntry16.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime24 = zipArchiveEntry16.getTimeLocal();
        zipArchiveEntry1.setTimeLocal(localDateTime24);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry27.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date31 = zipArchiveEntry30.getLastModifiedDate();
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry30.setName("hi!", byteArray35);
        zipArchiveEntry27.setExtra(byteArray35);
        byte[] byteArray38 = zipArchiveEntry27.getExtra();
        zipArchiveEntry1.setExtra(byteArray38);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setExtra();
        zipArchiveEntry41.setName("");
        zipArchiveEntry41.setInternalAttributes(35);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry48.setPlatform(0);
        zipArchiveEntry48.setTime((long) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry54.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date58 = zipArchiveEntry57.getLastModifiedDate();
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry57.setName("hi!", byteArray62);
        zipArchiveEntry54.setExtra(byteArray62);
        long long65 = zipArchiveEntry54.getCompressedSize();
        zipArchiveEntry54.setCrc(0L);
        byte[] byteArray68 = zipArchiveEntry54.getExtra();
        zipArchiveEntry48.setCentralDirectoryExtra(byteArray68);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry71 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date72 = zipArchiveEntry71.getLastModifiedDate();
        long long73 = zipArchiveEntry71.getTime();
        java.lang.String str74 = zipArchiveEntry71.getComment();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit75 = zipArchiveEntry71.getGeneralPurposeBit();
        zipArchiveEntry48.setGeneralPurposeBit(generalPurposeBit75);
        zipArchiveEntry41.setGeneralPurposeBit(generalPurposeBit75);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit75);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(generalPurposeBit75);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        java.lang.String str95 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData96 = zipArchiveEntry1.getUnparseableExtraFieldData();
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
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(unparseableExtraFieldData96);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        long long5 = zipArchiveEntry1.getExternalAttributes();
        long long6 = zipArchiveEntry1.getCrc();
        long long7 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setExtra();
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
        long long25 = zipArchiveEntry10.getExternalAttributes();
        zipArchiveEntry10.setCrc((long) (byte) 10);
        int int28 = zipArchiveEntry10.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry30.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date34 = zipArchiveEntry33.getLastModifiedDate();
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry33.setName("hi!", byteArray38);
        zipArchiveEntry30.setExtra(byteArray38);
        zipArchiveEntry10.setExtra(byteArray38);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry43.setExtra();
        byte[] byteArray45 = zipArchiveEntry43.getRawName();
        zipArchiveEntry43.setPlatform((int) (byte) 100);
        zipArchiveEntry43.setExternalAttributes((long) 10);
        long long50 = zipArchiveEntry43.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry52.setExtra();
        zipArchiveEntry52.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date58 = zipArchiveEntry57.getLastModifiedDate();
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry57.setName("hi!", byteArray62);
        zipArchiveEntry52.setCentralDirectoryExtra(byteArray62);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry66 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry66.setExtra();
        byte[] byteArray68 = zipArchiveEntry66.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry70 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date71 = zipArchiveEntry70.getLastModifiedDate();
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry70.setName("hi!", byteArray75);
        zipArchiveEntry66.setExtra(byteArray75);
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry66.setCentralDirectoryExtra(byteArray82);
        zipArchiveEntry66.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData86 = zipArchiveEntry66.getUnparseableExtraFieldData();
        zipArchiveEntry52.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData86);
        zipArchiveEntry43.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData86);
        zipArchiveEntry10.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData86);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData86);
        int int91 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(zipExtraField24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray45);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray68);
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData86);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date10 = zipArchiveEntry9.getLastModifiedDate();
        long long11 = zipArchiveEntry9.getTime();
        long long12 = zipArchiveEntry9.getSize();
        zipArchiveEntry9.setCrc((long) 8);
        java.lang.String str15 = zipArchiveEntry9.getComment();
        boolean boolean16 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry9);
        long long17 = zipArchiveEntry9.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date21 = zipArchiveEntry20.getLastModifiedDate();
        long long22 = zipArchiveEntry20.getTime();
        java.lang.String str23 = zipArchiveEntry20.getComment();
        java.nio.file.attribute.FileTime fileTime24 = zipArchiveEntry20.getLastAccessTime();
        zipArchiveEntry20.setPlatform((int) (byte) 1);
        byte[] byteArray27 = zipArchiveEntry20.getExtra();
        byte[] byteArray28 = zipArchiveEntry20.getCentralDirectoryExtra();
        zipArchiveEntry9.setName("hi!", byteArray28);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 8L + "'", long17 == 8L);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(fileTime24);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setCrc(0L);
        long long10 = zipArchiveEntry1.getTime();
        long long11 = zipArchiveEntry1.getTime();
        java.lang.Object obj12 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setCrc((long) 0);
        long long15 = zipArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        byte[] byteArray16 = zipArchiveEntry1.getRawName();
        byte[] byteArray17 = zipArchiveEntry1.getRawName();
        byte[] byteArray18 = zipArchiveEntry1.getCentralDirectoryExtra();
        byte[] byteArray19 = zipArchiveEntry1.getExtra();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(unparseableExtraFieldData15);
        org.junit.Assert.assertNull(byteArray16);
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        long long8 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setTime(10L);
        java.util.Date date11 = zipArchiveEntry1.getLastModifiedDate();
        int int12 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        int int7 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setCompressedSize(8L);
        java.lang.String str10 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        int int3 = zipArchiveEntry1.getMethod();
        long long4 = zipArchiveEntry1.getCompressedSize();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        long long6 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = zipArchiveEntry1.getExtraField(zipShort9);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setPlatform(0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = zipArchiveEntry13.getExtraField(zipShort16);
        byte[] byteArray18 = zipArchiveEntry13.getLocalFileDataExtra();
        zipArchiveEntry1.setName("", byteArray18);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit20 = zipArchiveEntry1.getGeneralPurposeBit();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(zipExtraField10);
        org.junit.Assert.assertNull(zipExtraField17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit20);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        long long13 = zipArchiveEntry1.getExternalAttributes();
        int int14 = zipArchiveEntry1.getPlatform();
        int int15 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry18.setExtra();
        zipArchiveEntry18.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date24 = zipArchiveEntry23.getLastModifiedDate();
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry23.setName("hi!", byteArray28);
        zipArchiveEntry18.setCentralDirectoryExtra(byteArray28);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setExtra();
        byte[] byteArray34 = zipArchiveEntry32.getRawName();
        zipArchiveEntry32.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime37 = zipArchiveEntry32.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit41 = zipArchiveEntry40.getGeneralPurposeBit();
        int int42 = zipArchiveEntry40.getMethod();
        long long43 = zipArchiveEntry40.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry46.setExtra();
        zipArchiveEntry46.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date52 = zipArchiveEntry51.getLastModifiedDate();
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry51.setName("hi!", byteArray56);
        zipArchiveEntry46.setCentralDirectoryExtra(byteArray56);
        zipArchiveEntry40.setName("hi!", byteArray56);
        zipArchiveEntry32.setName("", byteArray56);
        zipArchiveEntry18.setExtra(byteArray56);
        zipArchiveEntry1.setName("", byteArray56);
        long long63 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertNull(fileTime37);
        org.junit.Assert.assertNotNull(generalPurposeBit41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setExtra();
        byte[] byteArray10 = zipArchiveEntry8.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry8.setExtra(byteArray17);
        long long20 = zipArchiveEntry8.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date24 = zipArchiveEntry23.getLastModifiedDate();
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry23.setName("hi!", byteArray28);
        zipArchiveEntry8.setName("", byteArray28);
        zipArchiveEntry1.setName("hi!", byteArray28);
        java.lang.String str32 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setInternalAttributes((int) (short) 1);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        long long30 = zipArchiveEntry15.getExternalAttributes();
        zipArchiveEntry15.setCrc((long) (byte) 10);
        int int33 = zipArchiveEntry15.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry35.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date39 = zipArchiveEntry38.getLastModifiedDate();
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry38.setName("hi!", byteArray43);
        zipArchiveEntry35.setExtra(byteArray43);
        zipArchiveEntry15.setExtra(byteArray43);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry48.setExtra();
        byte[] byteArray50 = zipArchiveEntry48.getRawName();
        zipArchiveEntry48.setPlatform((int) (byte) 100);
        long long53 = zipArchiveEntry48.getSize();
        java.nio.file.attribute.FileTime fileTime54 = zipArchiveEntry48.getLastModifiedTime();
        long long55 = zipArchiveEntry48.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort56 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField57 = zipArchiveEntry48.getExtraField(zipShort56);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit60 = zipArchiveEntry59.getGeneralPurposeBit();
        long long61 = zipArchiveEntry59.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray62 = zipArchiveEntry59.getExtraFields();
        zipArchiveEntry48.setExtraFields(zipExtraFieldArray62);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort64 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField65 = zipArchiveEntry48.getExtraField(zipShort64);
        zipArchiveEntry48.setUnixMode((int) '4');
        long long68 = zipArchiveEntry48.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry70 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry70.setPlatform(0);
        java.lang.String str73 = zipArchiveEntry70.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray74 = zipArchiveEntry70.getExtraFields();
        zipArchiveEntry70.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry78 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry78.setExtra();
        zipArchiveEntry78.setTime(0L);
        zipArchiveEntry78.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime84 = zipArchiveEntry78.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry70.setCreationTime(fileTime84);
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry48.setLastAccessTime(fileTime84);
        java.util.zip.ZipEntry zipEntry87 = zipArchiveEntry15.setCreationTime(fileTime84);
        java.nio.file.attribute.FileTime fileTime88 = zipArchiveEntry15.getCreationTime();
        java.util.zip.ZipEntry zipEntry89 = zipArchiveEntry12.setLastAccessTime(fileTime88);
        zipArchiveEntry12.setUnixMode((int) (byte) -1);
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
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(zipExtraField29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertNull(fileTime54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNull(zipExtraField57);
        org.junit.Assert.assertNotNull(generalPurposeBit60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray62);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray62, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(zipExtraField65);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(zipExtraFieldArray74);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray74, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(fileTime84);
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry86);
        org.junit.Assert.assertEquals(zipEntry86.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry87);
        org.junit.Assert.assertEquals(zipEntry87.toString(), "");
        org.junit.Assert.assertNotNull(fileTime88);
        org.junit.Assert.assertNotNull(zipEntry89);
        org.junit.Assert.assertEquals(zipEntry89.toString(), "");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = zipArchiveEntry1.getExtraFields(false);
        java.lang.String str25 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setUnixMode((int) (short) 1);
        java.lang.String str28 = zipArchiveEntry1.getName();
        java.util.Date date29 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray24, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setPlatform((int) (byte) 1);
        byte[] byteArray8 = zipArchiveEntry1.getExtra();
        java.lang.Class<?> wildcardClass9 = zipArchiveEntry1.getClass();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry1.setName("hi!", byteArray6);
        long long8 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setExternalAttributes((long) (byte) 100);
        byte[] byteArray11 = zipArchiveEntry1.getCentralDirectoryExtra();
        long long12 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        int int15 = zipArchiveEntry1.getInternalAttributes();
        java.nio.file.attribute.FileTime fileTime16 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setComment("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(fileTime16);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setName("");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        zipArchiveEntry1.setName("", byteArray10);
        zipArchiveEntry1.setCompressedSize((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit16 = zipArchiveEntry15.getGeneralPurposeBit();
        zipArchiveEntry15.setTime((long) (byte) 10);
        long long19 = zipArchiveEntry15.getCrc();
        int int20 = zipArchiveEntry15.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry22.setExtra();
        byte[] byteArray24 = zipArchiveEntry22.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date27 = zipArchiveEntry26.getLastModifiedDate();
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry26.setName("hi!", byteArray31);
        zipArchiveEntry22.setExtra(byteArray31);
        long long34 = zipArchiveEntry22.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort35 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField36 = zipArchiveEntry22.getExtraField(zipShort35);
        boolean boolean38 = zipArchiveEntry22.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit39 = zipArchiveEntry22.getGeneralPurposeBit();
        zipArchiveEntry15.setGeneralPurposeBit(generalPurposeBit39);
        byte[] byteArray41 = zipArchiveEntry15.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit44 = zipArchiveEntry43.getGeneralPurposeBit();
        int int45 = zipArchiveEntry43.getMethod();
        zipArchiveEntry43.setCompressedSize((long) (-1));
        zipArchiveEntry43.setExternalAttributes((long) 'a');
        zipArchiveEntry43.setCompressedSize((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit54 = zipArchiveEntry53.getGeneralPurposeBit();
        zipArchiveEntry53.setTime((long) (byte) 10);
        long long57 = zipArchiveEntry53.getCrc();
        zipArchiveEntry53.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData60 = zipArchiveEntry53.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime61 = zipArchiveEntry53.getTimeLocal();
        zipArchiveEntry43.setTimeLocal(localDateTime61);
        zipArchiveEntry15.setTimeLocal(localDateTime61);
        zipArchiveEntry1.setTimeLocal(localDateTime61);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray66 = zipArchiveEntry1.getExtraFields(false);
        java.time.LocalDateTime localDateTime67 = zipArchiveEntry1.getTimeLocal();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry68 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(generalPurposeBit16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(zipExtraField36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit39);
        org.junit.Assert.assertNull(byteArray41);
        org.junit.Assert.assertNotNull(generalPurposeBit44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(generalPurposeBit54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(zipExtraFieldArray66);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray66, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(localDateTime67);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        long long5 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date8 = zipArchiveEntry7.getLastModifiedDate();
        long long9 = zipArchiveEntry7.getTime();
        long long10 = zipArchiveEntry7.getSize();
        zipArchiveEntry7.setCrc((long) 8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit15 = zipArchiveEntry14.getGeneralPurposeBit();
        zipArchiveEntry14.setTime((long) (byte) 10);
        long long18 = zipArchiveEntry14.getCrc();
        int int19 = zipArchiveEntry14.getPlatform();
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
        boolean boolean37 = zipArchiveEntry21.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit38 = zipArchiveEntry21.getGeneralPurposeBit();
        zipArchiveEntry14.setGeneralPurposeBit(generalPurposeBit38);
        byte[] byteArray40 = zipArchiveEntry14.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit43 = zipArchiveEntry42.getGeneralPurposeBit();
        int int44 = zipArchiveEntry42.getMethod();
        zipArchiveEntry42.setCompressedSize((long) (-1));
        zipArchiveEntry42.setExternalAttributes((long) 'a');
        zipArchiveEntry42.setCompressedSize((long) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit53 = zipArchiveEntry52.getGeneralPurposeBit();
        zipArchiveEntry52.setTime((long) (byte) 10);
        long long56 = zipArchiveEntry52.getCrc();
        zipArchiveEntry52.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData59 = zipArchiveEntry52.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime60 = zipArchiveEntry52.getTimeLocal();
        zipArchiveEntry42.setTimeLocal(localDateTime60);
        zipArchiveEntry14.setTimeLocal(localDateTime60);
        zipArchiveEntry7.setTimeLocal(localDateTime60);
        zipArchiveEntry1.setTimeLocal(localDateTime60);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData65 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(zipExtraField35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit38);
        org.junit.Assert.assertNull(byteArray40);
        org.junit.Assert.assertNotNull(generalPurposeBit43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(generalPurposeBit53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData59);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNull(unparseableExtraFieldData65);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        int int7 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setMethod(1);
        zipArchiveEntry1.setSize(100L);
        java.lang.Object obj12 = zipArchiveEntry1.clone();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        byte[] byteArray41 = zipArchiveEntry1.getExtra();
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
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        boolean boolean8 = zipArchiveEntry1.isDirectory();
        long long9 = zipArchiveEntry1.getCompressedSize();
        int int10 = zipArchiveEntry1.getInternalAttributes();
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry1.getLastAccessTime();
        byte[] byteArray12 = zipArchiveEntry1.getLocalFileDataExtra();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        java.nio.file.attribute.FileTime fileTime41 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry43.setPlatform(0);
        zipArchiveEntry43.setTime((long) (short) -1);
        byte[] byteArray48 = zipArchiveEntry43.getCentralDirectoryExtra();
        byte[] byteArray49 = zipArchiveEntry43.getRawName();
        long long50 = zipArchiveEntry43.getCompressedSize();
        byte[] byteArray51 = zipArchiveEntry43.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry53.setPlatform(0);
        zipArchiveEntry53.setTime((long) (short) -1);
        byte[] byteArray58 = zipArchiveEntry53.getCentralDirectoryExtra();
        int int59 = zipArchiveEntry53.getInternalAttributes();
        java.time.LocalDateTime localDateTime60 = zipArchiveEntry53.getTimeLocal();
        zipArchiveEntry43.setTimeLocal(localDateTime60);
        zipArchiveEntry1.setTimeLocal(localDateTime60);
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
        org.junit.Assert.assertNull(fileTime41);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(localDateTime60);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastModifiedTime();
        java.util.Date date7 = zipArchiveEntry1.getLastModifiedDate();
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        boolean boolean15 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setPlatform((int) ' ');
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort7);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        int int7 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setExternalAttributes((long) 'a');
        byte[] byteArray10 = zipArchiveEntry1.getExtra();
        byte[] byteArray11 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setExtra();
        byte[] byteArray15 = zipArchiveEntry13.getRawName();
        zipArchiveEntry13.setPlatform((int) (byte) 100);
        long long18 = zipArchiveEntry13.getSize();
        long long19 = zipArchiveEntry13.getTime();
        long long20 = zipArchiveEntry13.getCrc();
        long long21 = zipArchiveEntry13.getCrc();
        long long22 = zipArchiveEntry13.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry24.setExtra();
        byte[] byteArray26 = zipArchiveEntry24.getRawName();
        zipArchiveEntry24.setPlatform((int) (byte) 100);
        zipArchiveEntry24.setExternalAttributes((long) 10);
        long long31 = zipArchiveEntry24.getCrc();
        int int32 = zipArchiveEntry24.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry34.setExtra();
        zipArchiveEntry34.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date40 = zipArchiveEntry39.getLastModifiedDate();
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry39.setName("hi!", byteArray44);
        zipArchiveEntry34.setCentralDirectoryExtra(byteArray44);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry48.setExtra();
        byte[] byteArray50 = zipArchiveEntry48.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date53 = zipArchiveEntry52.getLastModifiedDate();
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry52.setName("hi!", byteArray57);
        zipArchiveEntry48.setExtra(byteArray57);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry48.setCentralDirectoryExtra(byteArray64);
        zipArchiveEntry48.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData68 = zipArchiveEntry48.getUnparseableExtraFieldData();
        zipArchiveEntry34.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData68);
        zipArchiveEntry24.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData68);
        zipArchiveEntry13.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData68);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData68);
        java.util.Date date73 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort74 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort74);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(byteArray26);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray50);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData68);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setPlatform(0);
        long long4 = zipArchiveEntry1.getTime();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setCrc(6553601L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit6 = zipArchiveEntry1.getGeneralPurposeBit();
        long long7 = zipArchiveEntry1.getCrc();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getCreationTime();
        int int9 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setName("hi!");
        byte[] byteArray5 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setExternalAttributes((long) (-1));
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        zipArchiveEntry1.setExternalAttributes(97L);
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField22);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
        zipArchiveEntry1.setExternalAttributes((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        zipArchiveEntry1.setCompressedSize((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = zipArchiveEntry1.getExtraField(zipShort8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setExtra();
        byte[] byteArray13 = zipArchiveEntry11.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date16 = zipArchiveEntry15.getLastModifiedDate();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry15.setName("hi!", byteArray20);
        zipArchiveEntry11.setExtra(byteArray20);
        long long23 = zipArchiveEntry11.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField25 = zipArchiveEntry11.getExtraField(zipShort24);
        boolean boolean27 = zipArchiveEntry11.equals((java.lang.Object) (short) 0);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit28 = zipArchiveEntry11.getGeneralPurposeBit();
        zipArchiveEntry11.setExternalAttributes(10L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setExtra();
        byte[] byteArray34 = zipArchiveEntry32.getRawName();
        zipArchiveEntry32.setPlatform((int) (byte) 100);
        long long37 = zipArchiveEntry32.getSize();
        long long38 = zipArchiveEntry32.getTime();
        byte[] byteArray39 = zipArchiveEntry32.getLocalFileDataExtra();
        boolean boolean40 = zipArchiveEntry11.equals((java.lang.Object) byteArray39);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray39);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(zipExtraField9);
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(zipExtraField25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit28);
        org.junit.Assert.assertNull(byteArray34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        byte[] byteArray5 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastAccessTime();
        long long8 = zipArchiveEntry1.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setSize((long) 35);
        boolean boolean12 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        long long38 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setMethod((int) 'a');
        java.lang.String str41 = zipArchiveEntry1.getName();
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date5 = zipArchiveEntry4.getLastModifiedDate();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry4.setName("hi!", byteArray9);
        zipArchiveEntry1.setExtra(byteArray9);
        long long12 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setCompressedSize((long) (byte) 10);
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date18 = zipArchiveEntry17.getLastModifiedDate();
        long long19 = zipArchiveEntry17.getTime();
        java.lang.String str20 = zipArchiveEntry17.getComment();
        zipArchiveEntry17.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = zipArchiveEntry17.getExtraFields();
        byte[] byteArray24 = zipArchiveEntry17.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit27 = zipArchiveEntry26.getGeneralPurposeBit();
        byte[] byteArray28 = zipArchiveEntry26.getRawName();
        long long29 = zipArchiveEntry26.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setExtra();
        zipArchiveEntry32.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date38 = zipArchiveEntry37.getLastModifiedDate();
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry37.setName("hi!", byteArray42);
        zipArchiveEntry32.setCentralDirectoryExtra(byteArray42);
        zipArchiveEntry26.setName("", byteArray42);
        zipArchiveEntry26.setTime((long) 10);
        boolean boolean48 = zipArchiveEntry17.equals((java.lang.Object) zipArchiveEntry26);
        java.lang.String str49 = zipArchiveEntry26.getComment();
        java.time.LocalDateTime localDateTime50 = zipArchiveEntry26.getTimeLocal();
        zipArchiveEntry1.setTimeLocal(localDateTime50);
        long long52 = zipArchiveEntry1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray23, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertNotNull(generalPurposeBit27);
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        java.util.Date date20 = zipArchiveEntry1.getLastModifiedDate();
        long long21 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date24 = zipArchiveEntry23.getLastModifiedDate();
        long long25 = zipArchiveEntry23.getTime();
        java.lang.String str26 = zipArchiveEntry23.getComment();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit27 = zipArchiveEntry23.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit30 = zipArchiveEntry29.getGeneralPurposeBit();
        int int31 = zipArchiveEntry29.getMethod();
        long long32 = zipArchiveEntry29.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry35.setExtra();
        zipArchiveEntry35.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date41 = zipArchiveEntry40.getLastModifiedDate();
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry40.setName("hi!", byteArray45);
        zipArchiveEntry35.setCentralDirectoryExtra(byteArray45);
        zipArchiveEntry29.setName("hi!", byteArray45);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date54 = zipArchiveEntry53.getLastModifiedDate();
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry53.setName("hi!", byteArray58);
        zipArchiveEntry50.setExtra(byteArray58);
        zipArchiveEntry29.setExtra(byteArray58);
        zipArchiveEntry23.setExtra(byteArray58);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray64 = zipArchiveEntry23.getExtraFields(false);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray64);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(generalPurposeBit19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(generalPurposeBit27);
        org.junit.Assert.assertNotNull(generalPurposeBit30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray64);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray64, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        int int16 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setSize((long) (byte) 10);
        java.lang.Class<?> wildcardClass22 = zipArchiveEntry1.getClass();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray19, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry1.equals(obj4);
        zipArchiveEntry1.setCompressedSize((long) (short) 0);
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getCreationTime();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(fileTime8);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry1.setName("hi!", byteArray6);
        long long8 = zipArchiveEntry1.getSize();
        java.lang.String str9 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = zipArchiveEntry1.getExtraFields(true);
        long long12 = zipArchiveEntry1.getCompressedSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray11, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = zipArchiveEntry1.getUnparseableExtraFieldData();
        byte[] byteArray8 = null;
        zipArchiveEntry1.setName("", byteArray8);
        long long10 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setExtra();
        zipArchiveEntry12.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date18 = zipArchiveEntry17.getLastModifiedDate();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry17.setName("hi!", byteArray22);
        zipArchiveEntry12.setCentralDirectoryExtra(byteArray22);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry26.setExtra();
        byte[] byteArray28 = zipArchiveEntry26.getRawName();
        zipArchiveEntry26.setPlatform((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime31 = zipArchiveEntry26.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit35 = zipArchiveEntry34.getGeneralPurposeBit();
        int int36 = zipArchiveEntry34.getMethod();
        long long37 = zipArchiveEntry34.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry40.setExtra();
        zipArchiveEntry40.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date46 = zipArchiveEntry45.getLastModifiedDate();
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry45.setName("hi!", byteArray50);
        zipArchiveEntry40.setCentralDirectoryExtra(byteArray50);
        zipArchiveEntry34.setName("hi!", byteArray50);
        zipArchiveEntry26.setName("", byteArray50);
        zipArchiveEntry12.setExtra(byteArray50);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date58 = zipArchiveEntry57.getLastModifiedDate();
        long long59 = zipArchiveEntry57.getTime();
        java.lang.String str60 = zipArchiveEntry57.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray63 = zipArchiveEntry62.getExtraFields();
        zipArchiveEntry57.setExtraFields(zipExtraFieldArray63);
        zipArchiveEntry57.setCompressedSize((long) 8);
        boolean boolean67 = zipArchiveEntry12.equals((java.lang.Object) zipArchiveEntry57);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit70 = zipArchiveEntry69.getGeneralPurposeBit();
        int int71 = zipArchiveEntry69.getMethod();
        int int72 = zipArchiveEntry69.getInternalAttributes();
        zipArchiveEntry69.setInternalAttributes((-1));
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit75 = zipArchiveEntry69.getGeneralPurposeBit();
        zipArchiveEntry57.setGeneralPurposeBit(generalPurposeBit75);
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit75);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray28);
        org.junit.Assert.assertNull(fileTime31);
        org.junit.Assert.assertNotNull(generalPurposeBit35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(zipExtraFieldArray63);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray63, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit75);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("hi!");
        int int7 = zipArchiveEntry1.getMethod();
        java.lang.String str8 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setInternalAttributes((int) '#');
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry10.getLastModifiedTime();
        boolean boolean14 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry16.setExtra();
        zipArchiveEntry16.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = zipArchiveEntry16.getExtraFields();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit21 = zipArchiveEntry16.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setExtra();
        byte[] byteArray25 = zipArchiveEntry23.getRawName();
        zipArchiveEntry23.setPlatform((int) (byte) 100);
        zipArchiveEntry23.setExternalAttributes((long) 10);
        long long30 = zipArchiveEntry23.getCrc();
        int int31 = zipArchiveEntry23.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry33.setExtra();
        zipArchiveEntry33.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date39 = zipArchiveEntry38.getLastModifiedDate();
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry38.setName("hi!", byteArray43);
        zipArchiveEntry33.setCentralDirectoryExtra(byteArray43);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry47.setExtra();
        byte[] byteArray49 = zipArchiveEntry47.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date52 = zipArchiveEntry51.getLastModifiedDate();
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry51.setName("hi!", byteArray56);
        zipArchiveEntry47.setExtra(byteArray56);
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry47.setCentralDirectoryExtra(byteArray63);
        zipArchiveEntry47.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData67 = zipArchiveEntry47.getUnparseableExtraFieldData();
        zipArchiveEntry33.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData67);
        zipArchiveEntry23.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData67);
        zipArchiveEntry16.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData67);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData67);
        int int72 = zipArchiveEntry1.getPlatform();
        long long73 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray20, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(generalPurposeBit21);
        org.junit.Assert.assertNull(byteArray25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L) + "'", long73 == (-1L));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        zipArchiveEntry1.setUnixMode((int) (short) 10);
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
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
        java.nio.file.attribute.FileTime fileTime21 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setExternalAttributes((long) (short) -1);
        java.util.Date date24 = zipArchiveEntry1.getLastModifiedDate();
        boolean boolean25 = zipArchiveEntry1.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime26 = zipArchiveEntry1.getTimeLocal();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 15");
        } catch (java.time.DateTimeException e) {
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(fileTime21);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        java.util.Date date83 = zipArchiveEntry1.getLastModifiedDate();
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
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        long long3 = zipArchiveEntry1.getTime();
        java.lang.String str4 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getCreationTime();
        long long10 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setCompressedSize(35L);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        byte[] byteArray5 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setSize((long) (byte) 0);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime7);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setTime((long) (byte) 10);
        long long5 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setUnixMode((-1));
        zipArchiveEntry1.setTime(32L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry1.getExtraFields();
        org.junit.Assert.assertNotNull(generalPurposeBit2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setUnixMode((int) (short) 100);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData7 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = zipArchiveEntry1.getUnparseableExtraFieldData();
        zipArchiveEntry1.setTime((long) 35);
        byte[] byteArray11 = zipArchiveEntry1.getRawName();
        long long12 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit15 = zipArchiveEntry14.getGeneralPurposeBit();
        int int16 = zipArchiveEntry14.getMethod();
        long long17 = zipArchiveEntry14.getCompressedSize();
        boolean boolean18 = zipArchiveEntry14.isDirectory();
        long long19 = zipArchiveEntry14.getSize();
        java.lang.Object obj20 = zipArchiveEntry14.clone();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = zipArchiveEntry14.getExtraField(zipShort21);
        boolean boolean23 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry14);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry25.setPlatform(0);
        zipArchiveEntry25.setExtra();
        java.lang.Object obj29 = zipArchiveEntry25.clone();
        zipArchiveEntry25.setTime(8L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry25.getExtraFields();
        zipArchiveEntry14.setExtraFields(zipExtraFieldArray32);
        long long34 = zipArchiveEntry14.getExternalAttributes();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(unparseableExtraFieldData7);
        org.junit.Assert.assertNull(unparseableExtraFieldData8);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNotNull(generalPurposeBit15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNull(zipExtraField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray32, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
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
        java.nio.file.attribute.FileTime fileTime21 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setExternalAttributes((long) (short) -1);
        zipArchiveEntry1.setMethod((int) '4');
        zipArchiveEntry1.setMethod(65535);
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
        org.junit.Assert.assertNull(fileTime21);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        boolean boolean8 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setInternalAttributes((int) (short) 1);
        zipArchiveEntry1.setMethod((int) (short) 100);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date22 = zipArchiveEntry21.getLastModifiedDate();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry21.setName("hi!", byteArray26);
        long long28 = zipArchiveEntry21.getSize();
        zipArchiveEntry21.setExternalAttributes((long) (byte) 100);
        byte[] byteArray31 = zipArchiveEntry21.getCentralDirectoryExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray31);
        zipArchiveEntry1.setMethod(3);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData35 = zipArchiveEntry1.getUnparseableExtraFieldData();
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
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNull(unparseableExtraFieldData35);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        long long6 = zipArchiveEntry1.getSize();
        long long7 = zipArchiveEntry1.getTime();
        boolean boolean8 = zipArchiveEntry1.isDirectory();
        long long9 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setCompressedSize((long) 52);
        zipArchiveEntry1.setInternalAttributes((int) 'a');
        java.util.Date date15 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date2 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry1.setName("hi!", byteArray6);
        long long8 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setSize((long) 3);
        java.lang.String str11 = zipArchiveEntry1.getName();
        int int12 = zipArchiveEntry1.getMethod();
        int int13 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date6 = zipArchiveEntry5.getLastModifiedDate();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry5.setName("hi!", byteArray10);
        zipArchiveEntry1.setExtra(byteArray10);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray17);
        zipArchiveEntry1.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit23 = zipArchiveEntry22.getGeneralPurposeBit();
        int int24 = zipArchiveEntry22.getMethod();
        zipArchiveEntry22.setCompressedSize((long) (-1));
        zipArchiveEntry22.setExternalAttributes((long) 'a');
        zipArchiveEntry22.setSize((long) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry33.setExtra();
        byte[] byteArray35 = zipArchiveEntry33.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date38 = zipArchiveEntry37.getLastModifiedDate();
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry37.setName("hi!", byteArray42);
        zipArchiveEntry33.setExtra(byteArray42);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry33.setCentralDirectoryExtra(byteArray49);
        zipArchiveEntry22.setName("", byteArray49);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray49);
        byte[] byteArray54 = null;
        zipArchiveEntry1.setName("", byteArray54);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(generalPurposeBit23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(byteArray35);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        int int36 = zipArchiveEntry1.getUnixMode();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setInternalAttributes((int) '#');
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit4 = zipArchiveEntry1.getGeneralPurposeBit();
        zipArchiveEntry1.setSize((long) 8);
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getCreationTime();
        int int8 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setExtra();
        byte[] byteArray13 = zipArchiveEntry11.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date16 = zipArchiveEntry15.getLastModifiedDate();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry15.setName("hi!", byteArray20);
        zipArchiveEntry11.setExtra(byteArray20);
        long long23 = zipArchiveEntry11.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField25 = zipArchiveEntry11.getExtraField(zipShort24);
        int int26 = zipArchiveEntry11.getUnixMode();
        java.lang.String str27 = zipArchiveEntry11.getName();
        zipArchiveEntry11.setPlatform(8);
        zipArchiveEntry11.setMethod((int) 'a');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit34 = zipArchiveEntry33.getGeneralPurposeBit();
        int int35 = zipArchiveEntry33.getMethod();
        long long36 = zipArchiveEntry33.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setExtra();
        zipArchiveEntry39.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date45 = zipArchiveEntry44.getLastModifiedDate();
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry44.setName("hi!", byteArray49);
        zipArchiveEntry39.setCentralDirectoryExtra(byteArray49);
        zipArchiveEntry33.setName("hi!", byteArray49);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry54.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date58 = zipArchiveEntry57.getLastModifiedDate();
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry57.setName("hi!", byteArray62);
        zipArchiveEntry54.setExtra(byteArray62);
        zipArchiveEntry33.setExtra(byteArray62);
        int int66 = zipArchiveEntry33.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry68 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry68.setPlatform(0);
        java.lang.String str71 = zipArchiveEntry68.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray72 = zipArchiveEntry68.getExtraFields();
        boolean boolean73 = zipArchiveEntry33.equals((java.lang.Object) zipArchiveEntry68);
        int int74 = zipArchiveEntry68.getMethod();
        boolean boolean75 = zipArchiveEntry11.equals((java.lang.Object) int74);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit76 = zipArchiveEntry11.getGeneralPurposeBit();
        byte[] byteArray77 = zipArchiveEntry11.getCentralDirectoryExtra();
        zipArchiveEntry1.setName("hi!", byteArray77);
        org.junit.Assert.assertNotNull(generalPurposeBit4);
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(zipExtraField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(generalPurposeBit34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(zipExtraFieldArray72);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray72, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit76);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] {});
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit17 = zipArchiveEntry16.getGeneralPurposeBit();
        zipArchiveEntry16.setTime((long) (byte) 10);
        long long20 = zipArchiveEntry16.getCrc();
        long long21 = zipArchiveEntry16.getCrc();
        byte[] byteArray22 = zipArchiveEntry16.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray22);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray7, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        byte[] byteArray3 = zipArchiveEntry1.getRawName();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setExternalAttributes((long) 10);
        long long8 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData9 = zipArchiveEntry1.getUnparseableExtraFieldData();
        long long10 = zipArchiveEntry1.getSize();
        byte[] byteArray11 = zipArchiveEntry1.getLocalFileDataExtra();
        long long12 = zipArchiveEntry1.getTime();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit36 = zipArchiveEntry35.getGeneralPurposeBit();
        long long37 = zipArchiveEntry35.getCrc();
        long long38 = zipArchiveEntry35.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit41 = zipArchiveEntry40.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry43.setExtra();
        byte[] byteArray45 = zipArchiveEntry43.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date48 = zipArchiveEntry47.getLastModifiedDate();
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry47.setName("hi!", byteArray52);
        zipArchiveEntry43.setExtra(byteArray52);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry43.setCentralDirectoryExtra(byteArray59);
        zipArchiveEntry43.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData63 = zipArchiveEntry43.getUnparseableExtraFieldData();
        zipArchiveEntry40.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData63);
        zipArchiveEntry35.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData63);
        zipArchiveEntry10.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData63);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit67 = zipArchiveEntry10.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit70 = zipArchiveEntry69.getGeneralPurposeBit();
        int int71 = zipArchiveEntry69.getMethod();
        long long72 = zipArchiveEntry69.getCompressedSize();
        boolean boolean73 = zipArchiveEntry69.isDirectory();
        long long74 = zipArchiveEntry69.getSize();
        zipArchiveEntry69.setMethod(8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort77 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField78 = zipArchiveEntry69.getExtraField(zipShort77);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry81 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry81.setPlatform(0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort84 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField85 = zipArchiveEntry81.getExtraField(zipShort84);
        byte[] byteArray86 = zipArchiveEntry81.getLocalFileDataExtra();
        zipArchiveEntry69.setName("", byteArray86);
        zipArchiveEntry10.setCentralDirectoryExtra(byteArray86);
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
        org.junit.Assert.assertNotNull(generalPurposeBit36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNotNull(generalPurposeBit41);
        org.junit.Assert.assertNull(byteArray45);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData63);
        org.junit.Assert.assertNotNull(generalPurposeBit67);
        org.junit.Assert.assertNotNull(generalPurposeBit70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L) + "'", long74 == (-1L));
        org.junit.Assert.assertNull(zipExtraField78);
        org.junit.Assert.assertNull(zipExtraField85);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] {});
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        int int19 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry21.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date25 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry24.setName("hi!", byteArray29);
        zipArchiveEntry21.setExtra(byteArray29);
        zipArchiveEntry1.setExtra(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry34.setExtra();
        byte[] byteArray36 = zipArchiveEntry34.getRawName();
        zipArchiveEntry34.setPlatform((int) (byte) 100);
        zipArchiveEntry34.setExternalAttributes((long) 10);
        long long41 = zipArchiveEntry34.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry43.setExtra();
        zipArchiveEntry43.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date49 = zipArchiveEntry48.getLastModifiedDate();
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry48.setName("hi!", byteArray53);
        zipArchiveEntry43.setCentralDirectoryExtra(byteArray53);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry57.setExtra();
        byte[] byteArray59 = zipArchiveEntry57.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry61 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date62 = zipArchiveEntry61.getLastModifiedDate();
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry61.setName("hi!", byteArray66);
        zipArchiveEntry57.setExtra(byteArray66);
        byte[] byteArray73 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        zipArchiveEntry57.setCentralDirectoryExtra(byteArray73);
        zipArchiveEntry57.setPlatform((int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData77 = zipArchiveEntry57.getUnparseableExtraFieldData();
        zipArchiveEntry43.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData77);
        zipArchiveEntry34.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData77);
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unparseableExtraFieldData77);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry82 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date83 = zipArchiveEntry82.getLastModifiedDate();
        byte[] byteArray87 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry82.setName("hi!", byteArray87);
        long long89 = zipArchiveEntry82.getSize();
        zipArchiveEntry82.setExternalAttributes((long) (byte) 100);
        byte[] byteArray92 = zipArchiveEntry82.getCentralDirectoryExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray92);
        long long94 = zipArchiveEntry1.getSize();
        java.lang.Object obj95 = zipArchiveEntry1.clone();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(byteArray59);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertNotNull(unparseableExtraFieldData77);
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + (-1L) + "'", long89 == (-1L));
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] {});
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + (-1L) + "'", long94 == (-1L));
        org.junit.Assert.assertNotNull(obj95);
        org.junit.Assert.assertEquals(obj95.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj95), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj95), "");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        zipArchiveEntry1.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit19 = zipArchiveEntry18.getGeneralPurposeBit();
        long long20 = zipArchiveEntry18.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = zipArchiveEntry18.getExtraFields();
        byte[] byteArray22 = zipArchiveEntry18.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry24.setExtra();
        zipArchiveEntry24.setTime(0L);
        zipArchiveEntry24.setCrc((long) (byte) 100);
        java.nio.file.attribute.FileTime fileTime30 = zipArchiveEntry24.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry31 = zipArchiveEntry18.setLastModifiedTime(fileTime30);
        java.util.zip.ZipEntry zipEntry32 = zipArchiveEntry1.setLastModifiedTime(fileTime30);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date35 = zipArchiveEntry34.getLastModifiedDate();
        long long36 = zipArchiveEntry34.getTime();
        java.lang.String str37 = zipArchiveEntry34.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = zipArchiveEntry39.getExtraFields();
        zipArchiveEntry34.setExtraFields(zipExtraFieldArray40);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date44 = zipArchiveEntry43.getLastModifiedDate();
        long long45 = zipArchiveEntry43.getTime();
        java.lang.String str46 = zipArchiveEntry43.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray49 = zipArchiveEntry48.getExtraFields();
        zipArchiveEntry43.setExtraFields(zipExtraFieldArray49);
        zipArchiveEntry34.setExtraFields(zipExtraFieldArray49);
        zipArchiveEntry34.setInternalAttributes(100);
        long long54 = zipArchiveEntry34.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry56 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry56.setPlatform(0);
        zipArchiveEntry56.setTime((long) (short) -1);
        byte[] byteArray61 = zipArchiveEntry56.getCentralDirectoryExtra();
        byte[] byteArray62 = zipArchiveEntry56.getRawName();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort63 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField64 = zipArchiveEntry56.getExtraField(zipShort63);
        long long65 = zipArchiveEntry56.getTime();
        byte[] byteArray66 = zipArchiveEntry56.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort67 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField68 = zipArchiveEntry56.getExtraField(zipShort67);
        byte[] byteArray69 = zipArchiveEntry56.getCentralDirectoryExtra();
        java.lang.String str70 = zipArchiveEntry56.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry72 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry72.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry75 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date76 = zipArchiveEntry75.getLastModifiedDate();
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry75.setName("hi!", byteArray80);
        zipArchiveEntry72.setExtra(byteArray80);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort83 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField84 = zipArchiveEntry72.getExtraField(zipShort83);
        int int85 = zipArchiveEntry72.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry87 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit88 = zipArchiveEntry87.getGeneralPurposeBit();
        zipArchiveEntry87.setTime((long) (byte) 10);
        long long91 = zipArchiveEntry87.getCrc();
        zipArchiveEntry87.setUnixMode((-1));
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData94 = zipArchiveEntry87.getUnparseableExtraFieldData();
        java.time.LocalDateTime localDateTime95 = zipArchiveEntry87.getTimeLocal();
        zipArchiveEntry72.setTimeLocal(localDateTime95);
        zipArchiveEntry56.setTimeLocal(localDateTime95);
        zipArchiveEntry34.setTimeLocal(localDateTime95);
        zipArchiveEntry1.setTimeLocal(localDateTime95);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(generalPurposeBit19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray21);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray21, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(fileTime30);
        org.junit.Assert.assertNotNull(zipEntry31);
        org.junit.Assert.assertEquals(zipEntry31.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry32);
        org.junit.Assert.assertEquals(zipEntry32.toString(), "");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray40, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(zipExtraFieldArray49);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray49, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertNull(byteArray62);
        org.junit.Assert.assertNull(zipExtraField64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertNull(zipExtraField68);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] {});
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(zipExtraField84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(generalPurposeBit88);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + (-1L) + "'", long91 == (-1L));
        org.junit.Assert.assertNull(unparseableExtraFieldData94);
        org.junit.Assert.assertNotNull(localDateTime95);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setExternalAttributes((long) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date13 = zipArchiveEntry12.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry12.setName("hi!", byteArray17);
        zipArchiveEntry9.setExtra(byteArray17);
        long long20 = zipArchiveEntry9.getCompressedSize();
        boolean boolean21 = zipArchiveEntry9.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setExtra();
        byte[] byteArray25 = zipArchiveEntry23.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.util.Date date28 = zipArchiveEntry27.getLastModifiedDate();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1 };
        zipArchiveEntry27.setName("hi!", byteArray32);
        zipArchiveEntry23.setExtra(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray36 = zipArchiveEntry23.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = zipArchiveEntry23.getExtraFields(true);
        zipArchiveEntry9.setExtraFields(zipExtraFieldArray38);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray38);
        zipArchiveEntry1.setInternalAttributes((int) (short) -1);
        java.lang.String str43 = zipArchiveEntry1.toString();
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(byteArray25);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(zipExtraFieldArray36);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray36, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray38, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }
}

