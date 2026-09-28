package org.apache.commons.compress.archivers.tar;

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
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 55, (byte) 1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 55, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setModTime((long) (byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        boolean boolean17 = tarArchiveEntry14.isPaxGNUSparse();
        boolean boolean18 = tarArchiveEntry14.isFile();
        boolean boolean19 = tarArchiveEntry14.isFile();
        java.util.Date date20 = tarArchiveEntry14.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date24 = tarArchiveEntry23.getLastModifiedDate();
        tarArchiveEntry14.setModTime(date24);
        tarArchiveEntry2.setModTime(date24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date20);
// flaky "1) test2502(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date24);
// flaky "1) test2502(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:38 ICT 2026");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        long long5 = tarArchiveEntry2.getRealSize();
        boolean boolean6 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setGroupId((long) (byte) 120);
        tarArchiveEntry2.setDevMinor(83);
        org.junit.Assert.assertNotNull(date3);
// flaky "2) test2503(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setUserName("\000\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry3.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date14 = tarArchiveEntry13.getLastModifiedDate();
        boolean boolean15 = tarArchiveEntry13.isCharacterDevice();
        tarArchiveEntry13.setGroupId(12);
        boolean boolean18 = tarArchiveEntry3.equals((java.lang.Object) 12);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean22 = tarArchiveEntry21.isGlobalPaxHeader();
        boolean boolean23 = tarArchiveEntry21.isFile();
        java.util.Date date24 = tarArchiveEntry21.getModTime();
        java.util.Date date25 = tarArchiveEntry21.getModTime();
        boolean boolean26 = tarArchiveEntry21.isOldGNUSparse();
        tarArchiveEntry21.setDevMinor(0);
        java.lang.String str29 = tarArchiveEntry21.getLinkName();
        boolean boolean30 = tarArchiveEntry21.isCharacterDevice();
        boolean boolean31 = tarArchiveEntry21.isSparse();
        boolean boolean32 = tarArchiveEntry21.isExtended();
        boolean boolean33 = tarArchiveEntry21.isSparse();
        boolean boolean34 = tarArchiveEntry3.isDescendent(tarArchiveEntry21);
        boolean boolean35 = tarArchiveEntry3.isGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date14);
// flaky "3) test2504(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(date24);
// flaky "2) test2504(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date25);
// flaky "1) test2504(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        java.io.File file25 = tarArchiveEntry2.getFile();
        boolean boolean26 = tarArchiveEntry2.isGNUSparse();
        java.lang.Class<?> wildcardClass27 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(date14);
// flaky "4) test2505(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ustar\000" + "'", str22, "ustar\000");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray23);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray23, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry18.setMode((int) '#');
        tarArchiveEntry18.setModTime((long) 155);
        tarArchiveEntry18.setGroupId(3);
        boolean boolean25 = tarArchiveEntry2.equals(tarArchiveEntry18);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date30 = tarArchiveEntry29.getLastModifiedDate();
        tarArchiveEntry29.setDevMajor((int) (byte) 0);
        boolean boolean33 = tarArchiveEntry27.equals((java.lang.Object) (byte) 0);
        boolean boolean34 = tarArchiveEntry18.equals((java.lang.Object) (byte) 0);
        boolean boolean35 = tarArchiveEntry18.isPaxGNUSparse();
        boolean boolean36 = tarArchiveEntry18.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date30);
// flaky "5) test2506(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        tarArchiveEntry2.setIds(131, (int) (byte) 120);
        byte[] byteArray19 = new byte[] { (byte) 88, (byte) 54, (byte) 48, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray19, zipEncoding20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "6) test2507(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "3) test2507(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 88, (byte) 54, (byte) 48, (byte) 103 });
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        tarArchiveEntry2.setNames("\000\000", "00");
        tarArchiveEntry2.setUserName("tar\000");
        tarArchiveEntry2.setGroupId(0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "7) test2508(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "4) test2508(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) -1);
        long long3 = tarArchiveEntry2.getLongGroupId();
        long long4 = tarArchiveEntry2.getSize();
        long long5 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 76);
        java.lang.Class<?> wildcardClass3 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        boolean boolean17 = tarArchiveEntry2.isOldGNUSparse();
        int int18 = tarArchiveEntry2.getDevMajor();
        tarArchiveEntry2.setIds(155, 0);
        boolean boolean22 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertNotNull(date3);
// flaky "8) test2511(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "5) test2511(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "2) test2511(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        tarArchiveEntry2.setModTime(48L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "9) test2512(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "6) test2512(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        tarArchiveEntry2.setLinkName("hi!");
        long long18 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "10) test2513(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean8 = tarArchiveEntry3.isFile();
        boolean boolean9 = tarArchiveEntry3.isFile();
        long long10 = tarArchiveEntry3.getRealSize();
        boolean boolean11 = tarArchiveEntry3.isExtended();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        java.lang.String str25 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "11) test2515(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "7) test2515(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        boolean boolean7 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserId((int) '#');
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertNotNull(date5);
// flaky "12) test2516(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        java.io.File file15 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "13) test2517(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "8) test2517(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setLinkName("././@LongLink");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "14) test2518(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(35L);
        boolean boolean14 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean15 = tarArchiveEntry2.isPaxHeader();
        boolean boolean16 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        java.lang.Class<?> wildcardClass22 = tarArchiveEntry11.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "15) test2520(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        tarArchiveEntry12.setGroupId(10240);
        tarArchiveEntry12.setDevMajor(263);
        java.util.Date date20 = tarArchiveEntry12.getModTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky "16) test2521(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:38 ICT 2026");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        long long5 = tarArchiveEntry2.getRealSize();
        tarArchiveEntry2.setLinkName("0\000");
        boolean boolean8 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertNotNull(date3);
// flaky "17) test2522(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long26 = tarArchiveEntry25.getSize();
        tarArchiveEntry25.setUserId((int) (byte) 10);
        boolean boolean29 = tarArchiveEntry25.isGlobalPaxHeader();
        boolean boolean30 = tarArchiveEntry25.isGNULongNameEntry();
        long long31 = tarArchiveEntry25.getLongGroupId();
        boolean boolean32 = tarArchiveEntry25.isPaxGNUSparse();
        boolean boolean33 = tarArchiveEntry16.equals(tarArchiveEntry25);
        int int34 = tarArchiveEntry16.getMode();
        boolean boolean35 = tarArchiveEntry16.isSparse();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "18) test2523(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "9) test2523(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 49, (byte) 52, (byte) 103, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 49, (byte) 52, (byte) 103, (byte) 103 });
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        boolean boolean7 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean8 = tarArchiveEntry2.isFIFO();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        java.lang.String str21 = tarArchiveEntry8.getName();
        tarArchiveEntry8.setUserId(8589934591L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "19) test2526(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ustar " + "'", str21, "ustar ");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        long long22 = tarArchiveEntry2.getLongGroupId();
        boolean boolean23 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "20) test2527(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setUserId(0L);
        tarArchiveEntry3.setMode((int) (byte) 88);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean12 = tarArchiveEntry11.isGlobalPaxHeader();
        boolean boolean13 = tarArchiveEntry11.isPaxGNUSparse();
        boolean boolean14 = tarArchiveEntry3.equals((java.lang.Object) boolean13);
        java.lang.Class<?> wildcardClass15 = tarArchiveEntry3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 53, true);
        boolean boolean4 = tarArchiveEntry3.isSymbolicLink();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setIds((int) (byte) 48, (int) (short) 10);
        int int13 = tarArchiveEntry2.getGroupId();
        int int14 = tarArchiveEntry2.getUserId();
        int int15 = tarArchiveEntry2.getDevMajor();
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 103, (byte) -1, (byte) -1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray20, zipEncoding21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 103, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean5 = tarArchiveEntry2.isFile();
        boolean boolean6 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
// flaky "21) test2531(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean17 = tarArchiveEntry16.isGlobalPaxHeader();
        boolean boolean18 = tarArchiveEntry16.isFile();
        java.lang.String str19 = tarArchiveEntry16.getName();
        tarArchiveEntry16.setLinkName("00");
        long long22 = tarArchiveEntry16.getLongGroupId();
        int int23 = tarArchiveEntry16.getMode();
        boolean boolean24 = tarArchiveEntry2.equals(tarArchiveEntry16);
        tarArchiveEntry2.setDevMajor((int) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "22) test2532(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ustar " + "'", str19, "ustar ");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 33188 + "'", int23 == 33188);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        tarArchiveEntry12.setLinkName("././@LongLink");
        int int21 = tarArchiveEntry12.getMode();
        boolean boolean22 = tarArchiveEntry12.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        tarArchiveEntry2.setUserId(131);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        java.util.Date date20 = tarArchiveEntry19.getModTime();
        boolean boolean21 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry19);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky "23) test2534(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000");
        tarArchiveEntry1.setDevMajor((int) (byte) 48);
        long long4 = tarArchiveEntry1.getLongUserId();
        boolean boolean5 = tarArchiveEntry1.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setNames("0\000", "");
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupId(31);
        tarArchiveEntry2.setGroupName("00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(155);
        int int11 = tarArchiveEntry2.getMode();
        java.util.Date date12 = tarArchiveEntry2.getLastModifiedDate();
        java.io.File file13 = tarArchiveEntry2.getFile();
        java.util.Date date14 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33188 + "'", int11 == 33188);
        org.junit.Assert.assertNotNull(date12);
// flaky "24) test2537(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNotNull(date14);
// flaky "10) test2537(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:38 ICT 2026");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setGroupId((long) 1);
        long long7 = tarArchiveEntry3.getRealSize();
        long long8 = tarArchiveEntry3.getSize();
        boolean boolean9 = tarArchiveEntry3.isFIFO();
        long long10 = tarArchiveEntry3.getLongUserId();
        int int11 = tarArchiveEntry3.getMode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33188 + "'", int11 == 33188);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 10, false);
        tarArchiveEntry3.setGroupId((int) '4');
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillStarSparseData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setUserName("00");
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 1);
        tarArchiveEntry2.setNames(" \000", "\000\000");
        boolean boolean6 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 76, false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        boolean boolean6 = tarArchiveEntry3.isGlobalPaxHeader();
        java.lang.String str7 = tarArchiveEntry3.getName();
        boolean boolean8 = tarArchiveEntry3.isLink();
        boolean boolean9 = tarArchiveEntry3.isLink();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0\000" + "'", str7, "0\000");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        java.io.File file24 = tarArchiveEntry12.getFile();
        long long25 = tarArchiveEntry12.getRealSize();
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
// flaky "25) test2544(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "11) test2544(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        java.util.Date date5 = tarArchiveEntry3.getLastModifiedDate();
        long long6 = tarArchiveEntry3.getLongGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        java.util.Date date12 = tarArchiveEntry9.getModTime();
        java.util.Date date13 = tarArchiveEntry9.getModTime();
        tarArchiveEntry9.setUserId((long) '#');
        boolean boolean16 = tarArchiveEntry9.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long20 = tarArchiveEntry19.getSize();
        tarArchiveEntry19.setUserId((int) (byte) 10);
        boolean boolean23 = tarArchiveEntry19.isGlobalPaxHeader();
        tarArchiveEntry19.setGroupId((long) (byte) 10);
        tarArchiveEntry19.setDevMinor(504);
        boolean boolean28 = tarArchiveEntry19.isGlobalPaxHeader();
        boolean boolean29 = tarArchiveEntry9.equals(tarArchiveEntry19);
        java.util.Date date30 = tarArchiveEntry19.getModTime();
        tarArchiveEntry3.setModTime(date30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky "26) test2545(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(date12);
// flaky "12) test2545(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date13);
// flaky "3) test2545(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date30);
// flaky "1) test2545(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:38 ICT 2026");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setSize((long) (byte) 53);
        tarArchiveEntry2.setUserId((long) (short) 100);
        boolean boolean14 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertNotNull(date3);
// flaky "27) test2546(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "13) test2546(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 83);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry6.setGroupId((-1));
        boolean boolean9 = tarArchiveEntry2.equals((java.lang.Object) (-1));
        tarArchiveEntry2.setGroupId((long) (short) 10);
        boolean boolean12 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setGroupId(10240);
        boolean boolean15 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setUserName("");
        java.lang.String str7 = tarArchiveEntry3.getGroupName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setGroupId(148);
        boolean boolean11 = tarArchiveEntry2.isFIFO();
        java.util.Date date12 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "28) test2549(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "14) test2549(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "4) test2549(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:38 ICT 2026");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        boolean boolean6 = tarArchiveEntry3.isSparse();
        long long7 = tarArchiveEntry3.getRealSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        byte[] byteArray17 = new byte[] { (byte) 83, (byte) 54, (byte) 100, (byte) 75, (byte) 50, (byte) 51 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray17, zipEncoding18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "29) test2551(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "15) test2551(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 83, (byte) 54, (byte) 100, (byte) 75, (byte) 50, (byte) 51 });
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        tarArchiveEntry11.setLinkName(" \000");
        boolean boolean23 = tarArchiveEntry11.isGNUSparse();
        boolean boolean24 = tarArchiveEntry11.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
// flaky "30) test2552(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "16) test2552(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 0, false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setNames("0\000", "");
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry12.setLinkName("tar\000");
        boolean boolean15 = tarArchiveEntry12.isDirectory();
        java.util.Date date16 = tarArchiveEntry12.getLastModifiedDate();
        java.util.Date date17 = tarArchiveEntry12.getModTime();
        boolean boolean18 = tarArchiveEntry12.isCheckSumOK();
        boolean boolean19 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry12);
        tarArchiveEntry12.setName("\000\000");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date16);
// flaky "31) test2554(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date17);
// flaky "17) test2554(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        int int8 = tarArchiveEntry2.getDevMajor();
        java.util.Date date9 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setName("././@LongLink");
        tarArchiveEntry2.setSize((long) (short) 1);
        tarArchiveEntry2.setName("././@LongLink");
        long long16 = tarArchiveEntry2.getLongUserId();
        boolean boolean17 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setMode(10240);
        org.junit.Assert.assertNotNull(date3);
// flaky "32) test2555(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(date9);
// flaky "18) test2555(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "33) test2556(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setSize(2097151L);
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setNames("tar\000", "\000\000");
        tarArchiveEntry2.setUserId((long) (byte) 51);
        org.junit.Assert.assertNotNull(date3);
