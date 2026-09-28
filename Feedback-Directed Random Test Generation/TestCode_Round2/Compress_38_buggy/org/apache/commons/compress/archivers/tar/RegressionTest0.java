package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.OFFSETLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_GNU;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ustar " + "'", str0, "ustar ");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.DEFAULT_FILE_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 33188 + "'", int0 == 33188);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.MAX_NAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 31 + "'", int0 == 31);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        byte[] byteArray0 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray0, zipEncoding1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.PREFIXLEN_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 131 + "'", int0 == 131);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MODTIMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_GNUTYPE_LONGLINK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 75 + "'", byte0 == (byte) 75);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.LONGNAMESLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSELEN_GNU_SPARSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 504 + "'", int0 == 504);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.GNAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CTIMELEN_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_MAGIC_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 508 + "'", int0 == 508);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.FORMAT_OLDGNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ATIMELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.PAD2LEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_XSTAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tar\000" + "'", str0, "tar\000");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_LINK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 49 + "'", byte0 == (byte) 49);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.PREFIXLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MODELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.GNU_LONGLINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "././@LongLink" + "'", str0, "././@LongLink");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_PAX_EXTENDED_HEADER_UC;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 88 + "'", byte0 == (byte) 88);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.NAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SIZELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CHKSUM_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 148 + "'", int0 == 148);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_OLDNORM;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.UNAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        long long0 = org.apache.commons.compress.archivers.ArchiveEntry.SIZE_UNKNOWN;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_GNUTYPE_LONGNAME;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 76 + "'", byte0 == (byte) 76);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CTIMELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_GNU_SPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + " \000" + "'", str0, " \000");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ISEXTENDEDLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ISEXTENDEDLEN_GNU_SPARSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_ANT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\000\000" + "'", str0, "\000\000");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_GNU_ZERO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0\000" + "'", str0, "0\000");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_DIR;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 53 + "'", byte0 == (byte) 53);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        long long0 = org.apache.commons.compress.archivers.tar.TarConstants.MAXID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 2097151L + "'", long0 == 2097151L);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_ANT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ustar\000" + "'", str0, "ustar\000");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 263 + "'", int0 == 263);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setSize((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "1) test0044(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        byte[] byteArray7 = new byte[] { (byte) -1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray7, zipEncoding8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1 });
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 257 + "'", int0 == 257);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.FORMAT_POSIX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_SYMLINK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 50 + "'", byte0 == (byte) 50);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_CONTIG;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 55 + "'", byte0 == (byte) 55);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ATIMELEN_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.UIDLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_POSIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "00" + "'", str0, "00");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.REALSIZELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.DEVLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.DEFAULT_RCDSIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSIONLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        byte[] byteArray10 = new byte[] { (byte) 53, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 53, (byte) -1 });
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_POSIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ustar\000" + "'", str0, "ustar\000");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        java.lang.Class<?> wildcardClass7 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 103 + "'", byte0 == (byte) 103);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
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
        org.junit.Assert.assertNotNull(date5);
// flaky "2) test0061(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:00 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "1) test0061(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:00 ICT 2026");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 103, (byte) 10, (byte) 49, (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray15, zipEncoding16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "3) test0062(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 10, (byte) 103, (byte) 10, (byte) 49, (byte) 76 });
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        byte[] byteArray2 = new byte[] { (byte) 88, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 88, (byte) 103 });
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 49 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray13, zipEncoding14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 49 });
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.DEFAULT_DIR_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16877 + "'", int0 == 16877);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.DEFAULT_BLKSIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10240 + "'", int0 == 10240);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        byte[] byteArray2 = new byte[] { (byte) 50, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 50, (byte) 103 });
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        byte[] byteArray6 = new byte[] { (byte) 88, (byte) 76, (byte) 1, (byte) 76, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 88, (byte) 76, (byte) 1, (byte) 76, (byte) 0, (byte) 1 });
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.FORMAT_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        byte[] byteArray8 = new byte[] { (byte) 76, (byte) 103, (byte) 75, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "4) test0071(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:01 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 76, (byte) 103, (byte) 75, (byte) 10 });
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.GIDLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "././@LongLink");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "5) test0074(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:01 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "6) test0075(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:01 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_GNUTYPE_SPARSE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 83 + "'", byte0 == (byte) 83);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        byte[] byteArray12 = new byte[] { (byte) 53, (byte) 88, (byte) 1, (byte) 103, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 53, (byte) 88, (byte) 1, (byte) 103, (byte) 100 });
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 50, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 50, (byte) 100 });
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "7) test0079(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:01 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
        byte[] byteArray12 = new byte[] { (byte) 53, (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12, zipEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "8) test0080(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:01 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "2) test0080(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:01 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 53, (byte) 76 });
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_CHR;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 51 + "'", byte0 == (byte) 51);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_MAGIC_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 88, (byte) -1, (byte) 53, (byte) 55, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray15, zipEncoding16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 88, (byte) -1, (byte) 53, (byte) 55, (byte) 88 });
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGICLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_PAX_EXTENDED_HEADER_LC;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 120 + "'", byte0 == (byte) 120);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        long long0 = org.apache.commons.compress.archivers.tar.TarConstants.MAXSIZE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 8589934591L + "'", long0 == 8589934591L);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        boolean boolean6 = tarArchiveEntry2.isFile();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "9) test0088(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:01 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_NORMAL;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 48 + "'", byte0 == (byte) 48);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        byte[] byteArray13 = new byte[] { (byte) 48, (byte) 0, (byte) 51, (byte) 75 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray13, zipEncoding14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "10) test0090(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:01 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 48, (byte) 0, (byte) 51, (byte) 75 });
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "tar\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_FIFO;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 54 + "'", byte0 == (byte) 54);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CHKSUMLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setModTime(0L);
        boolean boolean13 = tarArchiveEntry2.isFIFO();
        byte[] byteArray19 = new byte[] { (byte) 48, (byte) 51, (byte) 83, (byte) 88, (byte) -1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray19, zipEncoding20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 48, (byte) 51, (byte) 83, (byte) 88, (byte) -1 });
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000");
        byte[] byteArray8 = new byte[] { (byte) 88, (byte) 48, (byte) -1, (byte) 100, (byte) 75, (byte) 75 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.parseTarHeader(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 88, (byte) 48, (byte) -1, (byte) 100, (byte) 75, (byte) 75 });
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.MILLIS_PER_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        byte[] byteArray6 = new byte[] { (byte) 51, (byte) 83, (byte) 75, (byte) 48, (byte) 54, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 51, (byte) 83, (byte) 75, (byte) 48, (byte) 54, (byte) 54 });
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) 504);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 53, (byte) 49, (byte) 53 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 53, (byte) 49, (byte) 53 });
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        boolean boolean12 = tarArchiveEntry8.isFIFO();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry8.fillGNUSparse0xData(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "11) test0099(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:02 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "3) test0099(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:02 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        byte[] byteArray3 = new byte[] { (byte) 83, (byte) 10, (byte) 55 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 83, (byte) 10, (byte) 55 });
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserId(0L);
        tarArchiveEntry2.setUserId((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        tarArchiveEntry2.setModTime((long) 155);
        byte[] byteArray12 = new byte[] { (byte) 83, (byte) 0, (byte) 0, (byte) 54, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray12, zipEncoding13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 83, (byte) 0, (byte) 0, (byte) 54, (byte) 50 });
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setModTime((long) (byte) 48);
        org.junit.Assert.assertNotNull(date3);
// flaky "12) test0104(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:02 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "4) test0104(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:02 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setUserId((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 76, (byte) 103 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "13) test0106(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:02 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) 76, (byte) 103 });
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date12 = tarArchiveEntry11.getLastModifiedDate();
        boolean boolean13 = tarArchiveEntry11.isCharacterDevice();
        tarArchiveEntry11.setUserName("hi!");
        tarArchiveEntry11.setGroupName("");
        java.util.Date date18 = tarArchiveEntry11.getModTime();
        tarArchiveEntry2.setModTime(date18);
        byte[] byteArray20 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray20, zipEncoding21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(date12);
// flaky "14) test0107(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:02 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "5) test0107(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:02 ICT 2026");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        byte[] byteArray12 = new byte[] { (byte) 83, (byte) 1, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray12, zipEncoding13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 83, (byte) 1, (byte) 103 });
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        byte[] byteArray8 = new byte[] { (byte) 55 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray8, zipEncoding9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 55 });
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        byte[] byteArray8 = new byte[] { (byte) 55 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray8, zipEncoding9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 55 });
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
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
        org.junit.Assert.assertNotNull(date5);
