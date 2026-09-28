package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        boolean boolean3 = tarArchiveEntry1.isFIFO();
        boolean boolean4 = tarArchiveEntry1.isStarSparse();
        long long5 = tarArchiveEntry1.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 50, true);
        boolean boolean10 = tarArchiveEntry1.equals(tarArchiveEntry9);
        java.io.File file11 = tarArchiveEntry9.getFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry14.setUserName("");
        java.util.Date date17 = tarArchiveEntry14.getLastModifiedDate();
        boolean boolean18 = tarArchiveEntry14.isGNUSparse();
        boolean boolean19 = tarArchiveEntry9.equals(tarArchiveEntry14);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", true);
        boolean boolean23 = tarArchiveEntry22.isPaxGNUSparse();
        long long24 = tarArchiveEntry22.getSize();
        java.util.Date date25 = tarArchiveEntry22.getLastModifiedDate();
        tarArchiveEntry14.setModTime(date25);
        tarArchiveEntry14.setGroupId(508);
        org.junit.Assert.assertNotNull(date2);
// flaky "1) test3501(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(date17);
// flaky "1) test3501(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(date25);
// flaky "1) test3501(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        boolean boolean10 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        tarArchiveEntry2.setIds(131, (int) (byte) 120);
        byte[] byteArray21 = new byte[] { (byte) 48, (byte) 49, (byte) 53, (byte) 1, (byte) 1, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "2) test3503(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "2) test3503(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 48, (byte) 49, (byte) 53, (byte) 1, (byte) 1, (byte) 54 });
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        long long10 = tarArchiveEntry2.getSize();
        int int11 = tarArchiveEntry2.getUserId();
        java.lang.String str12 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId((int) (byte) 48);
        tarArchiveEntry2.setUserId((long) (byte) 54);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setName("ustar\000");
        tarArchiveEntry3.setGroupId(96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        boolean boolean24 = tarArchiveEntry13.isFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "3) test3507(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "3) test3507(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        byte[] byteArray16 = new byte[] { (byte) 55, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ustar " + "'", str13, "ustar ");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 55, (byte) -1 });
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        java.io.File file6 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setUserId((int) (byte) 53);
        java.util.Date date9 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertNotNull(date3);
// flaky "4) test3509(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(date9);
// flaky "4) test3509(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        boolean boolean30 = tarArchiveEntry2.isGNULongNameEntry();
        java.util.Date date31 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setMode(12);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date31);
// flaky "5) test3510(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        byte[] byteArray4 = new byte[] { (byte) 55, (byte) 55, (byte) 100, (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 55, (byte) 55, (byte) 100, (byte) 54 });
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        tarArchiveEntry2.setGroupName("ustar ");
        boolean boolean11 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean12 = tarArchiveEntry2.isGNULongLinkEntry();
        java.lang.String str13 = tarArchiveEntry2.getName();
        boolean boolean14 = tarArchiveEntry2.isGNULongNameEntry();
        int int15 = tarArchiveEntry2.getGroupId();
        boolean boolean16 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "6) test3512(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "5) test3512(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ustar " + "'", str13, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int23 = tarArchiveEntry22.getGroupId();
        tarArchiveEntry22.setGroupId((long) 1);
        long long26 = tarArchiveEntry22.getRealSize();
        long long27 = tarArchiveEntry22.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry30 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry30.setMode((int) '#');
        java.util.Date date33 = tarArchiveEntry30.getModTime();
        int int34 = tarArchiveEntry30.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry37 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long38 = tarArchiveEntry37.getSize();
        tarArchiveEntry37.setUserId((int) (byte) 10);
        long long41 = tarArchiveEntry37.getLongUserId();
        int int42 = tarArchiveEntry37.getMode();
        java.util.Date date43 = tarArchiveEntry37.getLastModifiedDate();
        tarArchiveEntry30.setModTime(date43);
        tarArchiveEntry22.setModTime(date43);
        tarArchiveEntry2.setModTime(date43);
        int int47 = tarArchiveEntry2.getGroupId();
        boolean boolean48 = tarArchiveEntry2.isOldGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "7) test3513(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(date33);
// flaky "6) test3513(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date33.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 33188 + "'", int42 == 33188);
        org.junit.Assert.assertNotNull(date43);
// flaky "2) test3513(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date43.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongGroupId();
        int int9 = tarArchiveEntry2.getMode();
        int int10 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setUserId((long) (byte) 53);
        long long13 = tarArchiveEntry2.getSize();
        java.lang.String str14 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00" + "'", str14, "00");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        tarArchiveEntry2.setUserId((int) (byte) -1);
        boolean boolean25 = tarArchiveEntry2.isOldGNUSparse();
        int int26 = tarArchiveEntry2.getDevMajor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "8) test3515(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "7) test3515(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFIFO();
        long long7 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setUserName("0\000");
        boolean boolean10 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        long long16 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setModTime((long) 508);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 49L + "'", long16 == 49L);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean8 = tarArchiveEntry2.isGNUSparse();
        byte[] byteArray9 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray9, zipEncoding10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        boolean boolean12 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserName("hi!");
        java.lang.String str15 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "9) test3519(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ustar " + "'", str15, "ustar ");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        int int9 = tarArchiveEntry2.getUserId();
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        long long11 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setUserName("ustar ");
        boolean boolean14 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setGroupName("ustar ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertNotNull(date5);
// flaky "10) test3521(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isFile();
        tarArchiveEntry3.setNames("00", "0\000");
        boolean boolean8 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry3.isCheckSumOK();
        tarArchiveEntry3.setMode(12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setDevMinor(6);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        java.lang.String str23 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setNames("0\000", "ustar\000");
        org.junit.Assert.assertNotNull(date3);
// flaky "11) test3524(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        java.util.Date date13 = tarArchiveEntry2.getLastModifiedDate();
        java.lang.String str14 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "12) test3525(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "8) test3525(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "3) test3525(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 75, true);
        int int4 = tarArchiveEntry3.getDevMajor();
        tarArchiveEntry3.setIds((int) (byte) 1, 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 83);
        tarArchiveEntry2.setDevMajor((int) (byte) 120);
        byte[] byteArray6 = new byte[] { (byte) 76 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 76 });
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        int int6 = tarArchiveEntry2.getDevMinor();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray8 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setGroupId((long) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray11 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray8);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray8, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(tarArchiveEntryArray11);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray11, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        tarArchiveEntry2.setGroupName("");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "13) test3529(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isExtended();
        boolean boolean8 = tarArchiveEntry2.isFile();
        byte[] byteArray10 = new byte[] { (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray10, zipEncoding11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "14) test3530(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 54 });
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        long long7 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setModTime((long) 53);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isDirectory();
        java.util.Date date11 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertNotNull(date3);
// flaky "15) test3532(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "9) test3532(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "4) test3532(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setModTime((long) (short) 100);
        int int12 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "16) test3533(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        boolean boolean16 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setNames("ustar ", "0\000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        tarArchiveEntry2.setGroupName("ustar ");
        boolean boolean11 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean12 = tarArchiveEntry2.isGNULongLinkEntry();
        java.lang.String str13 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setMode((int) (byte) 50);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "17) test3535(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "10) test3535(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ustar " + "'", str13, "ustar ");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        int int7 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setUserName("");
        boolean boolean10 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        boolean boolean24 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long28 = tarArchiveEntry27.getSize();
        tarArchiveEntry27.setUserId((int) (byte) 10);
        boolean boolean31 = tarArchiveEntry27.isGlobalPaxHeader();
        tarArchiveEntry27.setGroupId((long) (byte) 10);
        boolean boolean34 = tarArchiveEntry27.isBlockDevice();
        tarArchiveEntry27.setUserId(100L);
        boolean boolean37 = tarArchiveEntry27.isFIFO();
        tarArchiveEntry27.setName("00");
        boolean boolean40 = tarArchiveEntry27.isGNULongNameEntry();
        boolean boolean41 = tarArchiveEntry2.isDescendent(tarArchiveEntry27);
        boolean boolean42 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean43 = tarArchiveEntry2.isExtended();
        long long44 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "18) test3537(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "11) test3537(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "5) test3537(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 504L + "'", long44 == 504L);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        boolean boolean12 = tarArchiveEntry9.isDirectory();
        tarArchiveEntry9.setSize((long) 504);
        boolean boolean15 = tarArchiveEntry9.isSparse();
        boolean boolean16 = tarArchiveEntry9.isPaxHeader();
        boolean boolean17 = tarArchiveEntry2.isDescendent(tarArchiveEntry9);
        boolean boolean18 = tarArchiveEntry9.isSparse();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) 504);
        tarArchiveEntry2.setNames("ustar ", "");
        boolean boolean12 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date19 = tarArchiveEntry18.getLastModifiedDate();
        tarArchiveEntry18.setDevMajor((int) (byte) 0);
        boolean boolean22 = tarArchiveEntry16.equals((java.lang.Object) (byte) 0);
        java.util.Date date23 = tarArchiveEntry16.getModTime();
        tarArchiveEntry2.setModTime(date23);
        boolean boolean25 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(date19);
// flaky "19) test3540(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date23);
// flaky "12) test3540(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        tarArchiveEntry2.setIds(131, (int) (byte) 120);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 53, (byte) 51, (byte) 88, (byte) 48, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray21, zipEncoding22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "20) test3541(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "13) test3541(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 53, (byte) 51, (byte) 88, (byte) 48, (byte) 1 });
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupName("hi!");
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setDevMinor(504);
        byte[] byteArray12 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray12, zipEncoding13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 48, true);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        boolean boolean15 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setSize((long) 1000);
        int int18 = tarArchiveEntry2.getDevMajor();
        tarArchiveEntry2.setNames("", "././@LongLink");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setNames("00", "hi!");
        boolean boolean8 = tarArchiveEntry3.isStarSparse();
        java.io.File file9 = tarArchiveEntry3.getFile();
        tarArchiveEntry3.setLinkName(" \000");
        boolean boolean12 = tarArchiveEntry3.isGlobalPaxHeader();
        boolean boolean13 = tarArchiveEntry3.isCheckSumOK();
        boolean boolean14 = tarArchiveEntry3.isOldGNUSparse();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        long long10 = tarArchiveEntry2.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray11 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str12 = tarArchiveEntry2.getLinkName();
        boolean boolean13 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean14 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray11);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray11, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        boolean boolean13 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "21) test3547(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(155);
        tarArchiveEntry2.setDevMajor(0);
        tarArchiveEntry2.setGroupId((int) (short) 100);
        long long15 = tarArchiveEntry2.getLongUserId();
        boolean boolean16 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean17 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setUserId((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setUserName("");
        java.util.Date date5 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setNames("././@LongLink", "0\000");
        boolean boolean9 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertNotNull(date5);
// flaky "22) test3549(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        long long6 = tarArchiveEntry2.getRealSize();
        java.io.File file7 = tarArchiveEntry2.getFile();
        int int8 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertNotNull(date3);
// flaky "23) test3550(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date19 = tarArchiveEntry18.getLastModifiedDate();
        boolean boolean20 = tarArchiveEntry18.isCharacterDevice();
        tarArchiveEntry18.setUserName("hi!");
        boolean boolean23 = tarArchiveEntry18.isStarSparse();
        boolean boolean24 = tarArchiveEntry18.isGNULongLinkEntry();
        boolean boolean25 = tarArchiveEntry18.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry28 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean29 = tarArchiveEntry28.isGlobalPaxHeader();
        boolean boolean30 = tarArchiveEntry28.isFile();
        java.util.Date date31 = tarArchiveEntry28.getModTime();
        java.util.Date date32 = tarArchiveEntry28.getModTime();
        tarArchiveEntry28.setDevMinor(0);
        java.lang.String str35 = tarArchiveEntry28.getName();
        boolean boolean36 = tarArchiveEntry28.isLink();
        java.util.Date date37 = tarArchiveEntry28.getModTime();
        tarArchiveEntry18.setModTime(date37);
        tarArchiveEntry2.setModTime(date37);
        tarArchiveEntry2.setUserId(48);
        int int42 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date19);
// flaky "24) test3551(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(date31);
// flaky "14) test3551(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date32);
// flaky "6) test3551(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date32.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ustar " + "'", str35, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(date37);
// flaky "1) test3551(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date37.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        boolean boolean12 = tarArchiveEntry9.isDirectory();
        tarArchiveEntry9.setSize((long) 504);
        boolean boolean15 = tarArchiveEntry9.isSparse();
        boolean boolean16 = tarArchiveEntry9.isPaxHeader();
        boolean boolean17 = tarArchiveEntry2.isDescendent(tarArchiveEntry9);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date21 = tarArchiveEntry20.getLastModifiedDate();
        boolean boolean22 = tarArchiveEntry20.isCheckSumOK();
        tarArchiveEntry20.setGroupId(4);
        boolean boolean25 = tarArchiveEntry2.isDescendent(tarArchiveEntry20);
        byte[] byteArray27 = new byte[] { (byte) 103 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date21);
// flaky "25) test3552(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 103 });
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        tarArchiveEntry2.setModTime((long) 33188);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        tarArchiveEntry12.setSize((long) (byte) 55);
        tarArchiveEntry12.setName("0\000");
        java.util.Date date22 = tarArchiveEntry12.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "26) test3554(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        long long6 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setSize((long) (short) 1);
        org.junit.Assert.assertNotNull(date3);
// flaky "27) test3555(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        tarArchiveEntry2.setGroupName("0\000");
        boolean boolean20 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        java.lang.String str13 = tarArchiveEntry2.getName();
        boolean boolean14 = tarArchiveEntry2.isFIFO();
        byte[] byteArray19 = new byte[] { (byte) 52, (byte) -1, (byte) 50, (byte) -1 };
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
        org.junit.Assert.assertNotNull(date5);
// flaky "28) test3557(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "15) test3557(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ustar " + "'", str13, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 52, (byte) -1, (byte) 50, (byte) -1 });
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setDevMajor((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        tarArchiveEntry2.setGroupId((long) (byte) -1);
        int int19 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setName("ustar\000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "29) test3559(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 10, false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long7 = tarArchiveEntry6.getSize();
        tarArchiveEntry6.setUserId((int) (byte) 10);
        long long10 = tarArchiveEntry6.getLongUserId();
        int int11 = tarArchiveEntry6.getMode();
        tarArchiveEntry6.setSize((long) 32);
        int int14 = tarArchiveEntry6.getDevMinor();
        boolean boolean15 = tarArchiveEntry6.isBlockDevice();
        boolean boolean16 = tarArchiveEntry6.isCharacterDevice();
        boolean boolean17 = tarArchiveEntry6.isFile();
        long long18 = tarArchiveEntry6.getRealSize();
        boolean boolean19 = tarArchiveEntry3.equals((java.lang.Object) tarArchiveEntry6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33188 + "'", int11 == 33188);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        boolean boolean17 = tarArchiveEntry14.isPaxGNUSparse();
        java.util.Date date18 = tarArchiveEntry14.getModTime();
        tarArchiveEntry8.setModTime(date18);
        tarArchiveEntry8.setModTime((long) 'a');
        org.junit.Assert.assertNotNull(date3);
// flaky "30) test3561(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "16) test3561(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "7) test3561(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setUserName("");
        java.util.Date date5 = tarArchiveEntry2.getLastModifiedDate();
        java.lang.String str6 = tarArchiveEntry2.getLinkName();
        boolean boolean7 = tarArchiveEntry2.isDirectory();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertNotNull(date5);
// flaky "31) test3562(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "17) test3562(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        boolean boolean15 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean16 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "32) test3563(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "18) test3563(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 103, false);
        long long4 = tarArchiveEntry3.getSize();
        boolean boolean5 = tarArchiveEntry3.isCheckSumOK();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillStarSparseData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (short) 1, 155);
        int int8 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setName("ustar ");
        long long11 = tarArchiveEntry2.getLongUserId();
        boolean boolean13 = tarArchiveEntry2.equals((java.lang.Object) 0.0f);
        boolean boolean14 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 155 + "'", int8 == 155);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", true);
        tarArchiveEntry2.setNames("", "hi!");
        tarArchiveEntry2.setLinkName(" \000");
        tarArchiveEntry2.setName("././@LongLink");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isFile();
        boolean boolean5 = tarArchiveEntry3.isFile();
        byte[] byteArray6 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray6, zipEncoding7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        tarArchiveEntry3.setMode(96);
        boolean boolean17 = tarArchiveEntry3.isFile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky "33) test3568(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 83, false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 83, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray21, zipEncoding22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "34) test3570(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(date17);
// flaky "19) test3570(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 83, (byte) 88 });
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setNames("00", "");
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setGroupId((long) 512);
        boolean boolean14 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean15 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "35) test3571(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "20) test3571(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date11);
// flaky "8) test3571(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setGroupName(" \000");
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        tarArchiveEntry13.setIds(10, (int) (byte) 55);
        java.io.File file22 = tarArchiveEntry13.getFile();
        boolean boolean23 = tarArchiveEntry13.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int28 = tarArchiveEntry27.getGroupId();
        long long29 = tarArchiveEntry27.getLongGroupId();
        tarArchiveEntry27.setLinkName("tar\000");
        java.lang.String str32 = tarArchiveEntry27.getUserName();
        boolean boolean33 = tarArchiveEntry27.isFIFO();
        java.lang.Class<?> wildcardClass34 = tarArchiveEntry27.getClass();
        boolean boolean35 = tarArchiveEntry13.equals((java.lang.Object) wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "36) test3573(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "21) test3573(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isDirectory();
        tarArchiveEntry13.setSize((long) 504);
        java.lang.String str19 = tarArchiveEntry13.getName();
        boolean boolean20 = tarArchiveEntry13.isExtended();
        tarArchiveEntry13.setLinkName("\000\000");
        boolean boolean23 = tarArchiveEntry13.isDirectory();
        tarArchiveEntry13.setDevMinor(3);
        boolean boolean26 = tarArchiveEntry2.equals(tarArchiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long30 = tarArchiveEntry29.getSize();
        tarArchiveEntry29.setUserId((int) (byte) 10);
        boolean boolean33 = tarArchiveEntry29.isCheckSumOK();
        boolean boolean34 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry29);
        tarArchiveEntry29.setDevMajor(508);
        tarArchiveEntry29.setGroupId((int) (short) 100);
        org.junit.Assert.assertNotNull(date3);
// flaky "37) test3574(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ustar " + "'", str19, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        boolean boolean7 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setLinkName("hi!");
        java.lang.String str10 = tarArchiveEntry2.getName();
        org.junit.Assert.assertNotNull(date3);
// flaky "38) test3575(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        boolean boolean30 = tarArchiveEntry2.isOldGNUSparse();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry30 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 50, true);
        tarArchiveEntry30.setIds((int) (byte) 49, (int) (byte) 51);
        boolean boolean34 = tarArchiveEntry15.equals(tarArchiveEntry30);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        long long5 = tarArchiveEntry3.getLongGroupId();
        boolean boolean6 = tarArchiveEntry3.isGNUSparse();
        tarArchiveEntry3.setModTime((long) '#');
        long long9 = tarArchiveEntry3.getLongGroupId();
        java.lang.String str10 = tarArchiveEntry3.getLinkName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserId(8L);
        int int12 = tarArchiveEntry2.getDevMinor();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "39) test3579(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        byte[] byteArray11 = new byte[] { (byte) 49, (byte) 75, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 49, (byte) 75, (byte) 0 });
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.lang.String str6 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertNotNull(date5);
// flaky "40) test3581(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.io.File file5 = tarArchiveEntry2.getFile();
        boolean boolean6 = tarArchiveEntry2.isLink();
        tarArchiveEntry2.setDevMinor((int) (byte) 76);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        int int12 = tarArchiveEntry2.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean17 = tarArchiveEntry16.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean21 = tarArchiveEntry20.isGlobalPaxHeader();
        java.lang.String str22 = tarArchiveEntry20.getUserName();
        boolean boolean23 = tarArchiveEntry16.isDescendent(tarArchiveEntry20);
        boolean boolean24 = tarArchiveEntry2.equals(tarArchiveEntry16);
        boolean boolean25 = tarArchiveEntry2.isPaxHeader();
        java.lang.String str26 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "41) test3583(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "22) test3583(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        boolean boolean15 = tarArchiveEntry10.isGlobalPaxHeader();
        tarArchiveEntry10.setIds(263, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "42) test3584(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "23) test3584(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str9 = tarArchiveEntry2.getName();
        boolean boolean10 = tarArchiveEntry2.isLink();
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        long long12 = tarArchiveEntry2.getLongUserId();
        java.io.File file13 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "43) test3585(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "24) test3585(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "9) test3585(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 49);
        long long28 = tarArchiveEntry27.getRealSize();
        boolean boolean29 = tarArchiveEntry15.equals(tarArchiveEntry27);
        boolean boolean30 = tarArchiveEntry15.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "44) test3586(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "25) test3586(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.util.Date date4 = tarArchiveEntry3.getModTime();
        boolean boolean5 = tarArchiveEntry3.isBlockDevice();
        java.lang.String str6 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setUserId(53L);
        int int9 = tarArchiveEntry3.getDevMajor();
        tarArchiveEntry3.setGroupId((long) 0);
        org.junit.Assert.assertNotNull(date4);
// flaky "45) test3587(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry12.setDevMajor((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Major device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        java.util.Date date3 = tarArchiveEntry2.getModTime();
        long long4 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setGroupName("tar\000");
        int int7 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertNotNull(date3);
// flaky "46) test3589(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        java.lang.Class<?> wildcardClass20 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "47) test3590(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        byte[] byteArray32 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.parseTarHeader(byteArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        java.lang.String str10 = tarArchiveEntry2.getName();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean12 = tarArchiveEntry2.isGNUSparse();
        boolean boolean13 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setSize((long) 1000);
        tarArchiveEntry2.setModTime((long) 33188);
        tarArchiveEntry2.setLinkName("\000\000");
        org.junit.Assert.assertNotNull(date3);
// flaky "48) test3593(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str4 = tarArchiveEntry2.getUserName();
        boolean boolean5 = tarArchiveEntry2.isSparse();
        java.lang.Object obj6 = null;
        boolean boolean7 = tarArchiveEntry2.equals(obj6);
        tarArchiveEntry2.setGroupId((-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        boolean boolean24 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long28 = tarArchiveEntry27.getSize();
        tarArchiveEntry27.setUserId((int) (byte) 10);
        boolean boolean31 = tarArchiveEntry27.isGlobalPaxHeader();
        tarArchiveEntry27.setGroupId((long) (byte) 10);
        boolean boolean34 = tarArchiveEntry27.isBlockDevice();
        tarArchiveEntry27.setUserId(100L);
        boolean boolean37 = tarArchiveEntry27.isFIFO();
        tarArchiveEntry27.setName("00");
        boolean boolean40 = tarArchiveEntry27.isGNULongNameEntry();
        boolean boolean41 = tarArchiveEntry2.isDescendent(tarArchiveEntry27);
        boolean boolean42 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean43 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry47 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean48 = tarArchiveEntry47.isCharacterDevice();
        boolean boolean49 = tarArchiveEntry47.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry52 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date53 = tarArchiveEntry52.getLastModifiedDate();
        tarArchiveEntry47.setModTime(date53);
        boolean boolean55 = tarArchiveEntry47.isOldGNUSparse();
        boolean boolean56 = tarArchiveEntry47.isPaxGNUSparse();
        boolean boolean57 = tarArchiveEntry47.isGlobalPaxHeader();
        boolean boolean58 = tarArchiveEntry47.isPaxGNUSparse();
        boolean boolean59 = tarArchiveEntry47.isLink();
        boolean boolean60 = tarArchiveEntry2.isDescendent(tarArchiveEntry47);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "49) test3595(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "26) test3595(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "10) test3595(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(date53);
// flaky "2) test3595(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date53.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long8 = tarArchiveEntry7.getSize();
        tarArchiveEntry7.setUserId((int) (byte) 10);
        boolean boolean11 = tarArchiveEntry7.isBlockDevice();
        tarArchiveEntry7.setGroupName("hi!");
        boolean boolean14 = tarArchiveEntry2.isDescendent(tarArchiveEntry7);
        byte[] byteArray18 = new byte[] { (byte) 88, (byte) 51, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry7.parseTarHeader(byteArray18, zipEncoding19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "50) test3596(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 88, (byte) 51, (byte) 10 });
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        boolean boolean15 = tarArchiveEntry2.isStarSparse();
        boolean boolean16 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setDevMajor(10);
        boolean boolean19 = tarArchiveEntry2.isCharacterDevice();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap20);
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
        org.junit.Assert.assertNotNull(date14);
// flaky "51) test3597(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 10);
        tarArchiveEntry2.setGroupName("");
        boolean boolean5 = tarArchiveEntry2.isSymbolicLink();
        java.lang.String str6 = tarArchiveEntry2.getName();
        int int7 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        java.lang.String str7 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setUserId((int) (short) 10);
        tarArchiveEntry2.setModTime((long) '4');
        java.io.File file12 = tarArchiveEntry2.getFile();
        int int13 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        tarArchiveEntry2.setUserName("tar\000");
        tarArchiveEntry2.setMode(0);
        tarArchiveEntry2.setGroupName("././@LongLink");
        java.lang.String str12 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long16 = tarArchiveEntry15.getSize();
        tarArchiveEntry15.setUserId((int) (byte) 10);
        boolean boolean19 = tarArchiveEntry15.isGlobalPaxHeader();
        tarArchiveEntry15.setGroupId((long) (byte) 10);
        boolean boolean22 = tarArchiveEntry15.isBlockDevice();
        tarArchiveEntry15.setLinkName("0\000");
        tarArchiveEntry15.setUserId((int) 'a');
        tarArchiveEntry15.setDevMajor((int) (byte) 50);
        boolean boolean29 = tarArchiveEntry15.isSparse();
        boolean boolean30 = tarArchiveEntry2.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000\000" + "'", str12, "\000\000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setUserId(0L);
        boolean boolean7 = tarArchiveEntry3.isGNULongNameEntry();
        byte[] byteArray13 = new byte[] { (byte) 49, (byte) -1, (byte) 55, (byte) 53, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray13, zipEncoding14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 49, (byte) -1, (byte) 55, (byte) 53, (byte) 50 });
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        int int22 = tarArchiveEntry11.getDevMinor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "52) test3602(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        int int17 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertNotNull(date3);
// flaky "53) test3603(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
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
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        int int13 = tarArchiveEntry2.getUserId();
        boolean boolean14 = tarArchiveEntry2.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray15 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "54) test3605(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray15);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray15, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        tarArchiveEntry2.setIds(504, 148);
        boolean boolean21 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "55) test3606(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "27) test3606(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 120);
        tarArchiveEntry2.setGroupId((-1L));
        tarArchiveEntry2.setSize((long) (short) 100);
        tarArchiveEntry2.setUserName("ustar\000");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", true);
        tarArchiveEntry2.setNames(" \000", "00");
        int int6 = tarArchiveEntry2.getMode();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        int int8 = tarArchiveEntry2.getDevMajor();
        int int9 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33188 + "'", int6 == 33188);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " \000" + "'", str7, " \000");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        java.lang.String str7 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray8 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertNotNull(date3);
// flaky "56) test3609(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ustar " + "'", str7, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray8);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray8, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setGroupId((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) 504);
        tarArchiveEntry2.setIds(96, (int) (byte) 50);
        boolean boolean12 = tarArchiveEntry2.isGlobalPaxHeader();
        long long13 = tarArchiveEntry2.getLongGroupId();
        java.lang.String str14 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 50L + "'", long13 == 50L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        java.lang.String str13 = tarArchiveEntry2.getName();
        boolean boolean14 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean15 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ustar " + "'", str13, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean7 = tarArchiveEntry2.equals(tarArchiveEntry6);
        tarArchiveEntry6.setName("");
        boolean boolean10 = tarArchiveEntry6.isExtended();
        boolean boolean11 = tarArchiveEntry6.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        long long18 = tarArchiveEntry14.getLongUserId();
        int int19 = tarArchiveEntry14.getMode();
        tarArchiveEntry14.setSize((long) 32);
        boolean boolean22 = tarArchiveEntry14.isPaxHeader();
        tarArchiveEntry14.setNames("0\000", "");
        tarArchiveEntry14.setSize((long) 'a');
        boolean boolean28 = tarArchiveEntry14.isCharacterDevice();
        boolean boolean29 = tarArchiveEntry6.equals(tarArchiveEntry14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33188 + "'", int19 == 33188);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        tarArchiveEntry2.setIds(131, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "57) test3614(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(date17);
// flaky "28) test3614(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        int int2 = tarArchiveEntry1.getUserId();
        java.lang.String str3 = tarArchiveEntry1.getGroupName();
        tarArchiveEntry1.setSize((long) 8);
        long long6 = tarArchiveEntry1.getSize();
        boolean boolean7 = tarArchiveEntry1.isCharacterDevice();
        tarArchiveEntry1.setModTime(1L);
        tarArchiveEntry1.setMode((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8L + "'", long6 == 8L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        tarArchiveEntry2.setSize(0L);
        org.junit.Assert.assertNotNull(date3);
// flaky "58) test3616(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        tarArchiveEntry2.setUserName("tar\000");
        tarArchiveEntry2.setMode(0);
        java.util.Date date10 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky "59) test3617(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 100, false);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        long long6 = tarArchiveEntry2.getLongGroupId();
        boolean boolean7 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertNotNull(date3);
// flaky "60) test3619(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        long long5 = tarArchiveEntry3.getLongGroupId();
        boolean boolean6 = tarArchiveEntry3.isOldGNUSparse();
        tarArchiveEntry3.setUserId(48L);
        byte[] byteArray13 = new byte[] { (byte) 53, (byte) 0, (byte) 88, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray13, zipEncoding14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 53, (byte) 0, (byte) 88, (byte) 100 });
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isFile();
        boolean boolean11 = tarArchiveEntry2.equals((java.lang.Object) '4');
        tarArchiveEntry2.setSize((long) 1000);
        boolean boolean14 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setGroupName("00");
        org.junit.Assert.assertNotNull(date3);
// flaky "61) test3621(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        int int10 = tarArchiveEntry2.getDevMinor();
        int int11 = tarArchiveEntry2.getUserId();
        boolean boolean12 = tarArchiveEntry2.isSparse();
        boolean boolean13 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 10, false);
        tarArchiveEntry3.setGroupId((int) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean9 = tarArchiveEntry8.isGlobalPaxHeader();
        boolean boolean10 = tarArchiveEntry8.isFile();
        boolean boolean11 = tarArchiveEntry8.isDirectory();
        tarArchiveEntry8.setSize((long) 504);
        long long14 = tarArchiveEntry8.getSize();
        boolean boolean15 = tarArchiveEntry8.isLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date19 = tarArchiveEntry18.getLastModifiedDate();
        boolean boolean20 = tarArchiveEntry18.isCharacterDevice();
        tarArchiveEntry18.setUserName("hi!");
        tarArchiveEntry18.setGroupName("");
        java.util.Date date25 = tarArchiveEntry18.getModTime();
        boolean boolean26 = tarArchiveEntry18.isGNULongLinkEntry();
        boolean boolean27 = tarArchiveEntry18.isPaxHeader();
        java.util.Date date28 = tarArchiveEntry18.getLastModifiedDate();
        tarArchiveEntry8.setModTime(date28);
        tarArchiveEntry3.setModTime(date28);
        boolean boolean31 = tarArchiveEntry3.isFIFO();
        tarArchiveEntry3.setUserId(8L);
        java.util.Date date34 = tarArchiveEntry3.getModTime();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 504L + "'", long14 == 504L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "62) test3623(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date25);
// flaky "29) test3623(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date28);
// flaky "11) test3623(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date28.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date34);
// flaky "3) test3623(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date34.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date19 = tarArchiveEntry18.getLastModifiedDate();
        boolean boolean20 = tarArchiveEntry18.isCharacterDevice();
        tarArchiveEntry18.setUserName("hi!");
        boolean boolean23 = tarArchiveEntry18.isStarSparse();
        boolean boolean24 = tarArchiveEntry18.isSymbolicLink();
        int int25 = tarArchiveEntry18.getGroupId();
        boolean boolean26 = tarArchiveEntry18.isGNULongLinkEntry();
        boolean boolean27 = tarArchiveEntry2.isDescendent(tarArchiveEntry18);
        tarArchiveEntry2.setGroupName("");
        boolean boolean30 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "63) test3624(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        tarArchiveEntry2.setGroupId((long) 257);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap19);
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
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean22 = tarArchiveEntry21.isGlobalPaxHeader();
        java.lang.String str23 = tarArchiveEntry21.getUserName();
        boolean boolean24 = tarArchiveEntry21.isSparse();
        tarArchiveEntry21.setModTime((long) (byte) 100);
        tarArchiveEntry21.setSize((long) ' ');
        java.util.Date date29 = tarArchiveEntry21.getModTime();
        tarArchiveEntry2.setModTime(date29);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry33 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long34 = tarArchiveEntry33.getSize();
        tarArchiveEntry33.setUserId((int) (byte) 10);
        boolean boolean37 = tarArchiveEntry33.isGlobalPaxHeader();
        tarArchiveEntry33.setGroupId((long) (byte) 10);
        boolean boolean40 = tarArchiveEntry33.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray41 = tarArchiveEntry33.getDirectoryEntries();
        tarArchiveEntry33.setModTime(0L);
        boolean boolean44 = tarArchiveEntry33.isStarSparse();
        tarArchiveEntry33.setIds(148, (int) ' ');
        boolean boolean48 = tarArchiveEntry2.isDescendent(tarArchiveEntry33);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "64) test3627(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "30) test3627(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray41);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray41, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 120);
        tarArchiveEntry2.setName(" \000");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        tarArchiveEntry2.setDevMajor((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "65) test3629(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        tarArchiveEntry24.setGroupId((long) 131);
        java.util.Date date27 = tarArchiveEntry24.getLastModifiedDate();
        tarArchiveEntry12.setModTime(date27);
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
        org.junit.Assert.assertNotNull(date27);
// flaky "66) test3630(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId(10L);
        tarArchiveEntry2.setMode(12);
        tarArchiveEntry2.setUserName("tar\000");
        org.junit.Assert.assertNotNull(date5);
// flaky "67) test3631(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        tarArchiveEntry2.setDevMajor((int) (byte) 49);
        tarArchiveEntry2.setIds(48, (int) (byte) 53);
        org.junit.Assert.assertNotNull(date3);
// flaky "68) test3632(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        tarArchiveEntry2.setGroupName("ustar ");
        java.lang.String str11 = tarArchiveEntry2.getUserName();
        int int12 = tarArchiveEntry2.getDevMajor();
        long long13 = tarArchiveEntry2.getSize();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "69) test3633(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "31) test3633(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        boolean boolean22 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "70) test3634(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(date11);
// flaky "32) test3634(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "12) test3634(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        java.util.Date date17 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "71) test3635(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "33) test3635(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setName("tar\000");
        java.lang.String str15 = tarArchiveEntry2.getGroupName();
        boolean boolean16 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFIFO();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long10 = tarArchiveEntry9.getSize();
        tarArchiveEntry9.setUserId((int) (byte) 10);
        int int13 = tarArchiveEntry9.getDevMinor();
        boolean boolean14 = tarArchiveEntry2.equals(tarArchiveEntry9);
        java.lang.String str15 = tarArchiveEntry9.getName();
        java.lang.String str16 = tarArchiveEntry9.getLinkName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ustar " + "'", str15, "ustar ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        long long24 = tarArchiveEntry12.getLongUserId();
        tarArchiveEntry12.setUserName("././@LongLink");
        boolean boolean27 = tarArchiveEntry12.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "72) test3638(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "34) test3638(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isSymbolicLink();
        boolean boolean6 = tarArchiveEntry3.isPaxGNUSparse();
        boolean boolean7 = tarArchiveEntry3.isFIFO();
        long long8 = tarArchiveEntry3.getRealSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray15 = tarArchiveEntry10.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        long long19 = tarArchiveEntry18.getSize();
        tarArchiveEntry18.setDevMajor(1000);
        boolean boolean22 = tarArchiveEntry10.isDescendent(tarArchiveEntry18);
        int int23 = tarArchiveEntry18.getMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "73) test3640(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "35) test3640(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray15);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray15, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 33188 + "'", int23 == 33188);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
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
        java.util.Date date38 = tarArchiveEntry9.getLastModifiedDate();
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
// flaky "74) test3641(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 504L + "'", long35 == 504L);
        org.junit.Assert.assertNotNull(date38);
// flaky "36) test3641(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date38.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        java.lang.String str23 = tarArchiveEntry1.getGroupName();
        boolean boolean24 = tarArchiveEntry1.isSparse();
        boolean boolean25 = tarArchiveEntry1.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "75) test3642(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "37) test3642(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray15);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray15, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isOldGNUSparse();
        java.lang.String str6 = tarArchiveEntry3.getUserName();
        tarArchiveEntry3.setNames("ustar\000", "\000\000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isGNULongLinkEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 50, true);
        boolean boolean14 = tarArchiveEntry2.equals(tarArchiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry17.setMode((int) '#');
        java.util.Date date20 = tarArchiveEntry17.getModTime();
        int int21 = tarArchiveEntry17.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long25 = tarArchiveEntry24.getSize();
        tarArchiveEntry24.setUserId((int) (byte) 10);
        long long28 = tarArchiveEntry24.getLongUserId();
        int int29 = tarArchiveEntry24.getMode();
        java.util.Date date30 = tarArchiveEntry24.getLastModifiedDate();
        tarArchiveEntry17.setModTime(date30);
        tarArchiveEntry13.setModTime(date30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky "76) test3644(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:46 ICT 2026");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 33188 + "'", int29 == 33188);
        org.junit.Assert.assertNotNull(date30);
// flaky "38) test3644(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:46 ICT 2026");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray7 = tarArchiveEntry2.getDirectoryEntries();
        int int8 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setLinkName("ustar\000");
        tarArchiveEntry2.setName("ustar\000");
        tarArchiveEntry2.setSize((long) (short) 10);
        org.junit.Assert.assertNotNull(date5);
// flaky "77) test3645(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray7);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray7, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date4 = tarArchiveEntry3.getLastModifiedDate();
        tarArchiveEntry3.setDevMajor((int) (byte) 0);
        boolean boolean7 = tarArchiveEntry1.equals((java.lang.Object) (byte) 0);
        java.util.Date date8 = tarArchiveEntry1.getModTime();
        boolean boolean9 = tarArchiveEntry1.isDirectory();
        org.junit.Assert.assertNotNull(date4);
// flaky "78) test3646(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "39) test3646(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 49, true);
        tarArchiveEntry3.setName("");
        java.lang.Class<?> wildcardClass6 = tarArchiveEntry3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean7 = tarArchiveEntry2.isCharacterDevice();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        long long6 = tarArchiveEntry3.getLongUserId();
        long long7 = tarArchiveEntry3.getRealSize();
        java.io.File file8 = tarArchiveEntry3.getFile();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(file8);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("0\000");
        boolean boolean12 = tarArchiveEntry2.isExtended();
        java.lang.String str13 = tarArchiveEntry2.getGroupName();
        int int14 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isFIFO();
        boolean boolean5 = tarArchiveEntry3.isDirectory();
        tarArchiveEntry3.setModTime((long) 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        boolean boolean7 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean8 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        java.lang.String str10 = tarArchiveEntry2.getName();
        java.lang.String str11 = tarArchiveEntry2.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray12 = tarArchiveEntry2.getDirectoryEntries();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray12);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray12, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        boolean boolean45 = tarArchiveEntry19.isGNULongLinkEntry();
        org.junit.Assert.assertNotNull(date3);
// flaky "79) test3654(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "40) test3654(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "13) test3654(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:47 ICT 2026");
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
// flaky "4) test3654(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date41);
// flaky "1) test3654(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setName("");
        boolean boolean12 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean13 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertNotNull(date9);
// flaky "80) test3655(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", true);
        int int3 = tarArchiveEntry2.getMode();
        java.lang.String str4 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33188 + "'", int3 == 33188);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ustar " + "'", str4, "ustar ");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        byte[] byteArray5 = new byte[] { (byte) 52, (byte) 50, (byte) -1, (byte) 10, (byte) 53 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 52, (byte) 50, (byte) -1, (byte) 10, (byte) 53 });
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        tarArchiveEntry2.setLinkName("ustar\000");
        tarArchiveEntry2.setGroupId(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "81) test3658(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isOldGNUSparse();
        boolean boolean6 = tarArchiveEntry3.isBlockDevice();
        boolean boolean7 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean8 = tarArchiveEntry3.isFile();
        tarArchiveEntry3.setDevMajor(512);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 54, true);
        long long4 = tarArchiveEntry3.getLongUserId();
        boolean boolean5 = tarArchiveEntry3.isPaxHeader();
        java.io.File file6 = tarArchiveEntry3.getFile();
        tarArchiveEntry3.setSize((long) 504);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean13 = tarArchiveEntry12.isCharacterDevice();
        tarArchiveEntry12.setSize((long) (byte) 1);
        boolean boolean16 = tarArchiveEntry12.isGNULongLinkEntry();
        boolean boolean17 = tarArchiveEntry12.isFile();
        boolean boolean18 = tarArchiveEntry12.isFile();
        long long19 = tarArchiveEntry12.getRealSize();
        boolean boolean20 = tarArchiveEntry3.equals(tarArchiveEntry12);
        boolean boolean21 = tarArchiveEntry12.isFIFO();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long10 = tarArchiveEntry9.getSize();
        tarArchiveEntry9.setUserId((int) (byte) 10);
        boolean boolean13 = tarArchiveEntry9.isGlobalPaxHeader();
        tarArchiveEntry9.setGroupId((long) (byte) 10);
        boolean boolean16 = tarArchiveEntry9.isBlockDevice();
        tarArchiveEntry9.setUserId(100L);
        boolean boolean19 = tarArchiveEntry9.isFIFO();
        tarArchiveEntry9.setName("00");
        boolean boolean22 = tarArchiveEntry2.isDescendent(tarArchiveEntry9);
        java.lang.String str23 = tarArchiveEntry9.getLinkName();
        org.junit.Assert.assertNotNull(date3);
// flaky "82) test3661(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isDirectory();
        java.lang.Class<?> wildcardClass11 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky "83) test3662(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "41) test3662(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        boolean boolean6 = tarArchiveEntry3.isGlobalPaxHeader();
        java.lang.String str7 = tarArchiveEntry3.getName();
        boolean boolean8 = tarArchiveEntry3.isLink();
        tarArchiveEntry3.setDevMajor(16877);
        tarArchiveEntry3.setGroupId((long) (byte) 51);
        tarArchiveEntry3.setGroupId((long) 155);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0\000" + "'", str7, "0\000");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        boolean boolean15 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(date14);
// flaky "84) test3664(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        boolean boolean24 = tarArchiveEntry12.isBlockDevice();
        tarArchiveEntry12.setGroupId((long) 1000);
        boolean boolean27 = tarArchiveEntry12.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "85) test3665(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "42) test3665(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setDevMinor(257);
        byte[] byteArray12 = new byte[] { (byte) 49, (byte) 53, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12, zipEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "86) test3666(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 49, (byte) 53, (byte) 88 });
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        java.util.Date date44 = tarArchiveEntry12.getLastModifiedDate();
        boolean boolean45 = tarArchiveEntry12.isGNUSparse();
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
// flaky "87) test3667(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date41);
// flaky "43) test3667(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(date44);
// flaky "14) test3667(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date44.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        java.lang.String str10 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setDevMinor((int) (byte) 76);
        boolean boolean13 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setModTime((long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        boolean boolean15 = tarArchiveEntry2.isPaxHeader();
        int int16 = tarArchiveEntry2.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 100, false);
        long long21 = tarArchiveEntry20.getRealSize();
        boolean boolean22 = tarArchiveEntry2.equals(tarArchiveEntry20);
        int int23 = tarArchiveEntry20.getDevMajor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        long long5 = tarArchiveEntry2.getRealSize();
        tarArchiveEntry2.setLinkName("0\000");
        tarArchiveEntry2.setUserName("tar\000");
        boolean boolean10 = tarArchiveEntry2.isLink();
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setLinkName("00");
        org.junit.Assert.assertNotNull(date3);
// flaky "88) test3670(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "44) test3670(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:47 ICT 2026");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        boolean boolean19 = tarArchiveEntry2.isGNULongLinkEntry();
        java.io.File file20 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "89) test3671(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(file20);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        boolean boolean15 = tarArchiveEntry2.isPaxHeader();
        int int16 = tarArchiveEntry2.getDevMinor();
        boolean boolean17 = tarArchiveEntry2.isOldGNUSparse();
        long long18 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        int int11 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isBlockDevice();
        java.lang.String str8 = tarArchiveEntry2.getGroupName();
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        boolean boolean10 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "90) test3674(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "45) test3674(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 53, true);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 1, false);
        boolean boolean4 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setMode((int) (byte) 55);
        boolean boolean7 = tarArchiveEntry3.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 88);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        tarArchiveEntry2.setGroupId((int) (byte) 48);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "91) test3678(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setNames("0\000", "");
        tarArchiveEntry2.setSize((long) 'a');
        boolean boolean16 = tarArchiveEntry2.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean21 = tarArchiveEntry20.isCharacterDevice();
        tarArchiveEntry20.setUserId(0L);
        tarArchiveEntry20.setMode((int) (byte) 88);
        long long26 = tarArchiveEntry20.getLongUserId();
        boolean boolean27 = tarArchiveEntry2.equals((java.lang.Object) long26);
        byte[] byteArray31 = new byte[] { (byte) 55, (byte) 75, (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding32 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray31, zipEncoding32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 55, (byte) 75, (byte) 54 });
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", (byte) 83, false);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 103);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 50, true);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str9 = tarArchiveEntry2.getName();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        java.io.File file11 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setIds(8, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "92) test3683(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "46) test3683(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", true);
        boolean boolean8 = tarArchiveEntry2.equals(tarArchiveEntry7);
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        java.lang.String str10 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "93) test3684(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 52, true);
        tarArchiveEntry3.setNames("hi!", "00");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        java.lang.Class<?> wildcardClass55 = tarArchiveEntry46.getClass();
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
// flaky "94) test3686(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date41);
// flaky "47) test3686(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        boolean boolean19 = tarArchiveEntry10.isFIFO();
        boolean boolean20 = tarArchiveEntry10.isExtended();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "95) test3687(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        int int30 = tarArchiveEntry2.getDevMinor();
        boolean boolean31 = tarArchiveEntry2.isLink();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean10 = tarArchiveEntry2.isStarSparse();
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        int int7 = tarArchiveEntry2.getDevMinor();
        byte[] byteArray8 = null;
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
        org.junit.Assert.assertNotNull(date5);