// flaky "34) test2557(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray14 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean15 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "35) test2558(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray14);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray14, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        byte[] byteArray5 = new byte[] { (byte) 120, (byte) 49, (byte) 49, (byte) 50, (byte) 52 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 120, (byte) 49, (byte) 49, (byte) 50, (byte) 52 });
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        boolean boolean58 = tarArchiveEntry10.isCheckSumOK();
        boolean boolean59 = tarArchiveEntry10.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "36) test2560(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "19) test2560(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(date27);
// flaky "5) test2560(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:38 ICT 2026");
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
// flaky "2) test2560(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date53.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date54);
// flaky "1) test2560(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date54.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        java.lang.String str7 = tarArchiveEntry2.getName();
        boolean boolean8 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertNotNull(date3);
// flaky "37) test2561(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ustar " + "'", str7, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isCharacterDevice();
        java.util.Date date8 = tarArchiveEntry3.getModTime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "38) test2562(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:38 ICT 2026");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str9 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date13 = tarArchiveEntry12.getLastModifiedDate();
        boolean boolean14 = tarArchiveEntry12.isCharacterDevice();
        tarArchiveEntry12.setUserName("hi!");
        tarArchiveEntry12.setGroupName("");
        java.util.Date date19 = tarArchiveEntry12.getModTime();
        tarArchiveEntry12.setSize((long) (byte) 53);
        tarArchiveEntry12.setUserName("");
        boolean boolean24 = tarArchiveEntry12.isOldGNUSparse();
        boolean boolean25 = tarArchiveEntry2.isDescendent(tarArchiveEntry12);
        java.io.File file26 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setIds(0, (int) (byte) -1);
        boolean boolean30 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "39) test2563(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "20) test2563(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertNotNull(date13);
// flaky "6) test2563(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "3) test2563(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        int int11 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) 48);
        int int14 = tarArchiveEntry2.getDevMajor();
        org.junit.Assert.assertNotNull(date3);
// flaky "40) test2564(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", true);
        int int3 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setMode((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        tarArchiveEntry10.setUserId(0L);
        tarArchiveEntry10.setGroupId(2097151L);
        tarArchiveEntry10.setGroupName(" \000");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 504L + "'", long16 == 504L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long12 = tarArchiveEntry11.getSize();
        tarArchiveEntry11.setUserId((int) (byte) 10);
        boolean boolean15 = tarArchiveEntry11.isGlobalPaxHeader();
        tarArchiveEntry11.setGroupId((long) (byte) 10);
        boolean boolean18 = tarArchiveEntry11.isCheckSumOK();
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry11);
        long long20 = tarArchiveEntry11.getRealSize();
        boolean boolean21 = tarArchiveEntry11.isGlobalPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry24.setGroupId(96);
        tarArchiveEntry24.setIds((int) (byte) 1, 257);
        java.util.Date date30 = tarArchiveEntry24.getModTime();
        tarArchiveEntry11.setModTime(date30);
        tarArchiveEntry11.setGroupName("hi!");
        boolean boolean34 = tarArchiveEntry11.isDirectory();
        tarArchiveEntry11.setMode(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date30);
// flaky "41) test2567(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        boolean boolean14 = tarArchiveEntry2.isGNULongLinkEntry();
        int int15 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean11 = tarArchiveEntry2.isExtended();
        boolean boolean12 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "42) test2569(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        long long10 = tarArchiveEntry2.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray11 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean12 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setUserId((int) (byte) 100);
        boolean boolean15 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray11);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray11, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 51, true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray4 = tarArchiveEntry3.getDirectoryEntries();
        org.junit.Assert.assertNotNull(tarArchiveEntryArray4);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray4, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        boolean boolean21 = tarArchiveEntry2.isCheckSumOK();
        long long22 = tarArchiveEntry2.getLongUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean26 = tarArchiveEntry25.isGlobalPaxHeader();
        boolean boolean27 = tarArchiveEntry25.isFile();
        java.util.Date date28 = tarArchiveEntry25.getModTime();
        java.util.Date date29 = tarArchiveEntry25.getModTime();
        tarArchiveEntry25.setDevMinor(0);
        boolean boolean32 = tarArchiveEntry25.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long36 = tarArchiveEntry35.getSize();
        tarArchiveEntry35.setUserId((int) (byte) 10);
        boolean boolean39 = tarArchiveEntry35.isGlobalPaxHeader();
        tarArchiveEntry35.setGroupId((long) (byte) 10);
        boolean boolean42 = tarArchiveEntry35.isBlockDevice();
        tarArchiveEntry35.setUserId(100L);
        java.util.Date date45 = tarArchiveEntry35.getModTime();
        int int46 = tarArchiveEntry35.getUserId();
        java.util.Date date47 = tarArchiveEntry35.getModTime();
        tarArchiveEntry25.setModTime(date47);
        boolean boolean49 = tarArchiveEntry2.isDescendent(tarArchiveEntry25);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "43) test2572(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "21) test2572(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "7) test2572(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date28);
// flaky "4) test2572(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date28.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertNotNull(date29);
// flaky "2) test2572(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date29.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(date45);
// flaky "1) test2572(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date45.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(date47);
// flaky "1) test2572(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date47.toString(), "Mon Sep 28 13:40:38 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        int int12 = tarArchiveEntry8.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry15.setLinkName("tar\000");
        boolean boolean18 = tarArchiveEntry15.isDirectory();
        java.util.Date date19 = tarArchiveEntry15.getLastModifiedDate();
        int int20 = tarArchiveEntry15.getMode();
        int int21 = tarArchiveEntry15.getMode();
        tarArchiveEntry15.setModTime((long) (byte) 88);
        long long24 = tarArchiveEntry15.getSize();
        boolean boolean25 = tarArchiveEntry8.isDescendent(tarArchiveEntry15);
        org.junit.Assert.assertNotNull(date3);
// flaky "44) test2573(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "22) test2573(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "8) test2573(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33188 + "'", int20 == 33188);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        tarArchiveEntry2.setIds((int) (short) 0, (int) (byte) -1);
        boolean boolean21 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "45) test2574(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "23) test2574(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33188 + "'", int14 == 33188);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        tarArchiveEntry2.setDevMajor((int) (byte) 49);
        boolean boolean18 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "46) test2575(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "24) test2575(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        tarArchiveEntry2.setSize((long) (byte) 10);
        tarArchiveEntry2.setUserId((int) (byte) 10);
        int int10 = tarArchiveEntry2.getGroupId();
        byte[] byteArray12 = new byte[] { (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12, zipEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 50 });
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setName("0\000");
        java.lang.String str5 = tarArchiveEntry2.getUserName();
        boolean boolean6 = tarArchiveEntry2.isDirectory();
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setLinkName("00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        boolean boolean17 = tarArchiveEntry2.isLink();
        int int18 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setGroupId(75);
        java.util.Date date21 = tarArchiveEntry2.getLastModifiedDate();
        long long22 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "47) test2578(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(date21);
// flaky "25) test2578(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        tarArchiveEntry11.setLinkName("00");
        tarArchiveEntry11.setName("0\000");
        boolean boolean23 = tarArchiveEntry11.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "48) test2579(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 76, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 0, (byte) 76, (byte) 54 });
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        tarArchiveEntry2.setModTime((long) 155);
        java.lang.String str7 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setModTime((long) (byte) 53);
        long long10 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isLink();
        boolean boolean9 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean10 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        tarArchiveEntry11.setNames("././@LongLink", "0\000");
        tarArchiveEntry11.setName("0\000");
        java.lang.String str24 = tarArchiveEntry11.getName();
        byte[] byteArray29 = new byte[] { (byte) 120, (byte) 48, (byte) 100, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.parseTarHeader(byteArray29, zipEncoding30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "49) test2583(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0\000" + "'", str24, "0\000");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 120, (byte) 48, (byte) 100, (byte) 88 });
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        java.lang.Class<?> wildcardClass17 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky "50) test2584(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "26) test2584(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "9) test2584(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        byte[] byteArray4 = new byte[] { (byte) 53, (byte) 103, (byte) 49, (byte) 49 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 53, (byte) 103, (byte) 49, (byte) 49 });
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        java.util.Date date17 = tarArchiveEntry2.getModTime();
        int int18 = tarArchiveEntry2.getDevMajor();
        long long19 = tarArchiveEntry2.getRealSize();
        long long20 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "51) test2586(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(date17);
// flaky "27) test2586(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        boolean boolean23 = tarArchiveEntry13.isSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "52) test2587(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "28) test2587(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
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
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long14 = tarArchiveEntry13.getSize();
        tarArchiveEntry13.setUserId((int) (byte) 10);
        boolean boolean17 = tarArchiveEntry13.isGlobalPaxHeader();
        tarArchiveEntry13.setGroupId((long) (byte) 10);
        long long20 = tarArchiveEntry13.getLongUserId();
        tarArchiveEntry13.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date24 = tarArchiveEntry13.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean28 = tarArchiveEntry27.isGlobalPaxHeader();
        boolean boolean29 = tarArchiveEntry27.isFile();
        java.lang.String str30 = tarArchiveEntry27.getName();
        tarArchiveEntry27.setLinkName("00");
        long long33 = tarArchiveEntry27.getLongGroupId();
        int int34 = tarArchiveEntry27.getMode();
        boolean boolean35 = tarArchiveEntry13.equals(tarArchiveEntry27);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry38 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long39 = tarArchiveEntry38.getSize();
        tarArchiveEntry38.setUserId((int) (byte) 10);
        boolean boolean42 = tarArchiveEntry38.isGlobalPaxHeader();
        boolean boolean43 = tarArchiveEntry38.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry46 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry46.setLinkName("tar\000");
        boolean boolean49 = tarArchiveEntry46.isDirectory();
        java.util.Date date50 = tarArchiveEntry46.getLastModifiedDate();
        java.util.Date date51 = tarArchiveEntry46.getModTime();
        tarArchiveEntry38.setModTime(date51);
        tarArchiveEntry13.setModTime(date51);
        tarArchiveEntry2.setModTime(date51);
        boolean boolean55 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "53) test2588(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "29) test2588(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(date24);
// flaky "10) test2588(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ustar " + "'", str30, "ustar ");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 33188 + "'", int34 == 33188);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(date50);
// flaky "5) test2588(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date50.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date51);
// flaky "3) test2588(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date51.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        boolean boolean16 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "54) test2589(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "30) test2589(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setLinkName("\000\000");
        tarArchiveEntry2.setMode(148);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "55) test2590(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "31) test2590(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setNames("00", "hi!");
        tarArchiveEntry3.setLinkName("");
        long long10 = tarArchiveEntry3.getLongGroupId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        long long3 = tarArchiveEntry2.getRealSize();
        java.lang.String str4 = tarArchiveEntry2.getLinkName();
        java.lang.String str5 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setModTime(0L);
        tarArchiveEntry2.setModTime((long) '4');
        tarArchiveEntry2.setUserId((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongGroupId();
        int int9 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setGroupName("ustar ");
        tarArchiveEntry2.setUserName("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 100, false);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        int int5 = tarArchiveEntry3.getMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33188 + "'", int5 == 33188);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        int int10 = tarArchiveEntry2.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 83, (byte) -1, (byte) 0, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray17, zipEncoding18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "56) test2595(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 83, (byte) -1, (byte) 0, (byte) 103 });
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        java.lang.String str9 = tarArchiveEntry7.getUserName();
        boolean boolean10 = tarArchiveEntry3.isDescendent(tarArchiveEntry7);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isDirectory();
        tarArchiveEntry13.setSize((long) 504);
        long long19 = tarArchiveEntry13.getSize();
        java.util.Date date20 = tarArchiveEntry13.getModTime();
        tarArchiveEntry3.setModTime(date20);
        boolean boolean22 = tarArchiveEntry3.isDirectory();
        tarArchiveEntry3.setGroupId((int) '#');
        tarArchiveEntry3.setIds((-1), 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 504L + "'", long19 == 504L);
        org.junit.Assert.assertNotNull(date20);
// flaky "57) test2596(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 54, true);
        tarArchiveEntry3.setLinkName("tar\000");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        byte[] byteArray5 = new byte[] { (byte) 53, (byte) 53, (byte) 53, (byte) 120, (byte) 103 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 53, (byte) 53, (byte) 53, (byte) 120, (byte) 103 });
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isGNULongLinkEntry();
        tarArchiveEntry3.setGroupId((int) (byte) 55);
        boolean boolean7 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setDevMajor((int) '4');
        byte[] byteArray10 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        byte[] byteArray4 = new byte[] { (byte) 54, (byte) 0, (byte) 51, (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 54, (byte) 0, (byte) 51, (byte) 76 });
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 83);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry6.setGroupId((-1));
        boolean boolean9 = tarArchiveEntry2.equals((java.lang.Object) (-1));
        tarArchiveEntry2.setGroupId((long) (short) 10);
        boolean boolean12 = tarArchiveEntry2.isDirectory();
        boolean boolean13 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 75);
        tarArchiveEntry2.setDevMinor((int) (byte) 54);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        tarArchiveEntry2.setName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "58) test2603(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "32) test2603(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", (byte) 75);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        boolean boolean13 = tarArchiveEntry2.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry16.setLinkName("tar\000");
        boolean boolean19 = tarArchiveEntry16.isDirectory();
        java.util.Date date20 = tarArchiveEntry16.getLastModifiedDate();
        int int21 = tarArchiveEntry16.getMode();
        java.util.Date date22 = tarArchiveEntry16.getModTime();
        tarArchiveEntry16.setIds(3, 32);
        int int26 = tarArchiveEntry16.getGroupId();
        boolean boolean27 = tarArchiveEntry2.equals(tarArchiveEntry16);
        tarArchiveEntry16.setGroupId((long) 31);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry16.setSize((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky "59) test2605(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
        org.junit.Assert.assertNotNull(date22);
// flaky "33) test2605(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isGNULongLinkEntry();
        long long5 = tarArchiveEntry3.getSize();
        java.util.Date date6 = tarArchiveEntry3.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray7 = tarArchiveEntry3.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int12 = tarArchiveEntry11.getGroupId();
        int int13 = tarArchiveEntry11.getGroupId();
        int int14 = tarArchiveEntry11.getMode();
        boolean boolean15 = tarArchiveEntry11.isPaxGNUSparse();
        long long16 = tarArchiveEntry11.getLongUserId();
        boolean boolean17 = tarArchiveEntry3.equals(tarArchiveEntry11);
        tarArchiveEntry11.setUserName("");
        byte[] byteArray21 = new byte[] { (byte) 83 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.writeEntryHeader(byteArray21, zipEncoding22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(date6);
// flaky "60) test2606(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray7);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray7, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33188 + "'", int14 == 33188);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 83 });
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 53, (byte) 53, (byte) 1, (byte) 51 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 53, (byte) 53, (byte) 1, (byte) 51 });
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("ustar\000");
        int int9 = tarArchiveEntry2.getDevMajor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setDevMinor(257);
        long long9 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setModTime((long) 16877);
        java.lang.Class<?> wildcardClass12 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky "61) test2609(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        java.util.Date date14 = tarArchiveEntry2.getModTime();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "62) test2610(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "34) test2610(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "11) test2610(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date14);
// flaky "6) test2610(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:39 ICT 2026");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        byte[] byteArray6 = new byte[] { (byte) 53, (byte) 48, (byte) 88, (byte) 103, (byte) 54, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 53, (byte) 48, (byte) 88, (byte) 103, (byte) 54, (byte) 120 });
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        boolean boolean11 = tarArchiveEntry2.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray12 = tarArchiveEntry2.getDirectoryEntries();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "63) test2612(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "35) test2612(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray12);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray12, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 100);
        tarArchiveEntry2.setGroupName("0\000");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        java.lang.String str14 = tarArchiveEntry2.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean18 = tarArchiveEntry17.isGlobalPaxHeader();
        boolean boolean19 = tarArchiveEntry17.isFile();
        java.util.Date date20 = tarArchiveEntry17.getModTime();
        java.util.Date date21 = tarArchiveEntry17.getModTime();
        tarArchiveEntry17.setUserId((long) '#');
        boolean boolean24 = tarArchiveEntry17.isCheckSumOK();
        boolean boolean25 = tarArchiveEntry17.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry28 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean29 = tarArchiveEntry28.isGlobalPaxHeader();
        boolean boolean30 = tarArchiveEntry28.isFile();
        boolean boolean31 = tarArchiveEntry28.isPaxGNUSparse();
        java.io.File file32 = tarArchiveEntry28.getFile();
        boolean boolean33 = tarArchiveEntry28.isPaxGNUSparse();
        boolean boolean34 = tarArchiveEntry17.isDescendent(tarArchiveEntry28);
        long long35 = tarArchiveEntry28.getRealSize();
        int int36 = tarArchiveEntry28.getUserId();
        long long37 = tarArchiveEntry28.getRealSize();
        boolean boolean38 = tarArchiveEntry2.equals(tarArchiveEntry28);
        tarArchiveEntry28.setLinkName(" \000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date20);
// flaky "64) test2614(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date21);
// flaky "36) test2614(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        int int12 = tarArchiveEntry2.getDevMajor();
        tarArchiveEntry2.setGroupId((int) (byte) 83);
        boolean boolean15 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean16 = tarArchiveEntry2.isGlobalPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray17 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "65) test2615(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray17);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray17, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        tarArchiveEntry1.setName("././@LongLink");
        int int5 = tarArchiveEntry1.getUserId();
        long long6 = tarArchiveEntry1.getSize();
        org.junit.Assert.assertNotNull(date2);
// flaky "66) test2616(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 88, false);
        boolean boolean4 = tarArchiveEntry3.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean9 = tarArchiveEntry2.isLink();
        long long10 = tarArchiveEntry2.getLongGroupId();
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(date11);
// flaky "67) test2618(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:39 ICT 2026");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setUserId(0L);
        java.lang.String str9 = tarArchiveEntry3.getLinkName();
        boolean boolean10 = tarArchiveEntry3.isFIFO();
        tarArchiveEntry3.setGroupId(100L);
        boolean boolean13 = tarArchiveEntry3.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        boolean boolean13 = tarArchiveEntry2.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry16.setLinkName("tar\000");
        boolean boolean19 = tarArchiveEntry16.isDirectory();
        java.util.Date date20 = tarArchiveEntry16.getLastModifiedDate();
        int int21 = tarArchiveEntry16.getMode();
        java.util.Date date22 = tarArchiveEntry16.getModTime();
        tarArchiveEntry16.setIds(3, 32);
        int int26 = tarArchiveEntry16.getGroupId();
        boolean boolean27 = tarArchiveEntry2.equals(tarArchiveEntry16);
        tarArchiveEntry16.setGroupId((long) 31);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry32 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean33 = tarArchiveEntry32.isGlobalPaxHeader();
        boolean boolean34 = tarArchiveEntry32.isFile();
        java.util.Date date35 = tarArchiveEntry32.getModTime();
        java.util.Date date36 = tarArchiveEntry32.getModTime();
        tarArchiveEntry32.setUserId((long) '#');
        boolean boolean39 = tarArchiveEntry32.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray40 = tarArchiveEntry32.getDirectoryEntries();
        boolean boolean41 = tarArchiveEntry32.isSparse();
        boolean boolean42 = tarArchiveEntry32.isPaxGNUSparse();
        tarArchiveEntry32.setMode((int) (byte) 48);
        tarArchiveEntry32.setLinkName("hi!");
        tarArchiveEntry32.setModTime((long) 10);
        boolean boolean49 = tarArchiveEntry32.isLink();
        long long50 = tarArchiveEntry32.getLongGroupId();
        boolean boolean51 = tarArchiveEntry32.isLink();
        tarArchiveEntry32.setUserId((long) 8);
        boolean boolean54 = tarArchiveEntry16.equals(tarArchiveEntry32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky "68) test2620(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
        org.junit.Assert.assertNotNull(date22);
// flaky "37) test2620(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(date35);
// flaky "12) test2620(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date35.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date36);
// flaky "7) test2620(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date36.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray40);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray40, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean12 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setMode(32);
        boolean boolean15 = tarArchiveEntry2.isLink();
        java.lang.String str16 = tarArchiveEntry2.getGroupName();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        tarArchiveEntry2.setLinkName("");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "69) test2622(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "38) test2622(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:39 ICT 2026");
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
// flaky "13) test2622(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date45.toString(), "Mon Sep 28 13:40:39 ICT 2026");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean10 = tarArchiveEntry2.isStarSparse();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isGNULongLinkEntry();
        long long5 = tarArchiveEntry3.getSize();
        java.util.Date date6 = tarArchiveEntry3.getLastModifiedDate();
        long long7 = tarArchiveEntry3.getRealSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(date6);
// flaky "70) test2624(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        boolean boolean17 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean18 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "71) test2625(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isCharacterDevice();
        int int8 = tarArchiveEntry3.getUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillStarSparseData(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray19);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray19, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        int int13 = tarArchiveEntry2.getDevMinor();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setSize((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 10, false);
        java.lang.String str4 = tarArchiveEntry3.getGroupName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        boolean boolean23 = tarArchiveEntry10.isCharacterDevice();
        long long24 = tarArchiveEntry10.getSize();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 504L + "'", long24 == 504L);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        boolean boolean20 = tarArchiveEntry10.isFile();
        boolean boolean21 = tarArchiveEntry10.isGNUSparse();
        byte[] byteArray22 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.writeEntryHeader(byteArray22, zipEncoding23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "72) test2631(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "39) test2631(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 0, (byte) 76, (byte) 50 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.parseTarHeader(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "73) test2632(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 0, (byte) 76, (byte) 50 });
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        int int8 = tarArchiveEntry2.getDevMajor();
        boolean boolean9 = tarArchiveEntry2.isFIFO();
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        boolean boolean11 = tarArchiveEntry2.isLink();
        boolean boolean12 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertNotNull(date3);
// flaky "74) test2633(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky "40) test2633(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setUserId(0L);
        java.lang.String str9 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setUserId((long) 4);
        tarArchiveEntry3.setSize((long) 2);
        byte[] byteArray17 = new byte[] { (byte) 50, (byte) 1, (byte) 88 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 50, (byte) 1, (byte) 88 });
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setGroupId((long) 1);
        long long7 = tarArchiveEntry3.getRealSize();
        tarArchiveEntry3.setGroupName("ustar\000");
        tarArchiveEntry3.setIds((int) (byte) 10, 31);
        int int13 = tarArchiveEntry3.getDevMinor();
        boolean boolean14 = tarArchiveEntry3.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str4 = tarArchiveEntry2.getUserName();
        boolean boolean5 = tarArchiveEntry2.isSparse();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        boolean boolean7 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setGroupName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        boolean boolean14 = tarArchiveEntry2.isExtended();
        boolean boolean15 = tarArchiveEntry2.isCheckSumOK();
        byte[] byteArray20 = new byte[] { (byte) 88, (byte) 103, (byte) 83, (byte) 75 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "75) test2637(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 88, (byte) 103, (byte) 83, (byte) 75 });
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str10 = tarArchiveEntry9.getLinkName();
        java.util.Date date11 = tarArchiveEntry9.getLastModifiedDate();
        long long12 = tarArchiveEntry9.getLongGroupId();
        boolean boolean13 = tarArchiveEntry2.equals(tarArchiveEntry9);
        java.util.Date date14 = tarArchiveEntry9.getModTime();
        tarArchiveEntry9.setIds((int) (byte) 103, (int) (byte) 10);
        tarArchiveEntry9.setUserId(96);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(date11);
// flaky "76) test2638(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date14);
// flaky "41) test2638(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:39 ICT 2026");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        long long3 = tarArchiveEntry2.getRealSize();
        boolean boolean4 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        int int7 = tarArchiveEntry2.getDevMajor();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "77) test2640(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        tarArchiveEntry2.setSize((long) (byte) 0);
        tarArchiveEntry2.setDevMajor(31);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "78) test2641(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "42) test2641(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getGroupName();
        tarArchiveEntry3.setModTime((long) 263);
        boolean boolean9 = tarArchiveEntry3.isFIFO();
        int int10 = tarArchiveEntry3.getGroupId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        boolean boolean8 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        boolean boolean13 = tarArchiveEntry2.isGlobalPaxHeader();
        int int14 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setLinkName("ustar\000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isGNULongLinkEntry();
        java.lang.String str10 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        byte[] byteArray2 = new byte[] { (byte) 76, (byte) 76 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 76, (byte) 76 });
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setMode(8);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry2.isGNUSparse();
        boolean boolean13 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "79) test2647(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000");
        long long2 = tarArchiveEntry1.getLongGroupId();
        int int3 = tarArchiveEntry1.getUserId();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry17.setLinkName("tar\000");
        boolean boolean20 = tarArchiveEntry17.isDirectory();
        boolean boolean21 = tarArchiveEntry17.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean25 = tarArchiveEntry24.isGlobalPaxHeader();
        boolean boolean26 = tarArchiveEntry24.isFile();
        boolean boolean27 = tarArchiveEntry24.isDirectory();
        tarArchiveEntry24.setSize((long) 504);
        boolean boolean30 = tarArchiveEntry24.isSparse();
        boolean boolean31 = tarArchiveEntry24.isPaxHeader();
        boolean boolean32 = tarArchiveEntry17.isDescendent(tarArchiveEntry24);
        boolean boolean33 = tarArchiveEntry2.isDescendent(tarArchiveEntry17);
        boolean boolean34 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        boolean boolean20 = tarArchiveEntry13.isFIFO();
        tarArchiveEntry13.setDevMinor(508);
        java.io.File file23 = tarArchiveEntry13.getFile();
        boolean boolean24 = tarArchiveEntry13.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "80) test2650(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "43) test2650(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setUserId((int) '#');
        boolean boolean14 = tarArchiveEntry10.isExtended();
        tarArchiveEntry10.setDevMinor(6);
        boolean boolean17 = tarArchiveEntry10.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "81) test2651(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "44) test2651(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setUserId((int) '#');
        boolean boolean14 = tarArchiveEntry10.isExtended();
        tarArchiveEntry10.setGroupId((int) (byte) 53);
        long long17 = tarArchiveEntry10.getSize();
        java.lang.String str18 = tarArchiveEntry10.getName();
        java.util.Date date19 = tarArchiveEntry10.getModTime();
        tarArchiveEntry10.setIds((int) (byte) 54, 33188);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "82) test2652(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "45) test2652(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ustar " + "'", str18, "ustar ");
        org.junit.Assert.assertNotNull(date19);
// flaky "14) test2652(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:39 ICT 2026");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        tarArchiveEntry10.setModTime((long) (byte) 103);
        tarArchiveEntry10.setDevMinor(512);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry20.setLinkName("tar\000");
        boolean boolean23 = tarArchiveEntry20.isDirectory();
        boolean boolean24 = tarArchiveEntry20.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean28 = tarArchiveEntry27.isGlobalPaxHeader();
        boolean boolean29 = tarArchiveEntry27.isFile();
        boolean boolean30 = tarArchiveEntry27.isDirectory();
        tarArchiveEntry27.setSize((long) 504);
        boolean boolean33 = tarArchiveEntry27.isSparse();
        boolean boolean34 = tarArchiveEntry27.isPaxHeader();
        boolean boolean35 = tarArchiveEntry20.isDescendent(tarArchiveEntry27);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry38 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date39 = tarArchiveEntry38.getLastModifiedDate();
        long long40 = tarArchiveEntry38.getSize();
        java.lang.String str41 = tarArchiveEntry38.getLinkName();
        boolean boolean42 = tarArchiveEntry38.isSymbolicLink();
        boolean boolean43 = tarArchiveEntry27.isDescendent(tarArchiveEntry38);
        java.lang.String str44 = tarArchiveEntry38.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry47 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry47.setMode((int) '#');
        java.util.Date date50 = tarArchiveEntry47.getModTime();
        tarArchiveEntry38.setModTime(date50);
        tarArchiveEntry10.setModTime(date50);
        java.lang.String str53 = tarArchiveEntry10.getName();
        boolean boolean54 = tarArchiveEntry10.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "83) test2653(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "46) test2653(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(date39);
// flaky "15) test2653(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date39.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(date50);
// flaky "8) test2653(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date50.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ustar " + "'", str53, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.util.Date date4 = tarArchiveEntry3.getModTime();
        boolean boolean5 = tarArchiveEntry3.isBlockDevice();
        java.lang.String str6 = tarArchiveEntry3.getLinkName();
        long long7 = tarArchiveEntry3.getLongGroupId();
        boolean boolean8 = tarArchiveEntry3.isSparse();
        int int9 = tarArchiveEntry3.getMode();
        org.junit.Assert.assertNotNull(date4);
// flaky "84) test2654(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isFile();
        tarArchiveEntry3.setNames("00", "0\000");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillStarSparseData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry39 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean40 = tarArchiveEntry39.isCharacterDevice();
        tarArchiveEntry39.setSize((long) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry45 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean46 = tarArchiveEntry45.isGlobalPaxHeader();
        boolean boolean47 = tarArchiveEntry45.isFile();
        boolean boolean48 = tarArchiveEntry45.isDirectory();
        tarArchiveEntry45.setSize((long) 504);
        boolean boolean51 = tarArchiveEntry45.isSparse();
        boolean boolean52 = tarArchiveEntry45.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry55 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long56 = tarArchiveEntry55.getSize();
        tarArchiveEntry55.setUserId((int) (byte) 10);
        boolean boolean59 = tarArchiveEntry55.isGlobalPaxHeader();
        tarArchiveEntry55.setGroupId((long) (byte) 10);
        long long62 = tarArchiveEntry55.getLongUserId();
        tarArchiveEntry55.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date66 = tarArchiveEntry55.getModTime();
        tarArchiveEntry45.setModTime(date66);
        boolean boolean68 = tarArchiveEntry39.equals((java.lang.Object) tarArchiveEntry45);
        boolean boolean69 = tarArchiveEntry45.isOldGNUSparse();
        int int70 = tarArchiveEntry45.getGroupId();
        boolean boolean71 = tarArchiveEntry45.isLink();
        tarArchiveEntry45.setGroupId(10240);
        boolean boolean74 = tarArchiveEntry9.equals((java.lang.Object) tarArchiveEntry45);
        tarArchiveEntry45.setNames("0\000", "ustar\000");
        tarArchiveEntry45.setLinkName("././@LongLink");
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
// flaky "85) test2656(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 504L + "'", long35 == 504L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertNotNull(date66);
// flaky "47) test2656(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date66.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        byte[] byteArray2 = new byte[] { (byte) 54, (byte) 53 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 54, (byte) 53 });
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isGNULongLinkEntry();
        tarArchiveEntry3.setGroupId((int) (byte) 55);
        tarArchiveEntry3.setSize(0L);
        byte[] byteArray11 = new byte[] { (byte) 54, (byte) 48 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 4 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 54, (byte) 48 });
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isPaxHeader();
        boolean boolean6 = tarArchiveEntry3.isCheckSumOK();
        tarArchiveEntry3.setModTime(8589934591L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 83, true);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setDevMajor(148);
        boolean boolean11 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertNotNull(date3);
// flaky "86) test2661(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 51, false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 100, true);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        long long17 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 504L + "'", long17 == 504L);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserId(0L);
        int int11 = tarArchiveEntry2.getDevMajor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 103, false);
        java.lang.String str16 = tarArchiveEntry15.getUserName();
        boolean boolean17 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry15);
        tarArchiveEntry2.setGroupId((long) 504);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        java.lang.String str12 = tarArchiveEntry8.getName();
        boolean boolean13 = tarArchiveEntry8.isBlockDevice();
        boolean boolean14 = tarArchiveEntry8.isFIFO();
        boolean boolean15 = tarArchiveEntry8.isCharacterDevice();
        org.junit.Assert.assertNotNull(date3);
// flaky "87) test2666(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "48) test2666(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserId(12);
        boolean boolean9 = tarArchiveEntry2.isGNULongLinkEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setMode(83);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "88) test2667(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        java.util.Date date21 = tarArchiveEntry2.getModTime();
        long long22 = tarArchiveEntry2.getSize();
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
        org.junit.Assert.assertNotNull(date21);
// flaky "89) test2668(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 504L + "'", long22 == 504L);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setUserId((long) (-1));
        long long14 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setGroupId(8589934591L);
        tarArchiveEntry2.setName("0\000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) -1);
        long long3 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setName("././@LongLink");
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setGroupId(49L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long21 = tarArchiveEntry20.getSize();
        tarArchiveEntry20.setUserId((int) (byte) 10);
        boolean boolean24 = tarArchiveEntry20.isGlobalPaxHeader();
        tarArchiveEntry20.setGroupId((long) (byte) 10);
        boolean boolean27 = tarArchiveEntry20.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray28 = tarArchiveEntry20.getDirectoryEntries();
        boolean boolean29 = tarArchiveEntry20.isSymbolicLink();
        long long30 = tarArchiveEntry20.getRealSize();
        int int31 = tarArchiveEntry20.getUserId();
        boolean boolean32 = tarArchiveEntry2.equals(tarArchiveEntry20);
        boolean boolean33 = tarArchiveEntry20.isGNULongNameEntry();
        boolean boolean34 = tarArchiveEntry20.isExtended();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray28);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray28, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", true);
        tarArchiveEntry2.setNames(" \000", "00");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean15 = tarArchiveEntry14.isCharacterDevice();
        boolean boolean16 = tarArchiveEntry14.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date20 = tarArchiveEntry19.getLastModifiedDate();
        tarArchiveEntry14.setModTime(date20);
        boolean boolean22 = tarArchiveEntry14.isOldGNUSparse();
        boolean boolean23 = tarArchiveEntry14.isPaxGNUSparse();
        boolean boolean24 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean25 = tarArchiveEntry14.isPaxGNUSparse();
        boolean boolean26 = tarArchiveEntry14.isLink();
        boolean boolean27 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry14);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 83, (byte) 10, (byte) 48 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray32, zipEncoding33, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky "90) test2673(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 83, (byte) 10, (byte) 48 });
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "91) test2674(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 55);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        boolean boolean32 = tarArchiveEntry23.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "92) test2676(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "49) test2676(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date30);
// flaky "16) test2676(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        tarArchiveEntry2.setGroupId((long) (byte) 100);
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean12 = tarArchiveEntry2.isGNUSparse();
        boolean boolean13 = tarArchiveEntry2.isPaxHeader();
        boolean boolean14 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "93) test2677(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "50) test2677(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str9 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date13 = tarArchiveEntry12.getLastModifiedDate();
        boolean boolean14 = tarArchiveEntry12.isCharacterDevice();
        tarArchiveEntry12.setUserName("hi!");
        tarArchiveEntry12.setGroupName("");
        java.util.Date date19 = tarArchiveEntry12.getModTime();
        tarArchiveEntry12.setSize((long) (byte) 53);
        tarArchiveEntry12.setUserName("");
        boolean boolean24 = tarArchiveEntry12.isOldGNUSparse();
        boolean boolean25 = tarArchiveEntry2.isDescendent(tarArchiveEntry12);
        boolean boolean26 = tarArchiveEntry12.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "94) test2678(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "51) test2678(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertNotNull(date13);
// flaky "17) test2678(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "9) test2678(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        boolean boolean24 = tarArchiveEntry2.isPaxGNUSparse();
        int int25 = tarArchiveEntry2.getDevMinor();
        boolean boolean26 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "95) test2679(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "52) test2679(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 257 + "'", int25 == 257);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        boolean boolean17 = tarArchiveEntry2.isOldGNUSparse();
        int int18 = tarArchiveEntry2.getDevMajor();
        boolean boolean19 = tarArchiveEntry2.isSparse();
        boolean boolean20 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertNotNull(date3);
