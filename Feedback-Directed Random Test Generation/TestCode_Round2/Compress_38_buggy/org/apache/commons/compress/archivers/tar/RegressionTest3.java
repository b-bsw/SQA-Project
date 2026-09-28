package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 51, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        int int5 = tarArchiveEntry3.getMode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33188 + "'", int5 == 33188);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        java.io.File file6 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setUserId((int) (byte) 53);
        int int9 = tarArchiveEntry2.getGroupId();
        boolean boolean10 = tarArchiveEntry2.isBlockDevice();
        java.lang.String str11 = tarArchiveEntry2.getName();
        org.junit.Assert.assertNotNull(date3);
// flaky "1) test1502(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ustar " + "'", str11, "ustar ");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        boolean boolean9 = tarArchiveEntry2.equals(tarArchiveEntry8);
        boolean boolean10 = tarArchiveEntry8.isOldGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "2) test1503(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        int int13 = tarArchiveEntry2.getUserId();
        java.util.Date date14 = tarArchiveEntry2.getModTime();
        boolean boolean15 = tarArchiveEntry2.isGNULongLinkEntry();
        long long16 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setDevMinor((int) (byte) 0);
        int int19 = tarArchiveEntry2.getUserId();
        boolean boolean20 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setMode((int) (byte) 83);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean26 = tarArchiveEntry25.isGlobalPaxHeader();
        boolean boolean27 = tarArchiveEntry25.isFile();
        java.lang.String str28 = tarArchiveEntry25.getName();
        tarArchiveEntry25.setLinkName("00");
        long long31 = tarArchiveEntry25.getLongGroupId();
        int int32 = tarArchiveEntry25.getMode();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean36 = tarArchiveEntry35.isGlobalPaxHeader();
        boolean boolean37 = tarArchiveEntry35.isFile();
        java.lang.String str38 = tarArchiveEntry35.getName();
        tarArchiveEntry35.setLinkName("00");
        long long41 = tarArchiveEntry35.getLongUserId();
        tarArchiveEntry35.setDevMajor(155);
        int int44 = tarArchiveEntry35.getMode();
        java.util.Date date45 = tarArchiveEntry35.getLastModifiedDate();
        tarArchiveEntry25.setModTime(date45);
        tarArchiveEntry2.setModTime(date45);
        boolean boolean48 = tarArchiveEntry2.isExtended();
        boolean boolean49 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "3) test1504(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "1) test1504(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ustar " + "'", str28, "ustar ");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 33188 + "'", int32 == 33188);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ustar " + "'", str38, "ustar ");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 33188 + "'", int44 == 33188);
        org.junit.Assert.assertNotNull(date45);
// flaky "1) test1504(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date45.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isFile();
        boolean boolean5 = tarArchiveEntry3.isFile();
        boolean boolean6 = tarArchiveEntry3.isBlockDevice();
        boolean boolean7 = tarArchiveEntry3.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("0\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry14.setMode((int) '#');
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        tarArchiveEntry2.setModTime(date17);
        int int19 = tarArchiveEntry2.getDevMajor();
        int int20 = tarArchiveEntry2.getUserId();
        boolean boolean21 = tarArchiveEntry2.isSymbolicLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000");
        boolean boolean24 = tarArchiveEntry2.isDescendent(tarArchiveEntry23);
        tarArchiveEntry23.setGroupId((long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "4) test1506(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setGroupId((long) 1);
        boolean boolean7 = tarArchiveEntry3.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isPaxGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setDevMajor(12);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000");
        java.util.Date date10 = tarArchiveEntry9.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date10);
        byte[] byteArray14 = new byte[] { (byte) 49, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date10);
// flaky "5) test1508(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 49, (byte) 120 });
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setSize((long) 1000);
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        tarArchiveEntry2.setUserId((int) (short) -1);
        tarArchiveEntry2.setSize((long) (byte) 50);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        tarArchiveEntry2.setLinkName("ustar ");
        byte[] byteArray17 = new byte[] { (byte) 53, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "6) test1510(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "2) test1510(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 53, (byte) 100, (byte) 10 });
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setUserName("");
        java.util.Date date5 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long9 = tarArchiveEntry8.getSize();
        boolean boolean10 = tarArchiveEntry8.isBlockDevice();
        tarArchiveEntry8.setGroupName("\000\000");
        java.util.Date date13 = tarArchiveEntry8.getLastModifiedDate();
        boolean boolean14 = tarArchiveEntry2.equals((java.lang.Object) date13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
// flaky "7) test1511(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "3) test1511(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 0, false);
        tarArchiveEntry3.setMode(52);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", true);
        boolean boolean8 = tarArchiveEntry2.equals(tarArchiveEntry7);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date12 = tarArchiveEntry11.getLastModifiedDate();
        boolean boolean13 = tarArchiveEntry11.isCharacterDevice();
        tarArchiveEntry11.setUserName("hi!");
        boolean boolean16 = tarArchiveEntry11.isStarSparse();
        boolean boolean17 = tarArchiveEntry11.isGNULongLinkEntry();
        boolean boolean18 = tarArchiveEntry11.isFile();
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry11);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray20 = tarArchiveEntry11.getDirectoryEntries();
        byte[] byteArray25 = new byte[] { (byte) 48, (byte) 103, (byte) 55, (byte) 55 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.writeEntryHeader(byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "8) test1513(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray20);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray20, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 48, (byte) 103, (byte) 55, (byte) 55 });
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setUserId(0L);
        tarArchiveEntry3.setMode((int) (byte) 88);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean12 = tarArchiveEntry11.isGlobalPaxHeader();
        boolean boolean13 = tarArchiveEntry11.isPaxGNUSparse();
        boolean boolean14 = tarArchiveEntry3.equals((java.lang.Object) boolean13);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray15 = tarArchiveEntry3.getDirectoryEntries();
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 55, (byte) 83, (byte) 75, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray21, zipEncoding22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray15);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray15, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 100, (byte) 55, (byte) 83, (byte) 75, (byte) 103 });
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setMode((-1));
        boolean boolean15 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupName("");
        long long18 = tarArchiveEntry2.getLongGroupId();
        boolean boolean19 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean23 = tarArchiveEntry22.isGlobalPaxHeader();
        boolean boolean24 = tarArchiveEntry22.isFile();
        boolean boolean25 = tarArchiveEntry22.isDirectory();
        tarArchiveEntry22.setSize((long) 504);
        long long28 = tarArchiveEntry22.getSize();
        boolean boolean29 = tarArchiveEntry22.isLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry32 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date33 = tarArchiveEntry32.getLastModifiedDate();
        boolean boolean34 = tarArchiveEntry32.isCharacterDevice();
        tarArchiveEntry32.setUserName("hi!");
        tarArchiveEntry32.setGroupName("");
        java.util.Date date39 = tarArchiveEntry32.getModTime();
        boolean boolean40 = tarArchiveEntry32.isGNULongLinkEntry();
        boolean boolean41 = tarArchiveEntry32.isPaxHeader();
        java.util.Date date42 = tarArchiveEntry32.getLastModifiedDate();
        tarArchiveEntry22.setModTime(date42);
        boolean boolean44 = tarArchiveEntry2.equals((java.lang.Object) date42);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "9) test1515(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 504L + "'", long28 == 504L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date33);
// flaky "4) test1515(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date33.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date39);
// flaky "2) test1515(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date39.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(date42);
// flaky "1) test1515(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date42.toString(), "Mon Sep 28 13:40:28 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setMode(33188);
        tarArchiveEntry2.setSize((long) (byte) 83);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setDevMinor(257);
        tarArchiveEntry2.setName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        java.util.Date date18 = tarArchiveEntry14.getModTime();
        tarArchiveEntry14.setUserId((long) '#');
        boolean boolean21 = tarArchiveEntry14.isCheckSumOK();
        long long22 = tarArchiveEntry14.getLongUserId();
        boolean boolean23 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry14);
        boolean boolean24 = tarArchiveEntry2.isBlockDevice();
        long long25 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setGroupName("tar\000");
        tarArchiveEntry2.setNames("0\000", "");
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 103 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 4 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "10) test1517(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "5) test1517(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0, (byte) 103 });
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setUserId((long) 263);
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        long long14 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "11) test1519(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 48L + "'", long14 == 48L);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) -1);
        tarArchiveEntry2.setNames("hi!", " \000");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 54, (byte) 48, (byte) -1, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 54, (byte) 48, (byte) -1, (byte) 120 });
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setModTime((long) 1);
        int int11 = tarArchiveEntry2.getGroupId();
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        java.util.Date date5 = tarArchiveEntry3.getLastModifiedDate();
        long long6 = tarArchiveEntry3.getLongGroupId();
        java.util.Date date7 = tarArchiveEntry3.getLastModifiedDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky "12) test1523(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(date7);
// flaky "6) test1523(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date7.toString(), "Mon Sep 28 13:40:29 ICT 2026");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setGroupId(0);
        tarArchiveEntry2.setUserId((long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 55, (byte) 52, (byte) 75 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1, (byte) 55, (byte) 52, (byte) 75 });
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        byte[] byteArray7 = new byte[] { (byte) 53, (byte) 75, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "13) test1526(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 53, (byte) 75, (byte) -1 });
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setLinkName("././@LongLink");
        boolean boolean7 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertNotNull(date3);
// flaky "14) test1527(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setName("ustar ");
        boolean boolean11 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        java.io.File file6 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setUserId((int) (byte) 53);
        int int9 = tarArchiveEntry2.getGroupId();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "15) test1529(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        java.util.Date date5 = tarArchiveEntry3.getLastModifiedDate();
        long long6 = tarArchiveEntry3.getLongGroupId();
        int int7 = tarArchiveEntry3.getGroupId();
        boolean boolean8 = tarArchiveEntry3.isOldGNUSparse();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky "16) test1530(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setDevMinor(257);
        tarArchiveEntry2.setName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        java.util.Date date18 = tarArchiveEntry14.getModTime();
        tarArchiveEntry14.setUserId((long) '#');
        boolean boolean21 = tarArchiveEntry14.isCheckSumOK();
        long long22 = tarArchiveEntry14.getLongUserId();
        boolean boolean23 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry14);
        boolean boolean24 = tarArchiveEntry14.isSymbolicLink();
        byte[] byteArray25 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry14.parseTarHeader(byteArray25, zipEncoding26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "17) test1531(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "7) test1531(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setMode((-1));
        int int15 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "18) test1532(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setNames("00", "");
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setSize(52L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "19) test1533(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "8) test1533(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date11);
// flaky "3) test1533(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:29 ICT 2026");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId((int) (byte) 48);
        boolean boolean12 = tarArchiveEntry2.isDirectory();
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "20) test1534(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:29 ICT 2026");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        long long10 = tarArchiveEntry2.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray11 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean12 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setMode((int) (byte) 75);
        tarArchiveEntry2.setModTime((long) 10240);
        java.lang.String str17 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray11);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray11, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000");
        tarArchiveEntry1.setDevMajor((int) (byte) 48);
        boolean boolean4 = tarArchiveEntry1.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        int int10 = tarArchiveEntry2.getDevMajor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertNotNull(date9);
// flaky "21) test1537(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        boolean boolean9 = tarArchiveEntry7.isFile();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        java.util.Date date11 = tarArchiveEntry7.getModTime();
        java.lang.String str12 = tarArchiveEntry7.getGroupName();
        boolean boolean13 = tarArchiveEntry2.isDescendent(tarArchiveEntry7);
        tarArchiveEntry7.setDevMajor(16877);
        boolean boolean16 = tarArchiveEntry7.isFIFO();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "22) test1538(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "9) test1538(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        boolean boolean12 = tarArchiveEntry2.isPaxGNUSparse();
        tarArchiveEntry2.setMode((int) (byte) 48);
        long long15 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId(508);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "23) test1539(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "10) test1539(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        int int7 = tarArchiveEntry2.getDevMinor();
        byte[] byteArray14 = new byte[] { (byte) 55, (byte) 0, (byte) 120, (byte) 100, (byte) 10, (byte) 120 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 55, (byte) 0, (byte) 120, (byte) 100, (byte) 10, (byte) 120 });
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 100, false);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        java.lang.String str5 = tarArchiveEntry3.getUserName();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isSparse();
        boolean boolean8 = tarArchiveEntry3.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long12 = tarArchiveEntry11.getSize();
        tarArchiveEntry11.setUserId((int) (byte) 10);
        boolean boolean15 = tarArchiveEntry11.isBlockDevice();
        tarArchiveEntry11.setGroupId((-1L));
        java.lang.String str18 = tarArchiveEntry11.getGroupName();
        boolean boolean19 = tarArchiveEntry2.equals(tarArchiveEntry11);
        boolean boolean20 = tarArchiveEntry11.isBlockDevice();
        tarArchiveEntry11.setDevMajor((int) (byte) 48);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "24) test1542(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isGNULongLinkEntry();
        tarArchiveEntry3.setGroupId((int) (byte) 55);
        java.io.File file7 = tarArchiveEntry3.getFile();
        boolean boolean8 = tarArchiveEntry3.isOldGNUSparse();
        tarArchiveEntry3.setDevMinor((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        byte[] byteArray4 = new byte[] { (byte) 50, (byte) 103, (byte) 51, (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 50, (byte) 103, (byte) 51, (byte) 76 });
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray11 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray11);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray11, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isFile();
        tarArchiveEntry3.setNames("00", "0\000");
        boolean boolean8 = tarArchiveEntry3.isLink();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillStarSparseData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        boolean boolean9 = tarArchiveEntry7.isFile();
        boolean boolean10 = tarArchiveEntry7.isPaxGNUSparse();
        boolean boolean11 = tarArchiveEntry7.isFile();
        boolean boolean12 = tarArchiveEntry7.isFIFO();
        boolean boolean13 = tarArchiveEntry7.isFile();
        boolean boolean14 = tarArchiveEntry7.isDirectory();
        boolean boolean15 = tarArchiveEntry2.equals(tarArchiveEntry7);
        boolean boolean16 = tarArchiveEntry2.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean20 = tarArchiveEntry19.isGlobalPaxHeader();
        boolean boolean21 = tarArchiveEntry19.isFile();
        boolean boolean22 = tarArchiveEntry19.isDirectory();
        tarArchiveEntry19.setSize((long) 504);
        boolean boolean25 = tarArchiveEntry19.isSparse();
        boolean boolean26 = tarArchiveEntry19.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long30 = tarArchiveEntry29.getSize();
        tarArchiveEntry29.setUserId((int) (byte) 10);
        boolean boolean33 = tarArchiveEntry29.isGlobalPaxHeader();
        tarArchiveEntry29.setGroupId((long) (byte) 10);
        long long36 = tarArchiveEntry29.getLongUserId();
        tarArchiveEntry29.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date40 = tarArchiveEntry29.getModTime();
        tarArchiveEntry19.setModTime(date40);
        tarArchiveEntry2.setModTime(date40);
        boolean boolean43 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str44 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(date40);
// flaky "25) test1547(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ustar " + "'", str44, "ustar ");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setIds(155, 96);
        tarArchiveEntry2.setSize(2097151L);
        java.lang.String str15 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setUserId((int) (byte) 76);
        tarArchiveEntry2.setGroupName("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setModTime((long) (byte) 75);
        boolean boolean14 = tarArchiveEntry10.isGNUSparse();
        boolean boolean15 = tarArchiveEntry10.isOldGNUSparse();
        tarArchiveEntry10.setDevMajor((int) (byte) 55);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "26) test1549(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "11) test1549(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isLink();
        boolean boolean10 = tarArchiveEntry2.isBlockDevice();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setDevMajor((int) (short) 1);
        boolean boolean14 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setMode(8);
        java.util.Date date17 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "27) test1550(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:29 ICT 2026");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long6 = tarArchiveEntry5.getSize();
        tarArchiveEntry5.setUserId((int) (byte) 10);
        boolean boolean9 = tarArchiveEntry5.isGlobalPaxHeader();
        tarArchiveEntry5.setGroupId((long) (byte) 10);
        boolean boolean12 = tarArchiveEntry5.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray13 = tarArchiveEntry5.getDirectoryEntries();
        java.lang.String str14 = tarArchiveEntry5.getLinkName();
        tarArchiveEntry5.setGroupId(35L);
        java.util.Date date17 = tarArchiveEntry5.getLastModifiedDate();
        tarArchiveEntry5.setName("");
        boolean boolean20 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry5);
        tarArchiveEntry2.setGroupName("ustar ");
        tarArchiveEntry2.setUserName(" \000");
        java.lang.String str25 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setDevMajor(504);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray13);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray13, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(date17);
// flaky "28) test1551(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        int int9 = tarArchiveEntry2.getDevMinor();
        long long10 = tarArchiveEntry2.getSize();
        int int11 = tarArchiveEntry2.getDevMajor();
        tarArchiveEntry2.setGroupId(1L);
        java.util.Date date14 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "29) test1552(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(date14);
// flaky "12) test1552(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:29 ICT 2026");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId(10L);
        tarArchiveEntry2.setMode(12);
        tarArchiveEntry2.setDevMinor(1);
        long long12 = tarArchiveEntry2.getLongGroupId();
        boolean boolean13 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertNotNull(date5);
// flaky "30) test1553(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        long long12 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((long) (byte) 55);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "31) test1554(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "13) test1554(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        int int9 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setDevMajor((int) (byte) 88);
        int int12 = tarArchiveEntry2.getMode();
        java.lang.String str13 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "32) test1555(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str10 = tarArchiveEntry2.getLinkName();
        boolean boolean11 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean12 = tarArchiveEntry2.isBlockDevice();
        boolean boolean13 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "33) test1556(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "14) test1556(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setDevMajor(33188);
        tarArchiveEntry2.setLinkName("hi!");
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray11, zipEncoding12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setUserId((int) '#');
        boolean boolean14 = tarArchiveEntry10.isFIFO();
        boolean boolean15 = tarArchiveEntry10.isPaxHeader();
        boolean boolean16 = tarArchiveEntry10.isStarSparse();
        tarArchiveEntry10.setName("00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "34) test1558(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "15) test1558(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        int int9 = tarArchiveEntry2.getDevMinor();
        boolean boolean10 = tarArchiveEntry2.isGNULongNameEntry();
        int int11 = tarArchiveEntry2.getDevMinor();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        boolean boolean9 = tarArchiveEntry7.isFile();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        java.util.Date date11 = tarArchiveEntry7.getModTime();
        java.lang.String str12 = tarArchiveEntry7.getGroupName();
        boolean boolean13 = tarArchiveEntry2.isDescendent(tarArchiveEntry7);
        long long14 = tarArchiveEntry7.getLongUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long18 = tarArchiveEntry17.getSize();
        tarArchiveEntry17.setUserId((int) (byte) 10);
        boolean boolean21 = tarArchiveEntry17.isGlobalPaxHeader();
        tarArchiveEntry17.setGroupId((long) (byte) 10);
        boolean boolean24 = tarArchiveEntry17.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray25 = tarArchiveEntry17.getDirectoryEntries();
        boolean boolean26 = tarArchiveEntry17.isSymbolicLink();
        boolean boolean27 = tarArchiveEntry17.isCharacterDevice();
        boolean boolean28 = tarArchiveEntry7.equals(tarArchiveEntry17);
        java.lang.String str29 = tarArchiveEntry17.getLinkName();
        tarArchiveEntry17.setGroupName("ustar ");
        boolean boolean32 = tarArchiveEntry17.isSparse();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "35) test1560(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "16) test1560(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray25);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray25, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setDevMinor(257);
        tarArchiveEntry2.setName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        java.util.Date date18 = tarArchiveEntry14.getModTime();
        tarArchiveEntry14.setUserId((long) '#');
        boolean boolean21 = tarArchiveEntry14.isCheckSumOK();
        long long22 = tarArchiveEntry14.getLongUserId();
        boolean boolean23 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry14);
        boolean boolean24 = tarArchiveEntry14.isSymbolicLink();
        long long25 = tarArchiveEntry14.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "36) test1561(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "17) test1561(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getRealSize();
        boolean boolean9 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertNotNull(date3);
// flaky "37) test1562(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setGroupId((int) (byte) 0);
        tarArchiveEntry2.setIds((int) '#', 0);
        java.util.Date date10 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "38) test1563(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongGroupId();
        int int9 = tarArchiveEntry2.getMode();
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setNames("tar\000", "hi!");
        boolean boolean14 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setUserName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date20 = tarArchiveEntry19.getLastModifiedDate();
        boolean boolean21 = tarArchiveEntry19.isCharacterDevice();
        tarArchiveEntry19.setUserName("hi!");
        boolean boolean24 = tarArchiveEntry19.isGNULongNameEntry();
        tarArchiveEntry19.setMode((int) (byte) 55);
        boolean boolean27 = tarArchiveEntry2.equals(tarArchiveEntry19);
        byte[] byteArray32 = new byte[] { (byte) 52, (byte) 55, (byte) 48, (byte) 50 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry19.writeEntryHeader(byteArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky "39) test1564(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 52, (byte) 55, (byte) 48, (byte) 50 });
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isLink();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setIds((int) (byte) 75, (int) (byte) 83);
        java.lang.String str15 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setUserId((int) '4');
        boolean boolean18 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setUserName("ustar\000");
        tarArchiveEntry2.setGroupId(2097151L);
        tarArchiveEntry2.setGroupId((int) (byte) 54);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setModTime(0L);
        boolean boolean13 = tarArchiveEntry2.isFIFO();
        boolean boolean14 = tarArchiveEntry2.isExtended();
        boolean boolean15 = tarArchiveEntry2.isGNULongNameEntry();
        byte[] byteArray22 = new byte[] { (byte) 83, (byte) 55, (byte) 48, (byte) 53, (byte) 55, (byte) 55 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray22, zipEncoding23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 83, (byte) 55, (byte) 48, (byte) 53, (byte) 55, (byte) 55 });
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setGroupId(100L);
        boolean boolean12 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean13 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 100, false);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry3.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        int int9 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setDevMajor((int) (byte) 88);
        boolean boolean12 = tarArchiveEntry2.isStarSparse();
        boolean boolean13 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setGroupId((int) (byte) 120);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "40) test1570(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isLink();
        java.lang.String str11 = tarArchiveEntry2.getGroupName();
        java.lang.String str12 = tarArchiveEntry2.getUserName();
        byte[] byteArray14 = new byte[] { (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 120 });
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        boolean boolean8 = tarArchiveEntry2.isExtended();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "41) test1572(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        int int13 = tarArchiveEntry2.getUserId();
        java.util.Date date14 = tarArchiveEntry2.getModTime();
        boolean boolean15 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setDevMajor((int) (byte) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "42) test1573(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "18) test1573(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray7 = tarArchiveEntry2.getDirectoryEntries();
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray7);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray7, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        byte[] byteArray5 = new byte[] { (byte) 83, (byte) 100, (byte) 50, (byte) 76, (byte) 51 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 83, (byte) 100, (byte) 50, (byte) 76, (byte) 51 });
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 100);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 50, (byte) 52, (byte) 1, (byte) 48 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray8, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 50, (byte) 52, (byte) 1, (byte) 48 });
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setName("0\000");
        java.io.File file5 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setGroupName("\000\000");
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 1, false);
        boolean boolean4 = tarArchiveEntry3.isPaxGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry10.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray13 = tarArchiveEntry10.getDirectoryEntries();
        int int14 = tarArchiveEntry10.getDevMinor();
        boolean boolean15 = tarArchiveEntry10.isBlockDevice();
        boolean boolean16 = tarArchiveEntry10.isSparse();
        java.util.Date date17 = tarArchiveEntry10.getLastModifiedDate();
        boolean boolean18 = tarArchiveEntry7.equals((java.lang.Object) date17);
        tarArchiveEntry3.setModTime(date17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray13);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray13, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "43) test1578(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        byte[] byteArray6 = new byte[] { (byte) 55, (byte) 49, (byte) 53, (byte) 52, (byte) 52, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 55, (byte) 49, (byte) 53, (byte) 52, (byte) 52, (byte) 88 });
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean12 = tarArchiveEntry11.isGlobalPaxHeader();
        boolean boolean13 = tarArchiveEntry11.isFile();
        java.util.Date date14 = tarArchiveEntry11.getModTime();
        java.util.Date date15 = tarArchiveEntry11.getModTime();
        int int16 = tarArchiveEntry11.getMode();
        boolean boolean17 = tarArchiveEntry2.equals(tarArchiveEntry11);
        boolean boolean18 = tarArchiveEntry11.isBlockDevice();
        boolean boolean19 = tarArchiveEntry11.isPaxGNUSparse();
        java.lang.String str20 = tarArchiveEntry11.getLinkName();
        boolean boolean21 = tarArchiveEntry11.isSparse();
        int int22 = tarArchiveEntry11.getMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
