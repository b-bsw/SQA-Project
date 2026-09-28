package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
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
        tarArchiveEntry2.setUserId((long) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean21 = tarArchiveEntry20.isGlobalPaxHeader();
        boolean boolean22 = tarArchiveEntry20.isFile();
        java.util.Date date23 = tarArchiveEntry20.getModTime();
        java.util.Date date24 = tarArchiveEntry20.getModTime();
        int int25 = tarArchiveEntry20.getMode();
        tarArchiveEntry20.setNames("00", "");
        tarArchiveEntry20.setGroupId(0);
        tarArchiveEntry20.setGroupId(2);
        boolean boolean33 = tarArchiveEntry2.equals(tarArchiveEntry20);
        byte[] byteArray40 = new byte[] { (byte) 75, (byte) 103, (byte) 52, (byte) 100, (byte) 120, (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry20.parseTarHeader(byteArray40, zipEncoding41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "1) test5501(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "1) test5501(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date23);
// flaky "1) test5501(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date24);
// flaky "1) test5501(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 33188 + "'", int25 == 33188);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 75, (byte) 103, (byte) 52, (byte) 100, (byte) 120, (byte) 76 });
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean10 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setNames("\000\000", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "2) test5502(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "2) test5502(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isSymbolicLink();
        boolean boolean6 = tarArchiveEntry3.isDirectory();
        java.util.Date date7 = tarArchiveEntry3.getModTime();
        boolean boolean8 = tarArchiveEntry3.isCheckSumOK();
        boolean boolean9 = tarArchiveEntry3.isGNULongLinkEntry();
        tarArchiveEntry3.setGroupName("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date7);
// flaky "3) test5503(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date7.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
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
        tarArchiveEntry2.setGroupId((long) 131);
        int int18 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "4) test5504(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "3) test5504(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 131 + "'", int18 == 131);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        byte[] byteArray2 = new byte[] { (byte) 52, (byte) 52 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 52, (byte) 52 });
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
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
        int int24 = tarArchiveEntry14.getUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean28 = tarArchiveEntry27.isGlobalPaxHeader();
        boolean boolean29 = tarArchiveEntry27.isFile();
        java.util.Date date30 = tarArchiveEntry27.getModTime();
        java.util.Date date31 = tarArchiveEntry27.getModTime();
        tarArchiveEntry27.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean36 = tarArchiveEntry27.isDescendent(tarArchiveEntry35);
        tarArchiveEntry35.setUserId((int) '#');
        boolean boolean39 = tarArchiveEntry35.isExtended();
        tarArchiveEntry35.setGroupId((int) (byte) 53);
        long long42 = tarArchiveEntry35.getSize();
        java.lang.String str43 = tarArchiveEntry35.getName();
        java.util.Date date44 = tarArchiveEntry35.getModTime();
        tarArchiveEntry14.setModTime(date44);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry48 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long49 = tarArchiveEntry48.getSize();
        tarArchiveEntry48.setUserId((int) (byte) 10);
        boolean boolean52 = tarArchiveEntry48.isBlockDevice();
        tarArchiveEntry48.setLinkName("ustar\000");
        boolean boolean55 = tarArchiveEntry48.isPaxHeader();
        int int56 = tarArchiveEntry48.getGroupId();
        boolean boolean57 = tarArchiveEntry14.equals((java.lang.Object) tarArchiveEntry48);
        boolean boolean58 = tarArchiveEntry48.isCharacterDevice();
        tarArchiveEntry48.setIds(16877, 0);
        java.lang.String str62 = tarArchiveEntry48.getLinkName();
        boolean boolean63 = tarArchiveEntry48.isSparse();
        int int64 = tarArchiveEntry48.getDevMajor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "5) test5506(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "4) test5506(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date30);
// flaky "2) test5506(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date31);
// flaky "2) test5506(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ustar " + "'", str43, "ustar ");
        org.junit.Assert.assertNotNull(date44);
// flaky "1) test5506(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date44.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ustar\000" + "'", str62, "ustar\000");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setDevMinor(148);
        boolean boolean7 = tarArchiveEntry2.isLink();
        boolean boolean8 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean9 = tarArchiveEntry2.isStarSparse();
        boolean boolean10 = tarArchiveEntry2.isOldGNUSparse();
        int int11 = tarArchiveEntry2.getGroupId();
        boolean boolean12 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "6) test5507(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        java.io.File file8 = tarArchiveEntry2.getFile();
        boolean boolean9 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean10 = tarArchiveEntry2.isBlockDevice();
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        int int12 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        long long10 = tarArchiveEntry2.getSize();
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setGroupName("");
        boolean boolean14 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean15 = tarArchiveEntry2.isGNUSparse();
        java.io.File file16 = tarArchiveEntry2.getFile();
        long long17 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean8 = tarArchiveEntry7.isCharacterDevice();
        boolean boolean9 = tarArchiveEntry7.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date13 = tarArchiveEntry12.getLastModifiedDate();
        tarArchiveEntry7.setModTime(date13);
        boolean boolean15 = tarArchiveEntry3.equals((java.lang.Object) tarArchiveEntry7);
        java.io.File file16 = tarArchiveEntry3.getFile();
        boolean boolean17 = tarArchiveEntry3.isPaxHeader();
        int int18 = tarArchiveEntry3.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "7) test5510(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        java.io.File file6 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setGroupId(4);
        boolean boolean9 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setIds((int) (byte) 100, (int) (byte) 51);
        tarArchiveEntry2.setGroupId((long) 53);
        org.junit.Assert.assertNotNull(date3);
// flaky "8) test5511(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
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
        int int19 = tarArchiveEntry2.getMode();
        boolean boolean20 = tarArchiveEntry2.isCheckSumOK();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setDevMinor((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minor device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "9) test5512(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33188 + "'", int19 == 33188);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
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
        tarArchiveEntry2.setUserId((int) (byte) 55);
        boolean boolean16 = tarArchiveEntry2.isPaxHeader();
        boolean boolean17 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "10) test5513(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
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
        tarArchiveEntry2.setMode((int) (byte) 55);
        boolean boolean19 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("");
        java.util.Date date22 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "11) test5514(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "5) test5514(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:58 ICT 2026");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
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
        boolean boolean16 = tarArchiveEntry2.isStarSparse();
        java.lang.String str17 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ustar " + "'", str17, "ustar ");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        boolean boolean8 = tarArchiveEntry2.isExtended();
        long long9 = tarArchiveEntry2.getSize();
        boolean boolean10 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "12) test5516(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", true);
        int int3 = tarArchiveEntry2.getMode();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setGroupId((long) 32);
        boolean boolean8 = tarArchiveEntry2.isGNUSparse();
        boolean boolean9 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33188 + "'", int3 == 33188);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        int int9 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setMode((int) (byte) 54);
        tarArchiveEntry2.setMode(33188);
        org.junit.Assert.assertNotNull(date3);
// flaky "13) test5518(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 75, false);
        java.util.Date date4 = tarArchiveEntry3.getModTime();
        org.junit.Assert.assertNotNull(date4);
// flaky "14) test5519(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:58 ICT 2026");
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        boolean boolean13 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setNames("00", "\000\000");
        boolean boolean17 = tarArchiveEntry2.isGNULongLinkEntry();
        java.io.File file18 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "15) test5520(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(file18);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
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
        tarArchiveEntry2.setSize(0L);
        byte[] byteArray26 = new byte[] { (byte) 51, (byte) 10, (byte) 51, (byte) 48, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "16) test5521(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "6) test5521(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "3) test5521(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 51, (byte) 10, (byte) 51, (byte) 48, (byte) 100 });
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        byte[] byteArray4 = new byte[] { (byte) 88, (byte) 103, (byte) 50, (byte) 83 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 88, (byte) 103, (byte) 50, (byte) 83 });
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
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
        int int23 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "17) test5523(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 33188 + "'", int23 == 33188);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isFIFO();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        byte[] byteArray9 = new byte[] { (byte) 120, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray9, zipEncoding10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 120, (byte) 100 });
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        java.util.Date date21 = tarArchiveEntry20.getModTime();
        tarArchiveEntry2.setModTime(date21);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "18) test5525(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(date21);
// flaky "7) test5525(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:58 ICT 2026");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        long long7 = tarArchiveEntry3.getSize();
        java.io.File file8 = tarArchiveEntry3.getFile();
        tarArchiveEntry3.setMode(75);
        tarArchiveEntry3.setLinkName("tar\000");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(file8);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean9 = tarArchiveEntry2.isGNULongLinkEntry();
        java.io.File file10 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 103, false);
        int int4 = tarArchiveEntry3.getDevMinor();
        long long5 = tarArchiveEntry3.getLongGroupId();
        tarArchiveEntry3.setMode((int) (byte) 54);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
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
        int int25 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "19) test5529(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setSize((long) 1000);
        boolean boolean8 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray8 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setLinkName("ustar\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "20) test5531(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "8) test5531(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray8);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray8, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
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
        java.io.File file15 = tarArchiveEntry2.getFile();
        boolean boolean16 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setMode(0);
        boolean boolean11 = tarArchiveEntry2.isExtended();
        java.lang.String str12 = tarArchiveEntry2.getName();
        boolean boolean13 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean14 = tarArchiveEntry2.isFile();
        boolean boolean15 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ustar " + "'", str12, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        long long5 = tarArchiveEntry2.getSize();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "21) test5534(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isGNULongNameEntry();
        java.lang.String str8 = tarArchiveEntry3.getUserName();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 54, (byte) 75, (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray13, zipEncoding14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 54, (byte) 75, (byte) 76 });
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 83);
        boolean boolean3 = tarArchiveEntry2.isStarSparse();
        boolean boolean4 = tarArchiveEntry2.isGNUSparse();
        int int5 = tarArchiveEntry2.getMode();
        byte[] byteArray8 = new byte[] { (byte) 75, (byte) 48 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray8, zipEncoding9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33188 + "'", int5 == 33188);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 75, (byte) 48 });
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
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
        tarArchiveEntry2.setUserName("");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean19 = tarArchiveEntry18.isGlobalPaxHeader();
        boolean boolean20 = tarArchiveEntry18.isFile();
        java.util.Date date21 = tarArchiveEntry18.getModTime();
        java.util.Date date22 = tarArchiveEntry18.getModTime();
        int int23 = tarArchiveEntry18.getMode();
        tarArchiveEntry18.setNames("00", "");
        java.util.Date date27 = tarArchiveEntry18.getModTime();
        boolean boolean28 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry18);
        tarArchiveEntry2.setUserId((long) 10240);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "22) test5537(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(date21);