// flaky "96) test2680(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "53) test2680(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "18) test2680(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        byte[] byteArray6 = new byte[] { (byte) 75, (byte) 53, (byte) 103, (byte) 54, (byte) 52, (byte) -1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 75, (byte) 53, (byte) 103, (byte) 54, (byte) 52, (byte) -1 });
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        java.util.Date date5 = tarArchiveEntry3.getLastModifiedDate();
        long long6 = tarArchiveEntry3.getLongGroupId();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillStarSparseData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky "97) test2682(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        boolean boolean13 = tarArchiveEntry2.isStarSparse();
        int int14 = tarArchiveEntry2.getGroupId();
        java.lang.String str15 = tarArchiveEntry2.getGroupName();
        java.lang.String str16 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "98) test2683(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ustar " + "'", str16, "ustar ");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        int int16 = tarArchiveEntry2.getDevMajor();
        org.junit.Assert.assertNotNull(date3);
// flaky "99) test2684(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "54) test2684(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "19) test2684(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        int int9 = tarArchiveEntry2.getGroupId();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        long long11 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 504L + "'", long11 == 504L);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", true);
        boolean boolean8 = tarArchiveEntry2.equals(tarArchiveEntry7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry7.fillStarSparseData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 100);
        long long3 = tarArchiveEntry2.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        long long7 = tarArchiveEntry6.getRealSize();
        java.lang.String str8 = tarArchiveEntry6.getLinkName();
        java.lang.String str9 = tarArchiveEntry6.getUserName();
        tarArchiveEntry6.setLinkName(" \000");
        boolean boolean12 = tarArchiveEntry2.isDescendent(tarArchiveEntry6);
        tarArchiveEntry6.setDevMajor((int) (byte) 75);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        int int10 = tarArchiveEntry2.getUserId();
        boolean boolean11 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setNames("00", "hi!");
        boolean boolean8 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setUserName("tar\000");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse0xData(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        int int13 = tarArchiveEntry2.getGroupId();
        java.lang.String str14 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ustar " + "'", str14, "ustar ");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        boolean boolean7 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserId((int) '#');
        tarArchiveEntry2.setMode(10);
        byte[] byteArray16 = new byte[] { (byte) 48, (byte) -1, (byte) 48, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
// flaky "100) test2691(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:39 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 48, (byte) -1, (byte) 48, (byte) 54 });
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setGroupId(0);
        boolean boolean11 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        boolean boolean6 = tarArchiveEntry3.isGlobalPaxHeader();
        java.lang.String str7 = tarArchiveEntry3.getName();
        boolean boolean8 = tarArchiveEntry3.isLink();
        tarArchiveEntry3.setDevMajor(16877);
        boolean boolean11 = tarArchiveEntry3.isSparse();
        boolean boolean12 = tarArchiveEntry3.isLink();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0\000" + "'", str7, "0\000");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", true);
        int int3 = tarArchiveEntry2.getGroupId();
        int int4 = tarArchiveEntry2.getDevMajor();
        boolean boolean5 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        boolean boolean6 = tarArchiveEntry3.isSparse();
        java.lang.String str7 = tarArchiveEntry3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0\000" + "'", str7, "0\000");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongUserId();
        boolean boolean9 = tarArchiveEntry2.isStarSparse();
        int int10 = tarArchiveEntry2.getUserId();
        tarArchiveEntry2.setGroupId((long) (byte) 83);
        java.lang.String str13 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertNotNull(date3);
// flaky "101) test2696(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
// flaky "102) test2697(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "55) test2697(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33188 + "'", int14 == 33188);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isExtended();
        boolean boolean7 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertNotNull(date5);
// flaky "103) test2698(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        long long23 = tarArchiveEntry15.getSize();
        tarArchiveEntry15.setUserName("ustar\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "104) test2699(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "56) test2699(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean5 = tarArchiveEntry2.isOldGNUSparse();
        long long6 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setGroupId((long) (byte) 0);
        org.junit.Assert.assertNotNull(date3);
// flaky "105) test2700(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setGroupName("");
        long long11 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "106) test2701(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "57) test2701(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getGroupName();
        tarArchiveEntry3.setSize(97L);
        java.util.Date date9 = tarArchiveEntry3.getLastModifiedDate();
        byte[] byteArray15 = new byte[] { (byte) 52, (byte) 51, (byte) 76, (byte) 53, (byte) 51 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(date9);
// flaky "107) test2702(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 52, (byte) 51, (byte) 76, (byte) 53, (byte) 51 });
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isGNULongLinkEntry();
        java.lang.String str8 = tarArchiveEntry3.getGroupName();
        boolean boolean9 = tarArchiveEntry3.isGNULongNameEntry();
        boolean boolean10 = tarArchiveEntry3.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        boolean boolean19 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setGroupName("ustar ");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "108) test2704(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        byte[] byteArray4 = new byte[] { (byte) 52, (byte) -1, (byte) 100, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 52, (byte) -1, (byte) 100, (byte) 103 });
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        long long10 = tarArchiveEntry2.getSize();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        long long12 = tarArchiveEntry2.getSize();
        boolean boolean13 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        boolean boolean20 = tarArchiveEntry10.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "109) test2707(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "58) test2707(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        boolean boolean13 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setUserId((int) (byte) 0);
        long long16 = tarArchiveEntry2.getLongGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray17 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "110) test2708(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray17);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray17, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setIds(35, (int) (byte) 53);
        boolean boolean7 = tarArchiveEntry2.isSparse();
        java.util.Date date8 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMajor((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "111) test2709(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:40 ICT 2026");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setGroupId((int) (byte) 100);
        tarArchiveEntry2.setSize((long) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 100, false);
        java.util.Date date19 = tarArchiveEntry18.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date19);
        long long21 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setGroupId((long) (byte) 83);
        boolean boolean24 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "112) test2710(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setUserId((long) (-1));
        boolean boolean14 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean15 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserId(155);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        java.util.Date date5 = tarArchiveEntry3.getLastModifiedDate();
        tarArchiveEntry3.setModTime(50L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky "113) test2712(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        boolean boolean7 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean8 = tarArchiveEntry2.isFIFO();
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "114) test2713(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:40 ICT 2026");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setDevMajor(12);
        tarArchiveEntry2.setModTime(8L);
        tarArchiveEntry2.setNames("00", "ustar ");
        org.junit.Assert.assertNotNull(date3);
// flaky "115) test2714(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date4);
// flaky "59) test2714(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:40 ICT 2026");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isLink();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        long long13 = tarArchiveEntry2.getLongGroupId();
        java.lang.String str14 = tarArchiveEntry2.getGroupName();
        boolean boolean15 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setSize((long) (byte) 53);
        tarArchiveEntry2.setUserName("");
        tarArchiveEntry2.setIds((-1), (int) (byte) 75);
        byte[] byteArray17 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray17, zipEncoding18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "116) test2716(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "60) test2716(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setDevMinor((int) (byte) 0);
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "117) test2717(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setNames("0\000", "");
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry12.setLinkName("tar\000");
        boolean boolean15 = tarArchiveEntry12.isDirectory();
        java.util.Date date16 = tarArchiveEntry12.getLastModifiedDate();
        java.util.Date date17 = tarArchiveEntry12.getModTime();
        boolean boolean18 = tarArchiveEntry12.isCheckSumOK();
        boolean boolean19 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry12);
        tarArchiveEntry2.setDevMajor((int) (short) 100);
        boolean boolean22 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date16);
// flaky "118) test2718(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date17);
// flaky "61) test2718(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) -1);
        tarArchiveEntry2.setSize((long) (byte) 120);
        byte[] byteArray10 = new byte[] { (byte) 55, (byte) 100, (byte) 50, (byte) 51, (byte) 49 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 55, (byte) 100, (byte) 50, (byte) 51, (byte) 49 });
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        int int7 = tarArchiveEntry2.getMode();
        int int8 = tarArchiveEntry2.getMode();
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "119) test2720(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setLinkName("\000\000");
        tarArchiveEntry2.setDevMajor((int) (byte) 49);
        boolean boolean14 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        java.io.File file55 = tarArchiveEntry46.getFile();
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
// flaky "120) test2722(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date41);
// flaky "62) test2722(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(file55);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        int int9 = tarArchiveEntry2.getUserId();
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        java.io.File file11 = tarArchiveEntry2.getFile();
        int int12 = tarArchiveEntry2.getDevMajor();
        java.lang.String str13 = tarArchiveEntry2.getGroupName();
        int int14 = tarArchiveEntry2.getDevMinor();
        boolean boolean15 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry17.setLinkName("tar\000");
        boolean boolean20 = tarArchiveEntry17.isDirectory();
        boolean boolean21 = tarArchiveEntry17.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean25 = tarArchiveEntry24.isGlobalPaxHeader();
        boolean boolean26 = tarArchiveEntry24.isFile();
        boolean boolean27 = tarArchiveEntry24.isDirectory();
        tarArchiveEntry24.setSize((long) 504);
        boolean boolean30 = tarArchiveEntry24.isSparse();
        boolean boolean31 = tarArchiveEntry24.isPaxHeader();
        boolean boolean32 = tarArchiveEntry17.isDescendent(tarArchiveEntry24);
        boolean boolean33 = tarArchiveEntry2.isDescendent(tarArchiveEntry17);
        boolean boolean34 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean35 = tarArchiveEntry2.isGNUSparse();
        boolean boolean36 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        int int13 = tarArchiveEntry2.getGroupId();
        java.util.Date date14 = tarArchiveEntry2.getLastModifiedDate();
        int int15 = tarArchiveEntry2.getMode();
        int int16 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(date14);
// flaky "121) test2725(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(155);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isDirectory();
        tarArchiveEntry13.setSize((long) 504);
        boolean boolean19 = tarArchiveEntry13.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray20 = tarArchiveEntry13.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long24 = tarArchiveEntry23.getSize();
        tarArchiveEntry23.setUserId((int) (byte) 10);
        boolean boolean27 = tarArchiveEntry23.isGlobalPaxHeader();
        tarArchiveEntry23.setGroupId((long) (byte) 10);
        boolean boolean30 = tarArchiveEntry23.isFile();
        boolean boolean31 = tarArchiveEntry13.equals((java.lang.Object) tarArchiveEntry23);
        java.lang.String str32 = tarArchiveEntry23.getName();
        boolean boolean33 = tarArchiveEntry2.equals((java.lang.Object) str32);
        java.util.Map<java.lang.String, java.lang.String> strMap34 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray20);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray20, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ustar " + "'", str32, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setUserId((int) '#');
        boolean boolean14 = tarArchiveEntry10.isExtended();
        int int15 = tarArchiveEntry10.getUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "122) test2727(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "63) test2727(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isFIFO();
        boolean boolean5 = tarArchiveEntry3.isGNUSparse();
        byte[] byteArray7 = new byte[] { (byte) 120 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray7, zipEncoding8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 120 });
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        java.lang.String str26 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "123) test2729(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "64) test2729(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "20) test2729(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long18 = tarArchiveEntry17.getSize();
        tarArchiveEntry17.setUserId((int) (byte) 10);
        boolean boolean21 = tarArchiveEntry17.isGlobalPaxHeader();
        tarArchiveEntry17.setGroupId((long) (byte) 10);
        boolean boolean24 = tarArchiveEntry17.isBlockDevice();
        boolean boolean25 = tarArchiveEntry17.isLink();
        boolean boolean26 = tarArchiveEntry17.isSparse();
        tarArchiveEntry17.setIds((int) (byte) 75, (int) (byte) 83);
        java.lang.String str30 = tarArchiveEntry17.getGroupName();
        tarArchiveEntry17.setUserId((int) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long36 = tarArchiveEntry35.getSize();
        tarArchiveEntry35.setUserId((int) (byte) 10);
        boolean boolean39 = tarArchiveEntry35.isGlobalPaxHeader();
        tarArchiveEntry35.setGroupId((long) (byte) 10);
        boolean boolean42 = tarArchiveEntry35.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray43 = tarArchiveEntry35.getDirectoryEntries();
        boolean boolean44 = tarArchiveEntry35.isSymbolicLink();
        long long45 = tarArchiveEntry35.getRealSize();
        int int46 = tarArchiveEntry35.getUserId();
        boolean boolean47 = tarArchiveEntry17.equals(tarArchiveEntry35);
        boolean boolean48 = tarArchiveEntry2.equals(tarArchiveEntry17);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 52, (byte) 120, (byte) -1, (byte) 50, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry17.writeEntryHeader(byteArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray43);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray43, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 117, (byte) 115, (byte) 116, (byte) 97, (byte) 114, (byte) 32 });
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isFile();
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        byte[] byteArray13 = new byte[] { (byte) 54, (byte) 49, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray13, zipEncoding14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 54, (byte) 49, (byte) 88 });
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertNotNull(date3);
// flaky "124) test2732(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean36 = tarArchiveEntry35.isGlobalPaxHeader();
        boolean boolean37 = tarArchiveEntry35.isFile();
        boolean boolean38 = tarArchiveEntry35.isDirectory();
        tarArchiveEntry35.setSize((long) 504);
        boolean boolean41 = tarArchiveEntry35.isSparse();
        boolean boolean42 = tarArchiveEntry35.isPaxHeader();
        boolean boolean43 = tarArchiveEntry3.equals(tarArchiveEntry35);
        long long44 = tarArchiveEntry35.getLongUserId();
        boolean boolean45 = tarArchiveEntry35.isPaxGNUSparse();
        long long46 = tarArchiveEntry35.getSize();
        long long47 = tarArchiveEntry35.getLongUserId();
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
// flaky "125) test2733(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 504L + "'", long46 == 504L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        int int7 = tarArchiveEntry2.getDevMinor();
        boolean boolean8 = tarArchiveEntry2.isGlobalPaxHeader();
        java.io.File file9 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setName("tar\000");
        boolean boolean15 = tarArchiveEntry2.isStarSparse();
        java.lang.String str16 = tarArchiveEntry2.getName();
        boolean boolean17 = tarArchiveEntry2.isGNUSparse();
        int int18 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tar\000" + "'", str16, "tar\000");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 33188 + "'", int18 == 33188);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        tarArchiveEntry2.setSize(0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "126) test2736(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean20 = tarArchiveEntry19.isGlobalPaxHeader();
        boolean boolean21 = tarArchiveEntry19.isFile();
        java.util.Date date22 = tarArchiveEntry19.getModTime();
        java.util.Date date23 = tarArchiveEntry19.getModTime();
        java.lang.String str24 = tarArchiveEntry19.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry28 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean29 = tarArchiveEntry28.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry32 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean33 = tarArchiveEntry32.isGlobalPaxHeader();
        java.lang.String str34 = tarArchiveEntry32.getUserName();
        boolean boolean35 = tarArchiveEntry28.isDescendent(tarArchiveEntry32);
        boolean boolean36 = tarArchiveEntry19.isDescendent(tarArchiveEntry32);
        tarArchiveEntry32.setIds((int) (short) 100, 0);
        tarArchiveEntry32.setName("00");
        boolean boolean42 = tarArchiveEntry2.isDescendent(tarArchiveEntry32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(date22);
// flaky "127) test2737(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date23);
// flaky "65) test2737(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long6 = tarArchiveEntry5.getSize();
        tarArchiveEntry5.setUserId((int) (byte) 10);
        boolean boolean9 = tarArchiveEntry5.isGlobalPaxHeader();
        tarArchiveEntry5.setGroupId((long) (byte) 10);
        boolean boolean12 = tarArchiveEntry5.isBlockDevice();
        boolean boolean13 = tarArchiveEntry5.isLink();
        boolean boolean14 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setIds((int) (byte) 75, (int) (byte) 83);
        boolean boolean18 = tarArchiveEntry2.equals((java.lang.Object) (byte) 75);
        tarArchiveEntry2.setModTime((long) 504);
        boolean boolean21 = tarArchiveEntry2.isBlockDevice();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        java.lang.String str18 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(date15);
// flaky "128) test2739(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "66) test2739(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str9 = tarArchiveEntry2.getName();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isFile();
        tarArchiveEntry13.setGroupId((int) (byte) 0);
        tarArchiveEntry13.setIds((int) '#', 0);
        java.util.Date date21 = tarArchiveEntry13.getLastModifiedDate();
        boolean boolean22 = tarArchiveEntry2.equals((java.lang.Object) date21);
        boolean boolean23 = tarArchiveEntry2.isExtended();
        boolean boolean24 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "129) test2740(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "67) test2740(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(date21);
// flaky "21) test2740(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long12 = tarArchiveEntry11.getSize();
        tarArchiveEntry11.setUserId((int) (byte) 10);
        boolean boolean15 = tarArchiveEntry11.isGlobalPaxHeader();
        tarArchiveEntry11.setGroupId((long) (byte) 10);
        boolean boolean18 = tarArchiveEntry11.isCheckSumOK();
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry11);
        long long20 = tarArchiveEntry11.getRealSize();
        boolean boolean21 = tarArchiveEntry11.isGlobalPaxHeader();
        java.util.Date date22 = tarArchiveEntry11.getModTime();
        boolean boolean23 = tarArchiveEntry11.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "130) test2741(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 100, false);
        int int4 = tarArchiveEntry3.getDevMinor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupId((-1L));
        int int9 = tarArchiveEntry2.getDevMinor();
        boolean boolean10 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setGroupId((int) (byte) 0);
        byte[] byteArray19 = new byte[] { (byte) 52, (byte) 120, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "131) test2744(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "68) test2744(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(date13);
// flaky "22) test2744(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 52, (byte) 120, (byte) 54 });
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setGroupName("ustar ");
        boolean boolean7 = tarArchiveEntry2.isLink();
        tarArchiveEntry2.setUserName("\000\000");
        int int10 = tarArchiveEntry2.getDevMajor();
        long long11 = tarArchiveEntry2.getLongUserId();
        boolean boolean12 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "132) test2745(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean13 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean14 = tarArchiveEntry12.isFile();
        boolean boolean15 = tarArchiveEntry12.isPaxGNUSparse();
        boolean boolean16 = tarArchiveEntry12.isFile();
        boolean boolean17 = tarArchiveEntry12.isFile();
        tarArchiveEntry12.setDevMinor(3);
        boolean boolean20 = tarArchiveEntry2.equals(tarArchiveEntry12);
        tarArchiveEntry12.setModTime(0L);
        boolean boolean23 = tarArchiveEntry12.isSparse();
        boolean boolean24 = tarArchiveEntry12.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "133) test2746(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "69) test2746(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 0, (byte) 88 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 0, (byte) 88 });
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 53, (byte) 120, (byte) 1, (byte) 88, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 53, (byte) 120, (byte) 1, (byte) 88, (byte) 50 });
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertNotNull(date3);
// flaky "134) test2749(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
        boolean boolean14 = tarArchiveEntry2.isSymbolicLink();
        java.lang.String str15 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky "135) test2750(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        boolean boolean12 = tarArchiveEntry10.isFile();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.fillGNUSparse0xData(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "136) test2751(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "70) test2751(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        byte[] byteArray6 = new byte[] { (byte) 120, (byte) 51, (byte) -1, (byte) 52, (byte) 1, (byte) 51 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 120, (byte) 51, (byte) -1, (byte) 52, (byte) 1, (byte) 51 });
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        boolean boolean7 = tarArchiveEntry2.isGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setLinkName("hi!");
        tarArchiveEntry2.setGroupId(512);
        org.junit.Assert.assertNotNull(date3);
// flaky "137) test2753(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 83, false);
        java.util.Date date4 = tarArchiveEntry3.getLastModifiedDate();
        org.junit.Assert.assertNotNull(date4);
// flaky "138) test2754(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:40 ICT 2026");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setGroupName("0\000");
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        java.util.Date date13 = tarArchiveEntry10.getModTime();
        java.util.Date date14 = tarArchiveEntry10.getModTime();
        tarArchiveEntry10.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean19 = tarArchiveEntry10.isDescendent(tarArchiveEntry18);
        boolean boolean20 = tarArchiveEntry18.isOldGNUSparse();
        boolean boolean21 = tarArchiveEntry18.isFIFO();
        boolean boolean22 = tarArchiveEntry18.isLink();
        boolean boolean23 = tarArchiveEntry18.isLink();
        boolean boolean24 = tarArchiveEntry2.equals((java.lang.Object) boolean23);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray25 = tarArchiveEntry2.getDirectoryEntries();
        java.io.File file26 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertNotNull(date3);
// flaky "139) test2755(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "71) test2755(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "23) test2755(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray25);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray25, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNull(file26);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setGroupId((long) 1);
        long long7 = tarArchiveEntry3.getRealSize();
        tarArchiveEntry3.setMode(2);
        byte[] byteArray16 = new byte[] { (byte) 88, (byte) 88, (byte) 48, (byte) 52, (byte) 48, (byte) 49 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 88, (byte) 88, (byte) 48, (byte) 52, (byte) 48, (byte) 49 });
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        boolean boolean23 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean24 = tarArchiveEntry12.isStarSparse();
        long long25 = tarArchiveEntry12.getLongUserId();
        boolean boolean26 = tarArchiveEntry12.isCheckSumOK();
        long long27 = tarArchiveEntry12.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "140) test2757(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "72) test2757(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        java.lang.String str14 = tarArchiveEntry2.getGroupName();
        boolean boolean15 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean16 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray16 = tarArchiveEntry7.getDirectoryEntries();
        boolean boolean17 = tarArchiveEntry7.isDirectory();
        java.lang.String str18 = tarArchiveEntry7.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "141) test2759(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "73) test2759(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray16);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray16, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        int int9 = tarArchiveEntry2.getGroupId();
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        java.lang.String str11 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertNotNull(date3);
// flaky "142) test2760(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky "74) test2760(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        boolean boolean16 = tarArchiveEntry2.isFIFO();
        boolean boolean17 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setGroupName("ustar\000");
        boolean boolean7 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertNotNull(date3);