// flaky "96) test3690(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 0);
        java.lang.String str3 = tarArchiveEntry2.getGroupName();
        int int4 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 1);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", true);
        int int3 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33188 + "'", int3 == 33188);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        boolean boolean3 = tarArchiveEntry1.isFIFO();
        boolean boolean4 = tarArchiveEntry1.isStarSparse();
        long long5 = tarArchiveEntry1.getRealSize();
        tarArchiveEntry1.setName(" \000");
        java.io.File file8 = tarArchiveEntry1.getFile();
        int int9 = tarArchiveEntry1.getGroupId();
        int int10 = tarArchiveEntry1.getUserId();
        byte[] byteArray14 = new byte[] { (byte) 48, (byte) 54, (byte) 51 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.parseTarHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky "97) test3694(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 48, (byte) 54, (byte) 51 });
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean9 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
        boolean boolean19 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean20 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertNotNull(date3);
// flaky "98) test3696(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(date11);
// flaky "48) test3696(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "15) test3696(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        tarArchiveEntry2.setGroupName("");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long22 = tarArchiveEntry21.getSize();
        tarArchiveEntry21.setUserId((int) (byte) 10);
        boolean boolean25 = tarArchiveEntry21.isGlobalPaxHeader();
        tarArchiveEntry21.setGroupId((long) (byte) 10);
        boolean boolean28 = tarArchiveEntry21.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray29 = tarArchiveEntry21.getDirectoryEntries();
        java.lang.String str30 = tarArchiveEntry21.getLinkName();
        tarArchiveEntry21.setGroupId(35L);
        boolean boolean33 = tarArchiveEntry21.isSymbolicLink();
        boolean boolean34 = tarArchiveEntry21.isGNUSparse();
        int int35 = tarArchiveEntry21.getGroupId();
        boolean boolean36 = tarArchiveEntry2.equals((java.lang.Object) int35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap37);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray29);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray29, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isFile();
        int int10 = tarArchiveEntry2.getDevMajor();
        boolean boolean11 = tarArchiveEntry2.isStarSparse();
        boolean boolean12 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "99) test3698(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        java.util.Date date17 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor((int) (byte) 52);
        long long20 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "100) test3699(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        java.util.Date date18 = tarArchiveEntry14.getModTime();
        tarArchiveEntry14.setUserId((long) '#');
        boolean boolean21 = tarArchiveEntry14.isGNULongNameEntry();
        tarArchiveEntry14.setNames(" \000", " \000");
        java.util.Date date25 = tarArchiveEntry14.getModTime();
        tarArchiveEntry14.setMode((int) (byte) 1);
        boolean boolean28 = tarArchiveEntry2.equals(tarArchiveEntry14);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry31 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean32 = tarArchiveEntry31.isGlobalPaxHeader();
        boolean boolean33 = tarArchiveEntry31.isFile();
        java.util.Date date34 = tarArchiveEntry31.getModTime();
        java.util.Date date35 = tarArchiveEntry31.getModTime();
        tarArchiveEntry31.setDevMinor(0);
        java.lang.String str38 = tarArchiveEntry31.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry41 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date42 = tarArchiveEntry41.getLastModifiedDate();
        boolean boolean43 = tarArchiveEntry41.isCharacterDevice();
        tarArchiveEntry41.setUserName("hi!");
        tarArchiveEntry41.setGroupName("");
        java.util.Date date48 = tarArchiveEntry41.getModTime();
        tarArchiveEntry41.setSize((long) (byte) 53);
        tarArchiveEntry41.setUserName("");
        boolean boolean53 = tarArchiveEntry41.isOldGNUSparse();
        boolean boolean54 = tarArchiveEntry31.isDescendent(tarArchiveEntry41);
        java.io.File file55 = tarArchiveEntry31.getFile();
        tarArchiveEntry31.setIds(0, (int) (byte) -1);
        boolean boolean59 = tarArchiveEntry14.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "101) test3700(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "49) test3700(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "16) test3700(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "5) test3700(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date25);