// flaky "44) test1580(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "19) test1580(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 33188 + "'", int22 == 33188);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long16 = tarArchiveEntry15.getSize();
        tarArchiveEntry15.setUserId((int) (byte) 10);
        long long19 = tarArchiveEntry15.getLongUserId();
        int int20 = tarArchiveEntry15.getDevMinor();
        tarArchiveEntry15.setDevMinor(257);
        tarArchiveEntry15.setName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean28 = tarArchiveEntry27.isGlobalPaxHeader();
        boolean boolean29 = tarArchiveEntry27.isFile();
        java.util.Date date30 = tarArchiveEntry27.getModTime();
        java.util.Date date31 = tarArchiveEntry27.getModTime();
        tarArchiveEntry27.setUserId((long) '#');
        boolean boolean34 = tarArchiveEntry27.isCheckSumOK();
        long long35 = tarArchiveEntry27.getLongUserId();
        boolean boolean36 = tarArchiveEntry15.equals((java.lang.Object) tarArchiveEntry27);
        java.lang.String str37 = tarArchiveEntry15.getGroupName();
        boolean boolean38 = tarArchiveEntry2.isDescendent(tarArchiveEntry15);
        org.junit.Assert.assertNotNull(date3);
// flaky "45) test1581(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "20) test1581(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "4) test1581(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date30);
// flaky "2) test1581(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date31);
// flaky "1) test1581(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) 504);
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        java.lang.String str10 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        int int11 = tarArchiveEntry2.getDevMinor();
        java.lang.String str12 = tarArchiveEntry2.getLinkName();
        boolean boolean13 = tarArchiveEntry2.isFile();
        boolean boolean14 = tarArchiveEntry2.isFile();
        java.lang.String str15 = tarArchiveEntry2.getName();
        boolean boolean16 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "46) test1583(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ustar " + "'", str15, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isLink();
        boolean boolean9 = tarArchiveEntry2.isPaxGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "47) test1584(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        boolean boolean12 = tarArchiveEntry9.isPaxGNUSparse();
        boolean boolean13 = tarArchiveEntry9.isFile();
        boolean boolean14 = tarArchiveEntry9.isFile();
        java.util.Date date15 = tarArchiveEntry9.getLastModifiedDate();
        java.util.Date date16 = tarArchiveEntry9.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean20 = tarArchiveEntry19.isGlobalPaxHeader();
        boolean boolean21 = tarArchiveEntry19.isFile();
        boolean boolean22 = tarArchiveEntry19.isPaxGNUSparse();
        boolean boolean23 = tarArchiveEntry19.isFile();
        boolean boolean24 = tarArchiveEntry19.isFile();
        java.util.Date date25 = tarArchiveEntry19.getLastModifiedDate();
        int int26 = tarArchiveEntry19.getDevMinor();
        long long27 = tarArchiveEntry19.getSize();
        int int28 = tarArchiveEntry19.getDevMajor();
        tarArchiveEntry19.setGroupId(1L);
        boolean boolean31 = tarArchiveEntry9.equals((java.lang.Object) 1L);
        boolean boolean32 = tarArchiveEntry9.isDirectory();
        boolean boolean33 = tarArchiveEntry2.isDescendent(tarArchiveEntry9);
        byte[] byteArray36 = new byte[] { (byte) 76, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry9.writeEntryHeader(byteArray36, zipEncoding37, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "48) test1585(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(date15);
// flaky "21) test1585(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "5) test1585(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(date25);
// flaky "3) test1585(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 76, (byte) 50 });
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.lang.String str12 = tarArchiveEntry2.getLinkName();
        boolean boolean13 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray14 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean15 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean16 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean17 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray14);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray14, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setMode(0);
        boolean boolean11 = tarArchiveEntry2.isExtended();
        java.lang.String str12 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setUserName("");
        long long15 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ustar " + "'", str12, "ustar ");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long6 = tarArchiveEntry5.getSize();
        tarArchiveEntry5.setUserId((int) (byte) 10);
        boolean boolean9 = tarArchiveEntry5.isGlobalPaxHeader();
        tarArchiveEntry5.setGroupId((long) (byte) 10);
        boolean boolean12 = tarArchiveEntry5.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray13 = tarArchiveEntry5.getDirectoryEntries();
        java.lang.String str14 = tarArchiveEntry5.getLinkName();
        tarArchiveEntry5.setGroupId(35L);
        java.util.Date date17 = tarArchiveEntry5.getLastModifiedDate();
        tarArchiveEntry5.setName("");
        boolean boolean20 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry5);
        tarArchiveEntry2.setGroupName("ustar ");
        tarArchiveEntry2.setUserName(" \000");
        java.lang.String str25 = tarArchiveEntry2.getGroupName();
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 1, (byte) 120, (byte) 50, (byte) 55, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray13);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray13, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(date17);
// flaky "49) test1588(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ustar " + "'", str25, "ustar ");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        int int6 = tarArchiveEntry2.getDevMinor();
        boolean boolean7 = tarArchiveEntry2.isBlockDevice();
        boolean boolean8 = tarArchiveEntry2.isSparse();
        java.util.Date date9 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserId(10L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "50) test1589(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:29 ICT 2026");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray12 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertNotNull(date3);
// flaky "51) test1590(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "22) test1590(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray12);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray12, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        byte[] byteArray2 = new byte[] { (byte) 75, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 75, (byte) 1 });
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long13 = tarArchiveEntry12.getSize();
        tarArchiveEntry12.setUserId((int) (byte) 10);
        boolean boolean16 = tarArchiveEntry12.isGlobalPaxHeader();
        tarArchiveEntry12.setGroupId((long) (byte) 10);
        boolean boolean19 = tarArchiveEntry12.isFile();
        boolean boolean20 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry12);
        tarArchiveEntry12.setUserName("\000\000");
        java.lang.String str23 = tarArchiveEntry12.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ustar " + "'", str23, "ustar ");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        tarArchiveEntry2.setSize((long) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        boolean boolean13 = tarArchiveEntry10.isDirectory();
        tarArchiveEntry10.setSize((long) 504);
        boolean boolean16 = tarArchiveEntry10.isSparse();
        tarArchiveEntry10.setName("ustar ");
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        int int20 = tarArchiveEntry10.getUserId();
        long long21 = tarArchiveEntry10.getLongUserId();
        boolean boolean22 = tarArchiveEntry10.isFile();
        tarArchiveEntry10.setDevMajor(32);
        long long25 = tarArchiveEntry10.getLongGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        int int5 = tarArchiveEntry3.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean9 = tarArchiveEntry8.isGlobalPaxHeader();
        boolean boolean10 = tarArchiveEntry8.isFile();
        boolean boolean11 = tarArchiveEntry8.isDirectory();
        tarArchiveEntry8.setSize((long) 504);
        java.lang.String str14 = tarArchiveEntry8.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date18 = tarArchiveEntry17.getLastModifiedDate();
        boolean boolean19 = tarArchiveEntry17.isCharacterDevice();
        tarArchiveEntry17.setUserName("hi!");
        tarArchiveEntry17.setGroupName("");
        java.util.Date date24 = tarArchiveEntry17.getModTime();
        tarArchiveEntry8.setModTime(date24);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry28 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date29 = tarArchiveEntry28.getLastModifiedDate();
        boolean boolean30 = tarArchiveEntry28.isCharacterDevice();
        tarArchiveEntry28.setUserName("hi!");
        tarArchiveEntry28.setGroupName("");
        java.util.Date date35 = tarArchiveEntry28.getModTime();
        tarArchiveEntry8.setModTime(date35);
        tarArchiveEntry3.setModTime(date35);
        java.lang.String str38 = tarArchiveEntry3.getLinkName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(date18);
// flaky "52) test1594(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date24);
// flaky "23) test1594(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date29);
// flaky "6) test1594(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date29.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date35);
// flaky "4) test1594(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date35.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long9 = tarArchiveEntry8.getSize();
        tarArchiveEntry8.setUserId((int) (byte) 10);
        boolean boolean12 = tarArchiveEntry8.isGlobalPaxHeader();
        tarArchiveEntry8.setGroupId((long) (byte) 10);
        tarArchiveEntry8.setDevMinor(504);
        boolean boolean17 = tarArchiveEntry3.isDescendent(tarArchiveEntry8);
        boolean boolean18 = tarArchiveEntry3.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray19 = tarArchiveEntry3.getDirectoryEntries();
        java.lang.Class<?> wildcardClass20 = tarArchiveEntry3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray19);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray19, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.lang.String str9 = tarArchiveEntry2.getName();
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "53) test1596(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setModTime(0L);
        boolean boolean13 = tarArchiveEntry2.isStarSparse();
        int int14 = tarArchiveEntry2.getDevMajor();
        long long15 = tarArchiveEntry2.getLongGroupId();
        java.util.Date date16 = tarArchiveEntry2.getModTime();
        java.lang.String str17 = tarArchiveEntry2.getUserName();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupName("hi!");
        long long9 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 103, false);
        tarArchiveEntry3.setLinkName("tar\000");
        tarArchiveEntry3.setUserId((long) (byte) 88);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        boolean boolean13 = tarArchiveEntry10.isDirectory();
        tarArchiveEntry10.setSize((long) 504);
        long long16 = tarArchiveEntry10.getSize();
        boolean boolean17 = tarArchiveEntry10.isGNULongLinkEntry();
        boolean boolean18 = tarArchiveEntry3.isDescendent(tarArchiveEntry10);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray19 = tarArchiveEntry3.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 504L + "'", long16 == 504L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray19);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray19, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        boolean boolean10 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        boolean boolean3 = tarArchiveEntry2.isPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        boolean boolean9 = tarArchiveEntry7.isFile();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        java.util.Date date11 = tarArchiveEntry7.getModTime();
        boolean boolean12 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry7);
        tarArchiveEntry2.setUserId(6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "54) test1601(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "24) test1601(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertNotNull(date3);
// flaky "55) test1602(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "25) test1602(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:29 ICT 2026");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("0\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry14.setMode((int) '#');
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        tarArchiveEntry2.setModTime(date17);
        int int19 = tarArchiveEntry2.getDevMajor();
        int int20 = tarArchiveEntry2.getUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean24 = tarArchiveEntry23.isGlobalPaxHeader();
        boolean boolean25 = tarArchiveEntry23.isFile();
        java.util.Date date26 = tarArchiveEntry23.getModTime();
        java.util.Date date27 = tarArchiveEntry23.getModTime();
        tarArchiveEntry23.setDevMinor(0);
        java.lang.String str30 = tarArchiveEntry23.getName();
        boolean boolean31 = tarArchiveEntry23.isLink();
        java.util.Date date32 = tarArchiveEntry23.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date32);
        tarArchiveEntry2.setGroupName("");
        byte[] byteArray41 = new byte[] { (byte) 54, (byte) 53, (byte) 10, (byte) 54, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "56) test1603(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date26);
// flaky "26) test1603(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(date27);
// flaky "7) test1603(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ustar " + "'", str30, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date32);
// flaky "5) test1603(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date32.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 54, (byte) 53, (byte) 10, (byte) 54, (byte) 1 });
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean8 = tarArchiveEntry2.isDirectory();
        long long9 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertNotNull(date3);
// flaky "57) test1604(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        boolean boolean12 = tarArchiveEntry9.isDirectory();
        tarArchiveEntry9.setSize((long) 504);
        boolean boolean15 = tarArchiveEntry9.isSparse();
        boolean boolean16 = tarArchiveEntry9.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long20 = tarArchiveEntry19.getSize();
        tarArchiveEntry19.setUserId((int) (byte) 10);
        boolean boolean23 = tarArchiveEntry19.isGlobalPaxHeader();
        tarArchiveEntry19.setGroupId((long) (byte) 10);
        long long26 = tarArchiveEntry19.getLongUserId();
        tarArchiveEntry19.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date30 = tarArchiveEntry19.getModTime();
        tarArchiveEntry9.setModTime(date30);
        boolean boolean32 = tarArchiveEntry3.equals((java.lang.Object) tarArchiveEntry9);
        boolean boolean33 = tarArchiveEntry9.isGNULongNameEntry();
        boolean boolean34 = tarArchiveEntry9.isSymbolicLink();
        long long35 = tarArchiveEntry9.getSize();
        boolean boolean36 = tarArchiveEntry9.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(date30);
// flaky "58) test1605(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 504L + "'", long35 == 504L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str10 = tarArchiveEntry9.getLinkName();
        java.util.Date date11 = tarArchiveEntry9.getLastModifiedDate();
        long long12 = tarArchiveEntry9.getLongGroupId();
        boolean boolean13 = tarArchiveEntry2.equals(tarArchiveEntry9);
        boolean boolean14 = tarArchiveEntry2.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date18 = tarArchiveEntry17.getLastModifiedDate();
        boolean boolean19 = tarArchiveEntry17.isCharacterDevice();
        tarArchiveEntry17.setUserName("hi!");
        boolean boolean22 = tarArchiveEntry17.isSymbolicLink();
        boolean boolean23 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry17);
        java.lang.String str24 = tarArchiveEntry17.getLinkName();
        boolean boolean25 = tarArchiveEntry17.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(date11);
// flaky "59) test1606(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "27) test1606(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        boolean boolean4 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupName("\000\000");
        tarArchiveEntry2.setGroupId(0);
        java.io.File file9 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setGroupId((long) 1);
        long long7 = tarArchiveEntry3.getRealSize();
        java.util.Date date8 = tarArchiveEntry3.getLastModifiedDate();
        byte[] byteArray14 = new byte[] { (byte) 83, (byte) 120, (byte) 83, (byte) 75, (byte) 49 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray14, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date8);
// flaky "60) test1608(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:29 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 83, (byte) 120, (byte) 83, (byte) 75, (byte) 49 });
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry2.setUserId((int) (byte) 48);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setUserId((int) '#');
        tarArchiveEntry10.setModTime((long) 12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "61) test1610(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "28) test1610(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setMode((-1));
        boolean boolean15 = tarArchiveEntry2.isBlockDevice();
        long long16 = tarArchiveEntry2.getLongGroupId();
        int int17 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setGroupId((long) 3);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "62) test1611(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        boolean boolean7 = tarArchiveEntry2.isSparse();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        boolean boolean9 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertNotNull(date3);
// flaky "63) test1612(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 52, true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean7 = tarArchiveEntry6.isGlobalPaxHeader();
        boolean boolean8 = tarArchiveEntry6.isFile();
        boolean boolean9 = tarArchiveEntry6.isPaxGNUSparse();
        boolean boolean10 = tarArchiveEntry6.isFile();
        boolean boolean11 = tarArchiveEntry6.isFile();
        java.util.Date date12 = tarArchiveEntry6.getLastModifiedDate();
        tarArchiveEntry3.setModTime(date12);
        byte[] byteArray20 = new byte[] { (byte) 83, (byte) 50, (byte) 100, (byte) 1, (byte) 1, (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray20, zipEncoding21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(date12);
// flaky "64) test1613(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 83, (byte) 50, (byte) 100, (byte) 1, (byte) 1, (byte) 76 });
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 103, false);
        tarArchiveEntry3.setLinkName("tar\000");
        tarArchiveEntry3.setUserId((long) (byte) 88);
        boolean boolean8 = tarArchiveEntry3.isSparse();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean9 = tarArchiveEntry2.isLink();
        long long10 = tarArchiveEntry2.getLongGroupId();
        int int11 = tarArchiveEntry2.getDevMajor();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 51, (byte) 100, (byte) 0, (byte) 52, (byte) 53 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray18, zipEncoding19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 51, (byte) 100, (byte) 0, (byte) 52, (byte) 53 });
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean6 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isGNULongLinkEntry();
        java.lang.String str8 = tarArchiveEntry3.getGroupName();
        boolean boolean9 = tarArchiveEntry3.isGNULongNameEntry();
        boolean boolean10 = tarArchiveEntry3.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(155);
        tarArchiveEntry2.setDevMajor(0);
        tarArchiveEntry2.setGroupId((int) (short) 100);
        boolean boolean15 = tarArchiveEntry2.isDirectory();
        boolean boolean16 = tarArchiveEntry2.isSymbolicLink();
        long long17 = tarArchiveEntry2.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray18 = tarArchiveEntry2.getDirectoryEntries();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray18);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray18, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 103, false);
        tarArchiveEntry3.setLinkName("tar\000");
        tarArchiveEntry3.setUserId((long) (byte) 88);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        boolean boolean13 = tarArchiveEntry10.isDirectory();
        tarArchiveEntry10.setSize((long) 504);
        long long16 = tarArchiveEntry10.getSize();
        boolean boolean17 = tarArchiveEntry10.isGNULongLinkEntry();
        boolean boolean18 = tarArchiveEntry3.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setLinkName("\000\000");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 504L + "'", long16 == 504L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setIds(31, 16877);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long16 = tarArchiveEntry15.getSize();
        tarArchiveEntry15.setUserId((int) (byte) 10);
        boolean boolean19 = tarArchiveEntry15.isGlobalPaxHeader();
        tarArchiveEntry15.setGroupId((long) (byte) 10);
        boolean boolean22 = tarArchiveEntry15.isBlockDevice();
        tarArchiveEntry15.setUserId(100L);
        boolean boolean25 = tarArchiveEntry15.isSymbolicLink();
        boolean boolean26 = tarArchiveEntry2.isDescendent(tarArchiveEntry15);
        tarArchiveEntry2.setGroupId(263);
        boolean boolean29 = tarArchiveEntry2.isCheckSumOK();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding32 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray31, zipEncoding32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1 });
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        int int10 = tarArchiveEntry2.getDevMinor();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.lang.String str12 = tarArchiveEntry2.getLinkName();
        boolean boolean13 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray14 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setDevMajor((int) '4');
        java.lang.String str17 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setIds((int) (short) 10, (-1));
        tarArchiveEntry2.setGroupId(4);
        int int23 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray14);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray14, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        boolean boolean14 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean15 = tarArchiveEntry2.isSparse();
        boolean boolean16 = tarArchiveEntry2.isFile();
        byte[] byteArray18 = new byte[] { (byte) 52 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "65) test1624(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 52 });
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        int int6 = tarArchiveEntry2.getDevMinor();
        boolean boolean7 = tarArchiveEntry2.isBlockDevice();
        java.io.File file8 = tarArchiveEntry2.getFile();
        boolean boolean9 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean10 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        boolean boolean12 = tarArchiveEntry2.isPaxGNUSparse();
        tarArchiveEntry2.setMode((int) (byte) 48);
        long long15 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId(508);
        boolean boolean18 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "66) test1626(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "29) test1626(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setModTime(0L);
        boolean boolean13 = tarArchiveEntry2.isFIFO();
        boolean boolean14 = tarArchiveEntry2.isPaxGNUSparse();
        int int15 = tarArchiveEntry2.getDevMinor();
        int int16 = tarArchiveEntry2.getMode();
        int int17 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setMode(0);
        boolean boolean11 = tarArchiveEntry2.isExtended();
        java.lang.String str12 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setUserName("");
        int int15 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ustar " + "'", str12, "ustar ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        byte[] byteArray4 = new byte[] { (byte) 49, (byte) 120, (byte) 76, (byte) 49 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 49, (byte) 120, (byte) 76, (byte) 49 });
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setLinkName("\000\000");
        long long12 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserName("hi!");
        long long15 = tarArchiveEntry2.getLongUserId();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 504L + "'", long12 == 504L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        int int9 = tarArchiveEntry2.getGroupId();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean12 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 1);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        long long10 = tarArchiveEntry2.getSize();
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setGroupName("");
        java.util.Date date14 = tarArchiveEntry2.getModTime();
        int int15 = tarArchiveEntry2.getUserId();
        int int16 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date14);
