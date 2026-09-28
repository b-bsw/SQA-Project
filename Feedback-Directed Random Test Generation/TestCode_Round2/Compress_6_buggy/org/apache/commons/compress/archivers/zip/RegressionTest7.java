package org.apache.commons.compress.archivers.zip;

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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int7 = zipArchiveEntry6.getInternalAttributes();
        zipArchiveEntry6.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        long long13 = zipArchiveEntry12.getSize();
        zipArchiveEntry12.setMethod(10);
        zipArchiveEntry12.setInternalAttributes((int) (short) 0);
        long long18 = zipArchiveEntry12.getExternalAttributes();
        int int19 = zipArchiveEntry12.getInternalAttributes();
        zipArchiveEntry12.setComment("hi!");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setSize((long) (short) 0);
        byte[] byteArray5 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setSize((long) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int10 = zipArchiveEntry9.getInternalAttributes();
        zipArchiveEntry9.setCrc((long) 100);
        byte[] byteArray13 = zipArchiveEntry9.getExtra();
        int int14 = zipArchiveEntry9.getUnixMode();
        byte[] byteArray15 = zipArchiveEntry9.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj18 = null;
        boolean boolean19 = zipArchiveEntry17.equals(obj18);
        long long20 = zipArchiveEntry17.getExternalAttributes();
        int int21 = zipArchiveEntry17.getUnixMode();
        zipArchiveEntry17.setPlatform((int) 'a');
        long long24 = zipArchiveEntry17.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray25 = zipArchiveEntry17.getExtraFields();
        zipArchiveEntry9.setExtraFields(zipExtraFieldArray25);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime29 = zipArchiveEntry28.getLastModifiedTime();
        java.lang.Object obj30 = zipArchiveEntry28.clone();
        int int31 = zipArchiveEntry28.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        long long34 = zipArchiveEntry33.getCompressedSize();
        int int35 = zipArchiveEntry33.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj38 = null;
        boolean boolean39 = zipArchiveEntry37.equals(obj38);
        long long40 = zipArchiveEntry37.getExternalAttributes();
        int int41 = zipArchiveEntry37.getUnixMode();
        zipArchiveEntry37.setPlatform((int) 'a');
        long long44 = zipArchiveEntry37.getExternalAttributes();
        int int45 = zipArchiveEntry37.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int48 = zipArchiveEntry47.getInternalAttributes();
        zipArchiveEntry47.setCrc((long) 100);
        java.lang.Object obj51 = zipArchiveEntry47.clone();
        zipArchiveEntry47.setTime((long) (byte) 0);
        zipArchiveEntry47.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime56 = zipArchiveEntry47.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry57 = zipArchiveEntry37.setLastAccessTime(fileTime56);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj60 = null;
        boolean boolean61 = zipArchiveEntry59.equals(obj60);
        long long62 = zipArchiveEntry59.getExternalAttributes();
        int int63 = zipArchiveEntry59.getUnixMode();
        zipArchiveEntry59.setPlatform((int) 'a');
        long long66 = zipArchiveEntry59.getExternalAttributes();
        int int67 = zipArchiveEntry59.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int70 = zipArchiveEntry69.getInternalAttributes();
        zipArchiveEntry69.setCrc((long) 100);
        java.lang.Object obj73 = zipArchiveEntry69.clone();
        zipArchiveEntry69.setTime((long) (byte) 0);
        zipArchiveEntry69.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime78 = zipArchiveEntry69.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry79 = zipArchiveEntry59.setLastAccessTime(fileTime78);
        boolean boolean80 = zipArchiveEntry37.equals((java.lang.Object) fileTime78);
        java.util.zip.ZipEntry zipEntry81 = zipArchiveEntry33.setCreationTime(fileTime78);
        java.util.zip.ZipEntry zipEntry82 = zipArchiveEntry28.setLastModifiedTime(fileTime78);
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry9.setLastModifiedTime(fileTime78);
        boolean boolean84 = zipArchiveEntry1.equals((java.lang.Object) fileTime78);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray25);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray25, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "");
        org.junit.Assert.assertNotNull(fileTime56);
        org.junit.Assert.assertNotNull(zipEntry57);
        org.junit.Assert.assertEquals(zipEntry57.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "");
        org.junit.Assert.assertNotNull(fileTime78);
        org.junit.Assert.assertNotNull(zipEntry79);
        org.junit.Assert.assertEquals(zipEntry79.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(zipEntry81);
        org.junit.Assert.assertEquals(zipEntry81.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry82);
        org.junit.Assert.assertEquals(zipEntry82.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getCrc();
        byte[] byteArray9 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setExternalAttributes((long) (byte) 1);
        zipArchiveEntry1.setName("hi!");
        java.nio.file.attribute.FileTime fileTime14 = zipArchiveEntry1.getLastModifiedTime();
        int int15 = zipArchiveEntry1.getPlatform();
        boolean boolean16 = zipArchiveEntry1.isDirectory();
        byte[] byteArray17 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.lang.String str18 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNull(fileTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj7 = null;
        boolean boolean8 = zipArchiveEntry6.equals(obj7);
        zipArchiveEntry6.setSize((long) 3);
        byte[] byteArray11 = zipArchiveEntry6.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray11);
        zipArchiveEntry1.setCompressedSize(100L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj17 = null;
        boolean boolean18 = zipArchiveEntry16.equals(obj17);
        long long19 = zipArchiveEntry16.getExternalAttributes();
        int int20 = zipArchiveEntry16.getUnixMode();
        zipArchiveEntry16.setPlatform((int) 'a');
        long long23 = zipArchiveEntry16.getExternalAttributes();
        int int24 = zipArchiveEntry16.getPlatform();
        byte[] byteArray25 = zipArchiveEntry16.getLocalFileDataExtra();
        boolean boolean26 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry16);
        zipArchiveEntry16.setMethod((int) ' ');
        zipArchiveEntry16.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime33 = zipArchiveEntry32.getLastModifiedTime();
        boolean boolean34 = zipArchiveEntry16.equals((java.lang.Object) fileTime33);
        int int35 = zipArchiveEntry16.getInternalAttributes();
        zipArchiveEntry16.setMethod((int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry16);
        zipArchiveEntry16.setExtra();
        java.nio.file.attribute.FileTime fileTime41 = zipArchiveEntry16.getCreationTime();
        java.lang.Class<?> wildcardClass42 = zipArchiveEntry16.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(fileTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(fileTime41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        java.lang.String str7 = zipArchiveEntry1.getName();
        int int8 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setPlatform(0);
        int int11 = zipArchiveEntry1.getPlatform();
        long long12 = zipArchiveEntry1.getCompressedSize();
        boolean boolean13 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj16 = null;
        boolean boolean17 = zipArchiveEntry15.equals(obj16);
        long long18 = zipArchiveEntry15.getExternalAttributes();
        int int19 = zipArchiveEntry15.getUnixMode();
        zipArchiveEntry15.setPlatform((int) 'a');
        long long22 = zipArchiveEntry15.getExternalAttributes();
        int int23 = zipArchiveEntry15.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int26 = zipArchiveEntry25.getInternalAttributes();
        zipArchiveEntry25.setCrc((long) 100);
        java.lang.Object obj29 = zipArchiveEntry25.clone();
        zipArchiveEntry25.setTime((long) (byte) 0);
        zipArchiveEntry25.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime34 = zipArchiveEntry25.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry35 = zipArchiveEntry15.setLastAccessTime(fileTime34);
        zipArchiveEntry15.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj40 = null;
        boolean boolean41 = zipArchiveEntry39.equals(obj40);
        long long42 = zipArchiveEntry39.getExternalAttributes();
        int int43 = zipArchiveEntry39.getUnixMode();
        long long44 = zipArchiveEntry39.getExternalAttributes();
        java.lang.String str45 = zipArchiveEntry39.getName();
        java.lang.String str46 = zipArchiveEntry39.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int49 = zipArchiveEntry48.getInternalAttributes();
        zipArchiveEntry48.setCrc((long) 100);
        java.lang.Object obj52 = zipArchiveEntry48.clone();
        zipArchiveEntry48.setTime((long) (byte) 0);
        zipArchiveEntry48.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime57 = zipArchiveEntry48.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry58 = zipArchiveEntry39.setLastAccessTime(fileTime57);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime61 = zipArchiveEntry60.getLastModifiedTime();
        int int62 = zipArchiveEntry60.getUnixMode();
        int int63 = zipArchiveEntry60.getInternalAttributes();
        java.lang.String str64 = zipArchiveEntry60.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry66 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry66.setMethod((int) (byte) 1);
        zipArchiveEntry66.setExternalAttributes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry72 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int73 = zipArchiveEntry72.getInternalAttributes();
        zipArchiveEntry72.setCrc((long) 100);
        java.lang.Object obj76 = zipArchiveEntry72.clone();
        zipArchiveEntry72.setTime((long) (byte) 0);
        zipArchiveEntry72.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime81 = zipArchiveEntry72.getLastModifiedTime();
        zipArchiveEntry72.setCompressedSize((long) 1);
        java.time.LocalDateTime localDateTime84 = zipArchiveEntry72.getTimeLocal();
        zipArchiveEntry66.setTimeLocal(localDateTime84);
        zipArchiveEntry60.setTimeLocal(localDateTime84);
        zipEntry58.setTimeLocal(localDateTime84);
        zipArchiveEntry15.setTimeLocal(localDateTime84);
        zipArchiveEntry1.setTimeLocal(localDateTime84);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(fileTime34);
        org.junit.Assert.assertNotNull(zipEntry35);
        org.junit.Assert.assertEquals(zipEntry35.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "");
        org.junit.Assert.assertNotNull(fileTime57);
        org.junit.Assert.assertNotNull(zipEntry58);
        org.junit.Assert.assertEquals(zipEntry58.toString(), "");
        org.junit.Assert.assertNull(fileTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj76), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "");
        org.junit.Assert.assertNotNull(fileTime81);
        org.junit.Assert.assertNotNull(localDateTime84);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        long long2 = zipArchiveEntry1.getCompressedSize();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.util.Date date4 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int7 = zipArchiveEntry6.getInternalAttributes();
        zipArchiveEntry6.setCrc((long) 100);
        boolean boolean11 = zipArchiveEntry6.equals((java.lang.Object) true);
        zipArchiveEntry6.setSize(100L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int16 = zipArchiveEntry15.getInternalAttributes();
        zipArchiveEntry15.setCrc((long) 100);
        java.lang.Object obj19 = zipArchiveEntry15.clone();
        java.util.Date date20 = zipArchiveEntry15.getLastModifiedDate();
        int int21 = zipArchiveEntry15.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj24 = null;
        boolean boolean25 = zipArchiveEntry23.equals(obj24);
        long long26 = zipArchiveEntry23.getExternalAttributes();
        int int27 = zipArchiveEntry23.getUnixMode();
        zipArchiveEntry23.setPlatform((int) 'a');
        long long30 = zipArchiveEntry23.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int33 = zipArchiveEntry32.getInternalAttributes();
        zipArchiveEntry32.setCrc((long) 100);
        byte[] byteArray36 = zipArchiveEntry32.getExtra();
        long long37 = zipArchiveEntry32.getCompressedSize();
        int int38 = zipArchiveEntry32.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj41 = null;
        boolean boolean42 = zipArchiveEntry40.equals(obj41);
        long long43 = zipArchiveEntry40.getExternalAttributes();
        int int44 = zipArchiveEntry40.getUnixMode();
        zipArchiveEntry40.setPlatform((int) 'a');
        int int47 = zipArchiveEntry40.getUnixMode();
        byte[] byteArray48 = zipArchiveEntry40.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int51 = zipArchiveEntry50.getInternalAttributes();
        zipArchiveEntry50.setCrc((long) 100);
        java.lang.Object obj54 = zipArchiveEntry50.clone();
        zipArchiveEntry50.setTime((long) (byte) 0);
        zipArchiveEntry50.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime59 = zipArchiveEntry50.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry60 = zipArchiveEntry40.setLastModifiedTime(fileTime59);
        java.util.zip.ZipEntry zipEntry61 = zipArchiveEntry32.setLastAccessTime(fileTime59);
        java.util.zip.ZipEntry zipEntry62 = zipArchiveEntry23.setLastAccessTime(fileTime59);
        java.util.zip.ZipEntry zipEntry63 = zipArchiveEntry15.setLastAccessTime(fileTime59);
        java.util.zip.ZipEntry zipEntry64 = zipArchiveEntry6.setLastModifiedTime(fileTime59);
        java.nio.file.attribute.FileTime fileTime65 = zipEntry64.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry66 = zipArchiveEntry1.setLastAccessTime(fileTime65);
        boolean boolean67 = zipArchiveEntry1.isSupportedCompressionMethod();
        zipArchiveEntry1.setTime(35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "");
        org.junit.Assert.assertNotNull(fileTime59);
        org.junit.Assert.assertNotNull(zipEntry60);
        org.junit.Assert.assertEquals(zipEntry60.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry61);
        org.junit.Assert.assertEquals(zipEntry61.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry62);
        org.junit.Assert.assertEquals(zipEntry62.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry63);
        org.junit.Assert.assertEquals(zipEntry63.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry64);
        org.junit.Assert.assertEquals(zipEntry64.toString(), "");
        org.junit.Assert.assertNotNull(fileTime65);
        org.junit.Assert.assertNotNull(zipEntry66);
        org.junit.Assert.assertEquals(zipEntry66.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        zipArchiveEntry1.setSize((long) 3);
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setPlatform((-1));
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj13 = null;
        boolean boolean14 = zipArchiveEntry12.equals(obj13);
        long long15 = zipArchiveEntry12.getExternalAttributes();
        int int16 = zipArchiveEntry12.getUnixMode();
        zipArchiveEntry12.setPlatform((int) 'a');
        long long19 = zipArchiveEntry12.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int22 = zipArchiveEntry21.getInternalAttributes();
        zipArchiveEntry21.setCrc((long) 100);
        byte[] byteArray25 = zipArchiveEntry21.getExtra();
        long long26 = zipArchiveEntry21.getCompressedSize();
        int int27 = zipArchiveEntry21.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj30 = null;
        boolean boolean31 = zipArchiveEntry29.equals(obj30);
        long long32 = zipArchiveEntry29.getExternalAttributes();
        int int33 = zipArchiveEntry29.getUnixMode();
        zipArchiveEntry29.setPlatform((int) 'a');
        int int36 = zipArchiveEntry29.getUnixMode();
        byte[] byteArray37 = zipArchiveEntry29.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int40 = zipArchiveEntry39.getInternalAttributes();
        zipArchiveEntry39.setCrc((long) 100);
        java.lang.Object obj43 = zipArchiveEntry39.clone();
        zipArchiveEntry39.setTime((long) (byte) 0);
        zipArchiveEntry39.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime48 = zipArchiveEntry39.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry49 = zipArchiveEntry29.setLastModifiedTime(fileTime48);
        java.util.zip.ZipEntry zipEntry50 = zipArchiveEntry21.setLastAccessTime(fileTime48);
        java.util.zip.ZipEntry zipEntry51 = zipArchiveEntry12.setLastAccessTime(fileTime48);
        boolean boolean52 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry12);
        java.lang.String str53 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField54 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addAsFirstExtraField(zipExtraField54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(byteArray25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "");
        org.junit.Assert.assertNotNull(fileTime48);
        org.junit.Assert.assertNotNull(zipEntry49);
        org.junit.Assert.assertEquals(zipEntry49.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry50);
        org.junit.Assert.assertEquals(zipEntry50.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry51);
        org.junit.Assert.assertEquals(zipEntry51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getExternalAttributes();
        int int9 = zipArchiveEntry1.getPlatform();
        int int10 = zipArchiveEntry1.getPlatform();
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.Object obj12 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setMethod((int) (byte) 1);
        zipArchiveEntry15.setExtra();
        zipArchiveEntry15.setCompressedSize(0L);
        zipArchiveEntry15.setCrc((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj25 = null;
        boolean boolean26 = zipArchiveEntry24.equals(obj25);
        long long27 = zipArchiveEntry24.getExternalAttributes();
        int int28 = zipArchiveEntry24.getUnixMode();
        boolean boolean30 = zipArchiveEntry24.equals((java.lang.Object) 100.0d);
        zipArchiveEntry24.setCompressedSize((long) 'a');
        java.util.Date date33 = zipArchiveEntry24.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int36 = zipArchiveEntry35.getInternalAttributes();
        zipArchiveEntry35.setCrc((long) 100);
        java.lang.Object obj39 = zipArchiveEntry35.clone();
        zipArchiveEntry35.setTime((long) (byte) 0);
        boolean boolean42 = zipArchiveEntry24.equals((java.lang.Object) zipArchiveEntry35);
        java.lang.Object obj43 = zipArchiveEntry24.clone();
        java.util.Date date44 = zipArchiveEntry24.getLastModifiedDate();
        byte[] byteArray45 = zipArchiveEntry24.getCentralDirectoryExtra();
        zipArchiveEntry15.setExtra(byteArray45);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray45);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int7 = zipArchiveEntry6.getInternalAttributes();
        zipArchiveEntry6.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        java.util.Date date13 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setUnixMode(100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj18 = null;
        boolean boolean19 = zipArchiveEntry17.equals(obj18);
        long long20 = zipArchiveEntry17.getExternalAttributes();
        int int21 = zipArchiveEntry17.getUnixMode();
        long long22 = zipArchiveEntry17.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = zipArchiveEntry17.getExtraField(zipShort23);
        long long25 = zipArchiveEntry17.getCrc();
        zipArchiveEntry17.setSize((long) 3);
        java.lang.Object obj28 = zipArchiveEntry17.clone();
        java.nio.file.attribute.FileTime fileTime29 = zipArchiveEntry17.getCreationTime();
        int int30 = zipArchiveEntry17.getPlatform();
        zipArchiveEntry17.setSize((long) '#');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj35 = null;
        boolean boolean36 = zipArchiveEntry34.equals(obj35);
        long long37 = zipArchiveEntry34.getExternalAttributes();
        int int38 = zipArchiveEntry34.getUnixMode();
        long long39 = zipArchiveEntry34.getExternalAttributes();
        boolean boolean40 = zipArchiveEntry34.isSupportedCompressionMethod();
        zipArchiveEntry34.setPlatform((int) (short) -1);
        zipArchiveEntry34.setExtra();
        java.nio.file.attribute.FileTime fileTime44 = zipArchiveEntry34.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime47 = zipArchiveEntry46.getLastModifiedTime();
        java.lang.Object obj48 = zipArchiveEntry46.clone();
        zipArchiveEntry46.setMethod((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime51 = zipArchiveEntry46.getLastAccessTime();
        zipArchiveEntry46.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry55 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int56 = zipArchiveEntry55.getInternalAttributes();
        zipArchiveEntry55.setCrc((long) 100);
        byte[] byteArray59 = zipArchiveEntry55.getExtra();
        long long60 = zipArchiveEntry55.getCompressedSize();
        int int61 = zipArchiveEntry55.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj64 = null;
        boolean boolean65 = zipArchiveEntry63.equals(obj64);
        long long66 = zipArchiveEntry63.getExternalAttributes();
        int int67 = zipArchiveEntry63.getUnixMode();
        zipArchiveEntry63.setPlatform((int) 'a');
        int int70 = zipArchiveEntry63.getUnixMode();
        byte[] byteArray71 = zipArchiveEntry63.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry73 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int74 = zipArchiveEntry73.getInternalAttributes();
        zipArchiveEntry73.setCrc((long) 100);
        java.lang.Object obj77 = zipArchiveEntry73.clone();
        zipArchiveEntry73.setTime((long) (byte) 0);
        zipArchiveEntry73.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime82 = zipArchiveEntry73.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry63.setLastModifiedTime(fileTime82);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry55.setLastAccessTime(fileTime82);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry46.setLastModifiedTime(fileTime82);
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry34.setLastModifiedTime(fileTime82);
        java.util.zip.ZipEntry zipEntry87 = zipArchiveEntry17.setCreationTime(fileTime82);
        java.util.zip.ZipEntry zipEntry88 = zipArchiveEntry1.setCreationTime(fileTime82);
        int int89 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(zipExtraField24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNull(fileTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(fileTime44);
        org.junit.Assert.assertNull(fileTime47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "");
        org.junit.Assert.assertNull(fileTime51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(byteArray59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertEquals(obj77.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj77), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj77), "");
        org.junit.Assert.assertNotNull(fileTime82);
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
        org.junit.Assert.assertNotNull(zipEntry88);
        org.junit.Assert.assertEquals(zipEntry88.toString(), "");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        zipArchiveEntry1.setTime((long) (short) 0);
        byte[] byteArray7 = zipArchiveEntry1.getCentralDirectoryExtra();
        int int8 = zipArchiveEntry1.getUnixMode();
        boolean boolean9 = zipArchiveEntry1.isSupportedCompressionMethod();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setTime((long) (byte) 0);
        int int8 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setCrc((long) (byte) 0);
        boolean boolean11 = zipArchiveEntry1.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setSize(8L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry16.getLastModifiedTime();
        int int18 = zipArchiveEntry16.getUnixMode();
        byte[] byteArray19 = zipArchiveEntry16.getLocalFileDataExtra();
        zipArchiveEntry16.setName("hi!");
        byte[] byteArray22 = zipArchiveEntry16.getCentralDirectoryExtra();
        boolean boolean23 = zipArchiveEntry16.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj26 = null;
        boolean boolean27 = zipArchiveEntry25.equals(obj26);
        long long28 = zipArchiveEntry25.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int31 = zipArchiveEntry30.getInternalAttributes();
        zipArchiveEntry30.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = zipArchiveEntry30.getExtraFields();
        zipArchiveEntry25.setExtraFields(zipExtraFieldArray34);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray36 = zipArchiveEntry25.getExtraFields();
        zipArchiveEntry16.setExtraFields(zipExtraFieldArray36);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray36);
        boolean boolean39 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray34, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray36);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray36, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setSize((long) 1);
        java.lang.String str4 = zipArchiveEntry1.getName();
        java.lang.String str5 = zipArchiveEntry1.getComment();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        long long7 = zipArchiveEntry1.getTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setMethod((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj7 = null;
        boolean boolean8 = zipArchiveEntry6.equals(obj7);
        zipArchiveEntry6.setSize((long) 3);
        byte[] byteArray11 = zipArchiveEntry6.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray11);
        zipArchiveEntry1.setCompressedSize(100L);
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry1.getCreationTime();
        long long16 = zipArchiveEntry1.getCompressedSize();
        long long17 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setInternalAttributes(0);
        java.lang.String str20 = zipArchiveEntry1.getName();
        java.nio.file.attribute.FileTime fileTime21 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(fileTime21);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        boolean boolean7 = zipArchiveEntry1.equals((java.lang.Object) 100.0d);
        zipArchiveEntry1.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj12 = null;
        boolean boolean13 = zipArchiveEntry11.equals(obj12);
        long long14 = zipArchiveEntry11.getExternalAttributes();
        int int15 = zipArchiveEntry11.getUnixMode();
        boolean boolean17 = zipArchiveEntry11.equals((java.lang.Object) 100.0d);
        zipArchiveEntry11.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int22 = zipArchiveEntry21.getInternalAttributes();
        zipArchiveEntry21.setCrc((long) 100);
        java.lang.Object obj25 = zipArchiveEntry21.clone();
        zipArchiveEntry21.setTime((long) (byte) 0);
        int int28 = zipArchiveEntry21.getUnixMode();
        zipArchiveEntry21.setCrc((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int33 = zipArchiveEntry32.getInternalAttributes();
        zipArchiveEntry32.setCrc((long) 100);
        java.lang.Object obj36 = zipArchiveEntry32.clone();
        zipArchiveEntry32.setTime((long) (byte) 0);
        zipArchiveEntry32.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime41 = zipArchiveEntry32.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry42 = zipArchiveEntry21.setLastAccessTime(fileTime41);
        java.util.zip.ZipEntry zipEntry43 = zipArchiveEntry11.setCreationTime(fileTime41);
        java.util.zip.ZipEntry zipEntry44 = zipArchiveEntry1.setLastAccessTime(fileTime41);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry47.setSize((long) 1);
        java.lang.String str50 = zipArchiveEntry47.getName();
        java.lang.String str51 = zipArchiveEntry47.getComment();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray52 = zipArchiveEntry47.getExtraFields();
        zipArchiveEntry45.setExtraFields(zipExtraFieldArray52);
        zipArchiveEntry45.setComment("");
        java.util.Date date56 = zipArchiveEntry45.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField57 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry45.addExtraField(zipExtraField57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "");
        org.junit.Assert.assertNotNull(fileTime41);
        org.junit.Assert.assertNotNull(zipEntry42);
        org.junit.Assert.assertEquals(zipEntry42.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry43);
        org.junit.Assert.assertEquals(zipEntry43.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry44);
        org.junit.Assert.assertEquals(zipEntry44.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(zipExtraFieldArray52);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray52, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry6.getLastModifiedTime();
        java.util.Date date8 = zipArchiveEntry6.getLastModifiedDate();
        zipArchiveEntry6.setPlatform((int) (byte) -1);
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry6.getLastAccessTime();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime11);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.Object obj3 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setMethod((int) (byte) 100);
        long long6 = zipArchiveEntry1.getExternalAttributes();
        long long7 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj10 = null;
        boolean boolean11 = zipArchiveEntry9.equals(obj10);
        long long12 = zipArchiveEntry9.getExternalAttributes();
        int int13 = zipArchiveEntry9.getUnixMode();
        long long14 = zipArchiveEntry9.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry9.getLastAccessTime();
        zipArchiveEntry9.setCompressedSize((long) (short) 0);
        java.lang.String str18 = zipArchiveEntry9.getName();
        boolean boolean19 = zipArchiveEntry9.isSupportedCompressionMethod();
        byte[] byteArray20 = zipArchiveEntry9.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray20);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray3 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setSize((long) 8);
        long long6 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setUnixMode(3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry10.getLastModifiedTime();
        int int12 = zipArchiveEntry10.getUnixMode();
        byte[] byteArray13 = zipArchiveEntry10.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int16 = zipArchiveEntry15.getInternalAttributes();
        zipArchiveEntry15.setCrc((long) 100);
        java.lang.Object obj19 = zipArchiveEntry15.clone();
        zipArchiveEntry15.setTime((long) (byte) 0);
        zipArchiveEntry15.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime24 = zipArchiveEntry15.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry25 = zipArchiveEntry10.setCreationTime(fileTime24);
        java.util.zip.ZipEntry zipEntry26 = zipArchiveEntry1.setLastModifiedTime(fileTime24);
        long long27 = zipEntry26.getTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(fileTime24);
        org.junit.Assert.assertNotNull(zipEntry25);
        org.junit.Assert.assertEquals(zipEntry25.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry26);
        org.junit.Assert.assertEquals(zipEntry26.toString(), "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        int int3 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int6 = zipArchiveEntry5.getInternalAttributes();
        zipArchiveEntry5.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry5.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray9);
        java.lang.Object obj11 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setTime((long) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int16 = zipArchiveEntry15.getInternalAttributes();
        zipArchiveEntry15.setCrc((long) 100);
        java.lang.Object obj19 = zipArchiveEntry15.clone();
        zipArchiveEntry15.setTime((long) (byte) 0);
        zipArchiveEntry15.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime24 = zipArchiveEntry15.getLastModifiedTime();
        zipArchiveEntry15.setCompressedSize((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj29 = null;
        boolean boolean30 = zipArchiveEntry28.equals(obj29);
        long long31 = zipArchiveEntry28.getExternalAttributes();
        int int32 = zipArchiveEntry28.getUnixMode();
        zipArchiveEntry28.setPlatform((int) 'a');
        long long35 = zipArchiveEntry28.getExternalAttributes();
        int int36 = zipArchiveEntry28.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int39 = zipArchiveEntry38.getInternalAttributes();
        zipArchiveEntry38.setCrc((long) 100);
        java.lang.Object obj42 = zipArchiveEntry38.clone();
        zipArchiveEntry38.setTime((long) (byte) 0);
        zipArchiveEntry38.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime47 = zipArchiveEntry38.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry48 = zipArchiveEntry28.setLastAccessTime(fileTime47);
        java.util.zip.ZipEntry zipEntry49 = zipArchiveEntry15.setLastModifiedTime(fileTime47);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry51.setMethod((int) (byte) 1);
        zipArchiveEntry51.setExternalAttributes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int58 = zipArchiveEntry57.getInternalAttributes();
        zipArchiveEntry57.setCrc((long) 100);
        java.lang.Object obj61 = zipArchiveEntry57.clone();
        zipArchiveEntry57.setTime((long) (byte) 0);
        zipArchiveEntry57.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime66 = zipArchiveEntry57.getLastModifiedTime();
        zipArchiveEntry57.setCompressedSize((long) 1);
        java.time.LocalDateTime localDateTime69 = zipArchiveEntry57.getTimeLocal();
        zipArchiveEntry51.setTimeLocal(localDateTime69);
        zipEntry49.setTimeLocal(localDateTime69);
        zipArchiveEntry1.setTimeLocal(localDateTime69);
        java.nio.file.attribute.FileTime fileTime73 = zipArchiveEntry1.getLastModifiedTime();
        int int74 = zipArchiveEntry1.getInternalAttributes();
        java.nio.file.attribute.FileTime fileTime75 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setExternalAttributes((long) '4');
        long long78 = zipArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray9, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(fileTime24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "");
        org.junit.Assert.assertNotNull(fileTime47);
        org.junit.Assert.assertNotNull(zipEntry48);
        org.junit.Assert.assertEquals(zipEntry48.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry49);
        org.junit.Assert.assertEquals(zipEntry49.toString(), "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "");
        org.junit.Assert.assertNotNull(fileTime66);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(fileTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNull(fileTime75);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-1L) + "'", long78 == (-1L));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        zipArchiveEntry1.setExternalAttributes((long) 100);
        int int6 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setUnixMode(8);
        zipArchiveEntry1.setExternalAttributes((long) '4');
        java.lang.String str11 = zipArchiveEntry1.getName();
        byte[] byteArray12 = zipArchiveEntry1.getLocalFileDataExtra();
        byte[] byteArray13 = zipArchiveEntry1.getLocalFileDataExtra();
        java.nio.file.attribute.FileTime fileTime14 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNull(fileTime14);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        zipArchiveEntry1.setExtra();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setTime(97L);
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertNotNull(fileTime8);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.Object obj3 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setMethod((int) (byte) 100);
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setName("");
        boolean boolean9 = zipArchiveEntry1.isDirectory();
        long long10 = zipArchiveEntry1.getTime();
        int int11 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort12);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getExternalAttributes();
        int int9 = zipArchiveEntry1.getPlatform();
        int int10 = zipArchiveEntry1.getPlatform();
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setMethod((int) (byte) 1);
        byte[] byteArray16 = zipArchiveEntry13.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        long long19 = zipArchiveEntry18.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry18.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj23 = null;
        boolean boolean24 = zipArchiveEntry22.equals(obj23);
        zipArchiveEntry22.setSize((long) 3);
        byte[] byteArray27 = zipArchiveEntry22.getLocalFileDataExtra();
        boolean boolean28 = zipArchiveEntry18.equals((java.lang.Object) byteArray27);
        zipArchiveEntry13.setExtra(byteArray27);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray27);
        long long31 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int34 = zipArchiveEntry33.getInternalAttributes();
        zipArchiveEntry33.setCrc((long) 100);
        boolean boolean38 = zipArchiveEntry33.equals((java.lang.Object) true);
        int int39 = zipArchiveEntry33.getUnixMode();
        zipArchiveEntry33.setSize(100L);
        boolean boolean42 = zipArchiveEntry1.equals((java.lang.Object) 100L);
        int int43 = zipArchiveEntry1.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray44 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setMethod((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertNotNull(zipExtraFieldArray44);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray44, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setTime(1L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields();
        long long6 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setExtra();
        int int9 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setMethod((int) (byte) 1);
        byte[] byteArray14 = zipArchiveEntry11.getCentralDirectoryExtra();
        java.util.Date date15 = zipArchiveEntry11.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry11);
        zipArchiveEntry11.setSize(100L);
        long long19 = zipArchiveEntry11.getTime();
        byte[] byteArray20 = zipArchiveEntry11.getCentralDirectoryExtra();
        boolean boolean21 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry11);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray5, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        zipArchiveEntry1.setSize(100L);
        java.lang.Object obj9 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int12 = zipArchiveEntry11.getInternalAttributes();
        zipArchiveEntry11.setCrc((long) 100);
        byte[] byteArray15 = zipArchiveEntry11.getExtra();
        int int16 = zipArchiveEntry11.getUnixMode();
        byte[] byteArray17 = zipArchiveEntry11.getLocalFileDataExtra();
        int int18 = zipArchiveEntry11.getUnixMode();
        int int19 = zipArchiveEntry11.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int22 = zipArchiveEntry21.getInternalAttributes();
        zipArchiveEntry21.setCrc((long) 100);
        java.lang.Object obj25 = zipArchiveEntry21.clone();
        zipArchiveEntry21.setTime((long) (byte) 0);
        zipArchiveEntry21.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime30 = zipArchiveEntry21.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry32.setMethod((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        zipArchiveEntry32.setExtraFields(zipExtraFieldArray35);
        java.util.Date date37 = zipArchiveEntry32.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime40 = zipArchiveEntry39.getLastModifiedTime();
        int int41 = zipArchiveEntry39.getUnixMode();
        byte[] byteArray42 = zipArchiveEntry39.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int45 = zipArchiveEntry44.getInternalAttributes();
        zipArchiveEntry44.setCrc((long) 100);
        java.lang.Object obj48 = zipArchiveEntry44.clone();
        zipArchiveEntry44.setTime((long) (byte) 0);
        zipArchiveEntry44.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime53 = zipArchiveEntry44.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry54 = zipArchiveEntry39.setCreationTime(fileTime53);
        java.util.zip.ZipEntry zipEntry55 = zipArchiveEntry32.setLastAccessTime(fileTime53);
        java.util.zip.ZipEntry zipEntry56 = zipArchiveEntry21.setLastModifiedTime(fileTime53);
        java.util.zip.ZipEntry zipEntry57 = zipArchiveEntry11.setLastAccessTime(fileTime53);
        java.nio.file.attribute.FileTime fileTime58 = zipArchiveEntry11.getLastAccessTime();
        java.util.zip.ZipEntry zipEntry59 = zipArchiveEntry1.setLastAccessTime(fileTime58);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(fileTime30);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray35, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "");
        org.junit.Assert.assertNotNull(fileTime53);
        org.junit.Assert.assertNotNull(zipEntry54);
        org.junit.Assert.assertEquals(zipEntry54.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry55);
        org.junit.Assert.assertEquals(zipEntry55.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry56);
        org.junit.Assert.assertEquals(zipEntry56.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry57);
        org.junit.Assert.assertEquals(zipEntry57.toString(), "");
        org.junit.Assert.assertNotNull(fileTime58);
        org.junit.Assert.assertNotNull(zipEntry59);
        org.junit.Assert.assertEquals(zipEntry59.toString(), "");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setTime((long) (byte) 0);
        int int8 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setCrc((long) (byte) 0);
        java.time.LocalDateTime localDateTime11 = zipArchiveEntry1.getTimeLocal();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        long long2 = zipArchiveEntry1.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime3 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setPlatform((int) '#');
        int int6 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray7 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setComment("");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(fileTime3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        java.lang.String str7 = zipArchiveEntry1.getName();
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry1.getExtraFields();
        boolean boolean10 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setMethod((int) (byte) 1);
        zipArchiveEntry12.setExtra();
        zipArchiveEntry12.setExternalAttributes((long) ' ');
        java.lang.String str18 = zipArchiveEntry12.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj21 = null;
        boolean boolean22 = zipArchiveEntry20.equals(obj21);
        long long23 = zipArchiveEntry20.getExternalAttributes();
        int int24 = zipArchiveEntry20.getUnixMode();
        long long25 = zipArchiveEntry20.getExternalAttributes();
        java.lang.String str26 = zipArchiveEntry20.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj29 = null;
        boolean boolean30 = zipArchiveEntry28.equals(obj29);
        long long31 = zipArchiveEntry28.getExternalAttributes();
        int int32 = zipArchiveEntry28.getUnixMode();
        zipArchiveEntry28.setPlatform((int) 'a');
        long long35 = zipArchiveEntry28.getExternalAttributes();
        int int36 = zipArchiveEntry28.getPlatform();
        byte[] byteArray37 = zipArchiveEntry28.getLocalFileDataExtra();
        zipArchiveEntry28.setName("hi!");
        boolean boolean40 = zipArchiveEntry20.equals((java.lang.Object) zipArchiveEntry28);
        byte[] byteArray41 = zipArchiveEntry20.getCentralDirectoryExtra();
        zipArchiveEntry12.setExtra(byteArray41);
        zipArchiveEntry1.setExtra(byteArray41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray9, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray3 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setSize((long) 8);
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastAccessTime();
        java.lang.Object obj7 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setTime((long) (byte) 0);
        zipArchiveEntry1.setMethod(0);
        java.lang.String str12 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addAsFirstExtraField(zipExtraField13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setTime((long) (byte) 0);
        int int8 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setCrc((long) (byte) 0);
        zipArchiveEntry1.setCrc((long) (byte) 100);
        int int13 = zipArchiveEntry1.getUnixMode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setName("");
        zipArchiveEntry1.setTime(0L);
        zipArchiveEntry1.setCompressedSize((long) (short) 10);
        boolean boolean9 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setUnixMode(8);
        int int12 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int15 = zipArchiveEntry14.getInternalAttributes();
        byte[] byteArray16 = zipArchiveEntry14.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj19 = null;
        boolean boolean20 = zipArchiveEntry18.equals(obj19);
        long long21 = zipArchiveEntry18.getExternalAttributes();
        int int22 = zipArchiveEntry18.getUnixMode();
        zipArchiveEntry18.setPlatform((int) 'a');
        long long25 = zipArchiveEntry18.getExternalAttributes();
        int int26 = zipArchiveEntry18.getPlatform();
        boolean boolean27 = zipArchiveEntry18.isDirectory();
        java.nio.file.attribute.FileTime fileTime28 = zipArchiveEntry18.getLastModifiedTime();
        byte[] byteArray29 = zipArchiveEntry18.getLocalFileDataExtra();
        zipArchiveEntry14.setExtra(byteArray29);
        zipArchiveEntry1.setExtra(byteArray29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(fileTime28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int7 = zipArchiveEntry6.getInternalAttributes();
        zipArchiveEntry6.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry1.getExtraFields();
        long long13 = zipArchiveEntry1.getSize();
        long long14 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = zipArchiveEntry1.getExtraField(zipShort15);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj19 = null;
        boolean boolean20 = zipArchiveEntry18.equals(obj19);
        long long21 = zipArchiveEntry18.getExternalAttributes();
        int int22 = zipArchiveEntry18.getUnixMode();
        long long23 = zipArchiveEntry18.getExternalAttributes();
        java.lang.String str24 = zipArchiveEntry18.getName();
        int int25 = zipArchiveEntry18.getPlatform();
        java.nio.file.attribute.FileTime fileTime26 = zipArchiveEntry18.getLastModifiedTime();
        java.lang.String str27 = zipArchiveEntry18.getName();
        zipArchiveEntry18.setSize((long) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField31 = zipArchiveEntry18.getExtraField(zipShort30);
        java.nio.file.attribute.FileTime fileTime32 = zipArchiveEntry18.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj35 = null;
        boolean boolean36 = zipArchiveEntry34.equals(obj35);
        long long37 = zipArchiveEntry34.getExternalAttributes();
        int int38 = zipArchiveEntry34.getUnixMode();
        zipArchiveEntry34.setPlatform((int) 'a');
        long long41 = zipArchiveEntry34.getExternalAttributes();
        int int42 = zipArchiveEntry34.getPlatform();
        byte[] byteArray43 = zipArchiveEntry34.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj46 = null;
        boolean boolean47 = zipArchiveEntry45.equals(obj46);
        long long48 = zipArchiveEntry45.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int51 = zipArchiveEntry50.getInternalAttributes();
        zipArchiveEntry50.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray54 = zipArchiveEntry50.getExtraFields();
        zipArchiveEntry45.setExtraFields(zipExtraFieldArray54);
        zipArchiveEntry34.setExtraFields(zipExtraFieldArray54);
        zipArchiveEntry18.setExtraFields(zipExtraFieldArray54);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray54);
        int int59 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setSize((long) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray12, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(zipExtraField16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(fileTime26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(zipExtraField31);
        org.junit.Assert.assertNull(fileTime32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray54);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray54, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.String str3 = zipArchiveEntry1.getComment();
        byte[] byteArray4 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj7 = null;
        boolean boolean8 = zipArchiveEntry6.equals(obj7);
        long long9 = zipArchiveEntry6.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int12 = zipArchiveEntry11.getInternalAttributes();
        zipArchiveEntry11.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry11.getExtraFields();
        zipArchiveEntry6.setExtraFields(zipExtraFieldArray15);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray15);
        int int18 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setTime((-1L));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj23 = null;
        boolean boolean24 = zipArchiveEntry22.equals(obj23);
        long long25 = zipArchiveEntry22.getExternalAttributes();
        int int26 = zipArchiveEntry22.getUnixMode();
        boolean boolean28 = zipArchiveEntry22.equals((java.lang.Object) 100.0d);
        zipArchiveEntry22.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj33 = null;
        boolean boolean34 = zipArchiveEntry32.equals(obj33);
        long long35 = zipArchiveEntry32.getExternalAttributes();
        byte[] byteArray36 = zipArchiveEntry32.getCentralDirectoryExtra();
        zipArchiveEntry22.setExtra(byteArray36);
        zipArchiveEntry22.setUnixMode((int) (short) 100);
        zipArchiveEntry22.setMethod(52);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj44 = null;
        boolean boolean45 = zipArchiveEntry43.equals(obj44);
        long long46 = zipArchiveEntry43.getExternalAttributes();
        int int47 = zipArchiveEntry43.getUnixMode();
        zipArchiveEntry43.setPlatform((int) 'a');
        long long50 = zipArchiveEntry43.getExternalAttributes();
        int int51 = zipArchiveEntry43.getPlatform();
        int int52 = zipArchiveEntry43.getPlatform();
        java.nio.file.attribute.FileTime fileTime53 = zipArchiveEntry43.getLastModifiedTime();
        boolean boolean54 = zipArchiveEntry43.isDirectory();
        java.nio.file.attribute.FileTime fileTime55 = zipArchiveEntry43.getLastAccessTime();
        zipArchiveEntry43.setMethod(100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        byte[] byteArray60 = zipArchiveEntry59.getExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort61 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField62 = zipArchiveEntry59.getExtraField(zipShort61);
        byte[] byteArray63 = zipArchiveEntry59.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry65 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int66 = zipArchiveEntry65.getInternalAttributes();
        byte[] byteArray67 = zipArchiveEntry65.getCentralDirectoryExtra();
        zipArchiveEntry65.setSize((long) 8);
        java.nio.file.attribute.FileTime fileTime70 = zipArchiveEntry65.getLastAccessTime();
        java.lang.Object obj71 = zipArchiveEntry65.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry73 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj74 = null;
        boolean boolean75 = zipArchiveEntry73.equals(obj74);
        long long76 = zipArchiveEntry73.getExternalAttributes();
        int int77 = zipArchiveEntry73.getUnixMode();
        zipArchiveEntry73.setPlatform((int) 'a');
        int int80 = zipArchiveEntry73.getUnixMode();
        byte[] byteArray81 = zipArchiveEntry73.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry83 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int84 = zipArchiveEntry83.getInternalAttributes();
        zipArchiveEntry83.setCrc((long) 100);
        java.lang.Object obj87 = zipArchiveEntry83.clone();
        zipArchiveEntry83.setTime((long) (byte) 0);
        zipArchiveEntry83.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime92 = zipArchiveEntry83.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry93 = zipArchiveEntry73.setLastModifiedTime(fileTime92);
        java.util.zip.ZipEntry zipEntry94 = zipArchiveEntry65.setCreationTime(fileTime92);
        java.util.zip.ZipEntry zipEntry95 = zipArchiveEntry59.setLastAccessTime(fileTime92);
        java.util.zip.ZipEntry zipEntry96 = zipArchiveEntry43.setCreationTime(fileTime92);
        java.util.zip.ZipEntry zipEntry97 = zipArchiveEntry22.setLastAccessTime(fileTime92);
        byte[] byteArray98 = zipArchiveEntry22.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray98);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray15, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertNull(fileTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(fileTime55);
        org.junit.Assert.assertNull(byteArray60);
        org.junit.Assert.assertNull(zipExtraField62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertNull(fileTime70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] {});
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertEquals(obj87.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj87), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj87), "");
        org.junit.Assert.assertNotNull(fileTime92);
        org.junit.Assert.assertNotNull(zipEntry93);
        org.junit.Assert.assertEquals(zipEntry93.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry94);
        org.junit.Assert.assertEquals(zipEntry94.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry95);
        org.junit.Assert.assertEquals(zipEntry95.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry96);
        org.junit.Assert.assertEquals(zipEntry96.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry97);
        org.junit.Assert.assertEquals(zipEntry97.toString(), "");
        org.junit.Assert.assertNotNull(byteArray98);
        org.junit.Assert.assertArrayEquals(byteArray98, new byte[] {});
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        byte[] byteArray5 = zipArchiveEntry1.getCentralDirectoryExtra();
        boolean boolean6 = zipArchiveEntry1.isSupportedCompressionMethod();
        zipArchiveEntry1.setCrc((long) 3);
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry1.getExtraFields();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry6.getLastModifiedTime();
        zipArchiveEntry6.setExtra();
        zipArchiveEntry6.setMethod(0);
        java.util.Date date11 = zipArchiveEntry6.getLastModifiedDate();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getExternalAttributes();
        long long9 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setExternalAttributes(3L);
        byte[] byteArray12 = zipArchiveEntry1.getExtra();
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteArray12);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj7 = null;
        boolean boolean8 = zipArchiveEntry6.equals(obj7);
        zipArchiveEntry6.setSize((long) 3);
        byte[] byteArray11 = zipArchiveEntry6.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray11);
        zipArchiveEntry1.setCompressedSize(100L);
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setExternalAttributes(3L);
        zipArchiveEntry1.setComment("");
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry1.getLastModifiedTime();
        long long21 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField23 = zipArchiveEntry1.getExtraField(zipShort22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(zipExtraField23);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int9 = zipArchiveEntry8.getInternalAttributes();
        zipArchiveEntry8.setCrc((long) 100);
        java.lang.Object obj12 = zipArchiveEntry8.clone();
        zipArchiveEntry8.setTime((long) (byte) 0);
        zipArchiveEntry8.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry8.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry18 = zipArchiveEntry1.setLastAccessTime(fileTime17);
        int int19 = zipArchiveEntry1.getUnixMode();
        java.lang.String str20 = zipArchiveEntry1.getComment();
        java.lang.Object obj21 = zipArchiveEntry1.clone();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(fileTime17);
        org.junit.Assert.assertNotNull(zipEntry18);
        org.junit.Assert.assertEquals(zipEntry18.toString(), "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        boolean boolean8 = zipArchiveEntry1.isSupportedCompressionMethod();
        byte[] byteArray9 = zipArchiveEntry1.getLocalFileDataExtra();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        byte[] byteArray5 = zipArchiveEntry1.getExtra();
        long long6 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setMethod((int) (byte) 1);
        byte[] byteArray12 = zipArchiveEntry9.getCentralDirectoryExtra();
        java.util.Date date13 = zipArchiveEntry9.getLastModifiedDate();
        java.lang.Object obj14 = zipArchiveEntry9.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int17 = zipArchiveEntry16.getInternalAttributes();
        zipArchiveEntry16.setCrc((long) 100);
        java.lang.Object obj20 = zipArchiveEntry16.clone();
        zipArchiveEntry16.setTime((long) (byte) 0);
        zipArchiveEntry16.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime25 = zipArchiveEntry16.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry26 = zipArchiveEntry9.setLastAccessTime(fileTime25);
        boolean boolean27 = zipArchiveEntry1.equals((java.lang.Object) zipEntry26);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime30 = zipArchiveEntry29.getLastModifiedTime();
        java.lang.String str31 = zipArchiveEntry29.getComment();
        byte[] byteArray32 = zipArchiveEntry29.getExtra();
        zipArchiveEntry29.setCompressedSize((long) 0);
        java.util.Date date35 = zipArchiveEntry29.getLastModifiedDate();
        java.lang.Object obj36 = zipArchiveEntry29.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime39 = zipArchiveEntry38.getLastModifiedTime();
        int int40 = zipArchiveEntry38.getUnixMode();
        int int41 = zipArchiveEntry38.getInternalAttributes();
        java.lang.String str42 = zipArchiveEntry38.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry44.setMethod((int) (byte) 1);
        zipArchiveEntry44.setExternalAttributes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int51 = zipArchiveEntry50.getInternalAttributes();
        zipArchiveEntry50.setCrc((long) 100);
        java.lang.Object obj54 = zipArchiveEntry50.clone();
        zipArchiveEntry50.setTime((long) (byte) 0);
        zipArchiveEntry50.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime59 = zipArchiveEntry50.getLastModifiedTime();
        zipArchiveEntry50.setCompressedSize((long) 1);
        java.time.LocalDateTime localDateTime62 = zipArchiveEntry50.getTimeLocal();
        zipArchiveEntry44.setTimeLocal(localDateTime62);
        zipArchiveEntry38.setTimeLocal(localDateTime62);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray65 = zipArchiveEntry38.getExtraFields();
        zipArchiveEntry29.setExtraFields(zipExtraFieldArray65);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray65);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int70 = zipArchiveEntry69.getInternalAttributes();
        byte[] byteArray71 = zipArchiveEntry69.getCentralDirectoryExtra();
        boolean boolean72 = zipArchiveEntry69.isSupportedCompressionMethod();
        int int73 = zipArchiveEntry69.getUnixMode();
        byte[] byteArray74 = zipArchiveEntry69.getCentralDirectoryExtra();
        zipArchiveEntry1.setExtra(byteArray74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(fileTime25);
        org.junit.Assert.assertNotNull(zipEntry26);
        org.junit.Assert.assertEquals(zipEntry26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(fileTime30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(byteArray32);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "");
        org.junit.Assert.assertNull(fileTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "");
        org.junit.Assert.assertNotNull(fileTime59);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(zipExtraFieldArray65);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray65, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] {});
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setCompressedSize((long) (short) 0);
        java.lang.String str10 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj13 = null;
        boolean boolean14 = zipArchiveEntry12.equals(obj13);
        long long15 = zipArchiveEntry12.getExternalAttributes();
        int int16 = zipArchiveEntry12.getUnixMode();
        boolean boolean18 = zipArchiveEntry12.equals((java.lang.Object) 100.0d);
        zipArchiveEntry12.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj23 = null;
        boolean boolean24 = zipArchiveEntry22.equals(obj23);
        long long25 = zipArchiveEntry22.getExternalAttributes();
        int int26 = zipArchiveEntry22.getUnixMode();
        boolean boolean28 = zipArchiveEntry22.equals((java.lang.Object) 100.0d);
        zipArchiveEntry22.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int33 = zipArchiveEntry32.getInternalAttributes();
        zipArchiveEntry32.setCrc((long) 100);
        java.lang.Object obj36 = zipArchiveEntry32.clone();
        zipArchiveEntry32.setTime((long) (byte) 0);
        int int39 = zipArchiveEntry32.getUnixMode();
        zipArchiveEntry32.setCrc((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int44 = zipArchiveEntry43.getInternalAttributes();
        zipArchiveEntry43.setCrc((long) 100);
        java.lang.Object obj47 = zipArchiveEntry43.clone();
        zipArchiveEntry43.setTime((long) (byte) 0);
        zipArchiveEntry43.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime52 = zipArchiveEntry43.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry53 = zipArchiveEntry32.setLastAccessTime(fileTime52);
        java.util.zip.ZipEntry zipEntry54 = zipArchiveEntry22.setCreationTime(fileTime52);
        java.util.zip.ZipEntry zipEntry55 = zipArchiveEntry12.setLastAccessTime(fileTime52);
        boolean boolean56 = zipArchiveEntry1.equals((java.lang.Object) zipEntry55);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipEntry55);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "");
        org.junit.Assert.assertNotNull(fileTime52);
        org.junit.Assert.assertNotNull(zipEntry53);
        org.junit.Assert.assertEquals(zipEntry53.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry54);
        org.junit.Assert.assertEquals(zipEntry54.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry55);
        org.junit.Assert.assertEquals(zipEntry55.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        boolean boolean1 = zipArchiveEntry0.isDirectory();
        byte[] byteArray2 = zipArchiveEntry0.getCentralDirectoryExtra();
        long long3 = zipArchiveEntry0.getExternalAttributes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getExternalAttributes();
        long long9 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setExternalAttributes(3L);
        long long12 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setInternalAttributes((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setUnixMode((int) (byte) 100);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.util.Date date10 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setInternalAttributes(52);
        zipArchiveEntry1.setComment("hi!");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray3 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setCompressedSize(0L);
        zipArchiveEntry1.setCrc((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj11 = null;
        boolean boolean12 = zipArchiveEntry10.equals(obj11);
        long long13 = zipArchiveEntry10.getExternalAttributes();
        int int14 = zipArchiveEntry10.getUnixMode();
        boolean boolean16 = zipArchiveEntry10.equals((java.lang.Object) 100.0d);
        zipArchiveEntry10.setCompressedSize((long) 'a');
        java.util.Date date19 = zipArchiveEntry10.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int22 = zipArchiveEntry21.getInternalAttributes();
        zipArchiveEntry21.setCrc((long) 100);
        java.lang.Object obj25 = zipArchiveEntry21.clone();
        zipArchiveEntry21.setTime((long) (byte) 0);
        boolean boolean28 = zipArchiveEntry10.equals((java.lang.Object) zipArchiveEntry21);
        java.lang.Object obj29 = zipArchiveEntry10.clone();
        java.util.Date date30 = zipArchiveEntry10.getLastModifiedDate();
        byte[] byteArray31 = zipArchiveEntry10.getCentralDirectoryExtra();
        zipArchiveEntry1.setExtra(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = zipArchiveEntry1.getExtraField(zipShort33);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort35 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort35);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNull(zipExtraField34);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        boolean boolean6 = zipArchiveEntry1.isSupportedCompressionMethod();
        long long7 = zipArchiveEntry1.getExternalAttributes();
        int int8 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setSize(0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.Object obj3 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setMethod((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = zipArchiveEntry1.getExtraField(zipShort6);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setMethod((int) (byte) 1);
        zipArchiveEntry9.setExtra();
        zipArchiveEntry9.setExternalAttributes((long) ' ');
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = zipArchiveEntry9.getExtraField(zipShort15);
        long long17 = zipArchiveEntry9.getCrc();
        zipArchiveEntry9.setCompressedSize(1L);
        byte[] byteArray20 = zipArchiveEntry9.getExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray20);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addExtraField(zipExtraField22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertNull(zipExtraField7);
        org.junit.Assert.assertNull(zipExtraField16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        int int3 = zipArchiveEntry1.getUnixMode();
        int int4 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setName("hi!");
        boolean boolean7 = zipArchiveEntry1.isSupportedCompressionMethod();
        int int8 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        int int5 = zipArchiveEntry1.getPlatform();
        java.lang.String str6 = zipArchiveEntry1.getComment();
        long long7 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry9.getLastModifiedTime();
        int int11 = zipArchiveEntry9.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int14 = zipArchiveEntry13.getInternalAttributes();
        zipArchiveEntry13.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = zipArchiveEntry13.getExtraFields();
        zipArchiveEntry9.setExtraFields(zipExtraFieldArray17);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = zipArchiveEntry9.getExtraFields();
        zipArchiveEntry9.setSize(100L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj24 = null;
        boolean boolean25 = zipArchiveEntry23.equals(obj24);
        long long26 = zipArchiveEntry23.getExternalAttributes();
        int int27 = zipArchiveEntry23.getUnixMode();
        zipArchiveEntry23.setPlatform((int) 'a');
        long long30 = zipArchiveEntry23.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int33 = zipArchiveEntry32.getInternalAttributes();
        zipArchiveEntry32.setCrc((long) 100);
        byte[] byteArray36 = zipArchiveEntry32.getExtra();
        long long37 = zipArchiveEntry32.getCompressedSize();
        int int38 = zipArchiveEntry32.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj41 = null;
        boolean boolean42 = zipArchiveEntry40.equals(obj41);
        long long43 = zipArchiveEntry40.getExternalAttributes();
        int int44 = zipArchiveEntry40.getUnixMode();
        zipArchiveEntry40.setPlatform((int) 'a');
        int int47 = zipArchiveEntry40.getUnixMode();
        byte[] byteArray48 = zipArchiveEntry40.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int51 = zipArchiveEntry50.getInternalAttributes();
        zipArchiveEntry50.setCrc((long) 100);
        java.lang.Object obj54 = zipArchiveEntry50.clone();
        zipArchiveEntry50.setTime((long) (byte) 0);
        zipArchiveEntry50.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime59 = zipArchiveEntry50.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry60 = zipArchiveEntry40.setLastModifiedTime(fileTime59);
        java.util.zip.ZipEntry zipEntry61 = zipArchiveEntry32.setLastAccessTime(fileTime59);
        java.util.zip.ZipEntry zipEntry62 = zipArchiveEntry23.setLastAccessTime(fileTime59);
        java.util.zip.ZipEntry zipEntry63 = zipArchiveEntry9.setCreationTime(fileTime59);
        java.util.zip.ZipEntry zipEntry64 = zipArchiveEntry1.setCreationTime(fileTime59);
        java.nio.file.attribute.FileTime fileTime65 = zipEntry64.getLastModifiedTime();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray17, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray19, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(byteArray36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "");
        org.junit.Assert.assertNotNull(fileTime59);
        org.junit.Assert.assertNotNull(zipEntry60);
        org.junit.Assert.assertEquals(zipEntry60.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry61);
        org.junit.Assert.assertEquals(zipEntry61.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry62);
        org.junit.Assert.assertEquals(zipEntry62.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry63);
        org.junit.Assert.assertEquals(zipEntry63.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry64);
        org.junit.Assert.assertEquals(zipEntry64.toString(), "");
        org.junit.Assert.assertNull(fileTime65);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setTime((long) (byte) 0);
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setMethod((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        zipArchiveEntry12.setExtraFields(zipExtraFieldArray15);
        java.util.Date date17 = zipArchiveEntry12.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry19.getLastModifiedTime();
        int int21 = zipArchiveEntry19.getUnixMode();
        byte[] byteArray22 = zipArchiveEntry19.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int25 = zipArchiveEntry24.getInternalAttributes();
        zipArchiveEntry24.setCrc((long) 100);
        java.lang.Object obj28 = zipArchiveEntry24.clone();
        zipArchiveEntry24.setTime((long) (byte) 0);
        zipArchiveEntry24.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime33 = zipArchiveEntry24.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry34 = zipArchiveEntry19.setCreationTime(fileTime33);
        java.util.zip.ZipEntry zipEntry35 = zipArchiveEntry12.setLastAccessTime(fileTime33);
        java.util.zip.ZipEntry zipEntry36 = zipArchiveEntry1.setLastModifiedTime(fileTime33);
        long long37 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setMethod((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(fileTime10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray15, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNotNull(fileTime33);
        org.junit.Assert.assertNotNull(zipEntry34);
        org.junit.Assert.assertEquals(zipEntry34.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry35);
        org.junit.Assert.assertEquals(zipEntry35.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry36);
        org.junit.Assert.assertEquals(zipEntry36.toString(), "");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = zipArchiveEntry1.getExtraField(zipShort7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = zipArchiveEntry1.getExtraField(zipShort9);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry12.getLastModifiedTime();
        int int14 = zipArchiveEntry12.getUnixMode();
        int int15 = zipArchiveEntry12.getInternalAttributes();
        zipArchiveEntry12.setUnixMode(0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField19 = zipArchiveEntry12.getExtraField(zipShort18);
        java.util.Date date20 = zipArchiveEntry12.getLastModifiedDate();
        int int21 = zipArchiveEntry12.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int24 = zipArchiveEntry23.getInternalAttributes();
        zipArchiveEntry23.setCrc((long) 100);
        byte[] byteArray27 = zipArchiveEntry23.getExtra();
        int int28 = zipArchiveEntry23.getUnixMode();
        byte[] byteArray29 = zipArchiveEntry23.getLocalFileDataExtra();
        zipArchiveEntry23.setExtra();
        byte[] byteArray31 = zipArchiveEntry23.getExtra();
        zipArchiveEntry12.setCentralDirectoryExtra(byteArray31);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(zipExtraField8);
        org.junit.Assert.assertNull(zipExtraField10);
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(zipExtraField19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int11 = zipArchiveEntry10.getInternalAttributes();
        zipArchiveEntry10.setCrc((long) 100);
        byte[] byteArray14 = zipArchiveEntry10.getExtra();
        long long15 = zipArchiveEntry10.getCompressedSize();
        int int16 = zipArchiveEntry10.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj19 = null;
        boolean boolean20 = zipArchiveEntry18.equals(obj19);
        long long21 = zipArchiveEntry18.getExternalAttributes();
        int int22 = zipArchiveEntry18.getUnixMode();
        zipArchiveEntry18.setPlatform((int) 'a');
        int int25 = zipArchiveEntry18.getUnixMode();
        byte[] byteArray26 = zipArchiveEntry18.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int29 = zipArchiveEntry28.getInternalAttributes();
        zipArchiveEntry28.setCrc((long) 100);
        java.lang.Object obj32 = zipArchiveEntry28.clone();
        zipArchiveEntry28.setTime((long) (byte) 0);
        zipArchiveEntry28.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime37 = zipArchiveEntry28.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry38 = zipArchiveEntry18.setLastModifiedTime(fileTime37);
        java.util.zip.ZipEntry zipEntry39 = zipArchiveEntry10.setLastAccessTime(fileTime37);
        java.util.zip.ZipEntry zipEntry40 = zipArchiveEntry1.setLastAccessTime(fileTime37);
        zipArchiveEntry1.setExtra();
        int int42 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(byteArray14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertNotNull(fileTime37);
        org.junit.Assert.assertNotNull(zipEntry38);
        org.junit.Assert.assertEquals(zipEntry38.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry39);
        org.junit.Assert.assertEquals(zipEntry39.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry40);
        org.junit.Assert.assertEquals(zipEntry40.toString(), "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.String str3 = zipArchiveEntry1.getComment();
        byte[] byteArray4 = zipArchiveEntry1.getExtra();
        zipArchiveEntry1.setCompressedSize((long) 0);
        java.util.Date date7 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setCrc(8L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj12 = null;
        boolean boolean13 = zipArchiveEntry11.equals(obj12);
        zipArchiveEntry11.setSize((long) 3);
        java.util.Date date16 = zipArchiveEntry11.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry11.getLastAccessTime();
        java.lang.String str18 = zipArchiveEntry11.getComment();
        boolean boolean19 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry11);
        java.lang.String str20 = zipArchiveEntry11.getName();
        zipArchiveEntry11.setName("");
        zipArchiveEntry11.setCompressedSize((long) 97);
        java.nio.file.attribute.FileTime fileTime25 = zipArchiveEntry11.getCreationTime();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(fileTime25);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        byte[] byteArray5 = zipArchiveEntry1.getExtra();
        int int6 = zipArchiveEntry1.getUnixMode();
        byte[] byteArray7 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setPlatform(3);
        int int10 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setPlatform(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        long long7 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int7 = zipArchiveEntry6.getInternalAttributes();
        zipArchiveEntry6.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry1.getExtraFields();
        long long13 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj16 = null;
        boolean boolean17 = zipArchiveEntry15.equals(obj16);
        long long18 = zipArchiveEntry15.getExternalAttributes();
        int int19 = zipArchiveEntry15.getUnixMode();
        long long20 = zipArchiveEntry15.getExternalAttributes();
        java.lang.String str21 = zipArchiveEntry15.getName();
        int int22 = zipArchiveEntry15.getPlatform();
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry15.getLastModifiedTime();
        java.lang.String str24 = zipArchiveEntry15.getName();
        zipArchiveEntry15.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField28 = zipArchiveEntry15.getExtraField(zipShort27);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry30.setMethod((int) (byte) 1);
        byte[] byteArray33 = zipArchiveEntry30.getCentralDirectoryExtra();
        java.util.Date date34 = zipArchiveEntry30.getLastModifiedDate();
        long long35 = zipArchiveEntry30.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime36 = zipArchiveEntry30.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int39 = zipArchiveEntry38.getInternalAttributes();
        zipArchiveEntry38.setCrc((long) 100);
        boolean boolean43 = zipArchiveEntry38.equals((java.lang.Object) true);
        int int44 = zipArchiveEntry38.getUnixMode();
        zipArchiveEntry38.setCompressedSize((long) (short) 1);
        java.nio.file.attribute.FileTime fileTime47 = zipArchiveEntry38.getLastAccessTime();
        byte[] byteArray48 = zipArchiveEntry38.getCentralDirectoryExtra();
        zipArchiveEntry38.setSize((long) '#');
        zipArchiveEntry38.setTime((long) (short) 100);
        byte[] byteArray53 = zipArchiveEntry38.getExtra();
        java.time.LocalDateTime localDateTime54 = zipArchiveEntry38.getTimeLocal();
        zipArchiveEntry30.setTimeLocal(localDateTime54);
        zipArchiveEntry15.setTimeLocal(localDateTime54);
        zipArchiveEntry1.setTimeLocal(localDateTime54);
        int int58 = zipArchiveEntry1.getMethod();
        java.lang.Class<?> wildcardClass59 = zipArchiveEntry1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray12, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(fileTime23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(zipExtraField28);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(fileTime36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(fileTime47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertNull(byteArray53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        zipArchiveEntry1.setExternalAttributes((long) 100);
        long long6 = zipArchiveEntry1.getCompressedSize();
        byte[] byteArray7 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setCrc((long) 3);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry12.getLastModifiedTime();
        int int14 = zipArchiveEntry12.getUnixMode();
        byte[] byteArray15 = zipArchiveEntry12.getLocalFileDataExtra();
        zipArchiveEntry12.setName("hi!");
        byte[] byteArray18 = zipArchiveEntry12.getCentralDirectoryExtra();
        zipArchiveEntry1.setExtra(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int22 = zipArchiveEntry21.getInternalAttributes();
        zipArchiveEntry21.setCrc((long) 100);
        zipArchiveEntry21.setTime((long) (short) 0);
        byte[] byteArray27 = zipArchiveEntry21.getCentralDirectoryExtra();
        zipArchiveEntry1.setExtra(byteArray27);
        boolean boolean29 = zipArchiveEntry1.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int32 = zipArchiveEntry31.getInternalAttributes();
        zipArchiveEntry31.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj37 = null;
        boolean boolean38 = zipArchiveEntry36.equals(obj37);
        zipArchiveEntry36.setSize((long) 3);
        byte[] byteArray41 = zipArchiveEntry36.getLocalFileDataExtra();
        zipArchiveEntry31.setExtra(byteArray41);
        zipArchiveEntry31.setCompressedSize(100L);
        java.nio.file.attribute.FileTime fileTime45 = zipArchiveEntry31.getCreationTime();
        zipArchiveEntry31.setExternalAttributes(3L);
        zipArchiveEntry31.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj52 = null;
        boolean boolean53 = zipArchiveEntry51.equals(obj52);
        long long54 = zipArchiveEntry51.getExternalAttributes();
        int int55 = zipArchiveEntry51.getUnixMode();
        zipArchiveEntry51.setPlatform((int) 'a');
        long long58 = zipArchiveEntry51.getExternalAttributes();
        int int59 = zipArchiveEntry51.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry61 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int62 = zipArchiveEntry61.getInternalAttributes();
        zipArchiveEntry61.setCrc((long) 100);
        java.lang.Object obj65 = zipArchiveEntry61.clone();
        zipArchiveEntry61.setTime((long) (byte) 0);
        zipArchiveEntry61.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime70 = zipArchiveEntry61.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry71 = zipArchiveEntry51.setLastAccessTime(fileTime70);
        java.util.zip.ZipEntry zipEntry72 = zipArchiveEntry31.setLastModifiedTime(fileTime70);
        long long73 = zipArchiveEntry31.getCrc();
        java.lang.String str74 = zipArchiveEntry31.getComment();
        java.lang.String str75 = zipArchiveEntry31.getComment();
        java.nio.file.attribute.FileTime fileTime76 = zipArchiveEntry31.getCreationTime();
        java.time.LocalDateTime localDateTime77 = zipArchiveEntry31.getTimeLocal();
        zipArchiveEntry1.setTimeLocal(localDateTime77);
        int int79 = zipArchiveEntry1.getPlatform();
        long long80 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNull(fileTime45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "");
        org.junit.Assert.assertNotNull(fileTime70);
        org.junit.Assert.assertNotNull(zipEntry71);
        org.junit.Assert.assertEquals(zipEntry71.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry72);
        org.junit.Assert.assertEquals(zipEntry72.toString(), "");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 100L + "'", long73 == 100L);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNull(fileTime76);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 100L + "'", long80 == 100L);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        boolean boolean6 = zipArchiveEntry1.equals((java.lang.Object) true);
        int int7 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setCompressedSize((long) (short) 1);
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastAccessTime();
        byte[] byteArray11 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setSize((long) '#');
        zipArchiveEntry1.setTime((long) (short) 100);
        zipArchiveEntry1.setSize((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        java.lang.String str7 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj10 = null;
        boolean boolean11 = zipArchiveEntry9.equals(obj10);
        long long12 = zipArchiveEntry9.getExternalAttributes();
        int int13 = zipArchiveEntry9.getUnixMode();
        zipArchiveEntry9.setPlatform((int) 'a');
        long long16 = zipArchiveEntry9.getExternalAttributes();
        int int17 = zipArchiveEntry9.getPlatform();
        byte[] byteArray18 = zipArchiveEntry9.getLocalFileDataExtra();
        zipArchiveEntry9.setName("hi!");
        boolean boolean21 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField23 = zipArchiveEntry9.getExtraField(zipShort22);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime26 = zipArchiveEntry25.getLastModifiedTime();
        int int27 = zipArchiveEntry25.getUnixMode();
        byte[] byteArray28 = zipArchiveEntry25.getLocalFileDataExtra();
        zipArchiveEntry25.setName("hi!");
        byte[] byteArray31 = zipArchiveEntry25.getCentralDirectoryExtra();
        zipArchiveEntry9.setExtra(byteArray31);
        long long33 = zipArchiveEntry9.getExternalAttributes();
        zipArchiveEntry9.setName("hi!");
        boolean boolean36 = zipArchiveEntry9.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(zipExtraField23);
        org.junit.Assert.assertNull(fileTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        int int5 = zipArchiveEntry1.getPlatform();
        java.lang.String str6 = zipArchiveEntry1.getComment();
        int int7 = zipArchiveEntry1.getInternalAttributes();
        int int8 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setMethod((int) (short) 0);
        byte[] byteArray11 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setSize((long) 1);
        java.lang.String str4 = zipArchiveEntry1.getName();
        java.lang.String str5 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setExternalAttributes((long) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setMethod((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        zipArchiveEntry9.setExtraFields(zipExtraFieldArray12);
        java.util.Date date14 = zipArchiveEntry9.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry16.getLastModifiedTime();
        int int18 = zipArchiveEntry16.getUnixMode();
        byte[] byteArray19 = zipArchiveEntry16.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int22 = zipArchiveEntry21.getInternalAttributes();
        zipArchiveEntry21.setCrc((long) 100);
        java.lang.Object obj25 = zipArchiveEntry21.clone();
        zipArchiveEntry21.setTime((long) (byte) 0);
        zipArchiveEntry21.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime30 = zipArchiveEntry21.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry31 = zipArchiveEntry16.setCreationTime(fileTime30);
        java.util.zip.ZipEntry zipEntry32 = zipArchiveEntry9.setLastAccessTime(fileTime30);
        boolean boolean33 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry9);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = zipArchiveEntry9.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setMethod((int) (byte) 1);
        zipArchiveEntry36.setExternalAttributes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int43 = zipArchiveEntry42.getInternalAttributes();
        zipArchiveEntry42.setCrc((long) 100);
        java.lang.Object obj46 = zipArchiveEntry42.clone();
        zipArchiveEntry42.setTime((long) (byte) 0);
        zipArchiveEntry42.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime51 = zipArchiveEntry42.getLastModifiedTime();
        zipArchiveEntry42.setCompressedSize((long) 1);
        java.time.LocalDateTime localDateTime54 = zipArchiveEntry42.getTimeLocal();
        zipArchiveEntry36.setTimeLocal(localDateTime54);
        java.time.LocalDateTime localDateTime56 = zipArchiveEntry36.getTimeLocal();
        zipArchiveEntry9.setTimeLocal(localDateTime56);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray12, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(fileTime30);
        org.junit.Assert.assertNotNull(zipEntry31);
        org.junit.Assert.assertEquals(zipEntry31.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry32);
        org.junit.Assert.assertEquals(zipEntry32.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray34, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "");
        org.junit.Assert.assertNotNull(fileTime51);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        int int8 = zipArchiveEntry1.getUnixMode();
        byte[] byteArray9 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int12 = zipArchiveEntry11.getInternalAttributes();
        zipArchiveEntry11.setCrc((long) 100);
        java.lang.Object obj15 = zipArchiveEntry11.clone();
        zipArchiveEntry11.setTime((long) (byte) 0);
        zipArchiveEntry11.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry11.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry21 = zipArchiveEntry1.setLastModifiedTime(fileTime20);
        int int22 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj25 = null;
        boolean boolean26 = zipArchiveEntry24.equals(obj25);
        long long27 = zipArchiveEntry24.getExternalAttributes();
        int int28 = zipArchiveEntry24.getUnixMode();
        long long29 = zipArchiveEntry24.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime30 = zipArchiveEntry24.getLastAccessTime();
        boolean boolean31 = zipArchiveEntry24.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime34 = zipArchiveEntry33.getLastModifiedTime();
        java.lang.Object obj35 = zipArchiveEntry33.clone();
        int int36 = zipArchiveEntry33.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        long long39 = zipArchiveEntry38.getCompressedSize();
        int int40 = zipArchiveEntry38.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj43 = null;
        boolean boolean44 = zipArchiveEntry42.equals(obj43);
        long long45 = zipArchiveEntry42.getExternalAttributes();
        int int46 = zipArchiveEntry42.getUnixMode();
        zipArchiveEntry42.setPlatform((int) 'a');
        long long49 = zipArchiveEntry42.getExternalAttributes();
        int int50 = zipArchiveEntry42.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int53 = zipArchiveEntry52.getInternalAttributes();
        zipArchiveEntry52.setCrc((long) 100);
        java.lang.Object obj56 = zipArchiveEntry52.clone();
        zipArchiveEntry52.setTime((long) (byte) 0);
        zipArchiveEntry52.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime61 = zipArchiveEntry52.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry62 = zipArchiveEntry42.setLastAccessTime(fileTime61);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj65 = null;
        boolean boolean66 = zipArchiveEntry64.equals(obj65);
        long long67 = zipArchiveEntry64.getExternalAttributes();
        int int68 = zipArchiveEntry64.getUnixMode();
        zipArchiveEntry64.setPlatform((int) 'a');
        long long71 = zipArchiveEntry64.getExternalAttributes();
        int int72 = zipArchiveEntry64.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry74 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int75 = zipArchiveEntry74.getInternalAttributes();
        zipArchiveEntry74.setCrc((long) 100);
        java.lang.Object obj78 = zipArchiveEntry74.clone();
        zipArchiveEntry74.setTime((long) (byte) 0);
        zipArchiveEntry74.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime83 = zipArchiveEntry74.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry64.setLastAccessTime(fileTime83);
        boolean boolean85 = zipArchiveEntry42.equals((java.lang.Object) fileTime83);
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry38.setCreationTime(fileTime83);
        java.util.zip.ZipEntry zipEntry87 = zipArchiveEntry33.setLastModifiedTime(fileTime83);
        java.util.zip.ZipEntry zipEntry88 = zipArchiveEntry24.setCreationTime(fileTime83);
        java.util.zip.ZipEntry zipEntry89 = zipArchiveEntry1.setLastAccessTime(fileTime83);
        long long90 = zipArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(fileTime20);
        org.junit.Assert.assertNotNull(zipEntry21);
        org.junit.Assert.assertEquals(zipEntry21.toString(), "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(fileTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(fileTime34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "");
        org.junit.Assert.assertNotNull(fileTime61);
        org.junit.Assert.assertNotNull(zipEntry62);
        org.junit.Assert.assertEquals(zipEntry62.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "");
        org.junit.Assert.assertNotNull(fileTime83);
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(zipEntry86);
        org.junit.Assert.assertEquals(zipEntry86.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry87);
        org.junit.Assert.assertEquals(zipEntry87.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry88);
        org.junit.Assert.assertEquals(zipEntry88.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry89);
        org.junit.Assert.assertEquals(zipEntry89.toString(), "");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + (-1L) + "'", long90 == (-1L));
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getExternalAttributes();
        int int9 = zipArchiveEntry1.getPlatform();
        int int10 = zipArchiveEntry1.getPlatform();
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry1.getLastModifiedTime();
        boolean boolean12 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setMethod(100);
        java.nio.file.attribute.FileTime fileTime16 = zipArchiveEntry1.getCreationTime();
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry1.getLastAccessTime();
        boolean boolean18 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = zipArchiveEntry1.getExtraFields();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertNull(fileTime16);
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray19, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        byte[] byteArray2 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = zipArchiveEntry1.getExtraField(zipShort3);
        zipArchiveEntry1.setTime(196609L);
        long long7 = zipArchiveEntry1.getTime();
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNull(zipExtraField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 196609L + "'", long7 == 196609L);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        int int5 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = zipArchiveEntry1.getExtraField(zipShort6);
        java.lang.Object obj8 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setCrc((long) 8);
        long long11 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(zipExtraField7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(fileTime12);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        zipArchiveEntry1.setSize((long) 3);
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastAccessTime();
        java.lang.String str8 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setExternalAttributes((long) 97);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj13 = null;
        boolean boolean14 = zipArchiveEntry12.equals(obj13);
        long long15 = zipArchiveEntry12.getExternalAttributes();
        int int16 = zipArchiveEntry12.getUnixMode();
        zipArchiveEntry12.setPlatform((int) 'a');
        long long19 = zipArchiveEntry12.getExternalAttributes();
        long long20 = zipArchiveEntry12.getSize();
        long long21 = zipArchiveEntry12.getCrc();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField23 = zipArchiveEntry12.getExtraField(zipShort22);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int26 = zipArchiveEntry25.getInternalAttributes();
        zipArchiveEntry25.setCrc((long) 100);
        boolean boolean30 = zipArchiveEntry25.equals((java.lang.Object) true);
        zipArchiveEntry25.setSize(100L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int35 = zipArchiveEntry34.getInternalAttributes();
        zipArchiveEntry34.setCrc((long) 100);
        java.lang.Object obj38 = zipArchiveEntry34.clone();
        java.util.Date date39 = zipArchiveEntry34.getLastModifiedDate();
        int int40 = zipArchiveEntry34.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj43 = null;
        boolean boolean44 = zipArchiveEntry42.equals(obj43);
        long long45 = zipArchiveEntry42.getExternalAttributes();
        int int46 = zipArchiveEntry42.getUnixMode();
        zipArchiveEntry42.setPlatform((int) 'a');
        long long49 = zipArchiveEntry42.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int52 = zipArchiveEntry51.getInternalAttributes();
        zipArchiveEntry51.setCrc((long) 100);
        byte[] byteArray55 = zipArchiveEntry51.getExtra();
        long long56 = zipArchiveEntry51.getCompressedSize();
        int int57 = zipArchiveEntry51.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj60 = null;
        boolean boolean61 = zipArchiveEntry59.equals(obj60);
        long long62 = zipArchiveEntry59.getExternalAttributes();
        int int63 = zipArchiveEntry59.getUnixMode();
        zipArchiveEntry59.setPlatform((int) 'a');
        int int66 = zipArchiveEntry59.getUnixMode();
        byte[] byteArray67 = zipArchiveEntry59.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int70 = zipArchiveEntry69.getInternalAttributes();
        zipArchiveEntry69.setCrc((long) 100);
        java.lang.Object obj73 = zipArchiveEntry69.clone();
        zipArchiveEntry69.setTime((long) (byte) 0);
        zipArchiveEntry69.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime78 = zipArchiveEntry69.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry79 = zipArchiveEntry59.setLastModifiedTime(fileTime78);
        java.util.zip.ZipEntry zipEntry80 = zipArchiveEntry51.setLastAccessTime(fileTime78);
        java.util.zip.ZipEntry zipEntry81 = zipArchiveEntry42.setLastAccessTime(fileTime78);
        java.util.zip.ZipEntry zipEntry82 = zipArchiveEntry34.setLastAccessTime(fileTime78);
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry25.setLastModifiedTime(fileTime78);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry12.setLastModifiedTime(fileTime78);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry1.setCreationTime(fileTime78);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort86 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort86);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(zipExtraField23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(byteArray55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "");
        org.junit.Assert.assertNotNull(fileTime78);
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
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getCrc();
        byte[] byteArray9 = zipArchiveEntry1.getCentralDirectoryExtra();
        long long10 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setMethod((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(fileTime11);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setName("");
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setInternalAttributes(0);
        zipArchiveEntry1.setExtra();
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry1.getCreationTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertNull(fileTime12);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        int int7 = zipArchiveEntry1.getPlatform();
        int int8 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj11 = null;
        boolean boolean12 = zipArchiveEntry10.equals(obj11);
        zipArchiveEntry10.setSize((long) 3);
        java.util.Date date15 = zipArchiveEntry10.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime16 = zipArchiveEntry10.getLastAccessTime();
        zipArchiveEntry10.setPlatform((-1));
        long long19 = zipArchiveEntry10.getSize();
        zipArchiveEntry10.setComment("");
        java.nio.file.attribute.FileTime fileTime22 = zipArchiveEntry10.getLastAccessTime();
        byte[] byteArray23 = zipArchiveEntry10.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray23);
        int int25 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
        org.junit.Assert.assertNull(fileTime22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int7 = zipArchiveEntry6.getInternalAttributes();
        zipArchiveEntry6.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        zipArchiveEntry12.setSize(8L);
        int int15 = zipArchiveEntry12.getInternalAttributes();
        java.nio.file.attribute.FileTime fileTime16 = zipArchiveEntry12.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry12);
        zipArchiveEntry12.setSize(0L);
        zipArchiveEntry12.setExternalAttributes(10L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray10, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(fileTime16);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getCrc();
        byte[] byteArray9 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setMethod((int) '4');
        int int12 = zipArchiveEntry1.getMethod();
        byte[] byteArray13 = zipArchiveEntry1.getExtra();
        zipArchiveEntry1.setTime((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNull(byteArray13);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getExternalAttributes();
        int int9 = zipArchiveEntry1.getPlatform();
        int int10 = zipArchiveEntry1.getPlatform();
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry1.getLastModifiedTime();
        boolean boolean12 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry1.getLastAccessTime();
        boolean boolean14 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        zipArchiveEntry1.setSize((long) 3);
        byte[] byteArray6 = zipArchiveEntry1.getLocalFileDataExtra();
        byte[] byteArray7 = zipArchiveEntry1.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        byte[] byteArray10 = zipArchiveEntry9.getExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = zipArchiveEntry9.getExtraField(zipShort11);
        byte[] byteArray13 = zipArchiveEntry9.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray13);
        zipArchiveEntry1.setInternalAttributes(52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNull(zipExtraField12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getCrc();
        boolean boolean9 = zipArchiveEntry1.isSupportedCompressionMethod();
        byte[] byteArray10 = zipArchiveEntry1.getLocalFileDataExtra();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        boolean boolean7 = zipArchiveEntry1.equals((java.lang.Object) 100.0d);
        zipArchiveEntry1.setMethod((int) (short) 1);
        boolean boolean10 = zipArchiveEntry1.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
        long long12 = zipArchiveEntry11.getSize();
        byte[] byteArray13 = zipArchiveEntry11.getLocalFileDataExtra();
        zipArchiveEntry11.setMethod(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        int int3 = zipArchiveEntry1.getUnixMode();
        byte[] byteArray4 = zipArchiveEntry1.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int7 = zipArchiveEntry6.getInternalAttributes();
        zipArchiveEntry6.setCrc((long) 100);
        java.lang.Object obj10 = zipArchiveEntry6.clone();
        zipArchiveEntry6.setTime((long) (byte) 0);
        zipArchiveEntry6.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry6.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry16 = zipArchiveEntry1.setCreationTime(fileTime15);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj19 = null;
        boolean boolean20 = zipArchiveEntry18.equals(obj19);
        zipArchiveEntry18.setSize((long) 3);
        byte[] byteArray23 = zipArchiveEntry18.getLocalFileDataExtra();
        byte[] byteArray24 = zipArchiveEntry18.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray24);
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setCompressedSize(32L);
        byte[] byteArray29 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertNotNull(fileTime15);
        org.junit.Assert.assertNotNull(zipEntry16);
        org.junit.Assert.assertEquals(zipEntry16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        int int8 = zipArchiveEntry1.getUnixMode();
        long long9 = zipArchiveEntry1.getSize();
        long long10 = zipArchiveEntry1.getTime();
        int int11 = zipArchiveEntry1.getPlatform();
        java.util.Date date12 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setExternalAttributes((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        int int7 = zipArchiveEntry1.getMethod();
        int int8 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setInternalAttributes((int) (byte) 100);
        long long11 = zipArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        boolean boolean7 = zipArchiveEntry1.equals((java.lang.Object) 100.0d);
        zipArchiveEntry1.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj12 = null;
        boolean boolean13 = zipArchiveEntry11.equals(obj12);
        long long14 = zipArchiveEntry11.getExternalAttributes();
        int int15 = zipArchiveEntry11.getUnixMode();
        boolean boolean17 = zipArchiveEntry11.equals((java.lang.Object) 100.0d);
        zipArchiveEntry11.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int22 = zipArchiveEntry21.getInternalAttributes();
        zipArchiveEntry21.setCrc((long) 100);
        java.lang.Object obj25 = zipArchiveEntry21.clone();
        zipArchiveEntry21.setTime((long) (byte) 0);
        int int28 = zipArchiveEntry21.getUnixMode();
        zipArchiveEntry21.setCrc((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int33 = zipArchiveEntry32.getInternalAttributes();
        zipArchiveEntry32.setCrc((long) 100);
        java.lang.Object obj36 = zipArchiveEntry32.clone();
        zipArchiveEntry32.setTime((long) (byte) 0);
        zipArchiveEntry32.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime41 = zipArchiveEntry32.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry42 = zipArchiveEntry21.setLastAccessTime(fileTime41);
        java.util.zip.ZipEntry zipEntry43 = zipArchiveEntry11.setCreationTime(fileTime41);
        java.util.zip.ZipEntry zipEntry44 = zipArchiveEntry1.setLastAccessTime(fileTime41);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField45 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addExtraField(zipExtraField45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "");
        org.junit.Assert.assertNotNull(fileTime41);
        org.junit.Assert.assertNotNull(zipEntry42);
        org.junit.Assert.assertEquals(zipEntry42.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry43);
        org.junit.Assert.assertEquals(zipEntry43.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry44);
        org.junit.Assert.assertEquals(zipEntry44.toString(), "");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        boolean boolean7 = zipArchiveEntry1.equals((java.lang.Object) 100.0d);
        zipArchiveEntry1.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj12 = null;
        boolean boolean13 = zipArchiveEntry11.equals(obj12);
        long long14 = zipArchiveEntry11.getExternalAttributes();
        byte[] byteArray15 = zipArchiveEntry11.getCentralDirectoryExtra();
        zipArchiveEntry1.setExtra(byteArray15);
        zipArchiveEntry1.setUnixMode((int) (short) 100);
        zipArchiveEntry1.setMethod(52);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj23 = null;
        boolean boolean24 = zipArchiveEntry22.equals(obj23);
        long long25 = zipArchiveEntry22.getExternalAttributes();
        int int26 = zipArchiveEntry22.getUnixMode();
        zipArchiveEntry22.setPlatform((int) 'a');
        long long29 = zipArchiveEntry22.getExternalAttributes();
        int int30 = zipArchiveEntry22.getPlatform();
        int int31 = zipArchiveEntry22.getPlatform();
        java.nio.file.attribute.FileTime fileTime32 = zipArchiveEntry22.getLastModifiedTime();
        boolean boolean33 = zipArchiveEntry22.isDirectory();
        java.nio.file.attribute.FileTime fileTime34 = zipArchiveEntry22.getLastAccessTime();
        zipArchiveEntry22.setMethod(100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        byte[] byteArray39 = zipArchiveEntry38.getExtra();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField41 = zipArchiveEntry38.getExtraField(zipShort40);
        byte[] byteArray42 = zipArchiveEntry38.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int45 = zipArchiveEntry44.getInternalAttributes();
        byte[] byteArray46 = zipArchiveEntry44.getCentralDirectoryExtra();
        zipArchiveEntry44.setSize((long) 8);
        java.nio.file.attribute.FileTime fileTime49 = zipArchiveEntry44.getLastAccessTime();
        java.lang.Object obj50 = zipArchiveEntry44.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj53 = null;
        boolean boolean54 = zipArchiveEntry52.equals(obj53);
        long long55 = zipArchiveEntry52.getExternalAttributes();
        int int56 = zipArchiveEntry52.getUnixMode();
        zipArchiveEntry52.setPlatform((int) 'a');
        int int59 = zipArchiveEntry52.getUnixMode();
        byte[] byteArray60 = zipArchiveEntry52.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int63 = zipArchiveEntry62.getInternalAttributes();
        zipArchiveEntry62.setCrc((long) 100);
        java.lang.Object obj66 = zipArchiveEntry62.clone();
        zipArchiveEntry62.setTime((long) (byte) 0);
        zipArchiveEntry62.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime71 = zipArchiveEntry62.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry72 = zipArchiveEntry52.setLastModifiedTime(fileTime71);
        java.util.zip.ZipEntry zipEntry73 = zipArchiveEntry44.setCreationTime(fileTime71);
        java.util.zip.ZipEntry zipEntry74 = zipArchiveEntry38.setLastAccessTime(fileTime71);
        java.util.zip.ZipEntry zipEntry75 = zipArchiveEntry22.setCreationTime(fileTime71);
        java.util.zip.ZipEntry zipEntry76 = zipArchiveEntry1.setLastAccessTime(fileTime71);
        byte[] byteArray77 = zipArchiveEntry1.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField78 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addAsFirstExtraField(zipExtraField78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNull(fileTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(fileTime34);
        org.junit.Assert.assertNull(byteArray39);
        org.junit.Assert.assertNull(zipExtraField41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNull(fileTime49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "");
        org.junit.Assert.assertNotNull(fileTime71);
        org.junit.Assert.assertNotNull(zipEntry72);
        org.junit.Assert.assertEquals(zipEntry72.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry73);
        org.junit.Assert.assertEquals(zipEntry73.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry74);
        org.junit.Assert.assertEquals(zipEntry74.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry75);
        org.junit.Assert.assertEquals(zipEntry75.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry76);
        org.junit.Assert.assertEquals(zipEntry76.toString(), "");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] {});
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getExternalAttributes();
        long long9 = zipArchiveEntry1.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setMethod((int) (byte) 1);
        byte[] byteArray15 = zipArchiveEntry12.getCentralDirectoryExtra();
        int int16 = zipArchiveEntry12.getPlatform();
        java.lang.String str17 = zipArchiveEntry12.getComment();
        int int18 = zipArchiveEntry12.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj21 = null;
        boolean boolean22 = zipArchiveEntry20.equals(obj21);
        long long23 = zipArchiveEntry20.getExternalAttributes();
        int int24 = zipArchiveEntry20.getUnixMode();
        zipArchiveEntry20.setPlatform((int) 'a');
        long long27 = zipArchiveEntry20.getExternalAttributes();
        int int28 = zipArchiveEntry20.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int31 = zipArchiveEntry30.getInternalAttributes();
        zipArchiveEntry30.setCrc((long) 100);
        java.lang.Object obj34 = zipArchiveEntry30.clone();
        zipArchiveEntry30.setTime((long) (byte) 0);
        zipArchiveEntry30.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime39 = zipArchiveEntry30.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry40 = zipArchiveEntry20.setLastAccessTime(fileTime39);
        java.util.zip.ZipEntry zipEntry41 = zipArchiveEntry12.setLastAccessTime(fileTime39);
        java.util.zip.ZipEntry zipEntry42 = zipArchiveEntry1.setCreationTime(fileTime39);
        java.nio.file.attribute.FileTime fileTime43 = zipArchiveEntry1.getCreationTime();
        java.lang.String str44 = zipArchiveEntry1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "");
        org.junit.Assert.assertNotNull(fileTime39);
        org.junit.Assert.assertNotNull(zipEntry40);
        org.junit.Assert.assertEquals(zipEntry40.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry41);
        org.junit.Assert.assertEquals(zipEntry41.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry42);
        org.junit.Assert.assertEquals(zipEntry42.toString(), "");
        org.junit.Assert.assertNotNull(fileTime43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray3 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setSize((long) 8);
        long long6 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setInternalAttributes((int) (byte) 100);
        int int9 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj14 = null;
        boolean boolean15 = zipArchiveEntry13.equals(obj14);
        long long16 = zipArchiveEntry13.getExternalAttributes();
        int int17 = zipArchiveEntry13.getUnixMode();
        zipArchiveEntry13.setPlatform((int) 'a');
        long long20 = zipArchiveEntry13.getExternalAttributes();
        int int21 = zipArchiveEntry13.getPlatform();
        byte[] byteArray22 = zipArchiveEntry13.getCentralDirectoryExtra();
        zipArchiveEntry1.setExtra(byteArray22);
        long long24 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8L + "'", long6 == 8L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 8L + "'", long24 == 8L);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        zipArchiveEntry1.setSize((long) 3);
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        boolean boolean7 = zipArchiveEntry1.isSupportedCompressionMethod();
        zipArchiveEntry1.setCompressedSize((long) 10);
        int int10 = zipArchiveEntry1.getPlatform();
        java.util.Date date11 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int9 = zipArchiveEntry8.getInternalAttributes();
        zipArchiveEntry8.setCrc((long) 100);
        java.lang.Object obj12 = zipArchiveEntry8.clone();
        zipArchiveEntry8.setTime((long) (byte) 0);
        zipArchiveEntry8.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry8.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry18 = zipArchiveEntry1.setLastAccessTime(fileTime17);
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setPlatform(52);
        zipArchiveEntry1.setPlatform(3);
        zipArchiveEntry1.setExternalAttributes((long) (-1));
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(fileTime17);
        org.junit.Assert.assertNotNull(zipEntry18);
        org.junit.Assert.assertEquals(zipEntry18.toString(), "");
        org.junit.Assert.assertNull(fileTime19);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        int int5 = zipArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = zipArchiveEntry1.getExtraField(zipShort6);
        java.lang.Object obj8 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int11 = zipArchiveEntry10.getInternalAttributes();
        zipArchiveEntry10.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj16 = null;
        boolean boolean17 = zipArchiveEntry15.equals(obj16);
        zipArchiveEntry15.setSize((long) 3);
        byte[] byteArray20 = zipArchiveEntry15.getLocalFileDataExtra();
        zipArchiveEntry10.setExtra(byteArray20);
        zipArchiveEntry10.setCompressedSize(100L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj26 = null;
        boolean boolean27 = zipArchiveEntry25.equals(obj26);
        long long28 = zipArchiveEntry25.getExternalAttributes();
        int int29 = zipArchiveEntry25.getUnixMode();
        zipArchiveEntry25.setPlatform((int) 'a');
        long long32 = zipArchiveEntry25.getExternalAttributes();
        int int33 = zipArchiveEntry25.getPlatform();
        byte[] byteArray34 = zipArchiveEntry25.getLocalFileDataExtra();
        boolean boolean35 = zipArchiveEntry10.equals((java.lang.Object) zipArchiveEntry25);
        zipArchiveEntry25.setMethod((int) ' ');
        zipArchiveEntry25.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime42 = zipArchiveEntry41.getLastModifiedTime();
        boolean boolean43 = zipArchiveEntry25.equals((java.lang.Object) fileTime42);
        long long44 = zipArchiveEntry25.getExternalAttributes();
        byte[] byteArray45 = zipArchiveEntry25.getCentralDirectoryExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray45);
        java.util.Date date47 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry49 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int50 = zipArchiveEntry49.getInternalAttributes();
        zipArchiveEntry49.setCrc((long) 100);
        java.lang.Object obj53 = zipArchiveEntry49.clone();
        zipArchiveEntry49.setTime((long) (byte) 0);
        zipArchiveEntry49.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime58 = zipArchiveEntry49.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry60.setMethod((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray63 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        zipArchiveEntry60.setExtraFields(zipExtraFieldArray63);
        java.util.Date date65 = zipArchiveEntry60.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry67 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime68 = zipArchiveEntry67.getLastModifiedTime();
        int int69 = zipArchiveEntry67.getUnixMode();
        byte[] byteArray70 = zipArchiveEntry67.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry72 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int73 = zipArchiveEntry72.getInternalAttributes();
        zipArchiveEntry72.setCrc((long) 100);
        java.lang.Object obj76 = zipArchiveEntry72.clone();
        zipArchiveEntry72.setTime((long) (byte) 0);
        zipArchiveEntry72.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime81 = zipArchiveEntry72.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry82 = zipArchiveEntry67.setCreationTime(fileTime81);
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry60.setLastAccessTime(fileTime81);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry49.setLastModifiedTime(fileTime81);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry1.setLastAccessTime(fileTime81);
        zipArchiveEntry1.setCrc((long) '4');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(zipExtraField7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(fileTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "");
        org.junit.Assert.assertNotNull(fileTime58);
        org.junit.Assert.assertNotNull(zipExtraFieldArray63);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray63, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj76), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "");
        org.junit.Assert.assertNotNull(fileTime81);
        org.junit.Assert.assertNotNull(zipEntry82);
        org.junit.Assert.assertEquals(zipEntry82.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getCrc();
        byte[] byteArray9 = zipArchiveEntry1.getCentralDirectoryExtra();
        long long10 = zipArchiveEntry1.getCompressedSize();
        long long11 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setUnixMode((int) (byte) 0);
        java.nio.file.attribute.FileTime fileTime14 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setComment("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(fileTime14);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        zipArchiveEntry1.setSize((long) 3);
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setPlatform((-1));
        long long10 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setComment("");
        boolean boolean13 = zipArchiveEntry1.isSupportedCompressionMethod();
        long long14 = zipArchiveEntry1.getExternalAttributes();
        long long15 = zipArchiveEntry1.getCrc();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.String str3 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setName("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj8 = null;
        boolean boolean9 = zipArchiveEntry7.equals(obj8);
        long long10 = zipArchiveEntry7.getExternalAttributes();
        int int11 = zipArchiveEntry7.getUnixMode();
        boolean boolean13 = zipArchiveEntry7.equals((java.lang.Object) 100.0d);
        zipArchiveEntry7.setCompressedSize((long) 'a');
        java.util.Date date16 = zipArchiveEntry7.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int19 = zipArchiveEntry18.getInternalAttributes();
        zipArchiveEntry18.setCrc((long) 100);
        java.lang.Object obj22 = zipArchiveEntry18.clone();
        zipArchiveEntry18.setTime((long) (byte) 0);
        boolean boolean25 = zipArchiveEntry7.equals((java.lang.Object) zipArchiveEntry18);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj28 = null;
        boolean boolean29 = zipArchiveEntry27.equals(obj28);
        long long30 = zipArchiveEntry27.getExternalAttributes();
        int int31 = zipArchiveEntry27.getUnixMode();
        long long32 = zipArchiveEntry27.getExternalAttributes();
        java.lang.String str33 = zipArchiveEntry27.getName();
        long long34 = zipArchiveEntry27.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int37 = zipArchiveEntry36.getInternalAttributes();
        zipArchiveEntry36.setCrc((long) 100);
        java.lang.Object obj40 = zipArchiveEntry36.clone();
        zipArchiveEntry36.setTime((long) (byte) 0);
        int int43 = zipArchiveEntry36.getUnixMode();
        zipArchiveEntry36.setCrc((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int48 = zipArchiveEntry47.getInternalAttributes();
        zipArchiveEntry47.setCrc((long) 100);
        java.lang.Object obj51 = zipArchiveEntry47.clone();
        zipArchiveEntry47.setTime((long) (byte) 0);
        zipArchiveEntry47.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime56 = zipArchiveEntry47.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry57 = zipArchiveEntry36.setLastAccessTime(fileTime56);
        java.util.zip.ZipEntry zipEntry58 = zipArchiveEntry27.setCreationTime(fileTime56);
        java.util.zip.ZipEntry zipEntry59 = zipArchiveEntry18.setCreationTime(fileTime56);
        java.util.zip.ZipEntry zipEntry60 = zipArchiveEntry1.setLastModifiedTime(fileTime56);
        zipArchiveEntry1.setName("hi!");
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "");
        org.junit.Assert.assertNotNull(fileTime56);
        org.junit.Assert.assertNotNull(zipEntry57);
        org.junit.Assert.assertEquals(zipEntry57.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry58);
        org.junit.Assert.assertEquals(zipEntry58.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry59);
        org.junit.Assert.assertEquals(zipEntry59.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry60);
        org.junit.Assert.assertEquals(zipEntry60.toString(), "hi!");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray3 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setSize((long) 8);
        long long6 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setUnixMode(3);
        long long9 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj12 = null;
        boolean boolean13 = zipArchiveEntry11.equals(obj12);
        long long14 = zipArchiveEntry11.getExternalAttributes();
        int int15 = zipArchiveEntry11.getUnixMode();
        zipArchiveEntry11.setPlatform((int) 'a');
        long long18 = zipArchiveEntry11.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = zipArchiveEntry11.getExtraFields();
        java.util.Date date20 = zipArchiveEntry11.getLastModifiedDate();
        boolean boolean21 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj24 = null;
        boolean boolean25 = zipArchiveEntry23.equals(obj24);
        long long26 = zipArchiveEntry23.getExternalAttributes();
        int int27 = zipArchiveEntry23.getUnixMode();
        zipArchiveEntry23.setPlatform((int) 'a');
        long long30 = zipArchiveEntry23.getExternalAttributes();
        int int31 = zipArchiveEntry23.getPlatform();
        byte[] byteArray32 = zipArchiveEntry23.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj35 = null;
        boolean boolean36 = zipArchiveEntry34.equals(obj35);
        long long37 = zipArchiveEntry34.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int40 = zipArchiveEntry39.getInternalAttributes();
        zipArchiveEntry39.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray43 = zipArchiveEntry39.getExtraFields();
        zipArchiveEntry34.setExtraFields(zipExtraFieldArray43);
        zipArchiveEntry23.setExtraFields(zipExtraFieldArray43);
        long long46 = zipArchiveEntry23.getTime();
        int int47 = zipArchiveEntry23.getInternalAttributes();
        byte[] byteArray48 = zipArchiveEntry23.getCentralDirectoryExtra();
        zipArchiveEntry11.setCentralDirectoryExtra(byteArray48);
        java.nio.file.attribute.FileTime fileTime50 = zipArchiveEntry11.getCreationTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8L + "'", long9 == 8L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray19, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray43);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray43, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertNull(fileTime50);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry6.getLastModifiedTime();
        java.util.Date date8 = zipArchiveEntry6.getLastModifiedDate();
        zipArchiveEntry6.setPlatform((int) (byte) -1);
        java.lang.String str11 = zipArchiveEntry6.getName();
        zipArchiveEntry6.setCrc((long) (byte) 10);
        zipArchiveEntry6.setTime((long) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime18 = zipArchiveEntry17.getLastModifiedTime();
        zipArchiveEntry17.setTime(1L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = zipArchiveEntry17.getExtraFields();
        long long22 = zipArchiveEntry17.getSize();
        byte[] byteArray23 = zipArchiveEntry17.getCentralDirectoryExtra();
        zipArchiveEntry17.setMethod((int) ' ');
        byte[] byteArray26 = zipArchiveEntry17.getLocalFileDataExtra();
        zipArchiveEntry6.setExtra(byteArray26);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(fileTime18);
        org.junit.Assert.assertNotNull(zipExtraFieldArray21);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray21, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        byte[] byteArray3 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setSize((long) 8);
        long long6 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setInternalAttributes((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj11 = null;
        boolean boolean12 = zipArchiveEntry10.equals(obj11);
        zipArchiveEntry10.setSize((long) 3);
        byte[] byteArray15 = zipArchiveEntry10.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int18 = zipArchiveEntry17.getInternalAttributes();
        zipArchiveEntry17.setCrc((long) 100);
        java.lang.Object obj21 = zipArchiveEntry17.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int24 = zipArchiveEntry23.getInternalAttributes();
        zipArchiveEntry23.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry23.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj30 = null;
        boolean boolean31 = zipArchiveEntry29.equals(obj30);
        long long32 = zipArchiveEntry29.getExternalAttributes();
        int int33 = zipArchiveEntry29.getUnixMode();
        long long34 = zipArchiveEntry29.getExternalAttributes();
        boolean boolean35 = zipArchiveEntry29.isSupportedCompressionMethod();
        boolean boolean36 = zipArchiveEntry29.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime39 = zipArchiveEntry38.getLastModifiedTime();
        int int40 = zipArchiveEntry38.getUnixMode();
        byte[] byteArray41 = zipArchiveEntry38.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj44 = null;
        boolean boolean45 = zipArchiveEntry43.equals(obj44);
        long long46 = zipArchiveEntry43.getExternalAttributes();
        int int47 = zipArchiveEntry43.getUnixMode();
        zipArchiveEntry43.setPlatform((int) 'a');
        long long50 = zipArchiveEntry43.getExternalAttributes();
        int int51 = zipArchiveEntry43.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int54 = zipArchiveEntry53.getInternalAttributes();
        zipArchiveEntry53.setCrc((long) 100);
        java.lang.Object obj57 = zipArchiveEntry53.clone();
        zipArchiveEntry53.setTime((long) (byte) 0);
        zipArchiveEntry53.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime62 = zipArchiveEntry53.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry63 = zipArchiveEntry43.setLastAccessTime(fileTime62);
        java.util.zip.ZipEntry zipEntry64 = zipArchiveEntry38.setLastAccessTime(fileTime62);
        java.util.zip.ZipEntry zipEntry65 = zipArchiveEntry29.setCreationTime(fileTime62);
        java.util.zip.ZipEntry zipEntry66 = zipArchiveEntry23.setLastModifiedTime(fileTime62);
        java.util.zip.ZipEntry zipEntry67 = zipArchiveEntry17.setLastModifiedTime(fileTime62);
        java.time.LocalDateTime localDateTime68 = zipArchiveEntry17.getTimeLocal();
        zipArchiveEntry10.setTimeLocal(localDateTime68);
        boolean boolean70 = zipArchiveEntry1.equals((java.lang.Object) localDateTime68);
        zipArchiveEntry1.setPlatform((-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry74 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj75 = null;
        boolean boolean76 = zipArchiveEntry74.equals(obj75);
        long long77 = zipArchiveEntry74.getExternalAttributes();
        int int78 = zipArchiveEntry74.getUnixMode();
        boolean boolean80 = zipArchiveEntry74.equals((java.lang.Object) 100.0d);
        zipArchiveEntry74.setCompressedSize((long) 'a');
        java.lang.String str83 = zipArchiveEntry74.getComment();
        zipArchiveEntry74.setInternalAttributes((int) (byte) 100);
        boolean boolean86 = zipArchiveEntry74.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray87 = zipArchiveEntry74.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8L + "'", long6 == 8L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray27, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(fileTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "");
        org.junit.Assert.assertNotNull(fileTime62);
        org.junit.Assert.assertNotNull(zipEntry63);
        org.junit.Assert.assertEquals(zipEntry63.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry64);
        org.junit.Assert.assertEquals(zipEntry64.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry65);
        org.junit.Assert.assertEquals(zipEntry65.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry66);
        org.junit.Assert.assertEquals(zipEntry66.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry67);
        org.junit.Assert.assertEquals(zipEntry67.toString(), "");
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray87);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray87, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        java.lang.String str7 = zipArchiveEntry1.getName();
        java.lang.String str8 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int11 = zipArchiveEntry10.getInternalAttributes();
        zipArchiveEntry10.setCrc((long) 100);
        java.lang.Object obj14 = zipArchiveEntry10.clone();
        zipArchiveEntry10.setTime((long) (byte) 0);
        zipArchiveEntry10.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry10.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry20 = zipArchiveEntry1.setLastAccessTime(fileTime19);
        long long21 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setUnixMode(10);
        java.nio.file.attribute.FileTime fileTime25 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(fileTime19);
        org.junit.Assert.assertNotNull(zipEntry20);
        org.junit.Assert.assertEquals(zipEntry20.toString(), "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(fileTime25);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        boolean boolean7 = zipArchiveEntry1.equals((java.lang.Object) 100.0d);
        zipArchiveEntry1.setMethod((int) (short) 1);
        boolean boolean10 = zipArchiveEntry1.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
        zipArchiveEntry1.setInternalAttributes((int) (short) 1);
        int int14 = zipArchiveEntry1.getMethod();
        byte[] byteArray15 = zipArchiveEntry1.getLocalFileDataExtra();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setCompressedSize((long) (short) 0);
        java.lang.String str10 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj13 = null;
        boolean boolean14 = zipArchiveEntry12.equals(obj13);
        long long15 = zipArchiveEntry12.getExternalAttributes();
        int int16 = zipArchiveEntry12.getUnixMode();
        boolean boolean18 = zipArchiveEntry12.equals((java.lang.Object) 100.0d);
        zipArchiveEntry12.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj23 = null;
        boolean boolean24 = zipArchiveEntry22.equals(obj23);
        long long25 = zipArchiveEntry22.getExternalAttributes();
        int int26 = zipArchiveEntry22.getUnixMode();
        boolean boolean28 = zipArchiveEntry22.equals((java.lang.Object) 100.0d);
        zipArchiveEntry22.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int33 = zipArchiveEntry32.getInternalAttributes();
        zipArchiveEntry32.setCrc((long) 100);
        java.lang.Object obj36 = zipArchiveEntry32.clone();
        zipArchiveEntry32.setTime((long) (byte) 0);
        int int39 = zipArchiveEntry32.getUnixMode();
        zipArchiveEntry32.setCrc((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int44 = zipArchiveEntry43.getInternalAttributes();
        zipArchiveEntry43.setCrc((long) 100);
        java.lang.Object obj47 = zipArchiveEntry43.clone();
        zipArchiveEntry43.setTime((long) (byte) 0);
        zipArchiveEntry43.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime52 = zipArchiveEntry43.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry53 = zipArchiveEntry32.setLastAccessTime(fileTime52);
        java.util.zip.ZipEntry zipEntry54 = zipArchiveEntry22.setCreationTime(fileTime52);
        java.util.zip.ZipEntry zipEntry55 = zipArchiveEntry12.setLastAccessTime(fileTime52);
        boolean boolean56 = zipArchiveEntry1.equals((java.lang.Object) zipEntry55);
        long long57 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "");
        org.junit.Assert.assertNotNull(fileTime52);
        org.junit.Assert.assertNotNull(zipEntry53);
        org.junit.Assert.assertEquals(zipEntry53.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry54);
        org.junit.Assert.assertEquals(zipEntry54.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry55);
        org.junit.Assert.assertEquals(zipEntry55.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        byte[] byteArray5 = zipArchiveEntry1.getCentralDirectoryExtra();
        boolean boolean6 = zipArchiveEntry1.isSupportedCompressionMethod();
        zipArchiveEntry1.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj11 = null;
        boolean boolean12 = zipArchiveEntry10.equals(obj11);
        long long13 = zipArchiveEntry10.getExternalAttributes();
        int int14 = zipArchiveEntry10.getUnixMode();
        zipArchiveEntry10.setPlatform((int) 'a');
        long long17 = zipArchiveEntry10.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int20 = zipArchiveEntry19.getInternalAttributes();
        zipArchiveEntry19.setCrc((long) 100);
        byte[] byteArray23 = zipArchiveEntry19.getExtra();
        long long24 = zipArchiveEntry19.getCompressedSize();
        int int25 = zipArchiveEntry19.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj28 = null;
        boolean boolean29 = zipArchiveEntry27.equals(obj28);
        long long30 = zipArchiveEntry27.getExternalAttributes();
        int int31 = zipArchiveEntry27.getUnixMode();
        zipArchiveEntry27.setPlatform((int) 'a');
        int int34 = zipArchiveEntry27.getUnixMode();
        byte[] byteArray35 = zipArchiveEntry27.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int38 = zipArchiveEntry37.getInternalAttributes();
        zipArchiveEntry37.setCrc((long) 100);
        java.lang.Object obj41 = zipArchiveEntry37.clone();
        zipArchiveEntry37.setTime((long) (byte) 0);
        zipArchiveEntry37.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime46 = zipArchiveEntry37.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry47 = zipArchiveEntry27.setLastModifiedTime(fileTime46);
        java.util.zip.ZipEntry zipEntry48 = zipArchiveEntry19.setLastAccessTime(fileTime46);
        java.util.zip.ZipEntry zipEntry49 = zipArchiveEntry10.setLastAccessTime(fileTime46);
        java.util.zip.ZipEntry zipEntry50 = zipArchiveEntry1.setCreationTime(fileTime46);
        java.lang.String str51 = zipArchiveEntry1.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "");
        org.junit.Assert.assertNotNull(fileTime46);
        org.junit.Assert.assertNotNull(zipEntry47);
        org.junit.Assert.assertEquals(zipEntry47.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry48);
        org.junit.Assert.assertEquals(zipEntry48.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry49);
        org.junit.Assert.assertEquals(zipEntry49.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry50);
        org.junit.Assert.assertEquals(zipEntry50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        java.lang.Object obj5 = zipArchiveEntry1.clone();
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = zipArchiveEntry1.getExtraFields();
        int int9 = zipArchiveEntry1.getPlatform();
        boolean boolean10 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray8, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(fileTime11);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        zipArchiveEntry1.setSize(100L);
        long long9 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(fileTime12);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        boolean boolean7 = zipArchiveEntry1.isSupportedCompressionMethod();
        boolean boolean8 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setSize((long) 52);
        int int12 = zipArchiveEntry1.getInternalAttributes();
        boolean boolean13 = zipArchiveEntry1.isSupportedCompressionMethod();
        boolean boolean14 = zipArchiveEntry1.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray9, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        byte[] byteArray5 = zipArchiveEntry1.getExtra();
        long long6 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setInternalAttributes(0);
        zipArchiveEntry1.setSize((long) (short) 0);
        java.lang.String str11 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.Object obj3 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj6 = null;
        boolean boolean7 = zipArchiveEntry5.equals(obj6);
        long long8 = zipArchiveEntry5.getExternalAttributes();
        int int9 = zipArchiveEntry5.getUnixMode();
        boolean boolean11 = zipArchiveEntry5.equals((java.lang.Object) 100.0d);
        zipArchiveEntry5.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj16 = null;
        boolean boolean17 = zipArchiveEntry15.equals(obj16);
        long long18 = zipArchiveEntry15.getExternalAttributes();
        int int19 = zipArchiveEntry15.getUnixMode();
        boolean boolean21 = zipArchiveEntry15.equals((java.lang.Object) 100.0d);
        zipArchiveEntry15.setMethod((int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int26 = zipArchiveEntry25.getInternalAttributes();
        zipArchiveEntry25.setCrc((long) 100);
        java.lang.Object obj29 = zipArchiveEntry25.clone();
        zipArchiveEntry25.setTime((long) (byte) 0);
        int int32 = zipArchiveEntry25.getUnixMode();
        zipArchiveEntry25.setCrc((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int37 = zipArchiveEntry36.getInternalAttributes();
        zipArchiveEntry36.setCrc((long) 100);
        java.lang.Object obj40 = zipArchiveEntry36.clone();
        zipArchiveEntry36.setTime((long) (byte) 0);
        zipArchiveEntry36.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime45 = zipArchiveEntry36.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry46 = zipArchiveEntry25.setLastAccessTime(fileTime45);
        java.util.zip.ZipEntry zipEntry47 = zipArchiveEntry15.setCreationTime(fileTime45);
        java.util.zip.ZipEntry zipEntry48 = zipArchiveEntry5.setLastAccessTime(fileTime45);
        java.util.zip.ZipEntry zipEntry49 = zipArchiveEntry1.setLastAccessTime(fileTime45);
        zipArchiveEntry1.setCrc(1L);
        zipArchiveEntry1.setExternalAttributes((long) (byte) 100);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "");
        org.junit.Assert.assertNotNull(fileTime45);
        org.junit.Assert.assertNotNull(zipEntry46);
        org.junit.Assert.assertEquals(zipEntry46.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry47);
        org.junit.Assert.assertEquals(zipEntry47.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry48);
        org.junit.Assert.assertEquals(zipEntry48.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry49);
        org.junit.Assert.assertEquals(zipEntry49.toString(), "");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int2 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setCrc((long) 100);
        java.lang.String str5 = zipArchiveEntry1.getComment();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setPlatform(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int9 = zipArchiveEntry8.getInternalAttributes();
        zipArchiveEntry8.setCrc((long) 100);
        java.lang.Object obj12 = zipArchiveEntry8.clone();
        zipArchiveEntry8.setTime((long) (byte) 0);
        zipArchiveEntry8.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry8.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry18 = zipArchiveEntry1.setLastAccessTime(fileTime17);
        byte[] byteArray19 = zipArchiveEntry1.getExtra();
        zipArchiveEntry1.setUnixMode((-1));
        int int22 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setUnixMode((int) ' ');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        zipArchiveEntry25.setTime((long) (-1));
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(fileTime17);
        org.junit.Assert.assertNotNull(zipEntry18);
        org.junit.Assert.assertEquals(zipEntry18.toString(), "");
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        boolean boolean7 = zipArchiveEntry1.isSupportedCompressionMethod();
        boolean boolean8 = zipArchiveEntry1.isDirectory();
        boolean boolean9 = zipArchiveEntry1.isSupportedCompressionMethod();
        byte[] byteArray10 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setExternalAttributes(8L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int15 = zipArchiveEntry14.getInternalAttributes();
        zipArchiveEntry14.setCrc((long) 100);
        java.lang.Object obj18 = zipArchiveEntry14.clone();
        zipArchiveEntry14.setTime((long) (byte) 0);
        int int21 = zipArchiveEntry14.getUnixMode();
        zipArchiveEntry14.setCrc((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry25.setMethod((int) (byte) 1);
        byte[] byteArray28 = zipArchiveEntry25.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int31 = zipArchiveEntry30.getInternalAttributes();
        zipArchiveEntry30.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = zipArchiveEntry30.getExtraFields();
        zipArchiveEntry25.setExtraFields(zipExtraFieldArray34);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry25);
        zipArchiveEntry36.setSize(8L);
        int int39 = zipArchiveEntry36.getInternalAttributes();
        boolean boolean40 = zipArchiveEntry14.equals((java.lang.Object) zipArchiveEntry36);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime43 = zipArchiveEntry42.getLastModifiedTime();
        int int44 = zipArchiveEntry42.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int47 = zipArchiveEntry46.getInternalAttributes();
        zipArchiveEntry46.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray50 = zipArchiveEntry46.getExtraFields();
        zipArchiveEntry42.setExtraFields(zipExtraFieldArray50);
        zipArchiveEntry36.setExtraFields(zipExtraFieldArray50);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray50);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray34, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(fileTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray50);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray50, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        java.lang.String str7 = zipArchiveEntry1.getName();
        int int8 = zipArchiveEntry1.getPlatform();
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.String str10 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setSize((long) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = zipArchiveEntry1.getExtraField(zipShort13);
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.String str16 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj19 = null;
        boolean boolean20 = zipArchiveEntry18.equals(obj19);
        long long21 = zipArchiveEntry18.getExternalAttributes();
        int int22 = zipArchiveEntry18.getUnixMode();
        long long23 = zipArchiveEntry18.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField25 = zipArchiveEntry18.getExtraField(zipShort24);
        long long26 = zipArchiveEntry18.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int29 = zipArchiveEntry28.getInternalAttributes();
        zipArchiveEntry28.setCrc((long) 100);
        boolean boolean33 = zipArchiveEntry28.equals((java.lang.Object) true);
        int int34 = zipArchiveEntry28.getUnixMode();
        zipArchiveEntry28.setCompressedSize((long) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry38 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj39 = null;
        boolean boolean40 = zipArchiveEntry38.equals(obj39);
        long long41 = zipArchiveEntry38.getExternalAttributes();
        int int42 = zipArchiveEntry38.getUnixMode();
        long long43 = zipArchiveEntry38.getExternalAttributes();
        boolean boolean44 = zipArchiveEntry38.isSupportedCompressionMethod();
        boolean boolean45 = zipArchiveEntry38.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry47 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime48 = zipArchiveEntry47.getLastModifiedTime();
        int int49 = zipArchiveEntry47.getUnixMode();
        byte[] byteArray50 = zipArchiveEntry47.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj53 = null;
        boolean boolean54 = zipArchiveEntry52.equals(obj53);
        long long55 = zipArchiveEntry52.getExternalAttributes();
        int int56 = zipArchiveEntry52.getUnixMode();
        zipArchiveEntry52.setPlatform((int) 'a');
        long long59 = zipArchiveEntry52.getExternalAttributes();
        int int60 = zipArchiveEntry52.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int63 = zipArchiveEntry62.getInternalAttributes();
        zipArchiveEntry62.setCrc((long) 100);
        java.lang.Object obj66 = zipArchiveEntry62.clone();
        zipArchiveEntry62.setTime((long) (byte) 0);
        zipArchiveEntry62.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime71 = zipArchiveEntry62.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry72 = zipArchiveEntry52.setLastAccessTime(fileTime71);
        java.util.zip.ZipEntry zipEntry73 = zipArchiveEntry47.setLastAccessTime(fileTime71);
        java.util.zip.ZipEntry zipEntry74 = zipArchiveEntry38.setCreationTime(fileTime71);
        java.util.zip.ZipEntry zipEntry75 = zipArchiveEntry28.setLastAccessTime(fileTime71);
        java.util.zip.ZipEntry zipEntry76 = zipArchiveEntry18.setCreationTime(fileTime71);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray77 = zipArchiveEntry18.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray77);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(zipExtraField14);
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(zipExtraField25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(fileTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "");
        org.junit.Assert.assertNotNull(fileTime71);
        org.junit.Assert.assertNotNull(zipEntry72);
        org.junit.Assert.assertEquals(zipEntry72.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry73);
        org.junit.Assert.assertEquals(zipEntry73.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry74);
        org.junit.Assert.assertEquals(zipEntry74.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry75);
        org.junit.Assert.assertEquals(zipEntry75.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry76);
        org.junit.Assert.assertEquals(zipEntry76.toString(), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray77);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray77, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        boolean boolean7 = zipArchiveEntry1.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = zipArchiveEntry1.getExtraField(zipShort8);
        long long10 = zipArchiveEntry1.getCrc();
        java.lang.String str11 = zipArchiveEntry1.getName();
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(zipExtraField9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(fileTime12);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        zipArchiveEntry1.setSize((long) 3);
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        java.lang.Object obj7 = zipArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj10 = null;
        boolean boolean11 = zipArchiveEntry9.equals(obj10);
        long long12 = zipArchiveEntry9.getExternalAttributes();
        int int13 = zipArchiveEntry9.getUnixMode();
        zipArchiveEntry9.setPlatform((int) 'a');
        long long16 = zipArchiveEntry9.getExternalAttributes();
        int int17 = zipArchiveEntry9.getPlatform();
        byte[] byteArray18 = zipArchiveEntry9.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj21 = null;
        boolean boolean22 = zipArchiveEntry20.equals(obj21);
        long long23 = zipArchiveEntry20.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int26 = zipArchiveEntry25.getInternalAttributes();
        zipArchiveEntry25.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray29 = zipArchiveEntry25.getExtraFields();
        zipArchiveEntry20.setExtraFields(zipExtraFieldArray29);
        zipArchiveEntry9.setExtraFields(zipExtraFieldArray29);
        long long32 = zipArchiveEntry9.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime35 = zipArchiveEntry34.getLastModifiedTime();
        int int36 = zipArchiveEntry34.getUnixMode();
        byte[] byteArray37 = zipArchiveEntry34.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj40 = null;
        boolean boolean41 = zipArchiveEntry39.equals(obj40);
        long long42 = zipArchiveEntry39.getExternalAttributes();
        int int43 = zipArchiveEntry39.getUnixMode();
        zipArchiveEntry39.setPlatform((int) 'a');
        long long46 = zipArchiveEntry39.getExternalAttributes();
        int int47 = zipArchiveEntry39.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry49 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int50 = zipArchiveEntry49.getInternalAttributes();
        zipArchiveEntry49.setCrc((long) 100);
        java.lang.Object obj53 = zipArchiveEntry49.clone();
        zipArchiveEntry49.setTime((long) (byte) 0);
        zipArchiveEntry49.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime58 = zipArchiveEntry49.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry59 = zipArchiveEntry39.setLastAccessTime(fileTime58);
        java.util.zip.ZipEntry zipEntry60 = zipArchiveEntry34.setLastAccessTime(fileTime58);
        java.util.zip.ZipEntry zipEntry61 = zipArchiveEntry9.setLastModifiedTime(fileTime58);
        java.util.zip.ZipEntry zipEntry62 = zipArchiveEntry1.setLastAccessTime(fileTime58);
        java.lang.Object obj63 = zipArchiveEntry1.clone();
        int int64 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray29);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray29, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNull(fileTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "");
        org.junit.Assert.assertNotNull(fileTime58);
        org.junit.Assert.assertNotNull(zipEntry59);
        org.junit.Assert.assertEquals(zipEntry59.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry60);
        org.junit.Assert.assertEquals(zipEntry60.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry61);
        org.junit.Assert.assertEquals(zipEntry61.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry62);
        org.junit.Assert.assertEquals(zipEntry62.toString(), "");
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj63), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        boolean boolean7 = zipArchiveEntry1.equals((java.lang.Object) 100.0d);
        zipArchiveEntry1.setCompressedSize((long) 'a');
        java.lang.String str10 = zipArchiveEntry1.getName();
        byte[] byteArray11 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setTime((long) (short) 10);
        zipArchiveEntry1.setPlatform(52);
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setCompressedSize((long) (short) 100);
        java.lang.Class<?> wildcardClass21 = zipArchiveEntry1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setMethod((int) (byte) 1);
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        int int5 = zipArchiveEntry1.getPlatform();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
        int int8 = zipArchiveEntry1.getUnixMode();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastModifiedTime();
        int int3 = zipArchiveEntry1.getUnixMode();
        int int4 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setUnixMode(0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = zipArchiveEntry1.getExtraField(zipShort7);
        zipArchiveEntry1.setCompressedSize((long) 3);
        int int11 = zipArchiveEntry1.getInternalAttributes();
        zipArchiveEntry1.setPlatform((int) '#');
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(zipExtraField8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setPlatform((int) 'a');
        long long8 = zipArchiveEntry1.getExternalAttributes();
        int int9 = zipArchiveEntry1.getPlatform();
        byte[] byteArray10 = zipArchiveEntry1.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj13 = null;
        boolean boolean14 = zipArchiveEntry12.equals(obj13);
        zipArchiveEntry12.setSize((long) 3);
        java.util.Date date17 = zipArchiveEntry12.getLastModifiedDate();
        java.lang.Object obj18 = zipArchiveEntry12.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj21 = null;
        boolean boolean22 = zipArchiveEntry20.equals(obj21);
        long long23 = zipArchiveEntry20.getExternalAttributes();
        int int24 = zipArchiveEntry20.getUnixMode();
        zipArchiveEntry20.setPlatform((int) 'a');
        long long27 = zipArchiveEntry20.getExternalAttributes();
        int int28 = zipArchiveEntry20.getPlatform();
        byte[] byteArray29 = zipArchiveEntry20.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj32 = null;
        boolean boolean33 = zipArchiveEntry31.equals(obj32);
        long long34 = zipArchiveEntry31.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int37 = zipArchiveEntry36.getInternalAttributes();
        zipArchiveEntry36.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = zipArchiveEntry36.getExtraFields();
        zipArchiveEntry31.setExtraFields(zipExtraFieldArray40);
        zipArchiveEntry20.setExtraFields(zipExtraFieldArray40);
        long long43 = zipArchiveEntry20.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime46 = zipArchiveEntry45.getLastModifiedTime();
        int int47 = zipArchiveEntry45.getUnixMode();
        byte[] byteArray48 = zipArchiveEntry45.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj51 = null;
        boolean boolean52 = zipArchiveEntry50.equals(obj51);
        long long53 = zipArchiveEntry50.getExternalAttributes();
        int int54 = zipArchiveEntry50.getUnixMode();
        zipArchiveEntry50.setPlatform((int) 'a');
        long long57 = zipArchiveEntry50.getExternalAttributes();
        int int58 = zipArchiveEntry50.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int61 = zipArchiveEntry60.getInternalAttributes();
        zipArchiveEntry60.setCrc((long) 100);
        java.lang.Object obj64 = zipArchiveEntry60.clone();
        zipArchiveEntry60.setTime((long) (byte) 0);
        zipArchiveEntry60.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime69 = zipArchiveEntry60.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry70 = zipArchiveEntry50.setLastAccessTime(fileTime69);
        java.util.zip.ZipEntry zipEntry71 = zipArchiveEntry45.setLastAccessTime(fileTime69);
        java.util.zip.ZipEntry zipEntry72 = zipArchiveEntry20.setLastModifiedTime(fileTime69);
        java.util.zip.ZipEntry zipEntry73 = zipArchiveEntry12.setLastAccessTime(fileTime69);
        java.util.zip.ZipEntry zipEntry74 = zipArchiveEntry1.setLastAccessTime(fileTime69);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry76 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry76.setMethod((int) (byte) 1);
        byte[] byteArray79 = zipArchiveEntry76.getCentralDirectoryExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray79);
        java.nio.file.attribute.FileTime fileTime81 = zipArchiveEntry1.getLastModifiedTime();
        java.nio.file.attribute.FileTime fileTime82 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort83 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField84 = zipArchiveEntry1.getExtraField(zipShort83);
        java.util.Date date85 = zipArchiveEntry1.getLastModifiedDate();
        long long86 = zipArchiveEntry1.getCrc();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray40, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNull(fileTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "");
        org.junit.Assert.assertNotNull(fileTime69);
        org.junit.Assert.assertNotNull(zipEntry70);
        org.junit.Assert.assertEquals(zipEntry70.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry71);
        org.junit.Assert.assertEquals(zipEntry71.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry72);
        org.junit.Assert.assertEquals(zipEntry72.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry73);
        org.junit.Assert.assertEquals(zipEntry73.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry74);
        org.junit.Assert.assertEquals(zipEntry74.toString(), "");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] {});
        org.junit.Assert.assertNull(fileTime81);
        org.junit.Assert.assertNull(fileTime82);
        org.junit.Assert.assertNull(zipExtraField84);
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-1L) + "'", long86 == (-1L));
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj2 = null;
        boolean boolean3 = zipArchiveEntry1.equals(obj2);
        long long4 = zipArchiveEntry1.getExternalAttributes();
        int int5 = zipArchiveEntry1.getUnixMode();
        long long6 = zipArchiveEntry1.getExternalAttributes();
        java.lang.String str7 = zipArchiveEntry1.getName();
        java.lang.String str8 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setComment("");
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry1.getLastModifiedTime();
        int int12 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int15 = zipArchiveEntry14.getInternalAttributes();
        byte[] byteArray16 = zipArchiveEntry14.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj19 = null;
        boolean boolean20 = zipArchiveEntry18.equals(obj19);
        zipArchiveEntry18.setSize((long) 3);
        java.util.Date date23 = zipArchiveEntry18.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime24 = zipArchiveEntry18.getLastAccessTime();
        zipArchiveEntry18.setPlatform((-1));
        long long27 = zipArchiveEntry18.getSize();
        zipArchiveEntry18.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int32 = zipArchiveEntry31.getInternalAttributes();
        zipArchiveEntry31.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = zipArchiveEntry31.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj38 = null;
        boolean boolean39 = zipArchiveEntry37.equals(obj38);
        long long40 = zipArchiveEntry37.getExternalAttributes();
        int int41 = zipArchiveEntry37.getUnixMode();
        long long42 = zipArchiveEntry37.getExternalAttributes();
        boolean boolean43 = zipArchiveEntry37.isSupportedCompressionMethod();
        boolean boolean44 = zipArchiveEntry37.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime47 = zipArchiveEntry46.getLastModifiedTime();
        int int48 = zipArchiveEntry46.getUnixMode();
        byte[] byteArray49 = zipArchiveEntry46.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj52 = null;
        boolean boolean53 = zipArchiveEntry51.equals(obj52);
        long long54 = zipArchiveEntry51.getExternalAttributes();
        int int55 = zipArchiveEntry51.getUnixMode();
        zipArchiveEntry51.setPlatform((int) 'a');
        long long58 = zipArchiveEntry51.getExternalAttributes();
        int int59 = zipArchiveEntry51.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry61 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int62 = zipArchiveEntry61.getInternalAttributes();
        zipArchiveEntry61.setCrc((long) 100);
        java.lang.Object obj65 = zipArchiveEntry61.clone();
        zipArchiveEntry61.setTime((long) (byte) 0);
        zipArchiveEntry61.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime70 = zipArchiveEntry61.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry71 = zipArchiveEntry51.setLastAccessTime(fileTime70);
        java.util.zip.ZipEntry zipEntry72 = zipArchiveEntry46.setLastAccessTime(fileTime70);
        java.util.zip.ZipEntry zipEntry73 = zipArchiveEntry37.setCreationTime(fileTime70);
        java.util.zip.ZipEntry zipEntry74 = zipArchiveEntry31.setLastModifiedTime(fileTime70);
        java.util.zip.ZipEntry zipEntry75 = zipArchiveEntry18.setLastModifiedTime(fileTime70);
        java.util.zip.ZipEntry zipEntry76 = zipArchiveEntry14.setCreationTime(fileTime70);
        java.util.zip.ZipEntry zipEntry77 = zipArchiveEntry1.setCreationTime(fileTime70);
        java.lang.Class<?> wildcardClass78 = zipArchiveEntry1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(fileTime24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3L + "'", long27 == 3L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertArrayEquals(zipExtraFieldArray35, new org.apache.commons.compress.archivers.zip.ZipExtraField[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(fileTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "");
        org.junit.Assert.assertNotNull(fileTime70);
        org.junit.Assert.assertNotNull(zipEntry71);
        org.junit.Assert.assertEquals(zipEntry71.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry72);
        org.junit.Assert.assertEquals(zipEntry72.toString(), "");
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
        org.junit.Assert.assertNotNull(wildcardClass78);
    }
}