// flaky "2) test3700(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(date34);
// flaky "1) test3700(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date34.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date35);
// flaky "1) test3700(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date35.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ustar " + "'", str38, "ustar ");
        org.junit.Assert.assertNotNull(date42);
// flaky "1) test3700(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date42.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(date48);
// flaky "1) test3700(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date48.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(file55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.lang.String str6 = tarArchiveEntry2.getName();
        boolean boolean7 = tarArchiveEntry2.isDirectory();
        int int8 = tarArchiveEntry2.getDevMajor();
        java.util.Date date9 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar " + "'", str6, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(date9);
// flaky "102) test3701(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:47 ICT 2026");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setLinkName("\000\000");
        boolean boolean12 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setDevMinor(3);
        boolean boolean15 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setModTime(97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        byte[] byteArray2 = new byte[] { (byte) 76, (byte) -1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 76, (byte) -1 });
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        boolean boolean31 = tarArchiveEntry2.isGlobalPaxHeader();
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
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        int int5 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
// flaky "103) test3705(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 100, false);
        long long4 = tarArchiveEntry3.getRealSize();
        tarArchiveEntry3.setNames("\000\000", "0\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean12 = tarArchiveEntry11.isGNULongLinkEntry();
        long long13 = tarArchiveEntry11.getSize();
        java.util.Date date14 = tarArchiveEntry11.getLastModifiedDate();
        tarArchiveEntry3.setModTime(date14);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(date14);
// flaky "104) test3706(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:47 ICT 2026");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        byte[] byteArray2 = new byte[] { (byte) 53, (byte) 51 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 53, (byte) 51 });
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        int int26 = tarArchiveEntry12.getDevMajor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "105) test3708(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "50) test3708(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray7 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setDevMajor(131);
        java.lang.String str10 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray7);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray7, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setDevMinor(0);
        int int6 = tarArchiveEntry2.getGroupId();
        boolean boolean7 = tarArchiveEntry2.isExtended();
        boolean boolean8 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        long long4 = tarArchiveEntry2.getSize();
        java.lang.String str5 = tarArchiveEntry2.getLinkName();
        boolean boolean6 = tarArchiveEntry2.isExtended();
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 55 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray9, zipEncoding10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "106) test3711(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 55 });
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setSize((long) (byte) 55);
        boolean boolean13 = tarArchiveEntry2.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long17 = tarArchiveEntry16.getSize();
        tarArchiveEntry16.setUserId((int) (byte) 10);
        long long20 = tarArchiveEntry16.getLongUserId();
        int int21 = tarArchiveEntry16.getMode();
        java.util.Date date22 = tarArchiveEntry16.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long26 = tarArchiveEntry25.getSize();
        tarArchiveEntry25.setUserId((int) (byte) 10);
        boolean boolean29 = tarArchiveEntry25.isBlockDevice();
        tarArchiveEntry25.setGroupId((-1L));
        java.lang.String str32 = tarArchiveEntry25.getGroupName();
        boolean boolean33 = tarArchiveEntry16.equals(tarArchiveEntry25);
        boolean boolean34 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry25);
        boolean boolean35 = tarArchiveEntry25.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "107) test3712(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "51) test3712(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
        org.junit.Assert.assertNotNull(date22);
// flaky "17) test3712(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 0);
        boolean boolean26 = tarArchiveEntry25.isBlockDevice();
        boolean boolean27 = tarArchiveEntry13.isDescendent(tarArchiveEntry25);
        boolean boolean28 = tarArchiveEntry13.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "108) test3713(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "52) test3713(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        java.lang.String str17 = tarArchiveEntry10.getName();
        int int18 = tarArchiveEntry10.getUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "109) test3714(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "53) test3714(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ustar " + "'", str17, "ustar ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 10);
        tarArchiveEntry2.setGroupName("");
        boolean boolean5 = tarArchiveEntry2.isSymbolicLink();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (short) 1, 155);
        int int8 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setUserId(10240);
        java.util.Date date11 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry14.setLinkName("tar\000");
        boolean boolean17 = tarArchiveEntry14.isDirectory();
        boolean boolean18 = tarArchiveEntry2.isDescendent(tarArchiveEntry14);
        boolean boolean19 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setGroupId((-1L));
        int int22 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 155 + "'", int8 == 155);
        org.junit.Assert.assertNotNull(date11);