// flaky "15) test0111(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "6) test0111(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        java.lang.Class<?> wildcardClass7 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray7, zipEncoding8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1 });
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 103 };
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
        org.junit.Assert.assertNotNull(date5);
// flaky "16) test0115(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "7) test0115(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 103 });
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        byte[] byteArray2 = new byte[] { (byte) 48, (byte) 49 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 48, (byte) 49 });
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setNames("0\000", "");
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14, zipEncoding15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "17) test0118(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "8) test0118(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap21);
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
// flaky "18) test0119(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_BLK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 52 + "'", byte0 == (byte) 52);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "19) test0121(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:03 ICT 2026");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 52, (byte) 76, (byte) 54, (byte) 83 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        byte[] byteArray8 = new byte[] { (byte) 50, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray8, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "20) test0123(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 50, (byte) 103 });
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) 54, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "21) test0125(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 0, (byte) 54, (byte) -1, (byte) 1 });
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "22) test0126(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "9) test0126(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:03 ICT 2026");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "0\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setLinkName("0\000");
        byte[] byteArray15 = new byte[] { (byte) 52, (byte) 88, (byte) 55 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 52, (byte) 88, (byte) 55 });
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        long long19 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky "23) test0129(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        boolean boolean13 = tarArchiveEntry2.isStarSparse();
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
        org.junit.Assert.assertNotNull(date12);
// flaky "24) test0130(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:03 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setSize(35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.util.Date date12 = tarArchiveEntry2.getModTime();
        boolean boolean13 = tarArchiveEntry2.isStarSparse();
        java.lang.Class<?> wildcardClass14 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "25) test0132(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        byte[] byteArray9 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray9, zipEncoding10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        tarArchiveEntry2.setModTime(100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        byte[] byteArray5 = new byte[] { (byte) 103, (byte) 88, (byte) 76, (byte) 51, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 103, (byte) 88, (byte) 76, (byte) 51, (byte) 1 });
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isSymbolicLink();
        java.lang.Class<?> wildcardClass10 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky "26) test0137(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        byte[] byteArray2 = new byte[] { (byte) 53, (byte) 76 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 53, (byte) 76 });
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setName("././@LongLink");
        tarArchiveEntry3.setDevMajor(100);
        boolean boolean9 = tarArchiveEntry3.isSymbolicLink();
        tarArchiveEntry3.setSize((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        tarArchiveEntry2.setGroupId((long) (byte) 100);
        boolean boolean11 = tarArchiveEntry2.isGNULongLinkEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = tarArchiveEntry2.equals(tarArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "27) test0140(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "10) test0140(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setGroupId((int) (byte) 1);
        tarArchiveEntry2.setUserName("\000\000");
        boolean boolean13 = tarArchiveEntry2.isBlockDevice();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        java.util.Date date18 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date14);
// flaky "28) test0143(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "11) test0143(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date18);
// flaky "1) test0143(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:04 ICT 2026");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        byte[] byteArray6 = new byte[] { (byte) 54, (byte) 100, (byte) 75, (byte) 53, (byte) 100, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 54, (byte) 100, (byte) 75, (byte) 53, (byte) 100, (byte) 1 });
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFIFO();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setIds((int) (byte) 88, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(" \000", (byte) 10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray1, zipEncoding2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
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
        org.junit.Assert.assertNotNull(date5);
// flaky "29) test0148(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "12) test0148(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        byte[] byteArray8 = new byte[] { (byte) 120, (byte) 88, (byte) 52 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray8, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 120, (byte) 88, (byte) 52 });
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        tarArchiveEntry2.setModTime((long) 1000);
        byte[] byteArray13 = new byte[] { (byte) 53, (byte) 76, (byte) 120, (byte) 55 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "30) test0150(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 53, (byte) 76, (byte) 120, (byte) 55 });
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        java.lang.Class<?> wildcardClass5 = date4.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky "31) test0151(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertNotNull(date4);
// flaky "13) test0151(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        long long4 = tarArchiveEntry2.getSize();
        java.lang.String str5 = tarArchiveEntry2.getLinkName();
        boolean boolean6 = tarArchiveEntry2.isSymbolicLink();
        java.lang.String str7 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertNotNull(date3);
// flaky "32) test0153(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:04 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        byte[] byteArray2 = new byte[] { (byte) 55, (byte) 75 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 55, (byte) 75 });
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupId((int) (byte) 10);
        byte[] byteArray13 = new byte[] { (byte) 83, (byte) 1, (byte) 51, (byte) 53 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 83, (byte) 1, (byte) 51, (byte) 53 });
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 83);
        boolean boolean3 = tarArchiveEntry2.isPaxGNUSparse();
        byte[] byteArray7 = new byte[] { (byte) 55, (byte) 48, (byte) 50 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 55, (byte) 48, (byte) 50 });
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        boolean boolean15 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSparse();
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
// flaky "33) test0158(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "14) test0158(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        byte[] byteArray6 = new byte[] { (byte) 103, (byte) 100, (byte) 100, (byte) 48, (byte) 51, (byte) 48 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 103, (byte) 100, (byte) 100, (byte) 48, (byte) 51, (byte) 48 });
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setGroupId((long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "34) test0160(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:05 ICT 2026");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        byte[] byteArray27 = new byte[] { (byte) 52, (byte) 53, (byte) -1, (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray27, zipEncoding28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "35) test0161(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 52, (byte) 53, (byte) -1, (byte) 54 });
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setSize((long) (byte) 53);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "36) test0162(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "15) test0162(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:05 ICT 2026");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isLink();
        boolean boolean6 = tarArchiveEntry3.isGlobalPaxHeader();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillStarSparseData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.parseTarHeader(byteArray20, zipEncoding21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "37) test0164(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "16) test0164(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 1 });
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        long long4 = tarArchiveEntry2.getSize();
        java.lang.String str5 = tarArchiveEntry2.getLinkName();
        boolean boolean6 = tarArchiveEntry2.isSymbolicLink();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "38) test0165(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isGNULongNameEntry();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        byte[] byteArray4 = new byte[] { (byte) 48, (byte) 100, (byte) 54, (byte) 53 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 48, (byte) 100, (byte) 54, (byte) 53 });
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        byte[] byteArray13 = new byte[] { (byte) 51, (byte) 103, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 51, (byte) 103, (byte) 1 });
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        long long4 = tarArchiveEntry2.getSize();
        java.lang.String str5 = tarArchiveEntry2.getLinkName();
        boolean boolean6 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean7 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertNotNull(date3);
// flaky "39) test0170(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        byte[] byteArray4 = new byte[] { (byte) 50, (byte) 88, (byte) 48, (byte) 52 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 50, (byte) 88, (byte) 48, (byte) 52 });
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        tarArchiveEntry2.setModTime((long) 155);
        boolean boolean7 = tarArchiveEntry2.isSparse();
        boolean boolean8 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 120);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setSize((long) 1000);
        long long8 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setSize((long) (byte) 53);
        tarArchiveEntry2.setUserName("");
        tarArchiveEntry2.setIds((-1), (int) (byte) 75);
        java.lang.Class<?> wildcardClass17 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky "40) test0175(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "17) test0175(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        byte[] byteArray1 = new byte[] { (byte) 83 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 83 });
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        int int11 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setIds(10240, (int) (byte) 10);
        org.junit.Assert.assertNotNull(date3);
// flaky "41) test0177(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.lang.Class<?> wildcardClass3 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isStarSparse();
        int int8 = tarArchiveEntry3.getMode();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        boolean boolean4 = tarArchiveEntry2.isBlockDevice();
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        byte[] byteArray1 = new byte[] { (byte) 75 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 75 });
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean7 = tarArchiveEntry2.equals(tarArchiveEntry6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000");
        boolean boolean2 = tarArchiveEntry1.isFile();
        tarArchiveEntry1.setModTime((-1L));
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.fillGNUSparse1xData(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        int int10 = tarArchiveEntry2.getGroupId();
        byte[] byteArray16 = new byte[] { (byte) 51, (byte) 49, (byte) 54, (byte) 100, (byte) 75 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "42) test0184(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 51, (byte) 49, (byte) 54, (byte) 100, (byte) 75 });
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "43) test0185(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:05 ICT 2026");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isFile();
        boolean boolean11 = tarArchiveEntry2.equals((java.lang.Object) '4');
        byte[] byteArray17 = new byte[] { (byte) 54, (byte) 52, (byte) 1, (byte) 55, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray17, zipEncoding18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "44) test0186(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 54, (byte) 52, (byte) 1, (byte) 55, (byte) 50 });
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse0xData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        tarArchiveEntry2.setGroupId(32L);
        tarArchiveEntry2.setUserId((int) (byte) 76);
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
// flaky "45) test0188(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "18) test0188(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        long long5 = tarArchiveEntry2.getRealSize();
        boolean boolean6 = tarArchiveEntry2.isGNULongLinkEntry();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "46) test0189(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:05 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (short) 1, 155);
        int int8 = tarArchiveEntry2.getMode();
        long long9 = tarArchiveEntry2.getSize();
        byte[] byteArray13 = new byte[] { (byte) 83, (byte) 54, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 83, (byte) 54, (byte) -1 });
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", true);
        byte[] byteArray4 = new byte[] { (byte) 55 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 55 });
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        byte[] byteArray21 = new byte[] { (byte) 103, (byte) 50, (byte) 55, (byte) 51, (byte) 54, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(date14);
// flaky "47) test0192(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 103, (byte) 50, (byte) 55, (byte) 51, (byte) 54, (byte) 54 });
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isOldGNUSparse();
        byte[] byteArray12 = new byte[] { (byte) 52, (byte) 100, (byte) 88, (byte) 120, (byte) 53, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray12, zipEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 52, (byte) 100, (byte) 88, (byte) 120, (byte) 53, (byte) 88 });
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setUserId((long) 263);
        byte[] byteArray9 = new byte[] { (byte) 120, (byte) 103, (byte) 75 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 120, (byte) 103, (byte) 75 });
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        java.lang.Class<?> wildcardClass7 = date6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "48) test0196(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isSymbolicLink();
        int int10 = tarArchiveEntry2.getMode();
        byte[] byteArray12 = new byte[] { (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12, zipEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "49) test0197(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33188 + "'", int10 == 33188);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 103 });
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, " \000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        byte[] byteArray12 = new byte[] { (byte) 76 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "50) test0199(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "19) test0199(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 76 });
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        byte[] byteArray17 = new byte[] { (byte) 103, (byte) 76, (byte) 49, (byte) 48, (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray17, zipEncoding18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 103, (byte) 76, (byte) 49, (byte) 48, (byte) 76 });
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 49, true);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse0xData(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        boolean boolean15 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "51) test0202(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "20) test0202(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserId(0L);
        long long11 = tarArchiveEntry2.getLongUserId();
        boolean boolean12 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse0xData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 52, (byte) 103, (byte) 49 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 52, (byte) 103, (byte) 49 });
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        tarArchiveEntry2.setModTime((long) 155);
        java.lang.String str7 = tarArchiveEntry2.getName();
        boolean boolean8 = tarArchiveEntry2.isPaxHeader();
        byte[] byteArray9 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 88, (byte) 54, (byte) 55 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry9.writeEntryHeader(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[5]");
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
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 10, (byte) 88, (byte) 54, (byte) 55 });
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setUserId((int) '4');
        byte[] byteArray17 = new byte[] { (byte) 49, (byte) 48, (byte) 100, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray17, zipEncoding18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "52) test0208(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "21) test0208(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 49, (byte) 48, (byte) 100, (byte) 100 });
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setGroupId(35L);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 49, (byte) 88 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 49, (byte) 88 });
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        tarArchiveEntry2.setModTime((long) 155);
        tarArchiveEntry2.setGroupId(3);
        byte[] byteArray10 = new byte[] { (byte) 88 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0 });
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 120, (byte) 103, (byte) 75, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.writeEntryHeader(byteArray24, zipEncoding25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "53) test0211(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 120, (byte) 103, (byte) 75, (byte) 50 });
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getName();
        tarArchiveEntry3.setDevMinor(3);
        tarArchiveEntry3.setGroupId(8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar\000" + "'", str6, "ustar\000");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        boolean boolean10 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setNames("0\000", "");
        byte[] byteArray15 = new byte[] { (byte) 83 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 83 });
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 83, (byte) 54, (byte) 103, (byte) 53 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 83, (byte) 54, (byte) 103, (byte) 53 });
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        byte[] byteArray24 = new byte[] { (byte) 103, (byte) 53, (byte) 50, (byte) 49, (byte) 54, (byte) 50 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 117, (byte) 115, (byte) 116, (byte) 97, (byte) 114, (byte) 0 });
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isPaxGNUSparse();
        java.lang.Class<?> wildcardClass5 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        byte[] byteArray6 = new byte[] { (byte) 76, (byte) 48, (byte) 1, (byte) 88, (byte) 48, (byte) 88 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 76, (byte) 48, (byte) 1, (byte) 88, (byte) 48, (byte) 88 });
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 120, false);
        tarArchiveEntry3.setUserId((long) 148);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setDevMinor(3);
        java.lang.Class<?> wildcardClass10 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        java.lang.String str10 = tarArchiveEntry2.getUserName();
        byte[] byteArray16 = new byte[] { (byte) 51, (byte) 75, (byte) 75, (byte) 53, (byte) 75 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 51, (byte) 75, (byte) 75, (byte) 53, (byte) 75 });
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.io.File file10 = tarArchiveEntry2.getFile();
        java.util.Date date11 = tarArchiveEntry2.getModTime();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "54) test0221(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(date11);