// flaky "67) test1634(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry5.setUserName("");
        java.util.Date date8 = tarArchiveEntry5.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long12 = tarArchiveEntry11.getSize();
        boolean boolean13 = tarArchiveEntry11.isBlockDevice();
        tarArchiveEntry11.setGroupName("\000\000");
        java.util.Date date16 = tarArchiveEntry11.getLastModifiedDate();
        boolean boolean17 = tarArchiveEntry5.equals((java.lang.Object) date16);
        java.util.Date date18 = tarArchiveEntry5.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date18);
        java.lang.String str20 = tarArchiveEntry2.getName();
        org.junit.Assert.assertNotNull(date8);
// flaky "68) test1635(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date16);
// flaky "30) test1635(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "8) test1635(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        boolean boolean9 = tarArchiveEntry2.equals(tarArchiveEntry8);
        boolean boolean10 = tarArchiveEntry8.isSymbolicLink();
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry8.parseTarHeader(byteArray11, zipEncoding12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "69) test1636(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", (byte) 54);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date6 = tarArchiveEntry5.getLastModifiedDate();
        boolean boolean7 = tarArchiveEntry5.isCharacterDevice();
        tarArchiveEntry5.setUserName("hi!");
        boolean boolean10 = tarArchiveEntry5.isSymbolicLink();
        int int11 = tarArchiveEntry5.getDevMajor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        boolean boolean18 = tarArchiveEntry14.isGlobalPaxHeader();
        tarArchiveEntry14.setGroupId((long) (byte) 10);
        boolean boolean21 = tarArchiveEntry14.isBlockDevice();
        tarArchiveEntry14.setUserId(100L);
        boolean boolean24 = tarArchiveEntry14.isFile();
        boolean boolean25 = tarArchiveEntry5.isDescendent(tarArchiveEntry14);
        boolean boolean26 = tarArchiveEntry2.equals(tarArchiveEntry14);
        java.util.Date date27 = tarArchiveEntry2.getLastModifiedDate();
        java.lang.Object obj28 = null;
        boolean boolean29 = tarArchiveEntry2.equals(obj28);
        org.junit.Assert.assertNotNull(date6);
// flaky "70) test1637(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date27);
// flaky "31) test1637(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setGroupId((long) 1);
        boolean boolean7 = tarArchiveEntry3.isStarSparse();
        java.lang.String str8 = tarArchiveEntry3.getLinkName();
        boolean boolean9 = tarArchiveEntry3.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        boolean boolean7 = tarArchiveEntry2.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        java.util.Date date13 = tarArchiveEntry10.getModTime();
        java.util.Date date14 = tarArchiveEntry10.getModTime();
        java.lang.String str15 = tarArchiveEntry10.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean20 = tarArchiveEntry19.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean24 = tarArchiveEntry23.isGlobalPaxHeader();
        java.lang.String str25 = tarArchiveEntry23.getUserName();
        boolean boolean26 = tarArchiveEntry19.isDescendent(tarArchiveEntry23);
        boolean boolean27 = tarArchiveEntry10.isDescendent(tarArchiveEntry23);
        boolean boolean28 = tarArchiveEntry2.equals(tarArchiveEntry10);
        java.lang.String str29 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertNotNull(date3);
// flaky "71) test1639(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "32) test1639(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "9) test1639(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str10 = tarArchiveEntry9.getLinkName();
        java.util.Date date11 = tarArchiveEntry9.getLastModifiedDate();
        long long12 = tarArchiveEntry9.getLongGroupId();
        boolean boolean13 = tarArchiveEntry2.equals(tarArchiveEntry9);
        boolean boolean14 = tarArchiveEntry2.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date18 = tarArchiveEntry17.getLastModifiedDate();
        boolean boolean19 = tarArchiveEntry17.isCharacterDevice();
        tarArchiveEntry17.setUserName("hi!");
        boolean boolean22 = tarArchiveEntry17.isSymbolicLink();
        boolean boolean23 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry17);
        boolean boolean24 = tarArchiveEntry17.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(date11);