// flaky "9) test5537(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date22);
// flaky "4) test5537(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 33188 + "'", int23 == 33188);
        org.junit.Assert.assertNotNull(date27);
// flaky "3) test5537(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
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
        java.lang.String str24 = tarArchiveEntry10.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "23) test5538(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "10) test5538(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date20);
// flaky "5) test5538(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date21);
// flaky "4) test5538(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ustar " + "'", str24, "ustar ");
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
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
        boolean boolean44 = tarArchiveEntry35.isPaxHeader();
        boolean boolean45 = tarArchiveEntry35.isGNULongLinkEntry();
        long long46 = tarArchiveEntry35.getRealSize();
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
// flaky "24) test5540(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
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
        boolean boolean16 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "25) test5541(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "11) test5541(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        int int9 = tarArchiveEntry2.getGroupId();
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setGroupId(48L);
        org.junit.Assert.assertNotNull(date3);
// flaky "26) test5542(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky "12) test5542(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:58 ICT 2026");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setNames("00", "\000\000");
        java.util.Date date12 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Date date13 = tarArchiveEntry2.getLastModifiedDate();
        long long14 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "27) test5543(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "13) test5543(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "6) test5543(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date13);
// flaky "5) test5543(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setMode((-1));
        tarArchiveEntry2.setUserId((long) 504);
        boolean boolean17 = tarArchiveEntry2.isDirectory();
        long long18 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "28) test5544(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 55, false);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        int int5 = tarArchiveEntry3.getGroupId();
        java.lang.String str6 = tarArchiveEntry3.getLinkName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.util.Date date4 = tarArchiveEntry3.getModTime();
        boolean boolean5 = tarArchiveEntry3.isBlockDevice();
        java.lang.String str6 = tarArchiveEntry3.getLinkName();
        long long7 = tarArchiveEntry3.getLongGroupId();
        boolean boolean8 = tarArchiveEntry3.isSparse();
        tarArchiveEntry3.setNames("00", "././@LongLink");
        tarArchiveEntry3.setUserName(" \000");
        org.junit.Assert.assertNotNull(date4);
// flaky "29) test5546(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
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
        boolean boolean25 = tarArchiveEntry14.isFIFO();
        tarArchiveEntry14.setIds((int) (byte) 120, 8);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "30) test5547(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "14) test5547(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
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
        int int21 = tarArchiveEntry12.getUserId();
        boolean boolean22 = tarArchiveEntry12.isCheckSumOK();
        boolean boolean23 = tarArchiveEntry12.isGlobalPaxHeader();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
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
        boolean boolean22 = tarArchiveEntry2.isOldGNUSparse();
        int int23 = tarArchiveEntry2.getUserId();
        boolean boolean24 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertNotNull(date3);
// flaky "31) test5549(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(date11);
// flaky "15) test5549(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "7) test5549(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
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
        boolean boolean19 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "32) test5550(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        boolean boolean6 = tarArchiveEntry3.isGlobalPaxHeader();
        java.lang.String str7 = tarArchiveEntry3.getName();
        tarArchiveEntry3.setUserId((long) (byte) 49);
        java.util.Date date10 = tarArchiveEntry3.getModTime();
        boolean boolean11 = tarArchiveEntry3.isExtended();
        byte[] byteArray17 = new byte[] { (byte) 75, (byte) 49, (byte) 1, (byte) 51, (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray17, zipEncoding18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0\000" + "'", str7, "0\000");
        org.junit.Assert.assertNotNull(date10);
// flaky "33) test5551(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 75, (byte) 49, (byte) 1, (byte) 51, (byte) 54 });
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setGroupId((long) 1);
        long long7 = tarArchiveEntry3.getRealSize();
        java.util.Date date8 = tarArchiveEntry3.getLastModifiedDate();
        int int9 = tarArchiveEntry3.getDevMajor();
        tarArchiveEntry3.setGroupId(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date8);
// flaky "34) test5552(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
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
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky "35) test5553(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
        org.junit.Assert.assertNotNull(date22);
// flaky "16) test5553(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        long long3 = tarArchiveEntry2.getSize();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date8 = tarArchiveEntry7.getLastModifiedDate();
        boolean boolean9 = tarArchiveEntry7.isCharacterDevice();
        tarArchiveEntry7.setUserName("hi!");
        tarArchiveEntry7.setGroupName("");
        java.util.Date date14 = tarArchiveEntry7.getModTime();
        boolean boolean15 = tarArchiveEntry7.isGNULongLinkEntry();
        boolean boolean16 = tarArchiveEntry7.isPaxHeader();
        java.util.Date date17 = tarArchiveEntry7.getLastModifiedDate();
        boolean boolean18 = tarArchiveEntry7.isGNULongLinkEntry();
        java.lang.String str19 = tarArchiveEntry7.getLinkName();
        int int20 = tarArchiveEntry7.getDevMajor();
        tarArchiveEntry7.setUserName("\000\000");
        java.util.Date date23 = tarArchiveEntry7.getLastModifiedDate();
        boolean boolean24 = tarArchiveEntry2.isDescendent(tarArchiveEntry7);
        int int25 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(date4);
// flaky "36) test5554(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date8);
// flaky "17) test5554(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date14);
// flaky "8) test5554(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "6) test5554(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(date23);
// flaky "2) test5554(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
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
        tarArchiveEntry10.setNames("", "././@LongLink");
        java.lang.String str22 = tarArchiveEntry10.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ustar " + "'", str22, "ustar ");
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
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
        long long15 = tarArchiveEntry10.getRealSize();
        tarArchiveEntry10.setNames("ustar\000", "ustar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", true);
        boolean boolean22 = tarArchiveEntry21.isPaxGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry26 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str27 = tarArchiveEntry26.getLinkName();
        long long28 = tarArchiveEntry26.getRealSize();
        boolean boolean29 = tarArchiveEntry26.isStarSparse();
        tarArchiveEntry26.setIds((int) 'a', (int) (byte) 54);
        tarArchiveEntry26.setLinkName("tar\000");
        tarArchiveEntry26.setUserName("00");
        boolean boolean37 = tarArchiveEntry21.isDescendent(tarArchiveEntry26);
        boolean boolean38 = tarArchiveEntry10.isDescendent(tarArchiveEntry26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "37) test5556(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "18) test5556(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
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
        int int18 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertNotNull(date3);
// flaky "38) test5557(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "19) test5557(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
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
        long long13 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "39) test5558(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "20) test5558(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
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
        boolean boolean14 = tarArchiveEntry2.isExtended();
        java.lang.String str15 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
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
        long long29 = tarArchiveEntry16.getLongGroupId();
        tarArchiveEntry16.setUserId(32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "40) test5560(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        boolean boolean6 = tarArchiveEntry3.isGlobalPaxHeader();
        tarArchiveEntry3.setGroupName("././@LongLink");
        int int9 = tarArchiveEntry3.getMode();
        tarArchiveEntry3.setDevMajor(1);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 75, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray15, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 75, (byte) 1 });
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str10 = tarArchiveEntry9.getLinkName();
        java.util.Date date11 = tarArchiveEntry9.getLastModifiedDate();
        long long12 = tarArchiveEntry9.getLongGroupId();
        boolean boolean13 = tarArchiveEntry2.equals(tarArchiveEntry9);
        int int14 = tarArchiveEntry9.getDevMinor();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry9.fillGNUSparse0xData(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(date11);
// flaky "41) test5562(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (short) 1, 155);
        int int8 = tarArchiveEntry2.getMode();
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setNames("hi!", "././@LongLink");
        tarArchiveEntry2.setUserName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setDevMinor(257);
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setIds(100, 6);
        org.junit.Assert.assertNotNull(date3);
// flaky "42) test5564(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.util.Date date4 = tarArchiveEntry3.getModTime();
        boolean boolean5 = tarArchiveEntry3.isBlockDevice();
        java.lang.String str6 = tarArchiveEntry3.getLinkName();
        long long7 = tarArchiveEntry3.getLongGroupId();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse0xData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date4);
// flaky "43) test5565(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        boolean boolean10 = tarArchiveEntry2.isGNULongNameEntry();
        java.util.Date date11 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        java.util.Date date18 = tarArchiveEntry14.getModTime();
        tarArchiveEntry14.setUserId((long) '#');
        boolean boolean21 = tarArchiveEntry14.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray22 = tarArchiveEntry14.getDirectoryEntries();
        boolean boolean23 = tarArchiveEntry14.isSparse();
        boolean boolean24 = tarArchiveEntry14.isPaxGNUSparse();
        tarArchiveEntry14.setMode((int) (byte) 48);
        tarArchiveEntry14.setLinkName("hi!");
        tarArchiveEntry14.setModTime((long) 10);
        boolean boolean31 = tarArchiveEntry14.isGNULongNameEntry();
        boolean boolean32 = tarArchiveEntry2.equals(tarArchiveEntry14);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray33 = tarArchiveEntry14.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "44) test5566(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "21) test5566(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "9) test5566(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray22);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray22, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray33);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray33, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        boolean boolean10 = tarArchiveEntry2.isPaxGNUSparse();
        tarArchiveEntry2.setUserId((long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
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
        tarArchiveEntry2.setUserId((long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "45) test5568(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        java.io.File file6 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setDevMajor((int) 'a');
        org.junit.Assert.assertNotNull(date3);
// flaky "46) test5569(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
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
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setDevMinor((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minor device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        int int10 = tarArchiveEntry2.getDevMinor();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        boolean boolean12 = tarArchiveEntry2.isDirectory();
        java.util.Date date13 = tarArchiveEntry2.getLastModifiedDate();
        int int14 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "47) test5571(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
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
        int int19 = tarArchiveEntry10.getMode();
        long long20 = tarArchiveEntry10.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "48) test5572(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33188 + "'", int19 == 33188);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        long long5 = tarArchiveEntry3.getRealSize();
        tarArchiveEntry3.setDevMajor(33188);
        boolean boolean8 = tarArchiveEntry3.isFIFO();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setModTime((long) 1);
        int int11 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str16 = tarArchiveEntry15.getLinkName();
        tarArchiveEntry15.setNames("00", "hi!");
        boolean boolean20 = tarArchiveEntry15.isStarSparse();
        tarArchiveEntry15.setUserName("tar\000");
        java.util.Date date23 = tarArchiveEntry15.getModTime();
        tarArchiveEntry2.setModTime(date23);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date23);
// flaky "49) test5574(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:58 ICT 2026");
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        java.lang.String str3 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        tarArchiveEntry2.setMode((int) (short) 100);
        java.util.Date date9 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setNames("tar\000", "././@LongLink");
        boolean boolean13 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean17 = tarArchiveEntry16.isGlobalPaxHeader();
        boolean boolean18 = tarArchiveEntry16.isFile();
        java.util.Date date19 = tarArchiveEntry16.getModTime();
        java.util.Date date20 = tarArchiveEntry16.getModTime();
        tarArchiveEntry16.setUserId((long) '#');
        boolean boolean23 = tarArchiveEntry16.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray24 = tarArchiveEntry16.getDirectoryEntries();
        tarArchiveEntry16.setName("0\000");
        int int27 = tarArchiveEntry16.getMode();
        long long28 = tarArchiveEntry16.getLongGroupId();
        int int29 = tarArchiveEntry16.getDevMajor();
        boolean boolean30 = tarArchiveEntry16.isGNUSparse();
        boolean boolean31 = tarArchiveEntry2.equals((java.lang.Object) boolean30);
        org.junit.Assert.assertNotNull(date3);
// flaky "50) test5576(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "22) test5576(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(date19);
// flaky "10) test5576(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date20);
// flaky "7) test5576(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray24);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray24, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 33188 + "'", int27 == 33188);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ustar " + "'", str11, "ustar ");
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        boolean boolean7 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserId((int) '#');
        boolean boolean10 = tarArchiveEntry2.isDirectory();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        boolean boolean12 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertNotNull(date5);
// flaky "51) test5578(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(35L);
        tarArchiveEntry2.setDevMinor((int) (byte) 120);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap16);
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
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean10 = tarArchiveEntry2.isFile();
        java.io.File file11 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        byte[] byteArray6 = new byte[] { (byte) 88, (byte) 10, (byte) 75, (byte) 88, (byte) 76, (byte) 0 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 88, (byte) 10, (byte) 75, (byte) 88, (byte) 76, (byte) 0 });
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
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
        tarArchiveEntry2.setDevMinor((int) (byte) 54);
        boolean boolean16 = tarArchiveEntry2.isGNUSparse();
        boolean boolean17 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean18 = tarArchiveEntry2.isGNUSparse();
        boolean boolean19 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "52) test5582(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "23) test5582(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean8 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setMode(508);
        java.io.File file11 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertNotNull(date3);
// flaky "53) test5583(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        long long10 = tarArchiveEntry2.getLongUserId();
        boolean boolean11 = tarArchiveEntry2.isDirectory();
        boolean boolean12 = tarArchiveEntry2.isFile();
        boolean boolean13 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "54) test5584(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "24) test5584(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
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
        java.lang.String str20 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean25 = tarArchiveEntry24.isDirectory();
        boolean boolean26 = tarArchiveEntry24.isLink();
        boolean boolean27 = tarArchiveEntry24.isGlobalPaxHeader();
        java.lang.String str28 = tarArchiveEntry24.getName();
        boolean boolean29 = tarArchiveEntry2.isDescendent(tarArchiveEntry24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "55) test5585(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "25) test5585(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ustar " + "'", str20, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0\000" + "'", str28, "0\000");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isFIFO();
        boolean boolean12 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setName("ustar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 49);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long21 = tarArchiveEntry20.getSize();
        tarArchiveEntry20.setUserId((int) (byte) 10);
        long long24 = tarArchiveEntry20.getLongUserId();
        int int25 = tarArchiveEntry20.getMode();
        boolean boolean26 = tarArchiveEntry20.isExtended();
        boolean boolean27 = tarArchiveEntry20.isGNULongNameEntry();
        java.lang.String str28 = tarArchiveEntry20.getName();
        java.lang.String str29 = tarArchiveEntry20.getGroupName();
        tarArchiveEntry20.setModTime((long) 155);
        boolean boolean32 = tarArchiveEntry17.equals((java.lang.Object) 155);
        boolean boolean33 = tarArchiveEntry2.isDescendent(tarArchiveEntry17);
        boolean boolean34 = tarArchiveEntry17.isSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 33188 + "'", int25 == 33188);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ustar " + "'", str28, "ustar ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 76);
        int int3 = tarArchiveEntry2.getGroupId();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setNames("tar\000", "hi!");
        int int8 = tarArchiveEntry2.getDevMajor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long6 = tarArchiveEntry5.getSize();
        tarArchiveEntry5.setUserId((int) (byte) 10);
        boolean boolean9 = tarArchiveEntry5.isGlobalPaxHeader();
        tarArchiveEntry5.setGroupId((long) (byte) 10);
        boolean boolean12 = tarArchiveEntry5.isBlockDevice();
        boolean boolean13 = tarArchiveEntry5.isFIFO();
        tarArchiveEntry5.setGroupId((int) (byte) 100);
        boolean boolean16 = tarArchiveEntry1.equals(tarArchiveEntry5);
        boolean boolean17 = tarArchiveEntry5.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean21 = tarArchiveEntry20.isGlobalPaxHeader();
        boolean boolean22 = tarArchiveEntry20.isFile();
        java.util.Date date23 = tarArchiveEntry20.getModTime();
        java.util.Date date24 = tarArchiveEntry20.getModTime();
        tarArchiveEntry20.setDevMinor(0);
        java.lang.String str27 = tarArchiveEntry20.getName();
        boolean boolean28 = tarArchiveEntry20.isSymbolicLink();
        boolean boolean29 = tarArchiveEntry5.isDescendent(tarArchiveEntry20);
        org.junit.Assert.assertNotNull(date2);
// flaky "56) test5588(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date23);
// flaky "26) test5588(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date24);
// flaky "11) test5588(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ustar " + "'", str27, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str4 = tarArchiveEntry2.getUserName();
        boolean boolean5 = tarArchiveEntry2.isSparse();
        java.lang.Object obj6 = null;
        boolean boolean7 = tarArchiveEntry2.equals(obj6);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean11 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry10.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", true);
        boolean boolean16 = tarArchiveEntry10.equals(tarArchiveEntry15);
        java.util.Date date17 = tarArchiveEntry15.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "57) test5589(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:58 ICT 2026");
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
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
        boolean boolean15 = tarArchiveEntry2.isGNULongLinkEntry();
        java.lang.String str16 = tarArchiveEntry2.getUserName();
        boolean boolean17 = tarArchiveEntry2.isStarSparse();
        boolean boolean18 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
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
        java.io.File file13 = tarArchiveEntry2.getFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean17 = tarArchiveEntry16.isGlobalPaxHeader();
        boolean boolean18 = tarArchiveEntry16.isFile();
        java.util.Date date19 = tarArchiveEntry16.getModTime();
        java.util.Date date20 = tarArchiveEntry16.getModTime();
        tarArchiveEntry16.setUserId((long) '#');
        boolean boolean23 = tarArchiveEntry16.isGNULongNameEntry();
        tarArchiveEntry16.setSize((long) 1);
        tarArchiveEntry16.setMode((int) (byte) 51);
        tarArchiveEntry16.setNames("", "");
        boolean boolean31 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "58) test5591(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "27) test5591(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(date19);
// flaky "12) test5591(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date20);
// flaky "8) test5591(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 10, true);
        tarArchiveEntry3.setDevMajor(257);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
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
        boolean boolean13 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
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
        tarArchiveEntry14.setDevMajor((int) '4');
        boolean boolean26 = tarArchiveEntry14.isStarSparse();
        boolean boolean27 = tarArchiveEntry14.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "59) test5594(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "28) test5594(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
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
        boolean boolean22 = tarArchiveEntry2.isPaxHeader();
        int int23 = tarArchiveEntry2.getDevMajor();
        java.lang.String str24 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertNotNull(date3);
// flaky "60) test5595(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "29) test5595(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        tarArchiveEntry2.setGroupName("ustar ");
        tarArchiveEntry2.setDevMinor((int) '#');
        boolean boolean13 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "61) test5596(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "30) test5596(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
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
        tarArchiveEntry6.setGroupName("");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
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
        boolean boolean20 = tarArchiveEntry3.isPaxGNUSparse();
        tarArchiveEntry3.setModTime((long) 3);
        tarArchiveEntry3.setDevMinor((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray19);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray19, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setMode((-1));
        tarArchiveEntry2.setGroupId(3);
        boolean boolean17 = tarArchiveEntry2.isLink();
        boolean boolean18 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "62) test5599(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
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
        java.util.Date date24 = tarArchiveEntry13.getModTime();
        java.io.File file25 = tarArchiveEntry13.getFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "63) test5600(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "31) test5600(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
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
        org.junit.Assert.assertNotNull(date24);
// flaky "13) test5600(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNull(file25);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isFile();
        long long5 = tarArchiveEntry3.getLongUserId();
        tarArchiveEntry3.setModTime((long) 2);
        boolean boolean8 = tarArchiveEntry3.isCheckSumOK();
        tarArchiveEntry3.setNames("ustar ", "ustar\000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setName("././@LongLink");
        tarArchiveEntry3.setLinkName("\000\000");
        tarArchiveEntry3.setName("ustar\000");
        boolean boolean11 = tarArchiveEntry3.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
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
        int int25 = tarArchiveEntry12.getMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "64) test5603(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "32) test5603(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 33188 + "'", int25 == 33188);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
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
        boolean boolean16 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "65) test5604(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "33) test5604(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
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
        tarArchiveEntry2.setGroupId((long) 32);
        tarArchiveEntry2.setGroupName("0\000");
        boolean boolean20 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
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
        long long15 = tarArchiveEntry2.getLongUserId();
        java.lang.String str16 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        byte[] byteArray11 = new byte[] { (byte) 120, (byte) 54, (byte) 75, (byte) 53, (byte) 49 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "66) test5607(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 120, (byte) 54, (byte) 75, (byte) 53, (byte) 49 });
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getUserName();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean13 = tarArchiveEntry2.isGNULongNameEntry();
        int int14 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
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
        tarArchiveEntry2.setIds((int) (byte) 1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date25 = tarArchiveEntry24.getLastModifiedDate();
        boolean boolean26 = tarArchiveEntry24.isCharacterDevice();
        long long27 = tarArchiveEntry24.getRealSize();
        tarArchiveEntry24.setLinkName("0\000");
        tarArchiveEntry24.setUserName("tar\000");
        boolean boolean32 = tarArchiveEntry24.isLink();
        boolean boolean33 = tarArchiveEntry2.equals(tarArchiveEntry24);
        boolean boolean34 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertNotNull(date3);
// flaky "67) test5609(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "34) test5609(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "14) test5609(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(date25);
// flaky "9) test5609(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
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
        boolean boolean20 = tarArchiveEntry2.isExtended();
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
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        int int10 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "68) test5611(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "35) test5611(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
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
        byte[] byteArray30 = new byte[] { (byte) 76, (byte) 54, (byte) 51, (byte) 76, (byte) 50 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry12.writeEntryHeader(byteArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "69) test5612(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "36) test5612(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 76, (byte) 54, (byte) 51, (byte) 76, (byte) 50 });
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
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
        boolean boolean21 = tarArchiveEntry11.isPaxHeader();
        tarArchiveEntry11.setLinkName("");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "70) test5613(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setName("././@LongLink");
        tarArchiveEntry3.setDevMajor(100);
        tarArchiveEntry3.setNames("00", "tar\000");
        java.lang.String str12 = tarArchiveEntry3.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tar\000" + "'", str12, "tar\000");
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setNames("00", "\000\000");
        boolean boolean12 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "71) test5615(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "37) test5615(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry28 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean29 = tarArchiveEntry28.isGlobalPaxHeader();
        boolean boolean30 = tarArchiveEntry28.isFile();
        tarArchiveEntry28.setIds((int) (short) 1, 155);
        int int34 = tarArchiveEntry28.getGroupId();
        tarArchiveEntry28.setName("ustar ");
        long long37 = tarArchiveEntry28.getRealSize();
        tarArchiveEntry28.setModTime(8589934591L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray40 = tarArchiveEntry28.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry43 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long44 = tarArchiveEntry43.getSize();
        tarArchiveEntry43.setUserId((int) (byte) 10);
        boolean boolean47 = tarArchiveEntry43.isGlobalPaxHeader();
        tarArchiveEntry43.setGroupId((long) (byte) 10);
        boolean boolean50 = tarArchiveEntry43.isBlockDevice();
        tarArchiveEntry43.setUserId(100L);
        boolean boolean53 = tarArchiveEntry43.isSymbolicLink();
        boolean boolean54 = tarArchiveEntry43.isOldGNUSparse();
        boolean boolean55 = tarArchiveEntry43.isFIFO();
        boolean boolean56 = tarArchiveEntry43.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry59 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry59.setMode((int) '#');
        tarArchiveEntry59.setModTime((long) 155);
        tarArchiveEntry59.setGroupId(3);
        boolean boolean66 = tarArchiveEntry43.equals(tarArchiveEntry59);
        boolean boolean67 = tarArchiveEntry43.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry70 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long71 = tarArchiveEntry70.getSize();
        tarArchiveEntry70.setUserId((int) (byte) 10);
        boolean boolean74 = tarArchiveEntry70.isGlobalPaxHeader();
        tarArchiveEntry70.setGroupId((long) (byte) 10);
        boolean boolean77 = tarArchiveEntry70.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray78 = tarArchiveEntry70.getDirectoryEntries();
        java.lang.String str79 = tarArchiveEntry70.getUserName();
        boolean boolean80 = tarArchiveEntry70.isCharacterDevice();
        java.util.Date date81 = tarArchiveEntry70.getLastModifiedDate();
        tarArchiveEntry43.setModTime(date81);
        tarArchiveEntry28.setModTime(date81);
        tarArchiveEntry12.setModTime(date81);
        boolean boolean85 = tarArchiveEntry12.isPaxGNUSparse();
        int int86 = tarArchiveEntry12.getDevMinor();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 155 + "'", int34 == 155);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray40);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray40, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray78);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray78, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(date81);
// flaky "72) test5616(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date81.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        long long10 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setGroupId((int) (short) -1);
        boolean boolean13 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        tarArchiveEntry2.setGroupName("ustar ");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        long long5 = tarArchiveEntry3.getRealSize();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setIds((int) 'a', (int) (byte) 54);
        tarArchiveEntry3.setLinkName("tar\000");
        tarArchiveEntry3.setUserName("00");
        int int14 = tarArchiveEntry3.getMode();
        boolean boolean15 = tarArchiveEntry3.isSparse();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33188 + "'", int14 == 33188);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean7 = tarArchiveEntry2.equals(tarArchiveEntry6);
        tarArchiveEntry6.setName("");
        boolean boolean10 = tarArchiveEntry6.isPaxGNUSparse();
        tarArchiveEntry6.setModTime((long) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = tarArchiveEntry6.equals(obj13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean23 = tarArchiveEntry22.isGlobalPaxHeader();
        boolean boolean24 = tarArchiveEntry22.isFile();
        boolean boolean25 = tarArchiveEntry22.isPaxGNUSparse();
        boolean boolean26 = tarArchiveEntry22.isFile();
        boolean boolean27 = tarArchiveEntry22.isFile();
        java.util.Date date28 = tarArchiveEntry22.getLastModifiedDate();
        tarArchiveEntry22.setMode(8);
        java.lang.String str31 = tarArchiveEntry22.getGroupName();
        tarArchiveEntry22.setDevMajor(0);
        long long34 = tarArchiveEntry22.getLongGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray35 = tarArchiveEntry22.getDirectoryEntries();
        boolean boolean36 = tarArchiveEntry11.isDescendent(tarArchiveEntry22);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "73) test5621(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date28);
// flaky "38) test5621(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date28.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray35);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray35, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
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
        boolean boolean16 = tarArchiveEntry7.isPaxGNUSparse();
        boolean boolean17 = tarArchiveEntry7.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean21 = tarArchiveEntry20.isGlobalPaxHeader();
        boolean boolean22 = tarArchiveEntry20.isFile();
        boolean boolean23 = tarArchiveEntry20.isPaxGNUSparse();
        boolean boolean24 = tarArchiveEntry20.isFile();
        boolean boolean25 = tarArchiveEntry20.isFIFO();
        boolean boolean26 = tarArchiveEntry20.isPaxGNUSparse();
        boolean boolean27 = tarArchiveEntry20.isLink();
        boolean boolean28 = tarArchiveEntry20.isExtended();
        tarArchiveEntry20.setGroupId(8);
        boolean boolean31 = tarArchiveEntry7.isDescendent(tarArchiveEntry20);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "74) test5622(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "39) test5622(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "75) test5623(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        byte[] byteArray4 = new byte[] { (byte) 103, (byte) 75, (byte) 48, (byte) 48 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 103, (byte) 75, (byte) 48, (byte) 48 });
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
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
        boolean boolean22 = tarArchiveEntry2.isGNULongNameEntry();
        java.lang.String str23 = tarArchiveEntry2.getGroupName();
        boolean boolean24 = tarArchiveEntry2.isDirectory();
        boolean boolean25 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "76) test5625(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "40) test5625(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 52, true);
        java.lang.String str4 = tarArchiveEntry3.getGroupName();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse0xData(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setDevMinor(148);
        java.lang.String str7 = tarArchiveEntry2.getLinkName();
        byte[] byteArray11 = new byte[] { (byte) 75, (byte) 53, (byte) 51 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray11, zipEncoding12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "77) test5627(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 75, (byte) 53, (byte) 51 });
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        boolean boolean3 = tarArchiveEntry1.isFIFO();
        boolean boolean4 = tarArchiveEntry1.isStarSparse();
        long long5 = tarArchiveEntry1.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 50, true);
        boolean boolean10 = tarArchiveEntry1.equals(tarArchiveEntry9);
        boolean boolean11 = tarArchiveEntry1.isFile();
        java.util.Date date12 = tarArchiveEntry1.getLastModifiedDate();
        tarArchiveEntry1.setModTime(32L);
        int int15 = tarArchiveEntry1.getMode();
        org.junit.Assert.assertNotNull(date2);
// flaky "78) test5628(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(date12);
// flaky "41) test5628(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
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
        tarArchiveEntry10.setDevMinor(12);
        long long16 = tarArchiveEntry10.getLongUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "79) test5629(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "42) test5629(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:58 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        java.io.File file11 = tarArchiveEntry2.getFile();
        boolean boolean12 = tarArchiveEntry2.isFile();
        boolean boolean13 = tarArchiveEntry2.isLink();
        int int14 = tarArchiveEntry2.getDevMajor();
        tarArchiveEntry2.setMode(12);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
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
        boolean boolean16 = tarArchiveEntry2.isCharacterDevice();
        int int17 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setMode(1);
        org.junit.Assert.assertNotNull(date3);
// flaky "80) test5631(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:58 ICT 2026");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
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
        java.lang.String str16 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isPaxHeader();
        boolean boolean6 = tarArchiveEntry3.isCheckSumOK();
        boolean boolean7 = tarArchiveEntry3.isExtended();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setDevMinor(257);
        tarArchiveEntry2.setName("tar\000");
        tarArchiveEntry2.setName("././@LongLink");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", (byte) 51);
        boolean boolean17 = tarArchiveEntry2.equals(tarArchiveEntry16);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray18 = tarArchiveEntry16.getDirectoryEntries();
        boolean boolean19 = tarArchiveEntry16.isFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray18);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray18, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 50, true);
        long long4 = tarArchiveEntry3.getRealSize();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
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
        tarArchiveEntry7.setUserName("\000\000");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "81) test5636(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "43) test5636(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray16);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray16, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setModTime((long) 3);
        tarArchiveEntry2.setDevMinor((int) (byte) 53);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date18 = tarArchiveEntry17.getLastModifiedDate();
        boolean boolean19 = tarArchiveEntry17.isCharacterDevice();
        tarArchiveEntry17.setUserName("hi!");
        boolean boolean22 = tarArchiveEntry17.isStarSparse();
        boolean boolean23 = tarArchiveEntry17.isSymbolicLink();
        boolean boolean24 = tarArchiveEntry17.isLink();
        java.io.File file25 = tarArchiveEntry17.getFile();
        java.util.Date date26 = tarArchiveEntry17.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date30 = tarArchiveEntry29.getLastModifiedDate();
        tarArchiveEntry17.setModTime(date30);
        tarArchiveEntry17.setGroupId((long) (byte) 1);
        int int34 = tarArchiveEntry17.getGroupId();
        boolean boolean35 = tarArchiveEntry2.equals(tarArchiveEntry17);
        long long36 = tarArchiveEntry17.getRealSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "82) test5637(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(date26);
// flaky "44) test5637(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertNotNull(date30);
// flaky "15) test5637(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 120);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setGroupName("\000\000");
        long long12 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 55);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
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
        boolean boolean19 = tarArchiveEntry2.isLink();
        tarArchiveEntry2.setIds(3, (int) (byte) 55);
        org.junit.Assert.assertNotNull(date3);
// flaky "83) test5641(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "45) test5641(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "16) test5641(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray15 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date19 = tarArchiveEntry18.getLastModifiedDate();
        boolean boolean20 = tarArchiveEntry18.isCharacterDevice();
        tarArchiveEntry18.setUserName("hi!");
        boolean boolean23 = tarArchiveEntry18.isStarSparse();
        boolean boolean24 = tarArchiveEntry18.isSymbolicLink();
        boolean boolean25 = tarArchiveEntry18.isLink();
        int int26 = tarArchiveEntry18.getGroupId();
        java.lang.String str27 = tarArchiveEntry18.getGroupName();
        tarArchiveEntry18.setNames("hi!", "00");
        boolean boolean31 = tarArchiveEntry18.isDirectory();
        boolean boolean32 = tarArchiveEntry2.equals(tarArchiveEntry18);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray14);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray14, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(tarArchiveEntryArray15);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray15, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date19);
// flaky "84) test5642(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
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
        int int18 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long12 = tarArchiveEntry11.getSize();
        tarArchiveEntry11.setUserId((int) (byte) 10);
        boolean boolean15 = tarArchiveEntry11.isGlobalPaxHeader();
        tarArchiveEntry11.setGroupId((long) (byte) 10);
        long long18 = tarArchiveEntry11.getLongUserId();
        boolean boolean19 = tarArchiveEntry11.isGNUSparse();
        int int20 = tarArchiveEntry11.getDevMinor();
        int int21 = tarArchiveEntry11.getGroupId();
        boolean boolean22 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry11);
        boolean boolean23 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
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
        boolean boolean20 = tarArchiveEntry3.isDirectory();
        tarArchiveEntry3.setGroupName("././@LongLink");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray19);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray19, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
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
        boolean boolean35 = tarArchiveEntry11.isLink();
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
// flaky "85) test5646(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 49, true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean7 = tarArchiveEntry6.isGlobalPaxHeader();
        boolean boolean8 = tarArchiveEntry6.isPaxGNUSparse();
        boolean boolean9 = tarArchiveEntry3.equals((java.lang.Object) tarArchiveEntry6);
        tarArchiveEntry3.setGroupId((long) (short) 0);
        tarArchiveEntry3.setGroupName("0\000");
        tarArchiveEntry3.setSize((long) (byte) 83);
        java.lang.String str16 = tarArchiveEntry3.getName();
        long long17 = tarArchiveEntry3.getSize();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tar\000" + "'", str16, "tar\000");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 83L + "'", long17 == 83L);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 54, true);
        long long4 = tarArchiveEntry3.getLongUserId();
        java.util.Date date5 = tarArchiveEntry3.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(date5);