// flaky "22) test0221(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:06 ICT 2026");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setModTime(0L);
        int int13 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33188 + "'", int13 == 33188);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setDevMinor(257);
        byte[] byteArray14 = new byte[] { (byte) 120, (byte) 10, (byte) -1, (byte) 83, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "55) test0223(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 120, (byte) 10, (byte) -1, (byte) 83, (byte) 1 });
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        byte[] byteArray24 = new byte[] { (byte) 50, (byte) 52 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "56) test0224(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 50, (byte) 52 });
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        tarArchiveEntry5.setUserName("././@LongLink");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray13);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray13, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(date17);
// flaky "57) test0225(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date17.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setNames(" \000", " \000");
        byte[] byteArray19 = new byte[] { (byte) 51, (byte) 1, (byte) 75, (byte) 100, (byte) 100, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray19, zipEncoding20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "58) test0226(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "23) test0226(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:06 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 51, (byte) 1, (byte) 75, (byte) 100, (byte) 100, (byte) 50 });
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        int int9 = tarArchiveEntry2.getUserId();
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        boolean boolean11 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
        boolean boolean10 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean11 = tarArchiveEntry2.isExtended();
        boolean boolean12 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setIds((int) (short) 1, 155);
        int int8 = tarArchiveEntry2.getGroupId();
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 155 + "'", int8 == 155);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        tarArchiveEntry2.setIds((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "59) test0230(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isFIFO();
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 54, (byte) 1, (byte) 76, (byte) 50, (byte) 53 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 117, (byte) 115, (byte) 116, (byte) 97, (byte) 114, (byte) 32 });
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        boolean boolean12 = tarArchiveEntry2.isStarSparse();
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setModTime(date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "60) test0232(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "24) test0232(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        int int6 = tarArchiveEntry2.getDevMinor();
        boolean boolean7 = tarArchiveEntry2.isBlockDevice();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 83, (byte) 54, (byte) 75, (byte) 120, (byte) 48 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 83, (byte) 54, (byte) 75, (byte) 120, (byte) 48 });
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 54, (byte) 52, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 54, (byte) 52, (byte) 120 });
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        byte[] byteArray23 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "61) test0235(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 100 });
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        long long5 = tarArchiveEntry3.getRealSize();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setIds((int) 'a', (int) (byte) 54);
        tarArchiveEntry3.setGroupId((long) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        byte[] byteArray6 = new byte[] { (byte) 52, (byte) 52, (byte) 50, (byte) 88, (byte) 54, (byte) 120 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 52, (byte) 52, (byte) 50, (byte) 88, (byte) 54, (byte) 120 });
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 88, (byte) 48, (byte) 83, (byte) 52, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 88, (byte) 48, (byte) 83, (byte) 52, (byte) 1 });
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.Class<?> wildcardClass18 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "62) test0239(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", false);
        long long3 = tarArchiveEntry2.getRealSize();
        boolean boolean4 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry12.fillGNUSparse0xData(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str11 = tarArchiveEntry2.getUserName();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap12);
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
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
        byte[] byteArray26 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "63) test0243(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "25) test0243(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "2) test0243(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(date24);
// flaky "1) test0243(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        byte[] byteArray4 = new byte[] { (byte) 51, (byte) 120, (byte) 103, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 51, (byte) 120, (byte) 103, (byte) 54 });
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 120);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        byte[] byteArray7 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        byte[] byteArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "64) test0247(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "26) test0247(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setDevMinor((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minor device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "65) test0248(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 120);
        java.lang.String str3 = tarArchiveEntry2.getGroupName();
        java.lang.Class<?> wildcardClass4 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        boolean boolean4 = tarArchiveEntry2.isBlockDevice();
        boolean boolean5 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getName();
        tarArchiveEntry3.setDevMinor(3);
        byte[] byteArray11 = new byte[] { (byte) 49, (byte) 0 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray11, zipEncoding12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar\000" + "'", str6, "ustar\000");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 49, (byte) 0 });
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setDevMajor(31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "66) test0252(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "27) test0252(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        byte[] byteArray22 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.parseTarHeader(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "67) test0253(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        byte[] byteArray20 = new byte[] { (byte) 52, (byte) 54, (byte) 52, (byte) 49, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "68) test0254(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "28) test0254(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:07 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 52, (byte) 54, (byte) 52, (byte) 49, (byte) 1 });
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isSymbolicLink();
        byte[] byteArray7 = new byte[] { (byte) 52 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 52 });
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isSparse();
        byte[] byteArray14 = new byte[] { (byte) 120, (byte) 50, (byte) 52, (byte) 0, (byte) 1, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray14, zipEncoding15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "69) test0256(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "29) test0256(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 120, (byte) 50, (byte) 52, (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setGroupId((int) (byte) 1);
        tarArchiveEntry2.setUserName("\000\000");
        java.util.Date date13 = tarArchiveEntry2.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date13);
// flaky "70) test0257(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:08 ICT 2026");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        byte[] byteArray9 = new byte[] { (byte) 55, (byte) 88, (byte) 120 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray9, zipEncoding10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "71) test0258(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 55, (byte) 88, (byte) 120 });
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.Class<?> wildcardClass5 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky "72) test0259(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.fillGNUSparse1xData(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky "73) test0260(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:08 ICT 2026");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 120, false);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        byte[] byteArray7 = new byte[] { (byte) 75, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray7, zipEncoding8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 75, (byte) 100 });
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setGroupName("0\000");
        java.io.File file6 = tarArchiveEntry2.getFile();
        byte[] byteArray8 = new byte[] { (byte) 51 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray8, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "74) test0262(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 51 });
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        byte[] byteArray18 = new byte[] { (byte) 55, (byte) 0, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.writeEntryHeader(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "75) test0263(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "30) test0263(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 55, (byte) 0, (byte) 54 });
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setName("././@LongLink");
        tarArchiveEntry3.setDevMajor(100);
        boolean boolean9 = tarArchiveEntry3.isSymbolicLink();
        byte[] byteArray14 = new byte[] { (byte) 75, (byte) 53, (byte) 53, (byte) 49 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 75, (byte) 53, (byte) 53, (byte) 49 });
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setGroupId(0);
        byte[] byteArray15 = new byte[] { (byte) 50, (byte) 10, (byte) 50, (byte) 75 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray15, zipEncoding16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 50, (byte) 10, (byte) 50, (byte) 75 });
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        long long10 = tarArchiveEntry2.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray11 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean12 = tarArchiveEntry2.isLink();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray11);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray11, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        long long10 = tarArchiveEntry2.getSize();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry2.setUserId((int) (byte) 0);
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "ustar ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.lang.String str6 = tarArchiveEntry2.getName();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar " + "'", str6, "ustar ");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        tarArchiveEntry2.setIds(131, (int) (byte) 120);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "76) test0271(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "31) test0271(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 53, true);
        byte[] byteArray9 = new byte[] { (byte) 88, (byte) 53, (byte) 88, (byte) 52, (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray9, zipEncoding10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 88, (byte) 53, (byte) 88, (byte) 52, (byte) 54 });
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setGroupId(148);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "77) test0273(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "32) test0273(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setDevMajor(12);
        tarArchiveEntry2.setUserId((long) 155);
        boolean boolean9 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "78) test0274(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertNotNull(date4);
// flaky "33) test0274(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        byte[] byteArray3 = new byte[] { (byte) 55, (byte) 51, (byte) 48 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 55, (byte) 51, (byte) 48 });
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        java.util.Map<java.lang.String, java.lang.String> strMap44 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry35.fillGNUSparse1xData(strMap44);
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
// flaky "79) test0277(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        java.lang.Class<?> wildcardClass19 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray9, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 103, (byte) 48, (byte) 52 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.writeEntryHeader(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "80) test0279(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "34) test0279(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 103, (byte) 48, (byte) 52 });
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.fillStarSparseData(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 10, false);
        int int4 = tarArchiveEntry3.getGroupId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isGNULongNameEntry();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse1xData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isDirectory();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "81) test0283(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink", (byte) 53, true);
        boolean boolean4 = tarArchiveEntry3.isSymbolicLink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry3.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        int int7 = tarArchiveEntry2.getMode();
        byte[] byteArray9 = new byte[] { (byte) 88 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "82) test0285(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "35) test0285(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 88 });
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setLinkName("\000\000");
        boolean boolean12 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray13 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray13);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray13, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        byte[] byteArray3 = new byte[] { (byte) 76, (byte) 48, (byte) 50 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 76, (byte) 48, (byte) 50 });
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 83);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry6.setGroupId((-1));
        boolean boolean9 = tarArchiveEntry2.equals((java.lang.Object) (-1));
        boolean boolean10 = tarArchiveEntry2.isCharacterDevice();
        java.lang.Class<?> wildcardClass11 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
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
// flaky "83) test0289(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setSize((long) (byte) 53);
        tarArchiveEntry2.setDevMajor(32);
        org.junit.Assert.assertNotNull(date3);