// flaky "110) test3716(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 33188 + "'", int22 == 33188);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setUserName("\000\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry3.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry3.isGlobalPaxHeader();
        boolean boolean12 = tarArchiveEntry3.isCharacterDevice();
        java.lang.String str13 = tarArchiveEntry3.getUserName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\000" + "'", str13, "\000\000");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setGroupId((long) 257);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        int int6 = tarArchiveEntry2.getDevMinor();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry10.setMode((int) '#');
        tarArchiveEntry10.setModTime((long) 155);
        tarArchiveEntry10.setGroupId(3);
        boolean boolean17 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        int int10 = tarArchiveEntry2.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertNotNull(date3);
// flaky "111) test3720(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        boolean boolean3 = tarArchiveEntry2.isDirectory();
        boolean boolean4 = tarArchiveEntry2.isGNULongNameEntry();
        int int5 = tarArchiveEntry2.getDevMajor();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setLinkName("ustar ");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setDevMinor((int) (byte) 10);
        boolean boolean10 = tarArchiveEntry2.isStarSparse();
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
        org.junit.Assert.assertNotNull(date3);
// flaky "112) test3722(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(date23);
// flaky "54) test3722(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(date29);
// flaky "18) test3722(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date29.toString(), "Mon Sep 28 13:40:47 ICT 2026");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        int int10 = tarArchiveEntry2.getDevMinor();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        byte[] byteArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        long long25 = tarArchiveEntry15.getLongUserId();
        boolean boolean26 = tarArchiveEntry15.isBlockDevice();
        org.junit.Assert.assertNotNull(date3);
// flaky "113) test3724(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        int int10 = tarArchiveEntry2.getDevMinor();
        boolean boolean11 = tarArchiveEntry2.isFIFO();
        int int12 = tarArchiveEntry2.getUserId();
        tarArchiveEntry2.setUserId(8);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap15);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", (byte) 10);
        boolean boolean3 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        tarArchiveEntry10.setDevMinor(12);
        java.lang.String str17 = tarArchiveEntry10.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "114) test3727(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "55) test3727(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(date11);
// flaky "115) test3728(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        int int14 = tarArchiveEntry2.getGroupId();
        java.lang.String str15 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "116) test3729(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "56) test3729(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setIds((int) (byte) 50, (int) (short) 0);
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "117) test3730(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isGNULongLinkEntry();
        tarArchiveEntry3.setDevMajor((int) (byte) 53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        long long18 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "118) test3732(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "57) test3732(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 49, false);
        boolean boolean4 = tarArchiveEntry3.isGlobalPaxHeader();
        boolean boolean5 = tarArchiveEntry3.isGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setLinkName("\000\000");
        long long12 = tarArchiveEntry2.getSize();
        java.lang.String str13 = tarArchiveEntry2.getLinkName();
        boolean boolean14 = tarArchiveEntry2.isFile();
        java.lang.String str15 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 504L + "'", long12 == 504L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\000" + "'", str13, "\000\000");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ustar " + "'", str15, "ustar ");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        java.lang.String str31 = tarArchiveEntry3.getUserName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date8);
// flaky "119) test3735(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(date24);
// flaky "58) test3735(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date25);
// flaky "19) test3735(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 33188 + "'", int26 == 33188);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        int int12 = tarArchiveEntry2.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean17 = tarArchiveEntry16.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean21 = tarArchiveEntry20.isGlobalPaxHeader();
        java.lang.String str22 = tarArchiveEntry20.getUserName();
        boolean boolean23 = tarArchiveEntry16.isDescendent(tarArchiveEntry20);
        boolean boolean24 = tarArchiveEntry2.equals(tarArchiveEntry16);
        boolean boolean25 = tarArchiveEntry2.isPaxHeader();
        byte[] byteArray29 = new byte[] { (byte) 49, (byte) 75, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "120) test3736(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "59) test3736(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 49, (byte) 75, (byte) 54 });
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
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
        boolean boolean17 = tarArchiveEntry10.isGNUSparse();
        tarArchiveEntry10.setGroupName("00");
        tarArchiveEntry10.setGroupId(504);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "121) test3737(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "60) test3737(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        java.io.File file11 = tarArchiveEntry2.getFile();
        boolean boolean12 = tarArchiveEntry2.isFile();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 54, (byte) 54, (byte) 52, (byte) 49 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 54, (byte) 54, (byte) 52, (byte) 49 });
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isGNUSparse();
        tarArchiveEntry3.setUserId((long) (byte) 50);
        boolean boolean8 = tarArchiveEntry3.isExtended();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        long long5 = tarArchiveEntry2.getRealSize();
        tarArchiveEntry2.setLinkName("0\000");
        tarArchiveEntry2.setNames("ustar\000", " \000");
        org.junit.Assert.assertNotNull(date3);
// flaky "122) test3740(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        boolean boolean18 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean7 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean8 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId(10L);
        tarArchiveEntry2.setMode(12);
        tarArchiveEntry2.setDevMinor(1);
        byte[] byteArray18 = new byte[] { (byte) 52, (byte) 76, (byte) 49, (byte) 52, (byte) 83, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
// flaky "123) test3743(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        int int15 = tarArchiveEntry2.getDevMajor();
        boolean boolean16 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "124) test3744(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "61) test3744(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        long long5 = tarArchiveEntry3.getRealSize();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setIds((int) 'a', (int) (byte) 54);
        tarArchiveEntry3.setLinkName("tar\000");
        byte[] byteArray18 = new byte[] { (byte) 54, (byte) 50, (byte) 52, (byte) 0, (byte) -1, (byte) 53 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray18, zipEncoding19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 54, (byte) 50, (byte) 52, (byte) 0, (byte) -1, (byte) 53 });
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 1, false);
        boolean boolean4 = tarArchiveEntry3.isPaxGNUSparse();
        long long5 = tarArchiveEntry3.getLongGroupId();
        java.util.Date date6 = tarArchiveEntry3.getModTime();
        java.lang.String str7 = tarArchiveEntry3.getGroupName();
        java.util.Date date8 = tarArchiveEntry3.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(date6);