// flaky "86) test5648(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:59 ICT 2026");
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(257);
        boolean boolean11 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean12 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setUserId((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 53, (byte) 120, (byte) 75, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) -1, (byte) 53, (byte) 120, (byte) 75, (byte) 50 });
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
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
        int int24 = tarArchiveEntry14.getUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean28 = tarArchiveEntry27.isGlobalPaxHeader();
        boolean boolean29 = tarArchiveEntry27.isFile();
        java.util.Date date30 = tarArchiveEntry27.getModTime();
        java.util.Date date31 = tarArchiveEntry27.getModTime();
        tarArchiveEntry27.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean36 = tarArchiveEntry27.isDescendent(tarArchiveEntry35);
        tarArchiveEntry35.setUserId((int) '#');
        boolean boolean39 = tarArchiveEntry35.isExtended();
        tarArchiveEntry35.setGroupId((int) (byte) 53);
        long long42 = tarArchiveEntry35.getSize();
        java.lang.String str43 = tarArchiveEntry35.getName();
        java.util.Date date44 = tarArchiveEntry35.getModTime();
        tarArchiveEntry14.setModTime(date44);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry48 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long49 = tarArchiveEntry48.getSize();
        tarArchiveEntry48.setUserId((int) (byte) 10);
        boolean boolean52 = tarArchiveEntry48.isBlockDevice();
        tarArchiveEntry48.setLinkName("ustar\000");
        boolean boolean55 = tarArchiveEntry48.isPaxHeader();
        int int56 = tarArchiveEntry48.getGroupId();
        boolean boolean57 = tarArchiveEntry14.equals((java.lang.Object) tarArchiveEntry48);
        boolean boolean58 = tarArchiveEntry48.isCharacterDevice();
        tarArchiveEntry48.setIds(16877, 0);
        boolean boolean62 = tarArchiveEntry48.isOldGNUSparse();
        tarArchiveEntry48.setNames("00", "ustar\000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "87) test5651(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "46) test5651(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date30);
// flaky "17) test5651(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertNotNull(date31);
// flaky "10) test5651(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ustar " + "'", str43, "ustar ");
        org.junit.Assert.assertNotNull(date44);
// flaky "3) test5651(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date44.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", true);
        long long3 = tarArchiveEntry2.getRealSize();
        boolean boolean4 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
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
        int int19 = tarArchiveEntry2.getMode();
        boolean boolean20 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setModTime((long) 12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "88) test5653(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33188 + "'", int19 == 33188);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
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
        boolean boolean30 = tarArchiveEntry2.isBlockDevice();
        boolean boolean31 = tarArchiveEntry2.isGNUSparse();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
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
        long long21 = tarArchiveEntry2.getLongUserId();
        boolean boolean22 = tarArchiveEntry2.isFIFO();
        boolean boolean23 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray13);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray13, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(date17);
// flaky "89) test5655(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setUserId((long) (-1));
        boolean boolean14 = tarArchiveEntry2.isSparse();
        boolean boolean15 = tarArchiveEntry2.isFile();
        boolean boolean16 = tarArchiveEntry2.isFile();
        int int17 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33188 + "'", int17 == 33188);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (short) 1, 155);
        int int8 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setName("ustar ");
        long long11 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setGroupId(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean17 = tarArchiveEntry16.isGlobalPaxHeader();
        boolean boolean18 = tarArchiveEntry16.isFile();
        java.util.Date date19 = tarArchiveEntry16.getModTime();
        java.util.Date date20 = tarArchiveEntry16.getModTime();
        tarArchiveEntry16.setUserId((long) '#');
        boolean boolean23 = tarArchiveEntry16.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray24 = tarArchiveEntry16.getDirectoryEntries();
        boolean boolean25 = tarArchiveEntry16.isSparse();
        boolean boolean26 = tarArchiveEntry16.isPaxGNUSparse();
        tarArchiveEntry16.setMode((int) (byte) 48);
        long long29 = tarArchiveEntry16.getSize();
        tarArchiveEntry16.setUserId((long) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry34 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean35 = tarArchiveEntry34.isGlobalPaxHeader();
        boolean boolean36 = tarArchiveEntry34.isFile();
        java.util.Date date37 = tarArchiveEntry34.getModTime();
        java.util.Date date38 = tarArchiveEntry34.getModTime();
        int int39 = tarArchiveEntry34.getMode();
        tarArchiveEntry34.setNames("00", "");
        tarArchiveEntry34.setGroupId(0);
        tarArchiveEntry34.setGroupId(2);
        boolean boolean47 = tarArchiveEntry16.equals(tarArchiveEntry34);
        java.util.Date date48 = tarArchiveEntry34.getModTime();
        tarArchiveEntry2.setModTime(date48);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 155 + "'", int8 == 155);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(date19);
// flaky "90) test5657(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertNotNull(date20);
// flaky "47) test5657(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray24);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray24, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(date37);
// flaky "18) test5657(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date37.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertNotNull(date38);
// flaky "11) test5657(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date38.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 33188 + "'", int39 == 33188);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(date48);
// flaky "4) test5657(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date48.toString(), "Mon Sep 28 13:40:59 ICT 2026");
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", (byte) 48, true);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isLink();
        boolean boolean9 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean10 = tarArchiveEntry2.isExtended();
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
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 83);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry6.setGroupId((-1));
        boolean boolean9 = tarArchiveEntry2.equals((java.lang.Object) (-1));
        boolean boolean10 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setSize((long) 16877);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date16 = tarArchiveEntry15.getLastModifiedDate();
        boolean boolean17 = tarArchiveEntry15.isCharacterDevice();
        tarArchiveEntry15.setUserName("hi!");
        boolean boolean20 = tarArchiveEntry15.isStarSparse();
        boolean boolean21 = tarArchiveEntry15.isSymbolicLink();
        boolean boolean22 = tarArchiveEntry15.isLink();
        java.io.File file23 = tarArchiveEntry15.getFile();
        java.util.Date date24 = tarArchiveEntry15.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date28 = tarArchiveEntry27.getLastModifiedDate();
        tarArchiveEntry15.setModTime(date28);
        tarArchiveEntry15.setGroupId((long) (byte) 1);
        tarArchiveEntry15.setUserId((long) (byte) 52);
        boolean boolean34 = tarArchiveEntry15.isStarSparse();
        boolean boolean35 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date16);