// flaky "72) test1640(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "33) test1640(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setSize((long) (byte) 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 75);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 51, (byte) 120 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray7, zipEncoding8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0, (byte) 51, (byte) 120 });
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long13 = tarArchiveEntry12.getSize();
        tarArchiveEntry12.setUserId((int) (byte) 10);
        boolean boolean16 = tarArchiveEntry12.isGlobalPaxHeader();
        tarArchiveEntry12.setGroupId((long) (byte) 10);
        boolean boolean19 = tarArchiveEntry12.isFile();
        boolean boolean20 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry12);
        java.lang.String str21 = tarArchiveEntry12.getName();
        boolean boolean22 = tarArchiveEntry12.isDirectory();
        boolean boolean23 = tarArchiveEntry12.isStarSparse();
        tarArchiveEntry12.setSize((long) (short) 0);
        boolean boolean26 = tarArchiveEntry12.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ustar " + "'", str21, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        boolean boolean12 = tarArchiveEntry10.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "73) test1644(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "34) test1644(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        int int9 = tarArchiveEntry2.getDevMinor();
        long long10 = tarArchiveEntry2.getSize();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        boolean boolean12 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "74) test1645(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 53, (byte) 53 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 53, (byte) 53 });
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 10);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isLink();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setIds((int) (byte) 75, (int) (byte) 83);
        java.lang.String str15 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setUserId((int) '4');
        boolean boolean18 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean19 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupId((-1L));
        java.lang.String str9 = tarArchiveEntry2.getGroupName();
        boolean boolean10 = tarArchiveEntry2.isDirectory();
        boolean boolean11 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str4 = tarArchiveEntry2.getUserName();
        boolean boolean5 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setModTime((long) (byte) 100);
        boolean boolean8 = tarArchiveEntry2.isPaxHeader();
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 1, (byte) 83, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray13, zipEncoding14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 1, (byte) 83, (byte) 100 });
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        tarArchiveEntry2.setGroupId(32L);
        tarArchiveEntry2.setUserId((int) (byte) 76);
        boolean boolean14 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "75) test1651(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "35) test1651(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str10 = tarArchiveEntry2.getLinkName();
        boolean boolean11 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean12 = tarArchiveEntry2.isSparse();
        boolean boolean13 = tarArchiveEntry2.isExtended();
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "76) test1652(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "36) test1652(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean9 = tarArchiveEntry2.isOldGNUSparse();
        long long10 = tarArchiveEntry2.getLongUserId();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 103, false);
        tarArchiveEntry3.setDevMinor(0);
        long long6 = tarArchiveEntry3.getLongUserId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str10 = tarArchiveEntry2.getLinkName();
        boolean boolean11 = tarArchiveEntry2.isCharacterDevice();
        int int12 = tarArchiveEntry2.getGroupId();
        boolean boolean13 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "77) test1655(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "37) test1655(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 75, (byte) 120, (byte) 76 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 75, (byte) 120, (byte) 76 });
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date12 = tarArchiveEntry11.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date12);
        tarArchiveEntry2.setGroupName("0\000");
        int int16 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "78) test1657(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "38) test1657(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000");
        tarArchiveEntry1.setUserId((long) (byte) 53);
        tarArchiveEntry1.setLinkName("");
        tarArchiveEntry1.setLinkName("hi!");
        java.util.Date date8 = tarArchiveEntry1.getModTime();
        byte[] byteArray14 = new byte[] { (byte) 49, (byte) -1, (byte) 0, (byte) 48, (byte) 51 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.parseTarHeader(byteArray14, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date8);
// flaky "79) test1658(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 49, (byte) -1, (byte) 0, (byte) 48, (byte) 51 });
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        boolean boolean3 = tarArchiveEntry1.isFIFO();
        boolean boolean4 = tarArchiveEntry1.isStarSparse();
        long long5 = tarArchiveEntry1.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 50, true);
        boolean boolean10 = tarArchiveEntry1.equals(tarArchiveEntry9);
        boolean boolean11 = tarArchiveEntry1.isFile();
        byte[] byteArray13 = new byte[] { (byte) 83 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.writeEntryHeader(byteArray13, zipEncoding14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky "80) test1659(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 83 });
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        boolean boolean4 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupName("\000\000");
        byte[] byteArray12 = new byte[] { (byte) 53, (byte) 103, (byte) 52, (byte) 49, (byte) 75 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 53, (byte) 103, (byte) 52, (byte) 49, (byte) 75 });
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean7 = tarArchiveEntry2.equals(tarArchiveEntry6);
        tarArchiveEntry6.setName("");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long13 = tarArchiveEntry12.getSize();
        tarArchiveEntry12.setUserId((int) (byte) 10);
        boolean boolean16 = tarArchiveEntry12.isBlockDevice();
        boolean boolean17 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean18 = tarArchiveEntry6.equals(tarArchiveEntry12);
        java.util.Date date19 = tarArchiveEntry12.getModTime();
        int int20 = tarArchiveEntry12.getUserId();
        long long21 = tarArchiveEntry12.getLongGroupId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "81) test1661(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 103, false);
        long long4 = tarArchiveEntry3.getSize();
        boolean boolean5 = tarArchiveEntry3.isCheckSumOK();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse0xData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(35L);
        java.util.Date date14 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean15 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry19.setGroupId((-1));
        java.lang.String str22 = tarArchiveEntry19.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray23 = tarArchiveEntry19.getDirectoryEntries();
        boolean boolean24 = tarArchiveEntry2.isDescendent(tarArchiveEntry19);
        tarArchiveEntry2.setUserName("");
        long long27 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(date14);
// flaky "82) test1663(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ustar\000" + "'", str22, "ustar\000");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray23);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray23, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 10);
        tarArchiveEntry2.setGroupName("");
        boolean boolean5 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setIds(35, (int) (short) 100);
        tarArchiveEntry2.setUserName("././@LongLink");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("ustar\000");
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        boolean boolean10 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean11 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setIds(35, (int) (byte) 53);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 51, (byte) 76 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 51, (byte) 76 });
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setModTime((long) 1);
        int int11 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setSize((long) (byte) 120);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setLinkName("\000\000");
        long long12 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setLinkName("\000\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 504L + "'", long12 == 504L);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setModTime((long) 1);
        boolean boolean11 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setName("hi!");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setName("\000\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean13 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean14 = tarArchiveEntry12.isFile();
        java.util.Date date15 = tarArchiveEntry12.getModTime();
        java.util.Date date16 = tarArchiveEntry12.getModTime();
        tarArchiveEntry12.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean21 = tarArchiveEntry12.isDescendent(tarArchiveEntry20);
        tarArchiveEntry12.setName("");
        java.lang.String str24 = tarArchiveEntry12.getUserName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean28 = tarArchiveEntry27.isGlobalPaxHeader();
        boolean boolean29 = tarArchiveEntry27.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry32 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", true);
        boolean boolean33 = tarArchiveEntry27.equals(tarArchiveEntry32);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry36 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date37 = tarArchiveEntry36.getLastModifiedDate();
        boolean boolean38 = tarArchiveEntry36.isCharacterDevice();
        tarArchiveEntry36.setUserName("hi!");
        boolean boolean41 = tarArchiveEntry36.isStarSparse();
        boolean boolean42 = tarArchiveEntry36.isGNULongLinkEntry();
        boolean boolean43 = tarArchiveEntry36.isFile();
        boolean boolean44 = tarArchiveEntry27.isDescendent(tarArchiveEntry36);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray45 = tarArchiveEntry36.getDirectoryEntries();
        boolean boolean46 = tarArchiveEntry36.isCharacterDevice();
        boolean boolean47 = tarArchiveEntry12.isDescendent(tarArchiveEntry36);
        boolean boolean48 = tarArchiveEntry2.equals((java.lang.Object) boolean47);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(date15);
// flaky "83) test1670(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "39) test1670(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date37);
// flaky "10) test1670(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date37.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray45);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray45, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 53, true);
        boolean boolean4 = tarArchiveEntry3.isSymbolicLink();
        tarArchiveEntry3.setGroupName(" \000");
        boolean boolean7 = tarArchiveEntry3.isFile();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setModTime((long) (byte) 54);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        int int8 = tarArchiveEntry2.getDevMajor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long12 = tarArchiveEntry11.getSize();
        tarArchiveEntry11.setUserId((int) (byte) 10);
        boolean boolean15 = tarArchiveEntry11.isGlobalPaxHeader();
        tarArchiveEntry11.setGroupId((long) (byte) 10);
        boolean boolean18 = tarArchiveEntry11.isBlockDevice();
        tarArchiveEntry11.setUserId(100L);
        boolean boolean21 = tarArchiveEntry11.isFile();
        boolean boolean22 = tarArchiveEntry2.isDescendent(tarArchiveEntry11);
        java.lang.String str23 = tarArchiveEntry11.getGroupName();
        org.junit.Assert.assertNotNull(date3);
// flaky "84) test1673(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isFIFO();
        boolean boolean5 = tarArchiveEntry3.isFile();
        boolean boolean6 = tarArchiveEntry3.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean7 = tarArchiveEntry2.equals(tarArchiveEntry6);
        tarArchiveEntry6.setName("");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long13 = tarArchiveEntry12.getSize();
        tarArchiveEntry12.setUserId((int) (byte) 10);
        boolean boolean16 = tarArchiveEntry12.isBlockDevice();
        boolean boolean17 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean18 = tarArchiveEntry6.equals(tarArchiveEntry12);
        int int19 = tarArchiveEntry6.getDevMajor();
        boolean boolean20 = tarArchiveEntry6.isExtended();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isSparse();
        boolean boolean8 = tarArchiveEntry3.isPaxHeader();
        boolean boolean9 = tarArchiveEntry3.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry3.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", true);
        boolean boolean8 = tarArchiveEntry2.equals(tarArchiveEntry7);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date12 = tarArchiveEntry11.getLastModifiedDate();
        boolean boolean13 = tarArchiveEntry11.isCharacterDevice();
        tarArchiveEntry11.setUserName("hi!");
        boolean boolean16 = tarArchiveEntry11.isStarSparse();
        boolean boolean17 = tarArchiveEntry11.isGNULongLinkEntry();
        boolean boolean18 = tarArchiveEntry11.isFile();
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry11);
        tarArchiveEntry2.setUserId(10240);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "85) test1677(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        int int11 = tarArchiveEntry2.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        boolean boolean18 = tarArchiveEntry14.isGlobalPaxHeader();
        java.lang.String str19 = tarArchiveEntry14.getUserName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean23 = tarArchiveEntry22.isGlobalPaxHeader();
        boolean boolean24 = tarArchiveEntry22.isFile();
        java.util.Date date25 = tarArchiveEntry22.getModTime();
        java.util.Date date26 = tarArchiveEntry22.getModTime();
        int int27 = tarArchiveEntry22.getMode();
        tarArchiveEntry22.setNames("00", "");
        boolean boolean31 = tarArchiveEntry14.equals(tarArchiveEntry22);
        boolean boolean32 = tarArchiveEntry2.isDescendent(tarArchiveEntry22);
        tarArchiveEntry2.setName(" \000");
        tarArchiveEntry2.setLinkName(" \000");
        byte[] byteArray42 = new byte[] { (byte) 52, (byte) 51, (byte) 120, (byte) 0, (byte) 51 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray42, zipEncoding43, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "86) test1678(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(date25);
// flaky "40) test1678(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date26);
// flaky "11) test1678(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 33188 + "'", int27 == 33188);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 52, (byte) 51, (byte) 120, (byte) 0, (byte) 51 });
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 48, false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean13 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean14 = tarArchiveEntry12.isFile();
        boolean boolean15 = tarArchiveEntry12.isPaxGNUSparse();
        boolean boolean16 = tarArchiveEntry12.isFile();
        boolean boolean17 = tarArchiveEntry12.isFile();
        java.util.Date date18 = tarArchiveEntry12.getLastModifiedDate();
        int int19 = tarArchiveEntry12.getDevMinor();
        long long20 = tarArchiveEntry12.getSize();
        int int21 = tarArchiveEntry12.getDevMajor();
        tarArchiveEntry12.setGroupId(1L);
        boolean boolean24 = tarArchiveEntry2.equals((java.lang.Object) 1L);
        byte[] byteArray28 = new byte[] { (byte) 88, (byte) -1, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray28, zipEncoding29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "87) test1680(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "41) test1680(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date18);
// flaky "12) test1680(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 88, (byte) -1, (byte) 10 });
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongGroupId();
        int int9 = tarArchiveEntry2.getMode();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean13 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean14 = tarArchiveEntry12.isFile();
        java.lang.String str15 = tarArchiveEntry12.getName();
        tarArchiveEntry12.setLinkName("00");
        long long18 = tarArchiveEntry12.getLongUserId();
        tarArchiveEntry12.setDevMajor(155);
        int int21 = tarArchiveEntry12.getMode();
        java.util.Date date22 = tarArchiveEntry12.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date22);
        tarArchiveEntry2.setModTime((long) (short) 100);
        long long26 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ustar " + "'", str15, "ustar ");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
        org.junit.Assert.assertNotNull(date22);
// flaky "88) test1681(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getName();
        java.lang.String str7 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar " + "'", str6, "ustar ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        boolean boolean7 = tarArchiveEntry2.isGNUSparse();
        long long8 = tarArchiveEntry2.getLongGroupId();
        int int9 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertNotNull(date3);
// flaky "89) test1683(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4L + "'", long8 == 4L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setMode((-1));
        boolean boolean15 = tarArchiveEntry2.isStarSparse();
        long long16 = tarArchiveEntry2.getLongUserId();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setDevMajor((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Major device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "90) test1684(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setModTime(0L);
        boolean boolean13 = tarArchiveEntry2.isStarSparse();
        int int14 = tarArchiveEntry2.getDevMajor();
        tarArchiveEntry2.setIds(32, (int) (byte) 55);
        long long18 = tarArchiveEntry2.getSize();
        boolean boolean19 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean20 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setGroupId((long) 1);
        long long7 = tarArchiveEntry3.getRealSize();
        long long8 = tarArchiveEntry3.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry11.setMode((int) '#');
        java.util.Date date14 = tarArchiveEntry11.getModTime();
        int int15 = tarArchiveEntry11.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long19 = tarArchiveEntry18.getSize();
        tarArchiveEntry18.setUserId((int) (byte) 10);
        long long22 = tarArchiveEntry18.getLongUserId();
        int int23 = tarArchiveEntry18.getMode();
        java.util.Date date24 = tarArchiveEntry18.getLastModifiedDate();
        tarArchiveEntry11.setModTime(date24);
        tarArchiveEntry3.setModTime(date24);
        long long27 = tarArchiveEntry3.getSize();
        tarArchiveEntry3.setMode(10);
        java.io.File file30 = tarArchiveEntry3.getFile();
        tarArchiveEntry3.setUserId(131);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(date14);
// flaky "91) test1686(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 33188 + "'", int23 == 33188);
        org.junit.Assert.assertNotNull(date24);
// flaky "42) test1686(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(file30);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000");
        tarArchiveEntry1.setUserId((long) (byte) 53);
        tarArchiveEntry1.setDevMajor((int) (short) 0);
        tarArchiveEntry1.setLinkName("\000\000");
        tarArchiveEntry1.setGroupId(0L);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        int int9 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setLinkName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "92) test1689(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId((int) (byte) 48);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        boolean boolean17 = tarArchiveEntry14.isDirectory();
        tarArchiveEntry14.setSize((long) 504);
        boolean boolean20 = tarArchiveEntry14.isSparse();
        boolean boolean21 = tarArchiveEntry14.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long25 = tarArchiveEntry24.getSize();
        tarArchiveEntry24.setUserId((int) (byte) 10);
        boolean boolean28 = tarArchiveEntry24.isGlobalPaxHeader();
        tarArchiveEntry24.setGroupId((long) (byte) 10);
        long long31 = tarArchiveEntry24.getLongUserId();
        tarArchiveEntry24.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date35 = tarArchiveEntry24.getModTime();
        tarArchiveEntry14.setModTime(date35);
        boolean boolean37 = tarArchiveEntry14.isSymbolicLink();
        boolean boolean38 = tarArchiveEntry2.isDescendent(tarArchiveEntry14);
        boolean boolean39 = tarArchiveEntry14.isPaxHeader();
        boolean boolean40 = tarArchiveEntry14.isGlobalPaxHeader();
        java.lang.Class<?> wildcardClass41 = tarArchiveEntry14.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(date35);
// flaky "93) test1690(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date35.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 0, false);
        int int4 = tarArchiveEntry3.getUserId();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse1xData(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setNames("0\000", "");
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setUserName("\000\000");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setName("tar\000");
        int int15 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setUserName(" \000");
        byte[] byteArray23 = new byte[] { (byte) 51, (byte) -1, (byte) 75, (byte) 10, (byte) 53 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 51, (byte) -1, (byte) 75, (byte) 10, (byte) 53 });
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        boolean boolean13 = tarArchiveEntry10.isDirectory();
        tarArchiveEntry10.setSize((long) 504);
        long long16 = tarArchiveEntry10.getSize();
        boolean boolean17 = tarArchiveEntry10.isLink();
        boolean boolean18 = tarArchiveEntry10.isBlockDevice();
        boolean boolean19 = tarArchiveEntry10.isPaxHeader();
        tarArchiveEntry10.setDevMajor((int) (short) 1);
        boolean boolean22 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry10);
        boolean boolean23 = tarArchiveEntry10.isOldGNUSparse();
        tarArchiveEntry10.setLinkName("\000\000");
        boolean boolean26 = tarArchiveEntry10.isGlobalPaxHeader();
        tarArchiveEntry10.setUserId((long) (byte) 120);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 504L + "'", long16 == 504L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isPaxGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setDevMajor(12);
        boolean boolean8 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        long long12 = tarArchiveEntry2.getRealSize();
        boolean boolean13 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "94) test1696(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "43) test1696(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean12 = tarArchiveEntry11.isGlobalPaxHeader();
        boolean boolean13 = tarArchiveEntry11.isFile();
        java.util.Date date14 = tarArchiveEntry11.getModTime();
        java.util.Date date15 = tarArchiveEntry11.getModTime();
        int int16 = tarArchiveEntry11.getMode();
        boolean boolean17 = tarArchiveEntry2.equals(tarArchiveEntry11);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.fillGNUSparse1xData(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
// flaky "95) test1697(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "44) test1697(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        boolean boolean12 = tarArchiveEntry10.isOldGNUSparse();
        boolean boolean13 = tarArchiveEntry10.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long17 = tarArchiveEntry16.getSize();
        tarArchiveEntry16.setUserId((int) (byte) 10);
        boolean boolean20 = tarArchiveEntry16.isGlobalPaxHeader();
        tarArchiveEntry16.setGroupId((long) (byte) 10);
        long long23 = tarArchiveEntry16.getLongUserId();
        tarArchiveEntry16.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date27 = tarArchiveEntry16.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry30 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean31 = tarArchiveEntry30.isGlobalPaxHeader();
        boolean boolean32 = tarArchiveEntry30.isFile();
        java.lang.String str33 = tarArchiveEntry30.getName();
        tarArchiveEntry30.setLinkName("00");
        long long36 = tarArchiveEntry30.getLongGroupId();
        int int37 = tarArchiveEntry30.getMode();
        boolean boolean38 = tarArchiveEntry16.equals(tarArchiveEntry30);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry41 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long42 = tarArchiveEntry41.getSize();
        tarArchiveEntry41.setUserId((int) (byte) 10);
        boolean boolean45 = tarArchiveEntry41.isGlobalPaxHeader();
        boolean boolean46 = tarArchiveEntry41.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry49 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry49.setLinkName("tar\000");
        boolean boolean52 = tarArchiveEntry49.isDirectory();
        java.util.Date date53 = tarArchiveEntry49.getLastModifiedDate();
        java.util.Date date54 = tarArchiveEntry49.getModTime();
        tarArchiveEntry41.setModTime(date54);
        tarArchiveEntry16.setModTime(date54);
        tarArchiveEntry10.setModTime(date54);
        boolean boolean58 = tarArchiveEntry10.isDirectory();
        byte[] byteArray61 = new byte[] { (byte) 54, (byte) 0 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding62 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.parseTarHeader(byteArray61, zipEncoding62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "96) test1698(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "45) test1698(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(date27);
// flaky "13) test1698(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ustar " + "'", str33, "ustar ");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 33188 + "'", int37 == 33188);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(date53);
// flaky "6) test1698(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date53.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date54);
// flaky "2) test1698(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date54.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 54, (byte) 0 });
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean12 = tarArchiveEntry11.isGlobalPaxHeader();
        boolean boolean13 = tarArchiveEntry11.isFile();
        java.util.Date date14 = tarArchiveEntry11.getModTime();
        java.util.Date date15 = tarArchiveEntry11.getModTime();
        int int16 = tarArchiveEntry11.getMode();
        boolean boolean17 = tarArchiveEntry2.equals(tarArchiveEntry11);
        boolean boolean18 = tarArchiveEntry11.isBlockDevice();
        boolean boolean19 = tarArchiveEntry11.isPaxGNUSparse();
        java.lang.String str20 = tarArchiveEntry11.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        tarArchiveEntry23.setGroupId((long) 131);
        java.util.Date date26 = tarArchiveEntry23.getLastModifiedDate();
        long long27 = tarArchiveEntry23.getRealSize();
        boolean boolean28 = tarArchiveEntry11.equals(tarArchiveEntry23);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.fillStarSparseData(strMap29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
// flaky "97) test1699(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "46) test1699(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(date26);
// flaky "14) test1699(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        long long10 = tarArchiveEntry2.getSize();
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setGroupName("");
        boolean boolean14 = tarArchiveEntry2.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long18 = tarArchiveEntry17.getSize();
        tarArchiveEntry17.setUserId((int) (byte) 10);
        boolean boolean21 = tarArchiveEntry17.isGlobalPaxHeader();
        tarArchiveEntry17.setGroupId((long) (byte) 10);
        boolean boolean24 = tarArchiveEntry17.isBlockDevice();
        tarArchiveEntry17.setUserId(100L);
        boolean boolean27 = tarArchiveEntry17.isSymbolicLink();
        boolean boolean28 = tarArchiveEntry17.isCheckSumOK();
        boolean boolean29 = tarArchiveEntry2.equals(tarArchiveEntry17);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry32 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean33 = tarArchiveEntry32.isGlobalPaxHeader();
        boolean boolean34 = tarArchiveEntry32.isFile();
        tarArchiveEntry32.setIds((int) (short) 1, 155);
        int int38 = tarArchiveEntry32.getMode();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray39 = tarArchiveEntry32.getDirectoryEntries();
        tarArchiveEntry32.setUserId(10240);
        boolean boolean42 = tarArchiveEntry17.equals(tarArchiveEntry32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 33188 + "'", int38 == 33188);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray39);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray39, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        int int13 = tarArchiveEntry2.getUserId();
        tarArchiveEntry2.setLinkName("");
        boolean boolean16 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setIds((int) (byte) 83, 10);
        java.lang.String str20 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "98) test1701(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ustar " + "'", str20, "ustar ");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 54);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean6 = tarArchiveEntry5.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry5.isFile();
        java.util.Date date8 = tarArchiveEntry5.getModTime();
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        int int10 = tarArchiveEntry5.getMode();
        tarArchiveEntry5.setNames("00", "");
        java.util.Date date14 = tarArchiveEntry5.getModTime();
        tarArchiveEntry2.setModTime(date14);
        tarArchiveEntry2.setDevMajor((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "99) test1702(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "47) test1702(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33188 + "'", int10 == 33188);
        org.junit.Assert.assertNotNull(date14);
// flaky "15) test1702(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:30 ICT 2026");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry5.setUserName("");
        java.util.Date date8 = tarArchiveEntry5.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long12 = tarArchiveEntry11.getSize();
        boolean boolean13 = tarArchiveEntry11.isBlockDevice();
        tarArchiveEntry11.setGroupName("\000\000");
        java.util.Date date16 = tarArchiveEntry11.getLastModifiedDate();
        boolean boolean17 = tarArchiveEntry5.equals((java.lang.Object) date16);
        java.util.Date date18 = tarArchiveEntry5.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date18);
        boolean boolean20 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertNotNull(date8);
// flaky "100) test1703(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date16);
// flaky "48) test1703(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "16) test1703(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:30 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        int int11 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setNames("ustar\000", "\000\000");
        boolean boolean15 = tarArchiveEntry2.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = tarArchiveEntry2.equals(tarArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "101) test1704(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "49) test1704(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        java.lang.String str10 = tarArchiveEntry2.getName();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setModTime((long) 148);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        int int10 = tarArchiveEntry2.getUserId();
        int int11 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33188 + "'", int11 == 33188);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        byte[] byteArray6 = new byte[] { (byte) 52, (byte) 83, (byte) 53, (byte) 51, (byte) 100, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 52, (byte) 83, (byte) 53, (byte) 51, (byte) 100, (byte) 120 });
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        long long10 = tarArchiveEntry2.getSize();
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        boolean boolean12 = tarArchiveEntry2.isSparse();
        byte[] byteArray17 = new byte[] { (byte) 76, (byte) 100, (byte) 50, (byte) 75 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray17, zipEncoding18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(date11);
// flaky "102) test1708(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 76, (byte) 100, (byte) 50, (byte) 75 });
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setUserName("");
        java.util.Date date5 = tarArchiveEntry2.getLastModifiedDate();
        java.lang.String str6 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setName("");
        org.junit.Assert.assertNotNull(date5);
// flaky "103) test1709(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean2 = tarArchiveEntry1.isGNUSparse();
        boolean boolean3 = tarArchiveEntry1.isGlobalPaxHeader();
        int int4 = tarArchiveEntry1.getMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33188 + "'", int4 == 33188);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "104) test1711(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setGroupName("0\000");
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertNotNull(date3);
// flaky "105) test1712(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        java.lang.String str9 = tarArchiveEntry7.getUserName();
        boolean boolean10 = tarArchiveEntry3.isDescendent(tarArchiveEntry7);
        tarArchiveEntry3.setDevMajor(12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("0\000");
        tarArchiveEntry2.setUserId((int) 'a');
        long long14 = tarArchiveEntry2.getLongUserId();
        boolean boolean15 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isPaxGNUSparse();
        java.io.File file17 = tarArchiveEntry13.getFile();
        boolean boolean18 = tarArchiveEntry13.isPaxGNUSparse();
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry13);
        tarArchiveEntry13.setGroupName("ustar\000");
        tarArchiveEntry13.setSize((long) 155);
        tarArchiveEntry13.setUserId(31);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry28 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long29 = tarArchiveEntry28.getSize();
        tarArchiveEntry28.setUserId((int) (byte) 10);
        boolean boolean32 = tarArchiveEntry28.isGlobalPaxHeader();
        boolean boolean33 = tarArchiveEntry28.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry36 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry36.setLinkName("tar\000");
        boolean boolean39 = tarArchiveEntry36.isDirectory();
        java.util.Date date40 = tarArchiveEntry36.getLastModifiedDate();
        java.util.Date date41 = tarArchiveEntry36.getModTime();
        tarArchiveEntry28.setModTime(date41);
        java.util.Date date43 = tarArchiveEntry28.getLastModifiedDate();
        tarArchiveEntry13.setModTime(date43);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "106) test1715(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "50) test1715(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(date40);
// flaky "17) test1715(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date41);
// flaky "7) test1715(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date43);
// flaky "3) test1715(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date43.toString(), "Mon Sep 28 13:40:31 ICT 2026");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        byte[] byteArray3 = new byte[] { (byte) 48, (byte) 52, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 48, (byte) 52, (byte) 103 });
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 76, false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        long long10 = tarArchiveEntry2.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray11 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean12 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setMode((int) (byte) 75);
        tarArchiveEntry2.setModTime((long) 10240);
        tarArchiveEntry2.setDevMajor((int) (byte) 49);
        long long19 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray11);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray11, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        long long3 = tarArchiveEntry2.getRealSize();
        java.lang.String str4 = tarArchiveEntry2.getLinkName();
        java.lang.String str5 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setLinkName(" \000");
        boolean boolean8 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", true);
        tarArchiveEntry2.setGroupId((int) 'a');
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setDevMinor(257);
        tarArchiveEntry2.setName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        java.util.Date date18 = tarArchiveEntry14.getModTime();
        tarArchiveEntry14.setUserId((long) '#');
        boolean boolean21 = tarArchiveEntry14.isCheckSumOK();
        long long22 = tarArchiveEntry14.getLongUserId();
        boolean boolean23 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry14);
        int int24 = tarArchiveEntry14.getDevMinor();
        java.io.File file25 = tarArchiveEntry14.getFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "107) test1721(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "51) test1721(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(file25);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date12 = tarArchiveEntry11.getLastModifiedDate();
        boolean boolean13 = tarArchiveEntry11.isCharacterDevice();
        tarArchiveEntry11.setUserName("hi!");
        tarArchiveEntry11.setDevMinor(257);
        boolean boolean18 = tarArchiveEntry2.equals(tarArchiveEntry11);
        tarArchiveEntry2.setUserName("././@LongLink");
        int int21 = tarArchiveEntry2.getMode();
        java.lang.String str22 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "108) test1722(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "././@LongLink" + "'", str22, "././@LongLink");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 50, true);
        java.util.Date date4 = tarArchiveEntry3.getModTime();
        boolean boolean5 = tarArchiveEntry3.isStarSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray6 = tarArchiveEntry3.getDirectoryEntries();
        org.junit.Assert.assertNotNull(date4);
// flaky "109) test1723(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray6);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray6, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        long long5 = tarArchiveEntry3.getRealSize();
        tarArchiveEntry3.setMode((int) (byte) 51);
        boolean boolean8 = tarArchiveEntry3.isFile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry12.setMode((int) '#');
        boolean boolean15 = tarArchiveEntry2.equals(tarArchiveEntry12);
        boolean boolean16 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setGroupId(8);
        byte[] byteArray19 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray19, zipEncoding20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        java.lang.String str10 = tarArchiveEntry2.getName();
        java.lang.String str11 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setNames(" \000", "tar\000");
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 52, (byte) 10, (byte) -1, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ustar " + "'", str11, "ustar ");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 52, (byte) 10, (byte) -1, (byte) 120 });
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.lang.String str12 = tarArchiveEntry2.getLinkName();
        boolean boolean13 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray14 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setDevMajor((int) '4');
        java.lang.String str17 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setIds((int) (short) 10, (-1));
        tarArchiveEntry2.setGroupId(4);
        byte[] byteArray24 = new byte[] { (byte) 55 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray14);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray14, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 55 });
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setNames(" \000", " \000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean20 = tarArchiveEntry15.equals(tarArchiveEntry19);
        tarArchiveEntry19.setName("");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long26 = tarArchiveEntry25.getSize();
        tarArchiveEntry25.setUserId((int) (byte) 10);
        boolean boolean29 = tarArchiveEntry25.isBlockDevice();
        boolean boolean30 = tarArchiveEntry25.isGlobalPaxHeader();
        boolean boolean31 = tarArchiveEntry19.equals(tarArchiveEntry25);
        boolean boolean32 = tarArchiveEntry25.isBlockDevice();
        boolean boolean33 = tarArchiveEntry2.isDescendent(tarArchiveEntry25);
        tarArchiveEntry2.setMode(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "110) test1728(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "52) test1728(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        java.lang.String str2 = tarArchiveEntry1.getLinkName();
        tarArchiveEntry1.setIds(0, (int) (byte) 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setNames("00", "");
        tarArchiveEntry2.setGroupId(0);
        long long13 = tarArchiveEntry2.getRealSize();
        tarArchiveEntry2.setSize((long) 53);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "111) test1730(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "53) test1730(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000");
        tarArchiveEntry1.setDevMajor((int) (byte) 48);
        long long4 = tarArchiveEntry1.getLongUserId();
        java.lang.String str5 = tarArchiveEntry1.getUserName();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isGNULongLinkEntry();
        long long8 = tarArchiveEntry3.getSize();
        tarArchiveEntry3.setUserName("00");
        boolean boolean11 = tarArchiveEntry3.isFile();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setDevMinor(257);
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setModTime((long) (byte) 53);
        tarArchiveEntry2.setLinkName("");
        org.junit.Assert.assertNotNull(date3);
// flaky "112) test1733(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isSparse();
        boolean boolean8 = tarArchiveEntry3.isPaxHeader();
        long long9 = tarArchiveEntry3.getRealSize();
        boolean boolean10 = tarArchiveEntry3.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        int int7 = tarArchiveEntry2.getDevMajor();
        tarArchiveEntry2.setIds((int) (byte) 48, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        tarArchiveEntry2.setGroupId((long) (byte) 100);
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "113) test1736(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "54) test1736(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        boolean boolean2 = tarArchiveEntry1.isFile();
        tarArchiveEntry1.setModTime((-1L));
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        boolean boolean9 = tarArchiveEntry7.isFile();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        java.util.Date date11 = tarArchiveEntry7.getModTime();
        tarArchiveEntry7.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean16 = tarArchiveEntry7.isDescendent(tarArchiveEntry15);
        tarArchiveEntry15.setUserId((int) '#');
        boolean boolean19 = tarArchiveEntry15.isExtended();
        boolean boolean20 = tarArchiveEntry1.equals(tarArchiveEntry15);
        boolean boolean21 = tarArchiveEntry15.isExtended();
        int int22 = tarArchiveEntry15.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "114) test1737(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "55) test1737(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean8 = tarArchiveEntry2.isBlockDevice();
        byte[] byteArray11 = new byte[] { (byte) 83, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray11, zipEncoding12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "115) test1738(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 83, (byte) 100 });
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setModTime((long) 8);
        tarArchiveEntry2.setSize((long) 2);
        boolean boolean14 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertNotNull(date9);
// flaky "116) test1739(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setIds((int) (byte) 48, (int) (short) 10);
        boolean boolean13 = tarArchiveEntry2.isFIFO();
        boolean boolean14 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        tarArchiveEntry2.setIds(131, (int) (byte) 120);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry17.setUserName("");
        java.util.Date date20 = tarArchiveEntry17.getLastModifiedDate();
        boolean boolean21 = tarArchiveEntry17.isStarSparse();
        boolean boolean22 = tarArchiveEntry2.equals(tarArchiveEntry17);
        boolean boolean23 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "117) test1741(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "56) test1741(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(date20);
// flaky "18) test1741(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isFile();
        tarArchiveEntry3.setNames("00", "0\000");
        boolean boolean8 = tarArchiveEntry3.isGNULongLinkEntry();
        tarArchiveEntry3.setIds((int) (byte) 53, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setName("././@LongLink");
        tarArchiveEntry3.setLinkName("\000\000");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse1xData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(35L);
        int int14 = tarArchiveEntry2.getDevMajor();
        boolean boolean15 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        tarArchiveEntry2.setUserName("tar\000");
        tarArchiveEntry2.setMode(0);
        tarArchiveEntry2.setGroupName("././@LongLink");
        java.lang.String str12 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "././@LongLink" + "'", str12, "././@LongLink");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isOldGNUSparse();
        boolean boolean6 = tarArchiveEntry3.isBlockDevice();
        java.lang.String str7 = tarArchiveEntry3.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str4 = tarArchiveEntry2.getUserName();
        boolean boolean5 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long9 = tarArchiveEntry8.getSize();
        tarArchiveEntry8.setUserId((int) (byte) 10);
        boolean boolean12 = tarArchiveEntry8.isGlobalPaxHeader();
        tarArchiveEntry8.setGroupId((long) (byte) 10);
        boolean boolean15 = tarArchiveEntry8.isBlockDevice();
        tarArchiveEntry8.setUserId(100L);
        java.util.Date date18 = tarArchiveEntry8.getModTime();
        int int19 = tarArchiveEntry8.getUserId();
        boolean boolean20 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        java.lang.String str21 = tarArchiveEntry2.getLinkName();
        java.lang.String str22 = tarArchiveEntry2.getName();
        long long23 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setUserId((int) (byte) 50);
        boolean boolean26 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "118) test1747(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ustar " + "'", str22, "ustar ");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        java.lang.String str10 = tarArchiveEntry2.getName();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setGroupId((int) '#');
        tarArchiveEntry2.setLinkName("");
        java.lang.String str16 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        byte[] byteArray15 = new byte[] { (byte) 75, (byte) 54, (byte) 120, (byte) 75, (byte) 55, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray15, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "119) test1749(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 75, (byte) 54, (byte) 120, (byte) 75, (byte) 55, (byte) 50 });
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str10 = tarArchiveEntry2.getLinkName();
        boolean boolean11 = tarArchiveEntry2.isCharacterDevice();
        int int12 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setDevMinor((int) (short) 0);
        java.lang.String str15 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "120) test1750(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "57) test1750(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setGroupId((int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        int int7 = tarArchiveEntry2.getMode();
        int int8 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setModTime((long) (byte) 88);
        tarArchiveEntry2.setUserId((long) 96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "121) test1752(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        boolean boolean3 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setName("ustar\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        int int11 = tarArchiveEntry2.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        boolean boolean18 = tarArchiveEntry14.isGlobalPaxHeader();
        java.lang.String str19 = tarArchiveEntry14.getUserName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean23 = tarArchiveEntry22.isGlobalPaxHeader();
        boolean boolean24 = tarArchiveEntry22.isFile();
        java.util.Date date25 = tarArchiveEntry22.getModTime();
        java.util.Date date26 = tarArchiveEntry22.getModTime();
        int int27 = tarArchiveEntry22.getMode();
        tarArchiveEntry22.setNames("00", "");
        boolean boolean31 = tarArchiveEntry14.equals(tarArchiveEntry22);
        boolean boolean32 = tarArchiveEntry2.isDescendent(tarArchiveEntry22);
        tarArchiveEntry2.setNames("0\000", " \000");
        org.junit.Assert.assertNotNull(date3);
// flaky "122) test1754(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(date25);
// flaky "58) test1754(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date26);
// flaky "19) test1754(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 33188 + "'", int27 == 33188);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        tarArchiveEntry3.setNames("", "ustar ");
        byte[] byteArray14 = new byte[] { (byte) 50, (byte) 48, (byte) 52, (byte) 52 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray14, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 50, (byte) 48, (byte) 52, (byte) 52 });
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        int int10 = tarArchiveEntry2.getDevMinor();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean13 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setMode(10240);
        long long16 = tarArchiveEntry2.getLongGroupId();
        boolean boolean17 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 120, false);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGlobalPaxHeader();
        tarArchiveEntry3.setUserId((long) 96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        int int10 = tarArchiveEntry2.getUserId();
        java.lang.String str11 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isPaxGNUSparse();
        java.io.File file17 = tarArchiveEntry13.getFile();
        boolean boolean18 = tarArchiveEntry13.isPaxGNUSparse();
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry13);
        long long20 = tarArchiveEntry13.getRealSize();
        int int21 = tarArchiveEntry13.getUserId();
        long long22 = tarArchiveEntry13.getRealSize();
        boolean boolean23 = tarArchiveEntry13.isPaxGNUSparse();
        tarArchiveEntry13.setGroupId((long) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "123) test1759(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "59) test1759(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean8 = tarArchiveEntry2.isDirectory();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "124) test1760(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        java.lang.String str9 = tarArchiveEntry7.getUserName();
        boolean boolean10 = tarArchiveEntry3.isDescendent(tarArchiveEntry7);
        int int11 = tarArchiveEntry7.getGroupId();
        boolean boolean12 = tarArchiveEntry7.isFIFO();
        java.lang.Class<?> wildcardClass13 = tarArchiveEntry7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        boolean boolean13 = tarArchiveEntry10.isDirectory();
        tarArchiveEntry10.setSize((long) 504);
        long long16 = tarArchiveEntry10.getSize();
        boolean boolean17 = tarArchiveEntry10.isLink();
        boolean boolean18 = tarArchiveEntry10.isBlockDevice();
        boolean boolean19 = tarArchiveEntry10.isPaxHeader();
        tarArchiveEntry10.setDevMajor((int) (short) 1);
        boolean boolean22 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry10);
        boolean boolean23 = tarArchiveEntry10.isOldGNUSparse();
        tarArchiveEntry10.setLinkName("\000\000");
        boolean boolean26 = tarArchiveEntry10.isGlobalPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long30 = tarArchiveEntry29.getSize();
        tarArchiveEntry29.setUserId((int) (byte) 10);
        boolean boolean33 = tarArchiveEntry29.isGlobalPaxHeader();
        tarArchiveEntry29.setGroupId((long) (byte) 10);
        long long36 = tarArchiveEntry29.getLongUserId();
        tarArchiveEntry29.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date40 = tarArchiveEntry29.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray41 = tarArchiveEntry29.getDirectoryEntries();
        boolean boolean42 = tarArchiveEntry10.equals((java.lang.Object) tarArchiveEntryArray41);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 504L + "'", long16 == 504L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(date40);
// flaky "125) test1762(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray41);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray41, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        boolean boolean12 = tarArchiveEntry10.isOldGNUSparse();
        long long13 = tarArchiveEntry10.getLongGroupId();
        tarArchiveEntry10.setGroupName("././@LongLink");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "126) test1763(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "60) test1763(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setUserId(0L);
        boolean boolean7 = tarArchiveEntry3.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        java.util.Date date13 = tarArchiveEntry10.getModTime();
        java.util.Date date14 = tarArchiveEntry10.getModTime();
        boolean boolean15 = tarArchiveEntry10.isOldGNUSparse();
        boolean boolean16 = tarArchiveEntry10.isGNULongNameEntry();
        tarArchiveEntry10.setGroupName("");
        boolean boolean19 = tarArchiveEntry3.equals(tarArchiveEntry10);
        int int20 = tarArchiveEntry10.getUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray21 = tarArchiveEntry10.getDirectoryEntries();
        tarArchiveEntry10.setUserId((long) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "127) test1764(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "61) test1764(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray21);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray21, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 120);
        java.lang.String str3 = tarArchiveEntry2.getGroupName();
        byte[] byteArray7 = new byte[] { (byte) 50, (byte) 54, (byte) 48 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray7, zipEncoding8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 50, (byte) 54, (byte) 48 });
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isLink();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str13 = tarArchiveEntry2.getUserName();
        byte[] byteArray16 = new byte[] { (byte) 120, (byte) 83 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 120, (byte) 83 });
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        java.io.File file6 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setUserId((int) (byte) 53);
        tarArchiveEntry2.setLinkName("00");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "128) test1767(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date15 = tarArchiveEntry14.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date15);
        tarArchiveEntry2.setGroupId((long) (byte) 1);
        int int19 = tarArchiveEntry2.getGroupId();
        byte[] byteArray26 = new byte[] { (byte) 51, (byte) 52, (byte) -1, (byte) 49, (byte) 52, (byte) 76 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "129) test1768(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(date11);
// flaky "62) test1768(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "20) test1768(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 117, (byte) 115, (byte) 116, (byte) 97, (byte) 114, (byte) 32 });
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        int int12 = tarArchiveEntry8.getDevMinor();
        tarArchiveEntry8.setDevMinor((int) (byte) 50);
        long long15 = tarArchiveEntry8.getSize();
        org.junit.Assert.assertNotNull(date3);
// flaky "130) test1769(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "63) test1769(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setNames("0\000", "");
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupId(31);
        long long12 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(35L);
        int int14 = tarArchiveEntry2.getDevMajor();
        tarArchiveEntry2.setGroupId((long) (byte) 0);
        boolean boolean17 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean18 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("0\000");
        java.lang.String str12 = tarArchiveEntry2.getName();
        boolean boolean13 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ustar " + "'", str12, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date12 = tarArchiveEntry11.getLastModifiedDate();
        boolean boolean13 = tarArchiveEntry11.isCharacterDevice();
        tarArchiveEntry11.setUserName("hi!");
        tarArchiveEntry11.setDevMinor(257);
        boolean boolean18 = tarArchiveEntry2.equals(tarArchiveEntry11);
        tarArchiveEntry2.setUserName("././@LongLink");
        int int21 = tarArchiveEntry2.getMode();
        int int22 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "131) test1773(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        byte[] byteArray1 = new byte[] { (byte) 55 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 55 });
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.io.File file11 = tarArchiveEntry2.getFile();
        boolean boolean12 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        java.io.File file8 = tarArchiveEntry2.getFile();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        boolean boolean10 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setNames("00", "hi!");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long11 = tarArchiveEntry10.getSize();
        tarArchiveEntry10.setUserId((int) (byte) 10);
        boolean boolean14 = tarArchiveEntry10.isGlobalPaxHeader();
        tarArchiveEntry10.setGroupId((long) 504);
        boolean boolean17 = tarArchiveEntry10.isPaxHeader();
        boolean boolean18 = tarArchiveEntry3.equals(tarArchiveEntry10);
        tarArchiveEntry10.setGroupId((int) (short) 1);
        tarArchiveEntry10.setUserId(263);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.fillStarSparseData(strMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 120, false);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        long long5 = tarArchiveEntry3.getLongUserId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setMode((-1));
        boolean boolean15 = tarArchiveEntry2.isStarSparse();
        int int16 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setUserName("ustar\000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "132) test1779(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        int int10 = tarArchiveEntry2.getDevMinor();
        boolean boolean11 = tarArchiveEntry2.isFile();
        java.util.Date date12 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(date12);
// flaky "133) test1780(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:31 ICT 2026");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isPaxGNUSparse();
        int int10 = tarArchiveEntry2.getUserId();
        tarArchiveEntry2.setDevMajor(10240);
        tarArchiveEntry2.setName("0\000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupName("hi!");
        long long14 = tarArchiveEntry2.getLongUserId();
        java.util.Date date15 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky "134) test1782(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(date15);
// flaky "64) test1782(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:31 ICT 2026");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 76);
        int int3 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray4 = tarArchiveEntry2.getDirectoryEntries();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray4);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray4, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isFile();
        boolean boolean11 = tarArchiveEntry2.equals((java.lang.Object) '4');
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertNotNull(date3);
// flaky "135) test1784(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "65) test1784(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:31 ICT 2026");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        byte[] byteArray16 = new byte[] { (byte) 83, (byte) 54, (byte) 50, (byte) 53, (byte) 83, (byte) 55 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "136) test1785(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 117, (byte) 115, (byte) 116, (byte) 97, (byte) 114, (byte) 32 });
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setMode(0);
        long long11 = tarArchiveEntry2.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = tarArchiveEntry2.equals(tarArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId(10L);
        int int8 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertNotNull(date5);
// flaky "137) test1787(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 76, true);
        boolean boolean4 = tarArchiveEntry3.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry2.setName("");
        java.lang.String str14 = tarArchiveEntry2.getLinkName();
        boolean boolean15 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "138) test1789(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "66) test1789(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        boolean boolean13 = tarArchiveEntry2.isGlobalPaxHeader();
        int int14 = tarArchiveEntry2.getDevMajor();
        boolean boolean15 = tarArchiveEntry2.isExtended();
        boolean boolean16 = tarArchiveEntry2.isPaxHeader();
        java.util.Date date17 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "139) test1790(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:31 ICT 2026");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        int int9 = tarArchiveEntry2.getGroupId();
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        int int12 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertNotNull(date3);
// flaky "140) test1791(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky "67) test1791(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setNames(" \000", " \000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean20 = tarArchiveEntry15.equals(tarArchiveEntry19);
        tarArchiveEntry19.setName("");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long26 = tarArchiveEntry25.getSize();
        tarArchiveEntry25.setUserId((int) (byte) 10);
        boolean boolean29 = tarArchiveEntry25.isBlockDevice();
        boolean boolean30 = tarArchiveEntry25.isGlobalPaxHeader();
        boolean boolean31 = tarArchiveEntry19.equals(tarArchiveEntry25);
        boolean boolean32 = tarArchiveEntry25.isBlockDevice();
        boolean boolean33 = tarArchiveEntry2.isDescendent(tarArchiveEntry25);
        java.io.File file34 = tarArchiveEntry25.getFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "141) test1792(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "68) test1792(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(file34);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setLinkName("ustar ");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isLink();
        java.lang.Class<?> wildcardClass9 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky "142) test1793(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setLinkName("././@LongLink");
        tarArchiveEntry2.setSize((long) 53);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray7 = tarArchiveEntry2.getDirectoryEntries();
        int int8 = tarArchiveEntry2.getDevMinor();
        boolean boolean9 = tarArchiveEntry2.isLink();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setDevMinor((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minor device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
// flaky "143) test1795(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray7);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray7, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str9 = tarArchiveEntry2.getName();
        boolean boolean10 = tarArchiveEntry2.isLink();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "144) test1796(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "69) test1796(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isLink();
        boolean boolean10 = tarArchiveEntry2.isBlockDevice();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        long long12 = tarArchiveEntry2.getRealSize();
        boolean boolean13 = tarArchiveEntry2.isGNULongLinkEntry();
        java.lang.Class<?> wildcardClass14 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupId((-1L));
        java.util.Date date9 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        boolean boolean11 = tarArchiveEntry2.isFile();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "145) test1798(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date10);
// flaky "70) test1798(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isPaxGNUSparse();
        java.io.File file17 = tarArchiveEntry13.getFile();
        boolean boolean18 = tarArchiveEntry13.isPaxGNUSparse();
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry13);
        long long20 = tarArchiveEntry13.getRealSize();
        tarArchiveEntry13.setGroupId((int) (byte) 120);
        boolean boolean23 = tarArchiveEntry13.isPaxGNUSparse();
        tarArchiveEntry13.setUserId((long) 33188);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "146) test1799(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "71) test1799(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:31 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        byte[] byteArray5 = new byte[] { (byte) 103, (byte) 51, (byte) 1, (byte) 51, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 103, (byte) 51, (byte) 1, (byte) 51, (byte) 103 });
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        java.lang.String str10 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setGroupId((long) 1000);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry16.setGroupId((-1));
        java.lang.String str19 = tarArchiveEntry16.getGroupName();
        tarArchiveEntry16.setSize(97L);
        java.util.Date date22 = tarArchiveEntry16.getLastModifiedDate();
        boolean boolean23 = tarArchiveEntry2.isDescendent(tarArchiveEntry16);
        boolean boolean24 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setModTime(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(date22);
// flaky "147) test1801(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        long long4 = tarArchiveEntry2.getSize();
        java.lang.String str5 = tarArchiveEntry2.getLinkName();
        boolean boolean6 = tarArchiveEntry2.isSymbolicLink();
        byte[] byteArray10 = new byte[] { (byte) 48, (byte) 10, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "148) test1802(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 48, (byte) 10, (byte) 120 });
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 48, false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        int int8 = tarArchiveEntry2.getUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long12 = tarArchiveEntry11.getSize();
        tarArchiveEntry11.setUserId((int) (byte) 10);
        boolean boolean15 = tarArchiveEntry11.isGlobalPaxHeader();
        tarArchiveEntry11.setGroupId((long) (byte) 10);
        long long18 = tarArchiveEntry11.getLongUserId();
        boolean boolean19 = tarArchiveEntry11.isGNUSparse();
        boolean boolean20 = tarArchiveEntry2.isDescendent(tarArchiveEntry11);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean24 = tarArchiveEntry23.isGlobalPaxHeader();
        boolean boolean25 = tarArchiveEntry23.isFile();
        boolean boolean26 = tarArchiveEntry23.isDirectory();
        tarArchiveEntry23.setSize((long) 504);
        boolean boolean29 = tarArchiveEntry23.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray30 = tarArchiveEntry23.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry33 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long34 = tarArchiveEntry33.getSize();
        tarArchiveEntry33.setUserId((int) (byte) 10);
        boolean boolean37 = tarArchiveEntry33.isGlobalPaxHeader();
        tarArchiveEntry33.setGroupId((long) (byte) 10);
        boolean boolean40 = tarArchiveEntry33.isFile();
        boolean boolean41 = tarArchiveEntry23.equals((java.lang.Object) tarArchiveEntry33);
        tarArchiveEntry33.setUserName("\000\000");
        boolean boolean44 = tarArchiveEntry33.isSparse();
        boolean boolean45 = tarArchiveEntry33.isDirectory();
        boolean boolean46 = tarArchiveEntry2.isDescendent(tarArchiveEntry33);
        boolean boolean47 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray30);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray30, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setModTime((long) (byte) 75);
        boolean boolean14 = tarArchiveEntry10.isGNULongLinkEntry();
        tarArchiveEntry10.setGroupId((int) (byte) 88);
        long long17 = tarArchiveEntry10.getLongUserId();
        boolean boolean18 = tarArchiveEntry10.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "149) test1805(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "72) test1805(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setMode(1000);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "150) test1806(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setMode(33188);
        long long9 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setNames("0\000", "");
        long long14 = tarArchiveEntry2.getRealSize();
        byte[] byteArray20 = new byte[] { (byte) 52, (byte) 103, (byte) 48, (byte) 103, (byte) 103 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 52, (byte) 103, (byte) 48, (byte) 103, (byte) 103 });
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long13 = tarArchiveEntry12.getSize();
        tarArchiveEntry12.setUserId((int) (byte) 10);
        boolean boolean16 = tarArchiveEntry12.isGlobalPaxHeader();
        tarArchiveEntry12.setGroupId((long) (byte) 10);
        tarArchiveEntry12.setDevMinor(504);
        boolean boolean21 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean22 = tarArchiveEntry2.equals(tarArchiveEntry12);
        java.lang.String str23 = tarArchiveEntry2.getGroupName();
        int int24 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "151) test1809(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "73) test1809(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 48);
        tarArchiveEntry2.setSize(100L);
        boolean boolean5 = tarArchiveEntry2.isGNULongNameEntry();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 54, (byte) 50 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 54, (byte) 50 });
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        byte[] byteArray3 = new byte[] { (byte) 120, (byte) 100, (byte) 75 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 120, (byte) 100, (byte) 75 });
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isPaxGNUSparse();
        tarArchiveEntry2.setSize((long) 31);
        boolean boolean13 = tarArchiveEntry2.isExtended();
        boolean boolean14 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setName("ustar ");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        java.util.Date date12 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setNames("", "././@LongLink");
        boolean boolean16 = tarArchiveEntry2.isExtended();
        boolean boolean17 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean18 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMajor(31);
        tarArchiveEntry2.setGroupId((long) 8);
        org.junit.Assert.assertNotNull(date3);
// flaky "152) test1813(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "74) test1813(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "21) test1813(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        long long18 = tarArchiveEntry14.getLongUserId();
        int int19 = tarArchiveEntry14.getMode();
        tarArchiveEntry14.setSize((long) 32);
        int int22 = tarArchiveEntry14.getDevMinor();
        boolean boolean23 = tarArchiveEntry14.isBlockDevice();
        boolean boolean24 = tarArchiveEntry14.isCharacterDevice();
        boolean boolean25 = tarArchiveEntry14.isFile();
        long long26 = tarArchiveEntry14.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry30 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry30.setGroupId((-1));
        java.lang.String str33 = tarArchiveEntry30.getGroupName();
        tarArchiveEntry30.setSize(97L);
        java.util.Date date36 = tarArchiveEntry30.getLastModifiedDate();
        tarArchiveEntry30.setUserName("ustar ");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry41 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean42 = tarArchiveEntry41.isGlobalPaxHeader();
        java.lang.String str43 = tarArchiveEntry41.getUserName();
        boolean boolean44 = tarArchiveEntry41.isSparse();
        boolean boolean45 = tarArchiveEntry41.isGNUSparse();
        boolean boolean46 = tarArchiveEntry41.isSparse();
        java.util.Date date47 = tarArchiveEntry41.getLastModifiedDate();
        tarArchiveEntry30.setModTime(date47);
        tarArchiveEntry14.setModTime(date47);
        tarArchiveEntry2.setModTime(date47);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky "153) test1814(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33188 + "'", int19 == 33188);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(date36);
// flaky "75) test1814(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date36.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(date47);
// flaky "22) test1814(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date47.toString(), "Mon Sep 28 13:40:32 ICT 2026");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "154) test1815(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "76) test1815(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        java.util.Date date12 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean13 = tarArchiveEntry2.isGNULongLinkEntry();
        java.lang.String str14 = tarArchiveEntry2.getLinkName();
        int int15 = tarArchiveEntry2.getDevMajor();
        int int16 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long20 = tarArchiveEntry19.getSize();
        tarArchiveEntry19.setUserId((int) (byte) 10);
        boolean boolean23 = tarArchiveEntry19.isGlobalPaxHeader();
        tarArchiveEntry19.setGroupId((long) (byte) 10);
        boolean boolean26 = tarArchiveEntry19.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray27 = tarArchiveEntry19.getDirectoryEntries();
        java.lang.String str28 = tarArchiveEntry19.getLinkName();
        tarArchiveEntry19.setGroupId(35L);
        java.util.Date date31 = tarArchiveEntry19.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean36 = tarArchiveEntry35.isCharacterDevice();
        boolean boolean37 = tarArchiveEntry35.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry40 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date41 = tarArchiveEntry40.getLastModifiedDate();
        tarArchiveEntry35.setModTime(date41);
        tarArchiveEntry19.setModTime(date41);
        boolean boolean44 = tarArchiveEntry2.equals(tarArchiveEntry19);
        tarArchiveEntry2.setUserId((long) (byte) 51);
        org.junit.Assert.assertNotNull(date3);
// flaky "155) test1816(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "77) test1816(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "23) test1816(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray27);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray27, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(date31);
// flaky "8) test1816(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date41);
// flaky "4) test1816(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        int int3 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.lang.String str7 = tarArchiveEntry2.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean12 = tarArchiveEntry11.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean16 = tarArchiveEntry15.isGlobalPaxHeader();
        java.lang.String str17 = tarArchiveEntry15.getUserName();
        boolean boolean18 = tarArchiveEntry11.isDescendent(tarArchiveEntry15);
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry15);
        tarArchiveEntry15.setIds((int) (short) 100, 0);
        tarArchiveEntry15.setUserName("ustar\000");
        tarArchiveEntry15.setUserId((long) 10240);
        boolean boolean27 = tarArchiveEntry15.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "156) test1818(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "78) test1818(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setGroupId(148);
        boolean boolean11 = tarArchiveEntry2.isFIFO();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "157) test1819(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "79) test1819(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        tarArchiveEntry2.setGroupId((long) (byte) 100);
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean12 = tarArchiveEntry2.isGNUSparse();
        java.lang.String str13 = tarArchiveEntry2.getLinkName();
        int int14 = tarArchiveEntry2.getMode();
        long long15 = tarArchiveEntry2.getRealSize();
        byte[] byteArray17 = new byte[] { (byte) 50 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "158) test1820(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "80) test1820(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33188 + "'", int14 == 33188);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 50 });
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 50, true);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse1xData(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        tarArchiveEntry2.setUserId((long) 2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean13 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean14 = tarArchiveEntry12.isFile();
        boolean boolean15 = tarArchiveEntry12.isDirectory();
        tarArchiveEntry12.setSize((long) 504);
        long long18 = tarArchiveEntry12.getSize();
        boolean boolean19 = tarArchiveEntry12.isGNULongLinkEntry();
        tarArchiveEntry12.setGroupId((int) (byte) 55);
        java.util.Date date22 = tarArchiveEntry12.getModTime();
        tarArchiveEntry2.setModTime(date22);
        boolean boolean24 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean25 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 504L + "'", long18 == 504L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "159) test1822(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        boolean boolean2 = tarArchiveEntry1.isFile();
        tarArchiveEntry1.setModTime((-1L));
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        boolean boolean9 = tarArchiveEntry7.isFile();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        java.util.Date date11 = tarArchiveEntry7.getModTime();
        tarArchiveEntry7.setUserId((long) '#');
        boolean boolean14 = tarArchiveEntry7.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray15 = tarArchiveEntry7.getDirectoryEntries();
        boolean boolean16 = tarArchiveEntry7.isSparse();
        tarArchiveEntry7.setLinkName("tar\000");
        tarArchiveEntry7.setNames("hi!", " \000");
        boolean boolean22 = tarArchiveEntry1.isDescendent(tarArchiveEntry7);
        tarArchiveEntry1.setLinkName("00");
        tarArchiveEntry1.setName("ustar ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "160) test1823(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "81) test1823(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray15);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray15, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        int int13 = tarArchiveEntry2.getUserId();
        tarArchiveEntry2.setLinkName("");
        boolean boolean16 = tarArchiveEntry2.isStarSparse();
        int int17 = tarArchiveEntry2.getUserId();
        boolean boolean18 = tarArchiveEntry2.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 76);
        boolean boolean22 = tarArchiveEntry2.isDescendent(tarArchiveEntry21);
        java.lang.String str23 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setDevMinor((int) (byte) 48);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "161) test1824(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ustar " + "'", str23, "ustar ");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 49);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean13 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean14 = tarArchiveEntry2.isFIFO();
        boolean boolean15 = tarArchiveEntry2.isSparse();
        int int16 = tarArchiveEntry2.getUserId();
        int int17 = tarArchiveEntry2.getGroupId();
        boolean boolean18 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", (byte) 1, false);
        byte[] byteArray10 = new byte[] { (byte) 75, (byte) 53, (byte) 100, (byte) 75, (byte) 51, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 75, (byte) 53, (byte) 100, (byte) 75, (byte) 51, (byte) 120 });
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        boolean boolean9 = tarArchiveEntry2.equals(tarArchiveEntry8);
        tarArchiveEntry8.setLinkName("hi!");
        org.junit.Assert.assertNotNull(date3);