// flaky "143) test2762(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        boolean boolean12 = tarArchiveEntry2.isStarSparse();
        boolean boolean13 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean14 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean18 = tarArchiveEntry17.isGlobalPaxHeader();
        boolean boolean19 = tarArchiveEntry17.isFile();
        boolean boolean20 = tarArchiveEntry17.isPaxGNUSparse();
        boolean boolean21 = tarArchiveEntry17.isFile();
        boolean boolean22 = tarArchiveEntry17.isFile();
        java.util.Date date23 = tarArchiveEntry17.getLastModifiedDate();
        int int24 = tarArchiveEntry17.getDevMinor();
        tarArchiveEntry17.setDevMajor((int) (byte) 88);
        int int27 = tarArchiveEntry17.getMode();
        boolean boolean28 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry17);
        boolean boolean29 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "144) test2763(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "75) test2763(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date23);
// flaky "24) test2763(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 33188 + "'", int27 == 33188);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isGNULongLinkEntry();
        long long8 = tarArchiveEntry3.getSize();
        tarArchiveEntry3.setUserName("00");
        boolean boolean11 = tarArchiveEntry3.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.lang.String str12 = tarArchiveEntry2.getLinkName();
        boolean boolean13 = tarArchiveEntry2.isGNULongNameEntry();
        java.util.Date date14 = tarArchiveEntry2.getModTime();
        long long15 = tarArchiveEntry2.getSize();
        java.lang.String str16 = tarArchiveEntry2.getUserName();
        boolean boolean17 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date14);