// flaky "84) test0290(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "36) test0290(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:08 ICT 2026");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongUserId();
        boolean boolean9 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setUserName("ustar\000");
        org.junit.Assert.assertNotNull(date3);
// flaky "85) test0291(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        java.lang.String str7 = tarArchiveEntry2.getName();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "86) test0293(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:08 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ustar " + "'", str7, "ustar ");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        java.util.Date date5 = tarArchiveEntry3.getLastModifiedDate();
        boolean boolean6 = tarArchiveEntry3.isSymbolicLink();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky "87) test0294(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        byte[] byteArray1 = new byte[] { (byte) 76 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 76 });
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        byte[] byteArray6 = new byte[] { (byte) 49, (byte) 75, (byte) 50, (byte) 55, (byte) 53, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 49, (byte) 75, (byte) 50, (byte) 55, (byte) 53, (byte) 103 });
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        org.junit.Assert.assertNotNull(date5);
// flaky "88) test0297(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "37) test0297(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        long long10 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "89) test0298(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "38) test0298(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        byte[] byteArray4 = new byte[] { (byte) 49, (byte) 53, (byte) 55, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 49, (byte) 53, (byte) 55, (byte) 120 });
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        byte[] byteArray5 = new byte[] { (byte) 50, (byte) 52, (byte) 48, (byte) 49, (byte) 51 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 50, (byte) 52, (byte) 48, (byte) 49, (byte) 51 });
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        byte[] byteArray5 = new byte[] { (byte) 75, (byte) 1, (byte) 55, (byte) 49, (byte) 48 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 75, (byte) 1, (byte) 55, (byte) 49, (byte) 48 });
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        java.lang.Class<?> wildcardClass7 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        java.io.File file6 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setGroupId(4);
        boolean boolean9 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setIds((int) (byte) 100, (int) (byte) 51);
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setModTime(date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "90) test0303(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry12.fillGNUSparse1xData(strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 48, (byte) 88 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 48, (byte) 88 });
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        byte[] byteArray1 = new byte[] { (byte) 49 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray1, zipEncoding2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 49 });
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        long long7 = tarArchiveEntry3.getSize();
        long long8 = tarArchiveEntry3.getLongUserId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        long long8 = tarArchiveEntry2.getSize();
        boolean boolean9 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setIds(31, 16877);
        java.util.Date date13 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setIds((int) (byte) 51, 31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "91) test0308(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:09 ICT 2026");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        byte[] byteArray3 = new byte[] { (byte) 53, (byte) 83, (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 53, (byte) 83, (byte) 76 });
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getGroupName();
        tarArchiveEntry3.setUserName("");
        byte[] byteArray9 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray9, zipEncoding10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        boolean boolean7 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setDevMinor(0);
        java.lang.String str10 = tarArchiveEntry2.getLinkName();
        byte[] byteArray11 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "92) test0311(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "39) test0311(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        tarArchiveEntry2.setSize((long) (short) 10);
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray11, zipEncoding12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "93) test0312(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "40) test0312(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setName("././@LongLink");
        int int7 = tarArchiveEntry3.getGroupId();
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.setModTime(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setGroupId(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = tarArchiveEntry2.equals(tarArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setSize((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "94) test0315(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "41) test0315(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        java.io.File file6 = tarArchiveEntry2.getFile();
        tarArchiveEntry2.setUserId((int) (byte) 53);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "95) test0316(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        byte[] byteArray3 = new byte[] { (byte) 49, (byte) 0, (byte) 49 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 49, (byte) 0, (byte) 49 });
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        tarArchiveEntry2.setUserId((long) 2);
        byte[] byteArray10 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        long long8 = tarArchiveEntry2.getLongGroupId();
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        byte[] byteArray11 = new byte[] { (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 54 });
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        int int10 = tarArchiveEntry2.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        int int12 = tarArchiveEntry2.getMode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "96) test0320(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        long long10 = tarArchiveEntry2.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray11 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str12 = tarArchiveEntry2.getLinkName();
        boolean boolean13 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray11);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray11, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        long long12 = tarArchiveEntry10.getSize();
        tarArchiveEntry10.setDevMajor((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "97) test0323(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "42) test0323(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:09 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        java.lang.Class<?> wildcardClass14 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 504L + "'", long8 == 504L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        boolean boolean4 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupName("\000\000");
        java.lang.Class<?> wildcardClass7 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry9.fillStarSparseData(strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(date11);
// flaky "98) test0326(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean9 = tarArchiveEntry2.isLink();
        boolean boolean10 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "99) test0327(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        byte[] byteArray5 = new byte[] { (byte) 54, (byte) 51, (byte) 10, (byte) -1, (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 54, (byte) 51, (byte) 10, (byte) -1, (byte) 54 });
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setNames(" \000", " \000");
        java.util.Date date13 = tarArchiveEntry2.getModTime();
        boolean boolean14 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "100) test0329(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "43) test0329(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky "3) test0329(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        boolean boolean8 = tarArchiveEntry2.isSparse();
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setIds(155, 96);
        tarArchiveEntry2.setSize(2097151L);
        boolean boolean15 = tarArchiveEntry2.isFile();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry9.fillGNUSparse0xData(strMap35);
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
// flaky "101) test0331(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date30.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        long long5 = tarArchiveEntry3.getRealSize();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        long long7 = tarArchiveEntry3.getSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        tarArchiveEntry2.setGroupId((long) (byte) 50);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tar\000" + "'", str16, "tar\000");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        boolean boolean10 = tarArchiveEntry2.isLink();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        boolean boolean12 = tarArchiveEntry2.isCharacterDevice();
        byte[] byteArray13 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray13, zipEncoding14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        long long5 = tarArchiveEntry3.getLongGroupId();
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.setModTime(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", true);
        tarArchiveEntry2.setNames("", "hi!");
        tarArchiveEntry2.setLinkName(" \000");
        int int8 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        byte[] byteArray7 = new byte[] { (byte) 49 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray7, zipEncoding8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 49 });
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isFIFO();
        tarArchiveEntry3.setUserId((long) 96);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", false);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 51, (byte) 100, (byte) 88 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0 });
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 55);
        boolean boolean20 = tarArchiveEntry2.equals((java.lang.Object) (byte) 55);
        org.junit.Assert.assertNotNull(date3);
// flaky "102) test0340(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(date11);
// flaky "44) test0340(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "4) test0340(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setModTime((long) (byte) 75);
        byte[] byteArray15 = new byte[] { (byte) 54 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.parseTarHeader(byteArray15, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "103) test0341(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "45) test0341(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 54 });
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isFile();
        int int10 = tarArchiveEntry2.getDevMajor();
        byte[] byteArray11 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray11, zipEncoding12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "104) test0342(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 54);
        boolean boolean3 = tarArchiveEntry2.isPaxHeader();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setLinkName("\000\000");
        tarArchiveEntry2.setUserId((long) 508);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        int int9 = tarArchiveEntry2.getDevMinor();
        boolean boolean10 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setUserId((long) (short) 10);
        tarArchiveEntry2.setGroupId(155);
        boolean boolean15 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "105) test0345(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setSize((long) (byte) 1);
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setDevMinor((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minor device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        byte[] byteArray20 = new byte[] { (byte) 48, (byte) 75, (byte) 75, (byte) 48 };
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 48, (byte) 75, (byte) 75, (byte) 48 });
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        byte[] byteArray4 = new byte[] { (byte) 88, (byte) 51, (byte) 55, (byte) 49 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 88, (byte) 51, (byte) 55, (byte) 49 });
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isFile();
        int int6 = tarArchiveEntry3.getDevMinor();
        long long7 = tarArchiveEntry3.getSize();
        byte[] byteArray11 = new byte[] { (byte) 103, (byte) 53, (byte) 0 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray11, zipEncoding12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 103, (byte) 53, (byte) 0 });
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setGroupId((int) (byte) 0);
        tarArchiveEntry2.setIds((int) '#', 0);
        java.util.Date date10 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setDevMinor((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "106) test0351(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:10 ICT 2026");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        byte[] byteArray27 = new byte[] { (byte) 51, (byte) 49, (byte) 100, (byte) 120, (byte) 54, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray27, zipEncoding28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "107) test0352(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "46) test0352(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "5) test0352(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 51, (byte) 49, (byte) 100, (byte) 120, (byte) 54, (byte) 88 });
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        java.lang.String str12 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ustar " + "'", str12, "ustar ");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        tarArchiveEntry2.setDevMinor(504);
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setMode(1000);
        java.lang.String str14 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        byte[] byteArray20 = new byte[] { (byte) 54, (byte) -1, (byte) 120, (byte) 10, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray20, zipEncoding21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 54, (byte) -1, (byte) 120, (byte) 10, (byte) 100 });
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        byte[] byteArray27 = new byte[] { (byte) 83, (byte) 76, (byte) 49, (byte) 50, (byte) 75 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray27, zipEncoding28, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "108) test0356(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "47) test0356(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 83, (byte) 76, (byte) 49, (byte) 50, (byte) 75 });
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        byte[] byteArray4 = new byte[] { (byte) 103, (byte) 88, (byte) 51, (byte) 83 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 103, (byte) 88, (byte) 51, (byte) 83 });
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        java.util.Date date21 = tarArchiveEntry2.getModTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "109) test0358(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "48) test0358(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky "6) test0358(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:10 ICT 2026");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        long long5 = tarArchiveEntry3.getRealSize();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setIds((int) 'a', (int) (byte) 54);
        tarArchiveEntry3.setLinkName("tar\000");
        boolean boolean12 = tarArchiveEntry3.isSymbolicLink();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setName("ustar\000");
        int int9 = tarArchiveEntry3.getDevMinor();
        tarArchiveEntry3.setGroupName(" \000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 48 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100, (byte) 48 });
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", (byte) 0, true);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.setSize((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Size is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isLink();
        boolean boolean9 = tarArchiveEntry2.isGlobalPaxHeader();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1, (byte) 52, (byte) 83 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "110) test0363(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 1, (byte) 52, (byte) 83 });
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        tarArchiveEntry15.setLinkName("");
        tarArchiveEntry15.setGroupName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "111) test0364(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "49) test0364(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:10 ICT 2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isOldGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse1xData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        byte[] byteArray3 = new byte[] { (byte) 51, (byte) 53, (byte) 83 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 51, (byte) 53, (byte) 83 });
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        boolean boolean9 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setLinkName("\000\000");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray12 = tarArchiveEntry2.getDirectoryEntries();
        byte[] byteArray13 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray13, zipEncoding14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray12);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray12, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        tarArchiveEntry2.setLinkName(" \000");
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
// flaky "112) test0368(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date35.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        boolean boolean3 = tarArchiveEntry1.isFIFO();
        boolean boolean4 = tarArchiveEntry1.isStarSparse();
        long long5 = tarArchiveEntry1.getRealSize();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.fillGNUSparse1xData(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky "113) test0369(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean5 = tarArchiveEntry2.isOldGNUSparse();
        org.junit.Assert.assertNotNull(date3);
// flaky "114) test0370(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(date4);
// flaky "50) test0370(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setLinkName("tar\000");
        tarArchiveEntry2.setNames("hi!", " \000");
        boolean boolean17 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setUserId((long) 508);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "115) test0371(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "51) test0371(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setModTime(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "116) test0372(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 52, (byte) 50 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 52, (byte) 50 });
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 49, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33188 + "'", int15 == 33188);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 49, (byte) 1 });
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry13.fillGNUSparse1xData(strMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "117) test0375(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "52) test0375(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:11 ICT 2026");
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        boolean boolean7 = tarArchiveEntry3.isStarSparse();
        int int8 = tarArchiveEntry3.getGroupId();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillStarSparseData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 55, false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        boolean boolean26 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        tarArchiveEntry2.setName("00");
        int int11 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        boolean boolean14 = tarArchiveEntry2.isSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "118) test0380(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33188 + "'", int12 == 33188);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
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
        boolean boolean26 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "119) test0381(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "53) test0381(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "7) test0381(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date22.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(date24);
// flaky "2) test0381(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        byte[] byteArray11 = new byte[] { (byte) 88, (byte) 52 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray11, zipEncoding12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ustar " + "'", str8, "ustar ");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 88, (byte) 52 });
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        int int9 = tarArchiveEntry2.getDevMinor();
        long long10 = tarArchiveEntry2.getSize();
        byte[] byteArray11 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(date8);
// flaky "120) test0383(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        tarArchiveEntry2.setGroupId(4);
        tarArchiveEntry2.setMode((int) (short) 100);
        java.util.Date date9 = tarArchiveEntry2.getLastModifiedDate();
        byte[] byteArray16 = new byte[] { (byte) 76, (byte) 1, (byte) 103, (byte) 49, (byte) 49, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "121) test0384(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "54) test0384(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 117, (byte) 115, (byte) 116, (byte) 97, (byte) 114, (byte) 32 });
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setUserId(100L);
        java.lang.String str12 = tarArchiveEntry2.getLinkName();
        int int13 = tarArchiveEntry2.getMode();
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 10 };
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33188 + "'", int13 == 33188);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setGroupName("\000\000");
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 55, (byte) 48, (byte) 88, (byte) 83, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray18, zipEncoding19, false);
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 55, (byte) 48, (byte) 88, (byte) 83, (byte) 1 });
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        byte[] byteArray23 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry7.parseTarHeader(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "122) test0387(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "55) test0387(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray15);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray15, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        byte[] byteArray29 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.parseTarHeader(byteArray29, zipEncoding30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "123) test0389(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "56) test0389(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "8) test0389(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        byte[] byteArray57 = new byte[] { (byte) 55, (byte) 88 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "124) test0390(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "57) test0390(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(date24);
// flaky "9) test0390(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date24.toString(), "Mon Sep 28 13:40:11 ICT 2026");
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
// flaky "3) test0390(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date50.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(date51);
// flaky "1) test0390(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date51.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 55, (byte) 88 });
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        tarArchiveEntry3.setName("././@LongLink");
        int int7 = tarArchiveEntry3.getGroupId();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillStarSparseData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = tarArchiveEntry2.equals(tarArchiveEntry19);
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        java.lang.Class<?> wildcardClass15 = tarArchiveEntry10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "125) test0393(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "58) test0393(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean8 = tarArchiveEntry2.isFIFO();
        long long9 = tarArchiveEntry2.getSize();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        byte[] byteArray17 = new byte[] { (byte) 51, (byte) 54, (byte) 51, (byte) 49, (byte) 54, (byte) 48 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 51, (byte) 54, (byte) 51, (byte) 49, (byte) 54, (byte) 48 });
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isBlockDevice();
        tarArchiveEntry2.setGroupId((-1L));
        java.util.Date date9 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = tarArchiveEntry2.equals(tarArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "126) test0396(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:11 ICT 2026");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        int int11 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertNotNull(date8);