// flaky "162) test1828(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        int int9 = tarArchiveEntry2.getGroupId();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "163) test1829(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setLinkName("ustar ");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setName("././@LongLink");
        boolean boolean11 = tarArchiveEntry2.isLink();
        tarArchiveEntry2.setDevMinor(10240);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = tarArchiveEntry2.isDescendent(tarArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "164) test1830(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        boolean boolean3 = tarArchiveEntry1.isFIFO();
        boolean boolean4 = tarArchiveEntry1.isStarSparse();
        long long5 = tarArchiveEntry1.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 50, true);
        boolean boolean10 = tarArchiveEntry1.equals(tarArchiveEntry9);
        boolean boolean11 = tarArchiveEntry1.isFile();
        java.util.Date date12 = tarArchiveEntry1.getLastModifiedDate();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 100, (byte) 83, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.parseTarHeader(byteArray17, zipEncoding18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky "165) test1831(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(date12);
// flaky "82) test1831(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 100, (byte) 83, (byte) 88 });
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        boolean boolean6 = tarArchiveEntry3.isPaxGNUSparse();
        boolean boolean7 = tarArchiveEntry3.isGNULongNameEntry();
        long long8 = tarArchiveEntry3.getSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setDevMajor(33188);
        tarArchiveEntry2.setIds(6, 10240);
        tarArchiveEntry2.setModTime((long) (byte) 75);
        tarArchiveEntry2.setModTime(504L);
        boolean boolean16 = tarArchiveEntry2.isDirectory();
        boolean boolean17 = tarArchiveEntry2.isGNULongLinkEntry();
        byte[] byteArray18 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray18, zipEncoding19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setUserId((int) (byte) 53);
        tarArchiveEntry2.setDevMajor(508);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setGroupId(148);
        boolean boolean11 = tarArchiveEntry2.isFIFO();
        boolean boolean12 = tarArchiveEntry2.isGlobalPaxHeader();
        long long13 = tarArchiveEntry2.getLongUserId();
        boolean boolean14 = tarArchiveEntry2.isLink();
        tarArchiveEntry2.setUserName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "166) test1835(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "83) test1835(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isPaxGNUSparse();
        java.io.File file17 = tarArchiveEntry13.getFile();
        boolean boolean18 = tarArchiveEntry13.isPaxGNUSparse();
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry13);
        boolean boolean20 = tarArchiveEntry2.isSymbolicLink();
        long long21 = tarArchiveEntry2.getRealSize();
        int int22 = tarArchiveEntry2.getDevMajor();
        boolean boolean23 = tarArchiveEntry2.isExtended();
        boolean boolean24 = tarArchiveEntry2.isGNUSparse();
        byte[] byteArray28 = new byte[] { (byte) 88, (byte) 54, (byte) 120 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray28, zipEncoding29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "167) test1836(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "84) test1836(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 88, (byte) 54, (byte) 120 });
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        tarArchiveEntry2.setUserId((long) 2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean13 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean14 = tarArchiveEntry12.isFile();
        boolean boolean15 = tarArchiveEntry12.isDirectory();
        tarArchiveEntry12.setSize((long) 504);
        long long18 = tarArchiveEntry12.getSize();
        boolean boolean19 = tarArchiveEntry12.isGNULongLinkEntry();
        tarArchiveEntry12.setGroupId((int) (byte) 55);
        java.util.Date date22 = tarArchiveEntry12.getModTime();
        tarArchiveEntry2.setModTime(date22);
        boolean boolean24 = tarArchiveEntry2.isCheckSumOK();
        long long25 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 504L + "'", long18 == 504L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "168) test1837(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setGroupName("././@LongLink");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        int int8 = tarArchiveEntry2.getDevMajor();
        int int9 = tarArchiveEntry2.getDevMajor();
        int int10 = tarArchiveEntry2.getUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean19 = tarArchiveEntry18.isGlobalPaxHeader();
        boolean boolean20 = tarArchiveEntry18.isFile();
        boolean boolean21 = tarArchiveEntry18.isPaxGNUSparse();
        boolean boolean22 = tarArchiveEntry18.isFile();
        boolean boolean23 = tarArchiveEntry18.isFIFO();
        boolean boolean24 = tarArchiveEntry18.isFile();
        boolean boolean25 = tarArchiveEntry18.isDirectory();
        boolean boolean26 = tarArchiveEntry13.equals(tarArchiveEntry18);
        tarArchiveEntry13.setUserId(0);
        boolean boolean29 = tarArchiveEntry2.equals((java.lang.Object) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "169) test1839(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        int int13 = tarArchiveEntry2.getUserId();
        java.util.Date date14 = tarArchiveEntry2.getModTime();
        boolean boolean15 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setName("\000\000");
        java.util.Date date18 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setName("././@LongLink");
        tarArchiveEntry2.setModTime((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "170) test1840(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "85) test1840(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "24) test1840(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:32 ICT 2026");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        int int11 = tarArchiveEntry2.getDevMinor();
        boolean boolean12 = tarArchiveEntry2.isSparse();
        boolean boolean13 = tarArchiveEntry2.isFIFO();
        boolean boolean14 = tarArchiveEntry2.isPaxGNUSparse();
        java.lang.String str15 = tarArchiveEntry2.getName();
        org.junit.Assert.assertNotNull(date3);
// flaky "171) test1841(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ustar " + "'", str15, "ustar ");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        java.lang.String str2 = tarArchiveEntry1.getLinkName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 0, true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long7 = tarArchiveEntry6.getSize();
        tarArchiveEntry6.setUserId((int) (byte) 10);
        boolean boolean10 = tarArchiveEntry6.isGlobalPaxHeader();
        tarArchiveEntry6.setGroupId((long) (byte) 10);
        boolean boolean13 = tarArchiveEntry6.isBlockDevice();
        tarArchiveEntry6.setUserId(100L);
        boolean boolean16 = tarArchiveEntry3.isDescendent(tarArchiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long20 = tarArchiveEntry19.getSize();
        tarArchiveEntry19.setUserId((int) (byte) 10);
        boolean boolean23 = tarArchiveEntry19.isCheckSumOK();
        tarArchiveEntry19.setModTime((long) 1);
        boolean boolean26 = tarArchiveEntry6.equals(tarArchiveEntry19);
        java.lang.String str27 = tarArchiveEntry6.getUserName();
        tarArchiveEntry6.setUserId((long) 'a');
        boolean boolean30 = tarArchiveEntry6.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", false);
        int int3 = tarArchiveEntry2.getDevMajor();
        boolean boolean4 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setLinkName("././@LongLink");
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertNotNull(date3);
// flaky "172) test1845(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 10);
        tarArchiveEntry2.setDevMinor(155);
        tarArchiveEntry2.setName("ustar ");
        boolean boolean7 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        int int13 = tarArchiveEntry2.getUserId();
        tarArchiveEntry2.setLinkName("");
        boolean boolean16 = tarArchiveEntry2.isStarSparse();
        int int17 = tarArchiveEntry2.getUserId();
        boolean boolean18 = tarArchiveEntry2.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 76);
        boolean boolean22 = tarArchiveEntry2.isDescendent(tarArchiveEntry21);
        java.lang.String str23 = tarArchiveEntry2.getName();
        java.lang.String str24 = tarArchiveEntry2.getLinkName();
        java.lang.Class<?> wildcardClass25 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "173) test1847(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ustar " + "'", str23, "ustar ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray6 = tarArchiveEntry3.getDirectoryEntries();
        int int7 = tarArchiveEntry3.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray6);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray6, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 50, true);
        java.util.Date date4 = tarArchiveEntry3.getModTime();
        boolean boolean5 = tarArchiveEntry3.isStarSparse();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        org.junit.Assert.assertNotNull(date4);
// flaky "174) test1849(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        java.util.Date date13 = tarArchiveEntry10.getModTime();
        java.util.Date date14 = tarArchiveEntry10.getModTime();
        int int15 = tarArchiveEntry10.getMode();
        tarArchiveEntry10.setNames("00", "");
        boolean boolean19 = tarArchiveEntry2.equals(tarArchiveEntry10);
        int int20 = tarArchiveEntry10.getDevMajor();
        long long21 = tarArchiveEntry10.getLongGroupId();
        int int22 = tarArchiveEntry10.getDevMajor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "175) test1850(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "86) test1850(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isSymbolicLink();
        int int10 = tarArchiveEntry2.getMode();
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        long long12 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserName(" \000");
        boolean boolean15 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "176) test1851(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33188 + "'", int10 == 33188);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setSize((long) (byte) 53);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        tarArchiveEntry14.setSize((long) (byte) 10);
        boolean boolean20 = tarArchiveEntry14.isOldGNUSparse();
        boolean boolean21 = tarArchiveEntry2.equals(tarArchiveEntry14);
        boolean boolean22 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setModTime((long) (byte) 83);
        org.junit.Assert.assertNotNull(date3);
// flaky "177) test1852(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "87) test1852(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean13 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean14 = tarArchiveEntry2.isFIFO();
        boolean boolean15 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean16 = tarArchiveEntry2.isBlockDevice();
        boolean boolean17 = tarArchiveEntry2.isSymbolicLink();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        byte[] byteArray3 = new byte[] { (byte) 51, (byte) 76, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 51, (byte) 76, (byte) 54 });
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isGNULongNameEntry();
        int int8 = tarArchiveEntry3.getMode();
        tarArchiveEntry3.setGroupId(8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(35L);
        tarArchiveEntry2.setMode(4);
        boolean boolean16 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str17 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getName();
        tarArchiveEntry3.setName("");
        tarArchiveEntry3.setDevMajor(48);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar\000" + "'", str6, "ustar\000");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 76);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 76);
        tarArchiveEntry2.setDevMinor(263);
        java.lang.String str5 = tarArchiveEntry2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setUserId(0L);
        tarArchiveEntry3.setName("0\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date11 = tarArchiveEntry10.getLastModifiedDate();
        boolean boolean12 = tarArchiveEntry10.isFIFO();
        boolean boolean13 = tarArchiveEntry10.isStarSparse();
        long long14 = tarArchiveEntry10.getRealSize();
        tarArchiveEntry10.setName(" \000");
        java.io.File file17 = tarArchiveEntry10.getFile();
        boolean boolean18 = tarArchiveEntry3.equals((java.lang.Object) file17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "178) test1860(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "179) test1861(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        int int13 = tarArchiveEntry2.getUserId();
        tarArchiveEntry2.setLinkName("");
        boolean boolean16 = tarArchiveEntry2.isStarSparse();
        int int17 = tarArchiveEntry2.getUserId();
        boolean boolean18 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setLinkName("ustar ");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "180) test1862(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 48);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.lang.String str12 = tarArchiveEntry2.getLinkName();
        boolean boolean13 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean14 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean15 = tarArchiveEntry2.isStarSparse();
        boolean boolean16 = tarArchiveEntry2.isLink();
        boolean boolean17 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean18 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "181) test1865(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "88) test1865(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        java.lang.String str9 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long13 = tarArchiveEntry12.getSize();
        tarArchiveEntry12.setUserId((int) (byte) 10);
        long long16 = tarArchiveEntry12.getLongUserId();
        tarArchiveEntry12.setDevMajor(16877);
        tarArchiveEntry12.setGroupId((int) (byte) 1);
        tarArchiveEntry12.setUserName("\000\000");
        boolean boolean23 = tarArchiveEntry12.isBlockDevice();
        boolean boolean24 = tarArchiveEntry2.equals(tarArchiveEntry12);
        java.lang.String str25 = tarArchiveEntry12.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "182) test1866(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "89) test1866(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ustar " + "'", str25, "ustar ");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        byte[] byteArray5 = new byte[] { (byte) 50, (byte) 76, (byte) 10, (byte) 120, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 50, (byte) 76, (byte) 10, (byte) 120, (byte) -1 });
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        boolean boolean12 = tarArchiveEntry2.isPaxGNUSparse();
        int int13 = tarArchiveEntry2.getGroupId();
        boolean boolean14 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean15 = tarArchiveEntry2.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long19 = tarArchiveEntry18.getSize();
        tarArchiveEntry18.setUserId((int) (byte) 10);
        boolean boolean22 = tarArchiveEntry18.isGlobalPaxHeader();
        tarArchiveEntry18.setGroupId((long) (byte) 10);
        boolean boolean25 = tarArchiveEntry18.isBlockDevice();
        tarArchiveEntry18.setUserId(100L);
        java.util.Date date28 = tarArchiveEntry18.getModTime();
        int int29 = tarArchiveEntry18.getUserId();
        tarArchiveEntry18.setLinkName("");
        boolean boolean32 = tarArchiveEntry18.isGlobalPaxHeader();
        tarArchiveEntry18.setMode((int) (byte) 55);
        int int35 = tarArchiveEntry18.getUserId();
        boolean boolean36 = tarArchiveEntry2.isDescendent(tarArchiveEntry18);
        boolean boolean37 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "183) test1868(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "90) test1868(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date28);
// flaky "25) test1868(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date28.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        byte[] byteArray12 = new byte[] { (byte) 75, (byte) 50, (byte) 100, (byte) 53, (byte) 83, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12, zipEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "184) test1869(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 75, (byte) 50, (byte) 100, (byte) 53, (byte) 83, (byte) 88 });
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        int int10 = tarArchiveEntry2.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        long long12 = tarArchiveEntry2.getLongGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long16 = tarArchiveEntry15.getSize();
        tarArchiveEntry15.setUserId((int) (byte) 10);
        long long19 = tarArchiveEntry15.getLongUserId();
        int int20 = tarArchiveEntry15.getMode();
        tarArchiveEntry15.setSize((long) 32);
        int int23 = tarArchiveEntry15.getDevMinor();
        boolean boolean24 = tarArchiveEntry2.equals(tarArchiveEntry15);
        int int25 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertNotNull(date3);
// flaky "185) test1870(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33188 + "'", int20 == 33188);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", true);
        java.lang.String str3 = tarArchiveEntry2.getName();
        boolean boolean4 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00" + "'", str3, "00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isFile();
        boolean boolean5 = tarArchiveEntry3.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        boolean boolean12 = tarArchiveEntry2.isBlockDevice();
        byte[] byteArray18 = new byte[] { (byte) 50, (byte) 83, (byte) -1, (byte) -1, (byte) 48 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray18, zipEncoding19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "186) test1873(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "91) test1873(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 50, (byte) 83, (byte) -1, (byte) -1, (byte) 48 });
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("0\000");
        boolean boolean12 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setGroupName("hi!");
        boolean boolean15 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setGroupId(148);
        boolean boolean11 = tarArchiveEntry2.isFIFO();
        boolean boolean12 = tarArchiveEntry2.isGlobalPaxHeader();
        long long13 = tarArchiveEntry2.getLongUserId();
        boolean boolean14 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "187) test1875(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "92) test1875(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean8 = tarArchiveEntry2.isDirectory();
        java.lang.String str9 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertNotNull(date3);
// flaky "188) test1876(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 55);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertNotNull(date3);
// flaky "189) test1877(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        boolean boolean6 = tarArchiveEntry3.isGlobalPaxHeader();
        java.lang.String str7 = tarArchiveEntry3.getName();
        boolean boolean8 = tarArchiveEntry3.isLink();
        tarArchiveEntry3.setDevMajor(16877);
        tarArchiveEntry3.setGroupId((long) (byte) 51);
        int int13 = tarArchiveEntry3.getUserId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0\000" + "'", str7, "0\000");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        boolean boolean12 = tarArchiveEntry9.isDirectory();
        tarArchiveEntry9.setSize((long) 504);
        boolean boolean15 = tarArchiveEntry9.isSparse();
        boolean boolean16 = tarArchiveEntry9.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long20 = tarArchiveEntry19.getSize();
        tarArchiveEntry19.setUserId((int) (byte) 10);
        boolean boolean23 = tarArchiveEntry19.isGlobalPaxHeader();
        tarArchiveEntry19.setGroupId((long) (byte) 10);
        long long26 = tarArchiveEntry19.getLongUserId();
        tarArchiveEntry19.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date30 = tarArchiveEntry19.getModTime();
        tarArchiveEntry9.setModTime(date30);
        boolean boolean32 = tarArchiveEntry3.equals((java.lang.Object) tarArchiveEntry9);
        boolean boolean33 = tarArchiveEntry9.isGNULongNameEntry();
        boolean boolean34 = tarArchiveEntry9.isSymbolicLink();
        long long35 = tarArchiveEntry9.getSize();
        tarArchiveEntry9.setSize((long) (byte) 76);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(date30);
// flaky "190) test1879(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 504L + "'", long35 == 504L);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        java.util.Date date5 = tarArchiveEntry3.getLastModifiedDate();
        long long6 = tarArchiveEntry3.getLongGroupId();
        boolean boolean7 = tarArchiveEntry3.isCheckSumOK();
        boolean boolean8 = tarArchiveEntry3.isLink();
        boolean boolean9 = tarArchiveEntry3.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000");
        tarArchiveEntry11.setDevMajor((int) (byte) 48);
        boolean boolean14 = tarArchiveEntry3.isDescendent(tarArchiveEntry11);
        boolean boolean15 = tarArchiveEntry3.isLink();
        boolean boolean16 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean17 = tarArchiveEntry3.isGNULongLinkEntry();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky "191) test1880(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setMode(0);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        java.util.Date date13 = tarArchiveEntry10.getModTime();
        java.util.Date date14 = tarArchiveEntry10.getModTime();
        int int15 = tarArchiveEntry10.getMode();
        tarArchiveEntry10.setNames("00", "");
        boolean boolean19 = tarArchiveEntry2.equals(tarArchiveEntry10);
        int int20 = tarArchiveEntry10.getDevMajor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long24 = tarArchiveEntry23.getSize();
        tarArchiveEntry23.setUserId((int) (byte) 10);
        boolean boolean27 = tarArchiveEntry23.isBlockDevice();
        tarArchiveEntry23.setGroupId((-1L));
        java.util.Date date30 = tarArchiveEntry23.getLastModifiedDate();
        boolean boolean31 = tarArchiveEntry10.equals((java.lang.Object) tarArchiveEntry23);
        tarArchiveEntry10.setDevMajor(2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "192) test1882(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "93) test1882(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date30);
// flaky "26) test1882(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean7 = tarArchiveEntry2.equals(tarArchiveEntry6);
        tarArchiveEntry6.setName("");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long13 = tarArchiveEntry12.getSize();
        tarArchiveEntry12.setUserId((int) (byte) 10);
        boolean boolean16 = tarArchiveEntry12.isBlockDevice();
        boolean boolean17 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean18 = tarArchiveEntry6.equals(tarArchiveEntry12);
        boolean boolean19 = tarArchiveEntry12.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long23 = tarArchiveEntry22.getSize();
        tarArchiveEntry22.setUserId((int) (byte) 10);
        boolean boolean26 = tarArchiveEntry22.isGlobalPaxHeader();
        tarArchiveEntry22.setGroupId((long) (byte) 10);
        boolean boolean29 = tarArchiveEntry22.isBlockDevice();
        tarArchiveEntry22.setUserId(100L);
        boolean boolean32 = tarArchiveEntry22.isSymbolicLink();
        boolean boolean33 = tarArchiveEntry22.isOldGNUSparse();
        boolean boolean34 = tarArchiveEntry22.isPaxGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry37 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean38 = tarArchiveEntry37.isGlobalPaxHeader();
        boolean boolean39 = tarArchiveEntry37.isFile();
        java.util.Date date40 = tarArchiveEntry37.getModTime();
        java.util.Date date41 = tarArchiveEntry37.getModTime();
        boolean boolean42 = tarArchiveEntry22.equals((java.lang.Object) date41);
        tarArchiveEntry12.setModTime(date41);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry46 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry46.setMode((int) '#');
        tarArchiveEntry46.setModTime((long) 155);
        java.lang.String str51 = tarArchiveEntry46.getName();
        boolean boolean52 = tarArchiveEntry46.isPaxHeader();
        boolean boolean53 = tarArchiveEntry46.isFIFO();
        boolean boolean54 = tarArchiveEntry12.equals(tarArchiveEntry46);
        tarArchiveEntry46.setGroupId((long) 131);
        tarArchiveEntry46.setIds(53, (int) (byte) 49);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(date40);
// flaky "193) test1883(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date41);
// flaky "94) test1883(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getGroupName();
        tarArchiveEntry3.setSize(97L);
        java.util.Date date9 = tarArchiveEntry3.getLastModifiedDate();
        byte[] byteArray13 = new byte[] { (byte) 75, (byte) 83, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray13, zipEncoding14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(date9);
// flaky "194) test1884(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 75, (byte) 83, (byte) 50 });
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setSize((long) (byte) 53);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        tarArchiveEntry14.setSize((long) (byte) 10);
        boolean boolean20 = tarArchiveEntry14.isOldGNUSparse();
        boolean boolean21 = tarArchiveEntry2.equals(tarArchiveEntry14);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray22 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean23 = tarArchiveEntry2.isStarSparse();
        long long24 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertNotNull(date3);
// flaky "195) test1885(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "95) test1885(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray22);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray22, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setGroupId((int) (byte) 0);
        boolean boolean7 = tarArchiveEntry2.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date11 = tarArchiveEntry10.getLastModifiedDate();
        boolean boolean12 = tarArchiveEntry10.isCharacterDevice();
        tarArchiveEntry10.setUserName("hi!");
        boolean boolean15 = tarArchiveEntry10.isStarSparse();
        boolean boolean16 = tarArchiveEntry10.isGNULongLinkEntry();
        boolean boolean17 = tarArchiveEntry10.isSymbolicLink();
        boolean boolean18 = tarArchiveEntry2.equals(tarArchiveEntry10);
        boolean boolean19 = tarArchiveEntry10.isGlobalPaxHeader();
        tarArchiveEntry10.setNames("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "196) test1886(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        int int9 = tarArchiveEntry2.getUserId();
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        java.util.Date date12 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserId(0);
        boolean boolean15 = tarArchiveEntry2.isFile();
        boolean boolean16 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "197) test1887(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "96) test1887(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:32 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        int int8 = tarArchiveEntry2.getDevMajor();
        boolean boolean9 = tarArchiveEntry2.isFIFO();
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        boolean boolean11 = tarArchiveEntry2.isLink();
        int int12 = tarArchiveEntry2.getDevMajor();
        org.junit.Assert.assertNotNull(date3);
// flaky "198) test1888(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky "97) test1888(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean12 = tarArchiveEntry11.isGlobalPaxHeader();
        boolean boolean13 = tarArchiveEntry11.isFile();
        java.util.Date date14 = tarArchiveEntry11.getModTime();
        java.util.Date date15 = tarArchiveEntry11.getModTime();
        int int16 = tarArchiveEntry11.getMode();
        boolean boolean17 = tarArchiveEntry2.equals(tarArchiveEntry11);
        boolean boolean18 = tarArchiveEntry11.isBlockDevice();
        boolean boolean19 = tarArchiveEntry11.isSymbolicLink();
        boolean boolean20 = tarArchiveEntry11.isCharacterDevice();
        tarArchiveEntry11.setGroupId((long) 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
// flaky "199) test1889(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "98) test1889(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getRealSize();
        tarArchiveEntry2.setGroupName("ustar\000");
        org.junit.Assert.assertNotNull(date3);
// flaky "200) test1890(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date15 = tarArchiveEntry14.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date15);
        tarArchiveEntry2.setGroupId((long) (byte) 1);
        tarArchiveEntry2.setUserId((long) (byte) 52);
        boolean boolean21 = tarArchiveEntry2.isStarSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray22 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = tarArchiveEntry2.isDescendent(tarArchiveEntry23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "201) test1891(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(date11);
// flaky "99) test1891(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "27) test1891(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray22);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray22, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        long long5 = tarArchiveEntry2.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tarArchiveEntry2.equals(tarArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "202) test1892(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isFile();
        boolean boolean11 = tarArchiveEntry2.equals((java.lang.Object) '4');
        boolean boolean12 = tarArchiveEntry2.isGNULongNameEntry();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "203) test1893(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        int int13 = tarArchiveEntry2.getUserId();
        boolean boolean14 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry2.isGNUSparse();
        boolean boolean16 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 50);
        java.util.Date date3 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setMode((int) (byte) 52);
        org.junit.Assert.assertNotNull(date3);
// flaky "204) test1895(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        java.util.Date date5 = tarArchiveEntry3.getLastModifiedDate();
        long long6 = tarArchiveEntry3.getLongGroupId();
        boolean boolean7 = tarArchiveEntry3.isCheckSumOK();
        tarArchiveEntry3.setSize((long) 35);
        tarArchiveEntry3.setGroupId(32);
        int int12 = tarArchiveEntry3.getDevMajor();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky "205) test1896(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        boolean boolean9 = tarArchiveEntry7.isFile();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        java.util.Date date11 = tarArchiveEntry7.getModTime();
        java.lang.String str12 = tarArchiveEntry7.getGroupName();
        boolean boolean13 = tarArchiveEntry2.isDescendent(tarArchiveEntry7);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry16.setMode((int) '#');
        tarArchiveEntry16.setModTime((long) 155);
        boolean boolean21 = tarArchiveEntry2.isDescendent(tarArchiveEntry16);
        long long22 = tarArchiveEntry16.getLongGroupId();
        int int23 = tarArchiveEntry16.getUserId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "206) test1897(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "100) test1897(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.lang.String str6 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setUserName("\000\000");
        boolean boolean9 = tarArchiveEntry2.isGNULongLinkEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date13 = tarArchiveEntry12.getLastModifiedDate();
        java.util.Date date14 = tarArchiveEntry12.getLastModifiedDate();
        tarArchiveEntry12.setDevMajor(12);
        boolean boolean17 = tarArchiveEntry2.isDescendent(tarArchiveEntry12);
        java.util.Date date18 = tarArchiveEntry2.getLastModifiedDate();
        int int19 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "207) test1898(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "101) test1898(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "28) test1898(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        java.lang.String str10 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setDevMinor((int) (byte) 76);
        int int13 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33188 + "'", int13 == 33188);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setGroupId((long) 1);
        long long7 = tarArchiveEntry3.getRealSize();
        java.util.Date date8 = tarArchiveEntry3.getLastModifiedDate();
        java.lang.String str9 = tarArchiveEntry3.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean13 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean14 = tarArchiveEntry12.isFile();
        boolean boolean15 = tarArchiveEntry12.isDirectory();
        tarArchiveEntry12.setSize((long) 504);
        boolean boolean18 = tarArchiveEntry12.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean22 = tarArchiveEntry21.isGlobalPaxHeader();
        boolean boolean23 = tarArchiveEntry21.isFile();
        java.util.Date date24 = tarArchiveEntry21.getModTime();
        java.util.Date date25 = tarArchiveEntry21.getModTime();
        int int26 = tarArchiveEntry21.getMode();
        boolean boolean27 = tarArchiveEntry12.equals(tarArchiveEntry21);
        java.lang.String str28 = tarArchiveEntry12.getGroupName();
        java.io.File file29 = tarArchiveEntry12.getFile();
        boolean boolean30 = tarArchiveEntry3.equals(tarArchiveEntry12);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry12.fillGNUSparse1xData(strMap31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date8);
// flaky "208) test1900(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(date24);
// flaky "102) test1900(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date25);
// flaky "29) test1900(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 33188 + "'", int26 == 33188);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str10 = tarArchiveEntry9.getLinkName();
        java.util.Date date11 = tarArchiveEntry9.getLastModifiedDate();
        long long12 = tarArchiveEntry9.getLongGroupId();
        boolean boolean13 = tarArchiveEntry2.equals(tarArchiveEntry9);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean17 = tarArchiveEntry16.isGlobalPaxHeader();
        boolean boolean18 = tarArchiveEntry16.isFile();
        boolean boolean19 = tarArchiveEntry16.isDirectory();
        tarArchiveEntry16.setSize((long) 504);
        long long22 = tarArchiveEntry16.getSize();
        boolean boolean23 = tarArchiveEntry16.isLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry26 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date27 = tarArchiveEntry26.getLastModifiedDate();
        boolean boolean28 = tarArchiveEntry26.isCharacterDevice();
        tarArchiveEntry26.setUserName("hi!");
        tarArchiveEntry26.setGroupName("");
        java.util.Date date33 = tarArchiveEntry26.getModTime();
        boolean boolean34 = tarArchiveEntry26.isGNULongLinkEntry();
        boolean boolean35 = tarArchiveEntry26.isPaxHeader();
        java.util.Date date36 = tarArchiveEntry26.getLastModifiedDate();
        tarArchiveEntry16.setModTime(date36);
        tarArchiveEntry9.setModTime(date36);
        tarArchiveEntry9.setModTime((long) (byte) 76);
        boolean boolean41 = tarArchiveEntry9.isGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(date11);
// flaky "209) test1901(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 504L + "'", long22 == 504L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date27);
// flaky "103) test1901(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(date33);
// flaky "30) test1901(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date33.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date36);
// flaky "9) test1901(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date36.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setDevMinor((int) (byte) 55);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        boolean boolean18 = tarArchiveEntry14.isGlobalPaxHeader();
        java.lang.String str19 = tarArchiveEntry14.getUserName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean23 = tarArchiveEntry22.isGlobalPaxHeader();
        boolean boolean24 = tarArchiveEntry22.isFile();
        java.util.Date date25 = tarArchiveEntry22.getModTime();
        java.util.Date date26 = tarArchiveEntry22.getModTime();
        int int27 = tarArchiveEntry22.getMode();
        tarArchiveEntry22.setNames("00", "");
        boolean boolean31 = tarArchiveEntry14.equals(tarArchiveEntry22);
        int int32 = tarArchiveEntry22.getDevMajor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long36 = tarArchiveEntry35.getSize();
        tarArchiveEntry35.setUserId((int) (byte) 10);
        boolean boolean39 = tarArchiveEntry35.isBlockDevice();
        tarArchiveEntry35.setGroupId((-1L));
        java.util.Date date42 = tarArchiveEntry35.getLastModifiedDate();
        boolean boolean43 = tarArchiveEntry22.equals((java.lang.Object) tarArchiveEntry35);
        tarArchiveEntry22.setUserId(8L);
        boolean boolean46 = tarArchiveEntry2.isDescendent(tarArchiveEntry22);
        tarArchiveEntry22.setNames("././@LongLink", "\000\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(date25);
// flaky "210) test1902(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date26);
// flaky "104) test1902(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 33188 + "'", int27 == 33188);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(date42);
// flaky "31) test1902(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date42.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isPaxGNUSparse();
        java.io.File file17 = tarArchiveEntry13.getFile();
        boolean boolean18 = tarArchiveEntry13.isPaxGNUSparse();
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry13);
        long long20 = tarArchiveEntry13.getRealSize();
        int int21 = tarArchiveEntry13.getUserId();
        long long22 = tarArchiveEntry13.getRealSize();
        tarArchiveEntry13.setUserId(2);
        boolean boolean25 = tarArchiveEntry13.isExtended();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "211) test1903(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "105) test1903(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 54, true);
        tarArchiveEntry3.setMode((int) (byte) 0);
        int int6 = tarArchiveEntry3.getUserId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setDevMinor(0);
        byte[] byteArray7 = new byte[] { (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray7, zipEncoding8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 76 });
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isSymbolicLink();
        boolean boolean6 = tarArchiveEntry3.isPaxGNUSparse();
        boolean boolean7 = tarArchiveEntry3.isFIFO();
        boolean boolean8 = tarArchiveEntry3.isFIFO();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        int int6 = tarArchiveEntry2.getDevMinor();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray8 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str9 = tarArchiveEntry2.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long13 = tarArchiveEntry12.getSize();
        tarArchiveEntry12.setUserId((int) (byte) 10);
        boolean boolean16 = tarArchiveEntry12.isGlobalPaxHeader();
        tarArchiveEntry12.setGroupId((long) (byte) 10);
        boolean boolean19 = tarArchiveEntry12.isBlockDevice();
        tarArchiveEntry12.setUserId(100L);
        boolean boolean22 = tarArchiveEntry12.isFIFO();
        boolean boolean23 = tarArchiveEntry12.isCharacterDevice();
        boolean boolean24 = tarArchiveEntry2.equals(tarArchiveEntry12);
        tarArchiveEntry2.setIds((int) '4', 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray8);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray8, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        java.util.Date date12 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setNames("", "././@LongLink");
        boolean boolean16 = tarArchiveEntry2.isExtended();
        boolean boolean17 = tarArchiveEntry2.isGNULongNameEntry();
        byte[] byteArray24 = new byte[] { (byte) 88, (byte) 51, (byte) 0, (byte) 10, (byte) 120, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "212) test1908(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "106) test1908(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "32) test1908(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 88, (byte) 51, (byte) 0, (byte) 10, (byte) 120, (byte) -1 });
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        java.util.Date date5 = tarArchiveEntry3.getLastModifiedDate();
        long long6 = tarArchiveEntry3.getLongGroupId();
        boolean boolean7 = tarArchiveEntry3.isCheckSumOK();
        boolean boolean8 = tarArchiveEntry3.isLink();
        boolean boolean9 = tarArchiveEntry3.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000");
        tarArchiveEntry11.setDevMajor((int) (byte) 48);
        boolean boolean14 = tarArchiveEntry3.isDescendent(tarArchiveEntry11);
        tarArchiveEntry3.setMode(512);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky "213) test1909(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        boolean boolean3 = tarArchiveEntry1.isFIFO();
        boolean boolean4 = tarArchiveEntry1.isStarSparse();
        long long5 = tarArchiveEntry1.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 50, true);
        boolean boolean10 = tarArchiveEntry1.equals(tarArchiveEntry9);
        tarArchiveEntry1.setUserId((int) (byte) 88);
        org.junit.Assert.assertNotNull(date2);
// flaky "214) test1910(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setMode(1000);
        boolean boolean14 = tarArchiveEntry2.isBlockDevice();
        long long15 = tarArchiveEntry2.getRealSize();
        boolean boolean16 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setGroupId((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (short) 1, 155);
        int int8 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setName("ustar ");
        long long11 = tarArchiveEntry2.getRealSize();
        tarArchiveEntry2.setModTime(8589934591L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray14 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.Class<?> wildcardClass15 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 155 + "'", int8 == 155);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray14);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray14, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        byte[] byteArray14 = new byte[] { (byte) 88, (byte) 53, (byte) 53, (byte) 53 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray14, zipEncoding15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 88, (byte) 53, (byte) 53, (byte) 53 });
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(100);
        tarArchiveEntry2.setIds((int) (short) 1, 32);
        byte[] byteArray19 = new byte[] { (byte) 55, (byte) 0, (byte) 52, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "215) test1914(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "107) test1914(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 55, (byte) 0, (byte) 52, (byte) 0 });
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray7 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setMode(32);
        long long10 = tarArchiveEntry2.getLongUserId();
        boolean boolean11 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertNotNull(date5);