// flaky "125) test3746(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(date8);
// flaky "62) test3746(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:47 ICT 2026");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean25 = tarArchiveEntry24.isGlobalPaxHeader();
        boolean boolean26 = tarArchiveEntry24.isFile();
        boolean boolean27 = tarArchiveEntry24.isDirectory();
        tarArchiveEntry24.setSize((long) 504);
        boolean boolean30 = tarArchiveEntry24.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry33 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean34 = tarArchiveEntry33.isGlobalPaxHeader();
        boolean boolean35 = tarArchiveEntry33.isFile();
        java.util.Date date36 = tarArchiveEntry33.getModTime();
        java.util.Date date37 = tarArchiveEntry33.getModTime();
        int int38 = tarArchiveEntry33.getMode();
        boolean boolean39 = tarArchiveEntry24.equals(tarArchiveEntry33);
        boolean boolean40 = tarArchiveEntry33.isBlockDevice();
        boolean boolean41 = tarArchiveEntry33.isSymbolicLink();
        boolean boolean42 = tarArchiveEntry33.isCharacterDevice();
        boolean boolean43 = tarArchiveEntry13.equals(tarArchiveEntry33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "126) test3748(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "63) test3748(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(date36);
// flaky "20) test3748(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date36.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date37);
// flaky "6) test3748(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date37.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 33188 + "'", int38 == 33188);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        java.lang.String str15 = tarArchiveEntry2.getName();
        boolean boolean16 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ustar " + "'", str15, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray40 = tarArchiveEntry35.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry43 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        long long44 = tarArchiveEntry43.getSize();
        tarArchiveEntry43.setDevMajor(1000);
        boolean boolean47 = tarArchiveEntry35.isDescendent(tarArchiveEntry43);
        boolean boolean48 = tarArchiveEntry10.isDescendent(tarArchiveEntry35);
        tarArchiveEntry10.setIds((int) (byte) 120, (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(date30);
// flaky "127) test3750(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date31);
// flaky "64) test3750(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray40);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray40, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean6 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long10 = tarArchiveEntry9.getSize();
        tarArchiveEntry9.setUserId((int) (byte) 10);
        boolean boolean13 = tarArchiveEntry9.isGlobalPaxHeader();
        tarArchiveEntry9.setGroupId((long) (byte) 10);
        boolean boolean16 = tarArchiveEntry9.isBlockDevice();
        tarArchiveEntry9.setUserId(100L);
        boolean boolean19 = tarArchiveEntry9.isSymbolicLink();
        boolean boolean20 = tarArchiveEntry9.isOldGNUSparse();
        boolean boolean21 = tarArchiveEntry9.isFIFO();
        boolean boolean22 = tarArchiveEntry9.isOldGNUSparse();
        long long23 = tarArchiveEntry9.getLongGroupId();
        boolean boolean24 = tarArchiveEntry9.isCheckSumOK();
        boolean boolean25 = tarArchiveEntry2.equals(tarArchiveEntry9);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry9.fillGNUSparse0xData(strMap26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "128) test3751(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        boolean boolean15 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertNotNull(date3);
// flaky "129) test3752(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33188 + "'", int10 == 33188);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        java.util.Date date16 = tarArchiveEntry10.getLastModifiedDate();
        boolean boolean17 = tarArchiveEntry10.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "130) test3753(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "65) test3753(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date16);
// flaky "21) test3753(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date16.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", (byte) 51);
        tarArchiveEntry2.setUserId(4);
        boolean boolean5 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        boolean boolean3 = tarArchiveEntry1.isFIFO();
        boolean boolean4 = tarArchiveEntry1.isStarSparse();
        long long5 = tarArchiveEntry1.getRealSize();
        tarArchiveEntry1.setName(" \000");
        java.io.File file8 = tarArchiveEntry1.getFile();
        int int9 = tarArchiveEntry1.getGroupId();
        tarArchiveEntry1.setName("hi!");
        org.junit.Assert.assertNotNull(date2);
// flaky "131) test3755(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setLinkName("\000\000");
        boolean boolean12 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setDevMinor(3);
        long long15 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 504L + "'", long15 == 504L);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 53, true);
        tarArchiveEntry3.setNames("hi!", "ustar ");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        tarArchiveEntry10.setUserName("././@LongLink");
        long long17 = tarArchiveEntry10.getSize();
        java.lang.String str18 = tarArchiveEntry10.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "132) test3758(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "66) test3758(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ustar " + "'", str18, "ustar ");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
        int int33 = tarArchiveEntry9.getDevMinor();
        tarArchiveEntry9.setModTime((long) 2);
        tarArchiveEntry9.setDevMajor(10240);
        tarArchiveEntry9.setSize((long) ' ');
        boolean boolean40 = tarArchiveEntry9.isBlockDevice();
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
// flaky "133) test3759(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        tarArchiveEntry11.setUserName("ustar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry26 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 120, false);
        tarArchiveEntry26.setNames("", "ustar ");
        boolean boolean30 = tarArchiveEntry11.equals(tarArchiveEntry26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
// flaky "134) test3760(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "67) test3760(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        tarArchiveEntry2.setGroupName("");
        tarArchiveEntry2.setUserId((long) 12);
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
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean5 = tarArchiveEntry2.isOldGNUSparse();
        long long6 = tarArchiveEntry2.getLongGroupId();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        boolean boolean9 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertNotNull(date3);
// flaky "135) test3762(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        boolean boolean12 = tarArchiveEntry9.isDirectory();
        tarArchiveEntry9.setSize((long) 504);
        boolean boolean15 = tarArchiveEntry9.isSparse();
        boolean boolean16 = tarArchiveEntry9.isPaxHeader();
        boolean boolean17 = tarArchiveEntry2.isDescendent(tarArchiveEntry9);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date21 = tarArchiveEntry20.getLastModifiedDate();
        boolean boolean22 = tarArchiveEntry20.isCheckSumOK();
        tarArchiveEntry20.setGroupId(4);
        boolean boolean25 = tarArchiveEntry2.isDescendent(tarArchiveEntry20);
        tarArchiveEntry2.setNames("\000\000", "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date21);
// flaky "136) test3763(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        tarArchiveEntry2.setGroupName("");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        int int9 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setGroupId((long) 52);
        long long12 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        int int9 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setDevMajor((int) (byte) 88);
        boolean boolean12 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setGroupName("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "137) test3765(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        int int11 = tarArchiveEntry2.getDevMajor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        boolean boolean18 = tarArchiveEntry14.isGlobalPaxHeader();
        tarArchiveEntry14.setGroupId((long) (byte) 10);
        boolean boolean21 = tarArchiveEntry14.isBlockDevice();
        tarArchiveEntry14.setUserId(100L);
        boolean boolean24 = tarArchiveEntry14.isSymbolicLink();
        boolean boolean25 = tarArchiveEntry14.isOldGNUSparse();
        boolean boolean26 = tarArchiveEntry14.isFIFO();
        boolean boolean27 = tarArchiveEntry14.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry30 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry30.setMode((int) '#');
        tarArchiveEntry30.setModTime((long) 155);
        tarArchiveEntry30.setGroupId(3);
        boolean boolean37 = tarArchiveEntry14.equals(tarArchiveEntry30);
        boolean boolean38 = tarArchiveEntry2.isDescendent(tarArchiveEntry14);
        tarArchiveEntry2.setUserId(0);
        boolean boolean41 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.lang.String str7 = tarArchiveEntry2.getGroupName();
        int int8 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "138) test3767(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "68) test3767(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        java.lang.String str10 = tarArchiveEntry2.getName();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setGroupId((int) '#');
        boolean boolean14 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str15 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        tarArchiveEntry2.setSize((long) (byte) 10);
        boolean boolean8 = tarArchiveEntry2.isOldGNUSparse();
        long long9 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setName("tar\000");
        tarArchiveEntry2.setUserId(0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getGroupName();
        tarArchiveEntry3.setSize(97L);
        long long9 = tarArchiveEntry3.getRealSize();
        boolean boolean10 = tarArchiveEntry3.isOldGNUSparse();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
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
        byte[] byteArray15 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.parseTarHeader(byteArray15, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "139) test3771(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "69) test3771(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        java.util.Date date45 = tarArchiveEntry19.getLastModifiedDate();
        boolean boolean46 = tarArchiveEntry19.isExtended();
        org.junit.Assert.assertNotNull(date3);
// flaky "140) test3772(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "70) test3772(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "22) test3772(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:47 ICT 2026");
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
// flaky "7) test3772(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date41);
// flaky "3) test3772(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(date45);
// flaky "2) test3772(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date45.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 54, true);
        tarArchiveEntry3.setMode((int) (byte) 0);
        tarArchiveEntry3.setUserId(3);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000");
        tarArchiveEntry1.setDevMajor((int) (byte) 48);
        boolean boolean4 = tarArchiveEntry1.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getName();
        tarArchiveEntry3.setName("");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long12 = tarArchiveEntry11.getSize();
        tarArchiveEntry11.setUserId((int) (byte) 10);
        boolean boolean15 = tarArchiveEntry11.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry11.isGNULongNameEntry();
        long long17 = tarArchiveEntry11.getLongGroupId();
        boolean boolean18 = tarArchiveEntry11.isDirectory();
        int int19 = tarArchiveEntry11.getDevMinor();
        boolean boolean20 = tarArchiveEntry11.isFIFO();
        java.util.Date date21 = tarArchiveEntry11.getModTime();
        boolean boolean22 = tarArchiveEntry3.equals(tarArchiveEntry11);
        long long23 = tarArchiveEntry11.getRealSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar\000" + "'", str6, "ustar\000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky "141) test3775(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        java.lang.String str12 = tarArchiveEntry2.getGroupName();
        boolean boolean13 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "142) test3776(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupId((-1L));
        java.util.Date date9 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        boolean boolean11 = tarArchiveEntry2.isFile();
        boolean boolean12 = tarArchiveEntry2.isFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str17 = tarArchiveEntry16.getLinkName();
        long long18 = tarArchiveEntry16.getRealSize();
        boolean boolean19 = tarArchiveEntry16.isStarSparse();
        tarArchiveEntry16.setIds((int) 'a', (int) (byte) 54);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date26 = tarArchiveEntry25.getLastModifiedDate();
        boolean boolean27 = tarArchiveEntry25.isCharacterDevice();
        tarArchiveEntry25.setUserName("hi!");
        tarArchiveEntry25.setGroupName("");
        java.util.Date date32 = tarArchiveEntry25.getModTime();
        tarArchiveEntry16.setModTime(date32);
        tarArchiveEntry2.setModTime(date32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "143) test3777(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date10);
// flaky "71) test3777(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date26);
// flaky "23) test3777(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date32);
// flaky "8) test3777(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date32.toString(), "Mon Sep 28 13:40:47 ICT 2026");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        java.lang.String str7 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date23 = tarArchiveEntry22.getLastModifiedDate();
        boolean boolean24 = tarArchiveEntry22.isCharacterDevice();
        tarArchiveEntry22.setUserName("hi!");
        tarArchiveEntry22.setGroupName("");
        java.util.Date date29 = tarArchiveEntry22.getModTime();
        boolean boolean30 = tarArchiveEntry22.isGNULongLinkEntry();
        boolean boolean31 = tarArchiveEntry22.isPaxHeader();
        java.util.Date date32 = tarArchiveEntry22.getLastModifiedDate();
        boolean boolean33 = tarArchiveEntry22.isGNULongLinkEntry();
        java.lang.String str34 = tarArchiveEntry22.getLinkName();
        int int35 = tarArchiveEntry22.getDevMajor();
        tarArchiveEntry22.setUserName("\000\000");
        tarArchiveEntry22.setSize((long) 257);
        tarArchiveEntry22.setMode(31);
        boolean boolean42 = tarArchiveEntry6.isDescendent(tarArchiveEntry22);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(date23);
// flaky "144) test3779(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(date29);
// flaky "72) test3779(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date29.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date32);
// flaky "24) test3779(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date32.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
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
        boolean boolean18 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "145) test3780(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "73) test3780(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setUserId((int) (byte) 1);
        tarArchiveEntry2.setGroupId((long) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean14 = tarArchiveEntry13.isGlobalPaxHeader();
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str21 = tarArchiveEntry20.getLinkName();
        java.util.Date date22 = tarArchiveEntry20.getLastModifiedDate();
        long long23 = tarArchiveEntry20.getLongGroupId();
        boolean boolean24 = tarArchiveEntry13.equals(tarArchiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean28 = tarArchiveEntry27.isGlobalPaxHeader();
        boolean boolean29 = tarArchiveEntry27.isFile();
        boolean boolean30 = tarArchiveEntry27.isDirectory();
        tarArchiveEntry27.setSize((long) 504);
        long long33 = tarArchiveEntry27.getSize();
        boolean boolean34 = tarArchiveEntry27.isLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry37 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date38 = tarArchiveEntry37.getLastModifiedDate();
        boolean boolean39 = tarArchiveEntry37.isCharacterDevice();
        tarArchiveEntry37.setUserName("hi!");
        tarArchiveEntry37.setGroupName("");
        java.util.Date date44 = tarArchiveEntry37.getModTime();
        boolean boolean45 = tarArchiveEntry37.isGNULongLinkEntry();
        boolean boolean46 = tarArchiveEntry37.isPaxHeader();
        java.util.Date date47 = tarArchiveEntry37.getLastModifiedDate();
        tarArchiveEntry27.setModTime(date47);
        tarArchiveEntry20.setModTime(date47);
        tarArchiveEntry2.setModTime(date47);
        java.io.File file51 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(date22);
// flaky "146) test3781(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 504L + "'", long33 == 504L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date38);
// flaky "74) test3781(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date38.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(date44);
// flaky "25) test3781(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date44.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(date47);
// flaky "9) test3781(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date47.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNull(file51);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setName("");
        boolean boolean12 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setDevMajor(4);
        java.lang.String str15 = tarArchiveEntry2.getName();
        int int16 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertNotNull(date9);
// flaky "147) test3782(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
        int int13 = tarArchiveEntry2.getMode();
        java.lang.String str14 = tarArchiveEntry2.getName();
        org.junit.Assert.assertNotNull(date3);
// flaky "148) test3783(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33188 + "'", int13 == 33188);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ustar " + "'", str14, "ustar ");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        tarArchiveEntry2.setIds(504, 148);
        java.lang.Class<?> wildcardClass21 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "149) test3784(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "75) test3784(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setLinkName("ustar ");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setName("");
        java.io.File file11 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setNames("\000\000", "\000\000");
        tarArchiveEntry2.setUserName("00");
        org.junit.Assert.assertNotNull(date3);
// flaky "150) test3785(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", (byte) 55, false);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setMode((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFIFO();
        boolean boolean7 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        boolean boolean10 = tarArchiveEntry2.isGNULongNameEntry();
        java.util.Date date11 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Date date12 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
// flaky "151) test3788(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "76) test3788(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:47 ICT 2026");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setName("ustar ");
        tarArchiveEntry2.setUserId((long) 96);
        tarArchiveEntry2.setGroupId((int) (byte) 48);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
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
        java.lang.Class<?> wildcardClass23 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky "152) test3790(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isFile();
        boolean boolean6 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setUserId(33188L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", (byte) 100, true);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        tarArchiveEntry1.setName(" \000");
        tarArchiveEntry1.setGroupName(" \000");
        int int6 = tarArchiveEntry1.getGroupId();
        java.util.Date date7 = tarArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky "153) test3793(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date7.toString(), "Mon Sep 28 13:40:47 ICT 2026");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        long long5 = tarArchiveEntry3.getLongGroupId();
        boolean boolean6 = tarArchiveEntry3.isGNUSparse();
        tarArchiveEntry3.setModTime((long) '#');
        long long9 = tarArchiveEntry3.getLongGroupId();
        tarArchiveEntry3.setGroupId((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        int int6 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setDevMinor((int) (byte) 10);
        tarArchiveEntry2.setLinkName("");
        java.lang.String str11 = tarArchiveEntry2.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        boolean boolean17 = tarArchiveEntry14.isDirectory();
        tarArchiveEntry14.setSize((long) 504);
        long long20 = tarArchiveEntry14.getSize();
        boolean boolean21 = tarArchiveEntry14.isLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date25 = tarArchiveEntry24.getLastModifiedDate();
        boolean boolean26 = tarArchiveEntry24.isCharacterDevice();
        tarArchiveEntry24.setUserName("hi!");
        tarArchiveEntry24.setGroupName("");
        java.util.Date date31 = tarArchiveEntry24.getModTime();
        boolean boolean32 = tarArchiveEntry24.isGNULongLinkEntry();
        boolean boolean33 = tarArchiveEntry24.isPaxHeader();
        java.util.Date date34 = tarArchiveEntry24.getLastModifiedDate();
        tarArchiveEntry14.setModTime(date34);
        boolean boolean36 = tarArchiveEntry14.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry39 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long40 = tarArchiveEntry39.getSize();
        tarArchiveEntry39.setUserId((int) (byte) 10);
        boolean boolean43 = tarArchiveEntry39.isGlobalPaxHeader();
        tarArchiveEntry39.setGroupId((long) (byte) 10);
        boolean boolean46 = tarArchiveEntry39.isBlockDevice();
        tarArchiveEntry39.setUserId(100L);
        boolean boolean49 = tarArchiveEntry39.isFIFO();
        tarArchiveEntry39.setName("00");
        boolean boolean52 = tarArchiveEntry39.isGNULongNameEntry();
        boolean boolean53 = tarArchiveEntry14.isDescendent(tarArchiveEntry39);
        boolean boolean54 = tarArchiveEntry14.isGNULongNameEntry();
        boolean boolean55 = tarArchiveEntry2.equals(tarArchiveEntry14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 504L + "'", long20 == 504L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date25);
// flaky "154) test3795(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date31);
// flaky "77) test3795(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date34);
// flaky "26) test3795(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date34.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserId(148);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        boolean boolean12 = tarArchiveEntry9.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str17 = tarArchiveEntry16.getLinkName();
        java.util.Date date18 = tarArchiveEntry16.getLastModifiedDate();
        long long19 = tarArchiveEntry16.getLongGroupId();
        boolean boolean20 = tarArchiveEntry9.equals(tarArchiveEntry16);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean24 = tarArchiveEntry23.isGlobalPaxHeader();
        boolean boolean25 = tarArchiveEntry23.isFile();
        boolean boolean26 = tarArchiveEntry23.isDirectory();
        tarArchiveEntry23.setSize((long) 504);
        long long29 = tarArchiveEntry23.getSize();
        boolean boolean30 = tarArchiveEntry23.isLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry33 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date34 = tarArchiveEntry33.getLastModifiedDate();
        boolean boolean35 = tarArchiveEntry33.isCharacterDevice();
        tarArchiveEntry33.setUserName("hi!");
        tarArchiveEntry33.setGroupName("");
        java.util.Date date40 = tarArchiveEntry33.getModTime();
        boolean boolean41 = tarArchiveEntry33.isGNULongLinkEntry();
        boolean boolean42 = tarArchiveEntry33.isPaxHeader();
        java.util.Date date43 = tarArchiveEntry33.getLastModifiedDate();
        tarArchiveEntry23.setModTime(date43);
        tarArchiveEntry16.setModTime(date43);
        tarArchiveEntry2.setModTime(date43);
        boolean boolean47 = tarArchiveEntry2.isBlockDevice();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
// flaky "155) test3796(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(date18);
// flaky "78) test3796(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 504L + "'", long29 == 504L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date34);
// flaky "27) test3796(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date34.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date40);
// flaky "10) test3796(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(date43);
// flaky "4) test3796(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date43.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        boolean boolean7 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserId((int) '#');
        boolean boolean10 = tarArchiveEntry2.isDirectory();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        int int12 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertNotNull(date5);
// flaky "156) test3797(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
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
        boolean boolean23 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setNames("ustar ", "ustar\000");
        org.junit.Assert.assertNotNull(date3);
// flaky "157) test3798(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(date11);
// flaky "79) test3798(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "28) test3798(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:47 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        int int11 = tarArchiveEntry2.getUserId();
        boolean boolean12 = tarArchiveEntry2.isStarSparse();
        java.lang.String str13 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        boolean boolean9 = tarArchiveEntry7.isFile();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        java.util.Date date11 = tarArchiveEntry7.getModTime();
        java.lang.String str12 = tarArchiveEntry7.getGroupName();
        boolean boolean13 = tarArchiveEntry2.isDescendent(tarArchiveEntry7);
        tarArchiveEntry2.setModTime(8L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "158) test3800(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "80) test3800(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setNames("0\000", "");
        tarArchiveEntry2.setSize((long) 'a');
        boolean boolean16 = tarArchiveEntry2.isGlobalPaxHeader();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setSize((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isLink();
        boolean boolean10 = tarArchiveEntry2.isBlockDevice();
        boolean boolean11 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long26 = tarArchiveEntry25.getSize();
        tarArchiveEntry25.setUserId((int) (byte) 10);
        boolean boolean29 = tarArchiveEntry25.isGlobalPaxHeader();
        tarArchiveEntry25.setGroupId((long) (byte) 10);
        boolean boolean32 = tarArchiveEntry25.isBlockDevice();
        tarArchiveEntry25.setLinkName("0\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry37 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry37.setMode((int) '#');
        java.util.Date date40 = tarArchiveEntry37.getModTime();
        tarArchiveEntry25.setModTime(date40);
        boolean boolean42 = tarArchiveEntry11.equals(tarArchiveEntry25);
        tarArchiveEntry11.setDevMajor(1);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date40);
// flaky "159) test3803(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setModTime((long) (byte) 75);
        int int14 = tarArchiveEntry10.getDevMajor();
        int int15 = tarArchiveEntry10.getUserId();
        boolean boolean16 = tarArchiveEntry10.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "160) test3804(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "81) test3804(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setGroupId((int) (byte) 1);
        int int11 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setGroupName("");
        int int14 = tarArchiveEntry2.getUserId();
        tarArchiveEntry2.setDevMinor((int) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        boolean boolean9 = tarArchiveEntry7.isFile();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        java.util.Date date11 = tarArchiveEntry7.getModTime();
        java.lang.String str12 = tarArchiveEntry7.getGroupName();
        boolean boolean13 = tarArchiveEntry2.isDescendent(tarArchiveEntry7);
        boolean boolean14 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setMode(257);
        byte[] byteArray18 = new byte[] { (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray18, zipEncoding19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "161) test3806(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "82) test3806(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100 });
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        int int5 = tarArchiveEntry3.getGroupId();
        int int6 = tarArchiveEntry3.getMode();
        boolean boolean7 = tarArchiveEntry3.isPaxGNUSparse();
        tarArchiveEntry3.setNames("\000\000", "\000\000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33188 + "'", int6 == 33188);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        boolean boolean10 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean11 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setUserId(75);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
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
        int int13 = tarArchiveEntry2.getDevMajor();
        tarArchiveEntry2.setModTime((long) (byte) 48);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "162) test3809(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "83) test3809(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setMode(1000);
        long long14 = tarArchiveEntry2.getSize();
        boolean boolean15 = tarArchiveEntry2.isSparse();
        byte[] byteArray19 = new byte[] { (byte) 51, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 51, (byte) 100, (byte) 1 });
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        boolean boolean16 = tarArchiveEntry2.isFIFO();
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
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, false);
        java.lang.String str4 = tarArchiveEntry3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tar\000" + "'", str4, "tar\000");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
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
        byte[] byteArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray18);
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
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
        byte[] byteArray66 = new byte[] { (byte) 55, (byte) 100, (byte) 53, (byte) 52 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.parseTarHeader(byteArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "163) test3815(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "84) test3815(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(date27);
// flaky "29) test3815(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:48 ICT 2026");
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
// flaky "11) test3815(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date53.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date54);
// flaky "5) test3815(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date54.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 55, (byte) 100, (byte) 53, (byte) 52 });
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("0\000");
        boolean boolean12 = tarArchiveEntry2.isExtended();
        boolean boolean13 = tarArchiveEntry2.isBlockDevice();
        long long14 = tarArchiveEntry2.getRealSize();
        byte[] byteArray19 = new byte[] { (byte) 51, (byte) 103, (byte) 120, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 51, (byte) 103, (byte) 120, (byte) 10 });
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 0, false);
        int int4 = tarArchiveEntry3.getUserId();
        tarArchiveEntry3.setName("tar\000");
        java.util.Date date7 = tarArchiveEntry3.getLastModifiedDate();
        boolean boolean8 = tarArchiveEntry3.isLink();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky "164) test3817(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date7.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
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
        boolean boolean20 = tarArchiveEntry11.isSymbolicLink();
        java.lang.Class<?> wildcardClass21 = tarArchiveEntry11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
// flaky "165) test3818(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "85) test3818(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        tarArchiveEntry20.setMode((int) (short) 1);
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
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        tarArchiveEntry3.setModTime(date9);
        boolean boolean11 = tarArchiveEntry3.isOldGNUSparse();
        boolean boolean12 = tarArchiveEntry3.isPaxGNUSparse();
        boolean boolean13 = tarArchiveEntry3.isGlobalPaxHeader();
        boolean boolean14 = tarArchiveEntry3.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long18 = tarArchiveEntry17.getSize();
        tarArchiveEntry17.setUserId((int) (byte) 10);
        boolean boolean21 = tarArchiveEntry17.isGlobalPaxHeader();
        tarArchiveEntry17.setGroupId((long) (byte) 10);
        boolean boolean24 = tarArchiveEntry17.isCheckSumOK();
        boolean boolean25 = tarArchiveEntry3.isDescendent(tarArchiveEntry17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "166) test3820(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertNotNull(date3);
// flaky "167) test3821(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "86) test3821(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        int int10 = tarArchiveEntry2.getDevMinor();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        int int12 = tarArchiveEntry2.getDevMajor();
        boolean boolean13 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
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
        boolean boolean15 = tarArchiveEntry10.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "168) test3823(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "87) test3823(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        boolean boolean7 = tarArchiveEntry2.isSparse();
        long long8 = tarArchiveEntry2.getRealSize();
        java.lang.String str9 = tarArchiveEntry2.getName();
        java.util.Date date10 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertNotNull(date10);
// flaky "169) test3824(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:48 ICT 2026");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 52);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        java.util.Date date18 = tarArchiveEntry14.getModTime();
        tarArchiveEntry14.setUserId((long) '#');
        boolean boolean21 = tarArchiveEntry14.isGNULongNameEntry();
        tarArchiveEntry14.setNames(" \000", " \000");
        java.util.Date date25 = tarArchiveEntry14.getModTime();
        tarArchiveEntry14.setMode((int) (byte) 1);
        boolean boolean28 = tarArchiveEntry2.equals(tarArchiveEntry14);
        tarArchiveEntry14.setUserId((int) (byte) -1);
        tarArchiveEntry14.setMode(31);
        tarArchiveEntry14.setMode((int) (byte) 51);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "170) test3826(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "88) test3826(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "30) test3826(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "12) test3826(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date25);
// flaky "6) test3826(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean21 = tarArchiveEntry20.isGlobalPaxHeader();
        boolean boolean22 = tarArchiveEntry20.isFile();
        java.lang.String str23 = tarArchiveEntry20.getName();
        tarArchiveEntry20.setLinkName("00");
        long long26 = tarArchiveEntry20.getLongUserId();
        tarArchiveEntry20.setDevMajor(155);
        int int29 = tarArchiveEntry20.getMode();
        java.util.Date date30 = tarArchiveEntry20.getLastModifiedDate();
        tarArchiveEntry2.setModTime(date30);
        boolean boolean32 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ustar " + "'", str23, "ustar ");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 33188 + "'", int29 == 33188);
        org.junit.Assert.assertNotNull(date30);
// flaky "171) test3827(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        boolean boolean9 = tarArchiveEntry2.isFIFO();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean12 = tarArchiveEntry2.isStarSparse();
        long long13 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 504L + "'", long13 == 504L);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
        int int21 = tarArchiveEntry5.getDevMinor();
        long long22 = tarArchiveEntry5.getLongUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray23 = tarArchiveEntry5.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray13);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray13, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(date17);
// flaky "172) test3829(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray23);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray23, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
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
        boolean boolean30 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setName("");
        boolean boolean33 = tarArchiveEntry2.isPaxHeader();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        int int15 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setLinkName("ustar ");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNUSparse();
        long long9 = tarArchiveEntry2.getLongGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long13 = tarArchiveEntry12.getSize();
        tarArchiveEntry12.setUserId((int) (byte) 10);
        boolean boolean16 = tarArchiveEntry12.isGlobalPaxHeader();
        tarArchiveEntry12.setGroupId((long) (byte) 10);
        boolean boolean19 = tarArchiveEntry12.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray20 = tarArchiveEntry12.getDirectoryEntries();
        tarArchiveEntry12.setModTime(0L);
        boolean boolean23 = tarArchiveEntry12.isStarSparse();
        int int24 = tarArchiveEntry12.getDevMajor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry27.setLinkName("tar\000");
        boolean boolean30 = tarArchiveEntry27.isDirectory();
        boolean boolean31 = tarArchiveEntry27.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry34 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean35 = tarArchiveEntry34.isGlobalPaxHeader();
        boolean boolean36 = tarArchiveEntry34.isFile();
        boolean boolean37 = tarArchiveEntry34.isDirectory();
        tarArchiveEntry34.setSize((long) 504);
        boolean boolean40 = tarArchiveEntry34.isSparse();
        boolean boolean41 = tarArchiveEntry34.isPaxHeader();
        boolean boolean42 = tarArchiveEntry27.isDescendent(tarArchiveEntry34);
        boolean boolean43 = tarArchiveEntry12.isDescendent(tarArchiveEntry27);
        boolean boolean44 = tarArchiveEntry12.isGlobalPaxHeader();
        boolean boolean45 = tarArchiveEntry12.isGNUSparse();
        boolean boolean46 = tarArchiveEntry12.isPaxHeader();
        boolean boolean47 = tarArchiveEntry12.isGNULongLinkEntry();
        boolean boolean48 = tarArchiveEntry2.equals((java.lang.Object) boolean47);
        org.junit.Assert.assertNotNull(date3);
// flaky "173) test3832(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray20);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray20, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isFIFO();
        java.lang.String str13 = tarArchiveEntry2.getName();
        boolean boolean14 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean15 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ustar " + "'", str13, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        int int4 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        boolean boolean14 = tarArchiveEntry10.isLink();
        boolean boolean15 = tarArchiveEntry10.isLink();
        tarArchiveEntry10.setNames("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "174) test3835(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "89) test3835(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
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
        java.util.Date date45 = tarArchiveEntry19.getLastModifiedDate();
        tarArchiveEntry19.setNames("00", "ustar ");
        org.junit.Assert.assertNotNull(date3);
// flaky "175) test3836(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "90) test3836(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "31) test3836(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
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
// flaky "13) test3836(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date31.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date41);
// flaky "7) test3836(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(date45);
// flaky "3) test3836(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date45.toString(), "Mon Sep 28 13:40:48 ICT 2026");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        long long6 = tarArchiveEntry2.getLongGroupId();
        long long7 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setUserId(263);
        org.junit.Assert.assertNotNull(date3);
// flaky "176) test3837(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        int int6 = tarArchiveEntry2.getDevMinor();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray8 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str9 = tarArchiveEntry2.getGroupName();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray8);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray8, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isSymbolicLink();
        java.util.Date date13 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean14 = tarArchiveEntry2.isBlockDevice();
        long long15 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "177) test3839(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        byte[] byteArray4 = new byte[] { (byte) 83, (byte) 50, (byte) 50, (byte) 48 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 83, (byte) 50, (byte) 50, (byte) 48 });
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean23 = tarArchiveEntry22.isGlobalPaxHeader();
        boolean boolean24 = tarArchiveEntry22.isFile();
        java.util.Date date25 = tarArchiveEntry22.getModTime();
        java.util.Date date26 = tarArchiveEntry22.getModTime();
        tarArchiveEntry22.setUserId((long) '#');
        boolean boolean29 = tarArchiveEntry22.isCheckSumOK();
        boolean boolean30 = tarArchiveEntry22.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry33 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean34 = tarArchiveEntry33.isGlobalPaxHeader();
        boolean boolean35 = tarArchiveEntry33.isFile();
        boolean boolean36 = tarArchiveEntry33.isPaxGNUSparse();
        java.io.File file37 = tarArchiveEntry33.getFile();
        boolean boolean38 = tarArchiveEntry33.isPaxGNUSparse();
        boolean boolean39 = tarArchiveEntry22.isDescendent(tarArchiveEntry33);
        boolean boolean40 = tarArchiveEntry22.isSymbolicLink();
        boolean boolean41 = tarArchiveEntry10.equals(tarArchiveEntry22);
        byte[] byteArray42 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.writeEntryHeader(byteArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "178) test3841(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "91) test3841(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(date25);
// flaky "32) test3841(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date25.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date26);
// flaky "14) test3841(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
        boolean boolean34 = tarArchiveEntry11.isGlobalPaxHeader();
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
// flaky "179) test3842(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 83);
        boolean boolean3 = tarArchiveEntry2.isStarSparse();
        int int4 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertNotNull(date3);
// flaky "180) test3844(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        tarArchiveEntry2.setGroupName("\000\000");
        int int19 = tarArchiveEntry2.getUserId();
        int int20 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setMode(504);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33188 + "'", int20 == 33188);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
        java.util.Date date18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setModTime(date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "181) test3846(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        boolean boolean4 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setGroupName("tar\000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
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
        long long21 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setUserName("ustar\000");
        org.junit.Assert.assertNotNull(date3);
// flaky "182) test3848(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "92) test3848(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "33) test3848(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
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
        boolean boolean15 = tarArchiveEntry13.isFile();
        boolean boolean16 = tarArchiveEntry13.isDirectory();
        tarArchiveEntry13.setSize((long) 504);
        java.lang.String str19 = tarArchiveEntry13.getName();
        boolean boolean20 = tarArchiveEntry13.isExtended();
        tarArchiveEntry13.setLinkName("\000\000");
        boolean boolean23 = tarArchiveEntry13.isDirectory();
        tarArchiveEntry13.setDevMinor(3);
        boolean boolean26 = tarArchiveEntry2.equals(tarArchiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long30 = tarArchiveEntry29.getSize();
        tarArchiveEntry29.setUserId((int) (byte) 10);
        boolean boolean33 = tarArchiveEntry29.isCheckSumOK();
        boolean boolean34 = tarArchiveEntry2.equals((java.lang.Object) tarArchiveEntry29);
        tarArchiveEntry2.setDevMajor((int) (byte) 1);
        org.junit.Assert.assertNotNull(date3);
// flaky "183) test3849(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ustar " + "'", str19, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("");
        tarArchiveEntry1.setGroupName("././@LongLink");
        boolean boolean4 = tarArchiveEntry1.isPaxGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long8 = tarArchiveEntry7.getSize();
        tarArchiveEntry7.setUserId((int) (byte) 10);
        boolean boolean11 = tarArchiveEntry7.isGlobalPaxHeader();
        tarArchiveEntry7.setGroupId((long) (byte) 10);
        boolean boolean14 = tarArchiveEntry7.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray15 = tarArchiveEntry7.getDirectoryEntries();
        java.lang.String str16 = tarArchiveEntry7.getLinkName();
        tarArchiveEntry7.setGroupId(35L);
        int int19 = tarArchiveEntry7.getDevMajor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date24 = tarArchiveEntry23.getLastModifiedDate();
        tarArchiveEntry23.setDevMajor((int) (byte) 0);
        boolean boolean27 = tarArchiveEntry21.equals((java.lang.Object) (byte) 0);
        java.util.Date date28 = tarArchiveEntry21.getModTime();
        tarArchiveEntry7.setModTime(date28);
        tarArchiveEntry1.setModTime(date28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray15);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray15, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(date24);
// flaky "184) test3850(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date28);
// flaky "93) test3850(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date28.toString(), "Mon Sep 28 13:40:48 ICT 2026");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setLinkName("ustar ");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setName("././@LongLink");
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setIds((int) '4', 31);
        org.junit.Assert.assertNotNull(date3);
// flaky "185) test3851(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 50, (byte) 0, (byte) 83, (byte) 75, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray27, zipEncoding28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "186) test3852(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "94) test3852(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "34) test3852(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1, (byte) 50, (byte) 0, (byte) 83, (byte) 75, (byte) 100 });
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        boolean boolean19 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean20 = tarArchiveEntry2.isSparse();
        boolean boolean21 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "187) test3853(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "95) test3853(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        int int7 = tarArchiveEntry2.getMode();
        int int8 = tarArchiveEntry2.getMode();
        int int9 = tarArchiveEntry2.getUserId();
        boolean boolean10 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "188) test3854(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
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
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 100, (byte) 55, (byte) 83 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "189) test3855(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 100, (byte) 55, (byte) 83 });
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getUserName();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        int int13 = tarArchiveEntry2.getDevMajor();
        int int14 = tarArchiveEntry2.getUserId();
        int int15 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setGroupId((int) (byte) 54);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
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
        tarArchiveEntry2.setDevMajor(32);
        java.util.Date date22 = tarArchiveEntry2.getModTime();
        byte[] byteArray28 = new byte[] { (byte) 54, (byte) 103, (byte) 49, (byte) 53, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "190) test3857(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "96) test3857(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date22);
// flaky "35) test3857(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 54, (byte) 103, (byte) 49, (byte) 53, (byte) 120 });
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setUserName(" \000");
        tarArchiveEntry2.setDevMinor(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 50, true);
        java.util.Date date4 = tarArchiveEntry3.getModTime();
        boolean boolean5 = tarArchiveEntry3.isStarSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean9 = tarArchiveEntry8.isGlobalPaxHeader();
        boolean boolean10 = tarArchiveEntry8.isFile();
        boolean boolean11 = tarArchiveEntry8.isDirectory();
        tarArchiveEntry8.setSize((long) 504);
        boolean boolean14 = tarArchiveEntry8.isSparse();
        boolean boolean15 = tarArchiveEntry8.isPaxHeader();
        tarArchiveEntry8.setIds(155, 96);
        tarArchiveEntry8.setSize(2097151L);
        tarArchiveEntry8.setIds((int) (byte) 103, (int) (byte) 50);
        boolean boolean24 = tarArchiveEntry3.isDescendent(tarArchiveEntry8);
        long long25 = tarArchiveEntry8.getLongGroupId();
        org.junit.Assert.assertNotNull(date4);
// flaky "191) test3859(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 50L + "'", long25 == 50L);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        tarArchiveEntry10.setNames("00", "00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "192) test3860(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "97) test3860(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setNames("0\000", "");
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isStarSparse();
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        int int12 = tarArchiveEntry2.getMode();
        boolean boolean13 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean14 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        int int10 = tarArchiveEntry2.getGroupId();
        int int11 = tarArchiveEntry2.getGroupId();
        boolean boolean12 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertNotNull(date3);
// flaky "193) test3862(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
        tarArchiveEntry2.setDevMajor(6);
        int int23 = tarArchiveEntry2.getDevMajor();
        int int24 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "194) test3863(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "98) test3863(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
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
        boolean boolean17 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean18 = tarArchiveEntry2.isPaxGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap19);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setModTime((long) 1);
        boolean boolean11 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setUserId((long) (byte) 100);
        boolean boolean14 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (byte) 49, 16877);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        tarArchiveEntry3.setModTime(date9);
        boolean boolean11 = tarArchiveEntry3.isOldGNUSparse();
        boolean boolean12 = tarArchiveEntry3.isPaxGNUSparse();
        boolean boolean13 = tarArchiveEntry3.isGlobalPaxHeader();
        boolean boolean14 = tarArchiveEntry3.isPaxGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long18 = tarArchiveEntry17.getSize();
        tarArchiveEntry17.setUserId((int) (byte) 10);
        long long21 = tarArchiveEntry17.getLongUserId();
        int int22 = tarArchiveEntry17.getMode();
        tarArchiveEntry17.setSize((long) 32);
        int int25 = tarArchiveEntry17.getDevMinor();
        boolean boolean26 = tarArchiveEntry17.isBlockDevice();
        boolean boolean27 = tarArchiveEntry3.equals(tarArchiveEntry17);
        tarArchiveEntry3.setDevMajor(0);
        tarArchiveEntry3.setGroupId(131);
        tarArchiveEntry3.setGroupId((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "195) test3866(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 33188 + "'", int22 == 33188);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        int int10 = tarArchiveEntry2.getDevMajor();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 100);
        long long3 = tarArchiveEntry2.getRealSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        long long7 = tarArchiveEntry6.getRealSize();
        java.lang.String str8 = tarArchiveEntry6.getLinkName();
        java.lang.String str9 = tarArchiveEntry6.getUserName();
        tarArchiveEntry6.setLinkName(" \000");
        boolean boolean12 = tarArchiveEntry2.isDescendent(tarArchiveEntry6);
        tarArchiveEntry6.setGroupId((long) ' ');
        boolean boolean15 = tarArchiveEntry6.isGNUSparse();
        byte[] byteArray17 = new byte[] { (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry6.writeEntryHeader(byteArray17, zipEncoding18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 88 });
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setNames("ustar ", "ustar ");
        java.lang.String str12 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ustar " + "'", str12, "ustar ");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        boolean boolean23 = tarArchiveEntry12.isSparse();
        boolean boolean24 = tarArchiveEntry12.isDirectory();
        int int25 = tarArchiveEntry12.getMode();
        java.lang.String str26 = tarArchiveEntry12.getLinkName();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 33188 + "'", int25 == 33188);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (short) 1, 155);
        int int8 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setName("ustar ");
        long long11 = tarArchiveEntry2.getLongUserId();
        boolean boolean13 = tarArchiveEntry2.equals((java.lang.Object) 0.0f);
        tarArchiveEntry2.setGroupId((long) 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 155 + "'", int8 == 155);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        long long6 = tarArchiveEntry2.getRealSize();
        boolean boolean7 = tarArchiveEntry2.isCheckSumOK();
        int int8 = tarArchiveEntry2.getMode();
        boolean boolean9 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "196) test3872(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        boolean boolean7 = tarArchiveEntry2.isSparse();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertNotNull(date3);
// flaky "197) test3873(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        long long3 = tarArchiveEntry2.getSize();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean5 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(date4);
// flaky "198) test3874(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00");
        boolean boolean2 = tarArchiveEntry1.isCheckSumOK();
        boolean boolean3 = tarArchiveEntry1.isStarSparse();
        boolean boolean4 = tarArchiveEntry1.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 50, true);
        tarArchiveEntry3.setUserName("0\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry9.setGroupId((-1));
        java.lang.String str12 = tarArchiveEntry9.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray13 = tarArchiveEntry9.getDirectoryEntries();
        boolean boolean14 = tarArchiveEntry3.equals((java.lang.Object) tarArchiveEntry9);
        tarArchiveEntry9.setMode(75);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ustar\000" + "'", str12, "ustar\000");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray13);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray13, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        int int19 = tarArchiveEntry2.getUserId();
        boolean boolean20 = tarArchiveEntry2.isFIFO();
        boolean boolean21 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "199) test3877(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        tarArchiveEntry11.setIds(10240, 0);
        boolean boolean26 = tarArchiveEntry11.isFIFO();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getGroupName();
        tarArchiveEntry3.setUserName("");
        tarArchiveEntry3.setName("ustar\000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setGroupId((int) (byte) 0);
        tarArchiveEntry2.setIds((int) '#', 0);
        java.util.Date date10 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date14 = tarArchiveEntry13.getLastModifiedDate();
        boolean boolean15 = tarArchiveEntry13.isCharacterDevice();
        tarArchiveEntry13.setUserName("hi!");
        tarArchiveEntry13.setGroupName("");
        java.util.Date date20 = tarArchiveEntry13.getModTime();
        tarArchiveEntry13.setSize((long) (byte) 53);
        tarArchiveEntry13.setUserName("");
        tarArchiveEntry13.setIds((-1), (int) (byte) 75);
        int int28 = tarArchiveEntry13.getDevMajor();
        boolean boolean29 = tarArchiveEntry13.isLink();
        boolean boolean30 = tarArchiveEntry2.isDescendent(tarArchiveEntry13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "200) test3880(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "99) test3880(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky "36) test3880(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        byte[] byteArray5 = new byte[] { (byte) 103, (byte) 51, (byte) 10, (byte) 88, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 103, (byte) 51, (byte) 10, (byte) 88, (byte) 10 });
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        boolean boolean3 = tarArchiveEntry2.isDirectory();
        boolean boolean4 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date5);
// flaky "201) test3882(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setGroupId((int) (byte) 1);
        tarArchiveEntry2.setUserName("\000\000");
        boolean boolean13 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserName("ustar\000");
        boolean boolean16 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setIds(12, (int) (byte) 83);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setSize((long) (byte) 55);
        boolean boolean13 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "202) test3884(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "100) test3884(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
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
        byte[] byteArray24 = new byte[] { (byte) 55, (byte) 55, (byte) 88, (byte) 54, (byte) 75, (byte) 52 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray24, zipEncoding25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 55, (byte) 55, (byte) 88, (byte) 54, (byte) 75, (byte) 52 });
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean5 = tarArchiveEntry2.isFile();
        boolean boolean6 = tarArchiveEntry2.isDirectory();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setSize((long) 131);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
// flaky "203) test3886(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        boolean boolean12 = tarArchiveEntry10.isOldGNUSparse();
        tarArchiveEntry10.setIds((-1), (int) 'a');
        boolean boolean16 = tarArchiveEntry10.isCheckSumOK();
        boolean boolean17 = tarArchiveEntry10.isGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "204) test3887(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "101) test3887(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 50, true);
        java.util.Date date4 = tarArchiveEntry3.getModTime();
        boolean boolean5 = tarArchiveEntry3.isStarSparse();
        long long6 = tarArchiveEntry3.getSize();
        boolean boolean7 = tarArchiveEntry3.isCheckSumOK();
        org.junit.Assert.assertNotNull(date4);
// flaky "205) test3888(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        byte[] byteArray6 = new byte[] { (byte) 120, (byte) 55, (byte) 103, (byte) 49, (byte) 100, (byte) 48 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 120, (byte) 55, (byte) 103, (byte) 49, (byte) 100, (byte) 48 });
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setDevMinor(3);
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        boolean boolean11 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean12 = tarArchiveEntry2.isOldGNUSparse();
        long long13 = tarArchiveEntry2.getSize();
        boolean boolean14 = tarArchiveEntry2.isStarSparse();
        byte[] byteArray15 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray15, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "206) test3890(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 49, (byte) 100, (byte) 0, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 49, (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        int int7 = tarArchiveEntry2.getMode();
        int int8 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setModTime((long) (byte) 88);
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        java.lang.String str12 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "207) test3892(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
        tarArchiveEntry2.setName("ustar ");
        java.util.Date date20 = tarArchiveEntry2.getModTime();
        int int21 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertNotNull(date3);
// flaky "208) test3893(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "102) test3893(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "37) test3893(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky "15) test3893(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setNames("0\000", "");
        tarArchiveEntry2.setSize((long) 'a');
        boolean boolean16 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setDevMinor((int) (byte) 55);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        tarArchiveEntry46.setGroupName("ustar ");
        boolean boolean57 = tarArchiveEntry46.isFile();
        int int58 = tarArchiveEntry46.getUserId();
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
// flaky "209) test3895(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date40.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date41);
// flaky "103) test3895(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date41.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        boolean boolean14 = tarArchiveEntry2.isFile();
        java.util.Date date15 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "210) test3896(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(date15);
// flaky "104) test3896(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:48 ICT 2026");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserId(12);
        boolean boolean9 = tarArchiveEntry2.isLink();
        int int10 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "211) test3897(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("0\000");
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
        tarArchiveEntry23.setMode(263);
        boolean boolean32 = tarArchiveEntry2.equals(tarArchiveEntry23);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(date26);
// flaky "212) test3898(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date27);
// flaky "105) test3898(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date27.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 33188 + "'", int28 == 33188);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserId(12);
        int int9 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setDevMinor(131);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "213) test3899(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 48, false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long7 = tarArchiveEntry6.getSize();
        tarArchiveEntry6.setUserId((int) (byte) 10);
        long long10 = tarArchiveEntry6.getLongUserId();
        int int11 = tarArchiveEntry6.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean15 = tarArchiveEntry14.isGlobalPaxHeader();
        boolean boolean16 = tarArchiveEntry14.isFile();
        boolean boolean17 = tarArchiveEntry14.isDirectory();
        tarArchiveEntry14.setSize((long) 504);
        long long20 = tarArchiveEntry14.getSize();
        boolean boolean21 = tarArchiveEntry14.isLink();
        boolean boolean22 = tarArchiveEntry14.isBlockDevice();
        boolean boolean23 = tarArchiveEntry14.isPaxHeader();
        tarArchiveEntry14.setDevMajor((int) (short) 1);
        boolean boolean26 = tarArchiveEntry6.equals((java.lang.Object) tarArchiveEntry14);
        long long27 = tarArchiveEntry14.getRealSize();
        boolean boolean28 = tarArchiveEntry3.equals((java.lang.Object) tarArchiveEntry14);
        boolean boolean29 = tarArchiveEntry14.isFile();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 504L + "'", long20 == 504L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
        tarArchiveEntry2.setIds(10240, 10240);
        java.lang.String str20 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setSize((long) 3);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "214) test3901(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "106) test3901(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
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
        boolean boolean16 = tarArchiveEntry2.isExtended();
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
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        long long10 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setGroupId((int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean17 = tarArchiveEntry16.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean21 = tarArchiveEntry20.isGlobalPaxHeader();
        java.lang.String str22 = tarArchiveEntry20.getUserName();
        boolean boolean23 = tarArchiveEntry16.isDescendent(tarArchiveEntry20);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry26 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean27 = tarArchiveEntry26.isGlobalPaxHeader();
        boolean boolean28 = tarArchiveEntry26.isFile();
        boolean boolean29 = tarArchiveEntry26.isDirectory();
        tarArchiveEntry26.setSize((long) 504);
        long long32 = tarArchiveEntry26.getSize();
        java.util.Date date33 = tarArchiveEntry26.getModTime();
        tarArchiveEntry16.setModTime(date33);
        boolean boolean35 = tarArchiveEntry16.isDirectory();
        boolean boolean36 = tarArchiveEntry2.equals(tarArchiveEntry16);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry38 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        int int39 = tarArchiveEntry38.getUserId();
        java.lang.String str40 = tarArchiveEntry38.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry43 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long44 = tarArchiveEntry43.getSize();
        tarArchiveEntry43.setUserId((int) (byte) 10);
        boolean boolean47 = tarArchiveEntry43.isGlobalPaxHeader();
        tarArchiveEntry43.setGroupId((long) (byte) 10);
        boolean boolean50 = tarArchiveEntry43.isBlockDevice();
        tarArchiveEntry43.setUserId(100L);
        java.util.Date date53 = tarArchiveEntry43.getModTime();
        int int54 = tarArchiveEntry43.getUserId();
        java.util.Date date55 = tarArchiveEntry43.getModTime();
        boolean boolean56 = tarArchiveEntry43.isGNULongLinkEntry();
        tarArchiveEntry43.setName("\000\000");
        java.util.Date date59 = tarArchiveEntry43.getLastModifiedDate();
        tarArchiveEntry38.setModTime(date59);
        boolean boolean61 = tarArchiveEntry2.equals((java.lang.Object) date59);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 504L + "'", long32 == 504L);
        org.junit.Assert.assertNotNull(date33);
// flaky "215) test3903(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date33.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date53);
// flaky "107) test3903(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date53.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(date55);
// flaky "38) test3903(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date55.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(date59);
// flaky "16) test3903(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date59.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setLinkName("ustar ");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNUSparse();
        long long9 = tarArchiveEntry2.getLongGroupId();
        boolean boolean10 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "216) test3904(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setSize((long) 1000);
        tarArchiveEntry2.setModTime((long) 33188);
        java.lang.String str10 = tarArchiveEntry2.getGroupName();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "217) test3905(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
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
        boolean boolean17 = tarArchiveEntry10.isExtended();
        boolean boolean18 = tarArchiveEntry10.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "218) test3906(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "108) test3906(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setLinkName("ustar ");
        tarArchiveEntry2.setSize(4L);
        boolean boolean14 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertNotNull(date3);
// flaky "219) test3907(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        int int8 = tarArchiveEntry2.getDevMajor();
        java.util.Date date9 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean10 = tarArchiveEntry2.isStarSparse();
        long long11 = tarArchiveEntry2.getLongUserId();
        int int12 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertNotNull(date3);
// flaky "220) test3908(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(date9);
// flaky "109) test3908(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setLinkName("ustar ");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.setName("././@LongLink");
        boolean boolean11 = tarArchiveEntry2.isLink();
        long long12 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertNotNull(date3);
// flaky "221) test3909(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
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
        tarArchiveEntry2.setLinkName("././@LongLink");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        boolean boolean12 = tarArchiveEntry10.isOldGNUSparse();
        tarArchiveEntry10.setIds((-1), (int) 'a');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry18.setName("0\000");
        boolean boolean21 = tarArchiveEntry10.equals(tarArchiveEntry18);
        byte[] byteArray22 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.parseTarHeader(byteArray22, zipEncoding23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "222) test3911(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "110) test3911(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        long long10 = tarArchiveEntry2.getSize();
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setGroupName("");
        boolean boolean14 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.util.Date date4 = tarArchiveEntry3.getModTime();
        tarArchiveEntry3.setIds((int) '#', (int) (byte) 53);
        long long8 = tarArchiveEntry3.getRealSize();
        org.junit.Assert.assertNotNull(date4);
// flaky "223) test3913(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
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
        tarArchiveEntry2.setGroupId((int) (byte) 50);
        java.lang.String str17 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "224) test3914(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ustar " + "'", str17, "ustar ");
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
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
        boolean boolean13 = tarArchiveEntry2.isBlockDevice();
        boolean boolean14 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertNotNull(date3);
// flaky "225) test3915(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        byte[] byteArray2 = new byte[] { (byte) 52, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 52, (byte) 50 });
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
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
        boolean boolean23 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMajor((int) (byte) 48);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "226) test3917(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        tarArchiveEntry12.setDevMajor(53);
        long long28 = tarArchiveEntry12.getLongUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "227) test3918(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "111) test3918(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
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
        boolean boolean19 = tarArchiveEntry12.isBlockDevice();
        tarArchiveEntry12.setUserId(100L);
        java.util.Date date22 = tarArchiveEntry12.getModTime();
        int int23 = tarArchiveEntry12.getUserId();
        java.util.Date date24 = tarArchiveEntry12.getModTime();
        tarArchiveEntry2.setModTime(date24);
        boolean boolean26 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "228) test3919(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "112) test3919(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "39) test3919(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(date24);
// flaky "17) test3919(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.lang.String str6 = tarArchiveEntry2.getName();
        java.lang.String str7 = tarArchiveEntry2.getLinkName();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar " + "'", str6, "ustar ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
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
        boolean boolean13 = tarArchiveEntry2.isGNUSparse();
        java.io.File file14 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "229) test3921(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "113) test3921(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(file14);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
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
        boolean boolean19 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean20 = tarArchiveEntry2.isPaxHeader();
        boolean boolean21 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "230) test3922(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "114) test3922(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "40) test3922(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        int int9 = tarArchiveEntry2.getUserId();
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        int int11 = tarArchiveEntry2.getMode();
        long long12 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33188 + "'", int11 == 33188);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
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
        tarArchiveEntry2.setNames("\000\000", "00");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "231) test3924(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "115) test3924(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (short) 1, 155);
        int int8 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setUserId(10240);
        java.util.Date date11 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry14.setLinkName("tar\000");
        boolean boolean17 = tarArchiveEntry14.isDirectory();
        boolean boolean18 = tarArchiveEntry2.isDescendent(tarArchiveEntry14);
        boolean boolean19 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setGroupId((-1L));
        tarArchiveEntry2.setDevMajor(148);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 155 + "'", int8 == 155);
        org.junit.Assert.assertNotNull(date11);
// flaky "232) test3925(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long24 = tarArchiveEntry23.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", false);
        boolean boolean28 = tarArchiveEntry23.equals((java.lang.Object) false);
        boolean boolean29 = tarArchiveEntry2.isDescendent(tarArchiveEntry23);
        int int30 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 83 + "'", int30 == 83);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isExtended();
        boolean boolean8 = tarArchiveEntry2.isFile();
        long long9 = tarArchiveEntry2.getLongUserId();
        byte[] byteArray12 = new byte[] { (byte) 52, (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12, zipEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "233) test3927(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 52, (byte) 54 });
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        byte[] byteArray3 = new byte[] { (byte) 76, (byte) 120, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 76, (byte) 120, (byte) 50 });
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isLink();
        boolean boolean9 = tarArchiveEntry2.isGlobalPaxHeader();
        java.util.Date date10 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) 31);
        boolean boolean13 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "234) test3929(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky "116) test3929(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        byte[] byteArray5 = new byte[] { (byte) 120, (byte) 120, (byte) 51, (byte) 76, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 120, (byte) 120, (byte) 51, (byte) 76, (byte) -1 });
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
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
        tarArchiveEntry14.setMode(1000);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry45 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date46 = tarArchiveEntry45.getLastModifiedDate();
        boolean boolean47 = tarArchiveEntry45.isCharacterDevice();
        tarArchiveEntry45.setUserName("hi!");
        boolean boolean50 = tarArchiveEntry45.isStarSparse();
        boolean boolean51 = tarArchiveEntry45.isSymbolicLink();
        int int52 = tarArchiveEntry45.getGroupId();
        tarArchiveEntry45.setLinkName("hi!");
        boolean boolean55 = tarArchiveEntry45.isSymbolicLink();
        boolean boolean56 = tarArchiveEntry14.isDescendent(tarArchiveEntry45);
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
// flaky "235) test3931(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date35.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(date46);
// flaky "117) test3931(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date46.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", (byte) 0, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        tarArchiveEntry3.setUserId(263);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillStarSparseData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setIds((int) (byte) 48, (int) (short) 10);
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        boolean boolean14 = tarArchiveEntry2.isOldGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "236) test3933(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
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
        boolean boolean15 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean16 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date14);
// flaky "237) test3934(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
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
        tarArchiveEntry2.setSize((long) (byte) 51);
        java.util.Date date18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setModTime(date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "238) test3935(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "118) test3935(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33188 + "'", int14 == 33188);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
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
        tarArchiveEntry35.setUserId(148);
        boolean boolean46 = tarArchiveEntry35.isGNULongLinkEntry();
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
// flaky "239) test3936(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 55);
        tarArchiveEntry2.setNames("ustar\000", "0\000");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "240) test3937(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "119) test3937(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean8 = tarArchiveEntry7.isGlobalPaxHeader();
        java.lang.String str9 = tarArchiveEntry7.getUserName();
        boolean boolean10 = tarArchiveEntry3.isDescendent(tarArchiveEntry7);
        boolean boolean11 = tarArchiveEntry7.isGNUSparse();
        tarArchiveEntry7.setMode((int) (byte) 49);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long17 = tarArchiveEntry16.getSize();
        tarArchiveEntry16.setUserId((int) (byte) 10);
        boolean boolean20 = tarArchiveEntry16.isGlobalPaxHeader();
        tarArchiveEntry16.setGroupId((long) (byte) 10);
        boolean boolean23 = tarArchiveEntry16.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray24 = tarArchiveEntry16.getDirectoryEntries();
        tarArchiveEntry16.setModTime(0L);
        boolean boolean27 = tarArchiveEntry16.isStarSparse();
        int int28 = tarArchiveEntry16.getDevMajor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry31 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long32 = tarArchiveEntry31.getSize();
        tarArchiveEntry31.setUserId((int) (byte) 10);
        boolean boolean35 = tarArchiveEntry31.isGlobalPaxHeader();
        tarArchiveEntry31.setGroupId((long) (byte) 10);
        boolean boolean38 = tarArchiveEntry31.isBlockDevice();
        boolean boolean39 = tarArchiveEntry31.isLink();
        boolean boolean40 = tarArchiveEntry31.isSparse();
        tarArchiveEntry31.setIds((int) (byte) 75, (int) (byte) 83);
        java.lang.String str44 = tarArchiveEntry31.getGroupName();
        tarArchiveEntry31.setUserId((int) '4');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry49 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long50 = tarArchiveEntry49.getSize();
        tarArchiveEntry49.setUserId((int) (byte) 10);
        boolean boolean53 = tarArchiveEntry49.isGlobalPaxHeader();
        tarArchiveEntry49.setGroupId((long) (byte) 10);
        boolean boolean56 = tarArchiveEntry49.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray57 = tarArchiveEntry49.getDirectoryEntries();
        boolean boolean58 = tarArchiveEntry49.isSymbolicLink();
        long long59 = tarArchiveEntry49.getRealSize();
        int int60 = tarArchiveEntry49.getUserId();
        boolean boolean61 = tarArchiveEntry31.equals(tarArchiveEntry49);
        boolean boolean62 = tarArchiveEntry16.equals(tarArchiveEntry31);
        boolean boolean63 = tarArchiveEntry7.equals((java.lang.Object) boolean62);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray24);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray24, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray57);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray57, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
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
        java.lang.String str18 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "241) test3939(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int22 = tarArchiveEntry21.getGroupId();
        tarArchiveEntry21.setGroupId((long) 1);
        long long25 = tarArchiveEntry21.getRealSize();
        java.util.Date date26 = tarArchiveEntry21.getLastModifiedDate();
        boolean boolean27 = tarArchiveEntry21.isLink();
        boolean boolean28 = tarArchiveEntry21.isStarSparse();
        boolean boolean29 = tarArchiveEntry21.isPaxGNUSparse();
        boolean boolean30 = tarArchiveEntry2.isDescendent(tarArchiveEntry21);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(date26);
// flaky "242) test3940(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        int int7 = tarArchiveEntry2.getMode();
        int int8 = tarArchiveEntry2.getDevMinor();
        java.util.Date date9 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "243) test3941(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "120) test3941(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(date9);
// flaky "41) test3941(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:48 ICT 2026");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        boolean boolean4 = tarArchiveEntry2.isPaxHeader();
        int int5 = tarArchiveEntry2.getUserId();
        java.lang.String str6 = tarArchiveEntry2.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000");
        tarArchiveEntry8.setUserId((long) (byte) 53);
        tarArchiveEntry8.setDevMinor(10);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long16 = tarArchiveEntry15.getSize();
        tarArchiveEntry15.setUserId((int) (byte) 10);
        boolean boolean19 = tarArchiveEntry15.isGlobalPaxHeader();
        tarArchiveEntry15.setGroupId((long) (byte) 10);
        boolean boolean22 = tarArchiveEntry15.isBlockDevice();
        tarArchiveEntry15.setUserId(100L);
        boolean boolean25 = tarArchiveEntry15.isFIFO();
        tarArchiveEntry15.setName("tar\000");
        boolean boolean28 = tarArchiveEntry15.isStarSparse();
        boolean boolean29 = tarArchiveEntry8.equals(tarArchiveEntry15);
        boolean boolean30 = tarArchiveEntry8.isGNULongLinkEntry();
        boolean boolean31 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setGroupId((int) (byte) 1);
        tarArchiveEntry2.setUserName("\000\000");
        boolean boolean13 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserName("ustar\000");
        boolean boolean16 = tarArchiveEntry2.isFile();
        byte[] byteArray22 = new byte[] { (byte) 51, (byte) 50, (byte) 54, (byte) 54, (byte) 48 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 51, (byte) 50, (byte) 54, (byte) 54, (byte) 48 });
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isGlobalPaxHeader();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse1xData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setDevMajor(33188);
        tarArchiveEntry2.setIds(6, 10240);
        tarArchiveEntry2.setModTime((long) (byte) 75);
        boolean boolean14 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isLink();
        boolean boolean11 = tarArchiveEntry2.isLink();
        tarArchiveEntry2.setName("tar\000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isGNULongNameEntry();
        int int5 = tarArchiveEntry2.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean9 = tarArchiveEntry8.isGlobalPaxHeader();
        boolean boolean10 = tarArchiveEntry8.isFile();
        java.util.Date date11 = tarArchiveEntry8.getModTime();
        java.util.Date date12 = tarArchiveEntry8.getModTime();
        boolean boolean13 = tarArchiveEntry8.isOldGNUSparse();
        tarArchiveEntry8.setDevMinor(0);
        tarArchiveEntry8.setGroupId(32L);
        int int18 = tarArchiveEntry8.getUserId();
        boolean boolean19 = tarArchiveEntry8.isGNULongLinkEntry();
        boolean boolean20 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        tarArchiveEntry8.setUserId((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(date11);
// flaky "244) test3947(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "121) test3947(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, false);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setIds(155, 96);
        tarArchiveEntry2.setSize(2097151L);
        tarArchiveEntry2.setIds((int) (byte) 103, (int) (byte) 50);
        tarArchiveEntry2.setUserName("tar\000");
        java.lang.String str20 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        boolean boolean12 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean13 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setDevMinor((int) (byte) 48);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
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
        tarArchiveEntry2.setNames("00", "");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "245) test3951(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        boolean boolean3 = tarArchiveEntry2.isDirectory();
        java.lang.String str4 = tarArchiveEntry2.getGroupName();
        boolean boolean5 = tarArchiveEntry2.isPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        int int10 = tarArchiveEntry2.getDevMinor();
        boolean boolean11 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setUserId((-1L));
        tarArchiveEntry2.setGroupName("hi!");
        tarArchiveEntry2.setModTime(1L);
        java.io.File file18 = tarArchiveEntry2.getFile();
        boolean boolean19 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        byte[] byteArray6 = new byte[] { (byte) 75, (byte) 50, (byte) 52, (byte) 51, (byte) 52, (byte) -1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 75, (byte) 50, (byte) 52, (byte) 51, (byte) 52, (byte) -1 });
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
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
        java.lang.String str15 = tarArchiveEntry10.getName();
        long long16 = tarArchiveEntry10.getRealSize();
        java.util.Date date17 = tarArchiveEntry10.getLastModifiedDate();
        tarArchiveEntry10.setDevMinor(96);
        boolean boolean20 = tarArchiveEntry10.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "246) test3955(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "122) test3955(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:48 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ustar " + "'", str15, "ustar ");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
        boolean boolean21 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean22 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setUserId((long) 16877);
        tarArchiveEntry2.setLinkName(" \000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "247) test3956(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "123) test3956(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date13 = tarArchiveEntry12.getLastModifiedDate();
        int int14 = tarArchiveEntry12.getGroupId();
        tarArchiveEntry12.setLinkName("././@LongLink");
        java.lang.String str17 = tarArchiveEntry12.getLinkName();
        boolean boolean18 = tarArchiveEntry12.isExtended();
        boolean boolean19 = tarArchiveEntry2.isDescendent(tarArchiveEntry12);
        tarArchiveEntry12.setMode(263);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "248) test3957(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "././@LongLink" + "'", str17, "././@LongLink");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        long long6 = tarArchiveEntry2.getLongGroupId();
        long long7 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setLinkName("\000\000");
        boolean boolean10 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertNotNull(date3);
// flaky "249) test3958(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        int int33 = tarArchiveEntry9.getDevMinor();
        tarArchiveEntry9.setModTime((long) 2);
        tarArchiveEntry9.setDevMajor(10240);
        tarArchiveEntry9.setSize((long) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap40 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry9.fillStarSparseData(strMap40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
// flaky "250) test3959(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 50);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean6 = tarArchiveEntry5.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry5.isFile();
        java.util.Date date8 = tarArchiveEntry5.getModTime();
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        boolean boolean10 = tarArchiveEntry5.isOldGNUSparse();
        tarArchiveEntry5.setDevMinor(0);
        boolean boolean13 = tarArchiveEntry5.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean17 = tarArchiveEntry16.isGlobalPaxHeader();
        boolean boolean18 = tarArchiveEntry16.isFile();
        boolean boolean19 = tarArchiveEntry16.isDirectory();
        tarArchiveEntry16.setSize((long) 504);
        java.lang.String str22 = tarArchiveEntry16.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date26 = tarArchiveEntry25.getLastModifiedDate();
        boolean boolean27 = tarArchiveEntry25.isCharacterDevice();
        tarArchiveEntry25.setUserName("hi!");
        tarArchiveEntry25.setGroupName("");
        java.util.Date date32 = tarArchiveEntry25.getModTime();
        tarArchiveEntry16.setModTime(date32);
        tarArchiveEntry5.setModTime(date32);
        tarArchiveEntry2.setModTime(date32);
        tarArchiveEntry2.setUserId(48L);
        tarArchiveEntry2.setNames(" \000", "ustar\000");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "251) test3960(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "124) test3960(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(date26);
// flaky "42) test3960(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date26.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date32);
// flaky "18) test3960(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date32.toString(), "Mon Sep 28 13:40:49 ICT 2026");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 76, true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray4 = tarArchiveEntry3.getDirectoryEntries();
        int int5 = tarArchiveEntry3.getDevMajor();
        long long6 = tarArchiveEntry3.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean10 = tarArchiveEntry9.isGlobalPaxHeader();
        boolean boolean11 = tarArchiveEntry9.isFile();
        boolean boolean12 = tarArchiveEntry9.isPaxGNUSparse();
        java.util.Date date13 = tarArchiveEntry9.getModTime();
        boolean boolean14 = tarArchiveEntry9.isStarSparse();
        tarArchiveEntry9.setGroupName("");
        boolean boolean17 = tarArchiveEntry3.equals(tarArchiveEntry9);
        tarArchiveEntry3.setGroupId(131);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray4);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray4, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "252) test3961(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        java.util.Date date7 = tarArchiveEntry2.getModTime();
        boolean boolean8 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date7);
// flaky "253) test3962(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date7.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        tarArchiveEntry10.setDevMajor(2);
        boolean boolean17 = tarArchiveEntry10.isGNULongLinkEntry();
        int int18 = tarArchiveEntry10.getDevMajor();
        boolean boolean19 = tarArchiveEntry10.isGlobalPaxHeader();
        boolean boolean20 = tarArchiveEntry10.isSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "254) test3963(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "125) test3963(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        boolean boolean19 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "255) test3964(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        boolean boolean3 = tarArchiveEntry1.isFIFO();
        boolean boolean4 = tarArchiveEntry1.isStarSparse();
        long long5 = tarArchiveEntry1.getRealSize();
        tarArchiveEntry1.setName(" \000");
        java.io.File file8 = tarArchiveEntry1.getFile();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry1.getDirectoryEntries();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.setDevMajor((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Major device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky "256) test3965(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
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
        java.lang.String str14 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ustar " + "'", str14, "ustar ");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isLink();
        tarArchiveEntry2.setGroupName("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
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
        org.junit.Assert.assertNotNull(date12);
// flaky "257) test3968(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
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
        tarArchiveEntry2.setMode((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date14);
// flaky "258) test3969(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.lang.String str6 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setUserName("\000\000");
        int int9 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongGroupId();
        int int9 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 100);
        boolean boolean12 = tarArchiveEntry2.isExtended();
        int int13 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
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
        boolean boolean26 = tarArchiveEntry2.isFile();
        long long27 = tarArchiveEntry2.getSize();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap28);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isLink();
        long long9 = tarArchiveEntry2.getLongGroupId();
        tarArchiveEntry2.setMode((int) (short) -1);
        tarArchiveEntry2.setSize((long) 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        java.lang.String str7 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setDevMinor((int) (byte) 53);
        tarArchiveEntry2.setName("././@LongLink");
        org.junit.Assert.assertNotNull(date3);
// flaky "259) test3974(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ustar " + "'", str7, "ustar ");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setGroupId((int) (byte) 0);
        boolean boolean7 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        boolean boolean7 = tarArchiveEntry3.isGNULongLinkEntry();
        java.lang.String str8 = tarArchiveEntry3.getGroupName();
        boolean boolean9 = tarArchiveEntry3.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry3.isSymbolicLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 51, false);
        java.lang.String str15 = tarArchiveEntry14.getUserName();
        boolean boolean16 = tarArchiveEntry3.equals(tarArchiveEntry14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
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
        int int16 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setUserId((int) (byte) 53);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "260) test3977(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(155);
        tarArchiveEntry2.setDevMinor((int) (byte) 120);
        int int13 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setName("\000\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        java.util.Date date2 = tarArchiveEntry1.getModTime();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.fillGNUSparse0xData(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky "261) test3979(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:49 ICT 2026");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setModTime((long) (byte) 75);
        int int14 = tarArchiveEntry10.getDevMajor();
        int int15 = tarArchiveEntry10.getUserId();
        boolean boolean16 = tarArchiveEntry10.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "262) test3980(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "126) test3980(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
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
        tarArchiveEntry2.setSize((long) (byte) 51);
        boolean boolean17 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
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
        long long21 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky "263) test3982(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date19.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) 504);
        tarArchiveEntry2.setIds(96, (int) (byte) 50);
        boolean boolean12 = tarArchiveEntry2.isGlobalPaxHeader();
        long long13 = tarArchiveEntry2.getLongGroupId();
        byte[] byteArray17 = new byte[] { (byte) 55, (byte) 0, (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray17, zipEncoding18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 50L + "'", long13 == 50L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 55, (byte) 0, (byte) 76 });
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        byte[] byteArray4 = new byte[] { (byte) 120, (byte) 103, (byte) 48, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 120, (byte) 103, (byte) 48, (byte) 54 });
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
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
        boolean boolean17 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setGroupName("ustar\000");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        long long10 = tarArchiveEntry2.getSize();
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        boolean boolean12 = tarArchiveEntry2.isSparse();
        boolean boolean13 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserId((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(date11);
// flaky "264) test3986(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        int int11 = tarArchiveEntry2.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long15 = tarArchiveEntry14.getSize();
        tarArchiveEntry14.setUserId((int) (byte) 10);
        boolean boolean18 = tarArchiveEntry14.isGlobalPaxHeader();
        tarArchiveEntry14.setGroupId((long) (byte) 10);
        boolean boolean21 = tarArchiveEntry14.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray22 = tarArchiveEntry14.getDirectoryEntries();
        boolean boolean23 = tarArchiveEntry14.isFIFO();
        boolean boolean24 = tarArchiveEntry14.isStarSparse();
        boolean boolean25 = tarArchiveEntry2.equals(tarArchiveEntry14);
        int int26 = tarArchiveEntry14.getDevMinor();
        byte[] byteArray27 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry14.writeEntryHeader(byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray22);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray22, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean9 = tarArchiveEntry2.isLink();
        long long10 = tarArchiveEntry2.getLongGroupId();
        byte[] byteArray15 = new byte[] { (byte) 52, (byte) 54, (byte) 88, (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray15, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 52, (byte) 54, (byte) 88, (byte) 54 });
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
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
        java.lang.String str20 = tarArchiveEntry2.getName();
        boolean boolean21 = tarArchiveEntry2.isBlockDevice();
        boolean boolean22 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "265) test3989(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ustar " + "'", str20, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
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
        tarArchiveEntry2.setDevMinor((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setUserId((int) '#');
        java.io.File file14 = tarArchiveEntry10.getFile();
        java.util.Date date15 = tarArchiveEntry10.getModTime();
        boolean boolean16 = tarArchiveEntry10.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "266) test3991(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "127) test3991(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(date15);
// flaky "43) test3991(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
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
        tarArchiveEntry2.setSize((long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "267) test3992(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
        java.util.Date date24 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertNotNull(date3);
// flaky "268) test3993(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "128) test3993(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray22);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray22, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date24);
// flaky "44) test3993(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:49 ICT 2026");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setSize((long) 1000);
        boolean boolean8 = tarArchiveEntry2.isPaxGNUSparse();
        int int9 = tarArchiveEntry2.getGroupId();
        tarArchiveEntry2.setSize((long) 504);
        tarArchiveEntry2.setDevMinor(131);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 54, true);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 52, (byte) 1, (byte) -1, (byte) 51, (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray10, zipEncoding11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 52, (byte) 1, (byte) -1, (byte) 51, (byte) 54 });
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        int int5 = tarArchiveEntry3.getGroupId();
        int int6 = tarArchiveEntry3.getMode();
        boolean boolean7 = tarArchiveEntry3.isPaxGNUSparse();
        long long8 = tarArchiveEntry3.getLongUserId();
        boolean boolean9 = tarArchiveEntry3.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33188 + "'", int6 == 33188);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setMode(8);
        int int11 = tarArchiveEntry2.getGroupId();
        java.lang.String str12 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "269) test3997(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setNames("00", "hi!");
        boolean boolean8 = tarArchiveEntry3.isSymbolicLink();
        int int9 = tarArchiveEntry3.getDevMajor();
        tarArchiveEntry3.setLinkName("././@LongLink");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 10, false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long7 = tarArchiveEntry6.getSize();
        tarArchiveEntry6.setUserId((int) (byte) 10);
        boolean boolean10 = tarArchiveEntry6.isGlobalPaxHeader();
        tarArchiveEntry6.setGroupId((long) (byte) 10);
        long long13 = tarArchiveEntry6.getLongUserId();
        long long14 = tarArchiveEntry6.getSize();
        boolean boolean15 = tarArchiveEntry6.isGNULongLinkEntry();
        tarArchiveEntry6.setGroupName("");
        java.util.Date date18 = tarArchiveEntry6.getModTime();
        boolean boolean19 = tarArchiveEntry6.isGlobalPaxHeader();
        boolean boolean20 = tarArchiveEntry3.isDescendent(tarArchiveEntry6);
        boolean boolean21 = tarArchiveEntry3.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "270) test3999(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
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
        tarArchiveEntry2.setGroupId(35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "271) test4000(org.apache.commons.compress.archivers.tar.RegressionTest7)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:49 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }
}
