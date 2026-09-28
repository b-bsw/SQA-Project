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
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj1 = x5455_ExtendedTimestamp0.clone();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        boolean boolean6 = x5455_ExtendedTimestamp4.equals((java.lang.Object) true);
        boolean boolean7 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        boolean boolean9 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
        java.lang.Object obj10 = x5455_ExtendedTimestamp0.clone();
        x5455_ExtendedTimestamp0.setFlags((byte) -1);
        boolean boolean13 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray14 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
    }
}