// flaky "216) test1915(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray7);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray7, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isDirectory();
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 51 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "217) test1916(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 51 });
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 0);
        boolean boolean3 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 50, true);
        tarArchiveEntry3.setUserName("0\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry9.setGroupId((-1));
        java.lang.String str12 = tarArchiveEntry9.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray13 = tarArchiveEntry9.getDirectoryEntries();
        boolean boolean14 = tarArchiveEntry3.equals((java.lang.Object) tarArchiveEntry9);
        tarArchiveEntry9.setUserName("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ustar\000" + "'", str12, "ustar\000");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray13);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray13, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        byte[] byteArray6 = new byte[] { (byte) 50, (byte) 75, (byte) 10, (byte) 1, (byte) 83, (byte) 103 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 50, (byte) 75, (byte) 10, (byte) 1, (byte) 83, (byte) 103 });
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 0, true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long7 = tarArchiveEntry6.getSize();
        tarArchiveEntry6.setUserId((int) (byte) 10);
        boolean boolean10 = tarArchiveEntry6.isGlobalPaxHeader();
        tarArchiveEntry6.setGroupId((long) (byte) 10);
        boolean boolean13 = tarArchiveEntry6.isBlockDevice();
        tarArchiveEntry6.setUserId(100L);
        boolean boolean16 = tarArchiveEntry3.isDescendent(tarArchiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long20 = tarArchiveEntry19.getSize();
        tarArchiveEntry19.setUserId((int) (byte) 10);
        boolean boolean23 = tarArchiveEntry19.isCheckSumOK();
        tarArchiveEntry19.setModTime((long) 1);
        boolean boolean26 = tarArchiveEntry6.equals(tarArchiveEntry19);
        java.lang.String str27 = tarArchiveEntry6.getUserName();
        tarArchiveEntry6.setUserId((long) 'a');
        boolean boolean30 = tarArchiveEntry6.isFIFO();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        long long10 = tarArchiveEntry2.getSize();
        int int11 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setSize((long) (byte) 53);
        tarArchiveEntry2.setUserName("");
        boolean boolean14 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setIds(0, (int) (short) 1);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 100, (byte) 52, (byte) 48, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "218) test1922(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "108) test1922(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 100, (byte) 52, (byte) 48, (byte) 120 });
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", true);
        boolean boolean3 = tarArchiveEntry2.isPaxGNUSparse();
        tarArchiveEntry2.setName("00");
        boolean boolean6 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserName("ustar\000");
        java.lang.String str11 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "219) test1924(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "109) test1924(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ustar " + "'", str11, "ustar ");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str4 = tarArchiveEntry2.getUserName();
        boolean boolean5 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long9 = tarArchiveEntry8.getSize();
        tarArchiveEntry8.setUserId((int) (byte) 10);
        boolean boolean12 = tarArchiveEntry8.isGlobalPaxHeader();
        tarArchiveEntry8.setGroupId((long) (byte) 10);
        boolean boolean15 = tarArchiveEntry8.isBlockDevice();
        tarArchiveEntry8.setUserId(100L);
        java.util.Date date18 = tarArchiveEntry8.getModTime();
        int int19 = tarArchiveEntry8.getUserId();
        boolean boolean20 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        java.lang.String str21 = tarArchiveEntry2.getLinkName();
        java.lang.String str22 = tarArchiveEntry2.getName();
        long long23 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setUserId((int) (byte) 50);
        tarArchiveEntry2.setGroupName(" \000");
        tarArchiveEntry2.setUserName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "220) test1925(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ustar " + "'", str22, "ustar ");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray7 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setMode(32);
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        boolean boolean11 = tarArchiveEntry2.isFile();
        boolean boolean12 = tarArchiveEntry2.isPaxGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray13 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str14 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertNotNull(date5);