// flaky "145) test2765(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setModTime((long) (byte) 75);
        boolean boolean14 = tarArchiveEntry10.isStarSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean18 = tarArchiveEntry17.isGlobalPaxHeader();
        boolean boolean19 = tarArchiveEntry17.isFile();
        java.util.Date date20 = tarArchiveEntry17.getModTime();
        java.util.Date date21 = tarArchiveEntry17.getModTime();
        boolean boolean22 = tarArchiveEntry17.isSparse();
        boolean boolean23 = tarArchiveEntry10.equals(tarArchiveEntry17);
        boolean boolean24 = tarArchiveEntry10.isGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.fillGNUSparse0xData(strMap25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "146) test2766(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "76) test2766(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date20);
// flaky "25) test2766(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date21);
// flaky "10) test2766(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        tarArchiveEntry2.setGroupName("ustar ");
        int int12 = tarArchiveEntry2.getDevMajor();
        boolean boolean13 = tarArchiveEntry2.isOldGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        int int7 = tarArchiveEntry2.getMode();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray8 = tarArchiveEntry2.getDirectoryEntries();
        java.io.File file9 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "147) test2768(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray8);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray8, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setModTime((long) (byte) 75);
        boolean boolean14 = tarArchiveEntry10.isStarSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean18 = tarArchiveEntry17.isGlobalPaxHeader();
        boolean boolean19 = tarArchiveEntry17.isFile();
        java.util.Date date20 = tarArchiveEntry17.getModTime();
        java.util.Date date21 = tarArchiveEntry17.getModTime();
        boolean boolean22 = tarArchiveEntry17.isSparse();
        boolean boolean23 = tarArchiveEntry10.equals(tarArchiveEntry17);
        long long24 = tarArchiveEntry10.getSize();
        boolean boolean25 = tarArchiveEntry10.isCheckSumOK();
        boolean boolean26 = tarArchiveEntry10.isLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "148) test2769(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "77) test2769(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date20);
// flaky "26) test2769(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date21);
// flaky "11) test2769(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isExtended();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        tarArchiveEntry2.setNames("", "tar\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setUserName("");
        java.util.Date date5 = tarArchiveEntry2.getLastModifiedDate();
        java.lang.String str6 = tarArchiveEntry2.getLinkName();
        boolean boolean7 = tarArchiveEntry2.isDirectory();
        boolean boolean8 = tarArchiveEntry2.isOldGNUSparse();
        byte[] byteArray14 = new byte[] { (byte) 53, (byte) 50, (byte) 120, (byte) 100, (byte) 55 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
// flaky "149) test2772(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 53, (byte) 50, (byte) 120, (byte) 100, (byte) 55 });
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) 504);
        tarArchiveEntry2.setDevMajor((int) (byte) 10);
        boolean boolean11 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry25.setLinkName("tar\000");
        boolean boolean28 = tarArchiveEntry25.isDirectory();
        java.lang.String str29 = tarArchiveEntry25.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry31 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000");
        java.util.Date date32 = tarArchiveEntry31.getLastModifiedDate();
        tarArchiveEntry25.setModTime(date32);
        boolean boolean34 = tarArchiveEntry2.equals(tarArchiveEntry25);
        int int35 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "150) test2774(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "78) test2774(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ustar " + "'", str29, "ustar ");
        org.junit.Assert.assertNotNull(date32);
// flaky "27) test2774(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date32.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setGroupId((int) (byte) 0);
        tarArchiveEntry2.setIds((int) '#', 0);
        java.util.Date date10 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "151) test2775(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        boolean boolean10 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupId((-1L));
        int int9 = tarArchiveEntry2.getDevMinor();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray20 = tarArchiveEntry15.getDirectoryEntries();
        tarArchiveEntry15.setGroupName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "152) test2778(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "79) test2778(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray20);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray20, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean7 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "153) test2779(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
        tarArchiveEntry2.setLinkName("hi!");
        tarArchiveEntry2.setModTime((long) 10);
        boolean boolean19 = tarArchiveEntry2.isLink();
        java.lang.String str20 = tarArchiveEntry2.getUserName();
        java.lang.String str21 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "154) test2780(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "80) test2780(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setDevMajor(33188);
        tarArchiveEntry2.setIds(6, 10240);
        int int12 = tarArchiveEntry2.getMode();
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
        org.junit.Assert.assertNotNull(date13);
// flaky "155) test2781(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:40 ICT 2026");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 103, (byte) 50, (byte) 83, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 103, (byte) 50, (byte) 83, (byte) 10 });
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean12 = tarArchiveEntry11.isGlobalPaxHeader();
        boolean boolean13 = tarArchiveEntry11.isFile();
        boolean boolean14 = tarArchiveEntry11.isDirectory();
        tarArchiveEntry11.setSize((long) 504);
        java.lang.String str17 = tarArchiveEntry11.getLinkName();
        tarArchiveEntry11.setGroupId(257);
        tarArchiveEntry11.setLinkName("00");
        boolean boolean22 = tarArchiveEntry2.equals(tarArchiveEntry11);
        long long23 = tarArchiveEntry2.getSize();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
        tarArchiveEntry2.setGroupId(1000);
        tarArchiveEntry2.setDevMajor(1);
        tarArchiveEntry2.setMode(2);
        boolean boolean30 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "156) test2784(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "81) test2784(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.lang.String str6 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000");
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date9);
        java.lang.String str11 = tarArchiveEntry2.getUserName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        boolean boolean17 = tarArchiveEntry14.isDirectory();
        tarArchiveEntry14.setSize((long) 504);
        boolean boolean20 = tarArchiveEntry14.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean24 = tarArchiveEntry23.isGlobalPaxHeader();
        boolean boolean25 = tarArchiveEntry23.isFile();
        java.util.Date date26 = tarArchiveEntry23.getModTime();
        java.util.Date date27 = tarArchiveEntry23.getModTime();
        int int28 = tarArchiveEntry23.getMode();
        boolean boolean29 = tarArchiveEntry14.equals(tarArchiveEntry23);
        boolean boolean30 = tarArchiveEntry23.isBlockDevice();
        java.lang.String str31 = tarArchiveEntry23.getLinkName();
        tarArchiveEntry23.setDevMinor(0);
        boolean boolean34 = tarArchiveEntry2.equals(tarArchiveEntry23);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar " + "'", str6, "ustar ");
        org.junit.Assert.assertNotNull(date9);