// flaky "91) test5660(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNotNull(date24);
// flaky "48) test5660(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertNotNull(date28);
// flaky "19) test5660(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date28.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isGNULongNameEntry();
        int int8 = tarArchiveEntry3.getDevMajor();
        boolean boolean9 = tarArchiveEntry3.isLink();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 55);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
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
        tarArchiveEntry2.setUserId((int) (byte) 55);
        boolean boolean16 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date20 = tarArchiveEntry19.getLastModifiedDate();
        boolean boolean21 = tarArchiveEntry19.isCharacterDevice();
        tarArchiveEntry19.setUserName("hi!");
        tarArchiveEntry19.setGroupName("");
        java.util.Date date26 = tarArchiveEntry19.getModTime();
        boolean boolean27 = tarArchiveEntry19.isGNULongLinkEntry();
        boolean boolean28 = tarArchiveEntry19.isPaxHeader();
        java.util.Date date29 = tarArchiveEntry19.getLastModifiedDate();
        tarArchiveEntry19.setNames("", "././@LongLink");
        boolean boolean33 = tarArchiveEntry19.isExtended();
        boolean boolean34 = tarArchiveEntry19.isGNULongNameEntry();
        tarArchiveEntry19.setName("ustar ");
        java.util.Date date37 = tarArchiveEntry19.getModTime();
        tarArchiveEntry2.setModTime(date37);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "92) test5663(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky "49) test5663(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date26);
// flaky "20) test5663(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(date29);
// flaky "12) test5663(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date29.toString(), "Mon Sep 28 13:40:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date37);
// flaky "5) test5663(org.apache.commons.compress.archivers.tar.RegressionTest11)":         org.junit.Assert.assertEquals(date37.toString(), "Mon Sep 28 13:40:59 ICT 2026");
    }
}