// flaky "127) test0397(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        byte[] byteArray18 = new byte[] { (byte) 48, (byte) 51, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.writeEntryHeader(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "128) test0398(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "59) test0398(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:11 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 48, (byte) 51, (byte) 1 });
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        tarArchiveEntry2.setUserId(32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "129) test0399(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "60) test0399(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        boolean boolean9 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("././@LongLink");
        java.util.Date date2 = tarArchiveEntry1.getLastModifiedDate();
        java.lang.Class<?> wildcardClass3 = date2.getClass();
        org.junit.Assert.assertNotNull(date2);
// flaky "130) test0401(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean6 = tarArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertNotNull(date3);
// flaky "131) test0402(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        tarArchiveEntry10.setGroupId(35L);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) 53 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry10.writeEntryHeader(byteArray29, zipEncoding30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "132) test0403(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "61) test0403(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date20);
// flaky "10) test0403(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date20.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date21);
// flaky "4) test0403(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date21.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) 53 });
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 49, true);
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        tarArchiveEntry2.setGroupName("");
        java.util.Date date9 = tarArchiveEntry2.getModTime();
        boolean boolean10 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean11 = tarArchiveEntry2.isPaxHeader();
        tarArchiveEntry2.setMode(504);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "133) test0405(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "62) test0405(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        boolean boolean6 = tarArchiveEntry2.isFile();
        boolean boolean7 = tarArchiveEntry2.isFile();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        int int9 = tarArchiveEntry2.getDevMinor();
        long long10 = tarArchiveEntry2.getSize();
        byte[] byteArray14 = new byte[] { (byte) 83, (byte) 0, (byte) 76 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14, zipEncoding15);
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
// flaky "134) test0406(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 83, (byte) 0, (byte) 76 });
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(155);
        int int11 = tarArchiveEntry2.getMode();
        java.util.Date date12 = tarArchiveEntry2.getLastModifiedDate();
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 76, (byte) 120 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33188 + "'", int11 == 33188);
        org.junit.Assert.assertNotNull(date12);