// flaky "157) test2785(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date26);
// flaky "82) test2785(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date27);
// flaky "28) test2785(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 33188 + "'", int28 == 33188);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str9 = tarArchiveEntry2.getName();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        int int11 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str16 = tarArchiveEntry15.getLinkName();
        tarArchiveEntry15.setNames("00", "hi!");
        boolean boolean20 = tarArchiveEntry15.isStarSparse();
        java.io.File file21 = tarArchiveEntry15.getFile();
        java.lang.String str22 = tarArchiveEntry15.getLinkName();
        boolean boolean23 = tarArchiveEntry2.equals(tarArchiveEntry15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "158) test2786(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "83) test2786(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        int int6 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setNames("tar\000", "././@LongLink");
        int int10 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setLinkName("");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33188 + "'", int10 == 33188);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setUserId((int) '#');
        boolean boolean14 = tarArchiveEntry10.isFile();
        long long15 = tarArchiveEntry10.getSize();
        tarArchiveEntry10.setUserId(4L);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.fillGNUSparse0xData(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "159) test2788(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "84) test2788(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 120, false);
        int int4 = tarArchiveEntry3.getGroupId();
        java.lang.String str5 = tarArchiveEntry3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar\000" + "'", str5, "ustar\000");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        tarArchiveEntry9.setGroupId((long) 508);
        boolean boolean38 = tarArchiveEntry9.isOldGNUSparse();
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
// flaky "160) test2790(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 504L + "'", long35 == 504L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setDevMinor(3);
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        boolean boolean11 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean12 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "161) test2791(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", (byte) 50);
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
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        boolean boolean12 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry15.setUserName("");
        boolean boolean18 = tarArchiveEntry2.equals(tarArchiveEntry15);
        java.io.File file19 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "162) test2793(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "85) test2793(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(file19);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getGroupName();
        tarArchiveEntry3.setGroupId((long) (byte) 103);
        tarArchiveEntry3.setGroupId((int) (byte) 83);
        java.lang.String str11 = tarArchiveEntry3.getName();
        tarArchiveEntry3.setSize((long) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ustar\000" + "'", str11, "ustar\000");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setModTime((long) (byte) 75);
        int int6 = tarArchiveEntry2.getDevMajor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str10 = tarArchiveEntry9.getLinkName();
        java.util.Date date11 = tarArchiveEntry9.getLastModifiedDate();
        long long12 = tarArchiveEntry9.getLongGroupId();
        boolean boolean13 = tarArchiveEntry2.equals(tarArchiveEntry9);
        java.io.File file14 = tarArchiveEntry2.getFile();
        int int15 = tarArchiveEntry2.getUserId();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setDevMinor((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minor device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(date11);
// flaky "163) test2796(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        boolean boolean17 = tarArchiveEntry2.isPaxHeader();
        long long18 = tarArchiveEntry2.getRealSize();
        java.lang.String str19 = tarArchiveEntry2.getGroupName();
        long long20 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "164) test2797(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        int int9 = tarArchiveEntry2.getDevMinor();
        byte[] byteArray14 = new byte[] { (byte) 51, (byte) 54, (byte) 88, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "165) test2798(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "86) test2798(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 51, (byte) 54, (byte) 88, (byte) 10 });
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        boolean boolean6 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setName("././@LongLink");
        long long9 = tarArchiveEntry2.getLongGroupId();
        boolean boolean10 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean11 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isFile();
        int int8 = tarArchiveEntry3.getDevMajor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry3.getDirectoryEntries();
        tarArchiveEntry3.setDevMinor((int) (byte) 53);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.lang.String str6 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setUserName("\000\000");
        tarArchiveEntry2.setDevMinor((int) (byte) 51);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", (byte) 0, true);
        boolean boolean4 = tarArchiveEntry3.isFIFO();
        boolean boolean5 = tarArchiveEntry3.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str10 = tarArchiveEntry9.getLinkName();
        java.util.Date date11 = tarArchiveEntry9.getLastModifiedDate();
        long long12 = tarArchiveEntry9.getLongGroupId();
        boolean boolean13 = tarArchiveEntry2.equals(tarArchiveEntry9);
        tarArchiveEntry9.setMode((int) (byte) 83);
        int int16 = tarArchiveEntry9.getGroupId();
        tarArchiveEntry9.setUserName("\000\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(date11);
// flaky "166) test2803(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 10);
        tarArchiveEntry2.setUserName("");
        int int5 = tarArchiveEntry2.getDevMajor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 0);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        long long4 = tarArchiveEntry2.getLongUserId();
        int int5 = tarArchiveEntry2.getDevMajor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setUserId((long) (-1));
        boolean boolean14 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean15 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setMode(8);
        java.lang.String str11 = tarArchiveEntry2.getGroupName();
        boolean boolean12 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean13 = tarArchiveEntry2.isStarSparse();
        boolean boolean14 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "167) test2808(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (short) 1, 155);
        int int8 = tarArchiveEntry2.getMode();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setGroupId((long) (byte) 52);
        tarArchiveEntry2.setNames("ustar ", " \000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setGroupId((int) (byte) 1);
        tarArchiveEntry2.setUserName("\000\000");
        boolean boolean13 = tarArchiveEntry2.isLink();
        int int14 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setGroupId(12);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        long long5 = tarArchiveEntry2.getRealSize();
        boolean boolean6 = tarArchiveEntry2.isGNULongLinkEntry();
        long long7 = tarArchiveEntry2.getRealSize();
        boolean boolean8 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserName("00");
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setMode((int) (byte) 0);
        org.junit.Assert.assertNotNull(date3);
// flaky "168) test2811(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        tarArchiveEntry8.setName("././@LongLink");
        boolean boolean23 = tarArchiveEntry8.isLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "169) test2812(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        long long5 = tarArchiveEntry3.getLongGroupId();
        java.lang.String str6 = tarArchiveEntry3.getGroupName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
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
        boolean boolean25 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setSize((long) (short) 1);
        java.lang.String str28 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "170) test2814(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "87) test2814(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:40 ICT 2026");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setUserId((long) (-1));
        boolean boolean14 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
        tarArchiveEntry7.setDevMinor(508);
        boolean boolean25 = tarArchiveEntry7.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "171) test2816(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "88) test2816(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:40 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray15);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray15, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        boolean boolean3 = tarArchiveEntry1.isFIFO();
        boolean boolean4 = tarArchiveEntry1.isStarSparse();
        long long5 = tarArchiveEntry1.getRealSize();
        tarArchiveEntry1.setDevMinor(508);
        java.lang.String str8 = tarArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(date2);
// flaky "172) test2817(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "././@LongLink" + "'", str8, "././@LongLink");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setGroupId(263);
        tarArchiveEntry2.setMode(0);
        org.junit.Assert.assertNotNull(date3);
// flaky "173) test2818(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 1, false);
        boolean boolean4 = tarArchiveEntry3.isPaxGNUSparse();
        long long5 = tarArchiveEntry3.getLongGroupId();
        java.util.Date date6 = tarArchiveEntry3.getModTime();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillStarSparseData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(date6);
// flaky "174) test2819(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        java.lang.String str13 = tarArchiveEntry2.getGroupName();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap14);
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
// flaky "175) test2820(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        tarArchiveEntry12.setGroupName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry27.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray30 = tarArchiveEntry27.getDirectoryEntries();
        tarArchiveEntry27.setSize((long) 1000);
        boolean boolean33 = tarArchiveEntry12.equals(tarArchiveEntry27);
        boolean boolean34 = tarArchiveEntry27.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry37 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry37.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray40 = tarArchiveEntry37.getDirectoryEntries();
        int int41 = tarArchiveEntry37.getDevMinor();
        boolean boolean42 = tarArchiveEntry37.isBlockDevice();
        java.io.File file43 = tarArchiveEntry37.getFile();
        boolean boolean44 = tarArchiveEntry27.equals(tarArchiveEntry37);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "176) test2821(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "89) test2821(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray30);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray30, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray40);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray40, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean12 = tarArchiveEntry11.isGlobalPaxHeader();
        boolean boolean13 = tarArchiveEntry11.isFile();
        boolean boolean14 = tarArchiveEntry11.isDirectory();
        tarArchiveEntry11.setSize((long) 504);
        java.lang.String str17 = tarArchiveEntry11.getLinkName();
        tarArchiveEntry11.setGroupId(257);
        tarArchiveEntry11.setLinkName("00");
        boolean boolean22 = tarArchiveEntry2.equals(tarArchiveEntry11);
        boolean boolean23 = tarArchiveEntry11.isPaxHeader();
        boolean boolean24 = tarArchiveEntry11.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        long long22 = tarArchiveEntry2.getLongGroupId();
        java.io.File file23 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "177) test2823(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNull(file23);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (short) 1, 155);
        int int8 = tarArchiveEntry2.getMode();
        long long9 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setDevMajor((int) (byte) 75);
        java.lang.String str12 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        java.lang.String str11 = tarArchiveEntry2.getGroupName();
        boolean boolean12 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 50);
        tarArchiveEntry15.setIds(6, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long22 = tarArchiveEntry21.getSize();
        tarArchiveEntry21.setUserId((int) (byte) 10);
        long long25 = tarArchiveEntry21.getLongUserId();
        int int26 = tarArchiveEntry21.getMode();
        tarArchiveEntry21.setSize((long) 32);
        int int29 = tarArchiveEntry21.getDevMinor();
        boolean boolean30 = tarArchiveEntry21.isBlockDevice();
        boolean boolean31 = tarArchiveEntry21.isDirectory();
        java.util.Date date32 = tarArchiveEntry21.getLastModifiedDate();
        tarArchiveEntry15.setModTime(date32);
        tarArchiveEntry2.setModTime(date32);
        org.junit.Assert.assertNotNull(date3);
// flaky "178) test2825(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 33188 + "'", int26 == 33188);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date32);
// flaky "90) test2825(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date32.toString(), "Mon Sep 28 13:40:41 ICT 2026");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserId(12);
        int int9 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setIds((int) (byte) 53, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "179) test2826(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        boolean boolean19 = tarArchiveEntry11.isStarSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "180) test2827(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        int int25 = tarArchiveEntry12.getGroupId();
        tarArchiveEntry12.setUserId((long) '4');
        byte[] byteArray30 = new byte[] { (byte) 52, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry12.parseTarHeader(byteArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "181) test2828(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "91) test2828(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 52, (byte) -1 });
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setSize((long) (byte) 55);
        tarArchiveEntry2.setIds((int) (byte) 54, (int) (byte) 55);
        boolean boolean16 = tarArchiveEntry2.isLink();
        tarArchiveEntry2.setDevMajor(75);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "182) test2829(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "92) test2829(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        java.lang.String str8 = tarArchiveEntry2.getName();
        long long9 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 1);
        tarArchiveEntry2.setMode((int) 'a');
        boolean boolean5 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        boolean boolean6 = tarArchiveEntry3.isGlobalPaxHeader();
        tarArchiveEntry3.setGroupName("././@LongLink");
        boolean boolean9 = tarArchiveEntry3.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", true);
        int int3 = tarArchiveEntry2.getMode();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isFile();
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33188 + "'", int3 == 33188);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.lang.String str3 = tarArchiveEntry2.getGroupName();
        java.lang.Class<?> wildcardClass4 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean9 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setUserId((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        int int8 = tarArchiveEntry2.getUserId();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        int int11 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "183) test2837(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setUserId((int) '#');
        boolean boolean14 = tarArchiveEntry10.isOldGNUSparse();
        boolean boolean15 = tarArchiveEntry10.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray16 = tarArchiveEntry10.getDirectoryEntries();
        byte[] byteArray20 = new byte[] { (byte) 54, (byte) 51, (byte) 0 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.writeEntryHeader(byteArray20, zipEncoding21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "184) test2838(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "93) test2838(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray16);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray16, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 54, (byte) 51, (byte) 0 });
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        boolean boolean6 = tarArchiveEntry2.isGNULongLinkEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long10 = tarArchiveEntry9.getSize();
        tarArchiveEntry9.setUserId((int) (byte) 10);
        boolean boolean13 = tarArchiveEntry9.isGlobalPaxHeader();
        tarArchiveEntry9.setGroupId((long) (byte) 10);
        boolean boolean16 = tarArchiveEntry9.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray17 = tarArchiveEntry9.getDirectoryEntries();
        java.lang.String str18 = tarArchiveEntry9.getLinkName();
        tarArchiveEntry9.setGroupId(35L);
        boolean boolean21 = tarArchiveEntry9.isCheckSumOK();
        boolean boolean22 = tarArchiveEntry2.equals(tarArchiveEntry9);
        tarArchiveEntry9.setGroupId(0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray17);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray17, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
        tarArchiveEntry2.setUserId((long) (byte) 49);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date23 = tarArchiveEntry22.getLastModifiedDate();
        boolean boolean24 = tarArchiveEntry22.isCharacterDevice();
        tarArchiveEntry22.setUserName("hi!");
        boolean boolean27 = tarArchiveEntry22.isStarSparse();
        boolean boolean28 = tarArchiveEntry22.isSymbolicLink();
        boolean boolean29 = tarArchiveEntry22.isLink();
        java.io.File file30 = tarArchiveEntry22.getFile();
        java.util.Date date31 = tarArchiveEntry22.getModTime();
        tarArchiveEntry2.setModTime(date31);
        java.util.Date date33 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "185) test2840(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "94) test2840(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date23);
// flaky "29) test2840(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNotNull(date31);
// flaky "12) test2840(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date33);
// flaky "4) test2840(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date33.toString(), "Mon Sep 28 13:40:41 ICT 2026");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
        boolean boolean15 = tarArchiveEntry10.isPaxHeader();
        tarArchiveEntry10.setUserId(0L);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.fillStarSparseData(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "186) test2841(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "95) test2841(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
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
        boolean boolean14 = tarArchiveEntry2.isGNULongLinkEntry();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 88, (byte) 53, (byte) 55, (byte) 83 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 88, (byte) 53, (byte) 55, (byte) 83 });
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        long long12 = tarArchiveEntry2.getRealSize();
        int int13 = tarArchiveEntry2.getUserId();
        tarArchiveEntry2.setGroupName("ustar\000");
        int int16 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setName("././@LongLink");
        tarArchiveEntry3.setDevMajor(100);
        long long9 = tarArchiveEntry3.getLongUserId();
        boolean boolean10 = tarArchiveEntry3.isFile();
        long long11 = tarArchiveEntry3.getSize();
        byte[] byteArray14 = new byte[] { (byte) 54, (byte) 50 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 54, (byte) 50 });
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", (byte) 48);
        int int3 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setMode((int) (byte) 55);
        long long10 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setModTime((long) 155);
        org.junit.Assert.assertNotNull(date3);
// flaky "187) test2846(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean11 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertNotNull(date3);
// flaky "188) test2847(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "96) test2847(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        int int9 = tarArchiveEntry2.getMode();
        int int10 = tarArchiveEntry2.getUserId();
        boolean boolean11 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertNotNull(date3);
// flaky "189) test2848(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        int int5 = tarArchiveEntry2.getDevMajor();
        int int6 = tarArchiveEntry2.getUserId();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertNotNull(date3);