// flaky "221) test1926(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray7);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray7, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date10);
// flaky "110) test1926(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray13);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray13, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        long long6 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        tarArchiveEntry2.setGroupId(32L);
        tarArchiveEntry2.setUserId((int) (byte) 76);
        boolean boolean14 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setMode(6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "222) test1928(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "111) test1928(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setModTime((long) (byte) 49);
        long long13 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setModTime((long) 48);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        boolean boolean14 = tarArchiveEntry2.isOldGNUSparse();
        int int15 = tarArchiveEntry2.getDevMajor();
        boolean boolean16 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setIds((int) (byte) 0, 508);
        tarArchiveEntry2.setName("\000\000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "223) test1930(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 75);
        long long3 = tarArchiveEntry2.getLongGroupId();
        java.io.File file4 = tarArchiveEntry2.getFile();
        java.io.File file5 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 120, (byte) 10, (byte) 51, (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 120, (byte) 10, (byte) 51, (byte) 54 });
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setUserId((long) (-1));
        tarArchiveEntry2.setUserId(32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        int int9 = tarArchiveEntry2.getUserId();
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        int int11 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setLinkName("././@LongLink");
        tarArchiveEntry2.setGroupId((long) (byte) 83);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33188 + "'", int11 == 33188);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupId((long) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "224) test1935(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "112) test1935(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        tarArchiveEntry2.setGroupId((long) (byte) 100);
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean12 = tarArchiveEntry2.isGNUSparse();
        java.lang.String str13 = tarArchiveEntry2.getLinkName();
        int int14 = tarArchiveEntry2.getMode();
        long long15 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserName("00");
        tarArchiveEntry2.setUserId(504);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "225) test1936(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "113) test1936(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33188 + "'", int14 == 33188);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setMode(1000);
        boolean boolean14 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setModTime((long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry12.setMode((int) '#');
        boolean boolean15 = tarArchiveEntry2.equals(tarArchiveEntry12);
        boolean boolean16 = tarArchiveEntry2.isFIFO();
        boolean boolean17 = tarArchiveEntry2.isLink();
        int int18 = tarArchiveEntry2.getUserId();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry2.setName("");
        java.lang.String str14 = tarArchiveEntry2.getUserName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean18 = tarArchiveEntry17.isGlobalPaxHeader();
        boolean boolean19 = tarArchiveEntry17.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", true);
        boolean boolean23 = tarArchiveEntry17.equals(tarArchiveEntry22);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry26 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date27 = tarArchiveEntry26.getLastModifiedDate();
        boolean boolean28 = tarArchiveEntry26.isCharacterDevice();
        tarArchiveEntry26.setUserName("hi!");
        boolean boolean31 = tarArchiveEntry26.isStarSparse();
        boolean boolean32 = tarArchiveEntry26.isGNULongLinkEntry();
        boolean boolean33 = tarArchiveEntry26.isFile();
        boolean boolean34 = tarArchiveEntry17.isDescendent(tarArchiveEntry26);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray35 = tarArchiveEntry26.getDirectoryEntries();
        boolean boolean36 = tarArchiveEntry26.isCharacterDevice();
        boolean boolean37 = tarArchiveEntry2.isDescendent(tarArchiveEntry26);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry40 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date41 = tarArchiveEntry40.getLastModifiedDate();
        boolean boolean42 = tarArchiveEntry40.isCharacterDevice();
        tarArchiveEntry40.setUserName("hi!");
        boolean boolean45 = tarArchiveEntry40.isStarSparse();
        boolean boolean46 = tarArchiveEntry40.isSymbolicLink();
        boolean boolean47 = tarArchiveEntry40.isLink();
        java.io.File file48 = tarArchiveEntry40.getFile();
        java.lang.String str49 = tarArchiveEntry40.getGroupName();
        boolean boolean50 = tarArchiveEntry40.isSymbolicLink();
        java.lang.String str51 = tarArchiveEntry40.getName();
        boolean boolean52 = tarArchiveEntry26.equals(tarArchiveEntry40);
        boolean boolean53 = tarArchiveEntry26.isGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "226) test1939(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "114) test1939(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date27);
// flaky "33) test1939(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray35);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray35, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(date41);
// flaky "10) test1939(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(file48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ustar " + "'", str51, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        long long5 = tarArchiveEntry3.getLongGroupId();
        int int6 = tarArchiveEntry3.getDevMajor();
        tarArchiveEntry3.setGroupId(32);
        tarArchiveEntry3.setIds((int) (byte) 52, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setDevMinor(257);
        tarArchiveEntry2.setName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        java.util.Date date18 = tarArchiveEntry14.getModTime();
        tarArchiveEntry14.setUserId((long) '#');
        boolean boolean21 = tarArchiveEntry14.isCheckSumOK();
        long long22 = tarArchiveEntry14.getLongUserId();
        boolean boolean23 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry14);
        boolean boolean24 = tarArchiveEntry2.isBlockDevice();
        long long25 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setGroupName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray28 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "227) test1941(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "115) test1941(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray28);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray28, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserId(12);
        tarArchiveEntry2.setUserId((long) (byte) 51);
        boolean boolean11 = tarArchiveEntry2.isLink();
        boolean boolean12 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "228) test1942(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setNames("", "tar\000");
        org.junit.Assert.assertNotNull(date3);