// flaky "135) test0407(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 76, (byte) 120 });
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setUserName("00");
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 51, (byte) 49, (byte) 53, (byte) 52 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 51, (byte) 49, (byte) 53, (byte) 52 });
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        boolean boolean9 = tarArchiveEntry2.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setModTime(0L);
        boolean boolean13 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setIds(148, (int) ' ');
        byte[] byteArray23 = new byte[] { (byte) 48, (byte) 53, (byte) 83, (byte) 54, (byte) 100, (byte) 103 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray23);
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
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 117, (byte) 115, (byte) 116, (byte) 97, (byte) 114, (byte) 32 });
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        tarArchiveEntry11.setGroupName("0\000");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.fillStarSparseData(strMap22);
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
// flaky "136) test0410(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "63) test0410(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray7 = tarArchiveEntry2.getDirectoryEntries();
        tarArchiveEntry2.setMode(32);
        byte[] byteArray16 = new byte[] { (byte) 49, (byte) 10, (byte) 103, (byte) 83, (byte) 53, (byte) 83 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray16, zipEncoding17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
// flaky "137) test0411(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray7);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray7, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 49, (byte) 10, (byte) 103, (byte) 83, (byte) 53, (byte) 83 });
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        int int4 = tarArchiveEntry2.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        int int10 = tarArchiveEntry8.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        tarArchiveEntry2.setIds(131, (int) (byte) 120);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "138) test0412(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray5, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertNotNull(date9);
// flaky "64) test0412(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        boolean boolean21 = tarArchiveEntry15.isFIFO();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "139) test0413(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "65) test0413(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        byte[] byteArray4 = new byte[] { (byte) 49, (byte) 55, (byte) 83, (byte) 103 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 49, (byte) 55, (byte) 83, (byte) 103 });
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setMode(0);
        boolean boolean11 = tarArchiveEntry2.isExtended();
        java.lang.String str12 = tarArchiveEntry2.getName();
        byte[] byteArray13 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray13, zipEncoding14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ustar " + "'", str12, "ustar ");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
            tarArchiveEntry10.fillGNUSparse1xData(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "140) test0416(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "66) test0416(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCheckSumOK();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        java.io.File file6 = tarArchiveEntry2.getFile();
        byte[] byteArray7 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray7, zipEncoding8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "141) test0417(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(155);
        tarArchiveEntry2.setDevMajor(0);
        tarArchiveEntry2.setGroupId((int) (short) 100);
        byte[] byteArray15 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray15, zipEncoding16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        boolean boolean15 = tarArchiveEntry2.isStarSparse();
        byte[] byteArray17 = new byte[] { (byte) 0 };
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "142) test0419(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(date14);
// flaky "67) test0419(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setSize((long) 1);
        byte[] byteArray12 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray12, zipEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "143) test0420(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "68) test0420(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 54, true);
        java.lang.Class<?> wildcardClass4 = tarArchiveEntry3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        tarArchiveEntry2.setSize((long) (byte) 49);
        java.lang.String str10 = tarArchiveEntry2.getName();
        boolean boolean11 = tarArchiveEntry2.isSymbolicLink();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillStarSparseData(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ustar " + "'", str10, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        tarArchiveEntry2.setMode((int) (byte) 48);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "144) test0423(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "69) test0423(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:12 ICT 2026");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        boolean boolean20 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "145) test0424(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "70) test0424(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000");
        tarArchiveEntry1.setUserId((long) (byte) 53);
        tarArchiveEntry1.setLinkName("");
        byte[] byteArray12 = new byte[] { (byte) 52, (byte) 88, (byte) 10, (byte) 49, (byte) 54, (byte) 76 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.parseTarHeader(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 52, (byte) 88, (byte) 10, (byte) 49, (byte) 54, (byte) 76 });
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        tarArchiveEntry2.setModTime((long) 155);
        boolean boolean7 = tarArchiveEntry2.isSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        int int10 = tarArchiveEntry2.getDevMinor();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        boolean boolean12 = tarArchiveEntry2.isPaxGNUSparse();
        tarArchiveEntry2.setMode((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        byte[] byteArray4 = new byte[] { (byte) 51, (byte) 1, (byte) 51, (byte) 103 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 51, (byte) 1, (byte) 51, (byte) 103 });
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setSize((long) 32);
        int int10 = tarArchiveEntry2.getDevMinor();
        int int11 = tarArchiveEntry2.getUserId();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", true);
        int int3 = tarArchiveEntry2.getMode();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.lang.Class<?> wildcardClass5 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33188 + "'", int3 == 33188);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.util.Map<java.lang.String, java.lang.String> strMap34 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap34);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        int int7 = tarArchiveEntry2.getMode();
        tarArchiveEntry2.setNames("00", "");
        tarArchiveEntry2.setGroupId(0);
        boolean boolean13 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "146) test0432(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "71) test0432(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setDevMajor(33188);
        int int9 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 76, true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.fillGNUSparse0xData(strMap20);
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
// flaky "147) test0435(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "72) test0435(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33188 + "'", int16 == 33188);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setUserId(12);
        tarArchiveEntry2.setLinkName("\000\000");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "148) test0436(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:12 ICT 2026");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        byte[] byteArray6 = new byte[] { (byte) 54, (byte) 0, (byte) 76, (byte) 88, (byte) 52, (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 54, (byte) 0, (byte) 76, (byte) 88, (byte) 52, (byte) 100 });
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        byte[] byteArray4 = new byte[] { (byte) 53, (byte) 76, (byte) 50, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 53, (byte) 76, (byte) 50, (byte) 1 });
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 10);
        byte[] byteArray3 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 2 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setNames("00", "hi!");
        boolean boolean8 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean9 = tarArchiveEntry3.isFile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        byte[] byteArray5 = new byte[] { (byte) 88, (byte) 76, (byte) 88, (byte) 10, (byte) 88 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 88, (byte) 76, (byte) 88, (byte) 10, (byte) 88 });
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        tarArchiveEntry15.setDevMajor((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "149) test0442(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "73) test0442(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:12 ICT 2026");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) 504);
        boolean boolean9 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", false);
        tarArchiveEntry12.setUserId((int) (byte) 0);
        boolean boolean15 = tarArchiveEntry12.isPaxGNUSparse();
        java.lang.String str16 = tarArchiveEntry12.getUserName();
        boolean boolean17 = tarArchiveEntry2.equals(tarArchiveEntry12);
        byte[] byteArray22 = new byte[] { (byte) 83, (byte) 103, (byte) 50, (byte) 48 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry12.parseTarHeader(byteArray22, zipEncoding23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 83, (byte) 103, (byte) 50, (byte) 48 });
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        tarArchiveEntry2.setSize((long) (byte) 10);
        tarArchiveEntry2.setUserId((int) (byte) 10);
        int int10 = tarArchiveEntry2.getGroupId();
        boolean boolean11 = tarArchiveEntry2.isGlobalPaxHeader();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isExtended();
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        java.lang.Class<?> wildcardClass10 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        java.util.Date date23 = tarArchiveEntry7.getModTime();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry7.setDevMajor((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Major device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(date10);
// flaky "150) test0446(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "74) test0446(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray15);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray15, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date23);
// flaky "11) test0446(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date23.toString(), "Mon Sep 28 13:40:13 ICT 2026");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setNames("00", "hi!");
        boolean boolean8 = tarArchiveEntry3.isCharacterDevice();
        java.lang.Class<?> wildcardClass9 = tarArchiveEntry3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        int int7 = tarArchiveEntry3.getDevMinor();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        tarArchiveEntry2.setName("ustar ");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray14);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray14, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getDevMinor();
        java.lang.String str8 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setModTime((long) 512);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.setModTime((long) (byte) 52);
        org.junit.Assert.assertNotNull(date3);
// flaky "151) test0451(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 1, false);
        boolean boolean4 = tarArchiveEntry3.isCheckSumOK();
        boolean boolean5 = tarArchiveEntry3.isSparse();
        byte[] byteArray8 = new byte[] { (byte) 55, (byte) 53 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 4 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 55, (byte) 53 });
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", (byte) 53);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        tarArchiveEntry3.setModTime(date9);
        boolean boolean11 = tarArchiveEntry3.isOldGNUSparse();
        tarArchiveEntry3.setNames("0\000", "00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "152) test0454(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry13.fillGNUSparse1xData(strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "153) test0455(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "75) test0455(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ustar " + "'", str9, "ustar ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        boolean boolean6 = tarArchiveEntry2.isGNUSparse();
        boolean boolean7 = tarArchiveEntry2.isExtended();
        byte[] byteArray12 = new byte[] { (byte) 50, (byte) 76, (byte) 49, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray12, zipEncoding13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
// flaky "154) test0456(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 50, (byte) 76, (byte) 49, (byte) 10 });
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", (byte) 88, true);
        boolean boolean4 = tarArchiveEntry3.isGNULongLinkEntry();
        tarArchiveEntry3.setGroupId((int) (byte) 55);
        long long7 = tarArchiveEntry3.getLongUserId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        tarArchiveEntry10.setIds(8, (int) (byte) 76);
        tarArchiveEntry10.setMode(16877);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        boolean boolean16 = tarArchiveEntry12.isExtended();
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        boolean boolean6 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setGroupId((long) (byte) 10);
        long long9 = tarArchiveEntry2.getLongUserId();
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        long long11 = tarArchiveEntry2.getRealSize();
        byte[] byteArray13 = new byte[] { (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 54 });
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        tarArchiveEntry10.setUserName("0\000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "155) test0461(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date13.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "76) test0461(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        tarArchiveEntry2.setModTime((long) (byte) 50);
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        tarArchiveEntry2.setSize((long) 504);
        java.lang.String str8 = tarArchiveEntry2.getLinkName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date12 = tarArchiveEntry11.getLastModifiedDate();
        boolean boolean13 = tarArchiveEntry11.isCharacterDevice();
        tarArchiveEntry11.setUserName("hi!");
        tarArchiveEntry11.setGroupName("");
        java.util.Date date18 = tarArchiveEntry11.getModTime();
        tarArchiveEntry2.setModTime(date18);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(date12);
// flaky "156) test0463(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky "77) test0463(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Mon Sep 28 13:40:13 ICT 2026");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setUserId((int) (byte) 1);
        boolean boolean9 = tarArchiveEntry2.isFile();
        byte[] byteArray11 = new byte[] { (byte) 53 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 53 });
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        long long5 = tarArchiveEntry3.getLongGroupId();
        int int6 = tarArchiveEntry3.getDevMajor();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.fillGNUSparse1xData(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setUserId((int) (byte) 53);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.lang.String str6 = tarArchiveEntry2.getName();
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 55, (byte) 1, (byte) 53, (byte) 51 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ustar " + "'", str6, "ustar ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 55, (byte) 1, (byte) 53, (byte) 51 });
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        boolean boolean4 = tarArchiveEntry3.isCharacterDevice();
        boolean boolean5 = tarArchiveEntry3.isPaxHeader();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date9 = tarArchiveEntry8.getLastModifiedDate();
        tarArchiveEntry3.setModTime(date9);
        boolean boolean11 = tarArchiveEntry3.isOldGNUSparse();
        java.lang.String str12 = tarArchiveEntry3.getUserName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "157) test0468(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        boolean boolean5 = tarArchiveEntry2.isPaxGNUSparse();
        java.io.File file6 = tarArchiveEntry2.getFile();
        boolean boolean7 = tarArchiveEntry2.isPaxGNUSparse();
        int int8 = tarArchiveEntry2.getDevMinor();
        byte[] byteArray9 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray9, zipEncoding10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        java.lang.String str5 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setLinkName("00");
        long long8 = tarArchiveEntry2.getRealSize();
        byte[] byteArray10 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "158) test0470(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ustar " + "'", str5, "ustar ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1 });
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        byte[] byteArray6 = new byte[] { (byte) 53, (byte) 75, (byte) 49, (byte) 88, (byte) -1, (byte) 48 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 53, (byte) 75, (byte) 49, (byte) 88, (byte) -1, (byte) 48 });
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", (byte) 1, true);
        boolean boolean4 = tarArchiveEntry3.isDirectory();
        boolean boolean5 = tarArchiveEntry3.isFile();
        int int6 = tarArchiveEntry3.getDevMajor();
        int int7 = tarArchiveEntry3.getGroupId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        int int4 = tarArchiveEntry3.getGroupId();
        boolean boolean5 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean6 = tarArchiveEntry3.isStarSparse();
        tarArchiveEntry3.setUserId(0L);
        java.lang.String str9 = tarArchiveEntry3.getLinkName();
        byte[] byteArray15 = new byte[] { (byte) 83, (byte) 54, (byte) 0, (byte) 51, (byte) 88 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 83, (byte) 54, (byte) 0, (byte) 51, (byte) 88 });
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        byte[] byteArray2 = new byte[] { (byte) 52, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 52, (byte) 88 });
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setDevMajor(16877);
        tarArchiveEntry2.setGroupId((int) (byte) 1);
        tarArchiveEntry2.setUserName("\000\000");
        boolean boolean13 = tarArchiveEntry2.isBlockDevice();
        byte[] byteArray16 = new byte[] { (byte) 48, (byte) 10 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray16, zipEncoding17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 48, (byte) 10 });
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        tarArchiveEntry3.setGroupId((-1));
        java.lang.String str6 = tarArchiveEntry3.getGroupName();
        tarArchiveEntry3.setGroupName("00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        long long6 = tarArchiveEntry2.getLongUserId();
        int int7 = tarArchiveEntry2.getMode();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean9 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33188 + "'", int7 == 33188);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        tarArchiveEntry2.setGroupId((long) 131);
        java.util.Date date5 = tarArchiveEntry2.getLastModifiedDate();
        tarArchiveEntry2.setName("00");
        org.junit.Assert.assertNotNull(date5);
// flaky "159) test0478(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:13 ICT 2026");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        java.lang.String str6 = tarArchiveEntry2.getGroupName();
        tarArchiveEntry2.setDevMajor(33188);
        tarArchiveEntry2.setIds(6, 10240);
        tarArchiveEntry2.setModTime((long) (byte) 75);
        java.lang.String str14 = tarArchiveEntry2.getUserName();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse1xData(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isSymbolicLink();
        boolean boolean8 = tarArchiveEntry2.isGNULongNameEntry();
        java.lang.Class<?> wildcardClass9 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertNotNull(date3);
// flaky "160) test0480(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0);
        tarArchiveEntry2.setMode((int) '#');
        tarArchiveEntry2.setModTime((long) 155);
        java.lang.String str7 = tarArchiveEntry2.getName();
        boolean boolean8 = tarArchiveEntry2.isPaxHeader();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.fillGNUSparse0xData(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        long long5 = tarArchiveEntry3.getRealSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.setDevMinor((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minor device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        tarArchiveEntry2.setLinkName("tar\000");
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        java.util.Date date6 = tarArchiveEntry2.getLastModifiedDate();
        java.util.Date date7 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky "161) test0483(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "78) test0483(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Mon Sep 28 13:40:13 ICT 2026");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        long long18 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        tarArchiveEntry2.setGroupId((long) 131);
        java.util.Date date5 = tarArchiveEntry2.getLastModifiedDate();
        int int6 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertNotNull(date5);
// flaky "162) test0485(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        java.util.Date date3 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean4 = tarArchiveEntry2.isCharacterDevice();
        tarArchiveEntry2.setUserName("hi!");
        boolean boolean7 = tarArchiveEntry2.isStarSparse();
        boolean boolean8 = tarArchiveEntry2.isGNULongLinkEntry();
        boolean boolean9 = tarArchiveEntry2.isSymbolicLink();
        int int10 = tarArchiveEntry2.getMode();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 52, (byte) 50 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
// flaky "163) test0486(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33188 + "'", int10 == 33188);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 52, (byte) 50 });
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long3 = tarArchiveEntry2.getSize();
        tarArchiveEntry2.setUserId((int) (byte) 10);
        int int6 = tarArchiveEntry2.getDevMinor();
        boolean boolean7 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray8 = tarArchiveEntry2.getDirectoryEntries();
        java.lang.String str9 = tarArchiveEntry2.getGroupName();
        boolean boolean10 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray8);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray8, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        tarArchiveEntry2.setGroupId((int) (byte) 0);
        tarArchiveEntry2.setLinkName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 0, false);
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setDevMinor(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ");
        boolean boolean11 = tarArchiveEntry2.isDescendent(tarArchiveEntry10);
        tarArchiveEntry10.setUserId((int) '#');
        boolean boolean14 = tarArchiveEntry10.isBlockDevice();
        boolean boolean15 = tarArchiveEntry10.isFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "164) test0490(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "79) test0490(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        tarArchiveEntry2.setUserId((long) 504);
        java.lang.String str17 = tarArchiveEntry2.getLinkName();
        byte[] byteArray21 = new byte[] { (byte) 76, (byte) 54, (byte) 51 };
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[3]");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 76, (byte) 54, (byte) 51 });
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        boolean boolean3 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean4 = tarArchiveEntry2.isFile();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserId((long) '#');
        boolean boolean9 = tarArchiveEntry2.isGNULongNameEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean11 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setLinkName("tar\000");
        tarArchiveEntry2.setNames("hi!", " \000");
        java.lang.Class<?> wildcardClass17 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(date5);
// flaky "165) test0492(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "80) test0492(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray10, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 103, true);
        java.lang.String str4 = tarArchiveEntry3.getLinkName();
        tarArchiveEntry3.setNames("00", "hi!");
        boolean boolean8 = tarArchiveEntry3.isBlockDevice();
        long long9 = tarArchiveEntry3.getSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", false);
        long long18 = tarArchiveEntry17.getSize();
        tarArchiveEntry17.setUserId((int) (byte) 10);
        boolean boolean21 = tarArchiveEntry17.isGlobalPaxHeader();
        tarArchiveEntry17.setGroupId((long) (byte) 10);
        boolean boolean24 = tarArchiveEntry17.isBlockDevice();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray25 = tarArchiveEntry17.getDirectoryEntries();
        tarArchiveEntry17.setModTime(0L);
        boolean boolean28 = tarArchiveEntry17.isStarSparse();
        int int29 = tarArchiveEntry17.getDevMajor();
        long long30 = tarArchiveEntry17.getLongGroupId();
        java.util.Date date31 = tarArchiveEntry17.getModTime();
        tarArchiveEntry2.setModTime(date31);
        org.junit.Assert.assertNotNull(date3);
// flaky "166) test0494(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray25);
        org.junit.Assert.assertArrayEquals(tarArchiveEntryArray25, new org.apache.commons.compress.archivers.tar.TarArchiveEntry[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        int int2 = tarArchiveEntry1.getUserId();
        java.lang.String str3 = tarArchiveEntry1.getGroupName();
        byte[] byteArray4 = new byte[] {};
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.writeEntryHeader(byteArray4, zipEncoding5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        long long19 = tarArchiveEntry2.getLongUserId();
        tarArchiveEntry2.setGroupId((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(date12);
// flaky "167) test0496(org.apache.commons.compress.archivers.tar.RegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Mon Sep 28 13:40:13 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("0\000", false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("00", (byte) 10, false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("tar\000", true);
        boolean boolean3 = tarArchiveEntry2.isPaxHeader();
        java.lang.Class<?> wildcardClass4 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar ", true);
        int int3 = tarArchiveEntry2.getMode();
        byte[] byteArray10 = new byte[] { (byte) 55, (byte) 51, (byte) -1, (byte) 51, (byte) 76, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray10, zipEncoding11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33188 + "'", int3 == 33188);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 55, (byte) 51, (byte) -1, (byte) 51, (byte) 76, (byte) 1 });
    }
}
