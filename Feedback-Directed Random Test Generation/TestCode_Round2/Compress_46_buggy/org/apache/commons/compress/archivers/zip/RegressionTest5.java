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
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean2 = x5455_ExtendedTimestamp0.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getHeaderId();
        boolean boolean10 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte[] byteArray11 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean12 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date14 = x5455_ExtendedTimestamp13.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp13.getLocalFileDataLength();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp13.setModifyJavaTime(date16);
        byte byte18 = x5455_ExtendedTimestamp13.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = x5455_ExtendedTimestamp13.getCreateTime();
        java.util.Date date20 = null;
        x5455_ExtendedTimestamp13.setModifyJavaTime(date20);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x5455_ExtendedTimestamp13.getCentralDirectoryLength();
        boolean boolean23 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipShort22);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong24 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp25 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray26 = x5455_ExtendedTimestamp25.getCentralDirectoryData();
        java.util.Date date27 = null;
        x5455_ExtendedTimestamp25.setCreateJavaTime(date27);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = x5455_ExtendedTimestamp25.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong30 = null;
        x5455_ExtendedTimestamp25.setCreateTime(zipLong30);
        java.util.Date date32 = x5455_ExtendedTimestamp25.getModifyJavaTime();
        x5455_ExtendedTimestamp25.setFlags((byte) 2);
        java.lang.String str35 = x5455_ExtendedTimestamp25.toString();
        java.util.Date date36 = x5455_ExtendedTimestamp25.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp37 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date38 = x5455_ExtendedTimestamp37.getModifyJavaTime();
        java.lang.String str39 = x5455_ExtendedTimestamp37.toString();
        java.util.Date date40 = null;
        x5455_ExtendedTimestamp37.setAccessJavaTime(date40);
        boolean boolean42 = x5455_ExtendedTimestamp25.equals((java.lang.Object) x5455_ExtendedTimestamp37);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong43 = null;
        x5455_ExtendedTimestamp37.setAccessTime(zipLong43);
        byte[] byteArray45 = x5455_ExtendedTimestamp37.getCentralDirectoryData();
        boolean boolean46 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp37);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertNull(zipLong19);
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(zipLong24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0x5455 Zip Extra Field: Flags=10 " + "'", str35, "0x5455 Zip Extra Field: Flags=10 ");
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str39, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date7 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong10);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(zipShort9);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.Object obj3 = x5455_ExtendedTimestamp0.clone();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        java.util.Date date7 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date7);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte byte7 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getCreateTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNull(zipLong11);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.util.Date date6 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(zipLong7);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getAccessTime();
        byte byte3 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort7);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong4);
        byte byte6 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getCreateTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong11);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getAccessTime();
        java.lang.String str5 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str5, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.util.Date date9 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNull(zipLong11);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp4.setModifyTime(zipLong8);
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp4.setModifyJavaTime(date10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp4.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp4.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp4.getCentralDirectoryLength();
        boolean boolean15 = x5455_ExtendedTimestamp4.isBit2_createTimePresent();
        java.util.Date date16 = x5455_ExtendedTimestamp4.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = x5455_ExtendedTimestamp4.getCreateTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(zipLong17);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.String str3 = x5455_ExtendedTimestamp0.toString();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte byte6 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str3, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date6);
        java.lang.Object obj8 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date9 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong12);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        byte[] byteArray7 = x5455_ExtendedTimestamp5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp5.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp5.getCreateTime();
        boolean boolean10 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipLong9);
        byte byte11 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp6 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date7 = x5455_ExtendedTimestamp6.getModifyJavaTime();
        java.lang.String str8 = x5455_ExtendedTimestamp6.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp6.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp6.setAccessTime(zipLong10);
        byte byte12 = x5455_ExtendedTimestamp6.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = x5455_ExtendedTimestamp6.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp6.getLocalFileDataLength();
        byte[] byteArray15 = x5455_ExtendedTimestamp6.getCentralDirectoryData();
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp6);
        byte byte17 = x5455_ExtendedTimestamp6.getFlags();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj19 = x5455_ExtendedTimestamp18.clone();
        java.util.Date date20 = x5455_ExtendedTimestamp18.getCreateJavaTime();
        boolean boolean21 = x5455_ExtendedTimestamp18.isBit1_accessTimePresent();
        java.lang.String str22 = x5455_ExtendedTimestamp18.toString();
        byte[] byteArray23 = x5455_ExtendedTimestamp18.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp6.parseFromLocalFileData(byteArray23, 4, (int) (byte) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str8, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNull(zipLong13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str22, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0 });
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.lang.String str9 = x5455_ExtendedTimestamp0.toString();
        boolean boolean10 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong11);
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        byte[] byteArray14 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date15);
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date17);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong19);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str9, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0 });
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj9 = x5455_ExtendedTimestamp8.clone();
        java.util.Date date10 = x5455_ExtendedTimestamp8.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp8.getHeaderId();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp8.setModifyJavaTime(date12);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp8.setModifyTime(zipLong14);
        boolean boolean16 = x5455_ExtendedTimestamp4.equals((java.lang.Object) x5455_ExtendedTimestamp8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = null;
        x5455_ExtendedTimestamp8.setAccessTime(zipLong17);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = null;
        x5455_ExtendedTimestamp8.setAccessTime(zipLong19);
        java.util.Date date21 = null;
        x5455_ExtendedTimestamp8.setModifyJavaTime(date21);
        byte[] byteArray23 = x5455_ExtendedTimestamp8.getCentralDirectoryData();
        byte[] byteArray24 = x5455_ExtendedTimestamp8.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort25 = x5455_ExtendedTimestamp8.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort25);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        java.lang.Object obj10 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong11);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date14 = x5455_ExtendedTimestamp13.getCreateJavaTime();
        java.lang.String str15 = x5455_ExtendedTimestamp13.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = null;
        x5455_ExtendedTimestamp13.setModifyTime(zipLong16);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x5455_ExtendedTimestamp13.getHeaderId();
        java.util.Date date19 = null;
        x5455_ExtendedTimestamp13.setModifyJavaTime(date19);
        boolean boolean21 = x5455_ExtendedTimestamp13.isBit2_createTimePresent();
        boolean boolean22 = x5455_ExtendedTimestamp0.equals((java.lang.Object) boolean21);
        java.util.Date date23 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date23);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong25 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong25);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str15, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        java.util.Date date7 = x5455_ExtendedTimestamp5.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp5.getHeaderId();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp5.setModifyJavaTime(date9);
        x5455_ExtendedTimestamp5.setFlags((byte) 0);
        java.util.Date date13 = x5455_ExtendedTimestamp5.getModifyJavaTime();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp5.setModifyJavaTime(date14);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp16 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj17 = x5455_ExtendedTimestamp16.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj19 = x5455_ExtendedTimestamp18.clone();
        boolean boolean20 = x5455_ExtendedTimestamp16.equals((java.lang.Object) x5455_ExtendedTimestamp18);
        java.util.Date date21 = x5455_ExtendedTimestamp16.getCreateJavaTime();
        boolean boolean22 = x5455_ExtendedTimestamp5.equals((java.lang.Object) x5455_ExtendedTimestamp16);
        java.util.Date date23 = null;
        x5455_ExtendedTimestamp16.setAccessJavaTime(date23);
        boolean boolean25 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = x5455_ExtendedTimestamp16.getCreateTime();
        java.util.Date date27 = x5455_ExtendedTimestamp16.getModifyJavaTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(zipLong26);
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong4);
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.lang.Object obj7 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj9 = x5455_ExtendedTimestamp8.clone();
        java.util.Date date10 = x5455_ExtendedTimestamp8.getCreateJavaTime();
        boolean boolean11 = x5455_ExtendedTimestamp8.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean14 = x5455_ExtendedTimestamp12.equals((java.lang.Object) true);
        boolean boolean15 = x5455_ExtendedTimestamp8.equals((java.lang.Object) x5455_ExtendedTimestamp12);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = x5455_ExtendedTimestamp8.getLocalFileDataLength();
        boolean boolean17 = x5455_ExtendedTimestamp8.isBit0_modifyTimePresent();
        byte[] byteArray18 = x5455_ExtendedTimestamp8.getLocalFileDataData();
        java.lang.Object obj19 = x5455_ExtendedTimestamp8.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = x5455_ExtendedTimestamp8.getModifyTime();
        java.lang.Object obj21 = x5455_ExtendedTimestamp8.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong22 = x5455_ExtendedTimestamp8.getAccessTime();
        boolean boolean23 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipLong22);
        java.lang.String str24 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str24, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getAccessTime();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.lang.String str8 = x5455_ExtendedTimestamp0.toString();
        byte[] byteArray9 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str8, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        java.lang.String str11 = x5455_ExtendedTimestamp0.toString();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.setFlags((byte) 1);
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date15);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong17);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str11, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.Object obj2 = x5455_ExtendedTimestamp0.clone();
        byte byte3 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date4 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.String str6 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getHeaderId();
        java.lang.Object obj8 = x5455_ExtendedTimestamp0.clone();
        java.lang.Object obj9 = x5455_ExtendedTimestamp0.clone();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str6, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date6 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date4 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date7 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date7);
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean12 = x5455_ExtendedTimestamp10.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp10.getHeaderId();
        x5455_ExtendedTimestamp10.setFlags((byte) 2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = x5455_ExtendedTimestamp10.getModifyTime();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date17);
        boolean boolean19 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date17);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNull(zipLong16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray11 = x5455_ExtendedTimestamp10.getCentralDirectoryData();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date12);
        java.lang.String str14 = x5455_ExtendedTimestamp10.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp10.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = null;
        x5455_ExtendedTimestamp10.setCreateTime(zipLong16);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x5455_ExtendedTimestamp10.getHeaderId();
        boolean boolean19 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipShort18);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong15);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zipShort20);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp2.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp2.setAccessTime(zipLong11);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp2.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp2.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(zipShort14);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte[] byteArray5 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date6);
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj8 = x5455_ExtendedTimestamp7.clone();
        java.util.Date date9 = x5455_ExtendedTimestamp7.getCreateJavaTime();
        boolean boolean10 = x5455_ExtendedTimestamp7.isBit1_accessTimePresent();
        byte[] byteArray11 = x5455_ExtendedTimestamp7.getCentralDirectoryData();
        java.util.Date date12 = x5455_ExtendedTimestamp7.getModifyJavaTime();
        boolean boolean13 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp7);
        java.util.Date date14 = x5455_ExtendedTimestamp7.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp7.getModifyTime();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp7.setCreateJavaTime(date16);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(zipLong15);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date6);
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong12);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp0.getModifyTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNull(zipLong15);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp2.getHeaderId();
        java.lang.String str11 = x5455_ExtendedTimestamp2.toString();
        java.lang.String str12 = x5455_ExtendedTimestamp2.toString();
        java.util.Date date13 = x5455_ExtendedTimestamp2.getCreateJavaTime();
        java.util.Date date14 = x5455_ExtendedTimestamp2.getModifyJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str11, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str12, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong7);
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray11 = x5455_ExtendedTimestamp10.getCentralDirectoryData();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date12);
        java.lang.String str14 = x5455_ExtendedTimestamp10.toString();
        java.lang.Object obj15 = x5455_ExtendedTimestamp10.clone();
        byte[] byteArray16 = x5455_ExtendedTimestamp10.getCentralDirectoryData();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date17);
        java.util.Date date19 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date19);
        java.util.Date date21 = x5455_ExtendedTimestamp10.getCreateJavaTime();
        boolean boolean22 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp23 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date24 = x5455_ExtendedTimestamp23.getModifyJavaTime();
        java.lang.String str25 = x5455_ExtendedTimestamp23.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = x5455_ExtendedTimestamp23.getLocalFileDataLength();
        byte[] byteArray27 = x5455_ExtendedTimestamp23.getCentralDirectoryData();
        boolean boolean28 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp23);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong29 = null;
        x5455_ExtendedTimestamp23.setModifyTime(zipLong29);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str25, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        byte[] byteArray9 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.lang.String str11 = x5455_ExtendedTimestamp0.toString();
        byte byte12 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str11, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        x5455_ExtendedTimestamp0.setFlags((byte) 4);
        byte[] byteArray10 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte[] byteArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray11, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong3);
        byte[] byteArray5 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getModifyTime();
        java.util.Date date7 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(zipShort9);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.util.Date date6 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong7);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.lang.String str10 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date11 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.lang.Object obj12 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date13 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean14 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str10, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date13 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp0.getModifyTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNull(zipLong15);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        byte[] byteArray5 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.lang.Object obj6 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray7 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp0.getModifyTime();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date13);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj16 = x5455_ExtendedTimestamp15.clone();
        java.util.Date date17 = x5455_ExtendedTimestamp15.getCreateJavaTime();
        boolean boolean18 = x5455_ExtendedTimestamp15.isBit1_accessTimePresent();
        byte[] byteArray19 = x5455_ExtendedTimestamp15.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = x5455_ExtendedTimestamp15.getModifyTime();
        java.lang.Object obj21 = null;
        boolean boolean22 = x5455_ExtendedTimestamp15.equals(obj21);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = null;
        x5455_ExtendedTimestamp15.setCreateTime(zipLong23);
        boolean boolean25 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp15);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = null;
        x5455_ExtendedTimestamp15.setAccessTime(zipLong26);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        byte byte8 = x5455_ExtendedTimestamp4.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp4.setModifyTime(zipLong9);
        java.lang.Object obj11 = null;
        boolean boolean12 = x5455_ExtendedTimestamp4.equals(obj11);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = null;
        x5455_ExtendedTimestamp4.setModifyTime(zipLong13);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong6);
        x5455_ExtendedTimestamp0.setFlags((byte) 1);
        boolean boolean10 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        x5455_ExtendedTimestamp0.setFlags((byte) 2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp6 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj7 = x5455_ExtendedTimestamp6.clone();
        java.util.Date date8 = x5455_ExtendedTimestamp6.getCreateJavaTime();
        boolean boolean9 = x5455_ExtendedTimestamp6.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean12 = x5455_ExtendedTimestamp10.equals((java.lang.Object) true);
        boolean boolean13 = x5455_ExtendedTimestamp6.equals((java.lang.Object) x5455_ExtendedTimestamp10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp6.getCreateTime();
        boolean boolean15 = x5455_ExtendedTimestamp6.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp16 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj17 = x5455_ExtendedTimestamp16.clone();
        java.util.Date date18 = x5455_ExtendedTimestamp16.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp16.getLocalFileDataLength();
        boolean boolean20 = x5455_ExtendedTimestamp6.equals((java.lang.Object) x5455_ExtendedTimestamp16);
        byte byte21 = x5455_ExtendedTimestamp6.getFlags();
        boolean boolean22 = x5455_ExtendedTimestamp0.equals((java.lang.Object) byte21);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date2);
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.lang.String str10 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date11 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.lang.Object obj12 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date13);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong16);
        java.util.Date date18 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date18);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str10, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong15);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray10 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.lang.Object obj11 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp0.getModifyTime();
        java.lang.Object obj13 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp14 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date15 = x5455_ExtendedTimestamp14.getCreateJavaTime();
        byte[] byteArray16 = x5455_ExtendedTimestamp14.getLocalFileDataData();
        boolean boolean17 = x5455_ExtendedTimestamp14.isBit0_modifyTimePresent();
        byte[] byteArray18 = x5455_ExtendedTimestamp14.getCentralDirectoryData();
        byte byte19 = x5455_ExtendedTimestamp14.getFlags();
        boolean boolean20 = x5455_ExtendedTimestamp14.isBit0_modifyTimePresent();
        java.util.Date date21 = x5455_ExtendedTimestamp14.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong22 = null;
        x5455_ExtendedTimestamp14.setAccessTime(zipLong22);
        byte[] byteArray24 = x5455_ExtendedTimestamp14.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray24, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0 });
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong9);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean13 = x5455_ExtendedTimestamp11.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp11.getModifyTime();
        boolean boolean15 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp11);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp16 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj17 = x5455_ExtendedTimestamp16.clone();
        java.util.Date date18 = x5455_ExtendedTimestamp16.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp16.getHeaderId();
        java.util.Date date20 = null;
        x5455_ExtendedTimestamp16.setModifyJavaTime(date20);
        x5455_ExtendedTimestamp16.setFlags((byte) 0);
        java.util.Date date24 = x5455_ExtendedTimestamp16.getAccessJavaTime();
        byte[] byteArray25 = x5455_ExtendedTimestamp16.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray25, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0 });
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getHeaderId();
        boolean boolean10 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.Class<?> wildcardClass11 = x5455_ExtendedTimestamp0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(zipLong9);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date9);
        byte byte11 = x5455_ExtendedTimestamp0.getFlags();
        byte byte12 = x5455_ExtendedTimestamp0.getFlags();
        java.lang.Object obj13 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date14);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong1);
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date11 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        byte[] byteArray9 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        x5455_ExtendedTimestamp0.setFlags((byte) -1);
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date12);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = x5455_ExtendedTimestamp0.getCreateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = zipLong16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong16);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong1);
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong8);
        byte byte10 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date11 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong1);
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNotNull(zipShort10);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray10 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean2 = x5455_ExtendedTimestamp0.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp0.getModifyTime();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        java.lang.Class<?> wildcardClass5 = x5455_ExtendedTimestamp0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(zipLong3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong5);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date8 = x5455_ExtendedTimestamp7.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp7.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp7.setModifyTime(zipLong10);
        java.util.Date date12 = x5455_ExtendedTimestamp7.getModifyJavaTime();
        java.util.Date date13 = x5455_ExtendedTimestamp7.getAccessJavaTime();
        java.lang.Object obj14 = x5455_ExtendedTimestamp7.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj16 = x5455_ExtendedTimestamp15.clone();
        java.util.Date date17 = x5455_ExtendedTimestamp15.getCreateJavaTime();
        boolean boolean18 = x5455_ExtendedTimestamp15.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp19 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean21 = x5455_ExtendedTimestamp19.equals((java.lang.Object) true);
        boolean boolean22 = x5455_ExtendedTimestamp15.equals((java.lang.Object) x5455_ExtendedTimestamp19);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = null;
        x5455_ExtendedTimestamp15.setAccessTime(zipLong23);
        x5455_ExtendedTimestamp15.setFlags((byte) 10);
        byte[] byteArray27 = x5455_ExtendedTimestamp15.getCentralDirectoryData();
        x5455_ExtendedTimestamp7.parseFromCentralDirectoryData(byteArray27, (int) (byte) 0, (int) (short) -1);
        boolean boolean31 = x5455_ExtendedTimestamp0.equals((java.lang.Object) (byte) 0);
        java.util.Date date32 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray33 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong34 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong34);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp2.getHeaderId();
        java.lang.String str11 = x5455_ExtendedTimestamp2.toString();
        java.lang.String str12 = x5455_ExtendedTimestamp2.toString();
        boolean boolean13 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str11, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str12, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date5);
        byte[] byteArray7 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date9 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        x5455_ExtendedTimestamp0.setFlags((byte) 100);
        boolean boolean12 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.lang.String str13 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp0.getCreateTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0x5455 Zip Extra Field: Flags=1100100 " + "'", str13, "0x5455 Zip Extra Field: Flags=1100100 ");
        org.junit.Assert.assertNull(zipLong14);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date6 = x5455_ExtendedTimestamp5.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp5.getLocalFileDataLength();
        byte[] byteArray8 = x5455_ExtendedTimestamp5.getCentralDirectoryData();
        x5455_ExtendedTimestamp5.setFlags((byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp5.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp5.getCentralDirectoryLength();
        java.util.Date date13 = x5455_ExtendedTimestamp5.getModifyJavaTime();
        boolean boolean14 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date16 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date17 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date18 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj4 = x5455_ExtendedTimestamp3.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        boolean boolean7 = x5455_ExtendedTimestamp3.equals((java.lang.Object) x5455_ExtendedTimestamp5);
        byte[] byteArray8 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray8, 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj13 = x5455_ExtendedTimestamp12.clone();
        java.util.Date date14 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp12.getHeaderId();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp12.setModifyJavaTime(date16);
        boolean boolean18 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.String str21 = x5455_ExtendedTimestamp0.toString();
        java.lang.String str22 = x5455_ExtendedTimestamp0.toString();
        boolean boolean23 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(zipLong19);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str21, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str22, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zipShort24);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong1);
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getModifyTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNull(zipLong8);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong3);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str6 = x5455_ExtendedTimestamp0.toString();
        java.lang.String str7 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong9);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str6, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str7, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong9);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        boolean boolean12 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date13);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date16 = x5455_ExtendedTimestamp15.getCreateJavaTime();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp15.setAccessJavaTime(date17);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = x5455_ExtendedTimestamp15.getCreateTime();
        java.lang.Object obj20 = x5455_ExtendedTimestamp15.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp21 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray22 = x5455_ExtendedTimestamp21.getCentralDirectoryData();
        java.util.Date date23 = null;
        x5455_ExtendedTimestamp21.setCreateJavaTime(date23);
        java.lang.String str25 = x5455_ExtendedTimestamp21.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = null;
        x5455_ExtendedTimestamp21.setCreateTime(zipLong26);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = x5455_ExtendedTimestamp21.getCentralDirectoryLength();
        byte[] byteArray29 = x5455_ExtendedTimestamp21.getLocalFileDataData();
        byte[] byteArray30 = x5455_ExtendedTimestamp21.getCentralDirectoryData();
        x5455_ExtendedTimestamp15.parseFromCentralDirectoryData(byteArray30, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray30, (int) (short) 100, (int) (byte) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(zipLong19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str25, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0 });
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date2);
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        x5455_ExtendedTimestamp0.setFlags((byte) 1);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date12);
        boolean boolean14 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte byte15 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date4);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp6 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj7 = x5455_ExtendedTimestamp6.clone();
        java.util.Date date8 = x5455_ExtendedTimestamp6.getCreateJavaTime();
        boolean boolean9 = x5455_ExtendedTimestamp6.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean12 = x5455_ExtendedTimestamp10.equals((java.lang.Object) true);
        boolean boolean13 = x5455_ExtendedTimestamp6.equals((java.lang.Object) x5455_ExtendedTimestamp10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp6.getLocalFileDataLength();
        boolean boolean15 = x5455_ExtendedTimestamp6.isBit0_modifyTimePresent();
        byte[] byteArray16 = x5455_ExtendedTimestamp6.getLocalFileDataData();
        java.lang.Object obj17 = x5455_ExtendedTimestamp6.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = x5455_ExtendedTimestamp6.getModifyTime();
        java.lang.Object obj19 = x5455_ExtendedTimestamp6.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = null;
        x5455_ExtendedTimestamp6.setModifyTime(zipLong20);
        byte[] byteArray22 = x5455_ExtendedTimestamp6.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray22, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0 });
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray5 = x5455_ExtendedTimestamp4.getCentralDirectoryData();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp4.setCreateJavaTime(date6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp4.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp4.setCreateTime(zipLong9);
        java.util.Date date11 = x5455_ExtendedTimestamp4.getModifyJavaTime();
        x5455_ExtendedTimestamp4.setFlags((byte) 2);
        java.lang.String str14 = x5455_ExtendedTimestamp4.toString();
        java.util.Date date15 = x5455_ExtendedTimestamp4.getAccessJavaTime();
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date15);
        byte[] byteArray17 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=10 " + "'", str14, "0x5455 Zip Extra Field: Flags=10 ");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.Object obj6 = null;
        boolean boolean7 = x5455_ExtendedTimestamp0.equals(obj6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        java.util.Date date10 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getHeaderId();
        boolean boolean12 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date8 = x5455_ExtendedTimestamp7.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp7.getLocalFileDataLength();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp7.setModifyJavaTime(date10);
        byte byte12 = x5455_ExtendedTimestamp7.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = x5455_ExtendedTimestamp7.getCreateTime();
        boolean boolean14 = x5455_ExtendedTimestamp7.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray16 = x5455_ExtendedTimestamp15.getCentralDirectoryData();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp15.setCreateJavaTime(date17);
        java.lang.String str19 = x5455_ExtendedTimestamp15.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = null;
        x5455_ExtendedTimestamp15.setCreateTime(zipLong20);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x5455_ExtendedTimestamp15.getCentralDirectoryLength();
        byte[] byteArray23 = x5455_ExtendedTimestamp15.getLocalFileDataData();
        x5455_ExtendedTimestamp7.parseFromCentralDirectoryData(byteArray23, (int) (short) 0, (int) '4');
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray23, (int) (short) 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong30 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong31 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong31);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNull(zipLong13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str19, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong30);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date8 = x5455_ExtendedTimestamp7.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp7.getLocalFileDataLength();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp7.setModifyJavaTime(date10);
        byte byte12 = x5455_ExtendedTimestamp7.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = x5455_ExtendedTimestamp7.getCreateTime();
        boolean boolean14 = x5455_ExtendedTimestamp7.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray16 = x5455_ExtendedTimestamp15.getCentralDirectoryData();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp15.setCreateJavaTime(date17);
        java.lang.String str19 = x5455_ExtendedTimestamp15.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = null;
        x5455_ExtendedTimestamp15.setCreateTime(zipLong20);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x5455_ExtendedTimestamp15.getCentralDirectoryLength();
        byte[] byteArray23 = x5455_ExtendedTimestamp15.getLocalFileDataData();
        x5455_ExtendedTimestamp7.parseFromCentralDirectoryData(byteArray23, (int) (short) 0, (int) '4');
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray23, (int) (short) 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong30 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong31 = x5455_ExtendedTimestamp0.getAccessTime();
        boolean boolean32 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.util.Date date33 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong34 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong34);
        boolean boolean36 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        boolean boolean37 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNull(zipLong13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str19, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong30);
        org.junit.Assert.assertNull(zipLong31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray10 = x5455_ExtendedTimestamp9.getCentralDirectoryData();
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp9.setCreateJavaTime(date11);
        java.lang.String str13 = x5455_ExtendedTimestamp9.toString();
        java.lang.Object obj14 = x5455_ExtendedTimestamp9.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp9.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = null;
        x5455_ExtendedTimestamp9.setCreateTime(zipLong16);
        boolean boolean18 = x5455_ExtendedTimestamp9.isBit0_modifyTimePresent();
        java.util.Date date19 = x5455_ExtendedTimestamp9.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp9.getHeaderId();
        java.util.Date date21 = null;
        x5455_ExtendedTimestamp9.setCreateJavaTime(date21);
        x5455_ExtendedTimestamp9.setFlags((byte) 0);
        byte[] byteArray25 = x5455_ExtendedTimestamp9.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp2.parseFromLocalFileData(byteArray25, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str13, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0 });
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(zipShort13);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong7);
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getHeaderId();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date13 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean2 = x5455_ExtendedTimestamp0.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str5 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str5, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray3 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        x5455_ExtendedTimestamp0.setFlags((byte) 1);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date10);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort9);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp9.setModifyTime(zipLong10);
        boolean boolean12 = x5455_ExtendedTimestamp9.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp9.getLocalFileDataLength();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp9.setCreateJavaTime(date14);
        byte[] byteArray16 = x5455_ExtendedTimestamp9.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray16, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date7 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date7);
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray11 = x5455_ExtendedTimestamp10.getCentralDirectoryData();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date12);
        java.lang.String str14 = x5455_ExtendedTimestamp10.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = null;
        x5455_ExtendedTimestamp10.setCreateTime(zipLong15);
        byte[] byteArray17 = x5455_ExtendedTimestamp10.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray17, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        java.lang.String str11 = x5455_ExtendedTimestamp0.toString();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray14 = x5455_ExtendedTimestamp13.getCentralDirectoryData();
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp13.setCreateJavaTime(date15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = x5455_ExtendedTimestamp13.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = x5455_ExtendedTimestamp13.getAccessTime();
        boolean boolean19 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipLong18);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str11, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNull(zipLong18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zipShort20);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp2.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp2.setAccessTime(zipLong11);
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp2.setAccessJavaTime(date13);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray16 = x5455_ExtendedTimestamp15.getCentralDirectoryData();
        boolean boolean17 = x5455_ExtendedTimestamp2.equals((java.lang.Object) byteArray16);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong1);
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date4 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getCreateTime();
        byte byte6 = x5455_ExtendedTimestamp0.getFlags();
        byte byte7 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        byte[] byteArray9 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.lang.Object obj11 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong12);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj9 = x5455_ExtendedTimestamp8.clone();
        java.util.Date date10 = x5455_ExtendedTimestamp8.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp8.getHeaderId();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp8.setModifyJavaTime(date12);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp8.setModifyTime(zipLong14);
        boolean boolean16 = x5455_ExtendedTimestamp4.equals((java.lang.Object) x5455_ExtendedTimestamp8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = null;
        x5455_ExtendedTimestamp8.setCreateTime(zipLong17);
        boolean boolean19 = x5455_ExtendedTimestamp8.isBit0_modifyTimePresent();
        java.util.Date date20 = x5455_ExtendedTimestamp8.getAccessJavaTime();
        java.lang.Object obj21 = x5455_ExtendedTimestamp8.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getModifyTime();
        java.util.Date date7 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        byte byte8 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp2.getModifyTime();
        java.util.Date date11 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        x5455_ExtendedTimestamp2.setFlags((byte) 96);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp2.setCreateTime(zipLong14);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        java.lang.String str10 = x5455_ExtendedTimestamp0.toString();
        byte[] byteArray11 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str10, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.String str6 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date8);
        byte byte10 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong11);
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean14 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        byte[] byteArray15 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean16 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str6, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp2.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp2.getLocalFileDataLength();
        boolean boolean12 = x5455_ExtendedTimestamp2.isBit0_modifyTimePresent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.lang.String str14 = x5455_ExtendedTimestamp0.toString();
        boolean boolean15 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date16);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=1010 " + "'", str14, "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getAccessTime();
        java.lang.String str3 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str3, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        byte[] byteArray10 = x5455_ExtendedTimestamp2.getLocalFileDataData();
        java.lang.Object obj11 = x5455_ExtendedTimestamp2.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = null;
        x5455_ExtendedTimestamp2.setAccessTime(zipLong12);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj9 = x5455_ExtendedTimestamp8.clone();
        java.util.Date date10 = x5455_ExtendedTimestamp8.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp8.getHeaderId();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp8.setModifyJavaTime(date12);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp8.setModifyTime(zipLong14);
        boolean boolean16 = x5455_ExtendedTimestamp4.equals((java.lang.Object) x5455_ExtendedTimestamp8);
        x5455_ExtendedTimestamp4.setFlags((byte) 1);
        java.util.Date date19 = null;
        x5455_ExtendedTimestamp4.setCreateJavaTime(date19);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp21 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date22 = x5455_ExtendedTimestamp21.getCreateJavaTime();
        java.lang.String str23 = x5455_ExtendedTimestamp21.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong24 = null;
        x5455_ExtendedTimestamp21.setModifyTime(zipLong24);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = x5455_ExtendedTimestamp21.getHeaderId();
        java.util.Date date27 = null;
        x5455_ExtendedTimestamp21.setModifyJavaTime(date27);
        boolean boolean29 = x5455_ExtendedTimestamp21.isBit2_createTimePresent();
        java.util.Date date30 = x5455_ExtendedTimestamp21.getAccessJavaTime();
        boolean boolean31 = x5455_ExtendedTimestamp4.equals((java.lang.Object) x5455_ExtendedTimestamp21);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str23, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong5);
        x5455_ExtendedTimestamp0.setFlags((byte) 8);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(zipLong4);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong3);
        byte[] byteArray5 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getModifyTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNull(zipLong7);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date14);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = x5455_ExtendedTimestamp0.getModifyTime();
        java.lang.String str18 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date19 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date19);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNull(zipLong17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0x5455 Zip Extra Field: Flags=1000 " + "'", str18, "0x5455 Zip Extra Field: Flags=1000 ");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date9 = x5455_ExtendedTimestamp8.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp8.getLocalFileDataLength();
        byte[] byteArray11 = x5455_ExtendedTimestamp8.getCentralDirectoryData();
        boolean boolean12 = x5455_ExtendedTimestamp0.equals((java.lang.Object) byteArray11);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong18);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(zipLong13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNull(zipLong17);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        java.util.Date date11 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date13 = x5455_ExtendedTimestamp12.getModifyJavaTime();
        java.lang.String str14 = x5455_ExtendedTimestamp12.toString();
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp12.setAccessJavaTime(date15);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = null;
        x5455_ExtendedTimestamp12.setModifyTime(zipLong17);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = x5455_ExtendedTimestamp12.getAccessTime();
        java.util.Date date20 = x5455_ExtendedTimestamp12.getAccessJavaTime();
        byte[] byteArray21 = x5455_ExtendedTimestamp12.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray21, (int) '#', (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0 });
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong4);
        byte byte6 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        java.lang.String str11 = x5455_ExtendedTimestamp0.toString();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray14 = x5455_ExtendedTimestamp13.getCentralDirectoryData();
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp13.setCreateJavaTime(date15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = x5455_ExtendedTimestamp13.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = x5455_ExtendedTimestamp13.getAccessTime();
        boolean boolean19 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipLong18);
        java.util.Date date20 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong21 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong21);
        java.util.Date date23 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray24 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str11, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNull(zipLong18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0 });
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong5);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj8 = x5455_ExtendedTimestamp7.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj10 = x5455_ExtendedTimestamp9.clone();
        boolean boolean11 = x5455_ExtendedTimestamp7.equals((java.lang.Object) x5455_ExtendedTimestamp9);
        byte[] byteArray12 = x5455_ExtendedTimestamp7.getCentralDirectoryData();
        java.lang.Object obj13 = x5455_ExtendedTimestamp7.clone();
        byte[] byteArray14 = x5455_ExtendedTimestamp7.getLocalFileDataData();
        boolean boolean15 = x5455_ExtendedTimestamp7.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = x5455_ExtendedTimestamp7.getLocalFileDataLength();
        byte[] byteArray17 = x5455_ExtendedTimestamp7.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray17, 0, (int) 'a');
        org.apache.commons.compress.archivers.zip.ZipLong zipLong21 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong21);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        x5455_ExtendedTimestamp0.setFlags((byte) -1);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray11 = x5455_ExtendedTimestamp10.getCentralDirectoryData();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date12);
        java.lang.String str14 = x5455_ExtendedTimestamp10.toString();
        boolean boolean15 = x5455_ExtendedTimestamp10.isBit1_accessTimePresent();
        boolean boolean16 = x5455_ExtendedTimestamp10.isBit2_createTimePresent();
        java.lang.Object obj17 = x5455_ExtendedTimestamp10.clone();
        boolean boolean18 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp10);
        java.util.Date date19 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date20 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date20);
        java.util.Date date22 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date22);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date11 = x5455_ExtendedTimestamp10.getCreateJavaTime();
        java.lang.String str12 = x5455_ExtendedTimestamp10.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date14 = x5455_ExtendedTimestamp13.getCreateJavaTime();
        byte[] byteArray15 = x5455_ExtendedTimestamp13.getLocalFileDataData();
        x5455_ExtendedTimestamp10.parseFromLocalFileData(byteArray15, 0, (int) (byte) 4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = x5455_ExtendedTimestamp10.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = x5455_ExtendedTimestamp10.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = x5455_ExtendedTimestamp10.getHeaderId();
        boolean boolean22 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp10);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str12, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong19);
        org.junit.Assert.assertNull(zipLong20);
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        java.lang.String str5 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getHeaderId();
        java.lang.Object obj7 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date8);
        byte[] byteArray10 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str5, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray9 = x5455_ExtendedTimestamp8.getCentralDirectoryData();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp8.setCreateJavaTime(date10);
        java.lang.String str12 = x5455_ExtendedTimestamp8.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = null;
        x5455_ExtendedTimestamp8.setCreateTime(zipLong13);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp8.getCentralDirectoryLength();
        byte[] byteArray16 = x5455_ExtendedTimestamp8.getLocalFileDataData();
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray16, (int) (short) 0, (int) '4');
        byte[] byteArray20 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        byte byte21 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str12, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertNotNull(zipShort22);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray9 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte byte10 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 8 + "'", byte10 == (byte) 8);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong6);
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.util.Date date4 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str5 = x5455_ExtendedTimestamp0.toString();
        java.lang.String str6 = x5455_ExtendedTimestamp0.toString();
        byte byte7 = x5455_ExtendedTimestamp0.getFlags();
        java.lang.Object obj8 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str5, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str6, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date4 = x5455_ExtendedTimestamp3.getCreateJavaTime();
        byte[] byteArray5 = x5455_ExtendedTimestamp3.getLocalFileDataData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray5, 0, (int) (byte) 4);
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong10);
        x5455_ExtendedTimestamp0.setFlags((byte) 1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong14);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp16 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date17 = x5455_ExtendedTimestamp16.getCreateJavaTime();
        java.util.Date date18 = null;
        x5455_ExtendedTimestamp16.setAccessJavaTime(date18);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = x5455_ExtendedTimestamp16.getCreateTime();
        byte[] byteArray21 = x5455_ExtendedTimestamp16.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray21, 0, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong25 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray26 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean27 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(zipLong20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date7 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj9 = x5455_ExtendedTimestamp8.clone();
        java.util.Date date10 = x5455_ExtendedTimestamp8.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp8.getHeaderId();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp8.setModifyJavaTime(date12);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp8.setModifyTime(zipLong14);
        boolean boolean16 = x5455_ExtendedTimestamp4.equals((java.lang.Object) x5455_ExtendedTimestamp8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = x5455_ExtendedTimestamp4.getCreateTime();
        java.util.Date date18 = x5455_ExtendedTimestamp4.getCreateJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(zipLong17);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray11 = x5455_ExtendedTimestamp10.getCentralDirectoryData();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date12);
        java.lang.String str14 = x5455_ExtendedTimestamp10.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp10.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = null;
        x5455_ExtendedTimestamp10.setCreateTime(zipLong16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = null;
        x5455_ExtendedTimestamp10.setAccessTime(zipLong18);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = null;
        x5455_ExtendedTimestamp10.setCreateTime(zipLong20);
        byte[] byteArray22 = x5455_ExtendedTimestamp10.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray22, (int) (byte) 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong15);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0 });
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.lang.String str8 = x5455_ExtendedTimestamp0.toString();
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date10);
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=1010 " + "'", str8, "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort13);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj14 = x5455_ExtendedTimestamp13.clone();
        java.util.Date date15 = x5455_ExtendedTimestamp13.getCreateJavaTime();
        boolean boolean16 = x5455_ExtendedTimestamp13.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp17 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean19 = x5455_ExtendedTimestamp17.equals((java.lang.Object) true);
        boolean boolean20 = x5455_ExtendedTimestamp13.equals((java.lang.Object) x5455_ExtendedTimestamp17);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong21 = x5455_ExtendedTimestamp13.getCreateTime();
        java.lang.String str22 = x5455_ExtendedTimestamp13.toString();
        boolean boolean23 = x5455_ExtendedTimestamp13.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong24 = null;
        x5455_ExtendedTimestamp13.setModifyTime(zipLong24);
        java.util.Date date26 = null;
        x5455_ExtendedTimestamp13.setCreateJavaTime(date26);
        boolean boolean28 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date26);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong29 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong29);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(zipLong21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str22, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date5);
        java.util.Date date7 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date7);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(zipLong4);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray3 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray5 = x5455_ExtendedTimestamp4.getCentralDirectoryData();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp4.setCreateJavaTime(date6);
        java.lang.String str8 = x5455_ExtendedTimestamp4.toString();
        java.lang.Object obj9 = x5455_ExtendedTimestamp4.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp4.getModifyTime();
        java.util.Date date11 = x5455_ExtendedTimestamp4.getCreateJavaTime();
        boolean boolean12 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date11);
        java.lang.Object obj13 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp14 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date15 = x5455_ExtendedTimestamp14.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = x5455_ExtendedTimestamp14.getLocalFileDataLength();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp14.setModifyJavaTime(date17);
        byte byte19 = x5455_ExtendedTimestamp14.getFlags();
        x5455_ExtendedTimestamp14.setFlags((byte) 10);
        java.lang.String str22 = x5455_ExtendedTimestamp14.toString();
        byte byte23 = x5455_ExtendedTimestamp14.getFlags();
        java.util.Date date24 = null;
        x5455_ExtendedTimestamp14.setModifyJavaTime(date24);
        boolean boolean26 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date24);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str8, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0x5455 Zip Extra Field: Flags=1010 " + "'", str22, "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 10 + "'", byte23 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zipShort27);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        boolean boolean10 = x5455_ExtendedTimestamp2.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp2.setCreateTime(zipLong11);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray3 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong4);
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date6);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte byte3 = x5455_ExtendedTimestamp0.getFlags();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong6);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong6);
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong12);
        java.util.Date date14 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipLong11);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date7 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        byte[] byteArray5 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.lang.Object obj6 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray7 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date11 = x5455_ExtendedTimestamp10.getCreateJavaTime();
        java.lang.String str12 = x5455_ExtendedTimestamp10.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date14 = x5455_ExtendedTimestamp13.getCreateJavaTime();
        byte[] byteArray15 = x5455_ExtendedTimestamp13.getLocalFileDataData();
        boolean boolean16 = x5455_ExtendedTimestamp13.isBit0_modifyTimePresent();
        byte[] byteArray17 = x5455_ExtendedTimestamp13.getCentralDirectoryData();
        byte byte18 = x5455_ExtendedTimestamp13.getFlags();
        boolean boolean19 = x5455_ExtendedTimestamp13.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp20 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date21 = x5455_ExtendedTimestamp20.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x5455_ExtendedTimestamp20.getLocalFileDataLength();
        java.util.Date date23 = null;
        x5455_ExtendedTimestamp20.setModifyJavaTime(date23);
        byte byte25 = x5455_ExtendedTimestamp20.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = x5455_ExtendedTimestamp20.getCreateTime();
        boolean boolean27 = x5455_ExtendedTimestamp20.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp28 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray29 = x5455_ExtendedTimestamp28.getCentralDirectoryData();
        java.util.Date date30 = null;
        x5455_ExtendedTimestamp28.setCreateJavaTime(date30);
        java.lang.String str32 = x5455_ExtendedTimestamp28.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong33 = null;
        x5455_ExtendedTimestamp28.setCreateTime(zipLong33);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort35 = x5455_ExtendedTimestamp28.getCentralDirectoryLength();
        byte[] byteArray36 = x5455_ExtendedTimestamp28.getLocalFileDataData();
        x5455_ExtendedTimestamp20.parseFromCentralDirectoryData(byteArray36, (int) (short) 0, (int) '4');
        x5455_ExtendedTimestamp13.parseFromLocalFileData(byteArray36, (int) (short) 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong43 = x5455_ExtendedTimestamp13.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong44 = x5455_ExtendedTimestamp13.getAccessTime();
        byte[] byteArray45 = x5455_ExtendedTimestamp13.getCentralDirectoryData();
        x5455_ExtendedTimestamp10.parseFromLocalFileData(byteArray45, (int) (byte) 0, (int) (short) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp49 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date50 = x5455_ExtendedTimestamp49.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort51 = x5455_ExtendedTimestamp49.getLocalFileDataLength();
        java.util.Date date52 = null;
        x5455_ExtendedTimestamp49.setModifyJavaTime(date52);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort54 = x5455_ExtendedTimestamp49.getCentralDirectoryLength();
        java.lang.String str55 = x5455_ExtendedTimestamp49.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort56 = x5455_ExtendedTimestamp49.getLocalFileDataLength();
        boolean boolean57 = x5455_ExtendedTimestamp10.equals((java.lang.Object) zipShort56);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong58 = x5455_ExtendedTimestamp10.getCreateTime();
        byte[] byteArray59 = x5455_ExtendedTimestamp10.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray59, (int) (byte) 96, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str12, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertNull(zipLong26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str32, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong43);
        org.junit.Assert.assertNull(zipLong44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertNotNull(zipShort51);
        org.junit.Assert.assertNotNull(zipShort54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str55, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(zipLong58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 0 });
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        java.util.Date date9 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong10);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date14);
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date16);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean2 = x5455_ExtendedTimestamp0.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(zipLong3);
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        boolean boolean10 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(zipLong11);
        org.junit.Assert.assertNotNull(zipShort12);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp4.setModifyTime(zipLong8);
        byte[] byteArray10 = x5455_ExtendedTimestamp4.getLocalFileDataData();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date13);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong16);
        java.util.Date date18 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.String str6 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date8);
        byte byte10 = x5455_ExtendedTimestamp0.getFlags();
        byte[] byteArray11 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str6, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj10 = x5455_ExtendedTimestamp9.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj12 = x5455_ExtendedTimestamp11.clone();
        boolean boolean13 = x5455_ExtendedTimestamp9.equals((java.lang.Object) x5455_ExtendedTimestamp11);
        byte[] byteArray14 = x5455_ExtendedTimestamp9.getCentralDirectoryData();
        java.lang.Object obj15 = x5455_ExtendedTimestamp9.clone();
        byte[] byteArray16 = x5455_ExtendedTimestamp9.getLocalFileDataData();
        boolean boolean17 = x5455_ExtendedTimestamp9.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x5455_ExtendedTimestamp9.getLocalFileDataLength();
        byte[] byteArray19 = x5455_ExtendedTimestamp9.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp9.getCentralDirectoryLength();
        boolean boolean21 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp9);
        java.util.Date date22 = x5455_ExtendedTimestamp9.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = x5455_ExtendedTimestamp9.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = x5455_ExtendedTimestamp9.getHeaderId();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(zipLong23);
        org.junit.Assert.assertNotNull(zipShort24);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.String str9 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date13 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp12.setAccessJavaTime(date14);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = x5455_ExtendedTimestamp12.getCreateTime();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp12.setCreateJavaTime(date17);
        byte[] byteArray19 = x5455_ExtendedTimestamp12.getLocalFileDataData();
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray19, 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str9, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(zipLong16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        byte[] byteArray5 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.lang.Object obj6 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray7 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date10);
        boolean boolean12 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        boolean boolean13 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date4 = x5455_ExtendedTimestamp3.getCreateJavaTime();
        byte[] byteArray5 = x5455_ExtendedTimestamp3.getLocalFileDataData();
        boolean boolean6 = x5455_ExtendedTimestamp3.isBit0_modifyTimePresent();
        byte[] byteArray7 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
        byte byte8 = x5455_ExtendedTimestamp3.getFlags();
        boolean boolean9 = x5455_ExtendedTimestamp3.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date11 = x5455_ExtendedTimestamp10.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp10.getLocalFileDataLength();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp10.setModifyJavaTime(date13);
        byte byte15 = x5455_ExtendedTimestamp10.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = x5455_ExtendedTimestamp10.getCreateTime();
        boolean boolean17 = x5455_ExtendedTimestamp10.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray19 = x5455_ExtendedTimestamp18.getCentralDirectoryData();
        java.util.Date date20 = null;
        x5455_ExtendedTimestamp18.setCreateJavaTime(date20);
        java.lang.String str22 = x5455_ExtendedTimestamp18.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = null;
        x5455_ExtendedTimestamp18.setCreateTime(zipLong23);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort25 = x5455_ExtendedTimestamp18.getCentralDirectoryLength();
        byte[] byteArray26 = x5455_ExtendedTimestamp18.getLocalFileDataData();
        x5455_ExtendedTimestamp10.parseFromCentralDirectoryData(byteArray26, (int) (short) 0, (int) '4');
        x5455_ExtendedTimestamp3.parseFromLocalFileData(byteArray26, (int) (short) 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong33 = x5455_ExtendedTimestamp3.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong34 = x5455_ExtendedTimestamp3.getAccessTime();
        byte[] byteArray35 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray35, (int) (byte) 0, (int) (short) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp39 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date40 = x5455_ExtendedTimestamp39.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = x5455_ExtendedTimestamp39.getLocalFileDataLength();
        java.util.Date date42 = null;
        x5455_ExtendedTimestamp39.setModifyJavaTime(date42);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort44 = x5455_ExtendedTimestamp39.getCentralDirectoryLength();
        java.lang.String str45 = x5455_ExtendedTimestamp39.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort46 = x5455_ExtendedTimestamp39.getLocalFileDataLength();
        boolean boolean47 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipShort46);
        boolean boolean48 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.lang.Class<?> wildcardClass49 = x5455_ExtendedTimestamp0.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertNull(zipLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str22, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong33);
        org.junit.Assert.assertNull(zipLong34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertNotNull(zipShort41);
        org.junit.Assert.assertNotNull(zipShort44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str45, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        java.lang.String str5 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getHeaderId();
        java.lang.Object obj7 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str5, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong10);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date2);
        java.util.Date date4 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong5);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj12 = x5455_ExtendedTimestamp11.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj14 = x5455_ExtendedTimestamp13.clone();
        boolean boolean15 = x5455_ExtendedTimestamp11.equals((java.lang.Object) x5455_ExtendedTimestamp13);
        java.util.Date date16 = x5455_ExtendedTimestamp11.getCreateJavaTime();
        boolean boolean17 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp11);
        boolean boolean18 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray19 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong20);
        x5455_ExtendedTimestamp0.setFlags((byte) -1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong24 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong24);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong26);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.lang.String str9 = x5455_ExtendedTimestamp0.toString();
        boolean boolean10 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong11);
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date13);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        byte byte16 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = x5455_ExtendedTimestamp0.getCreateTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str9, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNull(zipLong17);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.lang.String str8 = x5455_ExtendedTimestamp0.toString();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte byte10 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date11);
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=1010 " + "'", str8, "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte byte3 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(zipShort7);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong11);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = x5455_ExtendedTimestamp0.getModifyTime();
        java.lang.String str14 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong16);
        byte byte18 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.equals((java.lang.Object) 0.0f);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getHeaderId();
        java.lang.String str9 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date10 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str11 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str9, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str11, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date9 = x5455_ExtendedTimestamp8.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp8.getLocalFileDataLength();
        byte[] byteArray11 = x5455_ExtendedTimestamp8.getCentralDirectoryData();
        boolean boolean12 = x5455_ExtendedTimestamp0.equals((java.lang.Object) byteArray11);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean16 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(zipLong13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNull(zipLong15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date13);
        byte[] byteArray15 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong18);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        java.lang.String str11 = x5455_ExtendedTimestamp0.toString();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray14 = x5455_ExtendedTimestamp13.getCentralDirectoryData();
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp13.setCreateJavaTime(date15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = x5455_ExtendedTimestamp13.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = x5455_ExtendedTimestamp13.getAccessTime();
        boolean boolean19 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipLong18);
        java.util.Date date20 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong21 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong21);
        java.util.Date date23 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong24 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort25 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = x5455_ExtendedTimestamp0.getCreateTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str11, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNull(zipLong18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNull(zipLong24);
        org.junit.Assert.assertNotNull(zipShort25);
        org.junit.Assert.assertNull(zipLong26);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date7 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray9 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.lang.Object obj8 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong8);
        java.lang.String str10 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date11);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong13);
        byte[] byteArray15 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        x5455_ExtendedTimestamp0.setFlags((byte) 4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong18);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str10, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date2);
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        x5455_ExtendedTimestamp0.setFlags((byte) 1);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date12);
        boolean boolean14 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date15);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) 0L);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertNull(zipLong11);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date7 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj10 = x5455_ExtendedTimestamp9.clone();
        java.util.Date date11 = x5455_ExtendedTimestamp9.getCreateJavaTime();
        byte byte12 = x5455_ExtendedTimestamp9.getFlags();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp9.setModifyJavaTime(date13);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = null;
        x5455_ExtendedTimestamp9.setAccessTime(zipLong15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = x5455_ExtendedTimestamp9.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x5455_ExtendedTimestamp9.getHeaderId();
        boolean boolean19 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = null;
        x5455_ExtendedTimestamp9.setCreateTime(zipLong20);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean2 = x5455_ExtendedTimestamp0.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp0.getModifyTime();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date4);
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(zipLong3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        byte byte7 = x5455_ExtendedTimestamp0.getFlags();
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray8, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date13);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp0.getHeaderId();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str19 = x5455_ExtendedTimestamp18.toString();
        java.util.Date date20 = x5455_ExtendedTimestamp18.getModifyJavaTime();
        java.util.Date date21 = null;
        x5455_ExtendedTimestamp18.setAccessJavaTime(date21);
        java.lang.Class<?> wildcardClass23 = x5455_ExtendedTimestamp18.getClass();
        boolean boolean24 = x5455_ExtendedTimestamp0.equals((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str19, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        byte byte6 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date10 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        byte[] byteArray11 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray10 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong12);
        java.util.Date date14 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date2);
        java.lang.Object obj4 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        java.util.Date date7 = x5455_ExtendedTimestamp5.getCreateJavaTime();
        boolean boolean8 = x5455_ExtendedTimestamp5.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean11 = x5455_ExtendedTimestamp9.equals((java.lang.Object) true);
        boolean boolean12 = x5455_ExtendedTimestamp5.equals((java.lang.Object) x5455_ExtendedTimestamp9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp5.getLocalFileDataLength();
        boolean boolean14 = x5455_ExtendedTimestamp5.isBit0_modifyTimePresent();
        byte[] byteArray15 = x5455_ExtendedTimestamp5.getLocalFileDataData();
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp5);
        byte[] byteArray17 = x5455_ExtendedTimestamp5.getCentralDirectoryData();
        java.util.Date date18 = null;
        x5455_ExtendedTimestamp5.setCreateJavaTime(date18);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = null;
        x5455_ExtendedTimestamp5.setModifyTime(zipLong20);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj8 = x5455_ExtendedTimestamp7.clone();
        java.util.Date date9 = x5455_ExtendedTimestamp7.getCreateJavaTime();
        boolean boolean10 = x5455_ExtendedTimestamp7.isBit1_accessTimePresent();
        byte[] byteArray11 = x5455_ExtendedTimestamp7.getCentralDirectoryData();
        java.util.Date date12 = x5455_ExtendedTimestamp7.getModifyJavaTime();
        boolean boolean13 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp7);
        byte[] byteArray14 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.lang.String str15 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str15, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.Object obj6 = null;
        boolean boolean7 = x5455_ExtendedTimestamp0.equals(obj6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte byte11 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong12);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong1);
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNull(zipLong10);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.String str3 = x5455_ExtendedTimestamp0.toString();
        x5455_ExtendedTimestamp0.setFlags((byte) 1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong6);
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date8);
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date10);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str3, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong11);
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date13);
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date15);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong17);
        java.lang.Object obj19 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.equals((java.lang.Object) 0.0f);
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(zipLong8);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp2.getModifyTime();
        java.util.Date date11 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        x5455_ExtendedTimestamp2.setFlags((byte) 2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        byte[] byteArray9 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.lang.Class<?> wildcardClass10 = x5455_ExtendedTimestamp0.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray3 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getAccessTime();
        java.lang.String str5 = x5455_ExtendedTimestamp0.toString();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date8 = x5455_ExtendedTimestamp7.getCreateJavaTime();
        java.lang.String str9 = x5455_ExtendedTimestamp7.toString();
        x5455_ExtendedTimestamp7.setFlags((byte) 10);
        byte byte12 = x5455_ExtendedTimestamp7.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = x5455_ExtendedTimestamp7.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp7.getAccessTime();
        boolean boolean15 = x5455_ExtendedTimestamp7.isBit0_modifyTimePresent();
        byte[] byteArray16 = x5455_ExtendedTimestamp7.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray16, (int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str5, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str9, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertNull(zipLong13);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj4 = x5455_ExtendedTimestamp3.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        boolean boolean7 = x5455_ExtendedTimestamp3.equals((java.lang.Object) x5455_ExtendedTimestamp5);
        byte[] byteArray8 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray8, 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj13 = x5455_ExtendedTimestamp12.clone();
        java.util.Date date14 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp12.getHeaderId();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp12.setModifyJavaTime(date16);
        boolean boolean18 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.String str21 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date22 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date22);
        java.util.Date date24 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date24);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp26 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray27 = x5455_ExtendedTimestamp26.getCentralDirectoryData();
        boolean boolean28 = x5455_ExtendedTimestamp26.isBit1_accessTimePresent();
        java.util.Date date29 = null;
        x5455_ExtendedTimestamp26.setAccessJavaTime(date29);
        java.util.Date date31 = null;
        x5455_ExtendedTimestamp26.setAccessJavaTime(date31);
        byte[] byteArray33 = x5455_ExtendedTimestamp26.getLocalFileDataData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray33, 0, (int) (byte) 2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong37 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong37);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(zipLong19);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str21, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0 });
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getAccessTime();
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.lang.Object obj7 = x5455_ExtendedTimestamp0.clone();
        java.lang.String str8 = x5455_ExtendedTimestamp0.toString();
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str8, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray10 = x5455_ExtendedTimestamp9.getCentralDirectoryData();
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp9.setCreateJavaTime(date11);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp9.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp9.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp9.getHeaderId();
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp9);
        byte[] byteArray17 = x5455_ExtendedTimestamp9.getLocalFileDataData();
        boolean boolean18 = x5455_ExtendedTimestamp9.isBit2_createTimePresent();
        java.lang.Object obj19 = x5455_ExtendedTimestamp9.clone();
        java.util.Date date20 = null;
        x5455_ExtendedTimestamp9.setModifyJavaTime(date20);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong5);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.util.Date date9 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.Object obj10 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "0x5455 Zip Extra Field: Flags=1010 ");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.util.Date date4 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date6 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str9 = x5455_ExtendedTimestamp0.toString();
        java.lang.Object obj10 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str9, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date14);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = x5455_ExtendedTimestamp0.getModifyTime();
        java.util.Date date18 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date19 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNull(zipLong17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean12 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date14);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp2.setModifyTime(zipLong10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date13 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        java.lang.String str14 = x5455_ExtendedTimestamp12.toString();
        java.util.Date date15 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        java.lang.String str16 = x5455_ExtendedTimestamp12.toString();
        boolean boolean17 = x5455_ExtendedTimestamp12.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x5455_ExtendedTimestamp12.getCentralDirectoryLength();
        boolean boolean19 = x5455_ExtendedTimestamp12.isBit1_accessTimePresent();
        java.util.Date date20 = x5455_ExtendedTimestamp12.getModifyJavaTime();
        java.lang.String str21 = x5455_ExtendedTimestamp12.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x5455_ExtendedTimestamp12.getCentralDirectoryLength();
        boolean boolean23 = x5455_ExtendedTimestamp2.equals((java.lang.Object) x5455_ExtendedTimestamp12);
        java.util.Date date24 = null;
        x5455_ExtendedTimestamp12.setAccessJavaTime(date24);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str16, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str21, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        byte[] byteArray5 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.lang.Object obj6 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray7 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getHeaderId();
        java.lang.Object obj12 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date6);
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong12);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(zipShort14);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date7 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date7);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getModifyTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(zipLong9);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) ' ');
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date10 = x5455_ExtendedTimestamp9.getCreateJavaTime();
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp9.setAccessJavaTime(date11);
        boolean boolean13 = x5455_ExtendedTimestamp9.isBit2_createTimePresent();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp9.setCreateJavaTime(date14);
        java.util.Date date16 = x5455_ExtendedTimestamp9.getCreateJavaTime();
        java.util.Date date17 = x5455_ExtendedTimestamp9.getAccessJavaTime();
        boolean boolean18 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date17);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong19);
        byte[] byteArray21 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0 });
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        x5455_ExtendedTimestamp0.setFlags((byte) 100);
        java.lang.String str8 = x5455_ExtendedTimestamp0.toString();
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=1100100 " + "'", str8, "0x5455 Zip Extra Field: Flags=1100100 ");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNull(zipLong11);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date9 = x5455_ExtendedTimestamp8.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp8.getLocalFileDataLength();
        byte[] byteArray11 = x5455_ExtendedTimestamp8.getCentralDirectoryData();
        boolean boolean12 = x5455_ExtendedTimestamp0.equals((java.lang.Object) byteArray11);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong14);
        java.lang.Object obj16 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(zipLong13);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date5 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray10 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date12 = x5455_ExtendedTimestamp11.getCreateJavaTime();
        byte[] byteArray13 = x5455_ExtendedTimestamp11.getLocalFileDataData();
        boolean boolean14 = x5455_ExtendedTimestamp11.isBit0_modifyTimePresent();
        byte[] byteArray15 = x5455_ExtendedTimestamp11.getCentralDirectoryData();
        byte byte16 = x5455_ExtendedTimestamp11.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = null;
        x5455_ExtendedTimestamp11.setModifyTime(zipLong17);
        byte[] byteArray19 = x5455_ExtendedTimestamp11.getLocalFileDataData();
        java.util.Date date20 = x5455_ExtendedTimestamp11.getCreateJavaTime();
        byte[] byteArray21 = x5455_ExtendedTimestamp11.getLocalFileDataData();
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray21, 0, (int) (short) 0);
        boolean boolean25 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.setFlags((byte) 2);
        byte byte4 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getModifyTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 2 + "'", byte4 == (byte) 2);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNull(zipLong8);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray10 = x5455_ExtendedTimestamp9.getCentralDirectoryData();
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp9.setCreateJavaTime(date11);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp9.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp9.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp9.getHeaderId();
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp9);
        java.util.Date date17 = x5455_ExtendedTimestamp9.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x5455_ExtendedTimestamp9.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp9.getCentralDirectoryLength();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertNotNull(zipShort19);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.String str9 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str9, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong12);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.lang.String str9 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date10 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str9, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj12 = x5455_ExtendedTimestamp11.clone();
        java.util.Date date13 = x5455_ExtendedTimestamp11.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp11.getHeaderId();
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp11.setModifyJavaTime(date15);
        x5455_ExtendedTimestamp11.setFlags((byte) 0);
        boolean boolean19 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp11);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong22 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong22);
        boolean boolean24 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong25 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong25);
        byte[] byteArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray27, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getAccessTime();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.lang.String str8 = x5455_ExtendedTimestamp0.toString();
        java.lang.Object obj9 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str8, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        x5455_ExtendedTimestamp0.setFlags((byte) 100);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong11);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong1);
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.Object obj3 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date4 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong6);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean2 = x5455_ExtendedTimestamp0.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray10 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.lang.Object obj11 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp0.getModifyTime();
        java.lang.Object obj13 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong14);
        byte[] byteArray16 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.lang.String str17 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str17, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date9 = x5455_ExtendedTimestamp8.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp8.getLocalFileDataLength();
        byte[] byteArray11 = x5455_ExtendedTimestamp8.getCentralDirectoryData();
        boolean boolean12 = x5455_ExtendedTimestamp0.equals((java.lang.Object) byteArray11);
        java.util.Date date13 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date14 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong16);
        java.util.Date date18 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date20 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date20);
        x5455_ExtendedTimestamp0.setFlags((byte) 8);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(zipShort19);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj4 = x5455_ExtendedTimestamp3.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        boolean boolean7 = x5455_ExtendedTimestamp3.equals((java.lang.Object) x5455_ExtendedTimestamp5);
        byte[] byteArray8 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray8, 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj13 = x5455_ExtendedTimestamp12.clone();
        java.util.Date date14 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp12.getHeaderId();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp12.setModifyJavaTime(date16);
        boolean boolean18 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.String str21 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date22 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date22);
        java.util.Date date24 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date24);
        java.util.Date date26 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(zipLong19);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str21, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date26);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        byte[] byteArray10 = x5455_ExtendedTimestamp2.getLocalFileDataData();
        java.lang.Object obj11 = x5455_ExtendedTimestamp2.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp2.getModifyTime();
        java.util.Date date13 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp2.getAccessTime();
        boolean boolean15 = x5455_ExtendedTimestamp2.isBit0_modifyTimePresent();
        byte byte16 = x5455_ExtendedTimestamp2.getFlags();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date4 = x5455_ExtendedTimestamp3.getCreateJavaTime();
        byte[] byteArray5 = x5455_ExtendedTimestamp3.getLocalFileDataData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray5, 0, (int) (byte) 4);
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong10);
        x5455_ExtendedTimestamp0.setFlags((byte) 1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong14);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp16 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date17 = x5455_ExtendedTimestamp16.getCreateJavaTime();
        java.util.Date date18 = null;
        x5455_ExtendedTimestamp16.setAccessJavaTime(date18);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = x5455_ExtendedTimestamp16.getCreateTime();
        byte[] byteArray21 = x5455_ExtendedTimestamp16.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray21, 0, (int) (short) -1);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(zipLong20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0 });
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getAccessTime();
        byte[] byteArray9 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date10 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong6);
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date9 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong11);
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong14);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp4.setModifyTime(zipLong8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp4.getModifyTime();
        boolean boolean11 = x5455_ExtendedTimestamp4.isBit2_createTimePresent();
        java.util.Date date12 = x5455_ExtendedTimestamp4.getAccessJavaTime();
        java.lang.Object obj13 = x5455_ExtendedTimestamp4.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray7 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong8);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.lang.String str10 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date11 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.lang.Object obj12 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date13 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str10, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(zipShort14);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj8 = x5455_ExtendedTimestamp7.clone();
        java.util.Date date9 = x5455_ExtendedTimestamp7.getCreateJavaTime();
        boolean boolean10 = x5455_ExtendedTimestamp7.isBit1_accessTimePresent();
        byte[] byteArray11 = x5455_ExtendedTimestamp7.getCentralDirectoryData();
        java.util.Date date12 = x5455_ExtendedTimestamp7.getModifyJavaTime();
        boolean boolean13 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp7);
        java.util.Date date14 = x5455_ExtendedTimestamp7.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj16 = x5455_ExtendedTimestamp15.clone();
        boolean boolean17 = x5455_ExtendedTimestamp15.isBit1_accessTimePresent();
        boolean boolean19 = x5455_ExtendedTimestamp15.equals((java.lang.Object) ' ');
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = null;
        x5455_ExtendedTimestamp15.setCreateTime(zipLong20);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x5455_ExtendedTimestamp15.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = x5455_ExtendedTimestamp15.getModifyTime();
        java.util.Date date24 = null;
        x5455_ExtendedTimestamp15.setCreateJavaTime(date24);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = x5455_ExtendedTimestamp15.getCreateTime();
        boolean boolean27 = x5455_ExtendedTimestamp15.isBit2_createTimePresent();
        byte[] byteArray28 = x5455_ExtendedTimestamp15.getLocalFileDataData();
        boolean boolean29 = x5455_ExtendedTimestamp7.equals((java.lang.Object) x5455_ExtendedTimestamp15);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertNull(zipLong23);
        org.junit.Assert.assertNull(zipLong26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getAccessTime();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date9 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.lang.String str10 = x5455_ExtendedTimestamp0.toString();
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.String str12 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0x5455 Zip Extra Field: Flags=1010 " + "'", str10, "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0x5455 Zip Extra Field: Flags=1010 " + "'", str12, "0x5455 Zip Extra Field: Flags=1010 ");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong10);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date2);
        java.lang.Object obj4 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        x5455_ExtendedTimestamp0.setFlags((byte) 2);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        byte[] byteArray10 = x5455_ExtendedTimestamp2.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp2.setModifyTime(zipLong11);
        boolean boolean13 = x5455_ExtendedTimestamp2.isBit2_createTimePresent();
        java.lang.String str14 = x5455_ExtendedTimestamp2.toString();
        byte[] byteArray15 = x5455_ExtendedTimestamp2.getLocalFileDataData();
        x5455_ExtendedTimestamp2.setFlags((byte) 8);
        java.util.Date date18 = x5455_ExtendedTimestamp2.getModifyJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        java.util.Date date9 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong10);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date14);
        java.lang.Object obj16 = null;
        boolean boolean17 = x5455_ExtendedTimestamp0.equals(obj16);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.Object obj3 = x5455_ExtendedTimestamp0.clone();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean2 = x5455_ExtendedTimestamp0.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        x5455_ExtendedTimestamp0.setFlags((byte) 2);
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getAccessTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = zipLong8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(zipLong8);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.util.Date date4 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        java.util.Date date7 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date7);
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        byte[] byteArray10 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.lang.Class<?> wildcardClass11 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        x5455_ExtendedTimestamp0.setFlags((byte) 2);
        java.lang.String str10 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date11 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date13 = x5455_ExtendedTimestamp12.getModifyJavaTime();
        java.lang.String str14 = x5455_ExtendedTimestamp12.toString();
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp12.setAccessJavaTime(date15);
        boolean boolean17 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp12);
        java.util.Date date18 = null;
        x5455_ExtendedTimestamp12.setCreateJavaTime(date18);
        boolean boolean20 = x5455_ExtendedTimestamp12.isBit1_accessTimePresent();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0x5455 Zip Extra Field: Flags=10 " + "'", str10, "0x5455 Zip Extra Field: Flags=10 ");
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong4);
        byte byte6 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.lang.Object obj9 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong11);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong13);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNull(zipLong15);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        byte byte4 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date6 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean2 = x5455_ExtendedTimestamp0.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj9 = x5455_ExtendedTimestamp8.clone();
        java.util.Date date10 = x5455_ExtendedTimestamp8.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp8.getHeaderId();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp8.setModifyJavaTime(date12);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp8.setModifyTime(zipLong14);
        boolean boolean16 = x5455_ExtendedTimestamp4.equals((java.lang.Object) x5455_ExtendedTimestamp8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = null;
        x5455_ExtendedTimestamp8.setAccessTime(zipLong17);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = null;
        x5455_ExtendedTimestamp8.setAccessTime(zipLong19);
        byte[] byteArray21 = x5455_ExtendedTimestamp8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong22 = x5455_ExtendedTimestamp8.getModifyTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong22);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        byte byte8 = x5455_ExtendedTimestamp4.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp4.setAccessTime(zipLong9);
        boolean boolean11 = x5455_ExtendedTimestamp4.isBit0_modifyTimePresent();
        byte byte12 = x5455_ExtendedTimestamp4.getFlags();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp4.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(zipShort13);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.equals((java.lang.Object) 0.0f);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong6);
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date8);
        java.util.Date date10 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj9 = x5455_ExtendedTimestamp8.clone();
        java.util.Date date10 = x5455_ExtendedTimestamp8.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp8.getHeaderId();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp8.setModifyJavaTime(date12);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp8.setModifyTime(zipLong14);
        boolean boolean16 = x5455_ExtendedTimestamp4.equals((java.lang.Object) x5455_ExtendedTimestamp8);
        java.util.Date date17 = x5455_ExtendedTimestamp4.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = null;
        x5455_ExtendedTimestamp4.setCreateTime(zipLong18);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = x5455_ExtendedTimestamp4.getModifyTime();
        java.util.Date date21 = x5455_ExtendedTimestamp4.getModifyJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(zipLong20);
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.lang.String str8 = x5455_ExtendedTimestamp0.toString();
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=1010 " + "'", str8, "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNotNull(zipShort11);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray10 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.lang.Object obj11 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp0.getModifyTime();
        java.lang.Object obj13 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean15 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date16);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(zipLong6);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.lang.String str9 = x5455_ExtendedTimestamp0.toString();
        boolean boolean10 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong11);
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date13);
        boolean boolean15 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date16);
        java.util.Date date18 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = x5455_ExtendedTimestamp0.getModifyTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str9, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(zipLong19);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp2.setModifyTime(zipLong10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date13 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        java.lang.String str14 = x5455_ExtendedTimestamp12.toString();
        java.util.Date date15 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        java.lang.String str16 = x5455_ExtendedTimestamp12.toString();
        boolean boolean17 = x5455_ExtendedTimestamp12.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x5455_ExtendedTimestamp12.getCentralDirectoryLength();
        boolean boolean19 = x5455_ExtendedTimestamp12.isBit1_accessTimePresent();
        java.util.Date date20 = x5455_ExtendedTimestamp12.getModifyJavaTime();
        java.lang.String str21 = x5455_ExtendedTimestamp12.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x5455_ExtendedTimestamp12.getCentralDirectoryLength();
        boolean boolean23 = x5455_ExtendedTimestamp2.equals((java.lang.Object) x5455_ExtendedTimestamp12);
        java.util.Date date24 = null;
        x5455_ExtendedTimestamp12.setCreateJavaTime(date24);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str16, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str21, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date4);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp6 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date7 = x5455_ExtendedTimestamp6.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp6.getLocalFileDataLength();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp6.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp6.getCentralDirectoryLength();
        java.lang.String str12 = x5455_ExtendedTimestamp6.toString();
        java.util.Date date13 = x5455_ExtendedTimestamp6.getModifyJavaTime();
        boolean boolean14 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date13);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong15);
        boolean boolean17 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str12, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray3 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        java.util.Date date7 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date7);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong9);
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date11);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date4 = x5455_ExtendedTimestamp3.getCreateJavaTime();
        byte[] byteArray5 = x5455_ExtendedTimestamp3.getLocalFileDataData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray5, 0, (int) (byte) 4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getHeaderId();
        boolean boolean12 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        byte[] byteArray10 = x5455_ExtendedTimestamp2.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp2.setModifyTime(zipLong11);
        boolean boolean13 = x5455_ExtendedTimestamp2.isBit2_createTimePresent();
        java.lang.String str14 = x5455_ExtendedTimestamp2.toString();
        byte[] byteArray15 = x5455_ExtendedTimestamp2.getLocalFileDataData();
        x5455_ExtendedTimestamp2.setFlags((byte) 8);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date19 = x5455_ExtendedTimestamp18.getModifyJavaTime();
        java.lang.String str20 = x5455_ExtendedTimestamp18.toString();
        java.util.Date date21 = null;
        x5455_ExtendedTimestamp18.setAccessJavaTime(date21);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = null;
        x5455_ExtendedTimestamp18.setModifyTime(zipLong23);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong25 = x5455_ExtendedTimestamp18.getAccessTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp26 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date27 = x5455_ExtendedTimestamp26.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = x5455_ExtendedTimestamp26.getLocalFileDataLength();
        byte[] byteArray29 = x5455_ExtendedTimestamp26.getCentralDirectoryData();
        boolean boolean30 = x5455_ExtendedTimestamp18.equals((java.lang.Object) byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp2.parseFromLocalFileData(byteArray29, (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str20, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong25);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNotNull(zipShort28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(zipLong6);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date2);
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        byte byte10 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date7 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date7);
        java.lang.Object obj9 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str11 = x5455_ExtendedTimestamp10.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp10.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp10.getHeaderId();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp14 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date15 = x5455_ExtendedTimestamp14.getCreateJavaTime();
        byte[] byteArray16 = x5455_ExtendedTimestamp14.getLocalFileDataData();
        boolean boolean17 = x5455_ExtendedTimestamp14.isBit0_modifyTimePresent();
        byte[] byteArray18 = x5455_ExtendedTimestamp14.getCentralDirectoryData();
        byte byte19 = x5455_ExtendedTimestamp14.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = null;
        x5455_ExtendedTimestamp14.setModifyTime(zipLong20);
        byte[] byteArray22 = x5455_ExtendedTimestamp14.getLocalFileDataData();
        byte[] byteArray23 = x5455_ExtendedTimestamp14.getLocalFileDataData();
        x5455_ExtendedTimestamp10.parseFromCentralDirectoryData(byteArray23, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray23, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str11, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0 });
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date8);
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp0.getModifyTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNull(zipLong12);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getHeaderId();
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong9);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        byte[] byteArray10 = x5455_ExtendedTimestamp2.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp2.setModifyTime(zipLong11);
        boolean boolean13 = x5455_ExtendedTimestamp2.isBit2_createTimePresent();
        java.lang.String str14 = x5455_ExtendedTimestamp2.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp2.getCreateTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong15);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong6);
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getHeaderId();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.String str6 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date8);
        byte byte10 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong11);
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean14 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray16 = x5455_ExtendedTimestamp15.getCentralDirectoryData();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp15.setCreateJavaTime(date17);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp15.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = x5455_ExtendedTimestamp15.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong21 = x5455_ExtendedTimestamp15.getAccessTime();
        boolean boolean22 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = x5455_ExtendedTimestamp15.getCentralDirectoryLength();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str6, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNull(zipLong20);
        org.junit.Assert.assertNull(zipLong21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(zipShort23);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.lang.String str8 = x5455_ExtendedTimestamp0.toString();
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean13 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=1010 " + "'", str8, "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.Object obj6 = null;
        boolean boolean7 = x5455_ExtendedTimestamp0.equals(obj6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        java.util.Date date10 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date11 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        x5455_ExtendedTimestamp0.setFlags((byte) 8);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        byte byte2 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getAccessTime();
        byte byte6 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp2.getModifyTime();
        boolean boolean6 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date8 = x5455_ExtendedTimestamp7.getModifyJavaTime();
        java.lang.String str9 = x5455_ExtendedTimestamp7.toString();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp7.setAccessJavaTime(date10);
        java.lang.Object obj12 = x5455_ExtendedTimestamp7.clone();
        boolean boolean13 = x5455_ExtendedTimestamp7.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp7.getCreateTime();
        boolean boolean15 = x5455_ExtendedTimestamp7.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp16 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray17 = x5455_ExtendedTimestamp16.getCentralDirectoryData();
        java.util.Date date18 = null;
        x5455_ExtendedTimestamp16.setCreateJavaTime(date18);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp16.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong21 = x5455_ExtendedTimestamp16.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x5455_ExtendedTimestamp16.getHeaderId();
        boolean boolean23 = x5455_ExtendedTimestamp7.equals((java.lang.Object) x5455_ExtendedTimestamp16);
        byte[] byteArray24 = x5455_ExtendedTimestamp16.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp2.parseFromCentralDirectoryData(byteArray24, (-1), (int) (byte) 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str9, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertNull(zipLong21);
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0 });
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getAccessTime();
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong7);
        byte[] byteArray9 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        byte[] byteArray7 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipLong9);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray10 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.lang.Object obj11 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong12);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp0.getModifyTime();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date16);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNull(zipLong15);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong6);
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date9 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = date9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date6);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(zipLong5);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong11);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong1);
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date10 = x5455_ExtendedTimestamp9.getModifyJavaTime();
        java.lang.String str11 = x5455_ExtendedTimestamp9.toString();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp9.setAccessJavaTime(date12);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp9.setModifyTime(zipLong14);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = x5455_ExtendedTimestamp9.getAccessTime();
        boolean boolean17 = x5455_ExtendedTimestamp9.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj19 = x5455_ExtendedTimestamp18.clone();
        java.util.Date date20 = x5455_ExtendedTimestamp18.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = x5455_ExtendedTimestamp18.getHeaderId();
        java.util.Date date22 = null;
        x5455_ExtendedTimestamp18.setModifyJavaTime(date22);
        x5455_ExtendedTimestamp18.setFlags((byte) 0);
        java.util.Date date26 = x5455_ExtendedTimestamp18.getModifyJavaTime();
        java.util.Date date27 = null;
        x5455_ExtendedTimestamp18.setModifyJavaTime(date27);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp29 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj30 = x5455_ExtendedTimestamp29.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp31 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj32 = x5455_ExtendedTimestamp31.clone();
        boolean boolean33 = x5455_ExtendedTimestamp29.equals((java.lang.Object) x5455_ExtendedTimestamp31);
        java.util.Date date34 = x5455_ExtendedTimestamp29.getCreateJavaTime();
        boolean boolean35 = x5455_ExtendedTimestamp18.equals((java.lang.Object) x5455_ExtendedTimestamp29);
        boolean boolean36 = x5455_ExtendedTimestamp18.isBit0_modifyTimePresent();
        byte[] byteArray37 = x5455_ExtendedTimestamp18.getLocalFileDataData();
        x5455_ExtendedTimestamp9.parseFromLocalFileData(byteArray37, (int) (short) 0, 100);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong41 = null;
        x5455_ExtendedTimestamp9.setAccessTime(zipLong41);
        byte[] byteArray43 = x5455_ExtendedTimestamp9.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray43, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str11, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0 });
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.equals((java.lang.Object) 0.0f);
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        byte byte6 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertNotNull(zipShort7);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        boolean boolean10 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date11);
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date13);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray16 = x5455_ExtendedTimestamp15.getCentralDirectoryData();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp15.setCreateJavaTime(date17);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp15.getHeaderId();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp20 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj21 = x5455_ExtendedTimestamp20.clone();
        java.util.Date date22 = x5455_ExtendedTimestamp20.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = x5455_ExtendedTimestamp20.getHeaderId();
        java.util.Date date24 = null;
        x5455_ExtendedTimestamp20.setModifyJavaTime(date24);
        x5455_ExtendedTimestamp20.setFlags((byte) 0);
        java.util.Date date28 = x5455_ExtendedTimestamp20.getModifyJavaTime();
        java.util.Date date29 = null;
        x5455_ExtendedTimestamp20.setModifyJavaTime(date29);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp31 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj32 = x5455_ExtendedTimestamp31.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp33 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj34 = x5455_ExtendedTimestamp33.clone();
        boolean boolean35 = x5455_ExtendedTimestamp31.equals((java.lang.Object) x5455_ExtendedTimestamp33);
        java.util.Date date36 = x5455_ExtendedTimestamp31.getCreateJavaTime();
        boolean boolean37 = x5455_ExtendedTimestamp20.equals((java.lang.Object) x5455_ExtendedTimestamp31);
        java.util.Date date38 = null;
        x5455_ExtendedTimestamp31.setAccessJavaTime(date38);
        boolean boolean40 = x5455_ExtendedTimestamp15.equals((java.lang.Object) x5455_ExtendedTimestamp31);
        x5455_ExtendedTimestamp15.setFlags((byte) 1);
        java.util.Date date43 = x5455_ExtendedTimestamp15.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong44 = x5455_ExtendedTimestamp15.getModifyTime();
        boolean boolean45 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipLong44);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong46 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date47 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date47);
        boolean boolean49 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(zipShort23);
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(date43);
        org.junit.Assert.assertNull(zipLong44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(zipLong46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj4 = x5455_ExtendedTimestamp3.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        boolean boolean7 = x5455_ExtendedTimestamp3.equals((java.lang.Object) x5455_ExtendedTimestamp5);
        byte[] byteArray8 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray8, 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj13 = x5455_ExtendedTimestamp12.clone();
        java.util.Date date14 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp12.getHeaderId();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp12.setModifyJavaTime(date16);
        boolean boolean18 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date16);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp0.getHeaderId();
        byte[] byteArray20 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date21 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.String str3 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray5 = x5455_ExtendedTimestamp4.getCentralDirectoryData();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp4.setCreateJavaTime(date6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp4.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp4.setCreateTime(zipLong9);
        java.util.Date date11 = x5455_ExtendedTimestamp4.getCreateJavaTime();
        x5455_ExtendedTimestamp4.setFlags((byte) 0);
        java.lang.String str14 = x5455_ExtendedTimestamp4.toString();
        java.util.Date date15 = x5455_ExtendedTimestamp4.getModifyJavaTime();
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date15);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp17 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date18 = x5455_ExtendedTimestamp17.getCreateJavaTime();
        byte[] byteArray19 = x5455_ExtendedTimestamp17.getLocalFileDataData();
        boolean boolean20 = x5455_ExtendedTimestamp17.isBit0_modifyTimePresent();
        byte[] byteArray21 = x5455_ExtendedTimestamp17.getCentralDirectoryData();
        byte byte22 = x5455_ExtendedTimestamp17.getFlags();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp23 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj24 = x5455_ExtendedTimestamp23.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp25 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj26 = x5455_ExtendedTimestamp25.clone();
        boolean boolean27 = x5455_ExtendedTimestamp23.equals((java.lang.Object) x5455_ExtendedTimestamp25);
        boolean boolean28 = x5455_ExtendedTimestamp25.isBit1_accessTimePresent();
        java.util.Date date29 = null;
        x5455_ExtendedTimestamp25.setCreateJavaTime(date29);
        java.util.Date date31 = x5455_ExtendedTimestamp25.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong32 = x5455_ExtendedTimestamp25.getModifyTime();
        byte[] byteArray33 = x5455_ExtendedTimestamp25.getLocalFileDataData();
        x5455_ExtendedTimestamp17.parseFromLocalFileData(byteArray33, (int) (short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray33, (int) (byte) 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str3, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertNull(zipLong32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0 });
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.Object obj3 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj5 = x5455_ExtendedTimestamp4.clone();
        java.util.Date date6 = x5455_ExtendedTimestamp4.getCreateJavaTime();
        boolean boolean7 = x5455_ExtendedTimestamp4.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean10 = x5455_ExtendedTimestamp8.equals((java.lang.Object) true);
        boolean boolean11 = x5455_ExtendedTimestamp4.equals((java.lang.Object) x5455_ExtendedTimestamp8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = null;
        x5455_ExtendedTimestamp4.setAccessTime(zipLong12);
        x5455_ExtendedTimestamp4.setFlags((byte) 10);
        byte[] byteArray16 = x5455_ExtendedTimestamp4.getCentralDirectoryData();
        boolean boolean17 = x5455_ExtendedTimestamp0.equals((java.lang.Object) byteArray16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong18);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray3 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        java.util.Date date7 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date7);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zipShort11);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date6 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.lang.Object obj7 = x5455_ExtendedTimestamp0.clone();
        byte byte8 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong10);
        byte byte12 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date6);
        java.lang.Object obj8 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort9);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.lang.Object obj8 = null;
        boolean boolean9 = x5455_ExtendedTimestamp0.equals(obj8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong10);
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date12);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean2 = x5455_ExtendedTimestamp0.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        byte byte7 = x5455_ExtendedTimestamp0.getFlags();
        byte byte8 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date9 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.Object obj10 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray10 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.lang.Object obj11 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp0.getModifyTime();
        java.lang.Object obj13 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp0.getAccessTime();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp17 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray18 = x5455_ExtendedTimestamp17.getCentralDirectoryData();
        boolean boolean19 = x5455_ExtendedTimestamp17.isBit1_accessTimePresent();
        java.util.Date date20 = null;
        x5455_ExtendedTimestamp17.setAccessJavaTime(date20);
        java.util.Date date22 = null;
        x5455_ExtendedTimestamp17.setAccessJavaTime(date22);
        byte[] byteArray24 = x5455_ExtendedTimestamp17.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray24, (int) (byte) 2, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0 });
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNull(zipLong6);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray3 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date4 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        java.util.Date date7 = x5455_ExtendedTimestamp5.getCreateJavaTime();
        boolean boolean8 = x5455_ExtendedTimestamp5.isBit1_accessTimePresent();
        byte[] byteArray9 = x5455_ExtendedTimestamp5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp5.getModifyTime();
        boolean boolean11 = x5455_ExtendedTimestamp5.isBit0_modifyTimePresent();
        byte byte12 = x5455_ExtendedTimestamp5.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = null;
        x5455_ExtendedTimestamp5.setAccessTime(zipLong13);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = x5455_ExtendedTimestamp5.getModifyTime();
        byte[] byteArray16 = x5455_ExtendedTimestamp5.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray16, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNull(zipLong15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean2 = x5455_ExtendedTimestamp0.equals((java.lang.Object) true);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray8 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong11);
        byte byte13 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp14 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj15 = x5455_ExtendedTimestamp14.clone();
        java.util.Date date16 = x5455_ExtendedTimestamp14.getCreateJavaTime();
        boolean boolean17 = x5455_ExtendedTimestamp14.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean20 = x5455_ExtendedTimestamp18.equals((java.lang.Object) true);
        boolean boolean21 = x5455_ExtendedTimestamp14.equals((java.lang.Object) x5455_ExtendedTimestamp18);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong22 = null;
        x5455_ExtendedTimestamp14.setAccessTime(zipLong22);
        x5455_ExtendedTimestamp14.setFlags((byte) 10);
        byte[] byteArray26 = x5455_ExtendedTimestamp14.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray26, (int) (short) 0, (int) (short) 100);
        byte byte30 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong31 = x5455_ExtendedTimestamp0.getCreateTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertNull(zipLong31);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        java.lang.String str5 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date8);
        java.util.Date date10 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj12 = x5455_ExtendedTimestamp11.clone();
        java.util.Date date13 = x5455_ExtendedTimestamp11.getCreateJavaTime();
        boolean boolean14 = x5455_ExtendedTimestamp11.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean17 = x5455_ExtendedTimestamp15.equals((java.lang.Object) true);
        boolean boolean18 = x5455_ExtendedTimestamp11.equals((java.lang.Object) x5455_ExtendedTimestamp15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp11.getLocalFileDataLength();
        boolean boolean20 = x5455_ExtendedTimestamp11.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = x5455_ExtendedTimestamp11.getLocalFileDataLength();
        byte byte22 = x5455_ExtendedTimestamp11.getFlags();
        java.util.Date date23 = x5455_ExtendedTimestamp11.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong24 = null;
        x5455_ExtendedTimestamp11.setModifyTime(zipLong24);
        byte byte26 = x5455_ExtendedTimestamp11.getFlags();
        x5455_ExtendedTimestamp11.setFlags((byte) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp29 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date30 = x5455_ExtendedTimestamp29.getCreateJavaTime();
        java.lang.String str31 = x5455_ExtendedTimestamp29.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp32 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date33 = x5455_ExtendedTimestamp32.getCreateJavaTime();
        byte[] byteArray34 = x5455_ExtendedTimestamp32.getLocalFileDataData();
        x5455_ExtendedTimestamp29.parseFromLocalFileData(byteArray34, 0, (int) (byte) 4);
        x5455_ExtendedTimestamp11.parseFromCentralDirectoryData(byteArray34, 0, (int) (short) -1);
        boolean boolean41 = x5455_ExtendedTimestamp0.equals((java.lang.Object) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong42 = x5455_ExtendedTimestamp0.getAccessTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str5, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str31, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(zipLong42);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date11);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date13);
        byte[] byteArray15 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean16 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp17 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray18 = x5455_ExtendedTimestamp17.getCentralDirectoryData();
        boolean boolean19 = x5455_ExtendedTimestamp17.isBit1_accessTimePresent();
        java.lang.String str20 = x5455_ExtendedTimestamp17.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp21 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj22 = x5455_ExtendedTimestamp21.clone();
        java.util.Date date23 = x5455_ExtendedTimestamp21.getCreateJavaTime();
        boolean boolean24 = x5455_ExtendedTimestamp21.isBit1_accessTimePresent();
        byte[] byteArray25 = x5455_ExtendedTimestamp21.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = x5455_ExtendedTimestamp21.getModifyTime();
        java.util.Date date27 = null;
        x5455_ExtendedTimestamp21.setCreateJavaTime(date27);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong29 = x5455_ExtendedTimestamp21.getCreateTime();
        boolean boolean30 = x5455_ExtendedTimestamp17.equals((java.lang.Object) x5455_ExtendedTimestamp21);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong31 = null;
        x5455_ExtendedTimestamp21.setCreateTime(zipLong31);
        boolean boolean33 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipLong31);
        java.util.Date date34 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort35 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp36 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj37 = x5455_ExtendedTimestamp36.clone();
        java.util.Date date38 = x5455_ExtendedTimestamp36.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort39 = x5455_ExtendedTimestamp36.getHeaderId();
        java.util.Date date40 = null;
        x5455_ExtendedTimestamp36.setModifyJavaTime(date40);
        x5455_ExtendedTimestamp36.setFlags((byte) 0);
        x5455_ExtendedTimestamp36.setFlags((byte) 4);
        byte[] byteArray46 = x5455_ExtendedTimestamp36.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray46, (int) (byte) 1, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str20, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong26);
        org.junit.Assert.assertNull(zipLong29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertNotNull(zipShort35);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date38);
        org.junit.Assert.assertNotNull(zipShort39);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 0 });
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong11);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong13);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong15);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date7 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        x5455_ExtendedTimestamp0.setFlags((byte) 100);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj9 = x5455_ExtendedTimestamp8.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj11 = x5455_ExtendedTimestamp10.clone();
        boolean boolean12 = x5455_ExtendedTimestamp8.equals((java.lang.Object) x5455_ExtendedTimestamp10);
        boolean boolean13 = x5455_ExtendedTimestamp10.isBit1_accessTimePresent();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date14);
        java.util.Date date16 = x5455_ExtendedTimestamp10.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = x5455_ExtendedTimestamp10.getModifyTime();
        byte[] byteArray18 = x5455_ExtendedTimestamp10.getLocalFileDataData();
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray18, (int) (short) 0, (int) (byte) 2);
        java.util.Date date22 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date22);
        byte byte24 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date25 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(zipLong17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertNull(date25);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong6);
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong9);
        byte[] byteArray11 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        byte[] byteArray10 = x5455_ExtendedTimestamp2.getLocalFileDataData();
        java.lang.Object obj11 = x5455_ExtendedTimestamp2.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp2.getModifyTime();
        java.util.Date date13 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        java.lang.Object obj14 = x5455_ExtendedTimestamp2.clone();
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp2.setAccessJavaTime(date15);
        boolean boolean17 = x5455_ExtendedTimestamp2.isBit2_createTimePresent();
        java.util.Date date18 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date18);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.util.Date date14 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        byte[] byteArray15 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong16);
        byte[] byteArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray18, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong1);
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipLong7);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong7);
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date10);
        java.util.Date date12 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = x5455_ExtendedTimestamp0.getModifyTime();
        boolean boolean14 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(zipLong13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getAccessTime();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp2.getModifyTime();
        java.lang.Object obj13 = x5455_ExtendedTimestamp2.clone();
        java.lang.String str14 = x5455_ExtendedTimestamp2.toString();
        java.lang.Object obj15 = x5455_ExtendedTimestamp2.clone();
        java.util.Date date16 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj12 = x5455_ExtendedTimestamp11.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj14 = x5455_ExtendedTimestamp13.clone();
        boolean boolean15 = x5455_ExtendedTimestamp11.equals((java.lang.Object) x5455_ExtendedTimestamp13);
        java.util.Date date16 = x5455_ExtendedTimestamp11.getCreateJavaTime();
        boolean boolean17 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp11);
        boolean boolean18 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong19);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong21 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong21);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong23);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte byte3 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong4);
        java.util.Date date6 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNotNull(zipShort11);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.lang.String str8 = x5455_ExtendedTimestamp0.toString();
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        boolean boolean10 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date11 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=1010 " + "'", str8, "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getAccessTime();
        byte byte3 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getHeaderId();
        byte[] byteArray5 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        java.util.Date date9 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date10 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.Object obj11 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray13 = x5455_ExtendedTimestamp12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp12.getLocalFileDataLength();
        byte[] byteArray15 = x5455_ExtendedTimestamp12.getCentralDirectoryData();
        boolean boolean16 = x5455_ExtendedTimestamp12.isBit0_modifyTimePresent();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp12.setCreateJavaTime(date17);
        java.util.Date date19 = null;
        x5455_ExtendedTimestamp12.setModifyJavaTime(date19);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong21 = null;
        x5455_ExtendedTimestamp12.setAccessTime(zipLong21);
        byte[] byteArray23 = x5455_ExtendedTimestamp12.getLocalFileDataData();
        boolean boolean24 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp12);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        java.lang.Object obj10 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong11);
        java.util.Date date13 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong8);
        java.lang.String str10 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date11);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date14 = x5455_ExtendedTimestamp13.getCreateJavaTime();
        java.lang.String str15 = x5455_ExtendedTimestamp13.toString();
        x5455_ExtendedTimestamp13.setFlags((byte) 10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = x5455_ExtendedTimestamp13.getCreateTime();
        byte[] byteArray19 = x5455_ExtendedTimestamp13.getLocalFileDataData();
        boolean boolean20 = x5455_ExtendedTimestamp13.isBit1_accessTimePresent();
        byte[] byteArray21 = x5455_ExtendedTimestamp13.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray21, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str10, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str15, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0 });
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        byte[] byteArray3 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        byte byte4 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong5);
        boolean boolean7 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.Object obj9 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp2.getHeaderId();
        boolean boolean6 = x5455_ExtendedTimestamp2.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray8 = x5455_ExtendedTimestamp7.getCentralDirectoryData();
        boolean boolean9 = x5455_ExtendedTimestamp2.equals((java.lang.Object) byteArray8);
        x5455_ExtendedTimestamp2.setFlags((byte) 10);
        byte[] byteArray12 = x5455_ExtendedTimestamp2.getLocalFileDataData();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date6 = x5455_ExtendedTimestamp5.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp5.getLocalFileDataLength();
        byte[] byteArray8 = x5455_ExtendedTimestamp5.getCentralDirectoryData();
        x5455_ExtendedTimestamp5.setFlags((byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp5.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp5.getCentralDirectoryLength();
        java.util.Date date13 = x5455_ExtendedTimestamp5.getModifyJavaTime();
        boolean boolean14 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date16 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong17);
        byte[] byteArray19 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.lang.Object obj13 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong14);
        java.lang.Class<?> wildcardClass16 = x5455_ExtendedTimestamp0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date6);
        java.lang.Object obj8 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        java.lang.Object obj10 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date10 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong11);
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date13);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        java.lang.String str5 = x5455_ExtendedTimestamp2.toString();
        boolean boolean6 = x5455_ExtendedTimestamp2.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp2.getCentralDirectoryLength();
        byte[] byteArray8 = x5455_ExtendedTimestamp2.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str5, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong7);
        java.util.Date date9 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        byte[] byteArray10 = x5455_ExtendedTimestamp2.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp2.setModifyTime(zipLong11);
        boolean boolean13 = x5455_ExtendedTimestamp2.isBit2_createTimePresent();
        java.lang.String str14 = x5455_ExtendedTimestamp2.toString();
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp2.setAccessJavaTime(date15);
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp2.setAccessJavaTime(date17);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp2.getHeaderId();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort19);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj4 = x5455_ExtendedTimestamp3.clone();
        java.util.Date date5 = x5455_ExtendedTimestamp3.getCreateJavaTime();
        boolean boolean6 = x5455_ExtendedTimestamp3.isBit1_accessTimePresent();
        byte[] byteArray7 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp3.getModifyTime();
        java.lang.Object obj9 = null;
        boolean boolean10 = x5455_ExtendedTimestamp3.equals(obj9);
        boolean boolean11 = x5455_ExtendedTimestamp3.isBit1_accessTimePresent();
        boolean boolean12 = x5455_ExtendedTimestamp0.equals((java.lang.Object) boolean11);
        java.lang.String str13 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp0.getAccessTime();
        java.lang.String str15 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str13, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str15, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong8);
        java.util.Date date10 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        boolean boolean12 = x5455_ExtendedTimestamp0.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getAccessTime();
        java.util.Date date10 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp2.setCreateTime(zipLong11);
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp2.setModifyJavaTime(date13);
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp2.setModifyJavaTime(date15);
        java.lang.String str17 = x5455_ExtendedTimestamp2.toString();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str17, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray10 = x5455_ExtendedTimestamp9.getCentralDirectoryData();
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp9.setCreateJavaTime(date11);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp9.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp9.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp9.getHeaderId();
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp9);
        byte[] byteArray17 = x5455_ExtendedTimestamp9.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = x5455_ExtendedTimestamp9.getAccessTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong18);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.lang.Object obj6 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date7 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong1);
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.util.Date date7 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getModifyTime();
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(zipLong8);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj4 = x5455_ExtendedTimestamp3.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        boolean boolean7 = x5455_ExtendedTimestamp3.equals((java.lang.Object) x5455_ExtendedTimestamp5);
        byte[] byteArray8 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray8, 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj13 = x5455_ExtendedTimestamp12.clone();
        java.util.Date date14 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp12.getHeaderId();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp12.setModifyJavaTime(date16);
        boolean boolean18 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.String str21 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date22 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = x5455_ExtendedTimestamp0.getCreateTime();
        boolean boolean24 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        byte byte25 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(zipLong19);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str21, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNull(zipLong23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        java.util.Date date7 = x5455_ExtendedTimestamp5.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp5.getHeaderId();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp5.setModifyJavaTime(date9);
        x5455_ExtendedTimestamp5.setFlags((byte) 0);
        java.util.Date date13 = x5455_ExtendedTimestamp5.getModifyJavaTime();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp5.setModifyJavaTime(date14);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp16 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj17 = x5455_ExtendedTimestamp16.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj19 = x5455_ExtendedTimestamp18.clone();
        boolean boolean20 = x5455_ExtendedTimestamp16.equals((java.lang.Object) x5455_ExtendedTimestamp18);
        java.util.Date date21 = x5455_ExtendedTimestamp16.getCreateJavaTime();
        boolean boolean22 = x5455_ExtendedTimestamp5.equals((java.lang.Object) x5455_ExtendedTimestamp16);
        java.util.Date date23 = null;
        x5455_ExtendedTimestamp16.setAccessJavaTime(date23);
        boolean boolean25 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp16);
        boolean boolean26 = x5455_ExtendedTimestamp16.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong27 = null;
        x5455_ExtendedTimestamp16.setModifyTime(zipLong27);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte byte11 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong13);
        java.util.Date date15 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp2.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp2.getLocalFileDataLength();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp2.setAccessJavaTime(date12);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp2.getAccessTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNull(zipLong14);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong10);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte byte11 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        byte byte13 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date16 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        byte[] byteArray11 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong1);
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date11 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean12 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date4 = x5455_ExtendedTimestamp3.getCreateJavaTime();
        byte[] byteArray5 = x5455_ExtendedTimestamp3.getLocalFileDataData();
        boolean boolean6 = x5455_ExtendedTimestamp3.isBit0_modifyTimePresent();
        byte[] byteArray7 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
        byte byte8 = x5455_ExtendedTimestamp3.getFlags();
        boolean boolean9 = x5455_ExtendedTimestamp3.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date11 = x5455_ExtendedTimestamp10.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp10.getLocalFileDataLength();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp10.setModifyJavaTime(date13);
        byte byte15 = x5455_ExtendedTimestamp10.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = x5455_ExtendedTimestamp10.getCreateTime();
        boolean boolean17 = x5455_ExtendedTimestamp10.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray19 = x5455_ExtendedTimestamp18.getCentralDirectoryData();
        java.util.Date date20 = null;
        x5455_ExtendedTimestamp18.setCreateJavaTime(date20);
        java.lang.String str22 = x5455_ExtendedTimestamp18.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = null;
        x5455_ExtendedTimestamp18.setCreateTime(zipLong23);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort25 = x5455_ExtendedTimestamp18.getCentralDirectoryLength();
        byte[] byteArray26 = x5455_ExtendedTimestamp18.getLocalFileDataData();
        x5455_ExtendedTimestamp10.parseFromCentralDirectoryData(byteArray26, (int) (short) 0, (int) '4');
        x5455_ExtendedTimestamp3.parseFromLocalFileData(byteArray26, (int) (short) 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong33 = x5455_ExtendedTimestamp3.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong34 = x5455_ExtendedTimestamp3.getAccessTime();
        byte[] byteArray35 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray35, (int) (byte) 0, (int) (short) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp39 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date40 = x5455_ExtendedTimestamp39.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = x5455_ExtendedTimestamp39.getLocalFileDataLength();
        java.util.Date date42 = null;
        x5455_ExtendedTimestamp39.setModifyJavaTime(date42);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort44 = x5455_ExtendedTimestamp39.getCentralDirectoryLength();
        java.lang.String str45 = x5455_ExtendedTimestamp39.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort46 = x5455_ExtendedTimestamp39.getLocalFileDataLength();
        boolean boolean47 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipShort46);
        boolean boolean48 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        byte byte49 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertNull(zipLong16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str22, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong33);
        org.junit.Assert.assertNull(zipLong34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertNotNull(zipShort41);
        org.junit.Assert.assertNotNull(zipShort44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str45, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 0 + "'", byte49 == (byte) 0);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray3 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = x5455_ExtendedTimestamp0.getAccessTime();
        java.lang.String str5 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date6);
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date8);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str5, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong7);
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray11 = x5455_ExtendedTimestamp10.getCentralDirectoryData();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date12);
        java.lang.String str14 = x5455_ExtendedTimestamp10.toString();
        java.lang.Object obj15 = x5455_ExtendedTimestamp10.clone();
        byte[] byteArray16 = x5455_ExtendedTimestamp10.getCentralDirectoryData();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date17);
        java.util.Date date19 = null;
        x5455_ExtendedTimestamp10.setCreateJavaTime(date19);
        java.util.Date date21 = x5455_ExtendedTimestamp10.getCreateJavaTime();
        boolean boolean22 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp23 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date24 = x5455_ExtendedTimestamp23.getModifyJavaTime();
        java.lang.String str25 = x5455_ExtendedTimestamp23.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = x5455_ExtendedTimestamp23.getLocalFileDataLength();
        byte[] byteArray27 = x5455_ExtendedTimestamp23.getCentralDirectoryData();
        boolean boolean28 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp23);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str25, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(zipShort29);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong8);
        boolean boolean10 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        byte[] byteArray6 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date7 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getModifyTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(zipLong8);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date13);
        boolean boolean15 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date17);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipShort19);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.String str6 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str6, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray3 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong4);
        java.lang.Object obj6 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray9 = x5455_ExtendedTimestamp8.getCentralDirectoryData();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp8.setCreateJavaTime(date10);
        java.lang.String str12 = x5455_ExtendedTimestamp8.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = null;
        x5455_ExtendedTimestamp8.setCreateTime(zipLong13);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = null;
        x5455_ExtendedTimestamp8.setCreateTime(zipLong15);
        java.util.Date date17 = x5455_ExtendedTimestamp8.getModifyJavaTime();
        boolean boolean18 = x5455_ExtendedTimestamp8.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp8.getCentralDirectoryLength();
        boolean boolean20 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipShort19);
        java.util.Date date21 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date21);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str12, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj12 = x5455_ExtendedTimestamp11.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj14 = x5455_ExtendedTimestamp13.clone();
        boolean boolean15 = x5455_ExtendedTimestamp11.equals((java.lang.Object) x5455_ExtendedTimestamp13);
        java.util.Date date16 = x5455_ExtendedTimestamp11.getCreateJavaTime();
        boolean boolean17 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp11);
        boolean boolean18 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray19 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong20);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date23 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date23);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort22);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong10);
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj12 = x5455_ExtendedTimestamp11.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj14 = x5455_ExtendedTimestamp13.clone();
        boolean boolean15 = x5455_ExtendedTimestamp11.equals((java.lang.Object) x5455_ExtendedTimestamp13);
        java.util.Date date16 = x5455_ExtendedTimestamp11.getCreateJavaTime();
        boolean boolean17 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp11);
        java.util.Date date18 = null;
        x5455_ExtendedTimestamp11.setAccessJavaTime(date18);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp11.getLocalFileDataLength();
        x5455_ExtendedTimestamp11.setFlags((byte) 10);
        java.util.Date date23 = null;
        x5455_ExtendedTimestamp11.setCreateJavaTime(date23);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong25 = null;
        x5455_ExtendedTimestamp11.setAccessTime(zipLong25);
        java.util.Date date27 = x5455_ExtendedTimestamp11.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong28 = x5455_ExtendedTimestamp11.getAccessTime();
        byte[] byteArray29 = x5455_ExtendedTimestamp11.getLocalFileDataData();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNull(zipLong28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0 });
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj3 = x5455_ExtendedTimestamp2.clone();
        boolean boolean4 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp2);
        boolean boolean5 = x5455_ExtendedTimestamp2.isBit1_accessTimePresent();
        java.util.Date date6 = null;
        x5455_ExtendedTimestamp2.setCreateJavaTime(date6);
        java.util.Date date8 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = x5455_ExtendedTimestamp2.getModifyTime();
        byte[] byteArray10 = x5455_ExtendedTimestamp2.getLocalFileDataData();
        java.lang.Object obj11 = x5455_ExtendedTimestamp2.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp2.getModifyTime();
        java.util.Date date13 = x5455_ExtendedTimestamp2.getAccessJavaTime();
        boolean boolean14 = x5455_ExtendedTimestamp2.isBit2_createTimePresent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date2);
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        x5455_ExtendedTimestamp0.setFlags((byte) 1);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong11);
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date13);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong15);
        java.lang.String str17 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj19 = x5455_ExtendedTimestamp18.clone();
        java.util.Date date20 = x5455_ExtendedTimestamp18.getCreateJavaTime();
        boolean boolean21 = x5455_ExtendedTimestamp18.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp22 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean24 = x5455_ExtendedTimestamp22.equals((java.lang.Object) true);
        boolean boolean25 = x5455_ExtendedTimestamp18.equals((java.lang.Object) x5455_ExtendedTimestamp22);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = x5455_ExtendedTimestamp18.getCreateTime();
        java.util.Date date27 = null;
        x5455_ExtendedTimestamp18.setCreateJavaTime(date27);
        byte[] byteArray29 = x5455_ExtendedTimestamp18.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray29, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0x5455 Zip Extra Field: Flags=1000 " + "'", str17, "0x5455 Zip Extra Field: Flags=1000 ");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(zipLong26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0 });
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date6 = x5455_ExtendedTimestamp5.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp5.getLocalFileDataLength();
        byte[] byteArray8 = x5455_ExtendedTimestamp5.getCentralDirectoryData();
        x5455_ExtendedTimestamp5.setFlags((byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp5.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp5.getCentralDirectoryLength();
        java.util.Date date13 = x5455_ExtendedTimestamp5.getModifyJavaTime();
        boolean boolean14 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = x5455_ExtendedTimestamp0.getAccessTime();
        x5455_ExtendedTimestamp0.setFlags((byte) 8);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNull(zipLong18);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date5);
        byte[] byteArray7 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        byte[] byteArray7 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0 });
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getHeaderId();
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong10);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.Class<?> wildcardClass5 = zipShort4.getClass();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getAccessTime();
        java.lang.Class<?> wildcardClass9 = x5455_ExtendedTimestamp0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj12 = x5455_ExtendedTimestamp11.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj14 = x5455_ExtendedTimestamp13.clone();
        boolean boolean15 = x5455_ExtendedTimestamp11.equals((java.lang.Object) x5455_ExtendedTimestamp13);
        java.util.Date date16 = x5455_ExtendedTimestamp11.getCreateJavaTime();
        boolean boolean17 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp11);
        java.lang.Object obj18 = x5455_ExtendedTimestamp0.clone();
        byte byte19 = x5455_ExtendedTimestamp0.getFlags();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong7);
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        java.lang.String str11 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date12 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date12);
        java.util.Date date14 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date15 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date15);
        byte[] byteArray17 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong18);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str4, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str11, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong7);
        java.lang.String str9 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str9, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date10 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date11);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = null;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong13);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong6);
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date9 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        java.lang.String str10 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj12 = x5455_ExtendedTimestamp11.clone();
        java.util.Date date13 = x5455_ExtendedTimestamp11.getCreateJavaTime();
        boolean boolean14 = x5455_ExtendedTimestamp11.isBit1_accessTimePresent();
        byte[] byteArray15 = x5455_ExtendedTimestamp11.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = x5455_ExtendedTimestamp11.getModifyTime();
        java.util.Date date17 = null;
        x5455_ExtendedTimestamp11.setCreateJavaTime(date17);
        java.lang.String str19 = x5455_ExtendedTimestamp11.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = null;
        x5455_ExtendedTimestamp11.setModifyTime(zipLong20);
        boolean boolean22 = x5455_ExtendedTimestamp11.isBit2_createTimePresent();
        java.util.Date date23 = null;
        x5455_ExtendedTimestamp11.setAccessJavaTime(date23);
        boolean boolean25 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp11);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str10, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str19, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray3 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(zipShort7);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong6);
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date14 = x5455_ExtendedTimestamp13.getCreateJavaTime();
        boolean boolean16 = x5455_ExtendedTimestamp13.equals((java.lang.Object) 0.0f);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = x5455_ExtendedTimestamp13.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x5455_ExtendedTimestamp13.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = null;
        x5455_ExtendedTimestamp13.setAccessTime(zipLong19);
        boolean boolean21 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp13);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong22 = null;
        x5455_ExtendedTimestamp13.setModifyTime(zipLong22);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong24 = x5455_ExtendedTimestamp13.getCreateTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(zipLong17);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(zipLong24);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong6);
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj13 = x5455_ExtendedTimestamp12.clone();
        java.util.Date date14 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        boolean boolean15 = x5455_ExtendedTimestamp12.isBit1_accessTimePresent();
        byte[] byteArray16 = x5455_ExtendedTimestamp12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = x5455_ExtendedTimestamp12.getModifyTime();
        java.util.Date date18 = null;
        x5455_ExtendedTimestamp12.setCreateJavaTime(date18);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp12.getCentralDirectoryLength();
        boolean boolean21 = x5455_ExtendedTimestamp0.equals((java.lang.Object) zipShort20);
        java.util.Date date22 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong17);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date4 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.util.Date date6 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(zipLong3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj4 = x5455_ExtendedTimestamp3.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        boolean boolean7 = x5455_ExtendedTimestamp3.equals((java.lang.Object) x5455_ExtendedTimestamp5);
        byte[] byteArray8 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray8, 0, (int) (byte) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj13 = x5455_ExtendedTimestamp12.clone();
        java.util.Date date14 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp12.getHeaderId();
        java.util.Date date16 = null;
        x5455_ExtendedTimestamp12.setModifyJavaTime(date16);
        boolean boolean18 = x5455_ExtendedTimestamp0.equals((java.lang.Object) date16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        java.lang.String str21 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date22 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date22);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong24 = x5455_ExtendedTimestamp0.getCreateTime();
        x5455_ExtendedTimestamp0.setFlags((byte) 4);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(zipLong19);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str21, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong24);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        byte byte8 = x5455_ExtendedTimestamp4.getFlags();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp4.setCreateJavaTime(date9);
        java.util.Date date11 = null;
        x5455_ExtendedTimestamp4.setAccessJavaTime(date11);
        boolean boolean13 = x5455_ExtendedTimestamp4.isBit1_accessTimePresent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp0.getAccessTime();
        boolean boolean8 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj10 = x5455_ExtendedTimestamp9.clone();
        java.util.Date date11 = x5455_ExtendedTimestamp9.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp9.getHeaderId();
        java.util.Date date13 = null;
        x5455_ExtendedTimestamp9.setModifyJavaTime(date13);
        x5455_ExtendedTimestamp9.setFlags((byte) 0);
        java.util.Date date17 = x5455_ExtendedTimestamp9.getModifyJavaTime();
        java.util.Date date18 = null;
        x5455_ExtendedTimestamp9.setModifyJavaTime(date18);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp20 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj21 = x5455_ExtendedTimestamp20.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp22 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj23 = x5455_ExtendedTimestamp22.clone();
        boolean boolean24 = x5455_ExtendedTimestamp20.equals((java.lang.Object) x5455_ExtendedTimestamp22);
        java.util.Date date25 = x5455_ExtendedTimestamp20.getCreateJavaTime();
        boolean boolean26 = x5455_ExtendedTimestamp9.equals((java.lang.Object) x5455_ExtendedTimestamp20);
        boolean boolean27 = x5455_ExtendedTimestamp9.isBit0_modifyTimePresent();
        byte[] byteArray28 = x5455_ExtendedTimestamp9.getLocalFileDataData();
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray28, (int) (short) 0, 100);
        byte[] byteArray32 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        x5455_ExtendedTimestamp0.setFlags((byte) 2);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0 });
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte byte11 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong13);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(zipShort15);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date12 = x5455_ExtendedTimestamp11.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp11.getLocalFileDataLength();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp11.setModifyJavaTime(date14);
        byte byte16 = x5455_ExtendedTimestamp11.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = x5455_ExtendedTimestamp11.getCreateTime();
        boolean boolean18 = x5455_ExtendedTimestamp11.isBit0_modifyTimePresent();
        java.util.Date date19 = x5455_ExtendedTimestamp11.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp11.getHeaderId();
        boolean boolean21 = x5455_ExtendedTimestamp11.isBit1_accessTimePresent();
        boolean boolean22 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp11);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNull(zipLong17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(zipShort23);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.equals((java.lang.Object) 0.0f);
        boolean boolean4 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        java.lang.String str6 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str6, "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        java.util.Date date5 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.lang.String str2 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date3);
        java.lang.Object obj5 = x5455_ExtendedTimestamp0.clone();
        x5455_ExtendedTimestamp0.setFlags((byte) 100);
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date8);
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date13 = x5455_ExtendedTimestamp12.getCreateJavaTime();
        java.lang.String str14 = x5455_ExtendedTimestamp12.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = null;
        x5455_ExtendedTimestamp12.setModifyTime(zipLong15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = x5455_ExtendedTimestamp12.getHeaderId();
        java.util.Date date18 = x5455_ExtendedTimestamp12.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x5455_ExtendedTimestamp12.getCentralDirectoryLength();
        boolean boolean20 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp12);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str2, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str14, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date5 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp6 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date7 = x5455_ExtendedTimestamp6.getModifyJavaTime();
        java.lang.String str8 = x5455_ExtendedTimestamp6.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = x5455_ExtendedTimestamp6.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = null;
        x5455_ExtendedTimestamp6.setAccessTime(zipLong10);
        byte byte12 = x5455_ExtendedTimestamp6.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = x5455_ExtendedTimestamp6.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp6.getLocalFileDataLength();
        byte[] byteArray15 = x5455_ExtendedTimestamp6.getCentralDirectoryData();
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp6);
        x5455_ExtendedTimestamp6.setFlags((byte) 100);
        java.util.Date date19 = x5455_ExtendedTimestamp6.getAccessJavaTime();
        boolean boolean20 = x5455_ExtendedTimestamp6.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp21 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date22 = x5455_ExtendedTimestamp21.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = x5455_ExtendedTimestamp21.getLocalFileDataLength();
        byte[] byteArray24 = x5455_ExtendedTimestamp21.getCentralDirectoryData();
        x5455_ExtendedTimestamp21.setFlags((byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = x5455_ExtendedTimestamp21.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = x5455_ExtendedTimestamp21.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong29 = x5455_ExtendedTimestamp21.getCreateTime();
        java.util.Date date30 = x5455_ExtendedTimestamp21.getAccessJavaTime();
        byte[] byteArray31 = x5455_ExtendedTimestamp21.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp6.parseFromLocalFileData(byteArray31, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str8, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNull(zipLong13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(zipShort23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort27);
        org.junit.Assert.assertNotNull(zipShort28);
        org.junit.Assert.assertNull(zipLong29);
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 0 });
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        java.util.Date date7 = x5455_ExtendedTimestamp5.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp5.getHeaderId();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp5.setModifyJavaTime(date9);
        x5455_ExtendedTimestamp5.setFlags((byte) 0);
        java.util.Date date13 = x5455_ExtendedTimestamp5.getModifyJavaTime();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp5.setModifyJavaTime(date14);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp16 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj17 = x5455_ExtendedTimestamp16.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj19 = x5455_ExtendedTimestamp18.clone();
        boolean boolean20 = x5455_ExtendedTimestamp16.equals((java.lang.Object) x5455_ExtendedTimestamp18);
        java.util.Date date21 = x5455_ExtendedTimestamp16.getCreateJavaTime();
        boolean boolean22 = x5455_ExtendedTimestamp5.equals((java.lang.Object) x5455_ExtendedTimestamp16);
        java.util.Date date23 = null;
        x5455_ExtendedTimestamp16.setAccessJavaTime(date23);
        boolean boolean25 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp16);
        x5455_ExtendedTimestamp0.setFlags((byte) 1);
        java.util.Date date28 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong29 = x5455_ExtendedTimestamp0.getModifyTime();
        java.lang.String str30 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date31 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date31);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertNull(zipLong29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0x5455 Zip Extra Field: Flags=1 " + "'", str30, "0x5455 Zip Extra Field: Flags=1 ");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte byte11 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date12 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = null;
        x5455_ExtendedTimestamp0.setModifyTime(zipLong13);
        boolean boolean15 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        byte[] byteArray4 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = x5455_ExtendedTimestamp0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = null;
        x5455_ExtendedTimestamp0.setAccessTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp0.getCreateTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date9);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0 });
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        byte byte5 = x5455_ExtendedTimestamp0.getFlags();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        java.lang.String str8 = x5455_ExtendedTimestamp0.toString();
        byte byte9 = x5455_ExtendedTimestamp0.getFlags();
        java.util.Date date10 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date10);
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        byte[] byteArray13 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date14);
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0x5455 Zip Extra Field: Flags=1010 " + "'", str8, "0x5455 Zip Extra Field: Flags=1010 ");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.util.Date date3 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date3);
        java.util.Date date5 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zipShort7);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        byte[] byteArray1 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.util.Date date2 = null;
        x5455_ExtendedTimestamp0.setCreateJavaTime(date2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj6 = x5455_ExtendedTimestamp5.clone();
        java.util.Date date7 = x5455_ExtendedTimestamp5.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp5.getHeaderId();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp5.setModifyJavaTime(date9);
        x5455_ExtendedTimestamp5.setFlags((byte) 0);
        java.util.Date date13 = x5455_ExtendedTimestamp5.getModifyJavaTime();
        java.util.Date date14 = null;
        x5455_ExtendedTimestamp5.setModifyJavaTime(date14);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp16 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj17 = x5455_ExtendedTimestamp16.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj19 = x5455_ExtendedTimestamp18.clone();
        boolean boolean20 = x5455_ExtendedTimestamp16.equals((java.lang.Object) x5455_ExtendedTimestamp18);
        java.util.Date date21 = x5455_ExtendedTimestamp16.getCreateJavaTime();
        boolean boolean22 = x5455_ExtendedTimestamp5.equals((java.lang.Object) x5455_ExtendedTimestamp16);
        java.util.Date date23 = null;
        x5455_ExtendedTimestamp16.setAccessJavaTime(date23);
        boolean boolean25 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp16);
        x5455_ExtendedTimestamp0.setFlags((byte) 1);
        java.util.Date date28 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong29 = x5455_ExtendedTimestamp0.getModifyTime();
        java.util.Date date30 = null;
        x5455_ExtendedTimestamp0.setAccessJavaTime(date30);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0 });
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertNull(zipLong29);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getHeaderId();
        java.util.Date date4 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date4);
        x5455_ExtendedTimestamp0.setFlags((byte) 0);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        java.util.Date date9 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean12 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.lang.Object obj13 = x5455_ExtendedTimestamp0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "0x5455 Zip Extra Field: Flags=0 ");
    }
}

