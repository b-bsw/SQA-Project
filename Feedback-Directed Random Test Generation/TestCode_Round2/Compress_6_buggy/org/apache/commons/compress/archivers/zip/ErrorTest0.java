package org.apache.commons.compress.archivers.zip;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.lang.Object obj4 = null;
        boolean boolean5 = zipArchiveEntry3.equals(obj4);
        long long6 = zipArchiveEntry3.getExternalAttributes();
        int int7 = zipArchiveEntry3.getUnixMode();
        zipArchiveEntry3.setPlatform((int) 'a');
        long long10 = zipArchiveEntry3.getExternalAttributes();
        int int11 = zipArchiveEntry3.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int14 = zipArchiveEntry13.getInternalAttributes();
        zipArchiveEntry13.setCrc((long) 100);
        java.lang.Object obj17 = zipArchiveEntry13.clone();
        zipArchiveEntry13.setTime((long) (byte) 0);
        zipArchiveEntry13.setInternalAttributes((int) (byte) 10);
        java.nio.file.attribute.FileTime fileTime22 = zipArchiveEntry13.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry23 = zipArchiveEntry3.setLastAccessTime(fileTime22);
        java.util.zip.ZipEntry zipEntry24 = zipArchiveEntry1.setLastModifiedTime(fileTime22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on zipEntry24 and zipArchiveEntry3", zipEntry24.equals(zipArchiveEntry3) ? zipEntry24.hashCode() == zipArchiveEntry3.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        long long2 = zipArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry4.setMethod((int) (byte) 1);
        byte[] byteArray7 = zipArchiveEntry4.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        int int10 = zipArchiveEntry9.getInternalAttributes();
        zipArchiveEntry9.setCrc((long) 100);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = zipArchiveEntry9.getExtraFields();
        zipArchiveEntry4.setExtraFields(zipExtraFieldArray13);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry4);
        long long16 = zipArchiveEntry15.getSize();
        zipArchiveEntry15.setMethod(10);
        byte[] byteArray19 = zipArchiveEntry15.getExtra();
        zipArchiveEntry1.setExtra(byteArray19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on zipArchiveEntry1 and zipArchiveEntry4", zipArchiveEntry1.equals(zipArchiveEntry4) ? zipArchiveEntry1.hashCode() == zipArchiveEntry4.hashCode() : true);
    }
}