// flaky "229) test1943(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean13 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean14 = tarArchiveEntry2.isFIFO();
        boolean boolean15 = tarArchiveEntry2.isSparse();
        int int16 = tarArchiveEntry2.getUserId();
        byte[] byteArray23 = new byte[] { (byte) 83, (byte) 54, (byte) 100, (byte) 75, (byte) 75, (byte) 51 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray23, zipEncoding24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 83, (byte) 54, (byte) 100, (byte) 75, (byte) 75, (byte) 51 });
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("ustar\000");
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        boolean boolean10 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date13 = tarArchiveEntry12.getLastModifiedDate();
        boolean boolean14 = tarArchiveEntry12.isCharacterDevice();
        tarArchiveEntry12.setUserName("hi!");
        tarArchiveEntry12.setGroupName("");
        java.util.Date date19 = tarArchiveEntry12.getModTime();
        boolean boolean20 = tarArchiveEntry12.isGNULongLinkEntry();
        boolean boolean21 = tarArchiveEntry12.isPaxHeader();
        java.util.Date date22 = tarArchiveEntry12.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date22);
        tarArchiveEntry2.setMode(8);
        boolean boolean26 = tarArchiveEntry2.isExtended();
        boolean boolean27 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "230) test1946(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "116) test1946(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "34) test1946(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date12 = tarArchiveEntry11.getLastModifiedDate();
        boolean boolean13 = tarArchiveEntry11.isCharacterDevice();
        tarArchiveEntry11.setUserName("hi!");
        tarArchiveEntry11.setDevMinor(257);
        boolean boolean18 = tarArchiveEntry2.equals(tarArchiveEntry11);
        boolean boolean19 = tarArchiveEntry2.isSparse();
        boolean boolean20 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean21 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "231) test1947(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setUserId((int) (byte) 1);
        tarArchiveEntry2.setGroupId((long) 0);
        tarArchiveEntry2.setNames("hi!", "00");
        java.lang.Class<?> wildcardClass14 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        boolean boolean14 = tarArchiveEntry2.isOldGNUSparse();
        int int15 = tarArchiveEntry2.getDevMajor();
        boolean boolean16 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Date date17 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "232) test1949(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "117) test1949(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:33 ICT 2026");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isPaxGNUSparse();
        java.io.File file17 = tarArchiveEntry13.getFile();
        boolean boolean18 = tarArchiveEntry13.isPaxGNUSparse();
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry13);
        boolean boolean20 = tarArchiveEntry2.isSymbolicLink();
        long long21 = tarArchiveEntry2.getRealSize();
        int int22 = tarArchiveEntry2.getDevMajor();
        boolean boolean23 = tarArchiveEntry2.isExtended();
        java.lang.String str24 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "233) test1950(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "118) test1950(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long13 = tarArchiveEntry12.getSize();
        tarArchiveEntry12.setUserId((int) (byte) 10);
        boolean boolean16 = tarArchiveEntry12.isGlobalPaxHeader();
        tarArchiveEntry12.setGroupId((long) (byte) 10);
        tarArchiveEntry12.setDevMinor(504);
        boolean boolean21 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean22 = tarArchiveEntry2.equals(tarArchiveEntry12);
        java.lang.String str23 = tarArchiveEntry12.getLinkName();
        int int24 = tarArchiveEntry12.getGroupId();
        java.util.Date date25 = tarArchiveEntry12.getLastModifiedDate();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry12.fillGNUSparse0xData(strMap26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "234) test1951(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "119) test1951(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(date25);
// flaky "35) test1951(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:33 ICT 2026");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setNames("0\000", "");
        tarArchiveEntry2.setSize((long) 'a');
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 55, (byte) 55 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray19, zipEncoding20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 55, (byte) 55 });
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        int int10 = tarArchiveEntry2.getDevMinor();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setDevMajor(257);
        int int15 = tarArchiveEntry2.getGroupId();
        java.lang.String str16 = tarArchiveEntry2.getLinkName();
        boolean boolean17 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray18 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray18);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray18, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        int int9 = tarArchiveEntry2.getDevMinor();
        boolean boolean10 = tarArchiveEntry2.isStarSparse();
        boolean boolean11 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "235) test1954(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        byte[] byteArray2 = new byte[] { (byte) 76, (byte) 52 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 76, (byte) 52 });
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId((int) (byte) 48);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        boolean boolean17 = tarArchiveEntry14.isDirectory();
        tarArchiveEntry14.setSize((long) 504);
        boolean boolean20 = tarArchiveEntry14.isSparse();
        boolean boolean21 = tarArchiveEntry14.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long25 = tarArchiveEntry24.getSize();
        tarArchiveEntry24.setUserId((int) (byte) 10);
        boolean boolean28 = tarArchiveEntry24.isGlobalPaxHeader();
        tarArchiveEntry24.setGroupId((long) (byte) 10);
        long long31 = tarArchiveEntry24.getLongUserId();
        tarArchiveEntry24.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date35 = tarArchiveEntry24.getModTime();
        tarArchiveEntry14.setModTime(date35);
        boolean boolean37 = tarArchiveEntry14.isSymbolicLink();
        boolean boolean38 = tarArchiveEntry2.isDescendent(tarArchiveEntry14);
        long long39 = tarArchiveEntry2.getLongGroupId();
        byte[] byteArray43 = new byte[] { (byte) 88, (byte) 48, (byte) 55 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding44 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray43, zipEncoding44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(date35);
// flaky "236) test1956(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date35.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 88, (byte) 48, (byte) 55 });
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.lang.String str7 = tarArchiveEntry2.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean12 = tarArchiveEntry11.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean16 = tarArchiveEntry15.isGlobalPaxHeader();
        java.lang.String str17 = tarArchiveEntry15.getUserName();
        boolean boolean18 = tarArchiveEntry11.isDescendent(tarArchiveEntry15);
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry15);
        tarArchiveEntry15.setIds((int) (short) 100, 0);
        tarArchiveEntry15.setUserId(155);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "237) test1957(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "120) test1957(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 48, true);
        tarArchiveEntry3.setDevMajor(512);
        boolean boolean6 = tarArchiveEntry3.isPaxGNUSparse();
        byte[] byteArray7 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setSize((long) (byte) 53);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        tarArchiveEntry14.setSize((long) (byte) 10);
        boolean boolean20 = tarArchiveEntry14.isOldGNUSparse();
        boolean boolean21 = tarArchiveEntry2.equals(tarArchiveEntry14);
        boolean boolean22 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str23 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertNotNull(date3);
// flaky "238) test1959(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "121) test1959(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setMode((int) (byte) 88);
        byte[] byteArray14 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray14, zipEncoding15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "239) test1960(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "122) test1960(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(155);
        tarArchiveEntry2.setDevMajor(0);
        tarArchiveEntry2.setGroupId((int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 55, false);
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry18);
        boolean boolean20 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserId(8L);
        tarArchiveEntry2.setDevMajor((int) (byte) 48);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "240) test1962(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        int int10 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.lang.Class<?> wildcardClass12 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setGroupName("0\000");
        java.io.File file6 = tarArchiveEntry2.getFile();
        int int7 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertNotNull(date3);
// flaky "241) test1965(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        java.util.Date date13 = tarArchiveEntry10.getModTime();
        java.util.Date date14 = tarArchiveEntry10.getModTime();
        int int15 = tarArchiveEntry10.getMode();
        tarArchiveEntry10.setNames("00", "");
        boolean boolean19 = tarArchiveEntry2.equals(tarArchiveEntry10);
        int int20 = tarArchiveEntry10.getDevMajor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long24 = tarArchiveEntry23.getSize();
        tarArchiveEntry23.setUserId((int) (byte) 10);
        boolean boolean27 = tarArchiveEntry23.isBlockDevice();
        tarArchiveEntry23.setGroupId((-1L));
        java.util.Date date30 = tarArchiveEntry23.getLastModifiedDate();
        boolean boolean31 = tarArchiveEntry10.equals((java.lang.Object) tarArchiveEntry23);
        boolean boolean32 = tarArchiveEntry10.isFIFO();
        int int33 = tarArchiveEntry10.getDevMinor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "242) test1966(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "123) test1966(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date30);
// flaky "36) test1966(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        int int11 = tarArchiveEntry2.getDevMinor();
        boolean boolean12 = tarArchiveEntry2.isSparse();
        boolean boolean13 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setGroupId(0);
        java.lang.String str16 = tarArchiveEntry2.getLinkName();
        boolean boolean17 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "243) test1967(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setUserId((int) (byte) 53);
        boolean boolean9 = tarArchiveEntry2.isFIFO();
        boolean boolean10 = tarArchiveEntry2.isFIFO();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long12 = tarArchiveEntry11.getSize();
        tarArchiveEntry11.setUserId((int) (byte) 10);
        boolean boolean15 = tarArchiveEntry11.isBlockDevice();
        tarArchiveEntry11.setGroupId((-1L));
        java.lang.String str18 = tarArchiveEntry11.getGroupName();
        boolean boolean19 = tarArchiveEntry2.equals(tarArchiveEntry11);
        tarArchiveEntry11.setUserId(16877);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.fillStarSparseData(strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "244) test1969(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setMode(1000);
        boolean boolean14 = tarArchiveEntry2.isBlockDevice();
        long long15 = tarArchiveEntry2.getRealSize();
        boolean boolean16 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean17 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean18 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str9 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int14 = tarArchiveEntry13.getGroupId();
        tarArchiveEntry13.setGroupId((long) 1);
        boolean boolean17 = tarArchiveEntry2.equals(tarArchiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date21 = tarArchiveEntry20.getLastModifiedDate();
        boolean boolean22 = tarArchiveEntry20.isCharacterDevice();
        tarArchiveEntry20.setUserName("hi!");
        tarArchiveEntry20.setGroupName("");
        java.util.Date date27 = tarArchiveEntry20.getModTime();
        boolean boolean28 = tarArchiveEntry20.isGNULongLinkEntry();
        boolean boolean29 = tarArchiveEntry20.isPaxHeader();
        java.util.Date date30 = tarArchiveEntry20.getModTime();
        tarArchiveEntry2.setModTime(date30);
        boolean boolean32 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "245) test1971(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "124) test1971(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky "37) test1971(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date27);
// flaky "11) test1971(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date30);
// flaky "5) test1971(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        int int2 = tarArchiveEntry1.getUserId();
        java.lang.String str3 = tarArchiveEntry1.getGroupName();
        tarArchiveEntry1.setSize((long) 8);
        long long6 = tarArchiveEntry1.getSize();
        boolean boolean7 = tarArchiveEntry1.isPaxHeader();
        java.io.File file8 = tarArchiveEntry1.getFile();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8L + "'", long6 == 8L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(file8);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setUserId((int) '#');
        boolean boolean14 = tarArchiveEntry10.isStarSparse();
        boolean boolean15 = tarArchiveEntry10.isGNULongNameEntry();
        boolean boolean16 = tarArchiveEntry10.isSparse();
        java.lang.String str17 = tarArchiveEntry10.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "246) test1973(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "125) test1973(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        int int10 = tarArchiveEntry2.getDevMinor();
        boolean boolean11 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        byte[] byteArray6 = new byte[] { (byte) 53, (byte) 103, (byte) 0, (byte) 54, (byte) 75, (byte) 55 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 53, (byte) 103, (byte) 0, (byte) 54, (byte) 75, (byte) 55 });
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        java.util.Date date3 = tarArchiveEntry2.getModTime();
        boolean boolean4 = tarArchiveEntry2.isSymbolicLink();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "247) test1977(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date12 = tarArchiveEntry11.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date12);
        boolean boolean14 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean15 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "248) test1978(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "126) test1978(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        long long3 = tarArchiveEntry2.getRealSize();
        java.lang.String str4 = tarArchiveEntry2.getLinkName();
        java.lang.String str5 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setModTime(0L);
        tarArchiveEntry2.setModTime((long) '4');
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        int int11 = tarArchiveEntry2.getDevMajor();
        boolean boolean12 = tarArchiveEntry2.isDirectory();
        int int13 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(257);
        int int11 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 257 + "'", int11 == 257);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(35L);
        java.util.Date date14 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserName("ustar\000");
        tarArchiveEntry2.setGroupId(2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(date14);
// flaky "249) test1982(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:33 ICT 2026");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.lang.String str6 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000");
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date9);
        byte[] byteArray14 = new byte[] { (byte) 53, (byte) 88, (byte) 53 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar " + "'", str6, "ustar ");
        org.junit.Assert.assertNotNull(date9);
// flaky "250) test1983(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 53, (byte) 88, (byte) 53 });
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        boolean boolean12 = tarArchiveEntry9.isPaxGNUSparse();
        boolean boolean13 = tarArchiveEntry9.isFile();
        boolean boolean14 = tarArchiveEntry9.isFile();
        java.util.Date date15 = tarArchiveEntry9.getLastModifiedDate();
        java.util.Date date16 = tarArchiveEntry9.getModTime();
        boolean boolean17 = tarArchiveEntry2.isDescendent(tarArchiveEntry9);
        boolean boolean18 = tarArchiveEntry9.isLink();
        long long19 = tarArchiveEntry9.getRealSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(date15);
// flaky "251) test1984(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "127) test1984(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        byte[] byteArray4 = new byte[] { (byte) 51, (byte) 55, (byte) 75, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 51, (byte) 55, (byte) 75, (byte) 10 });
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        int int10 = tarArchiveEntry2.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        boolean boolean12 = tarArchiveEntry2.isDirectory();
        boolean boolean13 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setLinkName("");
        org.junit.Assert.assertNotNull(date3);
// flaky "252) test1986(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 53, true);
        int int4 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setMode((int) (short) -1);
        tarArchiveEntry3.setModTime((long) 33188);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getUserName();
        boolean boolean12 = tarArchiveEntry2.isFile();
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setModTime(date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        long long10 = tarArchiveEntry2.getSize();
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setGroupName("");
        java.util.Date date14 = tarArchiveEntry2.getModTime();
        boolean boolean15 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date14);
// flaky "253) test1989(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean12 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId((long) 33188);
        tarArchiveEntry2.setLinkName("ustar ");
        long long17 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 33188L + "'", long17 == 33188L);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean5 = tarArchiveEntry2.isFile();
        boolean boolean6 = tarArchiveEntry2.isDirectory();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setMode(83);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
// flaky "254) test1991(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setIds(31, 16877);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long16 = tarArchiveEntry15.getSize();
        tarArchiveEntry15.setUserId((int) (byte) 10);
        boolean boolean19 = tarArchiveEntry15.isGlobalPaxHeader();
        tarArchiveEntry15.setGroupId((long) (byte) 10);
        boolean boolean22 = tarArchiveEntry15.isBlockDevice();
        tarArchiveEntry15.setUserId(100L);
        boolean boolean25 = tarArchiveEntry15.isSymbolicLink();
        boolean boolean26 = tarArchiveEntry2.isDescendent(tarArchiveEntry15);
        boolean boolean27 = tarArchiveEntry2.isLink();
        boolean boolean28 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 75);
        tarArchiveEntry2.setMode(155);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isLink();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str13 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setSize((long) 10240);
        boolean boolean16 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        java.io.File file8 = tarArchiveEntry2.getFile();
        boolean boolean9 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean10 = tarArchiveEntry2.isBlockDevice();
        boolean boolean11 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        boolean boolean12 = tarArchiveEntry9.isDirectory();
        tarArchiveEntry9.setSize((long) 504);
        boolean boolean15 = tarArchiveEntry9.isSparse();
        boolean boolean16 = tarArchiveEntry9.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long20 = tarArchiveEntry19.getSize();
        tarArchiveEntry19.setUserId((int) (byte) 10);
        boolean boolean23 = tarArchiveEntry19.isGlobalPaxHeader();
        tarArchiveEntry19.setGroupId((long) (byte) 10);
        long long26 = tarArchiveEntry19.getLongUserId();
        tarArchiveEntry19.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date30 = tarArchiveEntry19.getModTime();
        tarArchiveEntry9.setModTime(date30);
        boolean boolean32 = tarArchiveEntry3.equals((java.lang.Object) tarArchiveEntry9);
        boolean boolean33 = tarArchiveEntry9.isGNULongNameEntry();
        boolean boolean34 = tarArchiveEntry9.isSymbolicLink();
        long long35 = tarArchiveEntry9.getSize();
        boolean boolean36 = tarArchiveEntry9.isLink();
        java.lang.Class<?> wildcardClass37 = tarArchiveEntry9.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(date30);
// flaky "255) test1996(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 504L + "'", long35 == 504L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 76);
        java.lang.String str3 = tarArchiveEntry2.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long7 = tarArchiveEntry6.getSize();
        tarArchiveEntry6.setUserId((int) (byte) 10);
        boolean boolean10 = tarArchiveEntry6.isGlobalPaxHeader();
        tarArchiveEntry6.setGroupId((long) (byte) 10);
        boolean boolean13 = tarArchiveEntry6.isBlockDevice();
        tarArchiveEntry6.setUserId(100L);
        java.util.Date date16 = tarArchiveEntry6.getModTime();
        tarArchiveEntry6.setMode((-1));
        boolean boolean19 = tarArchiveEntry6.isStarSparse();
        boolean boolean20 = tarArchiveEntry2.equals(tarArchiveEntry6);
        boolean boolean21 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date16);
// flaky "256) test1997(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        tarArchiveEntry2.setSize((long) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        boolean boolean13 = tarArchiveEntry10.isDirectory();
        tarArchiveEntry10.setSize((long) 504);
        boolean boolean16 = tarArchiveEntry10.isSparse();
        tarArchiveEntry10.setName("ustar ");
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        boolean boolean20 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean21 = tarArchiveEntry2.isGNULongLinkEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int26 = tarArchiveEntry25.getGroupId();
        boolean boolean27 = tarArchiveEntry25.isSymbolicLink();
        tarArchiveEntry25.setGroupName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry32 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean33 = tarArchiveEntry32.isGlobalPaxHeader();
        boolean boolean34 = tarArchiveEntry32.isFile();
        java.util.Date date35 = tarArchiveEntry32.getModTime();
        java.util.Date date36 = tarArchiveEntry32.getModTime();
        boolean boolean37 = tarArchiveEntry25.equals((java.lang.Object) date36);
        tarArchiveEntry2.setModTime(date36);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(date35);
// flaky "257) test1998(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date35.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date36);
// flaky "128) test1998(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date36.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", true);
        boolean boolean8 = tarArchiveEntry2.equals(tarArchiveEntry7);
        java.util.Date date9 = tarArchiveEntry7.getLastModifiedDate();
        long long10 = tarArchiveEntry7.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "258) test1999(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setUserId((int) '#');
        boolean boolean14 = tarArchiveEntry10.isStarSparse();
        boolean boolean15 = tarArchiveEntry10.isGNULongNameEntry();
        tarArchiveEntry10.setUserId(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "259) test2000(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "129) test2000(org.apache.commons.compress.archivers.tar.RegressionTest3)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:33 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }
}