// flaky "190) test2849(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long13 = tarArchiveEntry12.getSize();
        tarArchiveEntry12.setUserId((int) (byte) 10);
        boolean boolean16 = tarArchiveEntry12.isGlobalPaxHeader();
        tarArchiveEntry12.setGroupId((long) (byte) 10);
        long long19 = tarArchiveEntry12.getLongUserId();
        tarArchiveEntry12.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date23 = tarArchiveEntry12.getModTime();
        tarArchiveEntry2.setModTime(date23);
        boolean boolean25 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setSize(32L);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setSize((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(date23);
// flaky "191) test2850(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        boolean boolean3 = tarArchiveEntry1.isFIFO();
        java.lang.String str4 = tarArchiveEntry1.getLinkName();
        int int5 = tarArchiveEntry1.getDevMajor();
        org.junit.Assert.assertNotNull(date2);
// flaky "192) test2851(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean13 = tarArchiveEntry2.isExtended();
        boolean boolean14 = tarArchiveEntry2.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date18 = tarArchiveEntry17.getLastModifiedDate();
        boolean boolean19 = tarArchiveEntry17.isCheckSumOK();
        java.lang.String str20 = tarArchiveEntry17.getGroupName();
        java.io.File file21 = tarArchiveEntry17.getFile();
        tarArchiveEntry17.setGroupId(4);
        tarArchiveEntry17.setLinkName("00");
        boolean boolean26 = tarArchiveEntry2.equals((java.lang.Object) "00");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "193) test2852(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        boolean boolean9 = tarArchiveEntry2.equals(tarArchiveEntry8);
        boolean boolean10 = tarArchiveEntry8.isLink();
        tarArchiveEntry8.setGroupId((long) ' ');
        long long13 = tarArchiveEntry8.getLongGroupId();
        org.junit.Assert.assertNotNull(date3);
// flaky "194) test2853(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        int int25 = tarArchiveEntry12.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry28 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date29 = tarArchiveEntry28.getLastModifiedDate();
        boolean boolean30 = tarArchiveEntry28.isCharacterDevice();
        tarArchiveEntry28.setUserName("hi!");
        boolean boolean33 = tarArchiveEntry28.isGNULongNameEntry();
        long long34 = tarArchiveEntry28.getLongUserId();
        tarArchiveEntry28.setDevMajor((int) (short) 0);
        boolean boolean37 = tarArchiveEntry12.equals((java.lang.Object) (short) 0);
        int int38 = tarArchiveEntry12.getUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "195) test2854(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "97) test2854(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(date29);
// flaky "30) test2854(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date29.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        long long5 = tarArchiveEntry2.getRealSize();
        boolean boolean6 = tarArchiveEntry2.isGNULongLinkEntry();
        long long7 = tarArchiveEntry2.getRealSize();
        boolean boolean8 = tarArchiveEntry2.isSparse();
        int int9 = tarArchiveEntry2.getUserId();
        long long10 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertNotNull(date3);
// flaky "196) test2855(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
        tarArchiveEntry10.setGroupName("");
        tarArchiveEntry10.setDevMajor(4);
        byte[] byteArray65 = new byte[] { (byte) 55, (byte) 52, (byte) 52 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.parseTarHeader(byteArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "197) test2856(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "98) test2856(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(date27);
// flaky "31) test2856(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:41 ICT 2026");
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
// flaky "13) test2856(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date53.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date54);
// flaky "5) test2856(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date54.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 55, (byte) 52, (byte) 52 });
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        byte[] byteArray3 = new byte[] { (byte) 83, (byte) 53, (byte) 51 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 83, (byte) 53, (byte) 51 });
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
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
        tarArchiveEntry2.setGroupId(2097151L);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "198) test2858(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setIds((int) (byte) 49, 257);
        boolean boolean11 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean12 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertNotNull(date3);
// flaky "199) test2859(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 50, true);
        java.util.Date date4 = tarArchiveEntry3.getModTime();
        boolean boolean5 = tarArchiveEntry3.isStarSparse();
        boolean boolean6 = tarArchiveEntry3.isExtended();
        byte[] byteArray8 = new byte[] { (byte) 83 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date4);
// flaky "200) test2860(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 83 });
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        boolean boolean11 = tarArchiveEntry2.isGNUSparse();
        boolean boolean12 = tarArchiveEntry2.isGNULongNameEntry();
        byte[] byteArray15 = new byte[] { (byte) 54, (byte) 49 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray15, zipEncoding16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "201) test2861(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "99) test2861(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 54, (byte) 49 });
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
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
        tarArchiveEntry2.setGroupName("00");
        boolean boolean21 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean22 = tarArchiveEntry2.isFile();
        boolean boolean23 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setSize(33188L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "202) test2862(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        boolean boolean3 = tarArchiveEntry2.isPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isPaxHeader();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
        boolean boolean10 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setName("00");
        java.io.File file13 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        boolean boolean2 = tarArchiveEntry1.isFile();
        tarArchiveEntry1.setModTime((-1L));
        boolean boolean5 = tarArchiveEntry1.isFile();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserId((int) (byte) 76);
        tarArchiveEntry2.setUserName("ustar\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "203) test2866(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "100) test2866(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId(10L);
        tarArchiveEntry2.setMode(12);
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertNotNull(date5);
// flaky "204) test2867(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date10);
// flaky "101) test2867(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:41 ICT 2026");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isFIFO();
        boolean boolean12 = tarArchiveEntry2.isStarSparse();
        boolean boolean13 = tarArchiveEntry2.isCheckSumOK();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 100, true);
        tarArchiveEntry3.setSize((long) (short) 10);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        java.io.File file8 = tarArchiveEntry2.getFile();
        boolean boolean9 = tarArchiveEntry2.isCharacterDevice();
        byte[] byteArray10 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray10, zipEncoding11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        int int11 = tarArchiveEntry2.getGroupId();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str10 = tarArchiveEntry2.getLinkName();
        boolean boolean11 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "205) test2872(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "102) test2872(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        boolean boolean22 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "206) test2873(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isGNUSparse();
        tarArchiveEntry3.setUserId((long) (byte) 50);
        boolean boolean8 = tarArchiveEntry3.isGlobalPaxHeader();
        long long9 = tarArchiveEntry3.getLongGroupId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
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
        tarArchiveEntry7.setDevMinor(508);
        int int25 = tarArchiveEntry7.getDevMinor();
        int int26 = tarArchiveEntry7.getMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "207) test2875(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "103) test2875(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray15);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray15, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 508 + "'", int25 == 508);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 33188 + "'", int26 == 33188);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 120, false);
        tarArchiveEntry3.setUserId((long) 31);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        java.io.File file8 = tarArchiveEntry2.getFile();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setDevMajor((int) (byte) 53);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        long long26 = tarArchiveEntry12.getLongUserId();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry12.fillStarSparseData(strMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
        tarArchiveEntry11.setGroupId(0);
        tarArchiveEntry11.setLinkName("tar\000");
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
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("0\000");
        tarArchiveEntry2.setUserId((int) 'a');
        long long14 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setUserId((int) (byte) 1);
        tarArchiveEntry2.setSize((long) 2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
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
        boolean boolean26 = tarArchiveEntry12.isGNULongLinkEntry();
        int int27 = tarArchiveEntry12.getDevMajor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "208) test2881(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "104) test2881(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(date25);
// flaky "32) test2881(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean12 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setMode(32);
        boolean boolean15 = tarArchiveEntry2.isLink();
        tarArchiveEntry2.setGroupName("ustar\000");
        boolean boolean18 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId((int) (byte) 48);
        boolean boolean12 = tarArchiveEntry2.isPaxGNUSparse();
        int int13 = tarArchiveEntry2.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        tarArchiveEntry16.setGroupId((long) 131);
        boolean boolean19 = tarArchiveEntry2.equals((java.lang.Object) 131);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        tarArchiveEntry2.setGroupId(32L);
        tarArchiveEntry2.setUserId((int) (byte) 76);
        boolean boolean14 = tarArchiveEntry2.isCheckSumOK();
        int int15 = tarArchiveEntry2.getDevMajor();
        boolean boolean16 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.lang.String str20 = tarArchiveEntry19.getUserName();
        boolean boolean21 = tarArchiveEntry19.isPaxGNUSparse();
        boolean boolean22 = tarArchiveEntry2.equals(tarArchiveEntry19);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry19.parseTarHeader(byteArray25, zipEncoding26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "209) test2884(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "105) test2884(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 103 });
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
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
        byte[] byteArray30 = new byte[] { (byte) 49 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry7.writeEntryHeader(byteArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "210) test2885(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "106) test2885(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:41 ICT 2026");
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
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 49 });
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        long long5 = tarArchiveEntry3.getRealSize();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setIds((int) 'a', (int) (byte) 54);
        tarArchiveEntry3.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray12 = tarArchiveEntry3.getDirectoryEntries();
        long long13 = tarArchiveEntry3.getLongGroupId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray12);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray12, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 54L + "'", long13 == 54L);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        java.lang.String str10 = tarArchiveEntry2.getName();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean12 = tarArchiveEntry2.isGNUSparse();
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean17 = tarArchiveEntry16.isGlobalPaxHeader();
        boolean boolean18 = tarArchiveEntry16.isFile();
        boolean boolean19 = tarArchiveEntry16.isDirectory();
        tarArchiveEntry16.setSize((long) 504);
        boolean boolean22 = tarArchiveEntry16.isSparse();
        java.lang.String str23 = tarArchiveEntry16.getUserName();
        long long24 = tarArchiveEntry16.getLongGroupId();
        tarArchiveEntry16.setLinkName("hi!");
        boolean boolean27 = tarArchiveEntry16.isOldGNUSparse();
        boolean boolean28 = tarArchiveEntry2.equals(tarArchiveEntry16);
        boolean boolean29 = tarArchiveEntry16.isBlockDevice();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "211) test2887(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        long long10 = tarArchiveEntry2.getSize();
        long long11 = tarArchiveEntry2.getRealSize();
        java.lang.Class<?> wildcardClass12 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
        boolean boolean20 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setModTime(8589934591L);
        tarArchiveEntry2.setGroupName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "212) test2889(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "107) test2889(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isLink();
        byte[] byteArray17 = new byte[] { (byte) 76, (byte) 54, (byte) 53, (byte) 76, (byte) 55, (byte) 75 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 76, (byte) 54, (byte) 53, (byte) 76, (byte) 55, (byte) 75 });
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setGroupId((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "213) test2891(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "108) test2891(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserId(148);
        int int7 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
// flaky "214) test2892(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(35L);
        tarArchiveEntry2.setDevMinor((int) (byte) 48);
        tarArchiveEntry2.setLinkName("\000\000");
        tarArchiveEntry2.setNames("0\000", " \000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 52, true);
        tarArchiveEntry3.setGroupId((int) '4');
        java.io.File file6 = tarArchiveEntry3.getFile();
        boolean boolean7 = tarArchiveEntry3.isSymbolicLink();
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        int int9 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setLinkName("hi!");
        boolean boolean12 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean13 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setUserName("ustar\000");
        org.junit.Assert.assertNotNull(date3);
// flaky "215) test2895(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
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
        boolean boolean16 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setModTime(2097151L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
        tarArchiveEntry2.setGroupName("ustar\000");
        java.lang.String str15 = tarArchiveEntry2.getUserName();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 120, (byte) 83, (byte) 103 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 120, (byte) 83, (byte) 103 });
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        java.lang.String str9 = tarArchiveEntry2.getUserName();
        long long10 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setLinkName("hi!");
        boolean boolean13 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setUserId((int) '4');
        boolean boolean16 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
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
        tarArchiveEntry8.setName("././@LongLink");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean30 = tarArchiveEntry25.equals(tarArchiveEntry29);
        boolean boolean31 = tarArchiveEntry8.equals((java.lang.Object) tarArchiveEntry29);
        int int32 = tarArchiveEntry29.getDevMinor();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry29.fillGNUSparse1xData(strMap33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "216) test2899(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setName("ustar\000");
        int int9 = tarArchiveEntry3.getDevMinor();
        boolean boolean10 = tarArchiveEntry3.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str15 = tarArchiveEntry14.getLinkName();
        tarArchiveEntry14.setNames("00", "hi!");
        boolean boolean19 = tarArchiveEntry14.isStarSparse();
        tarArchiveEntry14.setUserName("tar\000");
        java.util.Date date22 = tarArchiveEntry14.getModTime();
        tarArchiveEntry3.setModTime(date22);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "217) test2900(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:41 ICT 2026");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isGNULongLinkEntry();
        java.lang.String str8 = tarArchiveEntry3.getGroupName();
        boolean boolean9 = tarArchiveEntry3.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry3.isSymbolicLink();
        java.lang.String str11 = tarArchiveEntry3.getGroupName();
        boolean boolean12 = tarArchiveEntry3.isExtended();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long14 = tarArchiveEntry13.getSize();
        tarArchiveEntry13.setUserId((int) (byte) 10);
        boolean boolean17 = tarArchiveEntry13.isGlobalPaxHeader();
        tarArchiveEntry13.setGroupId((long) (byte) 10);
        long long20 = tarArchiveEntry13.getLongUserId();
        tarArchiveEntry13.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date24 = tarArchiveEntry13.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean28 = tarArchiveEntry27.isGlobalPaxHeader();
        boolean boolean29 = tarArchiveEntry27.isFile();
        java.lang.String str30 = tarArchiveEntry27.getName();
        tarArchiveEntry27.setLinkName("00");
        long long33 = tarArchiveEntry27.getLongGroupId();
        int int34 = tarArchiveEntry27.getMode();
        boolean boolean35 = tarArchiveEntry13.equals(tarArchiveEntry27);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry38 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long39 = tarArchiveEntry38.getSize();
        tarArchiveEntry38.setUserId((int) (byte) 10);
        boolean boolean42 = tarArchiveEntry38.isGlobalPaxHeader();
        boolean boolean43 = tarArchiveEntry38.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry46 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry46.setLinkName("tar\000");
        boolean boolean49 = tarArchiveEntry46.isDirectory();
        java.util.Date date50 = tarArchiveEntry46.getLastModifiedDate();
        java.util.Date date51 = tarArchiveEntry46.getModTime();
        tarArchiveEntry38.setModTime(date51);
        tarArchiveEntry13.setModTime(date51);
        tarArchiveEntry2.setModTime(date51);
        tarArchiveEntry2.setGroupName("ustar\000");
        tarArchiveEntry2.setDevMinor(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "218) test2902(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "109) test2902(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(date24);
// flaky "33) test2902(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ustar " + "'", str30, "ustar ");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 33188 + "'", int34 == 33188);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(date50);
// flaky "14) test2902(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date50.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date51);
// flaky "6) test2902(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date51.toString(), "Mon Sep 28 13:40:41 ICT 2026");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 100, true);
        long long4 = tarArchiveEntry3.getRealSize();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        tarArchiveEntry2.setDevMajor(508);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isLink();
        boolean boolean10 = tarArchiveEntry2.isBlockDevice();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        boolean boolean12 = tarArchiveEntry2.isDirectory();
        java.lang.String str13 = tarArchiveEntry2.getName();
        boolean boolean14 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setModTime(0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ustar " + "'", str13, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.lang.String str3 = tarArchiveEntry2.getName();
        java.lang.String str4 = tarArchiveEntry2.getLinkName();
        boolean boolean5 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ustar " + "'", str3, "ustar ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 76, true);
        tarArchiveEntry3.setLinkName("tar\000");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        long long4 = tarArchiveEntry2.getSize();
        java.lang.String str5 = tarArchiveEntry2.getLinkName();
        boolean boolean6 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setModTime((long) 75);
        org.junit.Assert.assertNotNull(date3);
// flaky "219) test2908(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setModTime((long) (byte) 49);
        long long13 = tarArchiveEntry2.getLongUserId();
        boolean boolean14 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 53);
        java.lang.Class<?> wildcardClass3 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        int int2 = tarArchiveEntry1.getUserId();
        java.lang.String str3 = tarArchiveEntry1.getGroupName();
        tarArchiveEntry1.setSize((long) 8);
        long long6 = tarArchiveEntry1.getSize();
        boolean boolean7 = tarArchiveEntry1.isCharacterDevice();
        tarArchiveEntry1.setModTime(1L);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.fillGNUSparse0xData(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8L + "'", long6 == 8L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setName("0\000");
        int int13 = tarArchiveEntry2.getMode();
        boolean boolean14 = tarArchiveEntry2.isGlobalPaxHeader();
        long long15 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "220) test2912(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "110) test2912(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33188 + "'", int13 == 33188);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
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
        boolean boolean21 = tarArchiveEntry11.isFIFO();
        int int22 = tarArchiveEntry11.getGroupId();
        boolean boolean23 = tarArchiveEntry11.isFIFO();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
// flaky "221) test2913(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "111) test2913(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
        boolean boolean16 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setGroupId((long) 8);
        long long19 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        boolean boolean21 = tarArchiveEntry11.isFIFO();
        boolean boolean22 = tarArchiveEntry11.isPaxGNUSparse();
        java.io.File file23 = tarArchiveEntry11.getFile();
        boolean boolean24 = tarArchiveEntry11.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
// flaky "222) test2915(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "112) test2915(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setUserId(0L);
        java.lang.String str9 = tarArchiveEntry3.getLinkName();
        boolean boolean10 = tarArchiveEntry3.isFIFO();
        tarArchiveEntry3.setGroupId(100L);
        tarArchiveEntry3.setModTime(4L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setSize((long) 35);
        long long11 = tarArchiveEntry2.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        boolean boolean18 = tarArchiveEntry14.isGlobalPaxHeader();
        tarArchiveEntry14.setGroupId((long) (byte) 10);
        boolean boolean21 = tarArchiveEntry14.isBlockDevice();
        tarArchiveEntry14.setUserId(100L);
        java.lang.String str24 = tarArchiveEntry14.getLinkName();
        boolean boolean25 = tarArchiveEntry14.isGNULongNameEntry();
        java.util.Date date26 = tarArchiveEntry14.getModTime();
        tarArchiveEntry2.setModTime(date26);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "223) test2917(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "113) test2917(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date26);
// flaky "34) test2917(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:41 ICT 2026");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
        boolean boolean27 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "224) test2918(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "114) test2918(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "35) test2918(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 52, true);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setNames("0\000", "");
        int int9 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        long long5 = tarArchiveEntry3.getRealSize();
        tarArchiveEntry3.setMode((int) (byte) 51);
        boolean boolean8 = tarArchiveEntry3.isOldGNUSparse();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        java.lang.String str9 = tarArchiveEntry7.getUserName();
        boolean boolean10 = tarArchiveEntry3.isDescendent(tarArchiveEntry7);
        java.io.File file11 = tarArchiveEntry7.getFile();
        boolean boolean12 = tarArchiveEntry7.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setGroupId((int) (byte) 55);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        boolean boolean13 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "225) test2923(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        int int17 = tarArchiveEntry2.getDevMajor();
        java.lang.Class<?> wildcardClass18 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "226) test2924(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserId(148);
        java.lang.String str7 = tarArchiveEntry2.getLinkName();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
// flaky "227) test2925(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse0xData(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "228) test2926(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "115) test2926(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean10 = tarArchiveEntry2.isDirectory();
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setSize((long) (byte) 103);
        org.junit.Assert.assertNotNull(date3);
// flaky "229) test2927(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        int int9 = tarArchiveEntry2.getUserId();
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setUserId((long) (short) -1);
        boolean boolean13 = tarArchiveEntry2.isSparse();
        boolean boolean14 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "230) test2929(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "116) test2929(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        long long8 = tarArchiveEntry2.getRealSize();
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        boolean boolean2 = tarArchiveEntry1.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        int int11 = tarArchiveEntry2.getDevMinor();
        byte[] byteArray12 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "231) test2932(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "117) test2932(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
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
        long long16 = tarArchiveEntry2.getLongGroupId();
        boolean boolean17 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setDevMajor(48);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isFIFO();
        boolean boolean5 = tarArchiveEntry3.isGNUSparse();
        boolean boolean6 = tarArchiveEntry3.isSparse();
        byte[] byteArray9 = new byte[] { (byte) 49, (byte) 53 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray9, zipEncoding10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 49, (byte) 53 });
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(257);
        boolean boolean11 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean12 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean13 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
            tarArchiveEntry3.fillStarSparseData(strMap31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date8);
// flaky "232) test2936(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(date24);
// flaky "118) test2936(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date25);
// flaky "36) test2936(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 33188 + "'", int26 == 33188);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
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
        tarArchiveEntry12.setGroupId(0);
        java.io.File file46 = tarArchiveEntry12.getFile();
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
// flaky "233) test2937(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date41);
// flaky "119) test2937(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(file46);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str4 = tarArchiveEntry2.getUserName();
        boolean boolean5 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setModTime((long) (byte) 100);
        tarArchiveEntry2.setSize((long) ' ');
        boolean boolean10 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setIds(155, 96);
        tarArchiveEntry2.setSize(2097151L);
        tarArchiveEntry2.setGroupName("ustar ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        long long4 = tarArchiveEntry2.getSize();
        boolean boolean5 = tarArchiveEntry2.isPaxHeader();
        boolean boolean6 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "234) test2940(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
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
        tarArchiveEntry2.setLinkName("hi!");
        tarArchiveEntry2.setModTime((long) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean22 = tarArchiveEntry21.isGlobalPaxHeader();
        java.util.Date date23 = tarArchiveEntry21.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date23);
        tarArchiveEntry2.setUserId((long) 10);
        boolean boolean27 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "235) test2941(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "120) test2941(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date23);
// flaky "37) test2941(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setNames("00", "hi!");
        boolean boolean8 = tarArchiveEntry3.isStarSparse();
        java.io.File file9 = tarArchiveEntry3.getFile();
        tarArchiveEntry3.setLinkName(" \000");
        boolean boolean12 = tarArchiveEntry3.isGlobalPaxHeader();
        boolean boolean13 = tarArchiveEntry3.isCheckSumOK();
        boolean boolean14 = tarArchiveEntry3.isBlockDevice();
        boolean boolean15 = tarArchiveEntry3.isExtended();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", true);
        tarArchiveEntry2.setNames("", "hi!");
        tarArchiveEntry2.setIds((int) (byte) 83, 155);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", true);
        tarArchiveEntry2.setNames("", "hi!");
        java.lang.String str6 = tarArchiveEntry2.getName();
        byte[] byteArray7 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray7, zipEncoding8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar " + "'", str6, "ustar ");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        boolean boolean10 = tarArchiveEntry2.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isDirectory();
        tarArchiveEntry13.setSize((long) 504);
        java.lang.String str19 = tarArchiveEntry13.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date23 = tarArchiveEntry22.getLastModifiedDate();
        boolean boolean24 = tarArchiveEntry22.isCharacterDevice();
        tarArchiveEntry22.setUserName("hi!");
        tarArchiveEntry22.setGroupName("");
        java.util.Date date29 = tarArchiveEntry22.getModTime();
        tarArchiveEntry13.setModTime(date29);
        tarArchiveEntry2.setModTime(date29);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray32 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean33 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "236) test2945(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "121) test2945(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(date23);
// flaky "38) test2945(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(date29);
// flaky "15) test2945(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date29.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray32);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray32, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        tarArchiveEntry2.setIds(131, (int) (byte) 120);
        boolean boolean15 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "237) test2946(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "122) test2946(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:41 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
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
        tarArchiveEntry12.setNames("ustar\000", "ustar ");
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
// flaky "238) test2947(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date41);
// flaky "123) test2947(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setUserName("tar\000");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setModTime((long) 1);
        long long11 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
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
        boolean boolean16 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setNames("ustar ", " \000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setSize((long) (byte) 120);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "239) test2951(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "124) test2951(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
        boolean boolean24 = tarArchiveEntry12.isPaxGNUSparse();
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 76 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry12.parseTarHeader(byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "240) test2952(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "125) test2952(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 76 });
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isOldGNUSparse();
        boolean boolean6 = tarArchiveEntry3.isBlockDevice();
        boolean boolean7 = tarArchiveEntry3.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean5 = tarArchiveEntry2.isFile();
        boolean boolean6 = tarArchiveEntry2.isDirectory();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        byte[] byteArray9 = new byte[] { (byte) 103 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
// flaky "241) test2954(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 103 });
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        boolean boolean16 = tarArchiveEntry2.isStarSparse();
        boolean boolean17 = tarArchiveEntry2.isLink();
        tarArchiveEntry2.setMode((int) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "242) test2955(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
        boolean boolean17 = tarArchiveEntry2.isSymbolicLink();
        int int18 = tarArchiveEntry2.getDevMinor();
        byte[] byteArray20 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "243) test2956(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1 });
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
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
        boolean boolean17 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean18 = tarArchiveEntry2.isSparse();
        long long19 = tarArchiveEntry2.getRealSize();
        boolean boolean20 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "244) test2957(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
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
        tarArchiveEntry2.setUserName("");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "245) test2958(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "126) test2958(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setDevMinor(257);
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setModTime((long) (byte) 53);
        tarArchiveEntry2.setMode(0);
        tarArchiveEntry2.setGroupId((long) 2);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "246) test2959(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isGNULongNameEntry();
        int int8 = tarArchiveEntry3.getMode();
        boolean boolean9 = tarArchiveEntry3.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        boolean boolean3 = tarArchiveEntry2.isPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        boolean boolean9 = tarArchiveEntry7.isFile();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        java.util.Date date11 = tarArchiveEntry7.getModTime();
        boolean boolean12 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry7);
        tarArchiveEntry2.setSize(1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "247) test2961(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "127) test2961(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date12 = tarArchiveEntry11.getLastModifiedDate();
        int int13 = tarArchiveEntry11.getGroupId();
        tarArchiveEntry11.setGroupName("ustar ");
        boolean boolean16 = tarArchiveEntry11.isLink();
        tarArchiveEntry11.setUserName("\000\000");
        boolean boolean19 = tarArchiveEntry11.isCharacterDevice();
        boolean boolean20 = tarArchiveEntry2.isDescendent(tarArchiveEntry11);
        long long21 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "248) test2962(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        boolean boolean8 = tarArchiveEntry2.isExtended();
        long long9 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setGroupName("\000\000");
        org.junit.Assert.assertNotNull(date3);
// flaky "249) test2963(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
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
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.fillStarSparseData(strMap29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "250) test2964(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "128) test2964(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "39) test2964(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isCheckSumOK();
        int int9 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean12 = tarArchiveEntry11.isCharacterDevice();
        tarArchiveEntry11.setName("././@LongLink");
        boolean boolean15 = tarArchiveEntry3.equals(tarArchiveEntry11);
        boolean boolean16 = tarArchiveEntry11.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long20 = tarArchiveEntry19.getSize();
        tarArchiveEntry19.setUserId((int) (byte) 10);
        long long23 = tarArchiveEntry19.getLongUserId();
        int int24 = tarArchiveEntry19.getMode();
        tarArchiveEntry19.setSize((long) 32);
        long long27 = tarArchiveEntry19.getSize();
        int int28 = tarArchiveEntry19.getMode();
        tarArchiveEntry19.setUserId((int) (byte) 76);
        boolean boolean31 = tarArchiveEntry11.equals((java.lang.Object) (byte) 76);
        long long32 = tarArchiveEntry11.getLongUserId();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.fillGNUSparse0xData(strMap33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33188 + "'", int24 == 33188);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 33188 + "'", int28 == 33188);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setNames(" \000", " \000");
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        boolean boolean14 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "251) test2967(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "129) test2967(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "40) test2967(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
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
        boolean boolean13 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "252) test2968(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "130) test2968(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean36 = tarArchiveEntry35.isGlobalPaxHeader();
        boolean boolean37 = tarArchiveEntry35.isFile();
        boolean boolean38 = tarArchiveEntry35.isDirectory();
        tarArchiveEntry35.setSize((long) 504);
        boolean boolean41 = tarArchiveEntry35.isSparse();
        boolean boolean42 = tarArchiveEntry35.isPaxHeader();
        boolean boolean43 = tarArchiveEntry3.equals(tarArchiveEntry35);
        long long44 = tarArchiveEntry35.getLongUserId();
        boolean boolean45 = tarArchiveEntry35.isPaxGNUSparse();
        tarArchiveEntry35.setSize((long) '#');
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
// flaky "253) test2969(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 10, false);
        tarArchiveEntry3.setGroupId((int) '4');
        tarArchiveEntry3.setName("0\000");
        java.lang.String str8 = tarArchiveEntry3.getUserName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setDevMajor(33188);
        byte[] byteArray12 = new byte[] { (byte) 54, (byte) 103, (byte) 51 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 54, (byte) 103, (byte) 51 });
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean7 = tarArchiveEntry2.isCharacterDevice();
        long long8 = tarArchiveEntry2.getLongUserId();
        int int9 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str9 = tarArchiveEntry2.getName();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        int int11 = tarArchiveEntry2.getGroupId();
        byte[] byteArray15 = new byte[] { (byte) 55, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "254) test2973(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "131) test2973(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 55, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
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
        tarArchiveEntry2.setUserId((int) (byte) 55);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        int int13 = tarArchiveEntry2.getUserId();
        tarArchiveEntry2.setDevMinor((int) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "255) test2976(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        java.io.File file6 = tarArchiveEntry2.getFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        java.util.Date date12 = tarArchiveEntry9.getModTime();
        java.util.Date date13 = tarArchiveEntry9.getModTime();
        tarArchiveEntry9.setUserId((long) '#');
        boolean boolean16 = tarArchiveEntry9.isCheckSumOK();
        boolean boolean17 = tarArchiveEntry9.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean21 = tarArchiveEntry20.isGlobalPaxHeader();
        boolean boolean22 = tarArchiveEntry20.isFile();
        boolean boolean23 = tarArchiveEntry20.isPaxGNUSparse();
        java.io.File file24 = tarArchiveEntry20.getFile();
        boolean boolean25 = tarArchiveEntry20.isPaxGNUSparse();
        boolean boolean26 = tarArchiveEntry9.isDescendent(tarArchiveEntry20);
        java.lang.String str27 = tarArchiveEntry9.getName();
        java.util.Date date28 = tarArchiveEntry9.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date28);
        org.junit.Assert.assertNotNull(date3);
// flaky "256) test2977(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(date12);
// flaky "132) test2977(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date13);
// flaky "41) test2977(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ustar " + "'", str27, "ustar ");
        org.junit.Assert.assertNotNull(date28);
// flaky "16) test2977(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date28.toString(), "Mon Sep 28 13:40:42 ICT 2026");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 83, true);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 50);
        boolean boolean3 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        int int24 = tarArchiveEntry13.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "257) test2980(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "133) test2980(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:42 ICT 2026");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        java.io.File file8 = tarArchiveEntry2.getFile();
        boolean boolean9 = tarArchiveEntry2.isPaxGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
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
        boolean boolean18 = tarArchiveEntry13.isLink();
        java.io.File file19 = tarArchiveEntry13.getFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "258) test2982(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "134) test2982(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(file19);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setDevMajor(33188);
        tarArchiveEntry2.setLinkName("hi!");
        long long11 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isFIFO();
        long long9 = tarArchiveEntry2.getSize();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        int int11 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setIds(0, (int) (byte) 50);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean8 = tarArchiveEntry3.isFile();
        boolean boolean9 = tarArchiveEntry3.isGNUSparse();
        long long10 = tarArchiveEntry3.getLongUserId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        long long5 = tarArchiveEntry2.getRealSize();
        tarArchiveEntry2.setLinkName("0\000");
        int int8 = tarArchiveEntry2.getDevMinor();
        java.io.File file9 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertNotNull(date3);
// flaky "259) test2986(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setLinkName("ustar ");
        boolean boolean12 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertNotNull(date3);
// flaky "260) test2987(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isLink();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setIds((int) (byte) 75, (int) (byte) 83);
        tarArchiveEntry2.setLinkName("ustar\000");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
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
        tarArchiveEntry2.setDevMinor(257);
        boolean boolean19 = tarArchiveEntry2.isOldGNUSparse();
        java.lang.String str20 = tarArchiveEntry2.getGroupName();
        java.util.Date date21 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(date21);
// flaky "261) test2989(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:42 ICT 2026");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        byte[] byteArray2 = new byte[] { (byte) 55, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 55, (byte) 100 });
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
        tarArchiveEntry10.setUserId(0L);
        tarArchiveEntry10.setGroupId(2097151L);
        boolean boolean23 = tarArchiveEntry10.isFIFO();
        boolean boolean24 = tarArchiveEntry10.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 504L + "'", long16 == 504L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setSize(2097151L);
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        java.lang.String str12 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertNotNull(date3);
// flaky "262) test2992(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry26 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long27 = tarArchiveEntry26.getSize();
        tarArchiveEntry26.setUserId((int) (byte) 10);
        long long30 = tarArchiveEntry26.getLongUserId();
        tarArchiveEntry26.setDevMajor(16877);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date36 = tarArchiveEntry35.getLastModifiedDate();
        boolean boolean37 = tarArchiveEntry35.isCharacterDevice();
        tarArchiveEntry35.setUserName("hi!");
        tarArchiveEntry35.setDevMinor(257);
        boolean boolean42 = tarArchiveEntry26.equals(tarArchiveEntry35);
        boolean boolean43 = tarArchiveEntry26.isStarSparse();
        tarArchiveEntry26.setGroupName("ustar ");
        boolean boolean46 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry26);
        tarArchiveEntry26.setUserId((long) 0);
        boolean boolean49 = tarArchiveEntry26.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "263) test2993(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ustar " + "'", str22, "ustar ");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(date36);
// flaky "135) test2993(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date36.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setUserName("\000\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry3.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date14 = tarArchiveEntry13.getLastModifiedDate();
        boolean boolean15 = tarArchiveEntry13.isCharacterDevice();
        tarArchiveEntry13.setGroupId(12);
        boolean boolean18 = tarArchiveEntry3.equals((java.lang.Object) 12);
        boolean boolean19 = tarArchiveEntry3.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date14);
// flaky "264) test2994(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
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
        tarArchiveEntry2.setIds((int) (short) 0, (int) (byte) -1);
        boolean boolean21 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "265) test2995(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "136) test2995(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33188 + "'", int14 == 33188);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.lang.String str6 = tarArchiveEntry2.getUserName();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        long long8 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
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
        boolean boolean19 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "266) test2997(org.apache.commons.compress.archivers.tar.RegressionTest5)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:42 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 0);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(35L);
        boolean boolean14 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean15 = tarArchiveEntry2.isGNUSparse();
        boolean boolean16 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setGroupId(53);
        byte[] byteArray24 = new byte[] { (byte) 49, (byte) 88, (byte) 50, (byte) 88, (byte) 49 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray24, zipEncoding25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 49, (byte) 88, (byte) 50, (byte) 88, (byte) 49 });
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setNames("00", "hi!");
        boolean boolean8 = tarArchiveEntry3.isStarSparse();
        java.io.File file9 = tarArchiveEntry3.getFile();
        java.lang.String str10 = tarArchiveEntry3.getLinkName();
        boolean boolean11 = tarArchiveEntry3.isExtended();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}
